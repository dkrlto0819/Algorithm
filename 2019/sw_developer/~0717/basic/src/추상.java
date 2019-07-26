abstract class A3{
    abstract public void print(); //abstract 하나라도 있으면 클래스도 abstract
}

class B3 extends A3{

    public void print() {
        System.out.println(100);
    }
}

public class 추상 {
    public static void main(String[] args){
        A3 a = new B3();
        a.print();
    }
}

/*
printf는 선언되었지만 정의되지 않았다 = abstract

abstract class는 인스턴스를 못 만든다.
참조형 변수 선언은 가능
상속받아 클래스 제작 가능

abstract 메소드를 오버라이딩 하면 abstract 성질 없어진다.

A t ? new B()? A t = new B()/? t.print()?
- 이게 왜 문법적으로 가능한지를 점검할 필요가 있다. => 클래스의 성질 1, 2, 3 이용할것!
1. 클래스니 참조형 변수 생성 가능
2. B가 A를 상속받은 클래스
3. 자손의 것 나옴
 */
