import java.util.Arrays;


public class Main {
    public static void main(String[] args){
        int[] array0 = new int[] {1,3,4,25,6,0,14};
        int[] array1 = leftArray(array0);
        int[] array2 = rightArray(array0);
        System.out.println(Arrays.toString(array1) + "\n" + Arrays.toString(array2));

    }
    public static int[] leftArray(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] == Arrays.stream(array).max().getAsInt()){
                array = Arrays.copyOf(array,i);

            }

        }

        return array;

    }
    public static int[] rightArray(int[] arr){
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == Arrays.stream(arr).max().getAsInt()){
                idx = i;

            }
        }
        int[] t = Arrays.copyOfRange(arr, idx+1, arr.length);
        return t;

    }

}