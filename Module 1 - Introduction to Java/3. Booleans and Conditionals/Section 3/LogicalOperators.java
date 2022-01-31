public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 64;
        int englishGrade = 76;
        String language = "Java";

        if (chemistryGrade > 45 || englishGrade > 55 || language.equals("Java")){
            System.out.println("Congratulations, you got the scholarship!");
        } else {
            System.out.println("Sorry, you didn't get the scholarship");
        }

        int credits = 56;
        double GPA = 1.2;

        if ( credits >= 40 && GPA >= 2.0 ){
            System.out.println("You earned your diploma!");
        } else {
            System.out.println("Sorry, you need at least 40 credits and 2.0 GPA to earn a diploma");
        }
    }
    
}
