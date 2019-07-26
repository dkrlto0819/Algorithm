import java.util.Date;

class test3{
    private int data =100;
    public int getData(){
        return data;
    }
}

class test4 extends test3{
    private int data = 200;
    public int getData(){
        return data; // 자기안의 데이터 호출
    }
}

public class realTest {
    public static void main(String[] args){
        test3 t = new test4(); //조상의 포인터를 자손의 인스턴스로!
        System.out.println(t.getData()); //오버라이딩 된게 호출
    }
}

/*
관례 :
멤버 변수는 무조건 private하게 선언한다.
값을 읽고자 할 때는 보통 getter 함수를 이용하여 가지고 접근한다.
aaa에서
- A t = new B()에서 t.data는 조상의 것이 나오고 t.print는 오버라이딩 된게 나오는데...
이걸 이렇게 private하고 getter 하면 논란 종결 -> 자손 것만 가져옴
*조상에서 getXX가 보이걸랑 그런 변수가 있는 주 알고 XX변수는 피해간다
 */