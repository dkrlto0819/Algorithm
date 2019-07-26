import java.io.*;
import java.net.Socket;

public class Sohee_C {
    public static void main(String[] args) throws Exception {
        String ip = "192.168.2.30";
        int port = 8290;
        String fileName = "music.mp3";

        Socket socket = new Socket(ip, port);
        ObjectInputStream fromServer = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream toServer = new ObjectOutputStream(socket.getOutputStream());

        // 다운로드 파일명 전송
        toServer.writeUTF(fileName);
        toServer.flush();

        // 파일 존재여부 받음
        int code = fromServer.readInt();
        if (code == 200) {
            System.out.println(fileName + " 다운로드 시작");
            long size = fromServer.readLong();

            byte[] buffer = new byte[1024 * 8];
            int r = 0;
            int downloadSize = 0;
            OutputStream out = new FileOutputStream(fileName);
            InputStream inin = socket.getInputStream();
            while ( (r = fromServer.read(buffer)) != -1 ) {
                out.write(buffer, 0, r);
                downloadSize = downloadSize + r;
                System.out.println(r + " : " + downloadSize);
                int percent = (int) ( (double) downloadSize / size ) * 100;
//                System.out.println(downloadSize + " / " + size + " (" + percent + "%)");
            }
            out.close();

        } else if (code == 404) {
            System.out.println(fileName + " 이 존재하지 않습니다.");
        } else {
            System.out.println("알 수 없는 에러");
        }

        toServer.close();
        fromServer.close();
        socket.close();
    }
}
