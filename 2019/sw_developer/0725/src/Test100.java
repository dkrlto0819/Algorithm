import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
Mysql 의 코드와 거의 비슷. 틀린 점이 없다.
왜? Connection, Statement 를 상속한 Oracle과 연동 가능한 클래스를 OracleDriver 에서 DriverManger 에 세팅해주면
Oracle에 맞추어 개발된, Connection, Statement, ResultSet 등을 상속받은 클래스가 공급되는 구조
 */

public class Test100 {
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection
                ("jdbc:oracle:thin:@127.0.0.1:152/XE", "system", "oracle");
        /// 맥은 docker ip 주소로 찾아야 함.
        System.out.println(conn.getClass().getName()); //  로딩해주는 클래스가 다름== 드라이버도 다름


        Statement stmt = conn.createStatement();

        String sql = "select sysdate from dual"; //sysdate = nowdate()
        ResultSet rs = stmt.executeQuery(sql);


        //결과물이 하나 밖에 업을 때는 if 문을 쓰는 것이 바람직하다.
        while(rs.next()){
            String l = rs.getString(1);
            System.out.println(l);
        }

        rs.close();

        stmt.close();
        conn.close();
    }
}
