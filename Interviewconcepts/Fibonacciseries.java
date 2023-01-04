package Interviewconcepts;

public class Fibonacciseries {


    public static void main(String[] args) {


        int input=7;
        int firstterm=0;
        int secondterm=1;
        int nextterm;

        System.out.println(firstterm);
        System.out.println(secondterm);

        for(int i=2; i<=input; i++){

            nextterm=firstterm+secondterm;
            System.out.println(nextterm);
            firstterm=secondterm;
            secondterm=nextterm;
        }

    }
}
