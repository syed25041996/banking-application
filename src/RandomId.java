import java.util.Random;

public class RandomId {

    public static String getRandomId(){
        int doubleMin = 100;
        int doubleMax = 999;
        Random rnd = new Random();
        double middle = Math.random() * (doubleMax - doubleMin + 1) + doubleMin;
        char start = (char) ('A' + rnd.nextInt(26));
        char end = (char) ('Z' - rnd.nextInt(66));

        String finalId = "" + start + (int)middle + end;

        return finalId;
    }
}
