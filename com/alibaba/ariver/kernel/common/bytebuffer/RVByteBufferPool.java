package com.alibaba.ariver.kernel.common.bytebuffer;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class RVByteBufferPool {
    static List<ByteBuffer> sBufferPool = new CopyOnWriteArrayList();

    RVByteBufferPool() {
    }

    public static ByteBuffer get(byte[] bArr, int i) {
        if (bArr == null) {
            RVLogger.w("AriverKernel:RVByteBufferPool", "get, data is null");
            return null;
        } else if (i <= 0 || i > 5242880) {
            RVLogger.w("AriverKernel:RVByteBufferPool", "length is smaller than zero or too large: ".concat(String.valueOf(i)));
            return null;
        } else {
            ByteBuffer a2 = a(i);
            a(a2, bArr);
            return a2;
        }
    }

    private static void a(ByteBuffer byteBuffer, byte[] bArr) {
        try {
            byteBuffer.clear();
            byteBuffer.put(bArr);
            byteBuffer.flip();
        } catch (Throwable th) {
            RVLogger.e("AriverKernel:RVByteBufferPool", "fillData: ", th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = b(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.nio.ByteBuffer a(int r2) {
        /*
            java.util.List<java.nio.ByteBuffer> r0 = sBufferPool
            int r0 = r0.size()
            r1 = 16
            if (r0 < r1) goto L_0x0010
            java.nio.ByteBuffer r0 = b(r2)
            if (r0 != 0) goto L_0x0014
        L_0x0010:
            java.nio.ByteBuffer r0 = c(r2)
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.bytebuffer.RVByteBufferPool.a(int):java.nio.ByteBuffer");
    }

    private static ByteBuffer b(int i) {
        for (ByteBuffer next : sBufferPool) {
            if (next != null && !next.hasRemaining() && next.capacity() >= i) {
                return next;
            }
        }
        return null;
    }

    private static ByteBuffer c(int i) {
        try {
            return ByteBuffer.allocateDirect(i);
        } catch (Throwable th) {
            RVLogger.e("AriverKernel:RVByteBufferPool", "allocateBuffer: ", th);
            return null;
        }
    }
}
