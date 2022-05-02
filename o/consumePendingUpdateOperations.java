package o;

import android.graphics.ImageFormat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.otaliastudios.cameraview.CameraLogger;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class consumePendingUpdateOperations<T> {
    private static final String getMax;
    protected static final CameraLogger length;
    private LinkedBlockingQueue<nestedScrollByInternal> IsOverlapping;
    private shouldDeferAccessibilityEvent equals = null;
    private final int getMin;
    private int setMax = -1;
    final Class<T> setMin;
    private int toFloatRange = -1;

    /* access modifiers changed from: protected */
    public abstract void setMin(@NonNull T t, boolean z);

    static {
        String simpleName = consumePendingUpdateOperations.class.getSimpleName();
        getMax = simpleName;
        length = CameraLogger.setMin(simpleName);
    }

    protected consumePendingUpdateOperations(int i, @NonNull Class<T> cls) {
        this.getMin = i;
        this.setMin = cls;
        this.IsOverlapping = new LinkedBlockingQueue<>(this.getMin);
    }

    public final int setMin() {
        return this.getMin;
    }

    public final int getMax() {
        return this.setMax;
    }

    public void getMin(int i, @NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
        setMax();
        this.equals = shoulddeferaccessibilityevent;
        this.toFloatRange = i;
        double bitsPerPixel = (double) ((long) (shoulddeferaccessibilityevent.getMin * shoulddeferaccessibilityevent.getMax * ImageFormat.getBitsPerPixel(i)));
        Double.isNaN(bitsPerPixel);
        this.setMax = (int) Math.ceil(bitsPerPixel / 8.0d);
        for (int i2 = 0; i2 < this.getMin; i2++) {
            this.IsOverlapping.offer(new nestedScrollByInternal(this));
        }
    }

    private boolean setMax() {
        return this.equals != null;
    }

    @Nullable
    public final nestedScrollByInternal setMax(@NonNull T t, long j, int i) {
        if (setMax()) {
            nestedScrollByInternal poll = this.IsOverlapping.poll();
            if (poll != null) {
                length.length("getFrame for time:", Long.valueOf(j), "RECYCLING.");
                shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = this.equals;
                int i2 = this.toFloatRange;
                poll.length = t;
                poll.setMax = j;
                poll.getMin = j;
                poll.getMax = i;
                poll.setMin = shoulddeferaccessibilityevent;
                poll.equals = i2;
                return poll;
            }
            length.setMax("getFrame for time:", Long.valueOf(j), "NOT AVAILABLE.");
            setMin(t, false);
            return null;
        }
        throw new IllegalStateException("Can't call getFrame() after releasing or before setUp.");
    }

    /* access modifiers changed from: package-private */
    public final void length(@NonNull nestedScrollByInternal nestedscrollbyinternal, @NonNull T t) {
        if (setMax()) {
            setMin(t, this.IsOverlapping.offer(nestedscrollbyinternal));
        }
    }

    public void length() {
        if (!setMax()) {
            length.getMax(2, "release called twice. Ignoring.");
            return;
        }
        length.getMax(1, "release: Clearing the frame and buffer queue.");
        this.IsOverlapping.clear();
        this.setMax = -1;
        this.equals = null;
        this.toFloatRange = -1;
    }
}
