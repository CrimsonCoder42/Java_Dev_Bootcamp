public class WeatherNetwork {
    public static void main(String[] args) {

        int temp = 5;  

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!

        //if temp between -15 and -1: "The forecast is FREEZING! Stay home!"
        if (temp >= -15 && temp <= -1 ) {
            forecast = "The forecast is FREEZING! Stay home!";
        } else if (temp >= 0 && temp <= 10 ) {
            forecast = "The forecast is Chilly. Wear a coat!";
        } else {
            forecast = "It's warm. Go outside!";
        } 

        System.out.println(forecast);
    }
}
