package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("What was the max mark?");
        int maxMark = input.nextInt();

        System.out.println("what was the achieved mark");
        int actMark = input.nextInt();

        int stuGrade = ((actMark / maxMark) * 100);

        if (stuGrade >= 80) {
            System.out.println("that's a grade A");
        } else {
            if ((stuGrade >= 70) && (stuGrade < 80)) {
                System.out.println("thats a b");
            } else {
                if ((stuGrade >= 60) && (stuGrade < 70)) {
                    System.out.println("thats a c");
                } else {
                    if ((stuGrade >= 50) && (stuGrade < 60)) {
                        System.out.println("thats a d");
                    } else {
                        if ((stuGrade >= 40) && (stuGrade < 50)) {
                            System.out.println("thats an e");
                        } else {
                            System.out.println(" U, thats a fail");
                        }
                    }
                }
            }
        }
    }
}