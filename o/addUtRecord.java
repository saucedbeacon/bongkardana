package o;

import java.util.concurrent.atomic.AtomicInteger;

public final class addUtRecord {
    public static <T> void getMax(GriverProgressBar<? super T> griverProgressBar, T t, AtomicInteger atomicInteger, InterfacePluginInfo interfacePluginInfo) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            griverProgressBar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = interfacePluginInfo.terminate();
                if (terminate != null) {
                    griverProgressBar.onError(terminate);
                } else {
                    griverProgressBar.onComplete();
                }
            }
        }
    }
}
