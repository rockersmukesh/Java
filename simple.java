import java.util.*;
class simple
{
	public static void main(String[] args)
	{
	int p,r,n;
	double s;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the principle:");
	p=sc.nextInt();
	System.out.print("Enter the rate:");
	r=sc.nextInt();
	System.out.print("Enter the years:");
	n=sc.nextInt();
	s=(p*n*r)/100;
	System.out.println("Simple interest ="+s);
	}
}
	
