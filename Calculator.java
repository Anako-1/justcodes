import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String[] option = {"1", "2", "3", "4","5"};
        int x , y ;
        String choice;
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division");
        System.out.println("5. Modulo");  

        while(true){
            System.out.println("Enter the mathematical calculation you want to perform (1/2/3/4/5):");
            choice = scan.next();

            if(choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5")){
                System.out.println("Enter the first number:");
                x = scan.nextInt();
                System.out.println("Enter the Second number:");
                y = scan.nextInt();
                break;
            }
            System.out.println("invalid option,please try again.");

        }
        if (choice.equals("1")){
            int sum = x + y;
            System.out.println( x + " + " + y +" = "+ sum);

        }
        else if (choice.equals("2")){
            int subtraction  = x - y;
            System.out.println( x + " - " + y +" = "+ subtraction);
                
        }
        else if (choice.equals("3")){
            int multiplication = x * y;
            System.out.println( x + " * " + y +" = "+ multiplication);
        }
        else if (choice.equals("4")){
            if (y != 0){
            double division = x / y;
            System.out.println( x + " / " + y +" = "+ division);
            }else {
                System.out.println("Cannot divide by zero.");
            }
        }
        else if (choice.equals("5")){
            int modulo = x % y;
            System.out.println( x + " % " + y +" = "+ modulo);
        }
        System.out.println("Wanna calculate again");
        String calculateAgain = scan.nextLine();
        if(!calculateAgain.equals("Y")){
            //break;
        }
        scan.close();
    }
}
   