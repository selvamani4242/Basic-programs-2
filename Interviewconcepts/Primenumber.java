package Interviewconcepts;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingStyle;

public class Primenumber {

    public static void main(String[] args) {

        int primeinput = 13;
        boolean isprime = true;

        for(int i = 2; i < primeinput; i++)
        {
            if(primeinput % i == 0)
            {
                isprime = false;
                break;
            }
        }

        System.out.println("The given prime number is "+isprime);
    }
}
