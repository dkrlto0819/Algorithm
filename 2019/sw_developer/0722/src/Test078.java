import java.io.*;

public class Test078 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("aa.txt");
        OutputStream out = new FileOutputStream("bb.txt");
// 엄청 많이 씀 = 외워라

        //out.write(r);
        int r = 1;
        byte[]buf = new byte[1024*8];
        //복사 : dir.dat로 확인하고 type b.txt으로 확인하고...
        while((r=in.read(buf))==-1){
            System.out.println(r);
            out.write(buf, 0, r); //buf 크기만큼 읽어(버퍼의 길이만큼)
            //한꺼번에 읽어서 한번에 내보내는 것 :: buffering
        }

        in.close();
        out.close();
    }
}

/*
int read(byte[] buf) : buf가 감당 가능한 만큼 읽고 읽은 데이터 갯수 return;
void wirte(byte[] buf, int s, int r) : buf의 내용을 내보낸다. int s부터, int r 갯수 = s부터 r만큼
 */
