package id.dana.data.qrbarcode;

public class ScanSelfException extends Exception {
    public ScanSelfException() {
        super("Sender and Receiver of DANA should be different account");
    }
}
