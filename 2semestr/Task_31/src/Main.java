import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args){
        fibonacci(100);
    }
    public static void fibonacci(int n){
        if( 10 <= n && n <= 100000){

            BigInteger bigInt = BigInteger.ONE;
            BigInteger bigInt2 = BigInteger.ONE;
            BigInteger number = BigInteger.ONE;
            for (int i = 2; i < n;i++) {
                number = bigInt.add(bigInt2);
                bigInt2 = bigInt;
                bigInt = number;
            }
            System.out.println(bigInt);
            int[] intTab = String.valueOf(bigInt).chars().map(Character::getNumericValue).toArray();
            HashMap<Integer, Integer> counting = new HashMap<>();
            for(int j : intTab) {
                if (counting.containsKey(j)){
                    counting.put(j, counting.get(j) + 1);
                }else{
                    counting.put(j, 1);
                }
            }
            int maxKey = 0;
            int maxVal = 0;
            for (Map.Entry<Integer, Integer> couples : counting.entrySet()) {
                if(couples.getValue() > maxVal){
                    maxVal = couples.getValue();
                }
                if(couples.getValue() == maxVal){
                    maxKey = couples.getKey();
                }
            }
            System.out.println(maxKey + " " + maxVal);
        }
    }
}