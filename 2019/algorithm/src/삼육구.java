import java.util.Scanner;

public class 삼육구 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String num_string;

        for(int i=1; i<=num; i++){
            int count=0;
            num_string=Integer.toString(i);
            for(int j=0; j<=num_string.length()-1; j++){
                String a=num_string.substring(j,j+1);
                if(a.equals("3")){
                    count++;
                }
                else if(a.equals("6")){
                    count++;
                }
                else if(a.equals("9")){
                    count++;
                }
            }
            if(count!=0) {
                for (int a = 1; a <= count; a++) {
                    System.out.print("-");
                }
            }
            else{
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
