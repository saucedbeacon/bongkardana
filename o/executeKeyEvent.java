package o;

public abstract class executeKeyEvent implements Runnable {
    private final Throwable getMax;

    public abstract void length();

    public executeKeyEvent() {
        Thread currentThread = Thread.currentThread();
        StringBuilder sb = new StringBuilder("Runnable instantiated on thread id: ");
        sb.append(currentThread.getId());
        sb.append(", name: ");
        sb.append(currentThread.getName());
        this.getMax = new Throwable(sb.toString());
    }

    public final void run() {
        try {
            length();
        } catch (Throwable th) {
            if (keyToDirection.ICustomTabsCallback$Stub) {
                Throwable th2 = th;
                while (th2.getCause() != null) {
                    th2 = th2.getCause();
                }
                th2.initCause(this.getMax);
            }
            throw th;
        }
    }
}
