import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sohee_S {
    public static void main(String[] args) throws Exception {
        int port = 8290;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("running server...");

        Socket socket = serverSocket.accept();
        ObjectOutputStream toClient = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream fromClient = new ObjectInputStream(socket.getInputStream());

        System.out.println("connected");

        // 다운로드 대상 파일명 받아오기
        String fileName = fromClient.readUTF();
        System.out.println("target : " + fileName);

        // 파일 존재 여부 검사
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("file transfer...");
            toClient.writeInt(200);
            toClient.flush();

            // 파일 크기 전송
            toClient.writeLong(file.length());

            // 파일 전송
            FileInputStream in = new FileInputStream(fileName);
            byte[] buffer = new byte[1024 * 8];
            int r = 0;
            while ( (r = in.read(buffer)) != -1 ) {
                System.out.println(r);
                toClient.write(buffer, 0, r);
                toClient.flush();
            }
            in.close();

        } else {
            System.out.println("This file isn't exist.");
            toClient.writeInt(404);
            toClient.flush();
        }

        toClient.close();
        fromClient.close();
        socket.close();
        serverSocket.close();
    }
}
