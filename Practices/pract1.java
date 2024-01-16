/* Given an integer n .Perform the following conditional actions:
If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird */

import java.util.*;
public class practices1
{
    public static void main(String[] args)
  	{
    		Scanner sc=new Scanner(System.in);
    		int n;
    		System.out.print("Enter a Number: ");
    		n=sc.nextInt();
        if(n%2==0 && n<=5 && n>=2)
        {
            System.out.println("Not Weird");
        }
        else if(n%2==0 && n>=6 && n<=20)
        {
            System.out.println("Weird");
        }
        else if(n%2==0 && n>=20)
        {
            System.out.println("Not Weird");
        }
        else
        {
            System.out.println("Weird");
        }
    }
}
