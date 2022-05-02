package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

@GwtIncompatible
final class ReaderInputStream extends InputStream {
    private ByteBuffer byteBuffer;
    private CharBuffer charBuffer;
    private boolean doneFlushing;
    private boolean draining;
    private final CharsetEncoder encoder;
    private boolean endOfInput;
    private final Reader reader;
    private final byte[] singleByte;

    ReaderInputStream(Reader reader2, Charset charset, int i) {
        this(reader2, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), i);
    }

    ReaderInputStream(Reader reader2, CharsetEncoder charsetEncoder, int i) {
        boolean z = true;
        this.singleByte = new byte[1];
        this.reader = (Reader) Preconditions.checkNotNull(reader2);
        this.encoder = (CharsetEncoder) Preconditions.checkNotNull(charsetEncoder);
        Preconditions.checkArgument(i <= 0 ? false : z, "bufferSize must be positive: %s", i);
        charsetEncoder.reset();
        CharBuffer allocate = CharBuffer.allocate(i);
        this.charBuffer = allocate;
        allocate.flip();
        this.byteBuffer = ByteBuffer.allocate(i);
    }

    public final void close() throws IOException {
        this.reader.close();
    }

    public final int read() throws IOException {
        if (read(this.singleByte) == 1) {
            return UnsignedBytes.toInt(this.singleByte[0]);
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r9, int r10, int r11) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r10 + r11
            int r1 = r9.length
            com.google.common.base.Preconditions.checkPositionIndexes(r10, r0, r1)
            r0 = 0
            if (r11 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r1 = r8.endOfInput
            r2 = 0
        L_0x000d:
            boolean r3 = r8.draining
            r4 = 1
            if (r3 == 0) goto L_0x002f
            int r3 = r10 + r2
            int r5 = r11 - r2
            int r3 = r8.drain(r9, r3, r5)
            int r2 = r2 + r3
            if (r2 == r11) goto L_0x002a
            boolean r3 = r8.doneFlushing
            if (r3 == 0) goto L_0x0022
            goto L_0x002a
        L_0x0022:
            r8.draining = r0
            java.nio.ByteBuffer r3 = r8.byteBuffer
            r3.clear()
            goto L_0x002f
        L_0x002a:
            if (r2 <= 0) goto L_0x002d
            return r2
        L_0x002d:
            r9 = -1
            return r9
        L_0x002f:
            boolean r3 = r8.doneFlushing
            if (r3 == 0) goto L_0x0036
            java.nio.charset.CoderResult r3 = java.nio.charset.CoderResult.UNDERFLOW
            goto L_0x004d
        L_0x0036:
            if (r1 == 0) goto L_0x0041
            java.nio.charset.CharsetEncoder r3 = r8.encoder
            java.nio.ByteBuffer r5 = r8.byteBuffer
            java.nio.charset.CoderResult r3 = r3.flush(r5)
            goto L_0x004d
        L_0x0041:
            java.nio.charset.CharsetEncoder r3 = r8.encoder
            java.nio.CharBuffer r5 = r8.charBuffer
            java.nio.ByteBuffer r6 = r8.byteBuffer
            boolean r7 = r8.endOfInput
            java.nio.charset.CoderResult r3 = r3.encode(r5, r6, r7)
        L_0x004d:
            boolean r5 = r3.isOverflow()
            if (r5 == 0) goto L_0x0057
            r8.startDraining(r4)
            goto L_0x000d
        L_0x0057:
            boolean r5 = r3.isUnderflow()
            if (r5 == 0) goto L_0x006f
            if (r1 == 0) goto L_0x0065
            r8.doneFlushing = r4
            r8.startDraining(r0)
            goto L_0x000d
        L_0x0065:
            boolean r3 = r8.endOfInput
            if (r3 == 0) goto L_0x006b
            r1 = 1
            goto L_0x002f
        L_0x006b:
            r8.readMoreChars()
            goto L_0x002f
        L_0x006f:
            boolean r5 = r3.isError()
            if (r5 == 0) goto L_0x002f
            r3.throwException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.ReaderInputStream.read(byte[], int, int):int");
    }

    private static CharBuffer grow(CharBuffer charBuffer2) {
        CharBuffer wrap = CharBuffer.wrap(Arrays.copyOf(charBuffer2.array(), charBuffer2.capacity() * 2));
        wrap.position(charBuffer2.position());
        wrap.limit(charBuffer2.limit());
        return wrap;
    }

    private void readMoreChars() throws IOException {
        if (availableCapacity(this.charBuffer) == 0) {
            if (this.charBuffer.position() > 0) {
                this.charBuffer.compact().flip();
            } else {
                this.charBuffer = grow(this.charBuffer);
            }
        }
        int limit = this.charBuffer.limit();
        int read = this.reader.read(this.charBuffer.array(), limit, availableCapacity(this.charBuffer));
        if (read == -1) {
            this.endOfInput = true;
        } else {
            this.charBuffer.limit(limit + read);
        }
    }

    private static int availableCapacity(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    private void startDraining(boolean z) {
        this.byteBuffer.flip();
        if (!z || this.byteBuffer.remaining() != 0) {
            this.draining = true;
        } else {
            this.byteBuffer = ByteBuffer.allocate(this.byteBuffer.capacity() * 2);
        }
    }

    private int drain(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.byteBuffer.remaining());
        this.byteBuffer.get(bArr, i, min);
        return min;
    }
}
