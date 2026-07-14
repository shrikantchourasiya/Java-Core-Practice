// String is a sequence of characters
// string uses a non-primitive datatype concept.
// It size is resizable.

// String s1 = "Java";
// String s = new String ("java");
// StringBuffer s2 = new String ("Java");
// StringBuilder s3 = new String("Java");
// SCP(String Control Pool) : it is a part of memory available in the heap section for storing string.



package String;

public class index1 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        String s = "Coding Thinkers";
        String s3 = "Coding Thinkers";
        System.out.println(s==s3);
        System.out.println(s.equals(s3));

        String s4= "Shrikant";
        System.out.println(s4.length());
        String s5 = "  shrikant  ";
        System.out.println(s5.trim());
        String s6 = "Ananya";
        if(s6.isEmpty()==true){
            System.out.println("Field is required");
        }
        else {
            System.out.println("Field is filled");
        }

        String s7= "Shrikant";
        String  s8 = "shrikant";
        System.out.println(s7.equalsIgnoreCase(s8));
        System.out.println(s7.compareTo(s8));
        System.out.println(s7.compareToIgnoreCase(s8));

        
    }
    
}

