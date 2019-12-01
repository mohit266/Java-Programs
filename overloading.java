\\Method overloading
class add
{
 int sum(int a,int b)
 {
   return(a+b);
  }
 float sum(float a,float b,float c)
 {
   return(a+b+c);
 }

}
class overloading
{
 public static void main(String[]args)
  {
    int l;
    float m; 
    add a1=new add();
    l=a1.sum(4,6);
    m=a1.sum(4.5f,6.5f,9.0f);
    System.out.println("Sum of integer is:"+l);
    System.out.println("Sum of float is:"+m);
  }
}