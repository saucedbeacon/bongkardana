package o;

public final class doCommand extends enableTitleSegControl implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public final /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public doCommand(Runnable runnable) {
        super(runnable);
    }

    public final void run() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            this.runner = null;
        } catch (Throwable th) {
            this.runner = null;
            lazySet(FINISHED);
            SecuritySignature.getMax(th);
        }
    }
}
