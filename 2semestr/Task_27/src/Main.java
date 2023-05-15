import java.util.Scanner;

public class Main {
    private static final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static char symbol_right(char symbol, int indent){
        return alphabet.charAt((alphabet.indexOf(symbol)+indent) % alphabet.length());
    }
    private static char symbol_left(char symbol, int indent){
        if (alphabet.indexOf(symbol)-indent < 0){
            return alphabet.charAt(alphabet.length() + (alphabet.indexOf(symbol) - indent));
        } else {
            return alphabet.charAt(alphabet.indexOf(symbol)-indent);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scan.nextLine();
        System.out.println("Введите направление сдвига(left или right):");
        String direction = scan.nextLine();
        int num = scan.nextInt();
        char str1 = ' ';
        for (int j = 0; j < str.length(); j++) {
            for(int i=0;i < num+1;i++) {
                if (direction.equals("left")){
                    str1 = symbol_left(str.charAt(j), i);

                }
                if (direction.equals("right")){
                    str1 = symbol_right(str.charAt(j), i);

                }

            }
            System.out.print(str1);

        }

    }


}