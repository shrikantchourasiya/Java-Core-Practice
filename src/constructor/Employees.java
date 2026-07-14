package constructor;

public class Employees {
    
 int Emp_id;
 String Name;

   Employees(int eid, String ename){
    this.Emp_id = eid;
    this.Name = ename;
   
   }

void DisplayProfile(){
   System.out.println("Emp_id : " + Emp_id);
      System.out.println("Name : " +Name);
}
public static void main (String args[]){
    Employees t2 = new Employees(101, "Purvi");
   t2.DisplayProfile();
    Employees t= new Employees(102, "akash");
   t.DisplayProfile();
   
}

    
}


    

