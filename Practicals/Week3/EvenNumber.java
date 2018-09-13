public class EvenNumber {
    private int x;
    public static boolean isEven(int x) {
        return (x % 2 == 0);
    }
    
    public EvenNumber() {
        this.x = 0;
    }

    public EvenNumber(int x) {
        this.x = x;
    }

    public int getValue() {
        return this.x;
    }

    public EvenNumber add(EvenNumber b) {
        return new EvenNumber(this.getValue() + b.getValue());
    }

    public EvenNumber sub(EvenNumber b) {
        return new EvenNumber(this.getValue() - b.getValue());
    }

    public OddNumber add(OddNumber b) {
        return new OddNumber(this.getValue() + b.getValue());
    }

    public OddNumber sub (OddNumber b) {
        return new OddNumber(this.getValue() - b.getValue());
    }

    private int getPrimeFactor(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 0) {
            return -1;
        }
        if (x < 4) {
            return x;
        }
        for (int i = 2; i <= x; ++i) {
            if (x % i == 0) {
                return i;
            }
        }
        return -2;
    }
    private String getPrimeFactors() {
        int x = this.x;
        String primeFactors = "";
        while (getPrimeFactor(x) != x) {
            primeFactors += (getPrimeFactor(x) + ",");
            x /= getPrimeFactor(x);
        }
        primeFactors += x;
        return primeFactors;
    }
    
    @Override
    public String toString() {
        return getPrimeFactors();
    }
}
