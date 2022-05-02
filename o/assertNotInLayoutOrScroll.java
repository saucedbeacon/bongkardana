package o;

public final class assertNotInLayoutOrScroll extends Exception {
    private static final long serialVersionUID = 4858739193395706341L;

    public assertNotInLayoutOrScroll(String str) {
        super(str);
    }

    public assertNotInLayoutOrScroll(String str, Throwable th) {
        super(str, th);
    }
}
