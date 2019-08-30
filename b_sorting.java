class b_sorting
{
 public static void main(String args[])
 {
   int i,j,temp;
    int count;
    count=Integer.parseInt(args[j]);
   for(i=0;i<count;i++)
    for(j=0;j<count-i-1;j++)
        if(args[j]>args[j+1])
    {        
     temp=args[j];
     args[j]=args[j+1];
     args[j+1]=temp;
    }
   
  for(i=0;i<count;i++)
   {
    System.out.println("Sorting array is:"+args[i]);
   }
 }
}