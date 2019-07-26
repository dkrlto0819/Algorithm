import java.io.OutputStream;
import java.net.Socket;

public class Test83C {
    public static void main(String[] args) throws Exception {
        Socket skt = new Socket("192.168.2.29", 1134);

        OutputStream out = skt.getOutputStream();
        //OutputStream으로 상속받은 뭔가를 생성하고 리턴. out이 가리킴
        out.write(65);
        out.flush();


        out.close();
        skt.close();
    }
}

/*

대기하는 쪽 : 서버, 찾아가는 쪽 : 클라이언트
먼저 서버가 구동한다 - 포트를 물고 구동해야한다(1134)
accept : 대기하다 클라이언트가 찾아오면 소켓을 생성해서 리턴

클라이언트가 찾아가기 위해? IP 번호, PORT 번호
잘 찾아가면 Socket이 생성. 다른 instance지만 데이터 주고 바을 수 있

접속 성공시 양쪽에서는 Socket이 생성되고 읻 ㅜㄹ은 통신이 가능하다.


 */
