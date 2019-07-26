class A{
    int apple = 10;
    void print(){
        System.out.println(this.apple);

    }
}

//class B는 class A를 상속하여 만들어졌음을 명시
// A의 멤버함수와 멤버변수를 모두 물려 받곘다.
class B extends A{
    int add(int i, int j){ return 100; }
}

public class Day0717 {
    public static void main(String[] args){
        B b = new B();
        b.print();

        B k = new B();
        k.apple=20;
        k.print();

        b.print();

    }
}
