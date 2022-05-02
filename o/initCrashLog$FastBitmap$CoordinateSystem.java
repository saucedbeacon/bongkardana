package o;

import java.io.IOException;
import javax.annotation.Nullable;
import o.LogContextImpl;

final class initCrashLog$FastBitmap$CoordinateSystem<T> extends initCrashLog<T> {
    private final boolean length;
    private final LogContextImpl.AnonymousClass2<T, String> setMin;

    initCrashLog$FastBitmap$CoordinateSystem(LogContextImpl.AnonymousClass2<T, String> r1, boolean z) {
        this.setMin = r1;
        this.length = z;
    }

    /* access modifiers changed from: package-private */
    public final void getMin(getTraceLogger gettracelogger, @Nullable T t) throws IOException {
        if (t != null) {
            gettracelogger.getMin(this.setMin.getMax(t), (String) null, this.length);
        }
    }
}
