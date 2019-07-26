package 과제;

import java.io.*;
import java.util.LinkedList;

class Score{
    String hackbun;
    String grade;
}

public class Test088 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Score> l = null;
        String choice = null;
        while(true){
            System.out.println("[M E N U]");
            System.out.println("1. 새 자료");
            System.out.println("2. 자료 입력");
            System.out.println("3. 파일로 저장");
            System.out.println("4. 파일로 불러오기");
            System.out.println("quit. 파일 끝내기");

            System.out.print("> ");
            choice = br.readLine();

            if (choice.equals("1")) {
                l = new LinkedList<Score>();
                System.out.println("> 새 자료가 생성되었습니다.");
            } else if (choice.equals("2")) {
                if(l==null) System.out.println("> 새 자료를 먼저 생성해주세요.");
                else {
                    System.out.print("> '학번, 점수' 형태로 입력해주세요. : ");
                    String data = br.readLine();
                    int index = data.indexOf(",");

                    Score information = new Score();
                    information.hackbun = data.substring(0, index);
                    information.grade = data.substring(index+1, data.length());

                    l.add(information);
                }
            } else if (choice.equals("3")) {
                System.out.println("> 저장할 파일명을 입력하세요.");
                String title = br.readLine();

                OutputStreamWriter out = new OutputStreamWriter( new FileOutputStream(title+".txt"));
                for (Object object : l.toArray()){
                    Score score = (Score) object;
                    out.write(score.hackbun + ", " + score.grade);
                }

                out.close();
                System.out.println("> 저장이 끝났습니다.");

            } else if (choice.equals("4")) {
                System.out.println("> 불러올 파일명을 입력하세요.");
                String title = br.readLine();
                InputStreamReader in = new InputStreamReader(new FileInputStream(title+".txt"));

                int cur = 0;
                while((cur = in.read()) != -1){
                    System.out.print((char)cur);
                }

                System.out.println();

            } else if (choice.equals("quit")) break;
        }
        // 콘솔에서 한줄 씩 읽어 들여서 사용할 때 아래의 방법을 쓴다.
        br.close();
    }
}
