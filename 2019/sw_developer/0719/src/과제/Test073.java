package 과제;

import java.util.ArrayList;
import java.util.List;

/*
"[]"
"['apple']"
"['apple', 'banana']" ...
 */

class HW2{
    public static String collectionString(List<String> ls) {
        return null;
    }
}

public class Test073 {
    public static void main(String[] args){
        List<String> ls = new ArrayList<String>();

//        ls.add("apple");
//        ls.add("banana");
//        ls.add("orange");
//        ls.add("kiwi");

        String l = HW2.collectionString(ls);
        System.out.println(l);
    }
}
