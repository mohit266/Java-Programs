class Arg
{
 public static void main(String args[])
   {
     int count,i=0;
     count=args.length;
     
     while(i<count)
     {
       i=i+1;
       System.out.println("The arguement +i+ is " +args[i-1]);
      }
   }
}