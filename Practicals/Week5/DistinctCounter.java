import java.util.*;

public class DistinctCounter
{
    private String[] strings;
    private int distinctCount;
    public void add(String s) {
        for (int i = 0; i < distinctCount; i++) {
            if (s.equals(strings[i])) {
                return;
            }
        }
        strings[distinctCount++] = s;
    }
    public int getDistinctCount() {
        return distinctCount;
    }

    public String[] getStrings() {
        String[] strings = this.strings;
        Arrays.sort(strings, 0, distinctCount);
        return strings;

    }
    public DistinctCounter() {
        strings = new String[256];
        distinctCount = 0;
    }
    public static void main(String[] args) {
        DistinctCounter dc = new DistinctCounter();
        dc.add("Z");
        dc.add("Hello");
        dc.add("Z");
        dc.add("Hello ");
        System.out.println(dc.getDistinctCount());
        for (int i = 0; i < dc.getDistinctCount(); i++) {
            System.out.println(dc.getStrings()[i]);
        }
    }
}
