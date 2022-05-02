package id.dana.data.referraltracker;

public class ReferredUserFalseException extends Exception {
    public ReferredUserFalseException() {
        super("AMCS Value for referred user is false");
    }
}
