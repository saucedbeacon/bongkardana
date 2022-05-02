package com.alipay.iap.android.aplog.util.zip;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

public class LZMA_Decoder {
    int m_DictionarySize = -1;
    int m_DictionarySizeCheck = -1;
    short[] m_IsMatchDecoders = new short[PsExtractor.AUDIO_STREAM];
    short[] m_IsRep0LongDecoders = new short[PsExtractor.AUDIO_STREAM];
    short[] m_IsRepDecoders = new short[12];
    short[] m_IsRepG0Decoders = new short[12];
    short[] m_IsRepG1Decoders = new short[12];
    short[] m_IsRepG2Decoders = new short[12];
    LenDecoder m_LenDecoder = new LenDecoder();
    LiteralDecoder m_LiteralDecoder = new LiteralDecoder();
    LZ_OutWindow m_OutWindow = new LZ_OutWindow();
    RangeCoder_BitTreeDecoder m_PosAlignDecoder = new RangeCoder_BitTreeDecoder(4);
    short[] m_PosDecoders = new short[114];
    RangeCoder_BitTreeDecoder[] m_PosSlotDecoder = new RangeCoder_BitTreeDecoder[4];
    int m_PosStateMask;
    RangeCoder_Decoder m_RangeDecoder = new RangeCoder_Decoder();
    LenDecoder m_RepLenDecoder = new LenDecoder();

    class LenDecoder {
        short[] m_Choice = new short[2];
        RangeCoder_BitTreeDecoder m_HighCoder = new RangeCoder_BitTreeDecoder(8);
        RangeCoder_BitTreeDecoder[] m_LowCoder = new RangeCoder_BitTreeDecoder[16];
        RangeCoder_BitTreeDecoder[] m_MidCoder = new RangeCoder_BitTreeDecoder[16];
        int m_NumPosStates = 0;

        LenDecoder() {
        }

        public void Create(int i) {
            while (true) {
                int i2 = this.m_NumPosStates;
                if (i2 < i) {
                    this.m_LowCoder[i2] = new RangeCoder_BitTreeDecoder(3);
                    this.m_MidCoder[this.m_NumPosStates] = new RangeCoder_BitTreeDecoder(3);
                    this.m_NumPosStates++;
                } else {
                    return;
                }
            }
        }

        public void Init() {
            RangeCoder_Decoder.InitBitModels(this.m_Choice);
            for (int i = 0; i < this.m_NumPosStates; i++) {
                this.m_LowCoder[i].Init();
                this.m_MidCoder[i].Init();
            }
            this.m_HighCoder.Init();
        }

        public int Decode(RangeCoder_Decoder rangeCoder_Decoder, int i) throws IOException {
            int i2;
            if (rangeCoder_Decoder.DecodeBit(this.m_Choice, 0) == 0) {
                return this.m_LowCoder[i].Decode(rangeCoder_Decoder);
            }
            if (rangeCoder_Decoder.DecodeBit(this.m_Choice, 1) == 0) {
                i2 = this.m_MidCoder[i].Decode(rangeCoder_Decoder);
            } else {
                i2 = this.m_HighCoder.Decode(rangeCoder_Decoder) + 8;
            }
            return i2 + 8;
        }
    }

    class LiteralDecoder {
        Decoder2[] m_Coders;
        int m_NumPosBits;
        int m_NumPrevBits;
        int m_PosMask;

        class Decoder2 {
            short[] m_Decoders = new short[768];

            Decoder2() {
            }

            public void Init() {
                RangeCoder_Decoder.InitBitModels(this.m_Decoders);
            }

            public byte DecodeNormal(RangeCoder_Decoder rangeCoder_Decoder) throws IOException {
                int i = 1;
                do {
                    i = rangeCoder_Decoder.DecodeBit(this.m_Decoders, i) | (i << 1);
                } while (i < 256);
                return (byte) i;
            }

            public byte DecodeWithMatchByte(RangeCoder_Decoder rangeCoder_Decoder, byte b) throws IOException {
                int i = 1;
                while (true) {
                    int i2 = (b >> 7) & 1;
                    b = (byte) (b << 1);
                    int DecodeBit = rangeCoder_Decoder.DecodeBit(this.m_Decoders, ((i2 + 1) << 8) + i);
                    i = (i << 1) | DecodeBit;
                    if (i2 == DecodeBit) {
                        if (i >= 256) {
                            break;
                        }
                    } else {
                        while (i < 256) {
                            i = (i << 1) | rangeCoder_Decoder.DecodeBit(this.m_Decoders, i);
                        }
                    }
                }
                return (byte) i;
            }
        }

        LiteralDecoder() {
        }

        public void Create(int i, int i2) {
            if (this.m_Coders == null || this.m_NumPrevBits != i2 || this.m_NumPosBits != i) {
                this.m_NumPosBits = i;
                this.m_PosMask = (1 << i) - 1;
                this.m_NumPrevBits = i2;
                int i3 = 1 << (i2 + i);
                this.m_Coders = new Decoder2[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    this.m_Coders[i4] = new Decoder2();
                }
            }
        }

        public void Init() {
            int i = 1 << (this.m_NumPrevBits + this.m_NumPosBits);
            for (int i2 = 0; i2 < i; i2++) {
                this.m_Coders[i2].Init();
            }
        }

        /* access modifiers changed from: package-private */
        public Decoder2 GetDecoder(int i, byte b) {
            Decoder2[] decoder2Arr = this.m_Coders;
            int i2 = i & this.m_PosMask;
            int i3 = this.m_NumPrevBits;
            return decoder2Arr[(i2 << i3) + ((b & 255) >>> (8 - i3))];
        }
    }

    public LZMA_Decoder() {
        for (int i = 0; i < 4; i++) {
            this.m_PosSlotDecoder[i] = new RangeCoder_BitTreeDecoder(6);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean SetDictionarySize(int i) {
        if (i < 0) {
            return false;
        }
        if (this.m_DictionarySize != i) {
            this.m_DictionarySize = i;
            int max = Math.max(i, 1);
            this.m_DictionarySizeCheck = max;
            this.m_OutWindow.Create(Math.max(max, 4096));
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean SetLcLpPb(int i, int i2, int i3) {
        if (i > 8 || i2 > 4 || i3 > 4) {
            return false;
        }
        this.m_LiteralDecoder.Create(i2, i);
        int i4 = 1 << i3;
        this.m_LenDecoder.Create(i4);
        this.m_RepLenDecoder.Create(i4);
        this.m_PosStateMask = i4 - 1;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void Init() throws IOException {
        this.m_OutWindow.Init(false);
        RangeCoder_Decoder.InitBitModels(this.m_IsMatchDecoders);
        RangeCoder_Decoder.InitBitModels(this.m_IsRep0LongDecoders);
        RangeCoder_Decoder.InitBitModels(this.m_IsRepDecoders);
        RangeCoder_Decoder.InitBitModels(this.m_IsRepG0Decoders);
        RangeCoder_Decoder.InitBitModels(this.m_IsRepG1Decoders);
        RangeCoder_Decoder.InitBitModels(this.m_IsRepG2Decoders);
        RangeCoder_Decoder.InitBitModels(this.m_PosDecoders);
        this.m_LiteralDecoder.Init();
        for (int i = 0; i < 4; i++) {
            this.m_PosSlotDecoder[i].Init();
        }
        this.m_LenDecoder.Init();
        this.m_RepLenDecoder.Init();
        this.m_PosAlignDecoder.Init();
        this.m_RangeDecoder.Init();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011c, code lost:
        r0.m_OutWindow.Flush();
        r0.m_OutWindow.ReleaseStream();
        r0.m_RangeDecoder.ReleaseStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Code(java.io.InputStream r18, java.io.OutputStream r19, long r20) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r1 = r0.m_RangeDecoder
            r2 = r18
            r1.SetStream(r2)
            com.alipay.iap.android.aplog.util.zip.LZ_OutWindow r1 = r0.m_OutWindow
            r2 = r19
            r1.SetStream(r2)
            r17.Init()
            int r1 = com.alipay.iap.android.aplog.util.zip.LZMA_Base.StateInit()
            r2 = 0
            r4 = 0
            r5 = r2
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 1
            int r13 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r13 < 0) goto L_0x0029
            int r13 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r13 >= 0) goto L_0x011c
        L_0x0029:
            int r13 = (int) r5
            int r14 = r0.m_PosStateMask
            r14 = r14 & r13
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r15 = r0.m_RangeDecoder
            short[] r2 = r0.m_IsMatchDecoders
            int r3 = r1 << 4
            int r3 = r3 + r14
            int r2 = r15.DecodeBit(r2, r3)
            if (r2 != 0) goto L_0x0069
            com.alipay.iap.android.aplog.util.zip.LZMA_Decoder$LiteralDecoder r2 = r0.m_LiteralDecoder
            com.alipay.iap.android.aplog.util.zip.LZMA_Decoder$LiteralDecoder$Decoder2 r2 = r2.GetDecoder(r13, r7)
            boolean r3 = com.alipay.iap.android.aplog.util.zip.LZMA_Base.StateIsCharState(r1)
            if (r3 != 0) goto L_0x0053
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r3 = r0.m_RangeDecoder
            com.alipay.iap.android.aplog.util.zip.LZ_OutWindow r7 = r0.m_OutWindow
            byte r7 = r7.GetByte(r10)
            byte r2 = r2.DecodeWithMatchByte(r3, r7)
            goto L_0x0059
        L_0x0053:
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r3 = r0.m_RangeDecoder
            byte r2 = r2.DecodeNormal(r3)
        L_0x0059:
            r7 = r2
            com.alipay.iap.android.aplog.util.zip.LZ_OutWindow r2 = r0.m_OutWindow
            r2.PutByte(r7)
            int r1 = com.alipay.iap.android.aplog.util.zip.LZMA_Base.StateUpdateChar(r1)
            r2 = 1
            long r5 = r5 + r2
        L_0x0066:
            r2 = 0
            goto L_0x0020
        L_0x0069:
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r2 = r0.m_RangeDecoder
            short[] r7 = r0.m_IsRepDecoders
            int r2 = r2.DecodeBit(r7, r1)
            if (r2 != r12) goto L_0x00c6
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r2 = r0.m_RangeDecoder
            short[] r7 = r0.m_IsRepG0Decoders
            int r2 = r2.DecodeBit(r7, r1)
            if (r2 != 0) goto L_0x008e
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r2 = r0.m_RangeDecoder
            short[] r7 = r0.m_IsRep0LongDecoders
            int r2 = r2.DecodeBit(r7, r3)
            if (r2 != 0) goto L_0x008c
            int r1 = com.alipay.iap.android.aplog.util.zip.LZMA_Base.StateUpdateShortRep(r1)
            goto L_0x00b4
        L_0x008c:
            r12 = 0
            goto L_0x00b4
        L_0x008e:
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r2 = r0.m_RangeDecoder
            short[] r3 = r0.m_IsRepG1Decoders
            int r2 = r2.DecodeBit(r3, r1)
            if (r2 != 0) goto L_0x0099
            goto L_0x00ae
        L_0x0099:
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r2 = r0.m_RangeDecoder
            short[] r3 = r0.m_IsRepG2Decoders
            int r2 = r2.DecodeBit(r3, r1)
            if (r2 != 0) goto L_0x00a8
            r16 = r11
            r11 = r8
            r8 = r16
        L_0x00a8:
            r16 = r11
            r11 = r8
            r8 = r9
            r9 = r16
        L_0x00ae:
            r12 = 0
            r16 = r10
            r10 = r9
            r9 = r16
        L_0x00b4:
            if (r12 != 0) goto L_0x0131
            com.alipay.iap.android.aplog.util.zip.LZMA_Decoder$LenDecoder r2 = r0.m_RepLenDecoder
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r3 = r0.m_RangeDecoder
            int r2 = r2.Decode(r3, r14)
            int r12 = r2 + 2
            int r1 = com.alipay.iap.android.aplog.util.zip.LZMA_Base.StateUpdateRep(r1)
            goto L_0x0131
        L_0x00c6:
            com.alipay.iap.android.aplog.util.zip.LZMA_Decoder$LenDecoder r2 = r0.m_LenDecoder
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r3 = r0.m_RangeDecoder
            int r2 = r2.Decode(r3, r14)
            int r2 = r2 + 2
            int r1 = com.alipay.iap.android.aplog.util.zip.LZMA_Base.StateUpdateMatch(r1)
            com.alipay.iap.android.aplog.util.zip.RangeCoder_BitTreeDecoder[] r3 = r0.m_PosSlotDecoder
            int r7 = com.alipay.iap.android.aplog.util.zip.LZMA_Base.GetLenToPosState(r2)
            r3 = r3[r7]
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r7 = r0.m_RangeDecoder
            int r3 = r3.Decode(r7)
            r7 = 4
            if (r3 < r7) goto L_0x012c
            int r11 = r3 >> 1
            int r11 = r11 - r12
            r13 = r3 & 1
            r13 = r13 | 2
            int r13 = r13 << r11
            r14 = 14
            if (r3 >= r14) goto L_0x0103
            short[] r7 = r0.m_PosDecoders
            int r3 = r13 - r3
            int r3 = r3 - r12
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r12 = r0.m_RangeDecoder
            int r3 = com.alipay.iap.android.aplog.util.zip.RangeCoder_BitTreeDecoder.ReverseDecode(r7, r3, r12, r11)
            int r13 = r13 + r3
        L_0x00fd:
            r12 = r2
            r11 = r8
            r8 = r9
            r9 = r10
            r10 = r13
            goto L_0x0131
        L_0x0103:
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r3 = r0.m_RangeDecoder
            int r11 = r11 + -4
            int r3 = r3.DecodeDirectBits(r11)
            int r3 = r3 << r7
            int r13 = r13 + r3
            com.alipay.iap.android.aplog.util.zip.RangeCoder_BitTreeDecoder r3 = r0.m_PosAlignDecoder
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r7 = r0.m_RangeDecoder
            int r3 = r3.ReverseDecode(r7)
            int r13 = r13 + r3
            if (r13 >= 0) goto L_0x00fd
            r1 = -1
            if (r13 == r1) goto L_0x011c
            return r4
        L_0x011c:
            com.alipay.iap.android.aplog.util.zip.LZ_OutWindow r1 = r0.m_OutWindow
            r1.Flush()
            com.alipay.iap.android.aplog.util.zip.LZ_OutWindow r1 = r0.m_OutWindow
            r1.ReleaseStream()
            com.alipay.iap.android.aplog.util.zip.RangeCoder_Decoder r1 = r0.m_RangeDecoder
            r1.ReleaseStream()
            return r12
        L_0x012c:
            r12 = r2
            r11 = r8
            r8 = r9
            r9 = r10
            r10 = r3
        L_0x0131:
            long r2 = (long) r10
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x014a
            int r2 = r0.m_DictionarySizeCheck
            if (r10 < r2) goto L_0x013b
            goto L_0x014a
        L_0x013b:
            com.alipay.iap.android.aplog.util.zip.LZ_OutWindow r2 = r0.m_OutWindow
            r2.CopyBlock(r10, r12)
            long r2 = (long) r12
            long r5 = r5 + r2
            com.alipay.iap.android.aplog.util.zip.LZ_OutWindow r2 = r0.m_OutWindow
            byte r7 = r2.GetByte(r4)
            goto L_0x0066
        L_0x014a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.zip.LZMA_Decoder.Code(java.io.InputStream, java.io.OutputStream, long):boolean");
    }

    public boolean SetDecoderProperties(byte[] bArr) {
        if (bArr.length < 5) {
            return false;
        }
        byte b = bArr[0] & 255;
        int i = b % 9;
        int i2 = b / 9;
        int i3 = i2 % 5;
        int i4 = i2 / 5;
        int i5 = 0;
        int i6 = 0;
        while (i5 < 4) {
            int i7 = i5 + 1;
            i6 += (bArr[i7] & 255) << (i5 * 8);
            i5 = i7;
        }
        if (!SetLcLpPb(i, i3, i4)) {
            return false;
        }
        return SetDictionarySize(i6);
    }
}
