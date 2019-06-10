package com.company;


import java.util.Scanner;

public class Main {

    public static int[] answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        answer = new int[amount];

        for(int i=1;i<=amount;i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            solution(first, second);
        }
    }

    private static void solution(int first, int second) {

    }
}
