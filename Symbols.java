import java.util.Scanner;
import java.util.regex.*; 

public class Symbols {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    //Pattern p = Pattern.compile("[#$%&€'()*+,-./:;<=>?@[\\]^_`{|}~]");
    String newstr = str.replaceAll("[\\Q#$%&€'()*+,-./:;<=>?@[\\]^_`{|}~\\E]", "");
    System.out.println(newstr);
    }
}