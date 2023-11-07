
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("\"C:\\Users\\Anik\\Desktop\\У-224\\KonkovaA.C\\2semestr\\38.txt\"");
        Scanner sc = new Scanner(file);
        String text_file = "";
        while (sc.hasNextLine()) {
            text_file += sc.nextLine();
        }
        String[] array = text_file.split(" ");
        String[] str1;
        for(int i = 0; i < array.length; i++){

            str1 = array[i].split("");
            array[i] += (str1[0] + "ауч");
            array[i] = array[i].substring(1);
        }
        for (String j: array){
            System.out.print(j + " ");
        }
    }
}