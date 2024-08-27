package src.main.java.exercise;

import java.util.Random;

public class LinearEquationQuestion {

    private int[] coefficients;

    private int delta;

    private int deltaX;

    private int deltaY;

    private static int generateRandomNumbers(int min, int max) {

        Random rand = new Random();

        return rand.nextInt(max - min + 1) + min;

    }

    public LinearEquationQuestion() {

        this.coefficients = new int[6];

        //Ensure the question is valid

        do {

            for (int i = 0; i < 6; i++) {

                this.coefficients[i] = generateRandomNumbers(-9, 9);

            }

            this.delta = this.coefficients[0] * this.coefficients[4] - this.coefficients[1] * this.coefficients[3];

            this.deltaX = this.coefficients[2] * this.coefficients[4] - this.coefficients[1] * this.coefficients[5];

            this.deltaY = this.coefficients[0] * this.coefficients[5] - this.coefficients[2] * this.coefficients[3];

        } while (delta == 0 || deltaX % delta != 0 || deltaY % delta != 0);

    }

    public void printQuestion() {

        System.out.printf("Solve %dx +%dy =%d and %dx+%dy=%d\n", this.coefficients[0], this.coefficients[1], this.coefficients[2], this.coefficients[3], this.coefficients[4], this.coefficients[5]);

    }

    private int getAnswerX() {

        return this.deltaX / this.delta;

    }

    private int getAnswerY() {

        return this.deltaY / this.delta;

    }

    public boolean checkAnswer(int x, int y) {

        return x == getAnswerX() && y == getAnswerY();

    }

}
