public class Tute2
{
    public static String num(int x) {
        switch (x) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "??";
        }
    }
    public static int Fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return Fib(n - 1) + Fib(n - 2);
        }
    }
    public static long A(short m, short n) {
        if (m == 0) {
            return (long)(n + 1);
        } else if (m > 0 && n == 0) {
            return (long)(A((short)(m - 1), (short)1));   
        } else if (m > 0 && n > 0) {
            return (long)((short)A((short)(m - 1), (short)A(m, (short)(n - 1))));
        } else {
            return -1;
        } 
    }
}
