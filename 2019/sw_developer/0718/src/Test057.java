class Temp5{
    int data =0;
    //아래 코드의 t와 this가 가리키는 대상은 같다
    // 따라서 t.add(10)은 10을 더한 후에 t로 바ㅝ 쓸 수 있어진다.
    //StringBuffer의 append에서 볼 수 있다.
    Temp5 add(int i){
        data +=i;
        return this;
    }
}

public class Test057 {
    public static void main(String[] args){
        Temp5 t = new Temp5();
        t.add(10).add(10).add(10).add(10);
        System.out.println(t.data);
    }
}
