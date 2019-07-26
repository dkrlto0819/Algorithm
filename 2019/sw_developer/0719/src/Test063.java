public class Test063 {
    public void print() {
        System.out.println("Hello!");
    }

    public int print2(int i){
        return i*300;
    }

    protected int print3(int a){
        return a*700;
    }
}

/*
패키지가 지정된 클래스 컴파일 : javac -d [폴더] Test063.java
대상 폴더 아래에 패키지 이름으로 폴더 생기고, 그 아래에 class 파일이 들어간다.

패키지 지정 안할 시 - unnamed pakage로 들어감

 패키지는 클래스의 묶음. 파일 맨 위에 지정
 이 파일 안에 선언한 모든 클래스는 지정된 패키지에 속한다.
 */