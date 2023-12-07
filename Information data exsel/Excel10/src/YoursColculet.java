public class YoursColculet {
    //The unconditional entropy of the source - Безусловная энтропия источника
    //The unconditional entropy of the recipient   Безусловная энтропия получателя
    //Conditional entropy -Условная энтропия b
    //Conditional entropy -Условная энтропия a
    //bandwidth - Пропускная способнось  (С) a
    //bandwidth -Пропускная способнось  (С) b
    private double unconditionalEntropySource=0;
    private double unconditionalEntropyRecipient=0;
    private double conditionalEntropyB;
    private double conditionalEntropyA ;
    double[] probabilitiesA = {0.4,0.3,0.08,0.22};
    double[] probabilitiesB = {0.379,0.3136,0.0936,0.2138};
    private final double[][] matrixPerehod ={{0.94,0.03,0.02,0.01},{0.01,0.99,0,0},{0,0.03,0.96,0.01},{0,0.01,0.04,0.95}};

    public double UnconditionalEntropySource(){
        for (double v : probabilitiesA) {
            unconditionalEntropySource += (v * (Math.log(1 / v)) / Math.log(2));
        }
        return unconditionalEntropySource;
    }
    public double UnconditionalEntropyRecipient(){
        for (double v : probabilitiesB) {
            unconditionalEntropyRecipient += (v * (Math.log(1 / v)) / Math.log(2));
        }
        return unconditionalEntropyRecipient;
    }
    public double ConditionalEntropyB(){
        double matrixUslovn=0.000000001;
        double summ=0;
        int sizA=0;
        int sizB=0;
        double summProbabil=0;
        for (int i = 0; i < matrixPerehod.length; i++) {
            for (int j = 0; j < matrixPerehod.length; j++) {
                if ( matrixPerehod[j][i]!=0){
                    matrixUslovn=matrixPerehod[j][i]*probabilitiesA[sizA]/probabilitiesB[sizB];
                    summProbabil+=matrixUslovn * (Math.log(1 / matrixUslovn) / Math.log(2));
                }
                else {
                    sizA++;
                    continue;
                }
                sizA++;
            }
            summ = summProbabil * probabilitiesB[sizB];
            conditionalEntropyB += summ;
            sizB++;
            sizA=0;
            summProbabil=0;
        }
        return conditionalEntropyB;
    }

    public double ConditionalEntropyA(){
        double summ=0;
        int sizA=0;
        int sizB=0;
        double summProbabil=0;
        for (int i = 0; i < matrixPerehod.length; i++) {
            for (int j = 0; j < matrixPerehod.length; j++) {
              if (matrixPerehod[i][j]!=0){
                    summProbabil += matrixPerehod[i][j] * (Math.log(1 / matrixPerehod[i][j]) / Math.log(2));
                }
                sizA++;

            }
            summ = summProbabil * probabilitiesA[sizB];
            conditionalEntropyA += summ;
            summProbabil=0;
            sizA=0;
            sizB++;
        }
        return conditionalEntropyA;
    }

    public double BandwidthA(){
        return 100 * (unconditionalEntropySource - conditionalEntropyB);
    }
    public double BandwidthB(){
        return (unconditionalEntropyRecipient - conditionalEntropyA) * 100;
    }

}
