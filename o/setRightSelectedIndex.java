package o;

import java.util.concurrent.atomic.AtomicInteger;

public final class setRightSelectedIndex {
    private static final AtomicInteger setMin = new AtomicInteger(1000);

    public static int getMax() {
        return setMin.incrementAndGet();
    }
}
