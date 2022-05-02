package o;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public abstract class NotSendableException implements Closeable {
    @Nullable
    public Reader length;

    public abstract schedule getMax();

    @Nullable
    public abstract translateRegularFrame getMin();

    public abstract long setMax();

    public final String length() throws IOException {
        schedule max = getMax();
        try {
            translateRegularFrame min = getMin();
            return max.setMin(initCloseCode.getMax(max, min != null ? min.setMin(initCloseCode.setMax) : initCloseCode.setMax));
        } finally {
            initCloseCode.getMin((Closeable) max);
        }
    }

    public void close() {
        initCloseCode.getMin((Closeable) getMax());
    }

    public static NotSendableException getMin(byte[] bArr) {
        submitLazy submitlazy = new submitLazy();
        if (bArr != null) {
            final submitLazy min = submitlazy.length(bArr, 0, bArr.length);
            final long length2 = (long) bArr.length;
            return new NotSendableException() {
                @Nullable
                public final translateRegularFrame getMin() {
                    return translateRegularFrame.this;
                }

                public final long setMax() {
                    return length2;
                }

                public final schedule getMax() {
                    return min;
                }
            };
        }
        throw new IllegalArgumentException("source == null");
    }

    public static NotSendableException getMin(@Nullable final translateRegularFrame translateregularframe, final long j, final schedule schedule) {
        return new NotSendableException() {
            @Nullable
            public final translateRegularFrame getMin() {
                return translateRegularFrame.this;
            }

            public final long setMax() {
                return length2;
            }

            public final schedule getMax() {
                return min;
            }
        };
    }

    public static final class getMax extends Reader {
        @Nullable
        private Reader getMin;
        private final schedule length;
        private final Charset setMax;
        private boolean setMin;

        public getMax(schedule schedule, Charset charset) {
            this.length = schedule;
            this.setMax = charset;
        }

        public final int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.setMin) {
                Reader reader = this.getMin;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.length.setMin(), initCloseCode.getMax(this.length, this.setMax));
                    this.getMin = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }

        public final void close() throws IOException {
            this.setMin = true;
            Reader reader = this.getMin;
            if (reader != null) {
                reader.close();
            } else {
                this.length.close();
            }
        }
    }
}
