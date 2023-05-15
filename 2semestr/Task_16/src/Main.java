import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();
        String[] str2 = str1.split("");
        int y = 0;
        for(int i = 0; i <  str2.length;i++){
            if(str2[i].equals(str2[i].toUpperCase())) {
                y++;
            }
            if(y > str2.length - y) {
                str1 = str1.toUpperCase();

            } else {
                str1 = str1.toLowerCase();
            }


        }
        System.out.println(str1);



    }
}