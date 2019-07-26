class A{
    A(){
        System.out.println("A constructor");
    }
}

class B extends A{
    B(){
        System.out.println("B constructor");
    }

    void lll(){
        static int a;
    }
}



public class Test {
    public static void main(String[] args){
        new B();
    }
}
