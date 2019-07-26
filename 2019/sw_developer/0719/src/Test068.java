import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test068 {
   public static void main(String[] args){
       LinkedList<String> l = new LinkedList<>();
       l.add("apple");
       l.add("banana");
       l.add("orange");
       l.add("kiwi");

       //향상된 for ans
       for(String t : l){
           System.out.println(t);
       }

   }
}

/*

ArrayList 속도가 빠르다. 내부적으로 배열을 이용한다.
- 배열을 써서 단순히 쌓는 속도는 빠르지만 중간 삭제시에는 비효율적이다.

LinkedList 는 쌓는 속도가 느리다. Node를 이용하기 때문
중간에 추가, 삭제가 되었을 떄 포인터만 바꿔주면 되기 때문에 포인터만 바꾸면 쉬움.

둘다 List를 상속한다. List를 상속받은 클래스들은 특징이 존재한다.
- 중복되는 것을 허용.
- 검색시 들어간 순서대로 나온다(순서대로 보관)
- 스택이나 큐 만들기 유용


 */
