// StringBuider non-synchronized

package String;

public class index8{
    public static void main (String args[]){
        String s = "I like Java programming";
        int count = 1;

   
          

        //Sort
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("words count " + count);
    }
}
