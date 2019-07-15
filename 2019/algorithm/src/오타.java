import java.sql.SQLOutput;
import java.util.Scanner;

public class 오타 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i=1;i<=testCase;i++) {
            long answer = 1;
            String letter = sc.next();
            for (int index = 0; index < letter.length(); index++) {
                int number = 1;
                if (index == 0) {
                    if (letter.substring(index, index + 1).equals(letter.substring(index + 1, index + 2)) == false)
                        number = 2;

                } else if (index == letter.length() - 1) {
                    if (letter.substring(index, index + 1).equals(letter.substring(index - 1, index)) == false)
                        number = 2;
                } else {
                    if (letter.substring(index - 1, index).equals(letter.substring(index + 1, index + 2))) {
                        if (letter.substring(index, index + 1).equals(letter.substring(index - 1, index)) == false)
                            number = 2;
                    }
                    else {
                        if (letter.substring(index, index + 1).equals(letter.substring(index - 1, index)) ||
                                letter.substring(index, index + 1).equals(letter.substring(index + 1, index + 2)))
                            number = 2;
                        else number = 3;
                    }
                }
                answer *= number;
                answer %= 1000000007;
            }
            System.out.println("#" + i + " " + answer);

        }

    }
}

