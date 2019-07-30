package study2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld3 extends HttpServlet{
	@Override
    public void service(HttpServletRequest request, HttpServletResponse
    		response) throws ServletException, IOException {
        System.out.println("Hello World 3");
        
        List<BangMyungVO> ls = new ArrayList<BangMyungVO>();
        
        try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection conn = DriverManager.getConnection
                     ("jdbc:oracle:thin:@127.0.0.1:152/XE", "system", "oracle");
            System.out.println(conn);
            
            Statement stmt = conn.createStatement();
            
            String sql = "select * from BANGMYUNG_T";
            ResultSet rs = stmt.executeQuery(sql);
            
            String theTime = null;
            while(rs.next()) {
            	BangMyungVO vo = new BangMyungVO();
            	vo.setNo(rs.getInt("no"));
            	vo.setGul(rs.getString("gul"));
            	vo.setTheTime(rs.getString("the_time"));
            	
            	ls.add(vo);
            }
            
            
            System.out.println(theTime);
            
            stmt.close();
            rs.close();
            conn.close();
        }catch (Exception e) {
        	e.printStackTrace();
        }
        
        
        response.setContentType("text/html;charset=euc-kr");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<table border =\"1\" bordercolor=\"black\" cellspacing = \"0\" align=\"center\" cellpadding=\"7\">");
        for (BangMyungVO vo : ls) {
        	out.println("<tr>");
        	out.println("<td bgColor=\"black\">");
        	out.println("<font color=\"white\">");
        	out.println(vo.getNo());
        	out.println("</font>");
        	out.println("</td>");
        	out.println("<td>");
        	out.println(vo.getGul());
        	out.println("</td>");
        	out.println("<td>");
        	out.println(vo.getTheTime());
        	out.println("</td>");
        	out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
      
        
        out.close();
    }
	
}
