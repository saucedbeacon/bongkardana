package com.alipay.iap.android.aplog.util.zip;

import java.io.IOException;
import java.io.InputStream;

public class RangeCoder_Decoder {
    static final int kBitModelTotal = 2048;
    static final int kNumBitModelTotalBits = 11;
    static final int kNumMoveBits = 5;
    static final int kTopMask = -16777216;
    int Code;
    int Range;
    InputStream Stream;

    public final void SetStream(InputStream inputStream) {
        this.Stream = inputStream;
    }

    public final void ReleaseStream() {
        this.Stream = null;
    }

    public final void Init() throws IOException {
        this.Code = 0;
        this.Range = -1;
        for (int i = 0; i < 5; i++) {
            this.Code = (this.Code << 8) | this.Stream.read();
        }
    }

    public final int DecodeDirectBits(int i) throws IOException {
        int i2 = 0;
        while (i != 0) {
            int i3 = this.Range >>> 1;
            this.Range = i3;
            int i4 = this.Code;
            int i5 = (i4 - i3) >>> 31;
            int i6 = i4 - ((i5 - 1) & i3);
            this.Code = i6;
            i2 = (i2 << 1) | (1 - i5);
            if ((i3 & -16777216) == 0) {
                this.Code = (i6 << 8) | this.Stream.read();
                this.Range <<= 8;
            }
            i--;
        }
        return i2;
    }

    public int DecodeBit(short[] sArr, int i) throws IOException {
        short s = sArr[i];
        int i2 = this.Range;
        int i3 = (i2 >>> 11) * s;
        int i4 = this.Code;
        if ((i4 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ i3)) {
            this.Range = i3;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            if ((i3 & -16777216) != 0) {
                return 0;
            }
            this.Code = (i4 << 8) | this.Stream.read();
            this.Range <<= 8;
            return 0;
        }
        int i5 = i2 - i3;
        this.Range = i5;
        int i6 = i4 - i3;
        this.Code = i6;
        sArr[i] = (short) (s - (s >>> 5));
        if ((i5 & -16777216) != 0) {
            return 1;
        }
        this.Code = (i6 << 8) | this.Stream.read();
        this.Range <<= 8;
        return 1;
    }

    public static void InitBitModels(short[] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = 1024;
        }
    }
}
