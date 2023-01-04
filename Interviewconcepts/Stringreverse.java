package Interviewconcepts;

public class Stringreverse {


    public static void main(String[] args) {


        String input ="welcome";
        String rev ="";

        char[] output = input.toCharArray();
        int length=output.length;
        System.out.println("originalword"+" "+input);

        for(int i = length-1; i>=0; i--)
        {
            rev = rev+input.charAt(i);
             System.out.println(rev);
        }
    }
}
