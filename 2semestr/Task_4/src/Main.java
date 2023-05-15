public class Main {
    public static void main(String[] args){
        int count = str_count("Hello", 'o');
        int count1 = str_count("Hello", 'l');
        int count2 = str_count("", 'z');
        System.out.println(count + "\n" + count1 + "\n" + count2);
    }
    public static int str_count(String str, char letter){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char w = str.charAt(i);
            if(w == letter) {
                count++;
            }
        }
        return count;
    }
}