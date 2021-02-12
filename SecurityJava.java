import java.util.*;

public class LearnJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        
        x = x.replaceAll("x", "");
        List<Character> chars = new ArrayList<>();
        for (char ch : x.toCharArray()) { 
            chars.add(ch); 
        } 
        //System.out.println(chars);
        int Money = chars.indexOf('$');
        int Thief = chars.indexOf('T');
        //condition
        if (Money < Thief) {
            if ( chars.get(Money + 1).equals('G') ) {
                System.out.println("quiet");
            }else {
                System.out.println("ALARM");
            }
        }
        else if (Money > Thief ) {
            if ( chars.get(Money - 1).equals('G') ) {
                System.out.println("quiet");
            }else {
                System.out.println("ALARM");
            }
        }
        else {
            
        }
}
}