class Temp4 <T extends Object>{
    private T data = null; //private String data;
    public T getData(){ return data; } //public String getData(){ return data; }
    public void setData(T i){data=i;} //public void setData(String i){data=i;}
}

public class Test052 {
    public static void main(String[] args){
        Temp4<String> t = new Temp4<String>();
    }
}

//제네릭 :: 인스턴스의 자료형을 동적으로 결정할 수 있다
/*
<>안에 지정 가능한 타입은 참조형 변수 타입이어야 한다. 자료형 안됨
: C++의 템플레이트 와 같은 것... 자료형도 허용 이때는
 */