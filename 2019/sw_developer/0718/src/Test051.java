class Temp2{
    private Object data = null;
    public Object getData(){ return data;}
    public void setData(Object i){data =i;}
}

class Temp3{
    private String data = null;
    public String getData(){return data;}
    public void setData(String i){data=i;}
}


public class Test051 {
    public static void main(String[] args){
        Temp2 t = new Temp2();
        t.setData("HelloWorld"); //Object i ="HelloWorld";
        String l = (String)t.getData(); // String l = Object data; 한거랑 똑같기 때문에 casting 해야
        //String 만 가능하다

        Temp3 t2 = new Temp3();
        t2.setData("HelloWorld");
        String l2 = t2.getData();
        //모든 인스턴스가 가능하

        //왜 Temp2, Temp3에서 캐스팅 유무가 생기는지 구분해보시어(hint Object는 모든 클래스의 조상클래스)
    }
}

//아래 코드에서 캐스팅이 필요한 경우와 필요하지 않은 경우를 구분한다.
//모든 인스턴스를 저장가능한것은? 캐스팅 벗이 꺼낼 수 있느 ㄴ것은?
