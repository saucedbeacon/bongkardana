package o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class IRouterComponent extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final boolean nonBlocking;
    final String prefix;
    final int priority;

    public IRouterComponent(String str) {
        this(str, 5, false);
    }

    public IRouterComponent(String str, int i) {
        this(str, i, false);
    }

    public IRouterComponent(String str, int i, boolean z) {
        this.prefix = str;
        this.priority = i;
        this.nonBlocking = z;
    }

    public final Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder(this.prefix);
        sb.append('-');
        sb.append(incrementAndGet());
        String obj = sb.toString();
        Thread getmax = this.nonBlocking ? new getMax(runnable, obj) : new Thread(runnable, obj);
        getmax.setPriority(this.priority);
        getmax.setDaemon(true);
        return getmax;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RxThreadFactory[");
        sb.append(this.prefix);
        sb.append("]");
        return sb.toString();
    }

    static final class getMax extends Thread implements ISGPluginInfo {
        getMax(Runnable runnable, String str) {
            super(runnable, str);
        }
    }
}
