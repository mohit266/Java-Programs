//WAP to read an array,print array and find the Gratest and smallest no. from the array
public class Array
 {
   public static void main(String[]args)
  {
    int i,max,min;
    int[] student={1,2,5,3,9,7,4,2,8,9};

    for(i=0;i<10;i++)
     {
     System.out.println("Student index " +i+ ":"+ student[i]);
    }
 {
    max=student[0];
      for(i=1;i<10;i++)
        {
           if(max<student[i])
               {
                  max=student[i];
                }
         }
            System.out.println("Greatest no:"+max);
    }
{
  min=student[0];
     for(i=1;i<10;i++)
       {
          if (min>student[i])
             {
               min=student[i];
              }
        }
          System.out.println("Smallest no:"+min);
     }
  }
}
    