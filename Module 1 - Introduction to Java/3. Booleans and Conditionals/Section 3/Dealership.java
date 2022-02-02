import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to the dealership");
        System.out.println("• selection option 'A' to buy a car");
        System.out.println("• select option 'B' to sell a car");

        String option = scan.nextLine();

        switch (option) {
            case "A": System.out.println("What is your budget?");
                int budget = scan.nextInt();
                if(budget >= 10000){
                    System.out.println("Great! This Dodge Stratus is available");
                    System.out.println("\nDo you have insurance? Enter 'Yes' or 'No'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a drivers license? Enter 'Yes' or 'No'");
                    String license = scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();
                    if ( insurance.equals("Yes") && license.equals("Yes") && creditScore > 660 ){
                        System.out.println("Sold! Sign here and this car is yours!");
                    } else {
                        System.out.println("Get the F#&* outta here!");
                    }
                } else {
                    System.out.println("Get outta here!");
                }
                break;
            case "B": System.out.println("\nWhat is your car's value?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();
                if ( value > price && price < 30000){
                    System.out.println("\nWe'll buy that piece of s*(#!");
                } else {
                    System.out.println("\nNaa son, we're not interested");
                }
                
                break;
            default: System.out.println("invalid option");
                break;
        }

        scan.close();
    }   

}
