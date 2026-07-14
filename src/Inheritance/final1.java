package Inheritance;
// final keyword is modifier which is used for variables , methods and class.
 // super class constructor
 // kisi bhi class ke aage final laga hai uske andar ke variables final nhi rahege agar final keyword nhi lagao, but method hamesa final
 // hoti hai final keyword lagao ya na lagao.
 // for security pupose static modifier is best but oops inheritance and overriding affect.
  
 
 class shri2{
   void name(){
System.err.println("Ms. ayush");
   }
} 


public class final1 extends shri2{
        void name (){
        System.out.println("Mrs. kapoo ");
        }
    
 public static void main(String[] args) {
        final1 t =new  final1();
        t.name();
    }
    
}

