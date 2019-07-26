public class Test059 {
    public static void main(String[] args){
        StringBuffer l = new StringBuffer();
        for(int i=0;i<1000000;i++){
            l.append("apple");
        }
        System.out.println(l);
    }
}
//virus!

/*
java -verbosegc Test059
메모리가 부족할 때 메모리를 비우고 확보하는 일을 모니터링하게 된다.

String l=""
for(int i=0;j<10000;i++){
    l=l+"apple";
}
sout(l)
 */