package 과제;

import java.io.*;
import java.net.Socket;

public class SoriClient {
    public static void main(String[] args) throws Exception {
        Socket skt = new Socket("192.168.2.29", 1140);

        System.out.println("> 파일명을 입력하세요.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String file = br.readLine();

        OutputStream out = skt.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));

        pw.println(file);
        pw.flush();


//        out.write(65);
//        out.flush();

        out.close();
        skt.close();
    }
}
