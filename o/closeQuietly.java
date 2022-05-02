package o;

final class closeQuietly implements RedDotDrawable {
    private final ExecutorType length;

    public closeQuietly(ExecutorType executorType) {
        this.length = executorType;
    }

    public final Object apply(Object obj) {
        return this.length.transform((IpcMessageConstants) obj);
    }
}
