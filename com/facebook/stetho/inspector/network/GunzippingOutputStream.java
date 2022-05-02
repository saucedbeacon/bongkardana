package com.facebook.stetho.inspector.network;

import com.facebook.stetho.common.Util;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.zip.GZIPInputStream;

class GunzippingOutputStream extends FilterOutputStream {
    private static final ExecutorService sExecutor = Executors.newCachedThreadPool();
    private final Future<Void> mCopyFuture;

    public static GunzippingOutputStream create(OutputStream outputStream) throws IOException {
        PipedInputStream pipedInputStream = new PipedInputStream();
        return new GunzippingOutputStream(new PipedOutputStream(pipedInputStream), sExecutor.submit(new GunzippingCallable(pipedInputStream, outputStream)));
    }

    private GunzippingOutputStream(OutputStream outputStream, Future<Void> future) throws IOException {
        super(outputStream);
        this.mCopyFuture = future;
    }

    public void close() throws IOException {
        try {
            super.close();
            try {
            } catch (IOException e) {
                throw e;
            }
        } finally {
            try {
                getAndRethrow(this.mCopyFuture);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:0|1|2) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r0.getCause();
        com.facebook.stetho.common.ExceptionUtil.propagateIfInstanceOf(r0, java.io.IOException.class);
        com.facebook.stetho.common.ExceptionUtil.propagate(r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:4:0x0006, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T getAndRethrow(java.util.concurrent.Future<T> r2) throws java.io.IOException {
        /*
        L_0x0000:
            java.lang.Object r2 = r2.get()     // Catch:{ InterruptedException -> 0x0000, ExecutionException -> 0x0005 }
            return r2
        L_0x0005:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Class<java.io.IOException> r1 = java.io.IOException.class
            com.facebook.stetho.common.ExceptionUtil.propagateIfInstanceOf(r0, r1)
            com.facebook.stetho.common.ExceptionUtil.propagate(r0)
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.inspector.network.GunzippingOutputStream.getAndRethrow(java.util.concurrent.Future):java.lang.Object");
    }

    static class GunzippingCallable implements Callable<Void> {
        private final InputStream mIn;
        private final OutputStream mOut;

        public GunzippingCallable(InputStream inputStream, OutputStream outputStream) {
            this.mIn = inputStream;
            this.mOut = outputStream;
        }

        /* JADX INFO: finally extract failed */
        public Void call() throws IOException {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(this.mIn);
            try {
                Util.copy(gZIPInputStream, this.mOut, new byte[1024]);
                gZIPInputStream.close();
                this.mOut.close();
                return null;
            } catch (Throwable th) {
                gZIPInputStream.close();
                this.mOut.close();
                throw th;
            }
        }
    }
}
