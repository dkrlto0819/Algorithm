import java.io.*;
import java.net.*;

public class Soribada_C {

    public static void main(String[] args) throws Exception{
        boolean flag = false;
        System.out.println("파일명을 입력하세요.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Socket socket = new Socket("localhost", 1123);
        ObjectOutputStream toServer = new ObjectOutputStream(socket.getOutputStream());

        String fileName = br.readLine();

        toServer.writeUTF(fileName);//날려
        toServer.flush();

        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());//응답을 받아

        int response = in.readInt();
        System.out.println(response + " 받아써");
        if(response == 200){//응답에 따라 다시 날려
            System.out.println("A");
            toServer.writeUTF(fileName);
            System.out.println("B");
            toServer.flush();
            flag=true;
        }
        else{
            toServer.writeUTF("Not exist");
        }

        InputStream ips = socket.getInputStream();
        if(flag){
            byte[] buf = new byte[1024 * 8];
            OutputStream out = new FileOutputStream(fileName);
            int r = 0;
            while((r=ips.read(buf))!=-1) {
                System.out.println(r);
                out.write(buf, 0, r);
            }
            out.close();
        }

        ips.close();
        in.close();
        socket.close();
        toServer.close();
    }
}
//client server
//client -> 파일네임을 줘.
//server가 있는지 확인을 해. 200 or 404;
//