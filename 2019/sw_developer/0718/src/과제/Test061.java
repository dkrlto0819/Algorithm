package 과제;

class Temp61{
    public static int indexOf(char[] toCharArray, char[] toCharArray1) {
        if(toCharArray.length<toCharArray1.length) return -1;
        int index = 0;
        if(toCharArray1.length==0) return 0;
        for(int i=0;i<toCharArray.length-toCharArray1.length;i++){
            boolean correct = true;
            for(int j=0;j<toCharArray1.length;j++){
                if(toCharArray[i+j]!=toCharArray1[j]) {
                    correct = false;
                    break;
                }
            }
            if(correct==true) {
                index = i;
                return index;
            }
        }
        return -1;
    }
}

public class Test061 {
    public static void main(String[] args){
        int idx = Temp61.indexOf("HelloWorld".toCharArray(), "fsdfsafkajsdf".toCharArray());
        System.out.println(idx); //6이 나오도록 한다
    }
}
