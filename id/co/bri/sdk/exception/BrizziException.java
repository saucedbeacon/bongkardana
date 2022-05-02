package id.co.bri.sdk.exception;

public class BrizziException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private String f11081a;

    public BrizziException() {
    }

    public BrizziException(String str, String str2) {
        super(str2);
        this.f11081a = str;
    }

    public String getErrorCode() {
        return this.f11081a;
    }
}
