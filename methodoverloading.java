class calc
{
    public void add(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("Addition="+c);
    }
    public void mul(double a,double b)
    {
        double c;
        c=a*b;
        System.out.println("Multiplication="+c);
  }
}
class methodoverloading
{
    public static void main(String[] args)
    {
        calc obj=new calc();
        obj.add(10,20);
        obj.mul(10.5,20.5);
    }
}

/*
Output
Addition=30
Multiplication=215.25
*/