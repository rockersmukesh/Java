/* There are three lines of input:
The first line contains an integer.
The second line contains a double.
The third line contains a String. */
import java.io.*;
import java.util.*;

public class practice2 {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Integer Number: ");
        int i=sc.nextInt();
        System.out.print("Enter a Decimal Number: ");
        double d=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter a Sentence: ");
        String s=sc.nextLine();
        System.out.println("String: "+s);
        System.out.println("Double: "+d);
        System.out.println("Int: "+i);
    }
}
