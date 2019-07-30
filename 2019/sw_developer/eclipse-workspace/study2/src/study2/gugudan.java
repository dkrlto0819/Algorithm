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

public class gugudan extends HttpServlet{
	@Override
    public void service(HttpServletRequest request, HttpServletResponse
    		response) throws ServletException, IOException {
        
        response.setContentType("text/html;charset=euc-kr");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<table border =\"1\" bordercolor=\"black\" cellspacing = \"0\" align=\"center\" cellpadding=\"7\">");
        for(int i=2;i<=9;i++) {
        	out.println("<tr>");
        	for(int j=1;j<=9;j++) {
        		String color="#";
        		for(int k=1;i<=6;k++) {
        			int number = (int) (Math.random()*16+1);
        			color+=Integer.toHexString(number);
        		}
        		out.print("<td bgcolor=\""+color+"\">");
        		out.println(i+"*"+j+"="+i*j);
        		out.print("</td>");
        	}
        	out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
      
        
        out.close();
    }
	
}