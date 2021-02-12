import java.util.*; 

public class LearnJava {
    
    public static void main(String[] args) {
        int n1,n2;
        Scanner input = new Scanner(System.in);
        Random rand = new Random(); 
        System.out.println("Enter a name for the first player :");
        String player1 = input.nextLine();
        System.out.println("Enter a name for the second player :");
        String player2 = input.nextLine();
        System.out.println("Enter number of throws :");
        int nl = input.nextInt();
        int s1 = 0;
        int s2 = 0;
        for (int i = 0;i<=nl;i++) {
            n1 = rand.nextInt(7);
            s1 = s1 + n1;
            n2 = rand.nextInt(7);
            s2 = s2 + n2;
        }
        System.out.println(player1 + " " + s1);
        System.out.println(player2 + " " + s2);

        if (s1 > s2) {
            System.out.println(player1 + " is the winner!");
        }else if (s2 > s1) {
            System.out.println(player2 + " is the winner!");
        }
        else {
            System.out.println("draw");
        }    
        

        
        
        

        
    } 
}