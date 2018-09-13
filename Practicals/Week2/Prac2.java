public class Prac2
{
    public static boolean isPalindrome1(String s)
    {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome2(String s) {
        if (s.length() <= 1) {
            return true;
        }
        int i = 0;
        while (s.charAt(i) == s.charAt(s.length() - i - 1)) {
            i++;
            if (i == s.length() / 2) {
                return true;
            }
        }
        return false;
    }
    public static boolean isPalindrome3(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome3(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Is " + args[i] + " a palindrome?");
                System.out.println("Test 1: " + ((isPalindrome1(args[i])) ? "Yes." : "No."));
                System.out.println("Test 2: " + ((isPalindrome2(args[i])) ? "Yes." : "No.")); 
                System.out.println("Test 3: " + ((isPalindrome3(args[i])) ? "Yes." : "No."));
            }
        }
    }
}
