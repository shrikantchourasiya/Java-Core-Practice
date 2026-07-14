package basic_program;

public class index1 {
             static int a = 10;
             int Empid;
             String Empname;
             static String name = "Infosys";
             void display (int Empid,String Empname) {
            	 System.out.println("Empid   "+Empid);
            	 System.out.println("Empname  "+Empname);
             }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	index1 t = new index1();
	t.display(1,"sita");
		System.out.println(a);
	}

}
