import java.util.Scanner;

public class Pokemon {
    int[][] map;
    int[] point;
    int[] capCity;
    int max;

    private void pokemon(int[] point, int location, int i) {
        if(capCity[i]==1){
            if(max<location) max=location;
        }
    }

    public void solution(){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();


        for(int i=1;i<=testCase;i++){
            int city = sc.nextInt();
            int road = sc.nextInt();

            map = new int[city+1][city+1];
            point = new int[city+1];
            capCity = new int[city+1];

            for(int j=1;j<=road;j++){
                int r=sc.nextInt();
                int c=sc.nextInt();

                map[r][c]=1;
            }

            for(int j=0;j<city;j++) point[j]=sc.nextInt();

            int startCity = sc.nextInt();
            int captain = sc.nextInt();

            for(int j=1;j<=captain;j++){
                int index = sc.nextInt();
                capCity[index] = 1;
            }

            /* 스캔 받은 것들 */
            int max=0;
            pokemon(point, startCity, 0);
            System.out.println("#"+i+" "+max);
        }
    }

    public static void main(String[] args){
        Pokemon start = new Pokemon();
        start.solution();
    }
}
