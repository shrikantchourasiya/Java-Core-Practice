// StringBuider non-synchronized

package String;

public class index9{
    public static void main (String args[]){
        String s = "I like Java programming";
        int  vowel = 1;
        char ch[]= s.toCharArray();

   
          

        //Sor
         for(int i = 0; i < ch.length;i++){
            if(ch[i] == 'a' || ch[i]== 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i]== 'u' ) {
                vowel++;
            
            }
        }
        System.out.println("words count " + vowel);
    }
}
