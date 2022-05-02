package o;

public class onConnectedSuccessful<T> {
    public final String bizType;
    public final T content;
    private final String syncKey;

    public onConnectedSuccessful(String str, String str2, T t) {
        this.bizType = str;
        this.syncKey = str2;
        this.content = t;
    }

    public String getSyncKey() {
        return this.syncKey;
    }
}
