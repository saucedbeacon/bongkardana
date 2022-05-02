package com.alipay.iap.android.aplog.util.zip;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class LZMA_Encoder {
    public static final int EMatchFinderTypeBT2 = 0;
    public static final int EMatchFinderTypeBT4 = 1;
    static byte[] g_FastPos = null;
    static final int kDefaultDictionaryLogSize = 22;
    static final int kIfinityPrice = 268435455;
    static final int kNumFastBytesDefault = 32;
    public static final int kNumLenSpecSymbols = 16;
    static final int kNumOpts = 4096;
    public static final int kPropSize = 5;
    int _additionalOffset;
    int _alignPriceCount;
    int[] _alignPrices = new int[16];
    int _dictionarySize;
    int _dictionarySizePrev;
    int _distTableSize = 44;
    int[] _distancesPrices = new int[512];
    boolean _finished;
    InputStream _inStream;
    short[] _isMatch = new short[PsExtractor.AUDIO_STREAM];
    short[] _isRep = new short[12];
    short[] _isRep0Long = new short[PsExtractor.AUDIO_STREAM];
    short[] _isRepG0 = new short[12];
    short[] _isRepG1 = new short[12];
    short[] _isRepG2 = new short[12];
    LenPriceTableEncoder _lenEncoder = new LenPriceTableEncoder();
    LiteralEncoder _literalEncoder = new LiteralEncoder();
    int _longestMatchLength;
    boolean _longestMatchWasFound;
    int[] _matchDistances = new int[548];
    LZ_BinTree _matchFinder = null;
    int _matchFinderType;
    int _matchPriceCount;
    boolean _needReleaseMFStream;
    int _numDistancePairs;
    int _numFastBytes = 32;
    int _numFastBytesPrev;
    int _numLiteralContextBits;
    int _numLiteralPosStateBits;
    Optimal[] _optimum = new Optimal[4096];
    int _optimumCurrentIndex;
    int _optimumEndIndex;
    RangeCoder_BitTreeEncoder _posAlignEncoder = new RangeCoder_BitTreeEncoder(4);
    short[] _posEncoders = new short[114];
    RangeCoder_BitTreeEncoder[] _posSlotEncoder = new RangeCoder_BitTreeEncoder[4];
    int[] _posSlotPrices = new int[256];
    int _posStateBits = 2;
    int _posStateMask = 3;
    byte _previousByte;
    RangeCoder_Encoder _rangeEncoder = new RangeCoder_Encoder();
    int[] _repDistances = new int[4];
    LenPriceTableEncoder _repMatchLenEncoder = new LenPriceTableEncoder();
    int _state = LZMA_Base.StateInit();
    boolean _writeEndMark;
    int backRes;
    boolean[] finished;
    long nowPos64;
    long[] processedInSize;
    long[] processedOutSize;
    byte[] properties;
    int[] repLens;
    int[] reps;
    int[] tempPrices;

    /* access modifiers changed from: package-private */
    public boolean ChangePair(int i, int i2) {
        return i < 33554432 && i2 >= (i << 7);
    }

    public boolean SetAlgorithm(int i) {
        return true;
    }

    static {
        byte[] bArr = new byte[2048];
        g_FastPos = bArr;
        bArr[0] = 0;
        bArr[1] = 1;
        int i = 2;
        for (int i2 = 2; i2 < 22; i2++) {
            int i3 = 1 << ((i2 >> 1) - 1);
            int i4 = 0;
            while (i4 < i3) {
                g_FastPos[i] = (byte) i2;
                i4++;
                i++;
            }
        }
    }

    static int GetPosSlot(int i) {
        if (i < 2048) {
            return g_FastPos[i];
        }
        if (i < 2097152) {
            return g_FastPos[i >> 10] + Ascii.DC4;
        }
        return g_FastPos[i >> 20] + 40;
    }

    static int GetPosSlot2(int i) {
        if (i < 131072) {
            return g_FastPos[i >> 6] + Ascii.FF;
        }
        if (i < 134217728) {
            return g_FastPos[i >> 16] + 32;
        }
        return g_FastPos[i >> 26] + 52;
    }

    /* access modifiers changed from: package-private */
    public void BaseInit() {
        this._state = LZMA_Base.StateInit();
        this._previousByte = 0;
        for (int i = 0; i < 4; i++) {
            this._repDistances[i] = 0;
        }
    }

    class LiteralEncoder {
        Encoder2[] m_Coders;
        int m_NumPosBits;
        int m_NumPrevBits;
        int m_PosMask;

        class Encoder2 {
            short[] m_Encoders = new short[768];

            Encoder2() {
            }

            public void Init() {
                RangeCoder_Encoder.InitBitModels(this.m_Encoders);
            }

            public void Encode(RangeCoder_Encoder rangeCoder_Encoder, byte b) throws IOException {
                int i = 1;
                for (int i2 = 7; i2 >= 0; i2--) {
                    int i3 = (b >> i2) & 1;
                    rangeCoder_Encoder.Encode(this.m_Encoders, i, i3);
                    i = (i << 1) | i3;
                }
            }

            public void EncodeMatched(RangeCoder_Encoder rangeCoder_Encoder, byte b, byte b2) throws IOException {
                int i;
                int i2 = 1;
                boolean z = true;
                for (int i3 = 7; i3 >= 0; i3--) {
                    int i4 = (b2 >> i3) & 1;
                    if (z) {
                        int i5 = (b >> i3) & 1;
                        i = ((i5 + 1) << 8) + i2;
                        z = i5 == i4;
                    } else {
                        i = i2;
                    }
                    rangeCoder_Encoder.Encode(this.m_Encoders, i, i4);
                    i2 = (i2 << 1) | i4;
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public int GetPrice(boolean r8, byte r9, byte r10) {
                /*
                    r7 = this;
                    r0 = 1
                    r1 = 0
                    r2 = 7
                    if (r8 == 0) goto L_0x0025
                    r8 = 1
                L_0x0006:
                    if (r2 < 0) goto L_0x0026
                    int r3 = r9 >> r2
                    r3 = r3 & r0
                    int r4 = r10 >> r2
                    r4 = r4 & r0
                    short[] r5 = r7.m_Encoders
                    int r6 = r3 + 1
                    int r6 = r6 << 8
                    int r6 = r6 + r8
                    short r5 = r5[r6]
                    int r5 = com.alipay.iap.android.aplog.util.zip.RangeCoder_Encoder.GetPrice(r5, r4)
                    int r1 = r1 + r5
                    int r8 = r8 << 1
                    r8 = r8 | r4
                    if (r3 == r4) goto L_0x0022
                    goto L_0x0036
                L_0x0022:
                    int r2 = r2 + -1
                    goto L_0x0006
                L_0x0025:
                    r8 = 1
                L_0x0026:
                    if (r2 < 0) goto L_0x0039
                    int r9 = r10 >> r2
                    r9 = r9 & r0
                    short[] r3 = r7.m_Encoders
                    short r3 = r3[r8]
                    int r3 = com.alipay.iap.android.aplog.util.zip.RangeCoder_Encoder.GetPrice(r3, r9)
                    int r1 = r1 + r3
                    int r8 = r8 << r0
                    r8 = r8 | r9
                L_0x0036:
                    int r2 = r2 + -1
                    goto L_0x0026
                L_0x0039:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.zip.LZMA_Encoder.LiteralEncoder.Encoder2.GetPrice(boolean, byte, byte):int");
            }
        }

        LiteralEncoder() {
        }

        public void Create(int i, int i2) {
            if (this.m_Coders == null || this.m_NumPrevBits != i2 || this.m_NumPosBits != i) {
                this.m_NumPosBits = i;
                this.m_PosMask = (1 << i) - 1;
                this.m_NumPrevBits = i2;
                int i3 = 1 << (i2 + i);
                this.m_Coders = new Encoder2[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    this.m_Coders[i4] = new Encoder2();
                }
            }
        }

        public void Init() {
            int i = 1 << (this.m_NumPrevBits + this.m_NumPosBits);
            for (int i2 = 0; i2 < i; i2++) {
                this.m_Coders[i2].Init();
            }
        }

        public Encoder2 GetSubCoder(int i, byte b) {
            Encoder2[] encoder2Arr = this.m_Coders;
            int i2 = i & this.m_PosMask;
            int i3 = this.m_NumPrevBits;
            return encoder2Arr[(i2 << i3) + ((b & 255) >>> (8 - i3))];
        }
    }

    class LenEncoder {
        short[] _choice = new short[2];
        RangeCoder_BitTreeEncoder _highCoder = new RangeCoder_BitTreeEncoder(8);
        RangeCoder_BitTreeEncoder[] _lowCoder = new RangeCoder_BitTreeEncoder[16];
        RangeCoder_BitTreeEncoder[] _midCoder = new RangeCoder_BitTreeEncoder[16];

        public LenEncoder() {
            for (int i = 0; i < 16; i++) {
                this._lowCoder[i] = new RangeCoder_BitTreeEncoder(3);
                this._midCoder[i] = new RangeCoder_BitTreeEncoder(3);
            }
        }

        public void Init(int i) {
            RangeCoder_Encoder.InitBitModels(this._choice);
            for (int i2 = 0; i2 < i; i2++) {
                this._lowCoder[i2].Init();
                this._midCoder[i2].Init();
            }
            this._highCoder.Init();
        }

        public void Encode(RangeCoder_Encoder rangeCoder_Encoder, int i, int i2) throws IOException {
            if (i < 8) {
                rangeCoder_Encoder.Encode(this._choice, 0, 0);
                this._lowCoder[i2].Encode(rangeCoder_Encoder, i);
                return;
            }
            int i3 = i - 8;
            rangeCoder_Encoder.Encode(this._choice, 0, 1);
            if (i3 < 8) {
                rangeCoder_Encoder.Encode(this._choice, 1, 0);
                this._midCoder[i2].Encode(rangeCoder_Encoder, i3);
                return;
            }
            rangeCoder_Encoder.Encode(this._choice, 1, 1);
            this._highCoder.Encode(rangeCoder_Encoder, i3 - 8);
        }

        public void SetPrices(int i, int i2, int[] iArr, int i3) {
            int i4 = 0;
            int GetPrice0 = RangeCoder_Encoder.GetPrice0(this._choice[0]);
            int GetPrice1 = RangeCoder_Encoder.GetPrice1(this._choice[0]);
            int GetPrice02 = RangeCoder_Encoder.GetPrice0(this._choice[1]) + GetPrice1;
            int GetPrice12 = GetPrice1 + RangeCoder_Encoder.GetPrice1(this._choice[1]);
            while (i4 < 8) {
                if (i4 < i2) {
                    iArr[i3 + i4] = this._lowCoder[i].GetPrice(i4) + GetPrice0;
                    i4++;
                } else {
                    return;
                }
            }
            while (i4 < 16) {
                if (i4 < i2) {
                    iArr[i3 + i4] = this._midCoder[i].GetPrice(i4 - 8) + GetPrice02;
                    i4++;
                } else {
                    return;
                }
            }
            while (i4 < i2) {
                iArr[i3 + i4] = this._highCoder.GetPrice((i4 - 8) - 8) + GetPrice12;
                i4++;
            }
        }
    }

    class LenPriceTableEncoder extends LenEncoder {
        int[] _counters = new int[16];
        int[] _prices = new int[4352];
        int _tableSize;

        LenPriceTableEncoder() {
            super();
        }

        public void SetTableSize(int i) {
            this._tableSize = i;
        }

        public int GetPrice(int i, int i2) {
            return this._prices[(i2 * LZMA_Base.kNumLenSymbols) + i];
        }

        /* access modifiers changed from: package-private */
        public void UpdateTable(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-2019375878, oncanceled);
                onCancelLoad.getMin(-2019375878, oncanceled);
            }
            SetPrices(i, this._tableSize, this._prices, i * LZMA_Base.kNumLenSymbols);
            this._counters[i] = this._tableSize;
        }

        public void UpdateTables(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                UpdateTable(i2);
            }
        }

        public void Encode(RangeCoder_Encoder rangeCoder_Encoder, int i, int i2) throws IOException {
            super.Encode(rangeCoder_Encoder, i, i2);
            int[] iArr = this._counters;
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 == 0) {
                UpdateTable(i2);
            }
        }
    }

    class Optimal {
        public int BackPrev;
        public int BackPrev2;
        public int Backs0;
        public int Backs1;
        public int Backs2;
        public int Backs3;
        public int PosPrev;
        public int PosPrev2;
        public boolean Prev1IsChar;
        public boolean Prev2;
        public int Price;
        public int State;

        Optimal() {
        }

        public void MakeAsChar() {
            this.BackPrev = -1;
            this.Prev1IsChar = false;
        }

        public void MakeAsShortRep() {
            this.BackPrev = 0;
            this.Prev1IsChar = false;
        }

        public boolean IsShortRep() {
            return this.BackPrev == 0;
        }
    }

    /* access modifiers changed from: package-private */
    public void Create() {
        if (this._matchFinder == null) {
            LZ_BinTree lZ_BinTree = new LZ_BinTree();
            int i = 4;
            if (this._matchFinderType == 0) {
                i = 2;
            }
            lZ_BinTree.SetType(i);
            this._matchFinder = lZ_BinTree;
        }
        this._literalEncoder.Create(this._numLiteralPosStateBits, this._numLiteralContextBits);
        if (this._dictionarySize != this._dictionarySizePrev || this._numFastBytesPrev != this._numFastBytes) {
            this._matchFinder.Create(this._dictionarySize, 4096, this._numFastBytes, 274);
            this._dictionarySizePrev = this._dictionarySize;
            this._numFastBytesPrev = this._numFastBytes;
        }
    }

    public LZMA_Encoder() {
        this._numLiteralPosStateBits = 0;
        this._numLiteralContextBits = 3;
        this._dictionarySize = 4194304;
        this._dictionarySizePrev = -1;
        this._numFastBytesPrev = -1;
        this._matchFinderType = 1;
        this._writeEndMark = false;
        this._needReleaseMFStream = false;
        this.reps = new int[4];
        this.repLens = new int[4];
        this.processedInSize = new long[1];
        this.processedOutSize = new long[1];
        this.finished = new boolean[1];
        this.properties = new byte[5];
        this.tempPrices = new int[128];
        for (int i = 0; i < 4096; i++) {
            this._optimum[i] = new Optimal();
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this._posSlotEncoder[i2] = new RangeCoder_BitTreeEncoder(6);
        }
    }

    /* access modifiers changed from: package-private */
    public void SetWriteEndMarkerMode(boolean z) {
        this._writeEndMark = z;
    }

    /* access modifiers changed from: package-private */
    public void Init() {
        BaseInit();
        this._rangeEncoder.Init();
        RangeCoder_Encoder.InitBitModels(this._isMatch);
        RangeCoder_Encoder.InitBitModels(this._isRep0Long);
        RangeCoder_Encoder.InitBitModels(this._isRep);
        RangeCoder_Encoder.InitBitModels(this._isRepG0);
        RangeCoder_Encoder.InitBitModels(this._isRepG1);
        RangeCoder_Encoder.InitBitModels(this._isRepG2);
        RangeCoder_Encoder.InitBitModels(this._posEncoders);
        this._literalEncoder.Init();
        for (int i = 0; i < 4; i++) {
            this._posSlotEncoder[i].Init();
        }
        this._lenEncoder.Init(1 << this._posStateBits);
        this._repMatchLenEncoder.Init(1 << this._posStateBits);
        this._posAlignEncoder.Init();
        this._longestMatchWasFound = false;
        this._optimumEndIndex = 0;
        this._optimumCurrentIndex = 0;
        this._additionalOffset = 0;
    }

    /* access modifiers changed from: package-private */
    public int ReadMatchDistances() throws IOException {
        int i;
        int GetMatches = this._matchFinder.GetMatches(this._matchDistances);
        this._numDistancePairs = GetMatches;
        if (GetMatches > 0) {
            int[] iArr = this._matchDistances;
            i = iArr[GetMatches - 2];
            if (i == this._numFastBytes) {
                i += this._matchFinder.GetMatchLen(i - 1, iArr[GetMatches - 1], 273 - i);
            }
        } else {
            i = 0;
        }
        this._additionalOffset++;
        return i;
    }

    /* access modifiers changed from: package-private */
    public void MovePos(int i) throws IOException {
        if (i > 0) {
            this._matchFinder.Skip(i);
            this._additionalOffset += i;
        }
    }

    /* access modifiers changed from: package-private */
    public int GetRepLen1Price(int i, int i2) {
        return RangeCoder_Encoder.GetPrice0(this._isRepG0[i]) + RangeCoder_Encoder.GetPrice0(this._isRep0Long[(i << 4) + i2]);
    }

    /* access modifiers changed from: package-private */
    public int GetPureRepPrice(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return RangeCoder_Encoder.GetPrice0(this._isRepG0[i2]) + RangeCoder_Encoder.GetPrice1(this._isRep0Long[(i2 << 4) + i3]);
        }
        int GetPrice1 = RangeCoder_Encoder.GetPrice1(this._isRepG0[i2]);
        if (i == 1) {
            i4 = RangeCoder_Encoder.GetPrice0(this._isRepG1[i2]);
        } else {
            GetPrice1 += RangeCoder_Encoder.GetPrice1(this._isRepG1[i2]);
            i4 = RangeCoder_Encoder.GetPrice(this._isRepG2[i2], i - 2);
        }
        return i4 + GetPrice1;
    }

    /* access modifiers changed from: package-private */
    public int GetRepPrice(int i, int i2, int i3, int i4) {
        return this._repMatchLenEncoder.GetPrice(i2 - 2, i4) + GetPureRepPrice(i, i3, i4);
    }

    /* access modifiers changed from: package-private */
    public int GetPosLenPrice(int i, int i2, int i3) {
        int i4;
        int GetLenToPosState = LZMA_Base.GetLenToPosState(i2);
        if (i < 128) {
            i4 = this._distancesPrices[(GetLenToPosState * 128) + i];
        } else {
            i4 = this._alignPrices[i & 15] + this._posSlotPrices[(GetLenToPosState << 6) + GetPosSlot2(i)];
        }
        return i4 + this._lenEncoder.GetPrice(i2 - 2, i3);
    }

    /* access modifiers changed from: package-private */
    public int Backward(int i) {
        this._optimumEndIndex = i;
        int i2 = this._optimum[i].PosPrev;
        int i3 = this._optimum[i].BackPrev;
        while (true) {
            if (this._optimum[i].Prev1IsChar) {
                this._optimum[i2].MakeAsChar();
                int i4 = i2 - 1;
                this._optimum[i2].PosPrev = i4;
                if (this._optimum[i].Prev2) {
                    this._optimum[i4].Prev1IsChar = false;
                    Optimal[] optimalArr = this._optimum;
                    optimalArr[i4].PosPrev = optimalArr[i].PosPrev2;
                    Optimal[] optimalArr2 = this._optimum;
                    optimalArr2[i4].BackPrev = optimalArr2[i].BackPrev2;
                }
            }
            int i5 = this._optimum[i2].BackPrev;
            int i6 = this._optimum[i2].PosPrev;
            this._optimum[i2].BackPrev = i3;
            this._optimum[i2].PosPrev = i;
            if (i2 <= 0) {
                this.backRes = this._optimum[0].BackPrev;
                int i7 = this._optimum[0].PosPrev;
                this._optimumCurrentIndex = i7;
                return i7;
            }
            i = i2;
            i3 = i5;
            i2 = i6;
        }
    }

    /* access modifiers changed from: package-private */
    public int GetOptimum(int i) throws IOException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int GetMatchLen;
        int i18;
        int[] iArr;
        int i19;
        int i20;
        int GetMatchLen2;
        int i21;
        int GetMatchLen3;
        int i22;
        int i23;
        int i24;
        int i25;
        int GetRepLen1Price;
        int i26 = i;
        int i27 = this._optimumEndIndex;
        int i28 = this._optimumCurrentIndex;
        if (i27 != i28) {
            int i29 = this._optimum[i28].PosPrev;
            int i30 = this._optimumCurrentIndex;
            int i31 = i29 - i30;
            this.backRes = this._optimum[i30].BackPrev;
            this._optimumCurrentIndex = this._optimum[this._optimumCurrentIndex].PosPrev;
            return i31;
        }
        char c = 0;
        this._optimumEndIndex = 0;
        this._optimumCurrentIndex = 0;
        if (!this._longestMatchWasFound) {
            i2 = ReadMatchDistances();
        } else {
            i2 = this._longestMatchLength;
            this._longestMatchWasFound = false;
        }
        int i32 = this._numDistancePairs;
        int i33 = 2;
        if (this._matchFinder.GetNumAvailableBytes() + 1 < 2) {
            this.backRes = -1;
            return 1;
        }
        int i34 = 0;
        int i35 = 0;
        while (true) {
            i3 = 4;
            if (i34 >= 4) {
                break;
            }
            int[] iArr2 = this.reps;
            iArr2[i34] = this._repDistances[i34];
            this.repLens[i34] = this._matchFinder.GetMatchLen(-1, iArr2[i34], LZMA_Base.kMatchMaxLen);
            int[] iArr3 = this.repLens;
            if (iArr3[i34] > iArr3[i35]) {
                i35 = i34;
            }
            i34++;
        }
        int[] iArr4 = this.repLens;
        int i36 = iArr4[i35];
        int i37 = this._numFastBytes;
        if (i36 >= i37) {
            this.backRes = i35;
            int i38 = iArr4[i35];
            MovePos(i38 - 1);
            return i38;
        } else if (i2 >= i37) {
            this.backRes = this._matchDistances[i32 - 1] + 4;
            MovePos(i2 - 1);
            return i2;
        } else {
            byte GetIndexByte = this._matchFinder.GetIndexByte(-1);
            byte GetIndexByte2 = this._matchFinder.GetIndexByte(((0 - this._repDistances[0]) - 1) - 1);
            if (i2 >= 2 || GetIndexByte == GetIndexByte2 || this.repLens[i35] >= 2) {
                this._optimum[0].State = this._state;
                int i39 = this._posStateMask & i26;
                this._optimum[1].Price = RangeCoder_Encoder.GetPrice0(this._isMatch[(this._state << 4) + i39]) + this._literalEncoder.GetSubCoder(i26, this._previousByte).GetPrice(!LZMA_Base.StateIsCharState(this._state), GetIndexByte2, GetIndexByte);
                this._optimum[1].MakeAsChar();
                int GetPrice1 = RangeCoder_Encoder.GetPrice1(this._isMatch[(this._state << 4) + i39]);
                int GetPrice12 = RangeCoder_Encoder.GetPrice1(this._isRep[this._state]) + GetPrice1;
                if (GetIndexByte2 == GetIndexByte && (GetRepLen1Price = GetRepLen1Price(this._state, i39) + GetPrice12) < this._optimum[1].Price) {
                    this._optimum[1].Price = GetRepLen1Price;
                    this._optimum[1].MakeAsShortRep();
                }
                int[] iArr5 = this.repLens;
                int i40 = i2 >= iArr5[i35] ? i2 : iArr5[i35];
                if (i40 < 2) {
                    this.backRes = this._optimum[1].BackPrev;
                    return 1;
                }
                this._optimum[1].PosPrev = 0;
                this._optimum[0].Backs0 = this.reps[0];
                this._optimum[0].Backs1 = this.reps[1];
                this._optimum[0].Backs2 = this.reps[2];
                this._optimum[0].Backs3 = this.reps[3];
                int i41 = i40;
                while (true) {
                    int i42 = i41 - 1;
                    this._optimum[i41].Price = kIfinityPrice;
                    if (i42 < 2) {
                        break;
                    }
                    i41 = i42;
                    i3 = 4;
                }
                int i43 = 0;
                while (i43 < i3) {
                    int i44 = this.repLens[i43];
                    if (i44 >= 2) {
                        int GetPureRepPrice = GetPureRepPrice(i43, this._state, i39) + GetPrice12;
                        while (true) {
                            int GetPrice = this._repMatchLenEncoder.GetPrice(i44 - 2, i39) + GetPureRepPrice;
                            Optimal optimal = this._optimum[i44];
                            if (GetPrice < optimal.Price) {
                                optimal.Price = GetPrice;
                                optimal.PosPrev = 0;
                                optimal.BackPrev = i43;
                                optimal.Prev1IsChar = false;
                            }
                            i44--;
                            if (i44 < 2) {
                                break;
                            }
                        }
                    }
                    i43++;
                    i3 = 4;
                }
                int GetPrice0 = GetPrice1 + RangeCoder_Encoder.GetPrice0(this._isRep[this._state]);
                int[] iArr6 = this.repLens;
                int i45 = iArr6[0] >= 2 ? iArr6[0] + 1 : 2;
                if (i45 <= i2) {
                    int i46 = 0;
                    while (i45 > this._matchDistances[i46]) {
                        i46 += 2;
                    }
                    while (true) {
                        int i47 = this._matchDistances[i46 + 1];
                        int GetPosLenPrice = GetPosLenPrice(i47, i45, i39) + GetPrice0;
                        Optimal optimal2 = this._optimum[i45];
                        if (GetPosLenPrice < optimal2.Price) {
                            optimal2.Price = GetPosLenPrice;
                            optimal2.PosPrev = 0;
                            optimal2.BackPrev = i47 + 4;
                            optimal2.Prev1IsChar = false;
                        }
                        if (i45 == this._matchDistances[i46] && (i46 = i46 + 2) == i32) {
                            break;
                        }
                        i45++;
                    }
                }
                int i48 = 0;
                boolean z2 = true;
                while (true) {
                    i48 += z2 ? 1 : 0;
                    if (i48 == i40) {
                        return Backward(i48);
                    }
                    int ReadMatchDistances = ReadMatchDistances();
                    int i49 = this._numDistancePairs;
                    if (ReadMatchDistances >= this._numFastBytes) {
                        this._longestMatchLength = ReadMatchDistances;
                        this._longestMatchWasFound = z2;
                        return Backward(i48);
                    }
                    i26 += z2;
                    int i50 = this._optimum[i48].PosPrev;
                    if (this._optimum[i48].Prev1IsChar) {
                        i50--;
                        if (this._optimum[i48].Prev2) {
                            Optimal[] optimalArr = this._optimum;
                            int i51 = optimalArr[optimalArr[i48].PosPrev2].State;
                            if (this._optimum[i48].BackPrev2 < 4) {
                                i25 = LZMA_Base.StateUpdateRep(i51);
                            } else {
                                i25 = LZMA_Base.StateUpdateMatch(i51);
                            }
                        } else {
                            i25 = this._optimum[i50].State;
                        }
                        i4 = LZMA_Base.StateUpdateChar(i25);
                    } else {
                        i4 = this._optimum[i50].State;
                    }
                    if (i50 != i48 - 1) {
                        if (!this._optimum[i48].Prev1IsChar || !this._optimum[i48].Prev2) {
                            i23 = this._optimum[i48].BackPrev;
                            i22 = 4;
                            if (i23 < 4) {
                                i24 = LZMA_Base.StateUpdateRep(i4);
                            } else {
                                i24 = LZMA_Base.StateUpdateMatch(i4);
                            }
                        } else {
                            i50 = this._optimum[i48].PosPrev2;
                            i23 = this._optimum[i48].BackPrev2;
                            i24 = LZMA_Base.StateUpdateRep(i4);
                            i22 = 4;
                        }
                        Optimal optimal3 = this._optimum[i50];
                        if (i23 >= i22) {
                            int[] iArr7 = this.reps;
                            iArr7[c] = i23 - 4;
                            iArr7[1] = optimal3.Backs0;
                            this.reps[i33] = optimal3.Backs1;
                            this.reps[3] = optimal3.Backs2;
                        } else if (i23 == 0) {
                            this.reps[c] = optimal3.Backs0;
                            this.reps[1] = optimal3.Backs1;
                            this.reps[i33] = optimal3.Backs2;
                            this.reps[3] = optimal3.Backs3;
                        } else if (i23 == 1) {
                            this.reps[c] = optimal3.Backs1;
                            this.reps[1] = optimal3.Backs0;
                            this.reps[i33] = optimal3.Backs2;
                            this.reps[3] = optimal3.Backs3;
                        } else if (i23 == i33) {
                            this.reps[c] = optimal3.Backs2;
                            this.reps[1] = optimal3.Backs0;
                            this.reps[i33] = optimal3.Backs1;
                            this.reps[3] = optimal3.Backs3;
                        } else {
                            this.reps[c] = optimal3.Backs3;
                            this.reps[1] = optimal3.Backs0;
                            this.reps[i33] = optimal3.Backs1;
                            this.reps[3] = optimal3.Backs2;
                        }
                        i5 = i24;
                    } else if (this._optimum[i48].IsShortRep()) {
                        i5 = LZMA_Base.StateUpdateShortRep(i4);
                    } else {
                        i5 = LZMA_Base.StateUpdateChar(i4);
                    }
                    this._optimum[i48].State = i5;
                    this._optimum[i48].Backs0 = this.reps[c];
                    this._optimum[i48].Backs1 = this.reps[1];
                    this._optimum[i48].Backs2 = this.reps[i33];
                    this._optimum[i48].Backs3 = this.reps[3];
                    int i52 = this._optimum[i48].Price;
                    byte GetIndexByte3 = this._matchFinder.GetIndexByte(-1);
                    byte GetIndexByte4 = this._matchFinder.GetIndexByte(((0 - this.reps[c]) - 1) - 1);
                    int i53 = this._posStateMask & i26;
                    int i54 = (i5 << 4) + i53;
                    int GetPrice02 = RangeCoder_Encoder.GetPrice0(this._isMatch[i54]) + i52 + this._literalEncoder.GetSubCoder(i26, this._matchFinder.GetIndexByte(-2)).GetPrice(!LZMA_Base.StateIsCharState(i5), GetIndexByte4, GetIndexByte3);
                    int i55 = i48 + 1;
                    Optimal optimal4 = this._optimum[i55];
                    if (GetPrice02 < optimal4.Price) {
                        optimal4.Price = GetPrice02;
                        optimal4.PosPrev = i48;
                        optimal4.MakeAsChar();
                        i6 = i40;
                        z = true;
                    } else {
                        i6 = i40;
                        z = false;
                    }
                    int GetPrice13 = i52 + RangeCoder_Encoder.GetPrice1(this._isMatch[i54]);
                    int GetPrice14 = RangeCoder_Encoder.GetPrice1(this._isRep[i5]) + GetPrice13;
                    if (GetIndexByte4 != GetIndexByte3 || (optimal4.PosPrev < i48 && optimal4.BackPrev == 0)) {
                        i7 = i49;
                    } else {
                        int GetRepLen1Price2 = GetRepLen1Price(i5, i53) + GetPrice14;
                        i7 = i49;
                        if (GetRepLen1Price2 <= optimal4.Price) {
                            optimal4.Price = GetRepLen1Price2;
                            optimal4.PosPrev = i48;
                            optimal4.MakeAsShortRep();
                            z = true;
                        }
                    }
                    int min = Math.min(4095 - i48, this._matchFinder.GetNumAvailableBytes() + 1);
                    if (min >= 2) {
                        int i56 = this._numFastBytes;
                        if (min <= i56) {
                            i56 = min;
                        }
                        if (z || GetIndexByte4 == GetIndexByte3 || (GetMatchLen3 = this._matchFinder.GetMatchLen(0, this.reps[0], Math.min(min - 1, this._numFastBytes))) < 2) {
                            i9 = ReadMatchDistances;
                            i10 = GetPrice13;
                            i11 = i6;
                        } else {
                            int StateUpdateChar = LZMA_Base.StateUpdateChar(i5);
                            int i57 = (i26 + 1) & this._posStateMask;
                            int GetPrice15 = GetPrice02 + RangeCoder_Encoder.GetPrice1(this._isMatch[(StateUpdateChar << 4) + i57]) + RangeCoder_Encoder.GetPrice1(this._isRep[StateUpdateChar]);
                            int i58 = i55 + GetMatchLen3;
                            i10 = GetPrice13;
                            i11 = i6;
                            while (i11 < i58) {
                                int i59 = i11 + 1;
                                this._optimum[i59].Price = kIfinityPrice;
                                i11 = i59;
                                ReadMatchDistances = ReadMatchDistances;
                            }
                            i9 = ReadMatchDistances;
                            int GetRepPrice = GetPrice15 + GetRepPrice(0, GetMatchLen3, StateUpdateChar, i57);
                            Optimal optimal5 = this._optimum[i58];
                            if (GetRepPrice < optimal5.Price) {
                                optimal5.Price = GetRepPrice;
                                optimal5.PosPrev = i55;
                                optimal5.BackPrev = 0;
                                optimal5.Prev1IsChar = true;
                                optimal5.Prev2 = false;
                            }
                        }
                        int i60 = 2;
                        int i61 = 0;
                        while (i61 < 4) {
                            int GetMatchLen4 = this._matchFinder.GetMatchLen(-1, this.reps[i61], i56);
                            if (GetMatchLen4 >= 2) {
                                int i62 = GetMatchLen4;
                                while (true) {
                                    int i63 = i48 + i62;
                                    if (i11 < i63) {
                                        i11++;
                                        this._optimum[i11].Price = kIfinityPrice;
                                    } else {
                                        int GetRepPrice2 = GetRepPrice(i61, i62, i5, i53) + GetPrice14;
                                        Optimal optimal6 = this._optimum[i63];
                                        if (GetRepPrice2 < optimal6.Price) {
                                            optimal6.Price = GetRepPrice2;
                                            optimal6.PosPrev = i48;
                                            optimal6.BackPrev = i61;
                                            optimal6.Prev1IsChar = false;
                                        }
                                        i62--;
                                        if (i62 < 2) {
                                            break;
                                        }
                                        int i64 = i11;
                                    }
                                }
                                if (i61 == 0) {
                                    i60 = GetMatchLen4 + 1;
                                }
                                if (GetMatchLen4 >= min || (GetMatchLen2 = this._matchFinder.GetMatchLen(GetMatchLen4, this.reps[i61], Math.min((min - 1) - GetMatchLen4, this._numFastBytes))) < 2) {
                                    i19 = i26;
                                    i20 = GetPrice14;
                                    i60 = i60;
                                    i11 = i11;
                                } else {
                                    int StateUpdateRep = LZMA_Base.StateUpdateRep(i5);
                                    int i65 = i26 + GetMatchLen4;
                                    i20 = GetPrice14;
                                    int i66 = i60;
                                    int i67 = GetMatchLen4 - 1;
                                    i19 = i26;
                                    int GetRepPrice3 = GetPrice14 + GetRepPrice(i61, GetMatchLen4, i5, i53) + RangeCoder_Encoder.GetPrice0(this._isMatch[(StateUpdateRep << 4) + (this._posStateMask & i65)]) + this._literalEncoder.GetSubCoder(i65, this._matchFinder.GetIndexByte(i67 - 1)).GetPrice(true, this._matchFinder.GetIndexByte(i67 - (this.reps[i61] + 1)), this._matchFinder.GetIndexByte(i67));
                                    int StateUpdateChar2 = LZMA_Base.StateUpdateChar(StateUpdateRep);
                                    int i68 = this._posStateMask & (i65 + 1);
                                    int GetPrice16 = GetRepPrice3 + RangeCoder_Encoder.GetPrice1(this._isMatch[(StateUpdateChar2 << 4) + i68]) + RangeCoder_Encoder.GetPrice1(this._isRep[StateUpdateChar2]);
                                    int i69 = GetMatchLen4 + 1 + GetMatchLen2;
                                    int i70 = i11;
                                    while (true) {
                                        i21 = i48 + i69;
                                        if (i11 >= i21) {
                                            break;
                                        }
                                        i70 = i11 + 1;
                                        this._optimum[i70].Price = kIfinityPrice;
                                    }
                                    int GetRepPrice4 = GetPrice16 + GetRepPrice(0, GetMatchLen2, StateUpdateChar2, i68);
                                    Optimal optimal7 = this._optimum[i21];
                                    if (GetRepPrice4 < optimal7.Price) {
                                        optimal7.Price = GetRepPrice4;
                                        optimal7.PosPrev = GetMatchLen4 + i48 + 1;
                                        optimal7.BackPrev = 0;
                                        optimal7.Prev1IsChar = true;
                                        optimal7.Prev2 = true;
                                        optimal7.PosPrev2 = i48;
                                        optimal7.BackPrev2 = i61;
                                    }
                                    i60 = i66;
                                }
                            } else {
                                i19 = i26;
                                i20 = GetPrice14;
                            }
                            i61++;
                            GetPrice14 = i20;
                            i26 = i19;
                        }
                        int i71 = i26;
                        int i72 = i9;
                        if (i72 > i56) {
                            int i73 = 0;
                            while (true) {
                                iArr = this._matchDistances;
                                if (i56 <= iArr[i73]) {
                                    break;
                                }
                                i73 += 2;
                            }
                            iArr[i73] = i56;
                            int i74 = i56;
                            i12 = i73 + 2;
                            i72 = i74;
                        } else {
                            i12 = i7;
                        }
                        if (i72 >= i60) {
                            int GetPrice03 = i10 + RangeCoder_Encoder.GetPrice0(this._isRep[i5]);
                            while (i11 < i48 + i72) {
                                i11++;
                                this._optimum[i11].Price = kIfinityPrice;
                            }
                            int i75 = 0;
                            while (i60 > this._matchDistances[i75]) {
                                i75 += 2;
                            }
                            while (true) {
                                int i76 = this._matchDistances[i75 + 1];
                                int GetPosLenPrice2 = GetPosLenPrice(i76, i60, i53) + GetPrice03;
                                int i77 = i48 + i60;
                                Optimal optimal8 = this._optimum[i77];
                                if (GetPosLenPrice2 < optimal8.Price) {
                                    optimal8.Price = GetPosLenPrice2;
                                    optimal8.PosPrev = i48;
                                    optimal8.BackPrev = i76 + 4;
                                    optimal8.Prev1IsChar = false;
                                }
                                if (i60 == this._matchDistances[i75]) {
                                    if (i60 >= min || (GetMatchLen = this._matchFinder.GetMatchLen(i60, i76, Math.min((min - 1) - i60, this._numFastBytes))) < 2) {
                                        i16 = min;
                                        i15 = i5;
                                        i13 = GetPrice03;
                                        i14 = i53;
                                        i17 = i11;
                                    } else {
                                        int StateUpdateMatch = LZMA_Base.StateUpdateMatch(i5);
                                        int i78 = i71 + i60;
                                        i16 = min;
                                        i15 = i5;
                                        i13 = GetPrice03;
                                        int i79 = i60 - 1;
                                        i14 = i53;
                                        int GetPrice04 = GetPosLenPrice2 + RangeCoder_Encoder.GetPrice0(this._isMatch[(StateUpdateMatch << 4) + (this._posStateMask & i78)]) + this._literalEncoder.GetSubCoder(i78, this._matchFinder.GetIndexByte(i79 - 1)).GetPrice(true, this._matchFinder.GetIndexByte((i60 - (i76 + 1)) - 1), this._matchFinder.GetIndexByte(i79));
                                        int StateUpdateChar3 = LZMA_Base.StateUpdateChar(StateUpdateMatch);
                                        int i80 = this._posStateMask & (i78 + 1);
                                        int GetPrice17 = GetPrice04 + RangeCoder_Encoder.GetPrice1(this._isMatch[(StateUpdateChar3 << 4) + i80]) + RangeCoder_Encoder.GetPrice1(this._isRep[StateUpdateChar3]);
                                        int i81 = i60 + 1 + GetMatchLen;
                                        i17 = i11;
                                        while (true) {
                                            i18 = i48 + i81;
                                            if (i17 >= i18) {
                                                break;
                                            }
                                            i17++;
                                            this._optimum[i17].Price = kIfinityPrice;
                                        }
                                        int GetRepPrice5 = GetPrice17 + GetRepPrice(0, GetMatchLen, StateUpdateChar3, i80);
                                        Optimal optimal9 = this._optimum[i18];
                                        if (GetRepPrice5 < optimal9.Price) {
                                            optimal9.Price = GetRepPrice5;
                                            optimal9.PosPrev = i77 + 1;
                                            optimal9.BackPrev = 0;
                                            optimal9.Prev1IsChar = true;
                                            optimal9.Prev2 = true;
                                            optimal9.PosPrev2 = i48;
                                            optimal9.BackPrev2 = i76 + 4;
                                        }
                                    }
                                    i75 += 2;
                                    if (i75 == i12) {
                                        break;
                                    }
                                } else {
                                    i16 = min;
                                    i15 = i5;
                                    i13 = GetPrice03;
                                    int i82 = i11;
                                    i14 = i53;
                                }
                                i60++;
                                GetPrice03 = i13;
                                min = i16;
                                i5 = i15;
                                i53 = i14;
                            }
                        }
                        i8 = i11;
                        i26 = i71;
                    } else {
                        int i83 = i26;
                        i8 = i6;
                    }
                    c = 0;
                    z2 = true;
                    i33 = 2;
                }
            } else {
                this.backRes = -1;
                return 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void WriteEndMarker(int i) throws IOException {
        if (this._writeEndMark) {
            this._rangeEncoder.Encode(this._isMatch, (this._state << 4) + i, 1);
            this._rangeEncoder.Encode(this._isRep, this._state, 0);
            this._state = LZMA_Base.StateUpdateMatch(this._state);
            this._lenEncoder.Encode(this._rangeEncoder, 0, i);
            this._posSlotEncoder[LZMA_Base.GetLenToPosState(2)].Encode(this._rangeEncoder, 63);
            this._rangeEncoder.EncodeDirectBits(67108863, 26);
            this._posAlignEncoder.ReverseEncode(this._rangeEncoder, 15);
        }
    }

    /* access modifiers changed from: package-private */
    public void Flush(int i) throws IOException {
        ReleaseMFStream();
        WriteEndMarker(i & this._posStateMask);
        this._rangeEncoder.FlushData();
        this._rangeEncoder.FlushStream();
    }

    public void CodeOneBlock(long[] jArr, long[] jArr2, boolean[] zArr) throws IOException {
        jArr[0] = 0;
        jArr2[0] = 0;
        zArr[0] = true;
        InputStream inputStream = this._inStream;
        if (inputStream != null) {
            this._matchFinder.SetStream(inputStream);
            this._matchFinder.Init();
            this._needReleaseMFStream = true;
            this._inStream = null;
        }
        if (!this._finished) {
            this._finished = true;
            long j = this.nowPos64;
            if (j == 0) {
                if (this._matchFinder.GetNumAvailableBytes() == 0) {
                    Flush((int) this.nowPos64);
                    return;
                }
                ReadMatchDistances();
                this._rangeEncoder.Encode(this._isMatch, (this._state << 4) + (this._posStateMask & ((int) this.nowPos64)), 0);
                this._state = LZMA_Base.StateUpdateChar(this._state);
                byte GetIndexByte = this._matchFinder.GetIndexByte(0 - this._additionalOffset);
                this._literalEncoder.GetSubCoder((int) this.nowPos64, this._previousByte).Encode(this._rangeEncoder, GetIndexByte);
                this._previousByte = GetIndexByte;
                this._additionalOffset--;
                this.nowPos64++;
            }
            if (this._matchFinder.GetNumAvailableBytes() == 0) {
                Flush((int) this.nowPos64);
                return;
            }
            while (true) {
                int GetOptimum = GetOptimum((int) this.nowPos64);
                int i = this.backRes;
                int i2 = this._posStateMask & ((int) this.nowPos64);
                int i3 = (this._state << 4) + i2;
                if (GetOptimum == 1 && i == -1) {
                    this._rangeEncoder.Encode(this._isMatch, i3, 0);
                    byte GetIndexByte2 = this._matchFinder.GetIndexByte(0 - this._additionalOffset);
                    LiteralEncoder.Encoder2 GetSubCoder = this._literalEncoder.GetSubCoder((int) this.nowPos64, this._previousByte);
                    if (!LZMA_Base.StateIsCharState(this._state)) {
                        GetSubCoder.EncodeMatched(this._rangeEncoder, this._matchFinder.GetIndexByte(((0 - this._repDistances[0]) - 1) - this._additionalOffset), GetIndexByte2);
                    } else {
                        GetSubCoder.Encode(this._rangeEncoder, GetIndexByte2);
                    }
                    this._previousByte = GetIndexByte2;
                    this._state = LZMA_Base.StateUpdateChar(this._state);
                } else {
                    this._rangeEncoder.Encode(this._isMatch, i3, 1);
                    if (i < 4) {
                        this._rangeEncoder.Encode(this._isRep, this._state, 1);
                        if (i == 0) {
                            this._rangeEncoder.Encode(this._isRepG0, this._state, 0);
                            if (GetOptimum == 1) {
                                this._rangeEncoder.Encode(this._isRep0Long, i3, 0);
                            } else {
                                this._rangeEncoder.Encode(this._isRep0Long, i3, 1);
                            }
                        } else {
                            this._rangeEncoder.Encode(this._isRepG0, this._state, 1);
                            if (i == 1) {
                                this._rangeEncoder.Encode(this._isRepG1, this._state, 0);
                            } else {
                                this._rangeEncoder.Encode(this._isRepG1, this._state, 1);
                                this._rangeEncoder.Encode(this._isRepG2, this._state, i - 2);
                            }
                        }
                        if (GetOptimum == 1) {
                            this._state = LZMA_Base.StateUpdateShortRep(this._state);
                        } else {
                            this._repMatchLenEncoder.Encode(this._rangeEncoder, GetOptimum - 2, i2);
                            this._state = LZMA_Base.StateUpdateRep(this._state);
                        }
                        int i4 = this._repDistances[i];
                        if (i != 0) {
                            while (i > 0) {
                                int[] iArr = this._repDistances;
                                iArr[i] = iArr[i - 1];
                                i--;
                            }
                            this._repDistances[0] = i4;
                        }
                    } else {
                        this._rangeEncoder.Encode(this._isRep, this._state, 0);
                        this._state = LZMA_Base.StateUpdateMatch(this._state);
                        this._lenEncoder.Encode(this._rangeEncoder, GetOptimum - 2, i2);
                        int i5 = i - 4;
                        int GetPosSlot = GetPosSlot(i5);
                        this._posSlotEncoder[LZMA_Base.GetLenToPosState(GetOptimum)].Encode(this._rangeEncoder, GetPosSlot);
                        if (GetPosSlot >= 4) {
                            int i6 = (GetPosSlot >> 1) - 1;
                            int i7 = ((GetPosSlot & 1) | 2) << i6;
                            int i8 = i5 - i7;
                            if (GetPosSlot < 14) {
                                RangeCoder_BitTreeEncoder.ReverseEncode(this._posEncoders, (i7 - GetPosSlot) - 1, this._rangeEncoder, i6, i8);
                            } else {
                                this._rangeEncoder.EncodeDirectBits(i8 >> 4, i6 - 4);
                                this._posAlignEncoder.ReverseEncode(this._rangeEncoder, i8 & 15);
                                this._alignPriceCount++;
                            }
                        }
                        for (int i9 = 3; i9 > 0; i9--) {
                            int[] iArr2 = this._repDistances;
                            iArr2[i9] = iArr2[i9 - 1];
                        }
                        this._repDistances[0] = i5;
                        this._matchPriceCount++;
                    }
                    this._previousByte = this._matchFinder.GetIndexByte((GetOptimum - 1) - this._additionalOffset);
                }
                int i10 = this._additionalOffset - GetOptimum;
                this._additionalOffset = i10;
                this.nowPos64 += (long) GetOptimum;
                if (i10 == 0) {
                    if (this._matchPriceCount >= 128) {
                        FillDistancesPrices();
                    }
                    if (this._alignPriceCount >= 16) {
                        FillAlignPrices();
                    }
                    jArr[0] = this.nowPos64;
                    jArr2[0] = this._rangeEncoder.GetProcessedSizeAdd();
                    if (this._matchFinder.GetNumAvailableBytes() == 0) {
                        Flush((int) this.nowPos64);
                        return;
                    } else if (this.nowPos64 - j >= 4096) {
                        this._finished = false;
                        zArr[0] = false;
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ReleaseMFStream() {
        LZ_BinTree lZ_BinTree = this._matchFinder;
        if (lZ_BinTree != null && this._needReleaseMFStream) {
            lZ_BinTree.ReleaseStream();
            this._needReleaseMFStream = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void SetOutStream(OutputStream outputStream) {
        this._rangeEncoder.SetStream(outputStream);
    }

    /* access modifiers changed from: package-private */
    public void ReleaseOutStream() {
        this._rangeEncoder.ReleaseStream();
    }

    /* access modifiers changed from: package-private */
    public void ReleaseStreams() {
        ReleaseMFStream();
        ReleaseOutStream();
    }

    /* access modifiers changed from: package-private */
    public void SetStreams(InputStream inputStream, OutputStream outputStream, long j, long j2) {
        this._inStream = inputStream;
        this._finished = false;
        Create();
        SetOutStream(outputStream);
        Init();
        FillDistancesPrices();
        FillAlignPrices();
        this._lenEncoder.SetTableSize((this._numFastBytes + 1) - 2);
        this._lenEncoder.UpdateTables(1 << this._posStateBits);
        this._repMatchLenEncoder.SetTableSize((this._numFastBytes + 1) - 2);
        this._repMatchLenEncoder.UpdateTables(1 << this._posStateBits);
        this.nowPos64 = 0;
    }

    public void Code(InputStream inputStream, OutputStream outputStream, long j, long j2, ICodeProgress iCodeProgress) throws IOException {
        this._needReleaseMFStream = false;
        try {
            SetStreams(inputStream, outputStream, j, j2);
            while (true) {
                CodeOneBlock(this.processedInSize, this.processedOutSize, this.finished);
                if (!this.finished[0]) {
                    if (iCodeProgress != null) {
                        iCodeProgress.SetProgress(this.processedInSize[0], this.processedOutSize[0]);
                    }
                } else {
                    return;
                }
            }
        } finally {
            ReleaseStreams();
        }
    }

    public void WriteCoderProperties(OutputStream outputStream) throws IOException {
        this.properties[0] = (byte) ((((this._posStateBits * 5) + this._numLiteralPosStateBits) * 9) + this._numLiteralContextBits);
        int i = 0;
        while (i < 4) {
            int i2 = i + 1;
            this.properties[i2] = (byte) (this._dictionarySize >> (i * 8));
            i = i2;
        }
        outputStream.write(this.properties, 0, 5);
    }

    /* access modifiers changed from: package-private */
    public void FillDistancesPrices() {
        for (int i = 4; i < 128; i++) {
            int GetPosSlot = GetPosSlot(i);
            int i2 = (GetPosSlot >> 1) - 1;
            int i3 = ((GetPosSlot & 1) | 2) << i2;
            this.tempPrices[i] = RangeCoder_BitTreeEncoder.ReverseGetPrice(this._posEncoders, (i3 - GetPosSlot) - 1, i2, i - i3);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            RangeCoder_BitTreeEncoder rangeCoder_BitTreeEncoder = this._posSlotEncoder[i4];
            int i5 = i4 << 6;
            for (int i6 = 0; i6 < this._distTableSize; i6++) {
                this._posSlotPrices[i5 + i6] = rangeCoder_BitTreeEncoder.GetPrice(i6);
            }
            for (int i7 = 14; i7 < this._distTableSize; i7++) {
                int[] iArr = this._posSlotPrices;
                int i8 = i5 + i7;
                iArr[i8] = iArr[i8] + ((((i7 >> 1) - 1) - 4) << 6);
            }
            int i9 = i4 * 128;
            int i10 = 0;
            while (i10 < 4) {
                this._distancesPrices[i9 + i10] = this._posSlotPrices[i5 + i10];
                i10++;
            }
            while (i10 < 128) {
                this._distancesPrices[i9 + i10] = this._posSlotPrices[GetPosSlot(i10) + i5] + this.tempPrices[i10];
                i10++;
            }
        }
        this._matchPriceCount = 0;
    }

    /* access modifiers changed from: package-private */
    public void FillAlignPrices() {
        for (int i = 0; i < 16; i++) {
            this._alignPrices[i] = this._posAlignEncoder.ReverseGetPrice(i);
        }
        this._alignPriceCount = 0;
    }

    public boolean SetDictionarySize(int i) {
        int i2 = 0;
        if (i <= 0 || i > 536870912) {
            return false;
        }
        this._dictionarySize = i;
        while (i > (1 << i2)) {
            i2++;
        }
        this._distTableSize = i2 * 2;
        return true;
    }

    public boolean SetNumFastBytes(int i) {
        if (i < 5 || i > 273) {
            return false;
        }
        this._numFastBytes = i;
        return true;
    }

    public boolean SetMatchFinder(int i) {
        if (i < 0 || i > 2) {
            return false;
        }
        int i2 = this._matchFinderType;
        this._matchFinderType = i;
        if (this._matchFinder == null || i2 == i) {
            return true;
        }
        this._dictionarySizePrev = -1;
        this._matchFinder = null;
        return true;
    }

    public boolean SetLcLpPb(int i, int i2, int i3) {
        if (i2 < 0 || i2 > 4 || i < 0 || i > 8 || i3 < 0 || i3 > 4) {
            return false;
        }
        this._numLiteralPosStateBits = i2;
        this._numLiteralContextBits = i;
        this._posStateBits = i3;
        this._posStateMask = (1 << i3) - 1;
        return true;
    }

    public void SetEndMarkerMode(boolean z) {
        this._writeEndMark = z;
    }
}
