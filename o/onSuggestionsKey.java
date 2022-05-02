package o;

public final class onSuggestionsKey {
    private static String setMax = "\r";
    public final float getMax;
    private final String length;
    public final float setMin;

    public onSuggestionsKey(String str, float f, float f2) {
        this.length = str;
        this.setMin = f2;
        this.getMax = f;
    }

    public final boolean length(String str) {
        if (this.length.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.length.endsWith(setMax)) {
            String str2 = this.length;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
