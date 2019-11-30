\\Method overriding
class parent
{
  int a,b;
  parent(int x,int y)
 {
   a=x;
   b=y;
 }
  int add(int a,int b)
 {
  return(a+b);
 }
}
class child extends parent
{
  int c;
  child(int x,int y,int z)
{ 
  super(x,y);
  c=z;
  
}
  int add(int a,int b,int c)
{
 return(a+b+c);
 }
}
class overriding
{
 public static void main(String[]args)
  {
    int m;
    child c1=new child(4,5,6);
    m=c1.add(4,5,6);
    System.out.println("Sum is:"+m);
  }
}
 