public class Test060 {
    public static void main(String[] args){
        String l = "HelloWorld";
        System.out.println(l.substring(2, 5));
        System.out.println(l.indexOf("or")); //존재하지 않으면 -1 return
        // 문자열 안이 부분 문자열의 위치를 리턴 : 6

        System.out.println(l.indexOf("xx"));
        System.out.println(l.startsWith("Hello")); //시작하면 true
        System.out.println(l.endsWith("Hello"));

        //자료형의 배열을 리턴해준다.
        char[] ch = l.toCharArray(); // 자동 char형 array return;

        for(int i=0;i<ch.length;i++) System.out.println(ch[i]);
    }
}
