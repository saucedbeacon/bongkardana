package com.alipay.iap.android.aplog.util.zip;

import java.io.IOException;

public class LZ_BinTree extends LZ_InWindow {
    private static final int[] CrcTable = new int[256];
    static final int kBT2HashSize = 65536;
    static final int kEmptyHashValue = 0;
    static final int kHash2Size = 1024;
    static final int kHash3Offset = 1024;
    static final int kHash3Size = 65536;
    static final int kMaxValForNormalize = 1073741823;
    static final int kStartMaxLen = 1;
    boolean HASH_ARRAY = true;
    int _cutValue = 255;
    int _cyclicBufferPos;
    int _cyclicBufferSize = 0;
    int[] _hash;
    int _hashMask;
    int _hashSizeSum = 0;
    int _matchMaxLen;
    int[] _son;
    int kFixHashSize = 66560;
    int kMinMatchCheck = 4;
    int kNumHashDirectBytes = 0;

    public void SetType(int i) {
        boolean z = i > 2;
        this.HASH_ARRAY = z;
        if (z) {
            this.kNumHashDirectBytes = 0;
            this.kMinMatchCheck = 4;
            this.kFixHashSize = 66560;
            return;
        }
        this.kNumHashDirectBytes = 2;
        this.kMinMatchCheck = 3;
        this.kFixHashSize = 0;
    }

    public void Init() throws IOException {
        super.Init();
        for (int i = 0; i < this._hashSizeSum; i++) {
            this._hash[i] = 0;
        }
        this._cyclicBufferPos = 0;
        ReduceOffsets(-1);
    }

    public void MovePos() throws IOException {
        int i = this._cyclicBufferPos + 1;
        this._cyclicBufferPos = i;
        if (i >= this._cyclicBufferSize) {
            this._cyclicBufferPos = 0;
        }
        super.MovePos();
        if (this._pos == kMaxValForNormalize) {
            Normalize();
        }
    }

    public boolean Create(int i, int i2, int i3, int i4) {
        if (i > 1073741567) {
            return false;
        }
        this._cutValue = (i3 >> 1) + 16;
        int i5 = i2 + i;
        super.Create(i5, i4 + i3, (((i5 + i3) + i4) / 2) + 256);
        this._matchMaxLen = i3;
        int i6 = i + 1;
        if (this._cyclicBufferSize != i6) {
            this._cyclicBufferSize = i6;
            this._son = new int[(i6 * 2)];
        }
        int i7 = 65536;
        if (this.HASH_ARRAY) {
            int i8 = i - 1;
            int i9 = i8 | (i8 >> 1);
            int i10 = i9 | (i9 >> 2);
            int i11 = i10 | (i10 >> 4);
            int i12 = ((i11 | (i11 >> 8)) >> 1) | 65535;
            if (i12 > 16777216) {
                i12 >>= 1;
            }
            this._hashMask = i12;
            i7 = this.kFixHashSize + i12 + 1;
        }
        if (i7 != this._hashSizeSum) {
            this._hashSizeSum = i7;
            this._hash = new int[i7];
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b9, code lost:
        r1 = r0._son;
        r1[r5] = 0;
        r1[r8] = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b9 A[EDGE_INSN: B:72:0x01b9->B:69:0x01b9 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int GetMatches(int[] r20) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0._pos
            int r2 = r0._matchMaxLen
            int r1 = r1 + r2
            int r2 = r0._streamPos
            r3 = 0
            if (r1 > r2) goto L_0x000f
            int r1 = r0._matchMaxLen
            goto L_0x001c
        L_0x000f:
            int r1 = r0._streamPos
            int r2 = r0._pos
            int r1 = r1 - r2
            int r2 = r0.kMinMatchCheck
            if (r1 >= r2) goto L_0x001c
            r19.MovePos()
            return r3
        L_0x001c:
            int r2 = r0._pos
            int r4 = r0._cyclicBufferSize
            if (r2 <= r4) goto L_0x0028
            int r2 = r0._pos
            int r4 = r0._cyclicBufferSize
            int r2 = r2 - r4
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            int r4 = r0._bufferOffset
            int r5 = r0._pos
            int r4 = r4 + r5
            boolean r5 = r0.HASH_ARRAY
            if (r5 == 0) goto L_0x0069
            int[] r5 = CrcTable
            byte[] r6 = r0._bufferBase
            byte r6 = r6[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5[r6]
            byte[] r6 = r0._bufferBase
            int r7 = r4 + 1
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r6
            r6 = r5 & 1023(0x3ff, float:1.434E-42)
            byte[] r7 = r0._bufferBase
            int r8 = r4 + 2
            byte r7 = r7[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r5 = r5 ^ r7
            r7 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r5
            int[] r8 = CrcTable
            byte[] r9 = r0._bufferBase
            int r10 = r4 + 3
            byte r9 = r9[r10]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r8 = r8[r9]
            int r8 = r8 << 5
            r5 = r5 ^ r8
            int r8 = r0._hashMask
            r5 = r5 & r8
            goto L_0x007c
        L_0x0069:
            byte[] r5 = r0._bufferBase
            byte r5 = r5[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte[] r6 = r0._bufferBase
            int r7 = r4 + 1
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r5 = r5 ^ r6
            r6 = 0
            r7 = 0
        L_0x007c:
            int[] r8 = r0._hash
            int r9 = r0.kFixHashSize
            int r9 = r9 + r5
            r9 = r8[r9]
            boolean r10 = r0.HASH_ARRAY
            r11 = 1
            if (r10 == 0) goto L_0x00dd
            r10 = r8[r6]
            int r7 = r7 + 1024
            r12 = r8[r7]
            int r13 = r0._pos
            r8[r6] = r13
            int[] r6 = r0._hash
            int r8 = r0._pos
            r6[r7] = r8
            r6 = 2
            if (r10 <= r2) goto L_0x00b2
            byte[] r7 = r0._bufferBase
            int r8 = r0._bufferOffset
            int r8 = r8 + r10
            byte r7 = r7[r8]
            byte[] r8 = r0._bufferBase
            byte r8 = r8[r4]
            if (r7 != r8) goto L_0x00b2
            r20[r3] = r6
            int r7 = r0._pos
            int r7 = r7 - r10
            int r7 = r7 - r11
            r20[r11] = r7
            r7 = 2
            goto L_0x00b4
        L_0x00b2:
            r6 = 0
            r7 = 1
        L_0x00b4:
            r8 = 3
            if (r12 <= r2) goto L_0x00d6
            byte[] r13 = r0._bufferBase
            int r14 = r0._bufferOffset
            int r14 = r14 + r12
            byte r13 = r13[r14]
            byte[] r14 = r0._bufferBase
            byte r14 = r14[r4]
            if (r13 != r14) goto L_0x00d6
            if (r12 != r10) goto L_0x00c8
            int r6 = r6 + -2
        L_0x00c8:
            int r7 = r6 + 1
            r20[r6] = r8
            int r6 = r7 + 1
            int r10 = r0._pos
            int r10 = r10 - r12
            int r10 = r10 - r11
            r20[r7] = r10
            r10 = r12
            r7 = 3
        L_0x00d6:
            if (r6 == 0) goto L_0x00df
            if (r10 != r9) goto L_0x00df
            int r6 = r6 + -2
            goto L_0x00de
        L_0x00dd:
            r6 = 0
        L_0x00de:
            r7 = 1
        L_0x00df:
            int[] r8 = r0._hash
            int r10 = r0.kFixHashSize
            int r10 = r10 + r5
            int r5 = r0._pos
            r8[r10] = r5
            int r5 = r0._cyclicBufferPos
            int r8 = r5 << 1
            int r8 = r8 + r11
            int r5 = r5 << r11
            int r10 = r0.kNumHashDirectBytes
            if (r10 == 0) goto L_0x0115
            if (r9 <= r2) goto L_0x0115
            byte[] r12 = r0._bufferBase
            int r13 = r0._bufferOffset
            int r13 = r13 + r9
            int r14 = r0.kNumHashDirectBytes
            int r13 = r13 + r14
            byte r12 = r12[r13]
            byte[] r13 = r0._bufferBase
            int r14 = r0.kNumHashDirectBytes
            int r15 = r4 + r14
            byte r13 = r13[r15]
            if (r12 == r13) goto L_0x0115
            int r7 = r6 + 1
            r20[r6] = r14
            int r6 = r7 + 1
            int r12 = r0._pos
            int r12 = r12 - r9
            int r12 = r12 - r11
            r20[r7] = r12
            r7 = r14
        L_0x0115:
            int r12 = r0._cutValue
            r13 = r12
            r12 = r10
        L_0x0119:
            if (r9 <= r2) goto L_0x01b9
            int r14 = r13 + -1
            if (r13 != 0) goto L_0x0121
            goto L_0x01b9
        L_0x0121:
            int r13 = r0._pos
            int r13 = r13 - r9
            int r15 = r0._cyclicBufferPos
            if (r13 > r15) goto L_0x012a
            int r15 = r15 - r13
            goto L_0x012e
        L_0x012a:
            int r15 = r15 - r13
            int r3 = r0._cyclicBufferSize
            int r15 = r15 + r3
        L_0x012e:
            int r3 = r15 << 1
            int r15 = r0._bufferOffset
            int r15 = r15 + r9
            int r16 = java.lang.Math.min(r10, r12)
            byte[] r11 = r0._bufferBase
            int r17 = r15 + r16
            byte r11 = r11[r17]
            r17 = r2
            byte[] r2 = r0._bufferBase
            int r18 = r4 + r16
            byte r2 = r2[r18]
            if (r11 != r2) goto L_0x0186
        L_0x0147:
            r2 = 1
            int r11 = r16 + 1
            if (r11 == r1) goto L_0x0162
            byte[] r2 = r0._bufferBase
            int r16 = r15 + r11
            byte r2 = r2[r16]
            r18 = r10
            byte[] r10 = r0._bufferBase
            int r16 = r4 + r11
            byte r10 = r10[r16]
            if (r2 == r10) goto L_0x015d
            goto L_0x0164
        L_0x015d:
            r16 = r11
            r10 = r18
            goto L_0x0147
        L_0x0162:
            r18 = r10
        L_0x0164:
            if (r7 >= r11) goto L_0x0183
            int r2 = r6 + 1
            r20[r6] = r11
            int r6 = r2 + 1
            int r13 = r13 + -1
            r20[r2] = r13
            if (r11 != r1) goto L_0x017f
            int[] r1 = r0._son
            r2 = r1[r3]
            r1[r5] = r2
            r2 = 1
            int r3 = r3 + r2
            r2 = r1[r3]
            r1[r8] = r2
            goto L_0x01c0
        L_0x017f:
            r2 = 1
            r7 = r11
            r10 = r7
            goto L_0x018b
        L_0x0183:
            r2 = 1
            r10 = r11
            goto L_0x018b
        L_0x0186:
            r18 = r10
            r2 = 1
            r10 = r16
        L_0x018b:
            byte[] r11 = r0._bufferBase
            int r15 = r15 + r10
            byte r11 = r11[r15]
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte[] r13 = r0._bufferBase
            int r15 = r4 + r10
            byte r13 = r13[r15]
            r13 = r13 & 255(0xff, float:3.57E-43)
            if (r11 >= r13) goto L_0x01ab
            int[] r11 = r0._son
            r11[r5] = r9
            int r5 = r3 + 1
            r9 = r11[r5]
            r12 = r10
            r13 = r14
            r2 = r17
            r10 = r18
            goto L_0x01b5
        L_0x01ab:
            int[] r11 = r0._son
            r11[r8] = r9
            r9 = r11[r3]
            r8 = r3
            r13 = r14
            r2 = r17
        L_0x01b5:
            r3 = 0
            r11 = 1
            goto L_0x0119
        L_0x01b9:
            int[] r1 = r0._son
            r2 = 0
            r1[r5] = r2
            r1[r8] = r2
        L_0x01c0:
            r19.MovePos()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.zip.LZ_BinTree.GetMatches(int[]):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0114, code lost:
        r2 = r0._son;
        r2[r6] = 0;
        r2[r7] = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r2 >= r0.kMinMatchCheck) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Skip(int r18) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
        L_0x0004:
            int r2 = r0._pos
            int r3 = r0._matchMaxLen
            int r2 = r2 + r3
            int r3 = r0._streamPos
            if (r2 > r3) goto L_0x0010
            int r2 = r0._matchMaxLen
            goto L_0x0019
        L_0x0010:
            int r2 = r0._streamPos
            int r3 = r0._pos
            int r2 = r2 - r3
            int r3 = r0.kMinMatchCheck
            if (r2 < r3) goto L_0x011b
        L_0x0019:
            int r3 = r0._pos
            int r4 = r0._cyclicBufferSize
            if (r3 <= r4) goto L_0x0025
            int r3 = r0._pos
            int r4 = r0._cyclicBufferSize
            int r3 = r3 - r4
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            int r4 = r0._bufferOffset
            int r6 = r0._pos
            int r4 = r4 + r6
            boolean r6 = r0.HASH_ARRAY
            if (r6 == 0) goto L_0x0074
            int[] r6 = CrcTable
            byte[] r7 = r0._bufferBase
            byte r7 = r7[r4]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6[r7]
            byte[] r7 = r0._bufferBase
            int r8 = r4 + 1
            byte r7 = r7[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 ^ r7
            r7 = r6 & 1023(0x3ff, float:1.434E-42)
            int[] r8 = r0._hash
            int r9 = r0._pos
            r8[r7] = r9
            byte[] r7 = r0._bufferBase
            int r8 = r4 + 2
            byte r7 = r7[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r6 = r6 ^ r7
            r7 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r6
            int[] r8 = r0._hash
            int r7 = r7 + 1024
            int r9 = r0._pos
            r8[r7] = r9
            int[] r7 = CrcTable
            byte[] r8 = r0._bufferBase
            int r9 = r4 + 3
            byte r8 = r8[r9]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r7 = r7[r8]
            int r7 = r7 << 5
            r6 = r6 ^ r7
            int r7 = r0._hashMask
            r6 = r6 & r7
            goto L_0x0085
        L_0x0074:
            byte[] r6 = r0._bufferBase
            byte r6 = r6[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte[] r7 = r0._bufferBase
            int r8 = r4 + 1
            byte r7 = r7[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r6 = r6 ^ r7
        L_0x0085:
            int[] r7 = r0._hash
            int r8 = r0.kFixHashSize
            int r9 = r8 + r6
            r9 = r7[r9]
            int r8 = r8 + r6
            int r6 = r0._pos
            r7[r8] = r6
            int r6 = r0._cyclicBufferPos
            int r7 = r6 << 1
            int r7 = r7 + 1
            int r6 = r6 << 1
            int r8 = r0.kNumHashDirectBytes
            int r10 = r0._cutValue
            r11 = r10
            r10 = r9
            r9 = r8
        L_0x00a1:
            if (r10 <= r3) goto L_0x0114
            int r12 = r11 + -1
            if (r11 != 0) goto L_0x00a9
            goto L_0x0114
        L_0x00a9:
            int r11 = r0._pos
            int r11 = r11 - r10
            int r13 = r0._cyclicBufferPos
            if (r11 > r13) goto L_0x00b2
            int r13 = r13 - r11
            goto L_0x00b6
        L_0x00b2:
            int r13 = r13 - r11
            int r11 = r0._cyclicBufferSize
            int r13 = r13 + r11
        L_0x00b6:
            int r11 = r13 << 1
            int r13 = r0._bufferOffset
            int r13 = r13 + r10
            int r14 = java.lang.Math.min(r8, r9)
            byte[] r15 = r0._bufferBase
            int r16 = r13 + r14
            byte r15 = r15[r16]
            byte[] r5 = r0._bufferBase
            int r16 = r4 + r14
            byte r5 = r5[r16]
            if (r15 != r5) goto L_0x00ee
        L_0x00cd:
            int r14 = r14 + 1
            if (r14 == r2) goto L_0x00df
            byte[] r5 = r0._bufferBase
            int r15 = r13 + r14
            byte r5 = r5[r15]
            byte[] r15 = r0._bufferBase
            int r16 = r4 + r14
            byte r15 = r15[r16]
            if (r5 == r15) goto L_0x00cd
        L_0x00df:
            if (r14 != r2) goto L_0x00ee
            int[] r2 = r0._son
            r3 = r2[r11]
            r2[r6] = r3
            int r11 = r11 + 1
            r3 = r2[r11]
            r2[r7] = r3
            goto L_0x011b
        L_0x00ee:
            byte[] r5 = r0._bufferBase
            int r13 = r13 + r14
            byte r5 = r5[r13]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte[] r13 = r0._bufferBase
            int r15 = r4 + r14
            byte r13 = r13[r15]
            r13 = r13 & 255(0xff, float:3.57E-43)
            if (r5 >= r13) goto L_0x010a
            int[] r5 = r0._son
            r5[r6] = r10
            int r6 = r11 + 1
            r10 = r5[r6]
            r11 = r12
            r9 = r14
            goto L_0x00a1
        L_0x010a:
            int[] r5 = r0._son
            r5[r7] = r10
            r10 = r5[r11]
            r7 = r11
            r11 = r12
            r8 = r14
            goto L_0x00a1
        L_0x0114:
            int[] r2 = r0._son
            r3 = 0
            r2[r6] = r3
            r2[r7] = r3
        L_0x011b:
            r17.MovePos()
            int r1 = r1 + -1
            if (r1 != 0) goto L_0x0004
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.zip.LZ_BinTree.Skip(int):void");
    }

    /* access modifiers changed from: package-private */
    public void NormalizeLinks(int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            iArr[i3] = i4 <= i2 ? 0 : i4 - i2;
        }
    }

    /* access modifiers changed from: package-private */
    public void Normalize() {
        int i = this._pos;
        int i2 = this._cyclicBufferSize;
        int i3 = i - i2;
        NormalizeLinks(this._son, i2 * 2, i3);
        NormalizeLinks(this._hash, this._hashSizeSum, i3);
        ReduceOffsets(i3);
    }

    public void SetCutValue(int i) {
        this._cutValue = i;
    }

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                i2 = (i2 & 1) != 0 ? (i2 >>> 1) ^ -306674912 : i2 >>> 1;
            }
            CrcTable[i] = i2;
        }
    }
}
