package study;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BangMyungAdd extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("BangMyungAdd2");

        String gul = request.getParameter("gul");

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection
                    ("jdbc:oracle:thin:@127.0.0.1:152/XE", "system", "oracle");
            System.out.println(conn);

            Statement stmt = conn.createStatement();

            String sql = "insert into bangmyung_t values " + "(seq_bangmyung.nextval, '"+ gul + "', sysdate)";
            stmt.executeUpdate(sql);

            stmt.close();
            conn.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("/study/bangmyung_list");
    }
}
