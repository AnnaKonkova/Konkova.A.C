import java.util.*;

public class Main {
    private static final Deque<Integer> indexes = new LinkedList<>();
    private static final List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] ts = {58, 57, 56, 55, 50};
        int num = 163;
        int summ = choose_best_sum(num,3, ts);
        if(Collections.min(list) < num){
            System.out.println(summ);
        }
    }
    public static int choose_best_sum(int num, int expectedSize, int[] arr) {
        int summ = 0;
        if (indexes.size() == expectedSize) {
            for (Integer i : indexes) {
                summ +=arr[i];
            }
            if(num <= summ) {
                summ = num;
                list.add(summ);
            }
            list.add(summ);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!indexes.contains(i)) {
                indexes.addLast(i);
                choose_best_sum(num, expectedSize,arr);
                indexes.removeLast();
            }
        }
        return Collections.max(list);
    }
}