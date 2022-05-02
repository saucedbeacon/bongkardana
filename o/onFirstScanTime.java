package o;

public class onFirstScanTime<T> {
    private final String bizType;
    private final Class<T> contentType;

    public onFirstScanTime(String str, Class<T> cls) {
        this.bizType = str;
        this.contentType = cls;
    }

    public String getBizType() {
        return this.bizType;
    }

    public Class<T> getContentType() {
        return this.contentType;
    }
}
