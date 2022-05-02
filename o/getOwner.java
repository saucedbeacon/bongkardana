package o;

public class getOwner {
    private String errorCode;
    private boolean success;
    public String url;

    public getOwner(String str) {
        this.url = str;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public boolean isSuccess() {
        return this.success;
    }
}
