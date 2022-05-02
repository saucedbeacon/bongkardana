package o;

import java.nio.ByteBuffer;

public final class fitSystemWindows extends onNestedScroll {
    public final int length() {
        int min = setMin(4);
        if (min != 0) {
            return this.setMin.getInt(min + this.getMax);
        }
        return 0;
    }

    public final boolean getMax() {
        int min = setMin(6);
        if (min == 0 || this.setMin.get(min + this.getMax) == 0) {
            return false;
        }
        return true;
    }

    public final short setMax() {
        int min = setMin(8);
        if (min != 0) {
            return this.setMin.getShort(min + this.getMax);
        }
        return 0;
    }

    public final short getMin() {
        int min = setMin(12);
        if (min != 0) {
            return this.setMin.getShort(min + this.getMax);
        }
        return 0;
    }

    public final short setMin() {
        int min = setMin(14);
        if (min != 0) {
            return this.setMin.getShort(min + this.getMax);
        }
        return 0;
    }

    public final int getMax(int i) {
        int min = setMin(16);
        if (min != 0) {
            return this.setMin.getInt(length(min) + (i * 4));
        }
        return 0;
    }

    public final int isInside() {
        int min = setMin(16);
        if (min != 0) {
            return setMax(min);
        }
        return 0;
    }

    public final fitSystemWindows getMax(int i, ByteBuffer byteBuffer) {
        this.getMax = i;
        this.setMin = byteBuffer;
        return this;
    }
}
