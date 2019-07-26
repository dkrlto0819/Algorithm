import java.rmi.StubNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class StudentVO{
    private String stId = null;
    private String name = null;
    private String addr = null;

    public String getStId(){ return stId; }

    public void setStId(String stId){ this.stId = stId; }

    public String getName(){ return name; }

    public void setName(String name){ this.name = name; }

    public String getAddr(){ return addr; }

    public void setAddr(String addr){ this.addr = addr; }
}

/*
property는 멤버변수를 이야기 함
헌데 멤버변수는 getter/setter를 이용하고 private 하게 선언.

 */

public class Test099_2 {
    static {

    }

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");  // ==> static initializer 동
        String url = "jdbc:mysql://127.0.0.1:3306/java_onecup?serverTimezone=UTC&useSSL=false";
        Connection conn = DriverManager.getConnection(url, "onecup", "java");

        Statement stmt = conn.createStatement();

        /*

            O-R Mapping 규칙 (Golden Rule, Rule of Thumb)
            field  -> property = 멤버변수
            table -> class
            recore -> instance

            로 보통 바꾸는 것이 rule

            Connection은 살아있을 때 할 거 다 해야 한다.
            Connection은 빨리 끊어야 한다
         */

        String sql = "select * from studentt";
        ResultSet rs = stmt.executeQuery(sql); //select 문은 executeQuery 사용.

        //쌓기만 하고 있음 => ArrayList

        List<StudentVO> rl = new ArrayList<StudentVO>();

        while(rs.next()){
            StudentVO vo = new StudentVO();
            vo.setStId(rs.getString("stid"));
            vo.setName(rs.getString("name"));
            vo.setAddr(rs.getString("addr"));
            rl.add(vo);

//            String stid = rs.getString("stid");
//            String name = rs.getString("name");
//            String addr = rs.getString("addr");
//            System.out.println(stid + "\t" + name + "\t" + addr);
        }

        rs.close(); //conn이 끊어지기 써야 해 왜? => rs는 값을 가져오는 것이 아니고 포인터를 가져오는 거거든!
        stmt.close();
        conn.close();

        //-----------close 된 후 ---------
        for(StudentVO vo : rl){
            System.out.println(vo.getStId() + "\t" + vo.getName() + "\t" + vo.getAddr());
        }
    }
}

/// Connection 은 빨리 끊어주는 것이 철칙!!