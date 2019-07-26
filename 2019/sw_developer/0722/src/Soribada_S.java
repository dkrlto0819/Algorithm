import java.io.*;
import java.net.*;

public class Soribada_S{
    public static void main(String[] args) throws Exception {
        ServerSocket svr = new ServerSocket(1123);

        System.out.println("before accept");
        Socket skt = svr.accept();// 대기하다가 클라이언트의 소켓과 연결됨. 양쪽 소켓이 생성.
        System.out.println("after accept");


        ObjectInputStream receive = new ObjectInputStream(skt.getInputStream());

        String fileName = receive.readUTF();

        File file = new File(fileName);

        ObjectOutputStream response = new ObjectOutputStream(skt.getOutputStream());
        if(file.exists()){
            response.writeInt(200);
            response.flush();
            System.out.println(200);
        }
        else{
            response.writeInt(404);
            response.flush();
            System.out.println(404);
        }

        if((receive.readUTF().equals(fileName))){

            System.out.println("좋은말 할 때 보내자...");

            byte[] buf = new byte[1024 * 8];
            int r= 0;
            InputStream ips = new FileInputStream(fileName);
            OutputStream out = skt.getOutputStream();
            while((r = ips.read(buf)) != -1){
                System.out.println(r);
                out.write(buf, 0, r);
            }
            ips.close();
            out.close();
        }
        else{
            System.out.println(fileName+ "이 존재하지 않습니다.");
        }
        receive.close();
        svr.close();
        skt.close();
        response.close();


//        byte[] buf = new byte[1024 * 8];
//        int r = 0;
        // OutputStream으로 상속받은 뭔가를 생성하고 리턴. out이 가리킴

    }
}