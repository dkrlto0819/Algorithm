import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test083S {
    public static void main(String[] args) throws Exception {
        ServerSocket svr = new ServerSocket(1134);

        System.out.println("before accept()");
        Socket skt = svr.accept();
        System.out.println("after accept()");


        InputStream in = skt.getInputStream();
        int r= in.read();
        in.close();

        System.out.println(r);

        skt.close();
        svr.close();
    }
}
