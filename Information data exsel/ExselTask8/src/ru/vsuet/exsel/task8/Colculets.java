package ru.vsuet.exsel.task8;
import java.util.Arrays;
import java.util.Collections;

public class Colculets {
    public double redundancy;
    public double entrophy;
    public double middleSimvls;

    static double[] probabilities ={0.4,0.4,0.2};
    double[]massiv=new double[0];
    private static double[] addElement(double[] massiv, double newElement) {
        double[] array = new double [massiv.length + 1];
        System.arraycopy(massiv, 0, array, 0, massiv.length);
        array[massiv.length] = newElement;
        return array;
    }
    public double paired(){

        for (double i = 0; i< probabilities.length; i++){
            for (double j = 0; i< probabilities.length; i++){
                addElement(massiv,probabilities[(int) i]*probabilities[(int) j]);
                System.out.println(massiv[(int) j]+" first");
            }
        }

        for (double i = 0; i < probabilities.length ; i++) {
            for (double j= 0; j < probabilities.length ; j++) {
                double element = probabilities[(int) i] * probabilities[(int) j];
                System.out.println(massiv[(int) element]+"second");
            }
        }
        System.out.println(Arrays.toString(Colculets.probabilities));

        return 0;
    }

    public String toString(){
        StringBuilder builer = new StringBuilder();
        for (double i = 0; i < probabilities.length ; i++) {
            for (double j= 0; j < probabilities.length ; j++) {
                double element = probabilities[(int) i] * probabilities[(int) j];
                builer.append(element).append("  ");
            }
        }
        /*Collections.reverse(Collections.singletonList(builer));*/
        Collections.reverse(Collections.singletonList(builer));
       /* return new String(builer);
       * */
        return builer.toString();
    }

    public double characterByCharacter(){

        return 0;
    }
}