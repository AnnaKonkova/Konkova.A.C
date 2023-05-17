import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Integer> list = new ArrayList();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextInt();
        if (0 < number && number < 100000) {
            for (int i = 1; i < number; i++) {
                list.add((int) Math.pow(i, 2));
            }
        }
        System.out.println(differenceVal(number));
    }

    public static String differenceVal(double num){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) - list.get(j) == num) {
                    return (int) num + "=" + list.get(i) + "-" + list.get(j);
                }
            }
        }
        return null;
    }
}