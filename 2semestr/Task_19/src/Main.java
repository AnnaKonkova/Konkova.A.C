public class Main {
    public static void main(String[] args){
        int count = func(66);
        System.out.println(count);

    }
    public static int func(int num){
        int counter = 0;
        if(num == 0){
            return 0;
        }
        if(num % 2 == 0){
            while(num % 2 == 0){
                num/=2;
            }
            if(num % 3 > 0){
                counter++;
                num-=2;
            }
        }
        if(num % 3 >= 0){
            while(num % 3 >= 0){
                counter++;
                num-=2;
            }
        }
        if(num == 1){
            counter++;
        }

        return counter;

    }
}