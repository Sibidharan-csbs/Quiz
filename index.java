import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. Which keyword is used to inherit a class in Java?\nA. extends\nB. implements\nC. inherit\nD. super",
                "2. Which method is the entry point of a Java program?\nA. start()\nB. run()\nC. main()\nD. init()",
                "3. Which package contains the Scanner class?\nA. java.io\nB. java.lang\nC. java.util\nD. java.net",
                "4. Which loop executes at least once?\nA. for\nB. while\nC. do-while\nD. foreach",
                "5. Which operator is used to compare two values?\nA. =\nB. ==\nC. !=\nD. :"
        };

        char[] answers = {'A', 'C', 'C', 'C', 'B'};

        int score = 0;

        System.out.println("===== JAVA QUIZ =====");

        for (int i = 0; i < questions.length; i++) {

            System.out.println();
            System.out.println(questions[i]);

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is " + answers[i]);
            }
        }

        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Total Questions : " + questions.length);
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers   : " + (questions.length - score));

        double percentage = (score * 100.0) / questions.length;
        System.out.println("Percentage      : " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Grade : A");
        } else if (percentage >= 60) {
            System.out.println("Grade : B");
        } else if (percentage >= 40) {
            System.out.println("Grade : C");
        } else {
            System.out.println("Grade : Fail");
        }

        sc.close();
    }
}
