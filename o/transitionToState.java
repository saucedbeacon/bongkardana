package o;

public final class transitionToState extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    transitionToState(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
