import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int numb1 = s.nextInt();
        int numb2 = s.nextInt();
        if(numb1 < numb2){
            while(numb1 <= numb2){
                System.out.println(numb1*numb1);
                numb1++;
            }
        }
        if(numb2 < numb1){
            while(numb2 <= numb1){
                System.out.println(numb2*numb2);
                numb2++;
            }
        }
    }
}
