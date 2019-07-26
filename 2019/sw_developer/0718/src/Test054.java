

public class Test054 {
    public static void main(String[] args){
        Object ob = new Integer(100);
        Object ob2 = new Double(3.14);

        int i = ((Integer) ob).intValue();
        //인스턴스 안에있는 int 값을 끄집어내는것
        //(Integer)ob => toString()으로 호출
        System.out.println(i);

        double j= ((Double)ob2).doubleValue();
        //자손형 타입으로 캐스팅 후 value
    }
}
/*
Wrapper Class : 자료형 값을 감ㅅ싸주는 가벼울 클래스
 int->Integer
 double->Double
 */
