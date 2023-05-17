import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num;
        String[] w = new String[9];
        for(int i = 0; i < w.length; i++) {
            num = rnd.nextInt(55,180);
            w[i] = "" + num;
            System.out.print(w[i] + " ");
        }
        System.out.println("\n");
        Arrays.sort(w, Comparator.comparingInt(Main::sum_of_digits));
        for(String i: w){
            System.out.print(i + " ");
        }
    }
    public static int sum_of_digits(String numbers) {
        int sum = 0;

        for(int i = 0; i < numbers.length(); ++i) {
            sum += Character.getNumericValue(numbers.charAt(i));
        }

        return sum;
    }

}