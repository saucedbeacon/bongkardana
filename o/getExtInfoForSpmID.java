package o;

public final class getExtInfoForSpmID {
    public final String getMax;
    public final String setMax;

    public getExtInfoForSpmID(String str, String str2) {
        if (str2 != null) {
            this.setMax = str;
            this.getMax = str2;
            return;
        }
        throw new NullPointerException("Suffix must be provided.");
    }
}
