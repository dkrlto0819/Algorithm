import java.io.*;

public class Test086 {
    public static void main(String[] args) throws Exception {
       // Writer out = new FileWriter("a.txt");
        Writer out = new OutputStreamWriter(new FileOutputStream("a.txt"));
        //OutputStreamWriter InputStreamReader는 char 입출력을 byte 입출력으로 전환해 줍니다.

        out.write('한');
        out.write('글');
        out.close();

        Reader in = new FileReader("a.txt");
        System.out.println((char)in.read());

        in.close();
    }
}

/*
OutputStream InputStream : 전송단위 Byte binary file 전송용
Reader Writer : 전송단위 char : 문자로 된 데이터 전송용

char는 2byte, unicode 지

유니코드는 모든 글자를 다 포용하지 못한다(6만자 제한)
웬만한 글자는 포용가능. 한글+영문+중국어+아랍어+일본어...

확장 가능한 가변 길이를 가지는 문자체제를 도입 :  UTF-8(웹 표)
 */