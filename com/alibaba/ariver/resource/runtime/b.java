package com.alibaba.ariver.resource.runtime;

import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import java.nio.ByteBuffer;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static byte[] f10210a = "<!-- start path=".getBytes();
    public static byte[] b = " -->".getBytes();
    public static byte[] c = "<script>\n".getBytes();
    public static byte[] d = "\n</script>".getBytes();

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, a aVar) {
        int i;
        ByteBuffer allocate;
        boolean z;
        boolean z2;
        boolean z3;
        byte[] bArr4 = bArr2;
        byte[] bArr5 = bArr3;
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            if (!(wrap == null || bArr4 == null)) {
                if (bArr5 != null) {
                    int i2 = -1;
                    ByteBuffer byteBuffer = null;
                    int i3 = -1;
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = 0;
                    while (wrap.hasRemaining()) {
                        while (true) {
                            if (!wrap.hasRemaining()) {
                                break;
                            }
                            int length = bArr4.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= length) {
                                    z3 = true;
                                    continue;
                                    break;
                                }
                                if (wrap.get() != bArr4[i7]) {
                                    z3 = false;
                                    continue;
                                    break;
                                }
                                i7++;
                            }
                            if (z3) {
                                i4 = wrap.position() - bArr4.length;
                                break;
                            }
                        }
                        while (true) {
                            if (!wrap.hasRemaining()) {
                                break;
                            }
                            int length2 = bArr5.length;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= length2) {
                                    z2 = true;
                                    continue;
                                    break;
                                }
                                if (wrap.get() != bArr5[i8]) {
                                    z2 = false;
                                    continue;
                                    break;
                                }
                                i8++;
                            }
                            if (z2) {
                                i5 = wrap.position() - bArr5.length;
                                break;
                            }
                        }
                        while (true) {
                            if (!wrap.hasRemaining()) {
                                i = i3;
                                break;
                            }
                            int length3 = bArr5.length;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= length3) {
                                    z = true;
                                    continue;
                                    break;
                                }
                                if (wrap.get() != bArr5[i9]) {
                                    z = false;
                                    continue;
                                    break;
                                }
                                i9++;
                            }
                            if (z) {
                                i = wrap.position() - bArr5.length;
                                break;
                            }
                        }
                        if (i == i2) {
                            RVLogger.d("H5ByteBufferUtil", "replaceJsFile not find TAG in appx.js");
                            return null;
                        } else if (i3 == i) {
                            int length4 = i + bArr5.length;
                            int capacity = wrap.capacity() - length4;
                            ByteBuffer allocate2 = ByteBuffer.allocate(capacity);
                            wrap.position(length4);
                            wrap.get(allocate2.array(), 0, capacity);
                            ByteBuffer allocate3 = ByteBuffer.allocate(allocate2.capacity() + byteBuffer.capacity());
                            byteBuffer.position(0);
                            allocate3.put(byteBuffer);
                            allocate3.put(allocate2);
                            return allocate3.array();
                        } else {
                            ByteBuffer a2 = a(bArr, i4, i5, str, aVar);
                            ByteBuffer allocate4 = ByteBuffer.allocate((i4 - i6) + a2.capacity());
                            ByteBuffer a3 = a(wrap, i6, i4);
                            a3.position(0);
                            a2.position(0);
                            allocate4.put(a3);
                            allocate4.put(a2);
                            if (byteBuffer == null) {
                                allocate = ByteBuffer.allocate(allocate4.capacity());
                                allocate4.position(0);
                                allocate.put(allocate4);
                            } else {
                                allocate = ByteBuffer.allocate(byteBuffer.capacity() + allocate4.capacity());
                                byteBuffer.position(0);
                                allocate4.position(0);
                                allocate.put(byteBuffer);
                                allocate.put(allocate4);
                            }
                            byteBuffer = allocate;
                            i6 = i + b.length;
                            i3 = i;
                            i2 = -1;
                        }
                    }
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            RVLogger.e("H5ByteBufferUtil", "replaceJsFile error: ", th);
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2) {
        int position = byteBuffer.position();
        byteBuffer.position(i);
        int i3 = i2 - i;
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        byteBuffer.get(allocate.array(), 0, i3);
        byteBuffer.position(position);
        return allocate;
    }

    private static ByteBuffer a(byte[] bArr, int i, int i2, String str, a aVar) {
        byte[] bytes;
        byte[] bArr2 = f10210a;
        int length = (i2 - i) - bArr2.length;
        if (length <= 0) {
            return null;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i + bArr2.length, bArr3, 0, length);
        String str2 = new String(bArr3);
        Resource rawResource = aVar.getRawResource(new ResourceQuery(str2));
        if ((rawResource == null && (rawResource = aVar.getRawResource(new ResourceQuery(FileUtils.combinePath(str, str2)))) == null) || (bytes = rawResource.getBytes()) == null) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + c.length + d.length);
        allocate.put(c);
        allocate.put(bytes);
        allocate.put(d);
        return allocate;
    }
}
