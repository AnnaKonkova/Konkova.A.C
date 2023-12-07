public class Main {
    public static void main(String[] args) {
        YoursColculet yoursColculet = new YoursColculet();
        System.out.println(yoursColculet.UnconditionalEntropySource()+" - Безусловная энтропия источника");
        System.out.println(yoursColculet.UnconditionalEntropyRecipient()+" - Безусловная энтропия получателя");
        System.out.println(yoursColculet.ConditionalEntropyB()+" -Условная энтропия b");
        System.out.println(yoursColculet.ConditionalEntropyA()+" -Условная энтропия a");
        System.out.println(yoursColculet.BandwidthA()+" -Пропускная способнось  (С) a");
        System.out.println(yoursColculet.BandwidthB()+" -Пропускная способнось  (С) b");
    }
}