class student
{  
   int Rno;
   void getRollno(int n)
   {
     Rno=n;
   }
   void putRollno()
   {
     System.out.println("Rollno="+Rno);
   }
}
class Test extends student
{
 float phy,chy;
 void get_marks(float p,float c){
 phy=p;
 chy=c;
 }
 void put_marks()
 {
   System.out.println("physics Marks"+phy);
   System.out.println("Chemistry Marks"+chy);   
  }
 }
 interface sports
 {
   float sp_marks=9.5f;
   void put_sp_marks();
 }
 class Result extends Test implements sports
 {
  float total;
  public void put_sp_marks()
  {
   System.out.println("Sports marks="+sp_marks);
   total=phy+chy+sp_marks;
  }
  void display()
  {
    putRollno();
    put_marks();
    put_sp_marks();
    System.out.println("Total marks="+total);    
  }
 }
 class ExMulinherit
{
  public static void main(String[] args)
  {
    Result r=new Result();
    r.getRollno(100);
    r.get_marks(95.5f,90.5f);
    r.display();
  }
}