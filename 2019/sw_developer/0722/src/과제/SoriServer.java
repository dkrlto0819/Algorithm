package 과제;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SoriServer {
    public static void main(String[] args) throws IOException {
        ServerSocket svr = new ServerSocket(1140);

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
