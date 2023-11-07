import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers: the beginning of the row, the step");
        int numb1 = s.nextInt();
        int numb2 = s.nextInt();
        int numb3 = s.nextInt();
        int sum = 0;

        while(sum < numb3)
        {
            System.out.println(numb1);
            sum++;
            numb1 += numb2;
        }
    }
}