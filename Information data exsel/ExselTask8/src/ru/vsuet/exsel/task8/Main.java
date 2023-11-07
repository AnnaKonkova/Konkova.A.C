package ru.vsuet.exsel.task8;
public class Main {
    public static void main(String[] args) {

        Colculets01 colculets01 =new Colculets01();

        System.out.println(colculets01.paired());
        System.out.println(colculets01.middleSimvls + "- (Lсредн)");
        System.out.println(colculets01.entrophy + " - Энтропия(H(A))");
        System.out.println(colculets01.redundancy + " - Избыточность(R(A))");

        System.out.println(colculets01.characterByCharacter());
        System.out.println(colculets01.middleSimvls + "- (Lсредн)");
        System.out.println(colculets01.entrophy + " - Энтропия(H(A))");
        System.out.println(colculets01.redundancy + " - Избыточность(R(A))");


      /*  Colculets colculets =new Colculets();
        *//*System.out.println(colculets.paired());*//*
        System.out.println(colculets.toString());*/
    }
}