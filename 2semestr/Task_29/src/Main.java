import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String number1 = scan.nextLine();
        int intNumberFirst = Integer.parseInt(number1.trim());
        int number2 = scan.nextInt() - 1;
        int amount = 0;
        String[] nums = number1.split("");
        for(int i = 0; i < nums.length; i++){
            number2++;
            int n = Integer.parseInt(nums[i].trim ());
            amount += Math.pow(n,number2);
        }
        if(amount % intNumberFirst == 0){

            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}