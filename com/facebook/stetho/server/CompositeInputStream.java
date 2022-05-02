package com.facebook.stetho.server;

import com.facebook.stetho.common.LogUtil;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public class CompositeInputStream extends InputStream {
    private int mCurrentIndex;
    private final InputStream[] mStreams;

    public boolean markSupported() {
        return false;
    }

    public CompositeInputStream(InputStream[] inputStreamArr) {
        if (inputStreamArr == null || inputStreamArr.length < 2) {
            throw new IllegalArgumentException("Streams must be non-null and have more than 1 entry");
        }
        this.mStreams = inputStreamArr;
        this.mCurrentIndex = 0;
    }

    public int available() throws IOException {
        return this.mStreams[this.mCurrentIndex].available();
    }

    public void close() throws IOException {
        closeAll(this.mCurrentIndex);
    }

    private void closeAll(int i) throws IOException {
        IOException iOException = null;
        int i2 = 0;
        while (true) {
            InputStream[] inputStreamArr = this.mStreams;
            if (i2 < inputStreamArr.length) {
                try {
                    inputStreamArr[i2].close();
                } catch (IOException e) {
                    e = e;
                    if (!(i2 == i || iOException == null)) {
                        e = iOException;
                    }
                    if (!(iOException == null || iOException == e)) {
                        LogUtil.w((Throwable) iOException, "Suppressing exception");
                    }
                    iOException = e;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            java.io.InputStream[] r0 = r2.mStreams
            int r1 = r2.mCurrentIndex
            r0 = r0[r1]
            int r0 = r0.read(r3, r4, r5)
            r1 = -1
            if (r0 != r1) goto L_0x0013
            boolean r1 = r2.tryMoveToNextStream()
            if (r1 != 0) goto L_0x0000
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.server.CompositeInputStream.read(byte[], int, int):int");
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public int read() throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            java.io.InputStream[] r0 = r2.mStreams
            int r1 = r2.mCurrentIndex
            r0 = r0[r1]
            int r0 = r0.read()
            r1 = -1
            if (r0 != r1) goto L_0x0013
            boolean r1 = r2.tryMoveToNextStream()
            if (r1 != 0) goto L_0x0000
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.server.CompositeInputStream.read():int");
    }

    private boolean tryMoveToNextStream() {
        int i = this.mCurrentIndex;
        if (i + 1 >= this.mStreams.length) {
            return false;
        }
        this.mCurrentIndex = i + 1;
        return true;
    }

    public long skip(long j) throws IOException {
        int read = read(new byte[((int) j)]);
        if (read >= 0) {
            return (long) read;
        }
        return -1;
    }
}
