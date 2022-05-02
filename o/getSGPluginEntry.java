package o;

import id.dana.sendmoney.summary.SummaryActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class getSGPluginEntry {
    static final AtomicReference<ScheduledExecutorService> getMax = new AtomicReference<>();
    static final Map<ScheduledThreadPoolExecutor, Object> length = new ConcurrentHashMap();
    public static final int setMax;
    public static final boolean setMin;

    static {
        length length2 = new length();
        boolean max = getMax("rx2.purge-enabled", length2);
        setMin = max;
        setMax = length(max, "rx2.purge-period-seconds", length2);
        getMin();
    }

    private static void getMin() {
        if (setMin) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = getMax.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new IRouterComponent("RxSchedulerPurge"));
                    if (getMax.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        getMin getmin = new getMin();
                        int i = setMax;
                        newScheduledThreadPool.scheduleAtFixedRate(getmin, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    private static int length(boolean z, String str, RedDotDrawable<String, String> redDotDrawable) {
        if (z) {
            try {
                String apply = redDotDrawable.apply(str);
                if (apply == null) {
                    return 1;
                }
                return Integer.parseInt(apply);
            } catch (Throwable unused) {
            }
        }
        return 1;
    }

    private static boolean getMax(String str, RedDotDrawable<String, String> redDotDrawable) {
        try {
            String apply = redDotDrawable.apply(str);
            if (apply == null) {
                return true;
            }
            return SummaryActivity.CHECKED.equals(apply);
        } catch (Throwable unused) {
            return true;
        }
    }

    static final class length implements RedDotDrawable<String, String> {
        length() {
        }

        public final /* synthetic */ Object apply(Object obj) throws Exception {
            return System.getProperty((String) obj);
        }
    }

    public static ScheduledExecutorService setMax(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (setMin && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            length.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }

    static final class getMin implements Runnable {
        getMin() {
        }

        public final void run() {
            Iterator it = new ArrayList(getSGPluginEntry.length.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    getSGPluginEntry.length.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }
}
