public class Test058 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        sb.append("apple");
        sb.append("banana");
        String l = sb.toString();

        System.out.println(l);
        System.out.println("apple"+"banana");
    }
}

/*
"apple"+"banana" 는 컴파일러가 new StringBuffer().append("apple").append("banana").toString 로 바꿈

String l = ""
l=l+"*";
l=l+"*";
l=l+"*";
.....
이런건 나쁜 코드 => StringBuffer 계속 필요함
new StringBuffer()가 동작하는 형태. 효율성 제로

        StringBuffer sb = new StringBuffer();
        sb.append("apple");
        sb.append("banana");
        String l = sb.toString();

        System.out.println(l);
        System.out.println("apple"+"banana");
        =>얘는 StringBuffer가 한번. 제일 좋은 코드. 메모리 효율성 훨씬 좋다.

 */

