package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.otaliastudios.cameraview.CameraLogger;
import java.util.concurrent.LinkedBlockingQueue;

public class ensureRightGlow<T> {
    private static final CameraLogger getMax;
    private static final String setMax;
    private getMin<T> equals;
    private int getMin;
    public LinkedBlockingQueue<T> length;
    public final Object setMin = new Object();
    private int toIntRange;

    public interface getMin<T> {
        T setMax();
    }

    static {
        String simpleName = ensureRightGlow.class.getSimpleName();
        setMax = simpleName;
        getMax = CameraLogger.setMin(simpleName);
    }

    public ensureRightGlow(int i, @NonNull getMin<T> getmin) {
        this.getMin = i;
        this.length = new LinkedBlockingQueue<>(i);
        this.equals = getmin;
    }

    public final boolean setMax() {
        boolean z;
        synchronized (this.setMin) {
            z = setMin() >= this.getMin;
        }
        return z;
    }

    @Nullable
    public final T length() {
        synchronized (this.setMin) {
            T poll = this.length.poll();
            if (poll != null) {
                this.toIntRange++;
                getMax.getMax(0, "GET - Reusing recycled item.", this);
                return poll;
            } else if (setMax()) {
                getMax.getMax(0, "GET - Returning null. Too much items requested.", this);
                return null;
            } else {
                this.toIntRange++;
                getMax.getMax(0, "GET - Creating a new item.", this);
                T max = this.equals.setMax();
                return max;
            }
        }
    }

    public final void getMin(@NonNull T t) {
        synchronized (this.setMin) {
            getMax.getMax(0, "RECYCLE - Recycling item.", this);
            int i = this.toIntRange - 1;
            this.toIntRange = i;
            if (i < 0) {
                throw new IllegalStateException("Trying to recycle an item which makes activeCount < 0. This means that this or some previous items being recycled were not coming from this pool, or some item was recycled more than once. ".concat(String.valueOf(this)));
            } else if (!this.length.offer(t)) {
                throw new IllegalStateException("Trying to recycle an item while the queue is full. This means that this or some previous items being recycled were not coming from this pool, or some item was recycled more than once. ".concat(String.valueOf(this)));
            }
        }
    }

    private int setMin() {
        int min;
        synchronized (this.setMin) {
            min = getMin() + getMax();
        }
        return min;
    }

    private int getMin() {
        int i;
        synchronized (this.setMin) {
            i = this.toIntRange;
        }
        return i;
    }

    private int getMax() {
        int size;
        synchronized (this.setMin) {
            size = this.length.size();
        }
        return size;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" - count:");
        sb.append(setMin());
        sb.append(", active:");
        sb.append(getMin());
        sb.append(", recycled:");
        sb.append(getMax());
        return sb.toString();
    }
}
