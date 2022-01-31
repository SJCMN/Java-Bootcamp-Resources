public class WeatherNetwork {
    public static void main(String[] args) {

        int temp = 12;  

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        if ( temp < 20 ) {
            System.out.println("The forecast is FREEZING! Stay home!");
        } else if ( temp >= 20 && temp <= 32 ){
            System.out.println("The forecast is Chilly. Wear a coat!");
        } else {
            System.out.println("It's warm. go outside!");
        }

        //if temp between 0 and 20: "The forecast is FREEZING! Stay home!"

        //if temp between 20 and 32: "The forecast is Chilly. Wear a coat!";

        //else: It's warm. go outside!

        System.out.println(forecast);
    }
}
