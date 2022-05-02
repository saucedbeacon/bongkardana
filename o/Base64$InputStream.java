package o;

public final class Base64$InputStream extends Base64$OutputStream {
    private String getMax;
    public String getMin;

    public Base64$InputStream() {
    }

    public Base64$InputStream(String str, String str2) {
        this.getMin = str;
        this.getMax = str2;
    }

    public final void setMax(stringAscii stringascii) {
        stringascii.setMax(this);
    }

    /* access modifiers changed from: protected */
    public final String setMin() {
        StringBuilder sb = new StringBuilder("destination=");
        sb.append(this.getMin);
        sb.append(", title=");
        sb.append(this.getMax);
        return sb.toString();
    }
}
