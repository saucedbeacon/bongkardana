package o;

import java.io.Closeable;
import java.io.IOException;

public abstract class setPreventCornerOverlap implements Closeable {
    public abstract long getMax();

    public abstract put getMin();

    public abstract getMaxCardElevation setMax();

    /* JADX INFO: finally extract failed */
    public final byte[] length() {
        long max = getMax();
        if (max <= 2147483647L) {
            put min = getMin();
            try {
                byte[] FastBitmap$CoordinateSystem = min.FastBitmap$CoordinateSystem();
                CustomTabsIntent$ShareState.setMin((Closeable) min);
                if (max == -1 || max == ((long) FastBitmap$CoordinateSystem.length)) {
                    return FastBitmap$CoordinateSystem;
                }
                throw new IOException("Content-Length and stream length disagree");
            } catch (Throwable th) {
                CustomTabsIntent$ShareState.setMin((Closeable) min);
                throw th;
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(max)));
        }
    }

    public void close() {
        CustomTabsIntent$ShareState.setMin((Closeable) getMin());
    }
}
