import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i=1;i<=testCase;i++){
            int max=0;
            int paper = sc.nextInt();
            int color = sc.nextInt();
            int[] a = new int[paper+1];

            for(int j=0;j<paper;j++) a[j] = sc.nextInt();
            int startPoint = 0;

            for(int j=1;j<=color;j++){
                int count = 0;
                a[startPoint] = j;
                for(int k=startPoint;k<paper;k++){
                    if(a[k]==0 || a[k]==j) {
                        count++;
                        if(a[k+1]==0 && a[k]==j) {
                            startPoint = k+1;
                        }else if(a[k+1]==a[k]+1){
                            startPoint = k+1;
                        }
                    }else{
                        count = count - (a[k]-j)+1;
                        break;
                    }
                }
                if(count>max) {
                    if(count > paper-color+1) {
                        max = paper-color+1;
                        break;
                    }else{
                        max = count;
                    }
                }
            }

            System.out.println("#"+i+" "+max);
        }
    }
}

