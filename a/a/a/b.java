package a.a.a;

public final class b extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private Throwable f8942a;

    public b(String str) {
        super(str);
    }

    public b(Throwable th) {
        super(th.getMessage());
        this.f8942a = th;
    }

    public final Throwable getCause() {
        return this.f8942a;
    }
}
