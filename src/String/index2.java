package String;


public class index2 {
    public static void main (String args[]){
        String  result = String.join("|", "Pizza", "dosa", "burger");
        System.out.println(result);
        
        String s= "Helloworld";
        System.out.println(s.subSequence(3,9));
        System.out.println(s.substring(5));
        System.out.println(s.replace("Hello", "Happy"));

        String s1 = "This is demo";
        System.out.println(s1.replace("is", "was"));
        System.out.println(s1.replaceAll("is (.*)", "was"));

        String s2 = "JavaFullStack";
        System.out.println(s2.indexOf('a'));
        System.out.println(s2.lastIndexOf('a'));
        System.out.println(s2.charAt(2));
// string buffer is used to generate a string and it is mutable.
        //String s3 = new String("Java");
       // String s4 = new s3.concat("Fullstack");
 


    }
    
}
