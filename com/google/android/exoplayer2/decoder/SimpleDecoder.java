package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.OutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.lang.Exception;
import java.util.ArrayDeque;

public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends OutputBuffer, E extends Exception> implements Decoder<I, O, E> {
    private int availableInputBufferCount;
    private final I[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final O[] availableOutputBuffers;
    private final Thread decodeThread;
    private I dequeuedInputBuffer;
    private E exception;
    private boolean flushed;
    private final Object lock = new Object();
    private final ArrayDeque<I> queuedInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<O> queuedOutputBuffers = new ArrayDeque<>();
    private boolean released;
    private int skippedOutputBufferCount;

    /* access modifiers changed from: protected */
    public abstract I createInputBuffer();

    /* access modifiers changed from: protected */
    public abstract O createOutputBuffer();

    /* access modifiers changed from: protected */
    public abstract E createUnexpectedDecodeException(Throwable th);

    /* access modifiers changed from: protected */
    @Nullable
    public abstract E decode(I i, O o2, boolean z);

    public SimpleDecoder(I[] iArr, O[] oArr) {
        this.availableInputBuffers = iArr;
        this.availableInputBufferCount = iArr.length;
        for (int i = 0; i < this.availableInputBufferCount; i++) {
            this.availableInputBuffers[i] = createInputBuffer();
        }
        this.availableOutputBuffers = oArr;
        this.availableOutputBufferCount = oArr.length;
        for (int i2 = 0; i2 < this.availableOutputBufferCount; i2++) {
            this.availableOutputBuffers[i2] = createOutputBuffer();
        }
        AnonymousClass1 r4 = new Thread() {
            public void run() {
                SimpleDecoder.this.run();
            }
        };
        this.decodeThread = r4;
        r4.start();
    }

    /* access modifiers changed from: protected */
    public final void setInitialInputBufferSize(int i) {
        Assertions.checkState(this.availableInputBufferCount == this.availableInputBuffers.length);
        for (I ensureSpaceForWrite : this.availableInputBuffers) {
            ensureSpaceForWrite.ensureSpaceForWrite(i);
        }
    }

    public final I dequeueInputBuffer() throws Exception {
        I i;
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkState(this.dequeuedInputBuffer == null);
            if (this.availableInputBufferCount == 0) {
                i = null;
            } else {
                I[] iArr = this.availableInputBuffers;
                int i2 = this.availableInputBufferCount - 1;
                this.availableInputBufferCount = i2;
                i = iArr[i2];
            }
            this.dequeuedInputBuffer = i;
        }
        return i;
    }

    public final void queueInputBuffer(I i) throws Exception {
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkArgument(i == this.dequeuedInputBuffer);
            this.queuedInputBuffers.addLast(i);
            maybeNotifyDecodeLoop();
            this.dequeuedInputBuffer = null;
        }
    }

    public final O dequeueOutputBuffer() throws Exception {
        synchronized (this.lock) {
            maybeThrowException();
            if (this.queuedOutputBuffers.isEmpty()) {
                return null;
            }
            O o2 = (OutputBuffer) this.queuedOutputBuffers.removeFirst();
            return o2;
        }
    }

    public void releaseOutputBuffer(O o2) {
        synchronized (this.lock) {
            releaseOutputBufferInternal(o2);
            maybeNotifyDecodeLoop();
        }
    }

    public final void flush() {
        synchronized (this.lock) {
            this.flushed = true;
            this.skippedOutputBufferCount = 0;
            if (this.dequeuedInputBuffer != null) {
                releaseInputBufferInternal(this.dequeuedInputBuffer);
                this.dequeuedInputBuffer = null;
            }
            while (!this.queuedInputBuffers.isEmpty()) {
                releaseInputBufferInternal((DecoderInputBuffer) this.queuedInputBuffers.removeFirst());
            }
            while (!this.queuedOutputBuffers.isEmpty()) {
                ((OutputBuffer) this.queuedOutputBuffers.removeFirst()).release();
            }
        }
    }

    public void release() {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private void maybeThrowException() throws Exception {
        E e = this.exception;
        if (e != null) {
            throw e;
        }
    }

    private void maybeNotifyDecodeLoop() {
        if (canDecodeBuffer()) {
            this.lock.notify();
        }
    }

    /* access modifiers changed from: private */
    public void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (decode());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.isEndOfStream() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.addFlag(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.isDecodeOnly() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.addFlag(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6.exception = decode(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        r6.exception = createUnexpectedDecodeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r6.exception = createUnexpectedDecodeException(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean decode() throws java.lang.InterruptedException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.lock
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.released     // Catch:{ all -> 0x0093 }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.canDecodeBuffer()     // Catch:{ all -> 0x0093 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.lock     // Catch:{ all -> 0x0093 }
            r1.wait()     // Catch:{ all -> 0x0093 }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.released     // Catch:{ all -> 0x0093 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            return r2
        L_0x001a:
            java.util.ArrayDeque<I> r1 = r6.queuedInputBuffers     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0093 }
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = (com.google.android.exoplayer2.decoder.DecoderInputBuffer) r1     // Catch:{ all -> 0x0093 }
            O[] r3 = r6.availableOutputBuffers     // Catch:{ all -> 0x0093 }
            int r4 = r6.availableOutputBufferCount     // Catch:{ all -> 0x0093 }
            r5 = 1
            int r4 = r4 - r5
            r6.availableOutputBufferCount = r4     // Catch:{ all -> 0x0093 }
            r3 = r3[r4]     // Catch:{ all -> 0x0093 }
            boolean r4 = r6.flushed     // Catch:{ all -> 0x0093 }
            r6.flushed = r2     // Catch:{ all -> 0x0093 }
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            boolean r0 = r1.isEndOfStream()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.addFlag(r0)
            goto L_0x0066
        L_0x003c:
            boolean r0 = r1.isDecodeOnly()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.addFlag(r0)
        L_0x0047:
            java.lang.Exception r0 = r6.decode(r1, r3, r4)     // Catch:{ RuntimeException -> 0x0056, OutOfMemoryError -> 0x004e }
            r6.exception = r0     // Catch:{ RuntimeException -> 0x0056, OutOfMemoryError -> 0x004e }
            goto L_0x005d
        L_0x004e:
            r0 = move-exception
            java.lang.Exception r0 = r6.createUnexpectedDecodeException(r0)
            r6.exception = r0
            goto L_0x005d
        L_0x0056:
            r0 = move-exception
            java.lang.Exception r0 = r6.createUnexpectedDecodeException(r0)
            r6.exception = r0
        L_0x005d:
            E r0 = r6.exception
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r6.lock
            monitor-enter(r0)
            monitor-exit(r0)
            return r2
        L_0x0066:
            java.lang.Object r0 = r6.lock
            monitor-enter(r0)
            boolean r4 = r6.flushed     // Catch:{ all -> 0x0090 }
            if (r4 == 0) goto L_0x0071
            r3.release()     // Catch:{ all -> 0x0090 }
            goto L_0x008b
        L_0x0071:
            boolean r4 = r3.isDecodeOnly()     // Catch:{ all -> 0x0090 }
            if (r4 == 0) goto L_0x0080
            int r2 = r6.skippedOutputBufferCount     // Catch:{ all -> 0x0090 }
            int r2 = r2 + r5
            r6.skippedOutputBufferCount = r2     // Catch:{ all -> 0x0090 }
            r3.release()     // Catch:{ all -> 0x0090 }
            goto L_0x008b
        L_0x0080:
            int r4 = r6.skippedOutputBufferCount     // Catch:{ all -> 0x0090 }
            r3.skippedOutputBufferCount = r4     // Catch:{ all -> 0x0090 }
            r6.skippedOutputBufferCount = r2     // Catch:{ all -> 0x0090 }
            java.util.ArrayDeque<O> r2 = r6.queuedOutputBuffers     // Catch:{ all -> 0x0090 }
            r2.addLast(r3)     // Catch:{ all -> 0x0090 }
        L_0x008b:
            r6.releaseInputBufferInternal(r1)     // Catch:{ all -> 0x0090 }
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return r5
        L_0x0090:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0093:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0097
        L_0x0096:
            throw r1
        L_0x0097:
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.decoder.SimpleDecoder.decode():boolean");
    }

    private boolean canDecodeBuffer() {
        return !this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0;
    }

    private void releaseInputBufferInternal(I i) {
        i.clear();
        I[] iArr = this.availableInputBuffers;
        int i2 = this.availableInputBufferCount;
        this.availableInputBufferCount = i2 + 1;
        iArr[i2] = i;
    }

    private void releaseOutputBufferInternal(O o2) {
        o2.clear();
        O[] oArr = this.availableOutputBuffers;
        int i = this.availableOutputBufferCount;
        this.availableOutputBufferCount = i + 1;
        oArr[i] = o2;
    }
}
