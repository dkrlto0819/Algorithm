import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test077 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("aa.txt");
        int a = in.read();
        int b = in.read();
        System.out.println(a + " " + b);
        in.close();

        // 더이상 읽을 것이 없을 때 -1이 나온다
        // 순서대로 읽고 순서대로 내보낸드ㅏ.

    }
}


/*
in.read()는 오버라이딩 된 코드일까? 아니면 InputStream에서 선언이 된 것일까.
- 코들ㄹ 읽는 눈이 있어야 한다.
 */