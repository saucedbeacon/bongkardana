package o;

public class setDownloadListener {
    private boolean expiryDefault;
    private int expiryNumber;
    private String expiryUnit;

    public boolean isExpiryDefault() {
        return this.expiryDefault;
    }

    public void setExpiryDefault(boolean z) {
        this.expiryDefault = z;
    }

    public int getExpiryNumber() {
        return this.expiryNumber;
    }

    public void setExpiryNumber(int i) {
        this.expiryNumber = i;
    }

    public String getExpiryUnit() {
        return this.expiryUnit;
    }

    public void setExpiryUnit(String str) {
        this.expiryUnit = str;
    }
}
