package 과제;

/*
2가지 이상의 다른 방법으로 구현해보세요.
1가지 방법에는 collection 금지;

100은 0~99 사이의 숫자를 생성해야 한다.
중복없이 담기~
 */

class HW{
    public static int[] randomArray(int amout, int limit) {
        return null;
    }
}

public class Test072 {
    public static void main(String[] args){
        int[] rl = HW.randomArray(6, 100);
        for(int i=0;i<rl.length;i++){
            System.out.println(rl[i]);
        }
    }
}
