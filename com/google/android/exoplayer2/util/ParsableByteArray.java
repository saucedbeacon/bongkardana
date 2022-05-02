package com.google.android.exoplayer2.util;

import android.graphics.PixelFormat;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import kotlin.text.Typography;

public final class ParsableByteArray {
    private static int getMin = 1;
    private static char[] length = {'*', 'T', 'M', '9', '2'};
    private static int setMax;
    public byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    public ParsableByteArray(int i) {
        this.data = new byte[i];
        this.limit = i;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
    }

    public final void reset(int i) {
        byte[] bArr;
        int i2;
        if ((capacity() < i ? '@' : '6') != '6') {
            bArr = new byte[i];
            try {
                i2 = setMax + 3;
                try {
                    getMin = i2 % 128;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            bArr = this.data;
            i2 = setMax + 5;
            getMin = i2 % 128;
        }
        int i3 = i2 % 2;
        reset(bArr, i);
    }

    public final void reset(byte[] bArr, int i) {
        int i2 = getMin + 65;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.data = bArr;
            this.limit = i;
            this.position = 0;
            int i4 = getMin + 121;
            setMax = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void reset() {
        try {
            int i = setMax + 37;
            getMin = i % 128;
            if ((i % 2 == 0 ? 'S' : '_') != 'S') {
                this.position = 0;
                this.limit = 0;
                return;
            }
            this.position = 0;
            try {
                this.limit = 1;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final int bytesLeft() {
        int i = setMax + 5;
        getMin = i % 128;
        int i2 = i % 2;
        int i3 = this.limit - this.position;
        int i4 = setMax + 77;
        getMin = i4 % 128;
        if ((i4 % 2 == 0 ? ' ' : '`') != ' ') {
            return i3;
        }
        int i5 = 45 / 0;
        return i3;
    }

    public final int limit() {
        int i;
        int i2 = getMin + 69;
        setMax = i2 % 128;
        if (!(i2 % 2 == 0)) {
            i = this.limit;
            Object obj = null;
            super.hashCode();
        } else {
            i = this.limit;
        }
        int i3 = setMax + 107;
        getMin = i3 % 128;
        int i4 = i3 % 2;
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r5 <= r4.data.length) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r5 <= r2) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setLimit(int r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 < 0) goto L_0x0006
            r2 = 1
            goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            if (r2 == r1) goto L_0x000a
            goto L_0x002d
        L_0x000a:
            int r2 = getMin
            int r2 = r2 + 111
            int r3 = r2 % 128
            setMax = r3
            int r2 = r2 % 2
            r3 = 66
            if (r2 == 0) goto L_0x001b
            r2 = 66
            goto L_0x001c
        L_0x001b:
            r2 = 3
        L_0x001c:
            if (r2 == r3) goto L_0x0024
            byte[] r2 = r4.data
            int r2 = r2.length
            if (r5 > r2) goto L_0x002d
            goto L_0x002b
        L_0x0024:
            byte[] r2 = r4.data
            int r2 = r2.length
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x003d }
            if (r5 > r2) goto L_0x002d
        L_0x002b:
            r0 = 1
            goto L_0x0037
        L_0x002d:
            int r1 = setMax
            int r1 = r1 + 9
            int r2 = r1 % 128
            getMin = r2
            int r1 = r1 % 2
        L_0x0037:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r4.limit = r5
            return
        L_0x003d:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.ParsableByteArray.setLimit(int):void");
    }

    public final int getPosition() {
        try {
            int i = setMax + 105;
            getMin = i % 128;
            if ((i % 2 == 0 ? 14 : 'T') != 14) {
                try {
                    return this.position;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                int i2 = this.position;
                Object obj = null;
                super.hashCode();
                return i2;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final int capacity() {
        int i;
        int i2 = setMax + 1;
        getMin = i2 % 128;
        Object[] objArr = null;
        if (!(i2 % 2 == 0)) {
            i = this.data.length;
        } else {
            i = this.data.length;
            int length2 = objArr.length;
        }
        int i3 = getMin + 51;
        setMax = i3 % 128;
        if ((i3 % 2 != 0 ? 'T' : ']') == ']') {
            return i;
        }
        super.hashCode();
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if ((r5 <= r4.limit ? 9 : '=') != '=') goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        if ((r5 <= r4.limit ? 28 : 'S') != 28) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setPosition(int r5) {
        /*
            r4 = this;
            int r0 = setMax     // Catch:{ Exception -> 0x0055 }
            int r0 = r0 + 89
            int r1 = r0 % 128
            getMin = r1     // Catch:{ Exception -> 0x0055 }
            int r0 = r0 % 2
            r0 = 97
            r1 = 28
            if (r5 < 0) goto L_0x0013
            r2 = 97
            goto L_0x0015
        L_0x0013:
            r2 = 28
        L_0x0015:
            r3 = 0
            if (r2 == r0) goto L_0x0019
            goto L_0x004f
        L_0x0019:
            int r0 = setMax
            int r0 = r0 + 35
            int r2 = r0 % 128
            getMin = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0038
            int r0 = r4.limit     // Catch:{ Exception -> 0x0055 }
            r1 = 12
            int r1 = r1 / r3
            r1 = 61
            if (r5 > r0) goto L_0x0031
            r0 = 9
            goto L_0x0033
        L_0x0031:
            r0 = 61
        L_0x0033:
            if (r0 == r1) goto L_0x004f
            goto L_0x0044
        L_0x0036:
            r5 = move-exception
            throw r5
        L_0x0038:
            int r0 = r4.limit
            if (r5 > r0) goto L_0x003f
            r0 = 28
            goto L_0x0041
        L_0x003f:
            r0 = 83
        L_0x0041:
            if (r0 == r1) goto L_0x0044
            goto L_0x004f
        L_0x0044:
            r3 = 1
            int r0 = getMin
            int r0 = r0 + 27
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
        L_0x004f:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r3)
            r4.position = r5
            return
        L_0x0055:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.ParsableByteArray.setPosition(int):void");
    }

    public final void skipBytes(int i) {
        try {
            int i2 = setMax + 55;
            getMin = i2 % 128;
            if ((i2 % 2 == 0 ? 'V' : 31) != 31) {
                setPosition(this.position / i);
            } else {
                setPosition(this.position + i);
            }
            int i3 = getMin + 47;
            setMax = i3 % 128;
            if ((i3 % 2 != 0 ? '(' : Typography.dollar) == '(') {
                Object[] objArr = null;
                int length2 = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public final void readBytes(ParsableBitArray parsableBitArray, int i) {
        int i2 = getMin + 3;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        try {
            readBytes(parsableBitArray.data, 0, i);
            parsableBitArray.setPosition(0);
            int i4 = setMax + 15;
            getMin = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void readBytes(byte[] bArr, int i, int i2) {
        int i3 = getMin + 99;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        System.arraycopy(this.data, this.position, bArr, i, i2);
        this.position += i2;
        int i5 = setMax + 43;
        getMin = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r5 != r0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r5 != r0) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void readBytes(java.nio.ByteBuffer r4, int r5) {
        /*
            r3 = this;
            int r0 = getMin
            int r0 = r0 + 13
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 52
            if (r0 == 0) goto L_0x0011
            r0 = 52
            goto L_0x0013
        L_0x0011:
            r0 = 14
        L_0x0013:
            if (r0 == r1) goto L_0x001e
            int r0 = o.dispatchOnCancelled.setMax(r5)     // Catch:{ Exception -> 0x001c }
            if (r5 == r0) goto L_0x0043
            goto L_0x0028
        L_0x001c:
            r4 = move-exception
            goto L_0x0042
        L_0x001e:
            int r0 = o.dispatchOnCancelled.setMax(r5)     // Catch:{ Exception -> 0x0052 }
            r1 = 0
            super.hashCode()     // Catch:{ all -> 0x0050 }
            if (r5 == r0) goto L_0x0043
        L_0x0028:
            o.onCanceled r1 = new o.onCanceled
            r2 = 1
            r1.<init>(r5, r0, r2)
            r0 = -1662537903(0xffffffff9ce7af51, float:-1.5331616E-21)
            o.onCancelLoad.setMax(r0, r1)     // Catch:{ Exception -> 0x001c }
            o.onCancelLoad.getMin(r0, r1)     // Catch:{ Exception -> 0x0052 }
            int r0 = getMin
            int r0 = r0 + 3
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            goto L_0x0043
        L_0x0042:
            throw r4
        L_0x0043:
            byte[] r0 = r3.data
            int r1 = r3.position
            r4.put(r0, r1, r5)
            int r4 = r3.position
            int r4 = r4 + r5
            r3.position = r4
            return
        L_0x0050:
            r4 = move-exception
            throw r4
        L_0x0052:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.ParsableByteArray.readBytes(java.nio.ByteBuffer, int):void");
    }

    public final int peekUnsignedByte() {
        int i = setMax + 27;
        getMin = i % 128;
        int i2 = i % 2;
        byte b = this.data[this.position] & 255;
        int i3 = getMin + 47;
        setMax = i3 % 128;
        if (i3 % 2 == 0) {
            return b;
        }
        Object obj = null;
        super.hashCode();
        return b;
    }

    public final char peekChar() {
        try {
            int i = getMin + 67;
            setMax = i % 128;
            int i2 = i % 2;
            byte[] bArr = this.data;
            int i3 = this.position;
            char c = (char) ((bArr[i3 + 1] & 255) | ((bArr[i3] & 255) << 8));
            try {
                int i4 = getMin + 23;
                setMax = i4 % 128;
                int i5 = i4 % 2;
                return c;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final int readUnsignedByte() {
        int i = getMin + 27;
        setMax = i % 128;
        if (i % 2 == 0) {
            try {
                byte[] bArr = this.data;
                try {
                    int i2 = this.position;
                    this.position = i2 + 1;
                    return bArr[i2] & 255;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            byte[] bArr2 = this.data;
            int i3 = this.position;
            this.position = i3 % 1;
            return bArr2[i3] & 7821;
        }
    }

    public final int readUnsignedShort() {
        int i = getMin + 65;
        setMax = i % 128;
        if (i % 2 == 0) {
            byte[] bArr = this.data;
            int i2 = this.position;
            int i3 = i2 + 1;
            this.position = i3;
            this.position = i3 + 1;
            return (bArr[i3] & 255) | ((bArr[i2] & 255) << 8);
        }
        byte[] bArr2 = this.data;
        int i4 = this.position;
        int i5 = i4 % 1;
        this.position = i5;
        this.position = i5 / 1;
        return (bArr2[i5] | 15850) ^ ((bArr2[i4] ^ 3472) >>> 103);
    }

    public final int readLittleEndianUnsignedShort() {
        try {
            int i = setMax + 79;
            getMin = i % 128;
            if ((i % 2 == 0 ? 'H' : 'B') != 'B') {
                try {
                    byte[] bArr = this.data;
                    int i2 = this.position;
                    int i3 = i2 + 0;
                    this.position = i3;
                    byte b = bArr[i2] | Ascii.ACK;
                    byte[] bArr2 = this.data;
                    this.position = i3 >> 1;
                    return b | ((bArr2[i3] & 2547) >> 13);
                } catch (Exception e) {
                    throw e;
                }
            } else {
                byte[] bArr3 = this.data;
                int i4 = this.position;
                int i5 = i4 + 1;
                this.position = i5;
                this.position = i5 + 1;
                return ((bArr3[i5] & 255) << 8) | (bArr3[i4] & 255);
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final short readShort() {
        int i = setMax + 93;
        getMin = i % 128;
        int i2 = i % 2;
        byte[] bArr = this.data;
        int i3 = this.position;
        int i4 = i3 + 1;
        this.position = i4;
        this.position = i4 + 1;
        short s = (short) ((bArr[i4] & 255) | ((bArr[i3] & 255) << 8));
        int i5 = getMin + 81;
        setMax = i5 % 128;
        int i6 = i5 % 2;
        return s;
    }

    public final short readLittleEndianShort() {
        int i = setMax + 109;
        getMin = i % 128;
        int i2 = i % 2;
        byte[] bArr = this.data;
        int i3 = this.position;
        int i4 = i3 + 1;
        this.position = i4;
        this.position = i4 + 1;
        short s = (short) (((bArr[i4] & 255) << 8) | (bArr[i3] & 255));
        try {
            int i5 = setMax + 105;
            getMin = i5 % 128;
            int i6 = i5 % 2;
            return s;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int readUnsignedInt24() {
        try {
            int i = setMax + 3;
            getMin = i % 128;
            int i2 = i % 2;
            byte[] bArr = this.data;
            int i3 = this.position;
            int i4 = i3 + 1;
            this.position = i4;
            int i5 = (bArr[i3] & 255) << Ascii.DLE;
            int i6 = i4 + 1;
            this.position = i6;
            byte b = i5 | ((bArr[i4] & 255) << 8);
            this.position = i6 + 1;
            byte b2 = (bArr[i6] & 255) | b;
            int i7 = setMax + 19;
            getMin = i7 % 128;
            if ((i7 % 2 == 0 ? '\\' : 'A') == 'A') {
                return b2;
            }
            Object obj = null;
            super.hashCode();
            return b2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int readInt24() {
        int i = setMax + 49;
        getMin = i % 128;
        int i2 = i % 2;
        byte[] bArr = this.data;
        int i3 = this.position;
        int i4 = i3 + 1;
        this.position = i4;
        int i5 = i4 + 1;
        this.position = i5;
        byte b = (((bArr[i3] & 255) << Ascii.CAN) >> 8) | ((bArr[i4] & 255) << 8);
        this.position = i5 + 1;
        byte b2 = (bArr[i5] & 255) | b;
        try {
            int i6 = getMin + 35;
            setMax = i6 % 128;
            if (i6 % 2 == 0) {
                return b2;
            }
            Object obj = null;
            super.hashCode();
            return b2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int readLittleEndianInt24() {
        try {
            int i = setMax + 43;
            getMin = i % 128;
            int i2 = i % 2;
            try {
                byte[] bArr = this.data;
                int i3 = this.position;
                int i4 = i3 + 1;
                this.position = i4;
                byte[] bArr2 = this.data;
                int i5 = i4 + 1;
                this.position = i5;
                byte b = (bArr[i3] & 255) | ((bArr2[i4] & 255) << 8);
                this.position = i5 + 1;
                byte b2 = b | ((bArr2[i5] & 255) << Ascii.DLE);
                int i6 = setMax + 21;
                getMin = i6 % 128;
                if ((i6 % 2 == 0 ? 'P' : ';') == ';') {
                    return b2;
                }
                int i7 = 69 / 0;
                return b2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final int readLittleEndianUnsignedInt24() {
        int i = setMax + 5;
        getMin = i % 128;
        int i2 = i % 2;
        byte[] bArr = this.data;
        int i3 = this.position;
        int i4 = i3 + 1;
        this.position = i4;
        int i5 = i4 + 1;
        this.position = i5;
        byte b = (bArr[i3] & 255) | ((bArr[i4] & 255) << 8);
        this.position = i5 + 1;
        byte b2 = ((bArr[i5] & 255) << Ascii.DLE) | b;
        int i6 = setMax + 53;
        getMin = i6 % 128;
        if (!(i6 % 2 == 0)) {
            return b2;
        }
        Object obj = null;
        super.hashCode();
        return b2;
    }

    public final long readUnsignedInt() {
        int i = getMin + 53;
        setMax = i % 128;
        int i2 = i % 2;
        try {
            byte[] bArr = this.data;
            try {
                int i3 = this.position;
                int i4 = i3 + 1;
                this.position = i4;
                byte[] bArr2 = this.data;
                int i5 = i4 + 1;
                this.position = i5;
                byte[] bArr3 = this.data;
                int i6 = i5 + 1;
                this.position = i6;
                long j = ((((long) bArr[i3]) & 255) << 24) | ((((long) bArr2[i4]) & 255) << 16) | ((((long) bArr3[i5]) & 255) << 8);
                byte[] bArr4 = this.data;
                this.position = i6 + 1;
                long j2 = j | (255 & ((long) bArr4[i6]));
                int i7 = setMax + 25;
                getMin = i7 % 128;
                int i8 = i7 % 2;
                return j2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final long readLittleEndianUnsignedInt() {
        try {
            int i = getMin + 19;
            try {
                setMax = i % 128;
                int i2 = i % 2;
                byte[] bArr = this.data;
                int i3 = this.position;
                int i4 = i3 + 1;
                this.position = i4;
                int i5 = i4 + 1;
                this.position = i5;
                int i6 = i5 + 1;
                this.position = i6;
                this.position = i6 + 1;
                long j = ((((long) bArr[i6]) & 255) << 24) | (((long) bArr[i3]) & 255) | ((((long) bArr[i4]) & 255) << 8) | ((((long) bArr[i5]) & 255) << 16);
                int i7 = getMin + 41;
                setMax = i7 % 128;
                if ((i7 % 2 != 0 ? 31 : 'J') != 31) {
                    return j;
                }
                Object obj = null;
                super.hashCode();
                return j;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final int readInt() {
        int i = setMax + 61;
        getMin = i % 128;
        int i2 = i % 2;
        byte[] bArr = this.data;
        int i3 = this.position;
        int i4 = i3 + 1;
        this.position = i4;
        int i5 = (bArr[i3] & 255) << Ascii.CAN;
        int i6 = i4 + 1;
        this.position = i6;
        byte b = i5 | ((bArr[i4] & 255) << Ascii.DLE);
        int i7 = i6 + 1;
        this.position = i7;
        byte b2 = b | ((bArr[i6] & 255) << 8);
        this.position = i7 + 1;
        byte b3 = (bArr[i7] & 255) | b2;
        int i8 = getMin + 69;
        setMax = i8 % 128;
        int i9 = i8 % 2;
        return b3;
    }

    public final int readLittleEndianInt() {
        int i = setMax + 35;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            byte[] bArr = this.data;
            try {
                int i3 = this.position;
                int i4 = i3 + 1;
                this.position = i4;
                byte b = bArr[i3] & 255;
                byte[] bArr2 = this.data;
                int i5 = i4 + 1;
                this.position = i5;
                byte b2 = b | ((bArr2[i4] & 255) << 8);
                byte[] bArr3 = this.data;
                int i6 = i5 + 1;
                this.position = i6;
                byte b3 = b2 | ((bArr3[i5] & 255) << Ascii.DLE);
                byte[] bArr4 = this.data;
                this.position = i6 + 1;
                byte b4 = b3 | ((bArr4[i6] & 255) << Ascii.CAN);
                int i7 = setMax + 9;
                getMin = i7 % 128;
                if (!(i7 % 2 == 0)) {
                    return b4;
                }
                int i8 = 47 / 0;
                return b4;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final long readLong() {
        int i = getMin + 87;
        setMax = i % 128;
        int i2 = i % 2;
        byte[] bArr = this.data;
        int i3 = this.position;
        int i4 = i3 + 1;
        this.position = i4;
        int i5 = i4 + 1;
        this.position = i5;
        int i6 = i5 + 1;
        this.position = i6;
        int i7 = i6 + 1;
        this.position = i7;
        int i8 = i7 + 1;
        this.position = i8;
        int i9 = i8 + 1;
        this.position = i9;
        int i10 = i9 + 1;
        this.position = i10;
        this.position = i10 + 1;
        long j = (((long) bArr[i10]) & 255) | ((((long) bArr[i3]) & 255) << 56) | ((((long) bArr[i4]) & 255) << 48) | ((((long) bArr[i5]) & 255) << 40) | ((((long) bArr[i6]) & 255) << 32) | ((((long) bArr[i7]) & 255) << 24) | ((((long) bArr[i8]) & 255) << 16) | ((((long) bArr[i9]) & 255) << 8);
        int i11 = getMin + 81;
        setMax = i11 % 128;
        int i12 = i11 % 2;
        return j;
    }

    public final long readLittleEndianLong() {
        int i = getMin + 61;
        setMax = i % 128;
        int i2 = i % 2;
        byte[] bArr = this.data;
        int i3 = this.position;
        int i4 = i3 + 1;
        this.position = i4;
        int i5 = i4 + 1;
        this.position = i5;
        int i6 = i5 + 1;
        this.position = i6;
        int i7 = i6 + 1;
        this.position = i7;
        int i8 = i7 + 1;
        this.position = i8;
        int i9 = i8 + 1;
        this.position = i9;
        int i10 = i9 + 1;
        this.position = i10;
        this.position = i10 + 1;
        long j = ((((long) bArr[i10]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i4]) & 255) << 8) | ((((long) bArr[i5]) & 255) << 16) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 32) | ((((long) bArr[i8]) & 255) << 40) | ((((long) bArr[i9]) & 255) << 48);
        int i11 = getMin + 81;
        setMax = i11 % 128;
        int i12 = i11 % 2;
        return j;
    }

    public final int readUnsignedFixedPoint1616() {
        int i = setMax + 59;
        getMin = i % 128;
        int i2 = i % 2;
        byte[] bArr = this.data;
        int i3 = this.position;
        int i4 = i3 + 1;
        this.position = i4;
        int i5 = i4 + 1;
        this.position = i5;
        byte b = (bArr[i4] & 255) | ((bArr[i3] & 255) << 8);
        this.position = i5 + 2;
        try {
            int i6 = setMax + 103;
            getMin = i6 % 128;
            if (i6 % 2 != 0) {
                return b;
            }
            int i7 = 93 / 0;
            return b;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int readSynchSafeInt() {
        try {
            int i = getMin + 19;
            setMax = i % 128;
            if (!(i % 2 == 0)) {
                return (((readUnsignedByte() >>> 82) | (readUnsignedByte() >>> 117)) ^ (readUnsignedByte() * 3)) & readUnsignedByte();
            }
            return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
        } catch (Exception e) {
            throw e;
        }
    }

    public final int readUnsignedIntToInt() {
        int i = setMax + 125;
        getMin = i % 128;
        int i2 = i % 2;
        int readInt = readInt();
        if (readInt >= 0) {
            int i3 = getMin + 55;
            setMax = i3 % 128;
            if (!(i3 % 2 != 0)) {
                return readInt;
            }
            Object obj = null;
            super.hashCode();
            return readInt;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(readInt)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r0 >= 0) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        throw new java.lang.IllegalStateException("Top bit not zero: ".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r0 >= 0) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int readLittleEndianUnsignedIntToInt() {
        /*
            r6 = this;
            int r0 = getMin
            int r0 = r0 + 15
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r3 = 0
            if (r0 == 0) goto L_0x001b
            int r0 = r6.readLittleEndianInt()
            if (r0 < 0) goto L_0x0037
            goto L_0x0022
        L_0x001b:
            int r0 = r6.readLittleEndianInt()
            int r4 = r3.length     // Catch:{ all -> 0x0047 }
            if (r0 < 0) goto L_0x0037
        L_0x0022:
            int r4 = setMax
            int r4 = r4 + 105
            int r5 = r4 % 128
            getMin = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r1 = 1
        L_0x0030:
            if (r1 == r2) goto L_0x0036
            int r1 = r3.length     // Catch:{ all -> 0x0034 }
            return r0
        L_0x0034:
            r0 = move-exception
            throw r0
        L_0x0036:
            return r0
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Top bit not zero: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x0047:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.ParsableByteArray.readLittleEndianUnsignedIntToInt():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        throw new java.lang.IllegalStateException("Top bit not zero: ".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r0 >= 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r0 >= 0) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long readUnsignedLongToLong() {
        /*
            r5 = this;
            int r0 = getMin
            int r0 = r0 + 17
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 30
            if (r0 == 0) goto L_0x0011
            r0 = 30
            goto L_0x0013
        L_0x0011:
            r0 = 96
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x0020
            long r0 = r5.readLong()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0033
            goto L_0x0028
        L_0x0020:
            long r0 = r5.readLong()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0033
        L_0x0028:
            int r2 = getMin
            int r2 = r2 + 55
            int r3 = r2 % 128
            setMax = r3
            int r2 = r2 % 2
            return r0
        L_0x0033:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Top bit not zero: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ Exception -> 0x0043 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0043 }
            throw r2     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.ParsableByteArray.readUnsignedLongToLong():long");
    }

    public final float readFloat() {
        int i = getMin + 125;
        setMax = i % 128;
        int i2 = i % 2;
        try {
            float intBitsToFloat = Float.intBitsToFloat(readInt());
            int i3 = setMax + 29;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return intBitsToFloat;
        } catch (Exception e) {
            throw e;
        }
    }

    public final double readDouble() {
        int i = getMin + 71;
        setMax = i % 128;
        int i2 = i % 2;
        double longBitsToDouble = Double.longBitsToDouble(readLong());
        int i3 = setMax + 57;
        getMin = i3 % 128;
        int i4 = i3 % 2;
        return longBitsToDouble;
    }

    public final String readString(int i) {
        int i2 = getMin + 51;
        setMax = i2 % 128;
        String readString = readString(i, Charset.forName(((i2 % 2 != 0 ? 'L' : Typography.dollar) != 'L' ? setMin(new int[]{0, 5, 0, 5}, new byte[]{1, 1, 0, 1, 1}, PixelFormat.formatHasAlpha(0)) : setMin(new int[]{0, 5, 0, 5}, new byte[]{1, 1, 0, 1, 1}, PixelFormat.formatHasAlpha(0))).intern()));
        int i3 = getMin + 21;
        setMax = i3 % 128;
        if (i3 % 2 == 0) {
            return readString;
        }
        int i4 = 90 / 0;
        return readString;
    }

    public final String readString(int i, Charset charset) {
        try {
            String str = new String(this.data, this.position, i, charset);
            this.position += i;
            int i2 = getMin + 55;
            setMax = i2 % 128;
            if ((i2 % 2 != 0 ? 0 : '`') == '`') {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r0 != true) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0066, code lost:
        if (r4 != '`') goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String readNullTerminatedString(int r8) {
        /*
            r7 = this;
            int r0 = getMin
            int r0 = r0 + 77
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r0 = 0
            r1 = 1
            if (r8 != 0) goto L_0x0010
            r2 = 0
            goto L_0x0011
        L_0x0010:
            r2 = 1
        L_0x0011:
            r3 = 0
            r4 = 12
            if (r2 == r1) goto L_0x0030
            java.lang.String r8 = ""
            int r0 = getMin
            int r0 = r0 + 23
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 72
            if (r0 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r4 = 72
        L_0x0029:
            if (r4 == r1) goto L_0x002f
            int r0 = r3.length     // Catch:{ all -> 0x002d }
            return r8
        L_0x002d:
            r8 = move-exception
            throw r8
        L_0x002f:
            return r8
        L_0x0030:
            int r2 = r7.position
            int r2 = r2 + r8
            int r2 = r2 - r1
            int r5 = r7.limit
            if (r2 >= r5) goto L_0x006b
            int r5 = getMin
            int r5 = r5 + 107
            int r6 = r5 % 128
            setMax = r6
            int r5 = r5 % 2
            r6 = 66
            if (r5 == 0) goto L_0x0049
            r5 = 44
            goto L_0x004b
        L_0x0049:
            r5 = 66
        L_0x004b:
            if (r5 == r6) goto L_0x005b
            byte[] r4 = r7.data
            byte r2 = r4[r2]
            int r3 = r3.length     // Catch:{ all -> 0x0059 }
            if (r2 != 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r0 = 1
        L_0x0056:
            if (r0 == r1) goto L_0x006b
            goto L_0x0068
        L_0x0059:
            r8 = move-exception
            throw r8
        L_0x005b:
            byte[] r0 = r7.data
            byte r0 = r0[r2]
            r1 = 96
            if (r0 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r4 = 96
        L_0x0066:
            if (r4 == r1) goto L_0x006b
        L_0x0068:
            int r0 = r8 + -1
            goto L_0x006c
        L_0x006b:
            r0 = r8
        L_0x006c:
            byte[] r1 = r7.data     // Catch:{ Exception -> 0x007c }
            int r2 = r7.position     // Catch:{ Exception -> 0x007a }
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.fromUtf8Bytes(r1, r2, r0)     // Catch:{ Exception -> 0x007a }
            int r1 = r7.position     // Catch:{ Exception -> 0x007a }
            int r1 = r1 + r8
            r7.position = r1     // Catch:{ Exception -> 0x007a }
            return r0
        L_0x007a:
            r8 = move-exception
            throw r8
        L_0x007c:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.ParsableByteArray.readNullTerminatedString(int):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.String] */
    @Nullable
    public final String readNullTerminatedString() {
        int i = setMax + 21;
        getMin = i % 128;
        int i2 = i % 2;
        ? r1 = 0;
        if (bytesLeft() == 0) {
            return r1;
        }
        int i3 = this.position;
        while (i3 < this.limit) {
            try {
                int i4 = getMin + 31;
                setMax = i4 % 128;
                if (i4 % 2 == 0) {
                    if ((this.data[i3] != 0 ? '6' : 29) == 29) {
                        break;
                    }
                } else {
                    byte b = this.data[i3];
                    int length2 = r1.length;
                    if (b == 0) {
                        break;
                    }
                }
                i3++;
                int i5 = setMax + 93;
                getMin = i5 % 128;
                int i6 = i5 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
        byte[] bArr = this.data;
        int i7 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr, i7, i3 - i7);
        this.position = i3;
        if (i3 < this.limit) {
            int i8 = getMin + 97;
            setMax = i8 % 128;
            this.position = i8 % 2 != 0 ? i3 + 0 : i3 + 1;
        }
        int i9 = getMin + 91;
        try {
            setMax = i9 % 128;
            int i10 = i9 % 2;
            return fromUtf8Bytes;
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Nullable
    public final String readLine() {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && !Util.isLinebreak(this.data[i])) {
            i++;
        }
        if ((i - this.position >= 3 ? 'J' : '1') != '1') {
            if ((this.data[this.position] == -17 ? 'I' : 8) != 8) {
                try {
                    int i2 = getMin + 107;
                    try {
                        setMax = i2 % 128;
                        int i3 = i2 % 2;
                        byte[] bArr = this.data;
                        int i4 = this.position;
                        if (bArr[i4 + 1] == -69) {
                            int i5 = setMax + 59;
                            getMin = i5 % 128;
                            if (i5 % 2 != 0 ? bArr[i4 + 2] == -65 : bArr[i4 << 3] == 41) {
                                this.position += 3;
                            }
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        byte[] bArr2 = this.data;
        int i6 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr2, i6, i - i6);
        this.position = i;
        if (i == this.limit) {
            return fromUtf8Bytes;
        }
        if (this.data[i] == 13) {
            int i7 = setMax + 75;
            getMin = i7 % 128;
            int i8 = i7 % 2;
            int i9 = this.position + 1;
            this.position = i9;
            if (i9 == this.limit) {
                return fromUtf8Bytes;
            }
        }
        byte[] bArr3 = this.data;
        int i10 = this.position;
        if (bArr3[i10] == 10) {
            int i11 = getMin + 29;
            setMax = i11 % 128;
            int i12 = i11 % 2;
            this.position = i10 + 1;
        }
        return fromUtf8Bytes;
    }

    public final long readUtf8EncodedLong() {
        long j;
        int i;
        int i2;
        byte b;
        int i3 = getMin + 107;
        setMax = i3 % 128;
        if (i3 % 2 != 0) {
            j = (long) this.data[this.position];
            i = 19;
        } else {
            try {
                j = (long) this.data[this.position];
                i = 7;
            } catch (Exception e) {
                throw e;
            }
        }
        while (true) {
            if (i < 0) {
                break;
            }
            int i4 = setMax + 85;
            getMin = i4 % 128;
            if (i4 % 2 == 0) {
                if (((long) (1 >>> i)) + j == 0) {
                    break;
                }
                i--;
            } else if ((((long) (1 << i)) & j) == 0) {
                break;
            } else {
                i--;
            }
        }
        if (i < 6) {
            j &= (long) ((1 << i) - 1);
            i2 = 7 - i;
        } else {
            if (i == 7) {
                int i5 = setMax + 31;
                getMin = i5 % 128;
                int i6 = i5 % 2;
                i2 = 1;
            }
            i2 = 0;
        }
        if (i2 != 0) {
            int i7 = 1;
            while (true) {
                if (i7 < i2) {
                    int i8 = getMin + 101;
                    setMax = i8 % 128;
                    if ((i8 % 2 != 0 ? '=' : 'R') == 'R') {
                        b = this.data[this.position + i7];
                        if ((b & 192) != 128) {
                            break;
                        }
                    } else {
                        b = this.data[this.position + i7];
                        if ((b & 205) != 2933) {
                            break;
                        }
                    }
                    j = (j << 6) | ((long) (b & 63));
                    i7++;
                } else {
                    this.position += i2;
                    return j;
                }
            }
            throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: ".concat(String.valueOf(j)));
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: ".concat(String.valueOf(j)));
    }

    private static String setMin(int[] iArr, byte[] bArr, boolean z) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = new char[i2];
        System.arraycopy(length, i, cArr, 0, i2);
        if ((bArr != null ? 'C' : '8') != '8') {
            char[] cArr2 = new char[i2];
            char c = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                if (bArr[i5] == 1) {
                    try {
                        int i6 = getMin + 11;
                        try {
                            setMax = i6 % 128;
                            int i7 = i6 % 2;
                            cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                            int i8 = getMin + 63;
                            setMax = i8 % 128;
                            int i9 = i8 % 2;
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                } else {
                    cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                }
                c = cArr2[i5];
            }
            cArr = cArr2;
        }
        if (i4 > 0) {
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr, 0, cArr3, 0, i2);
            int i10 = i2 - i4;
            System.arraycopy(cArr3, 0, cArr, i10, i4);
            System.arraycopy(cArr3, i4, cArr, 0, i10);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            int i11 = 0;
            while (true) {
                if (i11 >= i2) {
                    break;
                }
                cArr4[i11] = cArr[(i2 - i11) - 1];
                i11++;
            }
            cArr = cArr4;
        }
        if ((i3 > 0 ? 3 : '%') == 3) {
            for (int i12 = 0; i12 < i2; i12++) {
                cArr[i12] = (char) (cArr[i12] - iArr[2]);
            }
        }
        return new String(cArr);
    }
}
