
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] list;
        String str;
        String[] strnew;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        strnew = str.split(" ");
        list = new int[strnew.length];
        int y = 0;
        for (int i = 0; i < strnew.length; i++){

            list[i] =  Integer.parseInt(strnew[i]);
            int t = list[i] * list[i];
            y += t;
        }
        System.out.println(y);
    }
}