package Interviewconcepts;

public class Functionoverloading {

    public int sum(int x, int y)
    {
        return (x + y);
    }

    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }

    public double sum(double x, double y)
    {
        return (x + y);
    }

    public static void main(String[] args) {

        Functionoverloading functionoverloading=new Functionoverloading();

        System.out.println(functionoverloading.sum(10,20));
        System.out.println(functionoverloading.sum(10,20,30));
        System.out.println(functionoverloading.sum(2.5,4.5));
    }
}
