import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static int ran(int min, int max){

        Random rand = new Random();

        int ranNum = rand.nextInt(max - min + 1) + min;

        return ranNum;

    }

    public static  void main(String[] args) {

        int a=ran(-9,9);

        int b=ran(-9,9);

        int c=ran(-9,9);

        int d=ran(-9,9);

        int e=ran(-9,9);

        int f=ran(-9,9);

        int delta=a*e-b*d;

        int deltaX=c*e-b*f;

        int deltaY=a*f-c*d;

        while(delta==0 || deltaX%delta!=0 || deltaY%delta!=0){

             a=ran(-9,9);

             b=ran(-9,9);

             c=ran(-9,9);

             d=ran(-9,9);

             e=ran(-9,9);

             f=ran(-9,9);

            delta=a*e-b*d;

            deltaX=c*e-b*f;

            deltaY=a*f-c*d;

        }

        Scanner sc=new Scanner(System.in);

        System.out.println("Solve"+ a+"x +"+b +"y= "+c  +"and"+ d+"x +"+e+"y= "+f+"write down the value x first,followed by the value of y");

        int useransX=sc.nextInt();

        int useransY=sc.nextInt();

        int ansX=deltaX/delta;

        int ansY=deltaY/delta;

        while(useransX!=ansX || useransY!=ansY){

            System.out.println("Not correct.Please try it again");

            System.out.println("Solve"+ a+"x +"+b +"y= "+c  +"and"+ d+"x +"+e+"y= "+f+"write down the value x first,followed by the value of y");

            useransX=sc.nextInt();

            useransY=sc.nextInt();

            ansX=deltaX/delta;

            ansY=deltaY/delta;

        }

        System.out.println("Good work! correct answer! ");

    }

}