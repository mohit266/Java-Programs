//Abstract method example
abstract class Base
{
 abstract int add(int a,int b);
 void display()
 {
  System.out.println("This is abstract Base class");
 }
}
class derived extends Base
{
 int add(int a,int b)
 {
  return(a+b);
 }
}
class Exabstract
{
  public static void main(String[] args)
  {
    int x;
    derived d1=new derived();
    d1.display();
    x=d1.add(4,6);
    System.out.println("The addition is:"+x);
  }
}