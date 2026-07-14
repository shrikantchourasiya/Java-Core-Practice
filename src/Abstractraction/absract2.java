
package Abstractraction;

 abstract class Test2 {
    abstract  int  sum(int a, int b) ;  // abstarct method
   abstract char chara(char ch);  // abstarct method
  }

class abstract2 extends Test2{
    
    int sum(int a, int b) {
        System.out.println(a+b);
        
        return 100 ; 
    }

    char  chara(char ch) {
        System.out.println(ch);
        return 'c';
    }

    public static void main(String[] args) {
       abstract2 t1 = new abstract2();
       int a = t1.sum(10, 20);
       System.out.println(a);
       
       char s= t1.chara('c');
       System.out.println(s);
    }
} 

