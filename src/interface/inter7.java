// Nested Interface

interface Employee {
  interface dpt{
    void EmployeesProfile();
  }
}


class EmployeeDetails implements Employee.dpt{
  public void EmployeesProfile(){
    System.out.println("Name : Tanya jain");
  }
}

public class inter7{
   public static void main(String[] args) {
    EmployeeDetails e = new EmployeeDetails();
    e.EmployeesProfile();
   
    
    
   }
    
}
