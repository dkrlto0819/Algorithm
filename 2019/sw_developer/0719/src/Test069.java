import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test069 {
    public static void main(String[] args) {
        Set<String> ls = new HashSet<String>();
        ls.add("apple");
        ls.add("banana");
        ls.add("orange");
        ls.add("kiwi");
        ls.add("apple");


        //자바의 표준 검색 방법
        Iterator<String> it = ls.iterator();

        while(it.hasNext()){
            String l = it.next();
            if(l.indexOf("an")!=-1){
                it.remove();
            }
        }

        System.out.println(ls);
        //여기까지 알면 다 써먹을 수 있따.
        for (String t : ls)
            System.out.println(t);

    }
}

/*
Set 인터페이스를 상속받은 것 : TreeSet, HashSet
공통점
1. 순서개념이 없다.
2. 중복을 허용하지 않는다.
3. 검색속도가 List보다 월
TreeSet : 트리를 이용하여 보관.
HashSet : 해시 알고리즘을 이용하여 보관.
 */
