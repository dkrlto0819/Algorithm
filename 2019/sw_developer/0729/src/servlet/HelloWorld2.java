package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloWorld2 extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse
            response) throws IOException, ServletException {
        System.out.println("HELLOWORLD2"); //서버쪽에 찍힘
        String theTime = null;


        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection
                    ("jdbc:oracle:thin:@127.0.0.1:152/XE", "system", "oracle");

            Statement stmt = conn.createStatement();

            String sql = "select sysdate from dual";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                theTime = rs.getString(1);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch ( Exception e) {
            e.printStackTrace();
        }

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("   <body>");
        out.println("HelloWorld2!");
        out.println(theTime);
        out.println("   </body>");
        out.println("</html>");
        out.close();
    }
}