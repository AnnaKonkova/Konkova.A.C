package bridge.encryptions;

import bridge.interfaces.EncryptionAlgorithm;

public class AESEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String data) {
        // Здесь должна быть логика шифрования AES
        return "AES Encrypted Data: " + data; // Заглушка
    }
}
