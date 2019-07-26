class test{
    private int mayak=0;
    protected int monarisa =0;
    public int house2=0;
}

class test2 extends test{
    void print(){
        // System.out.println(mayak); -> private 접근 불가
        System.out.println(monarisa);

    }
}

public class 접근제어자 {
    public static void main(String[] args){
        test look = new test();
        System.out.println(look.monarisa); //설명대로라면 안되나 자바에서는 됨! C++에서는 안됨!
        // System.out.println(look.mayak); 얘도 접근 안
    }
}
