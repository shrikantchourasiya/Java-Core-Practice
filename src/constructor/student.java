package constructor;

public class student {
    static String college = "GSCE";
    String Name;
    int Year;
    String Branch;
    student(String Name, int Year, String Branch){
        this.Name = Name;
        this.Year = Year;
        this.Branch = Branch;
   }

void Display(){
    System.out.println("student College : " +college);
     System.out.println("student Name : " +Name);
      System.out.println("student Year  : " +Year);
       System.out.println("student Branch : " +Branch);
}
public static void main (String args[]){
    student t = new student( "Ravi", 2024, "Computer Science" );
   t.Display();

    
}}
