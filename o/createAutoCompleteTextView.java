package o;

import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

@RequiresApi(19)
@AnyThread
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class createAutoCompleteTextView {

    interface getMin {
        long getMax();

        int getMin() throws IOException;

        long setMax() throws IOException;

        void setMax(int i) throws IOException;

        int setMin() throws IOException;
    }

    static long setMax(int i) {
        return ((long) i) & 4294967295L;
    }

    static int setMin(short s) {
        return s & UShort.MAX_VALUE;
    }

    static onApplyWindowInsets getMin(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) setMax((getMin) new getMax(duplicate)).getMin);
        return onApplyWindowInsets.length(duplicate);
    }

    private static length setMax(getMin getmin) throws IOException {
        long j;
        getmin.setMax(4);
        int min = getmin.setMin();
        if (min <= 100) {
            getmin.setMax(6);
            int i = 0;
            while (true) {
                if (i >= min) {
                    j = -1;
                    break;
                }
                int min2 = getmin.getMin();
                getmin.setMax(4);
                j = getmin.setMax();
                getmin.setMax(4);
                if (1835365473 == min2) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                getmin.setMax((int) (j - getmin.getMax()));
                getmin.setMax(12);
                long max = getmin.setMax();
                for (int i2 = 0; ((long) i2) < max; i2++) {
                    int min3 = getmin.getMin();
                    long max2 = getmin.setMax();
                    long max3 = getmin.setMax();
                    if (1164798569 == min3 || 1701669481 == min3) {
                        return new length(max2 + j, max3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    static class length {
        private final long getMax;
        final long getMin;

        length(long j, long j2) {
            this.getMin = j;
            this.getMax = j2;
        }
    }

    static class getMax implements getMin {
        private final ByteBuffer getMax;

        getMax(ByteBuffer byteBuffer) {
            this.getMax = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final int setMin() throws IOException {
            return createAutoCompleteTextView.setMin(this.getMax.getShort());
        }

        public final long setMax() throws IOException {
            return createAutoCompleteTextView.setMax(this.getMax.getInt());
        }

        public final int getMin() throws IOException {
            return this.getMax.getInt();
        }

        public final void setMax(int i) throws IOException {
            ByteBuffer byteBuffer = this.getMax;
            byteBuffer.position(byteBuffer.position() + i);
        }

        public final long getMax() {
            return (long) this.getMax.position();
        }
    }
}
