class Temp{
   static int i = 100;

   void print(String s){
       System.out.println(s);
   }
}

class Temp2 extends Temp{

}

public class Test040 {
    public static void main(String[] args){
        int j = Temp.i;

        Temp t = new Temp2();
        System.out.println(t.i);
        t.i = 200;
        Temp t2 = new Temp2();
        System.out.println(t2.i);
    }
}

/* 자바 실행환경은 클래스가 필요해지면 .class 파일을 메모리에 올린다
    그 이후에 instance 생성 가능.

    static 멤버는 클래스 로딩시에 메모리를 할당 받음.
    non-staic 멤버는 instace가 생성될 떄 메모리를 할당 받음.

    static 멤버 접근 = (class name).symbol


 */
