/*WAP using decision Making Statement(ladder if else)to find the largest among three numbers*/ 
class GreatestNumber
{
  public static void main(String[]arg)
   {
     int a=27,b=29,c=25;
     
     if(a>b&&a>c)
     { 
       System.out.println("a is greater :"+a);
      }
     else if(b>a&&b>c)
     {
       System.out.println("b is greater :"+b);
      }
     else
       {
         System.out.println("c is greater :"+c);
        }
    }
}  