package ru.vsuet.exsel.task7;
public class Main {
    public static void main(String[] args) {
        Colculet colculet = new Colculet();

        System.out.println(colculet.calculations() +" - Пропускная способность(Сэффект)");
        System.out.println(colculet.middleSimvls + "- (Lсредн)");
        System.out.println(colculet.entrophy + " - Энтропия(H(A))");
        System.out.println(colculet.redundancy + " - Избыточность(R(A))");
        System.out.println(colculet.messageTransferRate + "- Скорость передвачи сообщения(n)");
    }
}