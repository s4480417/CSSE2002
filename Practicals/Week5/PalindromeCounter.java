public class PalindromeCounter extends DistinctCounter
{
    private int palindromeCount;
    private String[] palindromes;
    private String[] nonPalindromes;
    public int getPalindromeCount() {
           return palindromeCount;
    }
    @Override
    public void add(String s) {
        super.add(s);
        if (isPalindrome(s)) {
            palindromes[palindromeCount++] = s;
        } else {
            nonPalindromes[getDistinctCount() - palindromeCount - 1] = s;
        }
    }
    private boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }
    public PalindromeCounter() {
        super();
        palindromes = new String[256];
        nonPalindromes = new String[256];
    }
    public String[] getPalindromes() {
        return palindromes;
    }
    public String[] getNonPalindromes() {
        return nonPalindromes;
    }
    public static void main(String[] args) {
        PalindromeCounter pc = new PalindromeCounter();
        for (int i = 0; i < args.length; i++) {
            pc.add(args[i]);
        }
        System.out.println("Number of Distinct Strings: " + pc.getDistinctCount());
        System.out.println("Number of Palindromes: " + pc.getPalindromeCount());
        System.out.println("Number of Non-palindromes: " + (pc.getDistinctCount() - pc.getPalindromeCount()));
        System.out.println("Palindromes: ");
        for (int i = 0; i < pc.getPalindromeCount(); i++) {
            System.out.println(" - " + pc.getPalindromes()[i]);
        }
        System.out.println("Non-palindromes: ");
        for (int i = 0; i < pc.getDistinctCount() - pc.getPalindromeCount(); i++) {
            System.out.println(" - " + pc.getNonPalindromes()[i]);
        }
    }
}
