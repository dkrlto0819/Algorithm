class Temp{
    private int data = 100;
    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }
}

public class Test048 {
    public static void main(String[] args){
        Temp t = new Temp();
        System.out.println(t.getData());
        t.setData(200);
        System.out.println(t.getData());
    }
}

/*
조상클래스를 지정하지 않으면 Object로부터 상속 받는다.
java.lang 패키지에 소속된 ㅋㄹ래스는 import 없이 사용 가능하

toString()은 Object에 선언되었고 상속되었따.
Temp@6b71769e : 클래스명@HayCode값 = 인스턴스가 다르면 숫자값도 다
Object는 모든 클래스의 조상!
Object는 어떤 인스턴스라도 가리키는 것이 가능하

멤버변수는 private 권장. 값을 ㅇ릭을 때는 getter 함수를 제작해 쓴다
인스턴스 내의 변수값을 읽기전용으로 하려면? getter만 만들어준다.
인스턴스 내의 변수값을 바꾸고 싶을 땐ㄴ setter을 사용하는 것이 예의
 */

