package o;

public final class ConcaveUtils implements checkOppoConcave {
    public final String getMax() {
        return "Text cannot use descending sequence number";
    }

    public final boolean getMax(String str) {
        int i = 1;
        while (i < str.length()) {
            int numericValue = Character.getNumericValue(str.charAt(i));
            int i2 = i - 1;
            if (numericValue != Character.getNumericValue(str.charAt(i2)) - 1) {
                return true;
            }
            i = i2 + 1 + 1;
        }
        return false;
    }
}
