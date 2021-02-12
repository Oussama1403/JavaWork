import java.util.Scanner;
import java.util.regex.*; 

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        int val = 0;
        int LenOfPaswd = password.length();
        
        boolean num = Pattern.matches("(.*)[0-9]+(.*)", password);
        boolean SpecialChar = Pattern.matches("(.*)[!@#$%&*]+(.*)", password);  
        System.out.println(num+" "+SpecialChar);
        
        
        while (true) {
            if (LenOfPaswd < 7) {
                val = -1;
                break;
            }
            else if(!(num)) {
                val = -1;
                break;
            }
            else if (!(SpecialChar)) {
                val = -1;
                break;
            }
            else {
                val = 0;
                break;
            }
        }
        if (val == 0) {
           System.out.println("Strong");
        }
        else {
            System.out.println("Weak");
        }
    }
}