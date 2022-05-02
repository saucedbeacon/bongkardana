package com.alibaba.ariver.kernel.common.bytebuffer;

import java.nio.ByteBuffer;

public class RVByteBufferHelper {
    public static ByteBuffer wrap(byte[] bArr, int i) {
        return RVByteBufferPool.get(bArr, i);
    }
}
