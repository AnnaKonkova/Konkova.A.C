import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner val = new Scanner(System.in);
        int N = val.nextInt();
        int number1 = val.nextInt();
        int number2 = val.nextInt();

        int count = 0;
        for(int i = 1; i <= N;i++){
            if(i % number1 == 0||i % number2 == 0){

                count += i;

            }

        }
        System.out.println(count);

    }
}