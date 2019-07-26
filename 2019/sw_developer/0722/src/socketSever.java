import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class socketSever {
    public static void main(String[] args) throws Exception {
        Socket skt = new Socket("192.168.2.29", 1137);

        OutputStream out = skt.getOutputStream();
        //OutputStream으로 상속받은 뭔가를 생성하고 리턴. out이 가리킴

        InputStream in = new FileInputStream("aa.txt");

        int r=0;
        while((r=in.read())!=-1){
            out.write(r);
            out.flush();
        }

//        out.write(65);
//        out.flush();


        out.close();
        in.close();
        skt.close();
    }
}
