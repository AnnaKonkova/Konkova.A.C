package ru.vsuet.exsel.task8;

import java.util.Arrays;

public class Colculets01 {
    public double redundancy;
    public double entrophy;
    public double middleSimvls;
    public String paired() {

        this.redundancy = 0;
        this.entrophy = 0;
        this.middleSimvls = 0;

        double[] probabilities ={0.4,0.4,0.2};
        System.out.println(Arrays.toString(probabilities) + " : Вероятности");

        double[] enamProbabilities = {0.16, 0.16, 0.08, 0.16, 0.16, 0.08, 0.08, 0.08, 0.04  };
        /*System.out.println(Arrays.toString(enamProbabilities) + " : Вероятности");*/

        for( int i = 0;i < enamProbabilities.length;i++)
            enamProbabilities[i] = -enamProbabilities[i];
        Arrays.sort(enamProbabilities);
        for (int i = 0; i < enamProbabilities.length; i++)
            enamProbabilities[i] = -enamProbabilities[i];
        System.out.println(Arrays.toString(enamProbabilities)+" - отсортированный");

        int i = 0;
        for (double s : enamProbabilities) {
            if (i < enamProbabilities.length-1) {
                i++;
            } else i = enamProbabilities.length-1;
            middleSimvls += i * s;
        }
        middleSimvls=middleSimvls/2;

        for (double s : enamProbabilities) {
            entrophy += (s * (Math.log(1 / s)) / Math.log(2));
        }
        entrophy=entrophy/2;

        redundancy = middleSimvls - entrophy;

        String print = "Попарное";

        return print;
    }
    public String characterByCharacter(){
        this.redundancy = 0;
        this.entrophy = 0;
        this.middleSimvls = 0;

        double[] probabilities = {0.4,0.4,0.2};
        /*System.out.println(Arrays.toString(probabilities) + " : Вероятности");*/

        for( int i = 0;i < probabilities.length;i++)
            probabilities[i] = -probabilities[i];
        Arrays.sort(probabilities);
        for (int i = 0; i < probabilities.length; i++)
            probabilities[i] = -probabilities[i];
        /*System.out.println(Arrays.toString(probabilities)+" - отсортированный");*/

        int i = 0;
        for (double s : probabilities) {
            if (i < probabilities.length-1) {
                i++;
            } else i = probabilities.length-1;
            middleSimvls += i * s;
        }

        for (double s : probabilities) {
            entrophy += (s * (Math.log(1 / s)) / Math.log(2));
        }

        redundancy = middleSimvls - entrophy;

        String print = "Посимвольное";

        return print;
    }
}
