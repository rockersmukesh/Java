class abcd
{
public abcd()
{
System.out.println("Hello");
}
public void finalize()
{
System.out.print("Object is Garbage Collected");
}
public static void main(String[] args)
{
abcd ob=new abcd();
ob=null;
System.gc();
}
}
