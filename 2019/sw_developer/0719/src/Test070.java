import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test070 {
    public static void main(String[] args){
        Map<String, String> map = new Hashtable<String, String>();
        map.put("apple", "사과");
        map.put("banana", "바나나");
        map.put("orange", "오렌지");
        map.put("kiwi", "키위");



        Set<String> keys = map.keySet();
        System.out.println(keys);

        Iterator<String> ls = keys.iterator();
        while(ls.hasNext()){
            String l = ls.next();
            String v = map.get(l);
            System.out.println(l+" "+v);
        }

        System.out.println(map.toString());
    }
}

/*
Map은 순서 개념없이 key=value 형태의 마치 사전과 같은 형태로 저장합니다.

List, Set, Map 형태로 뭔가 저장하는 형태를 흔히 Collection 이라고 한다.
 */