import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test075 {
    public static void main(String[] args) throws IOException{ //발생된 에러는 프로그램을 잡아 주면 안 죽음.
        OutputStream outputStream = new FileOutputStream("aa.txt");
    }
}


/*
패키지-import-클래스 선
javac -d . Test076.java (compile)
java -classpath . temp.Test076  이렇게 실행

import는 기본적으로 클래스 타입
import는 언제 하나? :: 다른 패키지에 있는 class를 갖다 쓸 때
왜 try catch 안 쓰면 에러가 나나 :: 생성자가 잇는 instace를 갖다 쓸 때 바로 하지 못할 경우 대체 해주어야 함
 :: thorws XXXxecption 형태로 선언된 함수는 XXXException이 exception으로 상속 받을 경우 해당 예외를 처리할 수 있는 try catch 영역안에서 사용해야한다.

 FileNotFoundException을 IOException 으로 고쳐도 될까? -> yes
  IOEXCEPTION 이 위에 있기 때문


throws IOException이 문법 에러가 아닌 이유(명시부에 적은것)
1. 에러는 발생시 잡아주면 에러 발생이 안된 걸로 한다.(일사부재리)
2ㅣ 에러가 발생할 수 있으면 그 사실을 명시하면 된다.
(위 경우는 생성자 호출한 쪽이 아니라 main을 호출한 쪽이 처리한다.)
 */