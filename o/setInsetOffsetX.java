package o;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class setInsetOffsetX extends FilterInputStream {
    private final long getMin;
    private int length;

    public setInsetOffsetX(@NonNull InputStream inputStream, long j) {
        super(inputStream);
        this.getMin = j;
    }

    public final synchronized int available() throws IOException {
        return (int) Math.max(this.getMin - ((long) this.length), (long) this.in.available());
    }

    public final synchronized int read() throws IOException {
        int read;
        read = super.read();
        length(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return length(super.read(bArr, i, i2));
    }

    private int length(int i) throws IOException {
        if (i >= 0) {
            this.length += i;
        } else if (this.getMin - ((long) this.length) > 0) {
            StringBuilder sb = new StringBuilder("Failed to read all expected data, expected: ");
            sb.append(this.getMin);
            sb.append(", but read: ");
            sb.append(this.length);
            throw new IOException(sb.toString());
        }
        return i;
    }
}
