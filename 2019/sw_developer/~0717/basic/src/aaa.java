class A1{
    int i= 100;
    void print1(){
        System.out.println("A print");
    }

}

class B2 extends A1{
    int i=200;
    //void print1(){ sout("A print")} 도 포함한 꼴
    void print1(){
        System.out.println("B print"); // 메소드 오버 라이딩
        //super.print1(); //조상거 호출 super 이용하면 가
    }

    void print2(){
        System.out.println("this is print2");
    }
}

public class aaa {
    public static void main(String[] args){
        //new B2().print1(); // 자손의 것이 호출
        //new A1().print1(); // 부모의 것이 호출

        A1 t = new B2();
        System.out.println(t.i); //a1의 100 나옴
        t.print1(); //B2의 print1이 나옴

        new A1().print1();
        // t.print2(); A1에 없는 건 사용 불가.

    }
}
/*
    상속관계가 존재할 때 (조상클래스, 자손 클래스) 자손 인스턴스를 생성하면 조상의 생성자가 먼저 호출되고, 자손의 생성자가 호출된다.

    생성자는 상속되지 않는다. 다만 호출될 뿐이다. 멤버함수도 아니다 = 참조형 변수로 호출 불.

    메소드 오버라이딩 : 조상에서 선언한 멤버함수를 자손에서 다시 선언할 수 있다.
    : new B2().print1();
      new A1().print1();
      자손의 인스턴스의 print를 호출하면 재정리한 = 자손 것이 호출된다.
      조상 타입의 변수로 자손의 이스턴스를 가리킬 수 있다
      조상에서 선언된 멤버함수 멤버 변수면 호출ㄹ이 가능하다.

     조상에서 선언된멤버함수 멤버 변수만 호출이 가능하다.
        - B2의 인스턴스 안에 print2는 존재한다. 하지만 호출할 수 없다.

        왜 100이 나오는지 그 이유를 정리하자.

      변수 오버라이딩? -> 멤버 변수에는 오버라이딩 개념이 없다.
      메소드 오버라이딩? ->
 */

