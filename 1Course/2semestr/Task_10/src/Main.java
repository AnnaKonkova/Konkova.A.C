import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();
        String str2 = str1.toLowerCase();
        String str3 = str2.substring(0,1).toUpperCase() + str2.substring(1);
        System.out.println("Привет, " + str3 + "!");
    }

}