class swap
{
	public swap(int a,int b)
	{
		int c;
		System.out.println("Before Swapping");
		System.out.println("First Number="+a);
		System.out.println("First Number="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping");
		System.out.println("First Number="+a);
		System.out.println("First Number="+b);
	}
}
class method
{
	public static void main(String[] args)
	{
		swap obj=new swap(3,5);
	}
}
