public class WorkSchedule {
    public static void main(String[] args) {
        // Object weekDays = {
        //     1: Sunday,
        //     2: Monday,
        //     3: Tuesday, 
        //     4: Wednesday,
        //     5: Thursday,
        //     6: Friday,
        //     7: Saturday
        // }

        int day = 7;  
        boolean holiday = false;
         
        if ( holiday ) {
            System.out.println("woohoo, no work!");
        } else if ( day == 1 || day == 7){
            System.out.println("it's the weekend, no work!");
        } else {
            System.out.println("Wake up at 7:00 :(");
        }
        // if it's a holiday, print: "woohoo, no work!");
        // if it's the weekend, print: "it's the weekend, no work!"
        // otherwise, print: "Wake up at 7:00 :( ";
        }

    }
