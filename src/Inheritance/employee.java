package Inheritance;
  
 
 class Member {
    String Name;
    int Age;
    int phoneNumber;
    String Address;
    int Salary;
    Member(String Name, int Age, int phoneNumber, String Address, int Salary){
        this.Name = Name;
        this.Age = Age;
        this.phoneNumber= phoneNumber;
        this.Address = Address;
        this.Salary = Salary;
    }
    void printSalary() {
        System.out.println("Salary of employee : " +Salary);
    }}

  class Manager extends Member{
    String Department;
    Manager(String Name, int Age, int phoneNumber, String Address, int Salary, String Department){
        super(Name, Age, phoneNumber, Address, Salary);
        this.Department = Department;
 } 
   void display(){
    System.out.println("Name of Manager : "+Name);
    System.out.println("Age of Manager : "+Age);
    System.out.println("Phone Number of Manager : "+phoneNumber);
    System.out.println("Address of Manager : "+Address);
    System.out.println("Salary of Manager : "+Salary);
   }

  }
   public  class employee extends Member{
    String Specialiazation;
        employee(String Name, int Age, int phoneNumber, String Address, int Salary,String Specialiazation) {
        super(Name, Age, phoneNumber, Address, Salary);
         this.Specialiazation = Specialiazation;
    
    }
    void display(){
    System.out.println("Name of Employee : "+Name);
    System.out.println("Age of Employee : "+Age);
    System.out.println("Phone Number of Employee : "+phoneNumber);
    System.out.println("Address of Employee : "+Address);
    System.out.println("Salary of Employee : "+Salary);
   }


public static void main(String[] args) {
        Manager m1 = new Manager("Shrikant", 20, 934015887, "Pune", 50000, "Sales");
        m1.display();
        employee e1 = new employee("Vishal", 22, 945976899, "Indore", 60000, "IT");
        e1.display();
    }
}

