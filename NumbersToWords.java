import java.util.*;

public class LearnJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        HashMap<String, String> map = new LinkedHashMap<>(); 
        map.put("10","ten");
        map.put("9", "nine");
        map.put("8", "eight"); 
        map.put("7", "seven");
        map.put("0", "zero");
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        map.put("6", "six");
        System.out.println("HashMap: "+ map.toString());
        
        String x = input.nextLine();
        
        for ( String key : map.keySet() ) {
           
            x = x.replaceAll(key,map.get(key));
        }
        System.out.println(x);
    }   
}
