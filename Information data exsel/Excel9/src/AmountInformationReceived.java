public class AmountInformationReceived {
    //General conditional entropy - Энтропия главная
    //Entropy of received messages   -Энтропия принятых сообщений
    //Entropy of unification -Энтропия объеденения
    //Information loss -информационные потери при передаче 500 символов
    //D information
    //Amount information received -Количество принятой информации
private double generalEntropy=0;
private double receivedMessagesEntropy=0;
private double unificationEntropy;
private double lossInformation ;
private double dI;
private double amountInformationReceived ;
    public double getGeneralEntropy() {
        return generalEntropy;
    }

    public double getReceivedMessagesEntropy() {
        return receivedMessagesEntropy;
    }

    public double getUnificationEntropy() {
        return unificationEntropy;
    }
    public double getLossInformation() {return lossInformation;}
    public double getAmountInformationReceived() {return amountInformationReceived;}

    double[] probabilities = {0.19,0.26,0.31,0.24};
    private double[][]matrix={{1.47,0.02,0.01,0},{0.03,1.46,0,1},{0,0.01,1.49,0},{0,0.02,0,1.48}};

    public double FindingVariables(){
        int siz=0;
        double promColculet=0;
        for (double[] i : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if(i[j]!=0){
                    promColculet += (i[j] * (Math.log(1 / i[j])) / Math.log(2));
                   /* System.out.print(promColculet);
                    System.out.println("------"+i[j]);*/
                }
            }
            generalEntropy+= promColculet * probabilities[siz];
            siz++;
            promColculet=0;
        }
        return generalEntropy;
    }
    public double ReceivedMessagesEntropy(){
        int siz=0;
        double summ=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 0) {
                    siz++;
                    continue;
                } else {
                    summ += probabilities[siz] * matrix[j][i];
          /*          System.out.println(probabilities[siz]+" * "+ matrix[j][i]);*/
                }
                siz++;
            }
            siz=0;
         /*   System.out.println(summ+" = summ+ log ="+log);*/
            receivedMessagesEntropy+= summ * (Math.log(1 / summ) / Math.log(2)) ;
            /*System.out.println(receivedMessagesEntropy+" -Энтропия принятых сообщений");*/
            summ=0;
        }
        return receivedMessagesEntropy;
    }
    public class test{
        public boolean isSomeValue() {
            return someValue;
        }
        public boolean someValue;
    }
    public double UnificationEntropy(){
        double log=0;
        int siz=0;
        double summ=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 0) {
                    siz++;
                    continue;
                } else {
                    summ =( probabilities[siz] * matrix[j][i]);
                    log=summ* (Math.log(1 / summ) / Math.log(2));
           /*          System.out.println(probabilities[siz]+" * "+ matrix[j][i]+" = "+summ +"    ----   "+log);*/
                    unificationEntropy+= log;
                }
                siz++;
            }
            siz=0;
/*            System.out.println(unificationEntropy);*/
        }
        return unificationEntropy;
    }
    public double LossInformation(){
        lossInformation=unificationEntropy-receivedMessagesEntropy;
        return lossInformation;
    }
    public double DI(){
        dI=lossInformation*500;
        return dI;
    }
    public double AmountInformationReceived(){
        amountInformationReceived=receivedMessagesEntropy*500-dI;
        return amountInformationReceived;
    }
}
