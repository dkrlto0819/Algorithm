import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class socketClient {
    public static void main(String[] args) throws Exception {
        ServerSocket svr = new ServerSocket(1140);

        System.out.println("before accept()");
        Socket skt = svr.accept();
        System.out.println("after accept()");

        OutputStream out = new FileOutputStream("bb.txt");
        InputStream in = skt.getInputStream();

        int r = 0;
        while ((r=in.read())!=-1){
            System.out.println(r);
            out.write(r);
        }

        in.close();
        out.close();


        skt.close();
        svr.close();
    }
}
