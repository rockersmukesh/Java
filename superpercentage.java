class A{
int  p=60;
int web=71;
int nm=65;
int tot;
public void msg()
{
tot=p+web+nm;
System.out.println("Total marks= "+tot);
}
}
class B extends A{
public void msg1()
{
super.msg();
double per;
per=super.tot/300.0*100.0;
System.out.println("Percentage="+per);
}
}
class supertot
{
public static void main(String[] args)
{
B ob=new B();
ob.msg1();
}
}

