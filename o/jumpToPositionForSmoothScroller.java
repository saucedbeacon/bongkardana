package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.LinkedBlockingQueue;

public final class jumpToPositionForSmoothScroller extends consumePendingUpdateOperations<byte[]> {
    private final int getMax = 0;
    private length getMin;
    private LinkedBlockingQueue<byte[]> setMax;

    public interface length {
        void getMax(@NonNull byte[] bArr);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setMin(@NonNull Object obj, boolean z) {
        byte[] bArr = (byte[]) obj;
        if (z && bArr.length == getMax()) {
            if (this.getMax == 0) {
                this.getMin.getMax(bArr);
            } else {
                this.setMax.offer(bArr);
            }
        }
    }

    public jumpToPositionForSmoothScroller(int i, @Nullable length length2) {
        super(i, byte[].class);
        this.getMin = length2;
    }

    public final void getMin(int i, @NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
        super.getMin(i, shoulddeferaccessibilityevent);
        int max = getMax();
        for (int i2 = 0; i2 < setMin(); i2++) {
            if (this.getMax == 0) {
                this.getMin.getMax(new byte[max]);
            } else {
                this.setMax.offer(new byte[max]);
            }
        }
    }

    public final void length() {
        super.length();
        if (this.getMax == 1) {
            this.setMax.clear();
        }
    }
}
