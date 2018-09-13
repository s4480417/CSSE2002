public class OddNumber {
    private int x;

    public static boolean isOdd(int x) {
        return (x % 2 == 1);
    }

    public OddNumber() {
        this.x = 1;
    }

    public OddNumber(int x) {
        this.x = x;
    }

    public int getValue() {
        return this.x;
    }

    public EvenNumber add(OddNumber b) {
        return new EvenNumber(this.getValue() + b.getValue());
    }

    public EvenNumber sub(OddNumber b) {
        return new EvenNumber(this.getValue() - b.getValue());
    }

    public OddNumber add(EvenNumber b) {
        return new OddNumber(this.getValue() + b.getValue());
    }

    public OddNumber sub(EvenNumber b) {
        return new OddNumber(this.getValue() - b.getValue());
    }
}

