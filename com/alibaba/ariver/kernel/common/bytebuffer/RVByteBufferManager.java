package com.alibaba.ariver.kernel.common.bytebuffer;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class RVByteBufferManager {
    public static void releaseAllBuffer() {
        try {
            for (ByteBuffer a2 : RVByteBufferPool.sBufferPool) {
                a(a2);
            }
            RVByteBufferPool.sBufferPool.clear();
        } catch (Throwable th) {
            RVLogger.e("AriverKernel:RVByteBufferManager", "releaseAllBuffer: ", th);
        }
    }

    private static void a(ByteBuffer byteBuffer) {
        try {
            Method method = byteBuffer.getClass().getMethod("cleaner", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(byteBuffer, new Object[0]);
            Method method2 = invoke.getClass().getMethod("clean", new Class[0]);
            method2.setAccessible(true);
            method2.invoke(invoke, new Object[0]);
        } catch (Throwable th) {
            RVLogger.e("AriverKernel:RVByteBufferManager", "releaseBuffer: ", th);
        }
    }
}
