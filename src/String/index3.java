// stringbuffer : synchronisation(Thread safe)
package String;


public class index3{
    public static void main (String args[]){
        // string buffer is used to generate a string and it is mutable.
        //String s3 = new String("Java");
       // String s4 = new s3.concat("Fullstack");

    //    StringBuffer s = new StringBuffer("Java");
    //    s.append("fullstack");
    //    System.out.println(s);
    //  StringBuffer s = new StringBuffer();
    //  System.out.println(s.capacity());

    //  s.append("JavaFullStack , Large application");
    //  System.out.println(s.capacity()); //(oldcapacity * 2) + 2
    //  s.append("A person is doing coding");
    //  System.out.println(s.capacity()); //(oldcapacity + 1) * 2
    //    s.append("monday is not a good opening for a weeek.");
    //    System.out.println(s.capacity());

    // StringBuffer s = new StringBuffer("java");
    // System.out.println(s.charAt(2));
    // System.out.println(s.delete(1,3));
    // System.out.println(s.length());

    // StringBuffer s1 = new StringBuffer("Java");
    // StringBuffer s2 = new StringBuffer("Java");
    // System.out.println(s1.equals(s2));

    //StringBuffer s = new StringBuffer( "Java");
   // System.out.println(s.insert(2, "fff"));
    // System.out.println(s.replace(1, 3, "stack"));
    //System.out.println(s.reverse());
    //System.out.println(s.subSequence(1,3));
     //System.out.println(s.substring(1));
     
    //   StringBuffer s = new StringBuffer( "Java");
    //   //s.setCharAt(1, 's');
    //    s.setLength(2);
    //   System.out.println(s);
         
      StringBuffer s = new StringBuffer( );
      s.ensureCapacity(100);
      System.out.println(s.capacity());
      s.append("Hello hello hello");
      s.trimToSize();
      System.out.println(s.capacity());
     System.out.println(s.indexOf("ll")); 
     System.out.println(s.lastIndexOf("hello"));
 
}
    
}
