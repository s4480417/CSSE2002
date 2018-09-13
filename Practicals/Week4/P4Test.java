import java.io.FileNotFoundException;
import java.util.Random;

public class P4Test
{
    private static void makeException(int i) {
        switch (i) {
            case 0:
                try {
                    throw new NullPointerException();
                } catch (NullPointerException e) {
                }
                break;
            case 1:
                try {
                    throw new ArrayIndexOutOfBoundsException();
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                }
                break;
            case 2:
                System.out.println("No problems");
                break;
            case 4:
                try {
                    throw new FileNotFoundException();
                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }
                break;
            default:
                try {
                    throw new UnknownExceptionException();
                } catch (UnknownExceptionException e) {
                    System.out.println(e);
                }
                break;
        }
    }
    private static void f() {
        makeException(0);
        makeException(2);
        makeException(4);
        makeException(2);
    }

    public static void main(String[] args) {
        f();
        /*
        Random r = new Random();
        for (int i = 0; i < 5; ++i) {
            h(r);
        }
        */
    }
}
