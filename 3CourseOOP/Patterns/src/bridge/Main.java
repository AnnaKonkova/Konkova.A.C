package bridge;

import bridge.encryptions.AESEncryption;
import bridge.encryptions.RSAEncryption;
import bridge.encryptions.SHAEncryption;
import bridge.encryptions.SymmetricEncryption;
import bridge.interfaces.EncryptionAlgorithm;

import java.util.ArrayList;
import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//        List<Encryption> se = new ArrayList<Encryption>();
//
//        se.add(new ShapeEncryption(new AESEncryption()));
//        se.add(new ShapeEncryption(new RSAEncryption()));
//        se.add(new ShapeEncryption(new SHAEncryption()));
//
//        for (Encryption renderer: se) {
//            renderer.drawShape("Circle");
//        }
//    }
//}
public class Main {
    public static void main(String[] args) {
        // Создание алгоритмов шифрования
        EncryptionAlgorithm aes = new AESEncryption();
        EncryptionAlgorithm rsa = new RSAEncryption();
        EncryptionAlgorithm sha = new SHAEncryption();

        // Создание объектов шифрования
        Encryption symmetricEncryption = new SymmetricEncryption(aes);
        Encryption asymmetricEncryption = new AsymmetricEncryption(rsa);
        Encryption hashing = new Hashing(sha);

        // Шифрование данных
        symmetricEncryption.drawShape("Hello World");
        asymmetricEncryption.drawShape("Hello World");
        hashing.drawShape("Hello World");
    }
}