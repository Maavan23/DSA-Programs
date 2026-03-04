package batch49;

public class ReverseString {
    public static void main(String[] args) {
        
        String text = "ICBT";
        
        for (int i = text.length() - 1; i >= 0; i--) {
            
            System.out.print(text.charAt(i));
            
            
        }
        
        System.out.println();
    }
    
}
