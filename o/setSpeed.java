package o;

public abstract class setSpeed<T, R> {
    /* access modifiers changed from: protected */
    public abstract R map(T t);

    public R apply(T t) {
        return map(t);
    }
}
