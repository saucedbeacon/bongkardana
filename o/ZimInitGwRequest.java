package o;

public final class ZimInitGwRequest {
    int getMax;
    String getMin;
    int setMax;

    public ZimInitGwRequest() {
    }

    public ZimInitGwRequest(String str) {
        this.getMin = str;
        this.setMax = 0;
        this.getMax = str.length();
    }

    public ZimInitGwRequest(String str, int i, int i2) {
        this.getMin = str;
        this.setMax = i;
        this.getMax = i2;
    }

    public final String toString() {
        String str = this.getMin;
        if (str == null) {
            return "";
        }
        int i = this.setMax;
        return str.substring(i, this.getMax + i);
    }
}
