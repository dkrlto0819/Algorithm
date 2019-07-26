import Temp.Test063;

public class Test064 {
    public static void main(String[] args){
        Test063 t = null;
    }
}

/*
다른 패키지의 크래스는 반드시 명시해주어야 한다. import
만일 그래도 클래스를 못 찾으면, 클래스 위치를 지정해줘야만 한다.

java -classpath .;(디렉토리 (파일명)
-classpath 옵션을 안주면 자동으로 -classpath 붙


 static {
    // static initializer라 한다. 클래스 로딩 시점에 호출
    non-static 함수, 변수는 못 들어옴


    - Class.forName("temp.Test066A")
    클래스를 찾아내서 해당 클래스를 강제로 메모리에 로딩시킨다.
    로딩시키는 클래스의 static initializer가 동작한다.

 }

 */