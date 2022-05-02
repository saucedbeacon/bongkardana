package o;

public abstract class InvalidFrameException implements Runnable {
    protected final String getMax;

    /* access modifiers changed from: protected */
    public abstract void getMin();

    public InvalidFrameException(String str, Object... objArr) {
        this.getMax = initCloseCode.length(str, objArr);
    }

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.getMax);
        try {
            getMin();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
