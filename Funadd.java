import java.util.*;
class add
{
  Scanner sc=new Scanner(System.in);
  void sum()
  { 
     System.out.print("Enter value  of x = ");
     int x=sc.nextInt();
     System.out.print("Enter value  of y = ");
     int y=sc.nextInt();
     int z=x+y;
     System.out.println("Addition is "+z);
  }
}
class Funadd
{
  public static void main(String[] args)
  {
    add a1=new add();
    a1.sum();
  }
}