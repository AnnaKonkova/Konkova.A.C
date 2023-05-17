package Task35Caesar;

public class CipherCaesar {
    public String caesar(String str, int step) {
        StringBuilder text = new StringBuilder(str.length());
        char lastChar = 'я';
        char firstChar = 'а';
        char letter;
        int countlettersAlfabet = (lastChar - firstChar) + 1;
        for (int i = 0; i < str.length(); i++) {
            letter = str.charAt(i);
            if(Character.isLetter(str.charAt(i))) {
                letter += step % countlettersAlfabet;
                if (letter > lastChar){
                    letter = (char)(letter % lastChar + firstChar - 1);
                }
                if (letter < firstChar){
                    letter = (char)(letter + countlettersAlfabet);
                }
            }
            text.append(letter);
        }
        return text.toString();
    }
}
