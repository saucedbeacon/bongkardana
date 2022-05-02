package o;

import android.os.Build;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

public final class dispatchChildDetached {
    private static final AtomicInteger getMin = new AtomicInteger(1);

    public static int getMax() {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            i = getMin.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!getMin.compareAndSet(i, i2));
        return i;
    }
}
