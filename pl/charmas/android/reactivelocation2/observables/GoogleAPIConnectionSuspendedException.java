package pl.charmas.android.reactivelocation2.observables;

public class GoogleAPIConnectionSuspendedException extends RuntimeException {
    private final int cause;

    public GoogleAPIConnectionSuspendedException(int i) {
        this.cause = i;
    }

    public int getErrorCause() {
        return this.cause;
    }
}
