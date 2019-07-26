interface ICalc{
    public void print();
}
// interface -> 안에 있는 모든 함수는 abstract! interface도 abstract 클래스
// 상속을 위해서 extends 대신 implement
// 상속받은 클래스는 인터페이스에 선언된 메소드를 몽땅 오버라이딩 해야한다.

interface IUnKnown{
}

class Apple{}

class Calc implements ICalc, IUnKnown{ //2개의 인터페이스 모두 오버라이딩
    @Override
    public void print() {
        System.out.println("A!");
    }
}

public class Main {
    public static void main(String[] args) {
        ICalc ic = new Calc();
        ic.print();
    }
}
