package o;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class offsetChildByInset extends InputStream {
    private static final Queue<offsetChildByInset> getMin = getDependents.length(0);
    public IOException length;
    private InputStream setMin;

    @NonNull
    public static offsetChildByInset setMax(@NonNull InputStream inputStream) {
        offsetChildByInset poll;
        synchronized (getMin) {
            poll = getMin.poll();
        }
        if (poll == null) {
            poll = new offsetChildByInset();
        }
        poll.setMin = inputStream;
        return poll;
    }

    offsetChildByInset() {
    }

    public final int available() throws IOException {
        return this.setMin.available();
    }

    public final void close() throws IOException {
        this.setMin.close();
    }

    public final void mark(int i) {
        this.setMin.mark(i);
    }

    public final boolean markSupported() {
        return this.setMin.markSupported();
    }

    public final int read(byte[] bArr) {
        try {
            return this.setMin.read(bArr);
        } catch (IOException e) {
            this.length = e;
            return -1;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.setMin.read(bArr, i, i2);
        } catch (IOException e) {
            this.length = e;
            return -1;
        }
    }

    public final synchronized void reset() throws IOException {
        this.setMin.reset();
    }

    public final long skip(long j) {
        try {
            return this.setMin.skip(j);
        } catch (IOException e) {
            this.length = e;
            return 0;
        }
    }

    public final int read() {
        try {
            return this.setMin.read();
        } catch (IOException e) {
            this.length = e;
            return -1;
        }
    }

    public final void setMax() {
        this.length = null;
        this.setMin = null;
        synchronized (getMin) {
            getMin.offer(this);
        }
    }
}
