import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test099 {
    public static void main(String[] arg) throws Exception {
        Class.forName("com.mysql.jdbc.Driver"); // 클래스이름으로 찾고 로드
        String url = "jdbc:mysql://127.0.0.1:3306/java_onecup?serverTimezone=UTC&useSSL=false";
        Connection conn = DriverManager.getConnection(url, "onecup", "java");

        Statement stmt = conn.createStatement();
        String sql = "insert into studentt values('10107', '또오치', '쌍문동')";
        String sql2 = "delete from studentt where stid='10107'";
        String sql3 = "update studentt set addr = '이도동' where stid  ='10101'";

        int rc = stmt.executeUpdate(sql2);
        System.out.println(rc);  //result :: 1=> 하나의 레코드 변화

        // >> exeucteUpdate 함수는 select문에는 사용하지 않음. 왜? 변화가 없으니까!
        //insert / delete / update

        stmt.close(); //바구니 끊기
        conn.close(); // 줄끊기 ㄹㅇ 신중하게 해야함

        //conn 형성 - stmt 형성 - 자업 - stmt.close() - conn.close() 이순서를 지켜줘야 함.
    }

}

/*
Statement는 줄을 타고 오가는 바구니를 연상하면 된다.

 */
