import java.sql.SQLOutput;

class TTT{
    ///object로 받으려면 이런 형태로 되어야 함
    private Object data = null;

    public Object getData() {
        return data;
    }

    public void setData(Object i){
        data = i;
    }
}

public class Test050 {
    public static void main(String[] args){
        String l = "HelloWorld";
        String w = "HelloWorld";
        //System.out.println(l==w); // 참조형 변수가 같을 떄? 같은 instance를 가리키거나 null 일떄

        String hello = "Hello";//pool
        String world = "World";
        String helloworld = hello+world;
        System.out.println(l==(hello+world)); //buffer
        System.out.println(l==("Hello"+"World"));
        System.out.println(l==helloworld);

        Object o = "HelloWorld";
        String s = (String) o; //참조형 변수의 강제 casting
       // System.out.println(o);
   }
}
/*
String l = "HelloWorld"
>>자바에서 유일하게 new 없이도 ""로 인스턴스 생성 가능
System.out.println(l==w); // 참조형 변수가 같을 떄? 같은 instance를 가리키거나 null 일떄
  ==>true 이므로 같다!위 코드의 String 인스턴스는 1개
StringPool이라는 독특한 java구조가 나온다.

""를 만나면 VM은 StringPool을 뒤져서 없으면 만들고 있으면 재활용 = 웹 프로그래밍에 유용(HTML String)
 */
