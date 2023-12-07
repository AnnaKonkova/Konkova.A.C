public class Main {
    public static void main(String[] args) {
        AmountInformationReceived amountInformationReceived=new AmountInformationReceived();
        System.out.println(amountInformationReceived.FindingVariables()+" - Энтропия главная");
        System.out.println(amountInformationReceived.ReceivedMessagesEntropy()+" - Энтропия принятых сообщений ");
        System.out.println(amountInformationReceived.UnificationEntropy()+" - Энтропия объеденения ");
        System.out.println(amountInformationReceived.LossInformation()+" -Информационные потери при передаче 500 символов ");
        System.out.println(amountInformationReceived.DI()+" D(I) ");
        System.out.println(amountInformationReceived.AmountInformationReceived()+" -Количество принятой информации ");

    }
}