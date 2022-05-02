package o;

public abstract class CustomTabsIntent$ColorScheme implements Runnable {
    protected final String getMin;

    /* access modifiers changed from: protected */
    public abstract void getMax();

    public CustomTabsIntent$ColorScheme(String str, Object... objArr) {
        this.getMin = CustomTabsIntent$ShareState.getMin(str, objArr);
    }

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.getMin);
        try {
            getMax();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
