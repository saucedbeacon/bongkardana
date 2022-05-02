package o;

public final class decodeFileToFile extends Base64$OutputStream {
    public String getMax;
    public String setMax;

    public decodeFileToFile() {
    }

    public decodeFileToFile(String str, String str2) {
        this.getMax = str;
        this.setMax = str2;
    }

    public final void setMax(stringAscii stringascii) {
        stringascii.getMax(this);
    }

    /* access modifiers changed from: protected */
    public final String setMin() {
        StringBuilder sb = new StringBuilder("destination=");
        sb.append(this.getMax);
        sb.append(", title=");
        sb.append(this.setMax);
        return sb.toString();
    }
}
