package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class onApplyWindowInsets extends onNestedScroll {
    public static onApplyWindowInsets length(ByteBuffer byteBuffer) {
        onApplyWindowInsets onapplywindowinsets = new onApplyWindowInsets();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        onapplywindowinsets.getMax = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        onapplywindowinsets.setMin = byteBuffer;
        return onapplywindowinsets;
    }

    public final int setMax() {
        int min = setMin(4);
        if (min != 0) {
            return this.setMin.getInt(min + this.getMax);
        }
        return 0;
    }

    public final fitSystemWindows setMin(fitSystemWindows fitsystemwindows, int i) {
        int min = setMin(6);
        if (min != 0) {
            return fitsystemwindows.getMax(getMin(length(min) + (i * 4)), this.setMin);
        }
        return null;
    }

    public final int getMin() {
        int min = setMin(6);
        if (min != 0) {
            return setMax(min);
        }
        return 0;
    }
}
