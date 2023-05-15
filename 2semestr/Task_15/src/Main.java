import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args){

        String str1 = line("abc abc ab abc ab acs acs");
        System.out.println(str1);


    }
    public static String line(String str1){
        String str="";
        String[] arr=str1.split(" ");

        LinkedHashSet<String> spisok = new LinkedHashSet<String>();
        for (int i = 0; i < arr.length; i++) {
            spisok.add(arr[i]);
        }
        for(String s:spisok){
            str=str+s+" ";
        }

        return str;

    }



}