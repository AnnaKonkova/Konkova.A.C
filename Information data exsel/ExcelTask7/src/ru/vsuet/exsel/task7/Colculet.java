package ru.vsuet.exsel.task7;
import java.util.Arrays;
public class Colculet {
    public double messageTransferRate = 4;
    public double redundancy;
    public double entrophy;
    public double middleSimvls;
    public double calculations() {
        this.messageTransferRate = messageTransferRate;
        this.redundancy = redundancy;
        this.entrophy = 0;
        this.middleSimvls = 0;

        double[] probabilities = {0.49, 0.28, 0.08, 0.07, 0.06, 0.02,};
        System.out.println(Arrays.toString(probabilities) + " : Вероятности");

        for( int i = 0;i < probabilities.length;i++)
        probabilities[i] = -probabilities[i];
        Arrays.sort(probabilities);
        for (int i = 0; i < probabilities.length; i++)
            probabilities[i] = -probabilities[i];

         int i = 0;
        for (double s : probabilities) {
            if (i < probabilities.length-1) {
                i++;
            } else i = probabilities.length-1;
            middleSimvls += i * s;
        }
            /* System.out.print(i);
            System.out.println(" " + "(" + s + ")");
            System.out.println(middleSimvls);*/

        for (double s : probabilities) {
            entrophy += (s * (Math.log(1 / s)) / Math.log(2));
        }

        redundancy = middleSimvls - entrophy;

        return middleSimvls * messageTransferRate;
    }
}
