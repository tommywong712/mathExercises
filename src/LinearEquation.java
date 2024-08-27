import src.main.java.exercise.LinearEquationQuestion;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LinearEquation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinearEquationQuestion question = new LinearEquationQuestion();

        question.printQuestion();

        int useransX = sc.nextInt();

        int useransY = sc.nextInt();

        if(question.checkAnswer(useransX,useransY)){



        }else do {

            System.out.println("Incorrect answer, try again");

            useransX = sc.nextInt();
            useransY = sc.nextInt();

        }while (!question.checkAnswer(useransX, useransY));

        System.out.println("Good work! correct answer!");

        System.out.println("Would you like to try once more? Type yes if you want");

        String userreply = sc.nextLine();

        if (userreply.equals("yes")) {

            // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter. //
        }


    }

}