package o;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class performClickableSpanAction extends ThreadPoolExecutor {
    public performClickableSpanAction(int i, int i2, int i3) {
        super(i, i2, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(), new getAccessibilityNodeProvider(i3));
    }
}
