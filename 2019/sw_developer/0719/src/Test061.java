class A{

}

class B extends A{
    public void print(){
        System.out.println(100);
    }
}

public class Test061 {
    public static void main(String[] args){
        A t = new B();
        if(t instanceof B) {
            //t가 가리키는 인스턴스를 감싸는 B인스턴스 영역이 존재해야만 가능
            //B로 캐스팅이가능한지 아닌지
            B t2 = (B) t;
            t2.print();

        }
    }
}
