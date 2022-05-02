package o;

import com.google.android.exoplayer2.util.Util;
import java.util.concurrent.ThreadFactory;

public final class setPopDirection implements ThreadFactory {
    private final String getMax;

    public setPopDirection(String str) {
        this.getMax = str;
    }

    public final Thread newThread(Runnable runnable) {
        return Util.lambda$newSingleThreadExecutor$0(this.getMax, runnable);
    }
}
