import java.io.*;

public class Test84 {
    public static void main(String[] args ) throws IOException{
        OutputStream out = new BufferedOutputStream( new FileOutputStream("cc.txt"));
        InputStream in = new BufferedInputStream(new FileInputStream("aa.txt"));

        int r = 0;
        while((r = in.read())!=-1){
            out.write(r);
        }

        in.close();
        out.close();

    }
}

/*
java.io 패키지가 데코레이터 패턴이라는 설계기법으로 구현되어 있따.
- HelloGreet MerciGreet StarDeco... :: 데코레이터 패턴의 예제


out.write(..) 호출했을 때 대상은 FileOutputStream에서 지정한다.
BufferedOutputStream에서 버퍼링을 제공한다.
- 두 클래스가 결합한 결과를 만드는데 사용자는 OutputStream에서 지정하는 함수만 사용하면 된다.

이 두개는 실제로 같은 설계 기법으로 구현된 코드이다.

데코레이터 패턴으로 이해하면 out이 가리키는 대상은 FileOutputStream("d.dat")에 저장하되
ObjectOutputStream(new FileOutputStream("d.dat"))에서 제공하는 방법을 사용하게 된다

ObjectOutputStream 은 writeInt, writeUTF 사용

 */