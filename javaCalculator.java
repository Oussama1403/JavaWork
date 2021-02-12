import java.util.Scanner; 

public class javaCalculator {

    public static void  main(String[] args) {
        System.out.println("welcome to the amazing calculator ");
        
        while (true) {
            Scanner input = new Scanner(System.in);
            double NumOne;
            double NumTwo;
            double result;
            
            System.out.println("enter the operation you want to do: ");
            String user_input = input.nextLine();

            if (user_input.equals("Exit")) {
                break;

            }
            //if (user_input.equals("+") || user_input.equals("-") || user_input.equals("*") || user_input.equals("/") ) {
            //}
            if (user_input.equals("+")) {
                System.out.println("enter the first number :");
                NumOne = input.nextDouble();
                System.out.println("enter the second number :");
                NumTwo = input.nextDouble();
                result = (NumOne + NumTwo);
                System.out.println(result);
            }
            else if (user_input.equals("-")) {
                System.out.println("enter the first number :");
                NumOne = input.nextDouble();
                System.out.println("enter the second number :");
                NumTwo = input.nextDouble();
                result = (NumOne - NumTwo);
                System.out.println(result);
            }
            else if (user_input.equals("*")) {
                System.out.println("enter the first number :");
                NumOne = input.nextDouble();
                System.out.println("enter the second number :");
                NumTwo = input.nextDouble();
                result = (NumOne * NumTwo);
                System.out.println(result);
            }
            else if (user_input.equals("/")) {
                System.out.println("enter the first number :");
                NumOne = input.nextDouble();
                System.out.println("enter the second number :");
                NumTwo = input.nextDouble();
                if (NumTwo != 0) {
                result = (NumOne - NumTwo);
                System.out.println(result);
                }
                else {
                    System.out.println("Division by zero in not allowed !");
                }
            }
            else {
                System.out.println("please try again");            
            }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        } 
    
        System.out.println("thank you for using our calculator");
    }


}