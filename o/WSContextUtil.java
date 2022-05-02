package o;

public final class WSContextUtil extends Base64$OutputStream {
    public String getMin;

    public WSContextUtil() {
    }

    public WSContextUtil(String str) {
        this.getMin = str;
    }

    public final void setMax(stringAscii stringascii) {
        stringascii.setMax(this);
    }

    /* access modifiers changed from: protected */
    public final String setMin() {
        StringBuilder sb = new StringBuilder("literal=");
        sb.append(this.getMin);
        return sb.toString();
    }
}
