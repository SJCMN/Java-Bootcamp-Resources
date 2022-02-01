import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to the dealership");
        System.out.println("• selection option 'A' to buy a car");
        System.out.println("• select option 'B' to sell a car");

        String option = scan.nextLine();

        switch (option) {
            case "A": System.out.println("you chose " + option);
                break;
            case "B": System.out.println("you chose " + option);
                break;
            default: System.out.println("invalid option");
                break;
        }

        scan.close();
    }   

}
