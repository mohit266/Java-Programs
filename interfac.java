import java.util.*;
class student{
Scanner ip=new Scanner(System.in);
String s ;
int r;
void input(){
System.out.println("Enter the student name: ");
String student_name=ip.nextLine();
s=student_name;
System.out.println("Enter Roll No");

int rollno= ip.nextInt();
r=rollno;
}
void displaystudent(){
System.out.println("Name is "+s);
System.out.println("Roll no is "+r);
}}
 class marks extends student{
int j,o,c,m,t,d;
void subjects(){
 System.out.println("Enter marks in Java");
 int java=ip.nextInt(); 
 System.out.println("Enter marks in OS");
 int os=ip.nextInt();
 System.out.println("Enter marks in Microcontroller");
 int mc=ip.nextInt();
 System.out.println("Enter marks in COD");
 int cod=ip.nextInt();
 System.out.println("Enter marks in TOC");
 int toc=ip.nextInt();
 System.out.println("Enter marks in DAA");
 int daa=ip.nextInt();
j=java;
o=os;
m=mc;
c=cod;
t=toc;
d=daa;
}
void space(){
System.out.println("\n*****************************\n");
System.out.println("Result");
System.out.println("\n*****************************\n");

}
void displaysub(){

System.out.println("Marks of java is "+j);
System.out.println("Marks of OS is "+o);
System.out.println("Marks of Microcontroller is "+m);
System.out.println("Marks of COD is "+c);
System.out.println("Marks of TOC is "+t);
System.out.println("Marks of DAA is "+d);
}}
interface sports{
void sport();
void displaysport();
}
 class results extends marks implements sports{
 int t;
int s;
public void sport(){

System.out.println("Enter marks in Sports");
int sports_marks=ip.nextInt();
s=sports_marks;
int total= j+o+m+c+t+d+s;
t=total;
}
public void displaysport(){

System.out.println("Marks of Sports is"+s);

System.out.println("Total Marks is"+t);
}
}
public class interfac{
public static void main(String args[]){
results r=new results();
r.input();
r.subjects();
r.sport();
r.space();
r.displaystudent();
r.displaysub();
r.displaysport();
}
}



