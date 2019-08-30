class Exception
{
 public static void main(String []args)
 {
   try{
       System.out.println(3/0);
       System.out.println("In try");
   }
        catch(ArithmeticException e){
        System.out.println        ("Exception:"+e.getMessage());
    }
      /*    catch(NullPointerException e){
           System.out.println("Exception:"+e.getMessage());
       }
       finally{
      System.out.println("Hello");}*/
    
     
     System.out.println("Hello");
 }
}