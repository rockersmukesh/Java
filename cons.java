class area
{
	public area(int r)
	{
		double pi=3.14;
		double area=pi*r*r;
		System.out.println("Area of circle="+area);
	}
	public area(int a,int b)
	{
		double area=0.5*a*b;
		System.out.println("Area of triangle="+area);
	}
}
class cons
{
	public static void main(String[] args)
	{
		area obj=new area(5);
		area obj1=new area(5,5);
	}
}
