package id.dana.data.qrbarcode;

public class NotWhitelistedUrlException extends Exception {
    public NotWhitelistedUrlException() {
        super("Scan result url is not whitelisted");
    }
}
