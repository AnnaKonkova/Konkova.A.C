
public class Main {
    public static void main(String[] args){
        boolean count = number(101);
        System.out.println(count);

    }
    public static boolean number(int x){
        int i = 2;
        while (x % i != 0){
            i++;
        }
        if (i == x){
            return true;
        }
        return false;
    }
}