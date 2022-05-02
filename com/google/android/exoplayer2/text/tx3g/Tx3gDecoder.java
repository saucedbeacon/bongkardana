package com.google.android.exoplayer2.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.TypefaceSpan;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

public final class Tx3gDecoder extends SimpleSubtitleDecoder {
    private static final char BOM_UTF16_BE = '﻿';
    private static final char BOM_UTF16_LE = '￾';
    private static final int DEFAULT_COLOR = -1;
    private static final int DEFAULT_FONT_FACE = 0;
    private static final String DEFAULT_FONT_FAMILY = "sans-serif";
    private static final float DEFAULT_VERTICAL_PLACEMENT = 0.85f;
    private static final int FONT_FACE_BOLD = 1;
    private static final int FONT_FACE_ITALIC = 2;
    private static final int FONT_FACE_UNDERLINE = 4;
    private static final int SIZE_ATOM_HEADER = 8;
    private static final int SIZE_BOM_UTF16 = 2;
    private static final int SIZE_SHORT = 2;
    private static final int SIZE_STYLE_RECORD = 12;
    private static final int SPAN_PRIORITY_HIGH = 0;
    private static final int SPAN_PRIORITY_LOW = 16711680;
    private static final String TX3G_SERIF = "Serif";
    private static final int TYPE_STYL = Util.getIntegerCodeForString("styl");
    private static final int TYPE_TBOX = Util.getIntegerCodeForString("tbox");
    private static int getMax = 1;
    private static char[] length;
    private static int setMin;
    private int calculatedVideoTrackHeight;
    private boolean customVerticalPlacement;
    private int defaultColorRgba;
    private int defaultFontFace;
    private String defaultFontFamily;
    private float defaultVerticalPlacement;
    private final ParsableByteArray parsableByteArray = new ParsableByteArray();

    static void length() {
        length = new char[]{'j', 199, 192, 212, 226};
    }

    static {
        length();
        int i = setMin + 17;
        getMax = i % 128;
        if (!(i % 2 != 0)) {
            Object obj = null;
            super.hashCode();
        }
    }

    public Tx3gDecoder(List<byte[]> list) {
        super("Tx3gDecoder");
        decodeInitializationData(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if ((r9 != null ? 1 : 'b') != 1) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r9 != null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void decodeInitializationData(java.util.List<byte[]> r9) {
        /*
            r8 = this;
            int r0 = setMin
            r1 = 15
            int r0 = r0 + r1
            int r2 = r0 % 128
            getMax = r2
            int r0 = r0 % 2
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0011
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            r4 = 1062836634(0x3f59999a, float:0.85)
            java.lang.String r5 = "sans-serif"
            if (r0 == 0) goto L_0x001c
            if (r9 == 0) goto L_0x0116
            goto L_0x0029
        L_0x001c:
            r0 = 95
            int r0 = r0 / r3
            if (r9 == 0) goto L_0x0023
            r0 = 1
            goto L_0x0025
        L_0x0023:
            r0 = 98
        L_0x0025:
            if (r0 == r2) goto L_0x0029
            goto L_0x0116
        L_0x0029:
            int r0 = r9.size()
            r6 = 84
            if (r0 != r2) goto L_0x0034
            r0 = 65
            goto L_0x0036
        L_0x0034:
            r0 = 84
        L_0x0036:
            if (r0 == r6) goto L_0x0116
            int r0 = setMin
            r6 = 43
            int r0 = r0 + r6
            int r7 = r0 % 128
            getMax = r7
            int r0 = r0 % 2
            java.lang.Object r0 = r9.get(r3)
            byte[] r0 = (byte[]) r0
            int r0 = r0.length
            r7 = 48
            if (r0 == r7) goto L_0x0050
            r0 = 1
            goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 == r2) goto L_0x0054
            goto L_0x005f
        L_0x0054:
            java.lang.Object r0 = r9.get(r3)
            byte[] r0 = (byte[]) r0
            int r0 = r0.length
            r7 = 53
            if (r0 != r7) goto L_0x0116
        L_0x005f:
            java.lang.Object r9 = r9.get(r3)
            byte[] r9 = (byte[]) r9
            r0 = 24
            byte r7 = r9[r0]
            r8.defaultFontFace = r7
            r7 = 26
            byte r7 = r9[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r0 = r7 << 24
            r7 = 27
            byte r7 = r9[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            r0 = r0 | r7
            r7 = 28
            byte r7 = r9[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r0 = r0 | r7
            r7 = 29
            byte r7 = r9[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r0 = r0 | r7
            r8.defaultColorRgba = r0
            int r0 = r9.length
            int r0 = r0 - r6
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.fromUtf8Bytes(r9, r6, r0)
            java.lang.String r6 = "Serif"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x009e
            java.lang.String r5 = "serif"
        L_0x009e:
            r8.defaultFontFamily = r5
            r0 = 25
            byte r0 = r9[r0]
            int r0 = r0 * 20
            r8.calculatedVideoTrackHeight = r0
            byte r0 = r9[r3]
            r0 = r0 & 32
            if (r0 == 0) goto L_0x00b1
            r0 = 42
            goto L_0x00b3
        L_0x00b1:
            r0 = 15
        L_0x00b3:
            if (r0 == r1) goto L_0x00c0
            int r0 = setMin
            int r0 = r0 + 13
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            goto L_0x00c1
        L_0x00c0:
            r2 = 0
        L_0x00c1:
            r8.customVerticalPlacement = r2
            if (r2 == 0) goto L_0x0113
            int r0 = setMin
            int r0 = r0 + 73
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 1064514355(0x3f733333, float:0.95)
            if (r0 != 0) goto L_0x00f3
            r0 = 120(0x78, float:1.68E-43)
            byte r0 = r9[r0]
            r0 = r0 | 28344(0x6eb8, float:3.9718E-41)
            int r0 = r0 + 13
            r2 = 90
            byte r9 = r9[r2]
            r9 = r9 & 12655(0x316f, float:1.7733E-41)
            r9 = r9 ^ r0
            float r9 = (float) r9
            int r0 = r8.calculatedVideoTrackHeight
            float r0 = (float) r0
            float r9 = r9 / r0
            r8.defaultVerticalPlacement = r9
            r0 = 1073741824(0x40000000, float:2.0)
            float r9 = com.google.android.exoplayer2.util.Util.constrainValue((float) r9, (float) r0, (float) r1)
            r8.defaultVerticalPlacement = r9
            goto L_0x0110
        L_0x00f3:
            r0 = 10
            byte r0 = r9[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r2 = 11
            byte r9 = r9[r2]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r0
            float r9 = (float) r9
            int r0 = r8.calculatedVideoTrackHeight     // Catch:{ Exception -> 0x0111 }
            float r0 = (float) r0     // Catch:{ Exception -> 0x0111 }
            float r9 = r9 / r0
            r8.defaultVerticalPlacement = r9     // Catch:{ Exception -> 0x0111 }
            r0 = 0
            float r9 = com.google.android.exoplayer2.util.Util.constrainValue((float) r9, (float) r0, (float) r1)     // Catch:{ Exception -> 0x0111 }
            r8.defaultVerticalPlacement = r9     // Catch:{ Exception -> 0x0111 }
        L_0x0110:
            return
        L_0x0111:
            r9 = move-exception
            throw r9
        L_0x0113:
            r8.defaultVerticalPlacement = r4
            return
        L_0x0116:
            r8.defaultFontFace = r3
            r9 = -1
            r8.defaultColorRgba = r9
            r8.defaultFontFamily = r5
            r8.customVerticalPlacement = r3
            r8.defaultVerticalPlacement = r4
            return
        L_0x0122:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.tx3g.Tx3gDecoder.decodeInitializationData(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        if ((r5 == TYPE_STYL) != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        if ((r5 == TYPE_STYL ? 22 : '*') != 22) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fb, code lost:
        if (r10.parsableByteArray.bytesLeft() < 2) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fd, code lost:
        r5 = kotlin.text.Typography.dollar;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0100, code lost:
        r5 = '5';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0102, code lost:
        if (r5 == '5') goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0105, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0106, code lost:
        assertTrue(r1);
        r1 = r10.parsableByteArray.readUnsignedShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010f, code lost:
        if (r2 >= r1) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0111, code lost:
        applyStyleRecord(r10.parsableByteArray, r12);
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.text.Subtitle decode(byte[] r11, int r12, boolean r13) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            r10 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r13 = r10.parsableByteArray     // Catch:{ Exception -> 0x0140 }
            r13.reset(r11, r12)     // Catch:{ Exception -> 0x0140 }
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r10.parsableByteArray     // Catch:{ Exception -> 0x013e }
            java.lang.String r11 = readSubtitleText(r11)     // Catch:{ Exception -> 0x0140 }
            boolean r12 = r11.isEmpty()     // Catch:{ Exception -> 0x013e }
            r13 = 0
            r0 = 2
            if (r12 == 0) goto L_0x0029
            int r11 = getMax
            int r11 = r11 + 87
            int r12 = r11 % 128
            setMin = r12
            int r11 = r11 % r0
            if (r11 == 0) goto L_0x0026
            com.google.android.exoplayer2.text.tx3g.Tx3gSubtitle r11 = com.google.android.exoplayer2.text.tx3g.Tx3gSubtitle.EMPTY
            super.hashCode()     // Catch:{ all -> 0x0024 }
            return r11
        L_0x0024:
            r11 = move-exception
            throw r11
        L_0x0026:
            com.google.android.exoplayer2.text.tx3g.Tx3gSubtitle r11 = com.google.android.exoplayer2.text.tx3g.Tx3gSubtitle.EMPTY
            return r11
        L_0x0029:
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>(r11)
            int r2 = r10.defaultFontFace
            r3 = 0
            r4 = 0
            int r5 = r12.length()
            r6 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r12
            attachFontFace(r1, r2, r3, r4, r5, r6)
            int r2 = r10.defaultColorRgba
            r3 = -1
            int r5 = r12.length()
            attachColor(r1, r2, r3, r4, r5, r6)
            java.lang.String r2 = r10.defaultFontFamily
            int r5 = r12.length()
            java.lang.String r3 = "sans-serif"
            attachFontFamily(r1, r2, r3, r4, r5, r6)
            float r11 = r10.defaultVerticalPlacement
            r4 = r11
        L_0x0054:
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r10.parsableByteArray
            int r11 = r11.bytesLeft()
            r1 = 8
            if (r11 < r1) goto L_0x0121
            int r11 = setMin
            int r11 = r11 + 61
            int r1 = r11 % 128
            getMax = r1
            int r11 = r11 % r0
            r1 = 1
            r2 = 0
            if (r11 != 0) goto L_0x008d
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r10.parsableByteArray
            int r11 = r11.getPosition()
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r10.parsableByteArray
            int r3 = r3.readInt()
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r10.parsableByteArray
            int r5 = r5.readInt()
            int r6 = TYPE_STYL
            r7 = 79
            int r7 = r7 / r2
            if (r5 != r6) goto L_0x0086
            r6 = 1
            goto L_0x0087
        L_0x0086:
            r6 = 0
        L_0x0087:
            if (r6 == 0) goto L_0x00ac
            goto L_0x00f3
        L_0x008b:
            r11 = move-exception
            throw r11
        L_0x008d:
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r10.parsableByteArray
            int r11 = r11.getPosition()
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r10.parsableByteArray
            int r3 = r3.readInt()
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r10.parsableByteArray
            int r5 = r5.readInt()
            int r6 = TYPE_STYL
            r7 = 22
            if (r5 != r6) goto L_0x00a8
            r6 = 22
            goto L_0x00aa
        L_0x00a8:
            r6 = 42
        L_0x00aa:
            if (r6 == r7) goto L_0x00f3
        L_0x00ac:
            int r6 = TYPE_TBOX
            if (r5 != r6) goto L_0x0119
            int r5 = setMin
            int r5 = r5 + 91
            int r6 = r5 % 128
            getMax = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L_0x00c8
            boolean r5 = r10.customVerticalPlacement
            int r6 = r13.length     // Catch:{ all -> 0x00c6 }
            if (r5 == 0) goto L_0x00c2
            r5 = 0
            goto L_0x00c3
        L_0x00c2:
            r5 = 1
        L_0x00c3:
            if (r5 == 0) goto L_0x00d2
            goto L_0x0119
        L_0x00c6:
            r11 = move-exception
            throw r11
        L_0x00c8:
            boolean r5 = r10.customVerticalPlacement
            if (r5 == 0) goto L_0x00ce
            r5 = 0
            goto L_0x00cf
        L_0x00ce:
            r5 = 1
        L_0x00cf:
            if (r5 == 0) goto L_0x00d2
            goto L_0x0119
        L_0x00d2:
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r10.parsableByteArray
            int r4 = r4.bytesLeft()
            if (r4 < r0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r1 = 0
        L_0x00dc:
            assertTrue(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.parsableByteArray
            int r1 = r1.readUnsignedShort()
            float r1 = (float) r1
            int r2 = r10.calculatedVideoTrackHeight
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 0
            r4 = 1064514355(0x3f733333, float:0.95)
            float r4 = com.google.android.exoplayer2.util.Util.constrainValue((float) r1, (float) r2, (float) r4)
            goto L_0x0119
        L_0x00f3:
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r10.parsableByteArray
            int r5 = r5.bytesLeft()
            r6 = 53
            if (r5 < r0) goto L_0x0100
            r5 = 36
            goto L_0x0102
        L_0x0100:
            r5 = 53
        L_0x0102:
            if (r5 == r6) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r1 = 0
        L_0x0106:
            assertTrue(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.parsableByteArray
            int r1 = r1.readUnsignedShort()
        L_0x010f:
            if (r2 >= r1) goto L_0x0119
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r10.parsableByteArray
            r10.applyStyleRecord(r5, r12)
            int r2 = r2 + 1
            goto L_0x010f
        L_0x0119:
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.parsableByteArray
            int r11 = r11 + r3
            r1.setPosition(r11)
            goto L_0x0054
        L_0x0121:
            com.google.android.exoplayer2.text.tx3g.Tx3gSubtitle r11 = new com.google.android.exoplayer2.text.tx3g.Tx3gSubtitle
            com.google.android.exoplayer2.text.Cue r13 = new com.google.android.exoplayer2.text.Cue
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1
            r1 = r13
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r11.<init>(r13)
            int r12 = getMax
            int r12 = r12 + 69
            int r13 = r12 % 128
            setMin = r13
            int r12 = r12 % r0
            return r11
        L_0x013e:
            r11 = move-exception
            throw r11
        L_0x0140:
            r11 = move-exception
            goto L_0x0143
        L_0x0142:
            throw r11
        L_0x0143:
            goto L_0x0142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.tx3g.Tx3gDecoder.decode(byte[], int, boolean):com.google.android.exoplayer2.text.Subtitle");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if ((r4 == 65534 ? 'J' : 23) != 23) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String readSubtitleText(com.google.android.exoplayer2.util.ParsableByteArray r7) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            int r0 = r7.bytesLeft()
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 < r3) goto L_0x000b
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            assertTrue(r0)
            int r0 = r7.readUnsignedShort()
            if (r0 != 0) goto L_0x0021
            int r7 = getMax
            int r7 = r7 + 125
            int r0 = r7 % 128
            setMin = r0
            int r7 = r7 % r3
            java.lang.String r7 = ""
            return r7
        L_0x0021:
            int r4 = r7.bytesLeft()
            if (r4 < r3) goto L_0x006d
            char r4 = r7.peekChar()
            r5 = 65279(0xfeff, float:9.1475E-41)
            r6 = 95
            if (r4 == r5) goto L_0x0035
            r5 = 95
            goto L_0x0037
        L_0x0035:
            r5 = 93
        L_0x0037:
            if (r5 == r6) goto L_0x003a
            goto L_0x0048
        L_0x003a:
            r5 = 65534(0xfffe, float:9.1833E-41)
            r6 = 23
            if (r4 != r5) goto L_0x0044
            r4 = 74
            goto L_0x0046
        L_0x0044:
            r4 = 23
        L_0x0046:
            if (r4 == r6) goto L_0x006d
        L_0x0048:
            java.lang.String r1 = "UTF-16"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            java.lang.String r7 = r7.readString(r0, r1)
            int r0 = getMax
            int r0 = r0 + 43
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % r3
            r1 = 36
            if (r0 == 0) goto L_0x0062
            r0 = 77
            goto L_0x0064
        L_0x0062:
            r0 = 36
        L_0x0064:
            if (r0 == r1) goto L_0x006c
            r0 = 20
            int r0 = r0 / r2
            return r7
        L_0x006a:
            r7 = move-exception
            throw r7
        L_0x006c:
            return r7
        L_0x006d:
            r2 = 4
            int[] r2 = new int[r2]
            r2 = {0, 5, 142, 3} // fill-array
            r3 = 5
            byte[] r3 = new byte[r3]
            r3 = {0, 1, 1, 1, 1} // fill-array
            r4 = 48
            boolean r4 = android.telephony.PhoneNumberUtils.is12Key(r4)
            r1 = r1 ^ r4
            java.lang.String r1 = getMin(r2, r3, r1)
            java.lang.String r1 = r1.intern()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            java.lang.String r7 = r7.readString(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.tx3g.Tx3gDecoder.readSubtitleText(com.google.android.exoplayer2.util.ParsableByteArray):java.lang.String");
    }

    private void applyStyleRecord(ParsableByteArray parsableByteArray2, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        boolean z;
        int i = getMax + 103;
        setMin = i % 128;
        int i2 = i % 2;
        if (parsableByteArray2.bytesLeft() >= 12) {
            try {
                int i3 = getMax + 117;
                try {
                    setMin = i3 % 128;
                    int i4 = i3 % 2;
                    z = true;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            z = false;
        }
        assertTrue(z);
        int readUnsignedShort = parsableByteArray2.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray2.readUnsignedShort();
        parsableByteArray2.skipBytes(2);
        int readUnsignedByte = parsableByteArray2.readUnsignedByte();
        parsableByteArray2.skipBytes(1);
        int readInt = parsableByteArray2.readInt();
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i5 = readUnsignedShort;
        int i6 = readUnsignedShort2;
        attachFontFace(spannableStringBuilder2, readUnsignedByte, this.defaultFontFace, i5, i6, 0);
        attachColor(spannableStringBuilder2, readInt, this.defaultColorRgba, i5, i6, 0);
        int i7 = getMax + 25;
        setMin = i7 % 128;
        if ((i7 % 2 != 0 ? 'N' : 27) != 27) {
            Object obj = null;
            super.hashCode();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0084, code lost:
        if ((r7 % 2 == 0 ? '(' : '\\') != '(') goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void attachFontFace(android.text.SpannableStringBuilder r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            r0 = 0
            r1 = 1
            if (r7 == r8) goto L_0x0006
            r8 = 1
            goto L_0x0007
        L_0x0006:
            r8 = 0
        L_0x0007:
            if (r8 == r1) goto L_0x000b
            goto L_0x00b4
        L_0x000b:
            r8 = r11 | 33
            r11 = r7 & 1
            if (r11 == 0) goto L_0x0013
            r11 = 1
            goto L_0x0014
        L_0x0013:
            r11 = 0
        L_0x0014:
            r2 = 2
            if (r11 == 0) goto L_0x0019
            r11 = 1
            goto L_0x0023
        L_0x0019:
            int r11 = setMin
            int r11 = r11 + 63
            int r3 = r11 % 128
            getMax = r3
            int r11 = r11 % r2
            r11 = 0
        L_0x0023:
            r3 = r7 & 2
            if (r3 == 0) goto L_0x0029
            r3 = 0
            goto L_0x002a
        L_0x0029:
            r3 = 1
        L_0x002a:
            if (r3 == 0) goto L_0x002e
            r3 = 0
            goto L_0x002f
        L_0x002e:
            r3 = 1
        L_0x002f:
            if (r11 == 0) goto L_0x004f
            int r4 = getMax
            int r4 = r4 + 69
            int r5 = r4 % 128
            setMin = r5
            int r4 = r4 % r2
            if (r3 == 0) goto L_0x0046
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r5 = 3
            r4.<init>(r5)
            r6.setSpan(r4, r9, r10, r8)
            goto L_0x0059
        L_0x0046:
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r4.<init>(r1)
            r6.setSpan(r4, r9, r10, r8)
            goto L_0x0059
        L_0x004f:
            if (r3 == 0) goto L_0x0059
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r4.<init>(r2)
            r6.setSpan(r4, r9, r10, r8)
        L_0x0059:
            r7 = r7 & 4
            r4 = 64
            r5 = 71
            if (r7 == 0) goto L_0x0064
            r7 = 64
            goto L_0x0066
        L_0x0064:
            r7 = 71
        L_0x0066:
            if (r7 == r4) goto L_0x0072
            int r7 = setMin
            int r7 = r7 + r5
            int r1 = r7 % 128
            getMax = r1
            int r7 = r7 % r2
        L_0x0070:
            r1 = 0
            goto L_0x0086
        L_0x0072:
            int r7 = setMin     // Catch:{ Exception -> 0x00b5 }
            int r7 = r7 + 43
            int r4 = r7 % 128
            getMax = r4     // Catch:{ Exception -> 0x00b5 }
            int r7 = r7 % r2
            r4 = 40
            if (r7 != 0) goto L_0x0082
            r7 = 40
            goto L_0x0084
        L_0x0082:
            r7 = 92
        L_0x0084:
            if (r7 == r4) goto L_0x0070
        L_0x0086:
            if (r1 == 0) goto L_0x0093
            android.text.style.UnderlineSpan r7 = new android.text.style.UnderlineSpan
            r7.<init>()
            r6.setSpan(r7, r9, r10, r8)     // Catch:{ Exception -> 0x0091 }
            goto L_0x0093
        L_0x0091:
            r6 = move-exception
            throw r6
        L_0x0093:
            r7 = 98
            if (r1 != 0) goto L_0x009a
            r1 = 98
            goto L_0x009c
        L_0x009a:
            r1 = 96
        L_0x009c:
            if (r1 == r7) goto L_0x009f
            goto L_0x00b4
        L_0x009f:
            int r7 = setMin
            int r7 = r7 + 45
            int r1 = r7 % 128
            getMax = r1
            int r7 = r7 % r2
            if (r11 != 0) goto L_0x00b4
            if (r3 != 0) goto L_0x00b4
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            r7.<init>(r0)
            r6.setSpan(r7, r9, r10, r8)     // Catch:{ Exception -> 0x00b5 }
        L_0x00b4:
            return
        L_0x00b5:
            r6 = move-exception
            goto L_0x00b8
        L_0x00b7:
            throw r6
        L_0x00b8:
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.tx3g.Tx3gDecoder.attachFontFace(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r3 != r4) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r3 != r4) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void attachColor(android.text.SpannableStringBuilder r2, int r3, int r4, int r5, int r6, int r7) {
        /*
            int r0 = setMin
            int r0 = r0 + 81
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 24
            if (r0 != 0) goto L_0x0011
            r0 = 24
            goto L_0x0013
        L_0x0011:
            r0 = 73
        L_0x0013:
            if (r0 == r1) goto L_0x0018
            if (r3 == r4) goto L_0x0031
            goto L_0x001e
        L_0x0018:
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x004b }
            if (r3 == r4) goto L_0x0031
        L_0x001e:
            r4 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r1
            int r3 = r3 >>> 8
            r3 = r3 | r4
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            r4.<init>(r3)
            r3 = r7 | 33
            r2.setSpan(r4, r5, r6, r3)     // Catch:{ Exception -> 0x002f }
            goto L_0x0031
        L_0x002f:
            r2 = move-exception
            throw r2
        L_0x0031:
            int r2 = getMax
            int r2 = r2 + 59
            int r3 = r2 % 128
            setMin = r3
            int r2 = r2 % 2
            r3 = 34
            if (r2 == 0) goto L_0x0042
            r2 = 34
            goto L_0x0043
        L_0x0042:
            r2 = 5
        L_0x0043:
            if (r2 == r3) goto L_0x0046
            return
        L_0x0046:
            r2 = 0
            int r2 = r2 / r2
            return
        L_0x0049:
            r2 = move-exception
            throw r2
        L_0x004b:
            r2 = move-exception
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.tx3g.Tx3gDecoder.attachColor(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    private static void attachFontFamily(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, int i3) {
        try {
            int i4 = getMax + 103;
            setMin = i4 % 128;
            if ((i4 % 2 != 0 ? 4 : '9') != '9') {
                Object[] objArr = null;
                int length2 = objArr.length;
                if (str == str2) {
                    return;
                }
            } else if (str == str2) {
                return;
            }
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, i3 | 33);
            int i5 = setMin + 71;
            getMax = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r2 != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r2 != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        throw new com.google.android.exoplayer2.text.SubtitleDecoderException("Unexpected subtitle format.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void assertTrue(boolean r2) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            int r0 = setMin     // Catch:{ Exception -> 0x0041 }
            int r0 = r0 + 27
            int r1 = r0 % 128
            getMax = r1     // Catch:{ Exception -> 0x0041 }
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x001b
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x0039
            goto L_0x001d
        L_0x0019:
            r2 = move-exception
            throw r2
        L_0x001b:
            if (r2 == 0) goto L_0x0039
        L_0x001d:
            int r2 = setMin
            int r2 = r2 + 53
            int r0 = r2 % 128
            getMax = r0
            int r2 = r2 % 2
            r0 = 66
            if (r2 != 0) goto L_0x002e
            r2 = 85
            goto L_0x0030
        L_0x002e:
            r2 = 66
        L_0x0030:
            if (r2 == r0) goto L_0x0038
            r2 = 64
            int r2 = r2 / r1
            return
        L_0x0036:
            r2 = move-exception
            throw r2
        L_0x0038:
            return
        L_0x0039:
            com.google.android.exoplayer2.text.SubtitleDecoderException r2 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r0 = "Unexpected subtitle format."
            r2.<init>((java.lang.String) r0)
            throw r2
        L_0x0041:
            r2 = move-exception
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.tx3g.Tx3gDecoder.assertTrue(boolean):void");
    }

    private static String getMin(int[] iArr, byte[] bArr, boolean z) {
        try {
            int i = setMin + 7;
            getMax = i % 128;
            int i2 = i % 2;
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = new char[i4];
            System.arraycopy(length, i3, cArr, 0, i4);
            if (bArr != null) {
                char[] cArr2 = new char[i4];
                char c = 0;
                for (int i7 = 0; i7 < i4; i7++) {
                    if (bArr[i7] == 1) {
                        cArr2[i7] = (char) (((cArr[i7] << 1) + 1) - c);
                        try {
                            int i8 = getMax + 77;
                            setMin = i8 % 128;
                            int i9 = i8 % 2;
                        } catch (Exception e) {
                            throw e;
                        }
                    } else {
                        cArr2[i7] = (char) ((cArr[i7] << 1) - c);
                    }
                    c = cArr2[i7];
                }
                cArr = cArr2;
            }
            if (i6 > 0) {
                char[] cArr3 = new char[i4];
                System.arraycopy(cArr, 0, cArr3, 0, i4);
                int i10 = i4 - i6;
                System.arraycopy(cArr3, 0, cArr, i10, i6);
                System.arraycopy(cArr3, i6, cArr, 0, i10);
            }
            if (z) {
                int i11 = getMax + 97;
                setMin = i11 % 128;
                int i12 = i11 % 2;
                char[] cArr4 = new char[i4];
                for (int i13 = 0; i13 < i4; i13++) {
                    cArr4[i13] = cArr[(i4 - i13) - 1];
                }
                cArr = cArr4;
            }
            if ((i5 > 0 ? 'Q' : 1) == 'Q') {
                int i14 = 0;
                while (true) {
                    if (i14 >= i4) {
                        break;
                    }
                    int i15 = setMin + 93;
                    getMax = i15 % 128;
                    if (i15 % 2 == 0) {
                        cArr[i14] = (char) (cArr[i14] << iArr[2]);
                        i14 += 78;
                    } else {
                        cArr[i14] = (char) (cArr[i14] - iArr[2]);
                        i14++;
                    }
                }
            }
            return new String(cArr);
        } catch (Exception e2) {
            throw e2;
        }
    }
}
