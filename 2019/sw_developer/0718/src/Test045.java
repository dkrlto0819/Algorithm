public class Test045 {
    public static void main(String[] args){
        int[] i= new int[]{4, 9, 6, 5}; //자바의 배열은 instace 그러니까 length 이런것도 멤버변수
        int max=0;
        for(int k=0;k<i.length;k++)
            if(max<i[k]) max = i[k];
        System.out.println(max);
    }
}

/*
 배열 : 동이랗ㄴ 형태의 기억장소가 역속으로 할당된 기억공간.
 자바의 배열은 인스턴스다, i는 참조형 변수다.
 i.length는 배열의 멤버변수이고 길이를 의미한다.


 */