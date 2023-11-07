
public class Main {
    public static void main(String[] args) {
        String palindrom = palindromeString("aabbac");
        System.out.println(palindrom + "\n" + palindrom.length());
    }
    public static String palindrome(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
    public static String palindromeString(String str) {
        String longest = str.substring(0, 1);
        for (int i = 0; i < str.length() - 1; i++) {
            if (palindrome(str, i, i).length() > longest.length()) {
                longest = palindrome(str, i, i);
            }
            if (palindrome(str, i, i + 1).length() > longest.length()) {
                longest = palindrome(str, i, i + 1);
            }
        }
        return longest;

    }
}