package com.google.android.exoplayer2.metadata.id3;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.parser.JSONLexer;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataDecoder;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import o.OnLifecycleEvent;
import o.setExitTransition;

public final class Id3Decoder implements MetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = Util.getIntegerCodeForString("ID3");
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    public static final FramePredicate NO_FRAMES_PREDICATE = setExitTransition.getMin;
    private static final String TAG = "Id3Decoder";
    private static char getMax = '\u0000';
    private static int getMin = 0;
    private static int length = 0;
    private static int setMax = 1;
    private static long setMin;
    @Nullable
    private final FramePredicate framePredicate;

    public interface FramePredicate {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    public static /* synthetic */ boolean length(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        int i6 = length + 95;
        setMax = i6 % 128;
        if ((i6 % 2 == 0 ? '3' : 11) != '3') {
            try {
                z = lambda$static$0(i, i2, i3, i4, i5);
            } catch (Exception e) {
                throw e;
            }
        } else {
            z = lambda$static$0(i, i2, i3, i4, i5);
            Object obj = null;
            super.hashCode();
        }
        int i7 = length + 103;
        setMax = i7 % 128;
        int i8 = i7 % 2;
        return z;
    }

    static void setMax() {
        getMax = 16905;
        setMin = 0;
        getMin = 0;
    }

    static {
        setMax();
        int i = setMax + 61;
        length = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ boolean lambda$static$0(int i, int i2, int i3, int i4, int i5) {
        try {
            int i6 = length + 47;
            setMax = i6 % 128;
            int i7 = i6 % 2;
            try {
                int i8 = setMax + 59;
                length = i8 % 128;
                if (i8 % 2 == 0) {
                    return false;
                }
                Object obj = null;
                super.hashCode();
                return false;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public Id3Decoder() {
        this((FramePredicate) null);
    }

    public Id3Decoder(@Nullable FramePredicate framePredicate2) {
        try {
            this.framePredicate = framePredicate2;
        } catch (Exception e) {
            throw e;
        }
    }

    @Nullable
    public final Metadata decode(MetadataInputBuffer metadataInputBuffer) {
        int i = setMax + 13;
        length = i % 128;
        int i2 = i % 2;
        try {
            ByteBuffer byteBuffer = metadataInputBuffer.data;
            try {
                Metadata decode = decode(byteBuffer.array(), byteBuffer.limit());
                int i3 = setMax + 49;
                length = i3 % 128;
                if ((i3 % 2 != 0 ? 'G' : 'N') == 'N') {
                    return decode;
                }
                Object[] objArr = null;
                int length2 = objArr.length;
                return decode;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        if (r5 != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r5 != false) goto L_0x0082;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.metadata.Metadata decode(byte[] r10, int r11) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1.<init>(r10, r11)
            com.google.android.exoplayer2.metadata.id3.Id3Decoder$Id3Header r10 = decodeHeader(r1)
            r11 = 0
            if (r10 != 0) goto L_0x0012
            return r11
        L_0x0012:
            int r2 = r1.getPosition()
            int r3 = r10.majorVersion
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L_0x0021
            r3 = 1
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            if (r3 == r6) goto L_0x0027
            r3 = 10
            goto L_0x0031
        L_0x0027:
            int r3 = length
            int r3 = r3 + 19
            int r7 = r3 % 128
            setMax = r7
            int r3 = r3 % r4
            r3 = 6
        L_0x0031:
            int r7 = r10.framesSize
            boolean r8 = r10.isUnsynchronized
            if (r8 == 0) goto L_0x004c
            int r7 = setMax
            int r7 = r7 + 35
            int r8 = r7 % 128
            length = r8
            int r7 = r7 % r4
            int r7 = r10.framesSize
            int r7 = removeUnsynchronization(r1, r7)
        L_0x004c:
            int r2 = r2 + r7
            r1.setLimit(r2)
            int r2 = r10.majorVersion
            boolean r2 = validateFrames(r1, r2, r3, r5)
            if (r2 != 0) goto L_0x005c
            r2 = 1
            goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            if (r2 == r6) goto L_0x0060
            goto L_0x0089
        L_0x0060:
            int r2 = setMax
            int r2 = r2 + 109
            int r7 = r2 % 128
            length = r7
            int r2 = r2 % r4
            r4 = 4
            if (r2 == 0) goto L_0x0079
            int r2 = r10.majorVersion     // Catch:{ Exception -> 0x0077 }
            r7 = 3
            if (r2 != r7) goto L_0x0074
            r5 = 1
        L_0x0074:
            if (r5 == 0) goto L_0x00af
            goto L_0x0082
        L_0x0077:
            r10 = move-exception
            throw r10
        L_0x0079:
            int r2 = r10.majorVersion
            if (r2 != r4) goto L_0x0080
            r5 = 1
        L_0x0080:
            if (r5 == 0) goto L_0x00af
        L_0x0082:
            boolean r2 = validateFrames(r1, r4, r3, r6)
            if (r2 == 0) goto L_0x00af
            r5 = 1
        L_0x0089:
            int r11 = r1.bytesLeft()
            if (r11 < r3) goto L_0x00a9
            int r11 = r10.majorVersion
            com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate r2 = r9.framePredicate
            com.google.android.exoplayer2.metadata.id3.Id3Frame r11 = decodeFrame(r11, r1, r5, r3, r2)
            r2 = 74
            if (r11 == 0) goto L_0x00a0
            r4 = 74
            goto L_0x00a2
        L_0x00a0:
            r4 = 56
        L_0x00a2:
            if (r4 == r2) goto L_0x00a5
            goto L_0x0089
        L_0x00a5:
            r0.add(r11)
            goto L_0x0089
        L_0x00a9:
            com.google.android.exoplayer2.metadata.Metadata r10 = new com.google.android.exoplayer2.metadata.Metadata
            r10.<init>((java.util.List<? extends com.google.android.exoplayer2.metadata.Metadata.Entry>) r0)
            return r10
        L_0x00af:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to validate ID3 tag with majorVersion="
            r0.<init>(r1)
            int r10 = r10.majorVersion
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = "Id3Decoder"
            com.google.android.exoplayer2.util.Log.w(r0, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Decoder.decode(byte[], int):com.google.android.exoplayer2.metadata.Metadata");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00e6, code lost:
        if (((r6 & 128) != 0 ? '\'' : 'N') != 'N') goto L_0x00ea;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.metadata.id3.Id3Decoder.Id3Header decodeHeader(com.google.android.exoplayer2.util.ParsableByteArray r12) {
        /*
            int r0 = r12.bytesLeft()
            r1 = 10
            java.lang.String r2 = "Id3Decoder"
            r3 = 0
            if (r0 >= r1) goto L_0x0011
            java.lang.String r12 = "Data too short to be an ID3 tag"
            com.google.android.exoplayer2.util.Log.w(r2, r12)
            return r3
        L_0x0011:
            int r0 = r12.readUnsignedInt24()     // Catch:{ Exception -> 0x00f0 }
            int r4 = ID3_TAG     // Catch:{ Exception -> 0x00f0 }
            r5 = 2
            if (r0 == r4) goto L_0x0039
            java.lang.String r12 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Unexpected first three bytes of ID3 tag header: "
            java.lang.String r12 = r0.concat(r12)
            com.google.android.exoplayer2.util.Log.w(r2, r12)
            int r12 = length
            int r12 = r12 + 7
            int r0 = r12 % 128
            setMax = r0
            int r12 = r12 % r5
            if (r12 != 0) goto L_0x0038
            super.hashCode()     // Catch:{ all -> 0x0036 }
            return r3
        L_0x0036:
            r12 = move-exception
            throw r12
        L_0x0038:
            return r3
        L_0x0039:
            int r0 = r12.readUnsignedByte()
            r4 = 1
            r12.skipBytes(r4)
            int r6 = r12.readUnsignedByte()
            int r7 = r12.readSynchSafeInt()
            r8 = 4
            r9 = 0
            if (r0 != r5) goto L_0x0067
            r12 = r6 & 64
            if (r12 == 0) goto L_0x0053
            r12 = 1
            goto L_0x0054
        L_0x0053:
            r12 = 0
        L_0x0054:
            if (r12 == 0) goto L_0x005c
            java.lang.String r12 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            com.google.android.exoplayer2.util.Log.w(r2, r12)
            return r3
        L_0x005c:
            int r12 = setMax
            int r12 = r12 + 17
            int r2 = r12 % 128
            length = r2
            int r12 = r12 % r5
            goto L_0x00d2
        L_0x0067:
            r10 = 3
            r11 = 96
            if (r0 != r10) goto L_0x006f
            r10 = 96
            goto L_0x0071
        L_0x006f:
            r10 = 18
        L_0x0071:
            if (r10 == r11) goto L_0x00ad
            if (r0 != r8) goto L_0x009f
            r2 = r6 & 64
            if (r2 == 0) goto L_0x0086
            int r2 = setMax     // Catch:{ Exception -> 0x0084 }
            int r2 = r2 + 29
            int r3 = r2 % 128
            length = r3     // Catch:{ Exception -> 0x0084 }
            int r2 = r2 % r5
            r2 = 1
            goto L_0x0087
        L_0x0084:
            r12 = move-exception
            throw r12
        L_0x0086:
            r2 = 0
        L_0x0087:
            if (r2 == 0) goto L_0x0093
            int r2 = r12.readSynchSafeInt()     // Catch:{ Exception -> 0x00f0 }
            int r3 = r2 + -4
            r12.skipBytes(r3)
            int r7 = r7 - r2
        L_0x0093:
            r12 = r6 & 16
            if (r12 == 0) goto L_0x0099
            r12 = 1
            goto L_0x009a
        L_0x0099:
            r12 = 0
        L_0x009a:
            if (r12 == 0) goto L_0x00d2
            int r7 = r7 + -10
            goto L_0x00d2
        L_0x009f:
            java.lang.String r12 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Skipped ID3 tag with unsupported majorVersion="
            java.lang.String r12 = r0.concat(r12)
            com.google.android.exoplayer2.util.Log.w(r2, r12)
            return r3
        L_0x00ad:
            r2 = r6 & 64
            if (r2 == 0) goto L_0x00b3
            r2 = 1
            goto L_0x00b4
        L_0x00b3:
            r2 = 0
        L_0x00b4:
            if (r2 == 0) goto L_0x00c1
            int r2 = length
            int r2 = r2 + 71
            int r3 = r2 % 128
            setMax = r3
            int r2 = r2 % r5
            r2 = 1
            goto L_0x00c2
        L_0x00c1:
            r2 = 0
        L_0x00c2:
            if (r2 == 0) goto L_0x00c6
            r2 = 0
            goto L_0x00c7
        L_0x00c6:
            r2 = 1
        L_0x00c7:
            if (r2 == r4) goto L_0x00d2
            int r2 = r12.readInt()
            r12.skipBytes(r2)
            int r2 = r2 + r8
            int r7 = r7 - r2
        L_0x00d2:
            if (r0 >= r8) goto L_0x00d7
            r12 = 95
            goto L_0x00d9
        L_0x00d7:
            r12 = 10
        L_0x00d9:
            if (r12 == r1) goto L_0x00e9
            r12 = r6 & 128(0x80, float:1.794E-43)
            r1 = 78
            if (r12 == 0) goto L_0x00e4
            r12 = 39
            goto L_0x00e6
        L_0x00e4:
            r12 = 78
        L_0x00e6:
            if (r12 == r1) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r4 = 0
        L_0x00ea:
            com.google.android.exoplayer2.metadata.id3.Id3Decoder$Id3Header r12 = new com.google.android.exoplayer2.metadata.id3.Id3Decoder$Id3Header
            r12.<init>(r0, r4, r7)
            return r12
        L_0x00f0:
            r12 = move-exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Decoder.decodeHeader(com.google.android.exoplayer2.util.ParsableByteArray):com.google.android.exoplayer2.metadata.id3.Id3Decoder$Id3Header");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (((r10 | 55) != 0 ? 20 : 'A') != 20) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bc, code lost:
        if ((r10 & 64) != 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cb, code lost:
        r3 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f7 A[SYNTHETIC, Splitter:B:79:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00f3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean validateFrames(com.google.android.exoplayer2.util.ParsableByteArray r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.getPosition()
        L_0x0008:
            int r3 = r18.bytesLeft()     // Catch:{ all -> 0x012b }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x011d
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.readInt()     // Catch:{ all -> 0x012b }
            long r8 = r18.readUnsignedInt()     // Catch:{ all -> 0x012b }
            int r10 = r18.readUnsignedShort()     // Catch:{ all -> 0x012b }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.readUnsignedInt24()     // Catch:{ all -> 0x012b }
            int r8 = r18.readUnsignedInt24()     // Catch:{ all -> 0x012b }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x004d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x004d
            int r7 = setMax
            int r7 = r7 + 25
            int r13 = r7 % 128
            length = r13
            int r7 = r7 % 2
            if (r7 == 0) goto L_0x0047
            r7 = 0
            super.hashCode()     // Catch:{ all -> 0x012b }
            if (r10 != 0) goto L_0x004d
            goto L_0x0049
        L_0x0047:
            if (r10 != 0) goto L_0x004d
        L_0x0049:
            r1.setPosition(r2)
            return r4
        L_0x004d:
            r7 = 4
            if (r0 != r7) goto L_0x009c
            if (r21 != 0) goto L_0x009c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x005c
            r11 = 0
            goto L_0x005d
        L_0x005c:
            r11 = 1
        L_0x005d:
            if (r11 == r4) goto L_0x007c
            int r0 = setMax
            int r0 = r0 + 31
            int r3 = r0 % 128
            length = r3
            int r0 = r0 % 2
            r3 = 96
            if (r0 == 0) goto L_0x0070
            r0 = 96
            goto L_0x0072
        L_0x0070:
            r0 = 19
        L_0x0072:
            if (r0 == r3) goto L_0x0078
            r1.setPosition(r2)
            return r6
        L_0x0078:
            r1.setPosition(r2)
            return r6
        L_0x007c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x009c:
            if (r0 != r7) goto L_0x00d2
            int r3 = length
            int r3 = r3 + 119
            int r7 = r3 % 128
            setMax = r7
            int r3 = r3 % 2
            r7 = 65
            if (r3 != 0) goto L_0x00ba
            r3 = r10 | 55
            r11 = 20
            if (r3 == 0) goto L_0x00b5
            r3 = 20
            goto L_0x00b7
        L_0x00b5:
            r3 = 65
        L_0x00b7:
            if (r3 == r11) goto L_0x00be
            goto L_0x00cb
        L_0x00ba:
            r3 = r10 & 64
            if (r3 == 0) goto L_0x00cb
        L_0x00be:
            int r3 = length     // Catch:{ Exception -> 0x00c9 }
            int r3 = r3 + r7
            int r7 = r3 % 128
            setMax = r7     // Catch:{ Exception -> 0x00c9 }
            int r3 = r3 % 2
            r3 = 1
            goto L_0x00cc
        L_0x00c9:
            r0 = move-exception
            throw r0
        L_0x00cb:
            r3 = 0
        L_0x00cc:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x00e5
            r7 = 1
            goto L_0x00e6
        L_0x00d2:
            if (r0 != r3) goto L_0x00e4
            r3 = r10 & 32
            if (r3 == 0) goto L_0x00da
            r3 = 1
            goto L_0x00db
        L_0x00da:
            r3 = 0
        L_0x00db:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00e1
            r7 = 0
            goto L_0x00e2
        L_0x00e1:
            r7 = 1
        L_0x00e2:
            r7 = r7 ^ r4
            goto L_0x00e6
        L_0x00e4:
            r3 = 0
        L_0x00e5:
            r7 = 0
        L_0x00e6:
            if (r3 == 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r4 = 0
        L_0x00ea:
            if (r7 == 0) goto L_0x00ee
            int r4 = r4 + 4
        L_0x00ee:
            long r3 = (long) r4
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f7
            r1.setPosition(r2)
            return r6
        L_0x00f7:
            int r3 = r18.bytesLeft()     // Catch:{ all -> 0x012b }
            long r3 = (long) r3     // Catch:{ all -> 0x012b }
            r7 = 49
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0105
            r3 = 49
            goto L_0x0107
        L_0x0105:
            r3 = 68
        L_0x0107:
            if (r3 == r7) goto L_0x010f
            int r3 = (int) r8     // Catch:{ all -> 0x012b }
            r1.skipBytes(r3)     // Catch:{ all -> 0x012b }
            goto L_0x0008
        L_0x010f:
            int r0 = setMax
            int r0 = r0 + 73
            int r3 = r0 % 128
            length = r3
            int r0 = r0 % 2
            r1.setPosition(r2)
            return r6
        L_0x011d:
            r1.setPosition(r2)
            int r0 = setMax
            int r0 = r0 + 15
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            return r4
        L_0x012b:
            r0 = move-exception
            r1.setPosition(r2)
            goto L_0x0131
        L_0x0130:
            throw r0
        L_0x0131:
            goto L_0x0130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Decoder.validateFrames(com.google.android.exoplayer2.util.ParsableByteArray, int, int, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.exoplayer2.metadata.id3.Id3Frame] */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x020e, code lost:
        if (r10 == 67) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x023b, code lost:
        if ((r13 == 67 ? 'G' : '(') != '(') goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        if ((r16 == 0) != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0097, code lost:
        if (r16 == 0) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0263 A[Catch:{ UnsupportedEncodingException -> 0x02e1, all -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0265 A[Catch:{ UnsupportedEncodingException -> 0x02e1, all -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x02c0 A[Catch:{ UnsupportedEncodingException -> 0x02e1, all -> 0x0191 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:173:0x0200=Splitter:B:173:0x0200, B:229:0x02b6=Splitter:B:229:0x02b6, B:194:0x023d=Splitter:B:194:0x023d, B:132:0x017f=Splitter:B:132:0x017f} */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame decodeFrame(int r19, com.google.android.exoplayer2.util.ParsableByteArray r20, boolean r21, int r22, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.readUnsignedByte()
            int r9 = r20.readUnsignedByte()
            int r10 = r20.readUnsignedByte()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.readUnsignedByte()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 79
            r15 = 4
            r6 = 2
            if (r0 != r15) goto L_0x004b
            int r1 = r20.readUnsignedIntToInt()     // Catch:{ Exception -> 0x0048 }
            if (r21 != 0) goto L_0x0045
            int r2 = setMax
            int r2 = r2 + r14
            int r3 = r2 % 128
            length = r3
            int r2 = r2 % r6
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x0045:
            r16 = r1
            goto L_0x0060
        L_0x0048:
            r0 = move-exception
            goto L_0x02b5
        L_0x004b:
            r1 = 78
            if (r0 != r11) goto L_0x0052
            r2 = 95
            goto L_0x0054
        L_0x0052:
            r2 = 78
        L_0x0054:
            if (r2 == r1) goto L_0x005b
            int r1 = r20.readUnsignedIntToInt()
            goto L_0x0045
        L_0x005b:
            int r1 = r20.readUnsignedInt24()
            goto L_0x0045
        L_0x0060:
            r5 = 1
            if (r0 < r11) goto L_0x0065
            r1 = 0
            goto L_0x0066
        L_0x0065:
            r1 = 1
        L_0x0066:
            if (r1 == r5) goto L_0x006e
            int r1 = r20.readUnsignedShort()
            r4 = r1
            goto L_0x006f
        L_0x006e:
            r4 = 0
        L_0x006f:
            r3 = 0
            if (r8 != 0) goto L_0x00a3
            int r1 = setMax
            int r1 = r1 + r11
            int r2 = r1 % 128
            length = r2
            int r1 = r1 % r6
            if (r9 != 0) goto L_0x00a3
            if (r10 != 0) goto L_0x00a3
            if (r13 != 0) goto L_0x00a3
            int r1 = setMax
            int r1 = r1 + 57
            int r2 = r1 % 128
            length = r2
            int r1 = r1 % r6
            if (r1 == 0) goto L_0x0097
            int r1 = r3.length     // Catch:{ all -> 0x0094 }
            if (r16 != 0) goto L_0x0090
            r1 = 1
            goto L_0x0091
        L_0x0090:
            r1 = 0
        L_0x0091:
            if (r1 == 0) goto L_0x00a3
            goto L_0x0099
        L_0x0094:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0097:
            if (r16 != 0) goto L_0x00a3
        L_0x0099:
            if (r4 != 0) goto L_0x00a3
            int r0 = r20.limit()
            r7.setPosition(r0)
            return r3
        L_0x00a3:
            int r1 = r20.getPosition()
            int r2 = r1 + r16
            int r1 = r20.limit()
            if (r2 <= r1) goto L_0x00b1
            r1 = 0
            goto L_0x00b2
        L_0x00b1:
            r1 = 1
        L_0x00b2:
            java.lang.String r12 = "Id3Decoder"
            if (r1 == 0) goto L_0x02f7
            if (r23 == 0) goto L_0x00db
            r1 = r23
            r14 = r2
            r2 = r19
            r17 = r3
            r3 = r8
            r15 = r4
            r4 = r9
            r5 = r10
            r11 = 2
            r6 = r13
            boolean r1 = r1.evaluate(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x00e0
            int r0 = setMax     // Catch:{ Exception -> 0x00d8 }
            int r0 = r0 + 21
            int r1 = r0 % 128
            length = r1     // Catch:{ Exception -> 0x0048 }
            int r0 = r0 % r11
            r7.setPosition(r14)
            return r17
        L_0x00d8:
            r0 = move-exception
            goto L_0x014a
        L_0x00db:
            r14 = r2
            r17 = r3
            r15 = r4
            r11 = 2
        L_0x00e0:
            r1 = 3
            if (r0 != r1) goto L_0x00fb
            r1 = r15 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00e9
            r5 = 1
            goto L_0x00ea
        L_0x00e9:
            r5 = 0
        L_0x00ea:
            r1 = r15 & 64
            if (r1 == 0) goto L_0x00f0
            r1 = 1
            goto L_0x00f1
        L_0x00f0:
            r1 = 0
        L_0x00f1:
            r2 = r15 & 32
            if (r2 == 0) goto L_0x00f7
            r2 = 1
            goto L_0x00f8
        L_0x00f7:
            r2 = 0
        L_0x00f8:
            r4 = r5
            r3 = 1
            goto L_0x013a
        L_0x00fb:
            r1 = 4
            if (r0 != r1) goto L_0x0135
            r1 = r15 & 64
            if (r1 == 0) goto L_0x0104
            r5 = 1
            goto L_0x0105
        L_0x0104:
            r5 = 0
        L_0x0105:
            r1 = r15 & 8
            if (r1 == 0) goto L_0x010b
            r1 = 1
            goto L_0x010c
        L_0x010b:
            r1 = 0
        L_0x010c:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x0112
            r2 = 1
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            r3 = r15 & 2
            r4 = 18
            if (r3 == 0) goto L_0x011c
            r3 = 8
            goto L_0x011e
        L_0x011c:
            r3 = 18
        L_0x011e:
            if (r3 == r4) goto L_0x0124
            r3 = 1
            r18 = 1
            goto L_0x0127
        L_0x0124:
            r3 = 1
            r18 = 0
        L_0x0127:
            r4 = r15 & 1
            if (r4 == 0) goto L_0x0130
            r4 = r1
            r1 = r2
            r2 = r5
            r5 = 1
            goto L_0x013c
        L_0x0130:
            r4 = r1
            r1 = r2
            r2 = r5
            r5 = 0
            goto L_0x013c
        L_0x0135:
            r3 = 1
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
        L_0x013a:
            r18 = 0
        L_0x013c:
            if (r4 != 0) goto L_0x02ee
            if (r1 == 0) goto L_0x0142
            goto L_0x02ee
        L_0x0142:
            if (r2 == 0) goto L_0x014b
            int r16 = r16 + -1
            r7.skipBytes(r3)     // Catch:{ Exception -> 0x00d8 }
            goto L_0x014b
        L_0x014a:
            throw r0
        L_0x014b:
            if (r5 == 0) goto L_0x0153
            int r16 = r16 + -4
            r1 = 4
            r7.skipBytes(r1)
        L_0x0153:
            r1 = r16
            if (r18 == 0) goto L_0x015b
            int r1 = removeUnsynchronization(r7, r1)
        L_0x015b:
            r15 = r1
            r1 = 84
            r2 = 88
            if (r8 != r1) goto L_0x0185
            if (r9 != r2) goto L_0x0185
            if (r10 != r2) goto L_0x0168
            r5 = 1
            goto L_0x0169
        L_0x0168:
            r5 = 0
        L_0x0169:
            if (r5 == 0) goto L_0x0185
            if (r0 == r11) goto L_0x017f
            int r4 = length
            int r4 = r4 + 81
            int r5 = r4 % 128
            setMax = r5
            int r4 = r4 % r11
            if (r4 != 0) goto L_0x017d
            r4 = 112(0x70, float:1.57E-43)
            if (r13 != r4) goto L_0x0185
            goto L_0x017f
        L_0x017d:
            if (r13 != r2) goto L_0x0185
        L_0x017f:
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = decodeTxxxFrame(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            goto L_0x02be
        L_0x0185:
            if (r8 != r1) goto L_0x0194
            java.lang.String r1 = getFrameId(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = decodeTextInformationFrame(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            goto L_0x02be
        L_0x0191:
            r0 = move-exception
            goto L_0x02ea
        L_0x0194:
            r4 = 87
            if (r8 != r4) goto L_0x01a6
            if (r9 != r2) goto L_0x01a6
            if (r10 != r2) goto L_0x01a6
            if (r0 == r11) goto L_0x01a0
            if (r13 != r2) goto L_0x01a6
        L_0x01a0:
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = decodeWxxxFrame(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            goto L_0x02be
        L_0x01a6:
            if (r8 != r4) goto L_0x01b2
            java.lang.String r1 = getFrameId(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = decodeUrlLinkFrame(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            goto L_0x02be
        L_0x01b2:
            r2 = 73
            r4 = 80
            if (r8 != r4) goto L_0x01d2
            r5 = 82
            if (r9 != r5) goto L_0x01d2
            if (r10 != r2) goto L_0x01c1
            r5 = 76
            goto L_0x01c3
        L_0x01c1:
            r5 = 37
        L_0x01c3:
            r6 = 76
            if (r5 == r6) goto L_0x01c8
            goto L_0x01d2
        L_0x01c8:
            r5 = 86
            if (r13 != r5) goto L_0x01d2
            com.google.android.exoplayer2.metadata.id3.PrivFrame r1 = decodePrivFrame(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            goto L_0x02be
        L_0x01d2:
            r5 = 71
            if (r8 != r5) goto L_0x0206
            int r5 = setMax
            int r5 = r5 + 57
            int r6 = r5 % 128
            length = r6
            int r5 = r5 % r11
            r5 = 69
            if (r9 != r5) goto L_0x0206
            r5 = 79
            if (r10 != r5) goto L_0x01ea
            r5 = 70
            goto L_0x01ec
        L_0x01ea:
            r5 = 27
        L_0x01ec:
            r6 = 70
            if (r5 == r6) goto L_0x01f1
            goto L_0x0206
        L_0x01f1:
            int r5 = length
            int r5 = r5 + 55
            int r6 = r5 % 128
            setMax = r6
            int r5 = r5 % r11
            r5 = 66
            if (r13 == r5) goto L_0x0200
            if (r0 != r11) goto L_0x0206
        L_0x0200:
            com.google.android.exoplayer2.metadata.id3.GeobFrame r1 = decodeGeobFrame(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            goto L_0x02be
        L_0x0206:
            r5 = 67
            if (r0 != r11) goto L_0x0211
            if (r8 != r4) goto L_0x0243
            if (r9 != r2) goto L_0x0243
            if (r10 != r5) goto L_0x0243
            goto L_0x023d
        L_0x0211:
            r6 = 65
            if (r8 != r6) goto L_0x0243
            int r6 = length
            int r6 = r6 + 17
            int r1 = r6 % 128
            setMax = r1
            int r6 = r6 % r11
            if (r6 != 0) goto L_0x0225
            r1 = 113(0x71, float:1.58E-43)
            if (r9 != r1) goto L_0x0243
            goto L_0x0227
        L_0x0225:
            if (r9 != r4) goto L_0x0243
        L_0x0227:
            if (r10 != r2) goto L_0x0243
            int r1 = setMax
            int r1 = r1 + 5
            int r2 = r1 % 128
            length = r2
            int r1 = r1 % r11
            if (r13 != r5) goto L_0x0237
            r1 = 71
            goto L_0x0239
        L_0x0237:
            r1 = 40
        L_0x0239:
            r2 = 40
            if (r1 == r2) goto L_0x0243
        L_0x023d:
            com.google.android.exoplayer2.metadata.id3.ApicFrame r1 = decodeApicFrame(r7, r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            goto L_0x02be
        L_0x0243:
            if (r8 != r5) goto L_0x0259
            r1 = 79
            if (r9 != r1) goto L_0x0259
            r1 = 77
            if (r10 != r1) goto L_0x0259
            r1 = 77
            if (r13 == r1) goto L_0x0253
            if (r0 != r11) goto L_0x0259
        L_0x0253:
            com.google.android.exoplayer2.metadata.id3.CommentFrame r1 = decodeCommentFrame(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            goto L_0x02be
        L_0x0259:
            if (r8 != r5) goto L_0x027a
            r1 = 72
            if (r9 != r1) goto L_0x027a
            r1 = 65
            if (r10 != r1) goto L_0x0265
            r1 = 0
            goto L_0x0266
        L_0x0265:
            r1 = 1
        L_0x0266:
            if (r1 == r3) goto L_0x027a
            if (r13 != r4) goto L_0x027a
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.google.android.exoplayer2.metadata.id3.ChapterFrame r1 = decodeChapterFrame(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            goto L_0x02be
        L_0x027a:
            if (r8 != r5) goto L_0x02b6
            r1 = 84
            if (r9 != r1) goto L_0x02b6
            r1 = 79
            if (r10 != r1) goto L_0x02b6
            if (r13 != r5) goto L_0x02b6
            int r1 = setMax     // Catch:{ Exception -> 0x0048 }
            int r1 = r1 + 125
            int r2 = r1 % 128
            length = r2     // Catch:{ Exception -> 0x0048 }
            int r1 = r1 % r11
            if (r1 == 0) goto L_0x02a5
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame r1 = decodeChapterTOCFrame(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            r2 = 60
            r3 = 0
            int r2 = r2 / r3
            goto L_0x02be
        L_0x02a5:
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame r1 = decodeChapterTOCFrame(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            goto L_0x02be
        L_0x02b5:
            throw r0
        L_0x02b6:
            java.lang.String r1 = getFrameId(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            com.google.android.exoplayer2.metadata.id3.BinaryFrame r1 = decodeBinaryFrame(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
        L_0x02be:
            if (r1 != 0) goto L_0x02dd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.<init>(r3)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            java.lang.String r0 = getFrameId(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
            com.google.android.exoplayer2.util.Log.w(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x02e1 }
        L_0x02dd:
            r7.setPosition(r14)
            return r1
        L_0x02e1:
            java.lang.String r0 = "Unsupported character encoding"
            com.google.android.exoplayer2.util.Log.w(r12, r0)     // Catch:{ all -> 0x0191 }
            r7.setPosition(r14)
            return r17
        L_0x02ea:
            r7.setPosition(r14)
            throw r0
        L_0x02ee:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            com.google.android.exoplayer2.util.Log.w(r12, r0)
            r7.setPosition(r14)
            return r17
        L_0x02f7:
            r17 = r3
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            com.google.android.exoplayer2.util.Log.w(r12, r0)
            int r0 = r20.limit()
            r7.setPosition(r0)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Decoder.decodeFrame(int, com.google.android.exoplayer2.util.ParsableByteArray, boolean, int, com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    @Nullable
    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        int i2 = length + 105;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        if (i <= 0) {
            return null;
        }
        try {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            String charsetName = getCharsetName(readUnsignedByte);
            int i4 = i - 1;
            byte[] bArr = new byte[i4];
            parsableByteArray.readBytes(bArr, 0, i4);
            int indexOfEos = indexOfEos(bArr, 0, readUnsignedByte);
            String str = new String(bArr, 0, indexOfEos, charsetName);
            int delimiterLength = indexOfEos + delimiterLength(readUnsignedByte);
            TextInformationFrame textInformationFrame = new TextInformationFrame("TXXX", str, decodeStringIfValid(bArr, delimiterLength, indexOfEos(bArr, delimiterLength, readUnsignedByte), charsetName));
            int i5 = setMax + 89;
            length = i5 % 128;
            int i6 = i5 % 2;
            return textInformationFrame;
        } catch (Exception e) {
            throw e;
        }
    }

    @Nullable
    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i, String str) throws UnsupportedEncodingException {
        try {
            int i2 = setMax + 113;
            length = i2 % 128;
            int i3 = i2 % 2;
            if ((i <= 0 ? ',' : 24) != ',') {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                String charsetName = getCharsetName(readUnsignedByte);
                int i4 = i - 1;
                byte[] bArr = new byte[i4];
                parsableByteArray.readBytes(bArr, 0, i4);
                TextInformationFrame textInformationFrame = new TextInformationFrame(str, (String) null, new String(bArr, 0, indexOfEos(bArr, 0, readUnsignedByte), charsetName));
                int i5 = length + 43;
                setMax = i5 % 128;
                int i6 = i5 % 2;
                return textInformationFrame;
            }
            try {
                int i7 = setMax + 9;
                length = i7 % 128;
                int i8 = i7 % 2;
                return null;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if ((r5 <= 0) != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003c, code lost:
        r0 = r4.readUnsignedByte();
        r3 = getCharsetName(r0);
        r5 = r5 - 1;
        r1 = new byte[r5];
        r4.readBytes(r1, 0, r5);
        r4 = indexOfEos(r1, 0, r0);
        r5 = new java.lang.String(r1, 0, r4, r3);
        r4 = r4 + delimiterLength(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        return new com.google.android.exoplayer2.metadata.id3.UrlLinkFrame("WXXX", r5, decodeStringIfValid(r1, r4, indexOfZeroByte(r1, r4), "ISO-8859-1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r5 <= 0) goto L_0x001d;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.metadata.id3.UrlLinkFrame decodeWxxxFrame(com.google.android.exoplayer2.util.ParsableByteArray r4, int r5) throws java.io.UnsupportedEncodingException {
        /*
            int r0 = length
            int r0 = r0 + 75
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0016
            r0 = 83
            int r0 = r0 / r2
            if (r5 > 0) goto L_0x003c
            goto L_0x001d
        L_0x0014:
            r4 = move-exception
            throw r4
        L_0x0016:
            if (r5 > 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x003c
        L_0x001d:
            int r4 = setMax     // Catch:{ Exception -> 0x003a }
            int r4 = r4 + 109
            int r5 = r4 % 128
            length = r5     // Catch:{ Exception -> 0x003a }
            int r4 = r4 % 2
            r5 = 93
            if (r4 == 0) goto L_0x002e
            r4 = 93
            goto L_0x0030
        L_0x002e:
            r4 = 36
        L_0x0030:
            r0 = 0
            if (r4 == r5) goto L_0x0034
            goto L_0x0037
        L_0x0034:
            super.hashCode()     // Catch:{ all -> 0x0038 }
        L_0x0037:
            return r0
        L_0x0038:
            r4 = move-exception
            throw r4
        L_0x003a:
            r4 = move-exception
            throw r4
        L_0x003c:
            int r0 = r4.readUnsignedByte()
            java.lang.String r3 = getCharsetName(r0)
            int r5 = r5 - r1
            byte[] r1 = new byte[r5]
            r4.readBytes(r1, r2, r5)
            int r4 = indexOfEos(r1, r2, r0)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2, r4, r3)
            int r0 = delimiterLength(r0)
            int r4 = r4 + r0
            int r0 = indexOfZeroByte(r1, r4)
            java.lang.String r2 = "ISO-8859-1"
            java.lang.String r4 = decodeStringIfValid(r1, r4, r0, r2)
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r0 = new com.google.android.exoplayer2.metadata.id3.UrlLinkFrame
            java.lang.String r1 = "WXXX"
            r0.<init>(r1, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Decoder.decodeWxxxFrame(com.google.android.exoplayer2.util.ParsableByteArray, int):com.google.android.exoplayer2.metadata.id3.UrlLinkFrame");
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        UrlLinkFrame urlLinkFrame = new UrlLinkFrame(str, (String) null, new String(bArr, 0, indexOfZeroByte(bArr, 0), "ISO-8859-1"));
        int i2 = setMax + 101;
        length = i2 % 128;
        int i3 = i2 % 2;
        return urlLinkFrame;
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        int indexOfZeroByte = indexOfZeroByte(bArr, 0);
        PrivFrame privFrame = new PrivFrame(new String(bArr, 0, indexOfZeroByte, "ISO-8859-1"), copyOfRangeIfValid(bArr, indexOfZeroByte + 1, i));
        int i2 = setMax + 89;
        length = i2 % 128;
        if ((i2 % 2 != 0 ? JSONLexer.EOI : 'Z') == 'Z') {
            return privFrame;
        }
        int i3 = 91 / 0;
        return privFrame;
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(readUnsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int indexOfZeroByte = indexOfZeroByte(bArr, 0);
        String str = new String(bArr, 0, indexOfZeroByte, "ISO-8859-1");
        int i3 = indexOfZeroByte + 1;
        int indexOfEos = indexOfEos(bArr, i3, readUnsignedByte);
        String decodeStringIfValid = decodeStringIfValid(bArr, i3, indexOfEos, charsetName);
        int delimiterLength = indexOfEos + delimiterLength(readUnsignedByte);
        int indexOfEos2 = indexOfEos(bArr, delimiterLength, readUnsignedByte);
        GeobFrame geobFrame = new GeobFrame(str, decodeStringIfValid, decodeStringIfValid(bArr, delimiterLength, indexOfEos2, charsetName), copyOfRangeIfValid(bArr, indexOfEos2 + delimiterLength(readUnsignedByte), i2));
        int i4 = length + 7;
        setMax = i4 % 128;
        int i5 = i4 % 2;
        return geobFrame;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        r9 = indexOfZeroByte(r8, 0);
        r10 = com.google.android.exoplayer2.util.Util.toLowerInvariant(new java.lang.String(r8, 0, r9, "ISO-8859-1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        if (r10.indexOf(47) != -1) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r10 = "image/".concat(java.lang.String.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        r11 = length + 37;
        setMax = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0085, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r11 == 3) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        if (r11 == 2) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.metadata.id3.ApicFrame decodeApicFrame(com.google.android.exoplayer2.util.ParsableByteArray r9, int r10, int r11) throws java.io.UnsupportedEncodingException {
        /*
            int r0 = setMax
            int r0 = r0 + 25
            int r1 = r0 % 128
            length = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.String r2 = "image/"
            java.lang.String r3 = "ISO-8859-1"
            r4 = 3
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0026
            int r0 = r9.readUnsignedByte()
            java.lang.String r7 = getCharsetName(r0)
            int r8 = r10 << 0
            byte[] r8 = new byte[r8]
            int r10 = r10 + r5
            r9.readBytes(r8, r5, r10)
            if (r11 != r4) goto L_0x005c
            goto L_0x0036
        L_0x0026:
            int r0 = r9.readUnsignedByte()
            java.lang.String r7 = getCharsetName(r0)
            int r10 = r10 - r5
            byte[] r8 = new byte[r10]
            r9.readBytes(r8, r6, r10)
            if (r11 != r1) goto L_0x005c
        L_0x0036:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r2)
            java.lang.String r10 = new java.lang.String
            r10.<init>(r8, r6, r4, r3)
            java.lang.String r10 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "image/jpg"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L_0x0054
            r5 = 0
        L_0x0054:
            if (r5 == 0) goto L_0x0059
        L_0x0056:
            r10 = r9
            r9 = 2
            goto L_0x0086
        L_0x0059:
            java.lang.String r9 = "image/jpeg"
            goto L_0x0056
        L_0x005c:
            int r9 = indexOfZeroByte(r8, r6)
            java.lang.String r10 = new java.lang.String
            r10.<init>(r8, r6, r9, r3)
            java.lang.String r10 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r10)
            r11 = 47
            int r11 = r10.indexOf(r11)
            r3 = -1
            if (r11 != r3) goto L_0x0086
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r10 = r2.concat(r10)     // Catch:{ Exception -> 0x0084 }
            int r11 = length
            int r11 = r11 + 37
            int r2 = r11 % 128
            setMax = r2
            int r11 = r11 % r1
            goto L_0x0086
        L_0x0084:
            r9 = move-exception
            throw r9
        L_0x0086:
            int r11 = r9 + 1
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r9 = r9 + r1
            int r1 = indexOfEos(r8, r9, r0)
            java.lang.String r2 = new java.lang.String
            int r3 = r1 - r9
            r2.<init>(r8, r9, r3, r7)
            int r9 = delimiterLength(r0)
            int r1 = r1 + r9
            int r9 = r8.length
            byte[] r9 = copyOfRangeIfValid(r8, r1, r9)
            com.google.android.exoplayer2.metadata.id3.ApicFrame r0 = new com.google.android.exoplayer2.metadata.id3.ApicFrame
            r0.<init>(r10, r2, r11, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Decoder.decodeApicFrame(com.google.android.exoplayer2.util.ParsableByteArray, int, int):com.google.android.exoplayer2.metadata.id3.ApicFrame");
    }

    @Nullable
    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        int i2 = setMax + 67;
        length = i2 % 128;
        int i3 = i2 % 2;
        if ((i < 4 ? ']' : 31) != ']') {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            String charsetName = getCharsetName(readUnsignedByte);
            byte[] bArr = new byte[3];
            parsableByteArray.readBytes(bArr, 0, 3);
            String str = new String(bArr, 0, 3);
            int i4 = i - 4;
            byte[] bArr2 = new byte[i4];
            parsableByteArray.readBytes(bArr2, 0, i4);
            int indexOfEos = indexOfEos(bArr2, 0, readUnsignedByte);
            String str2 = new String(bArr2, 0, indexOfEos, charsetName);
            int delimiterLength = indexOfEos + delimiterLength(readUnsignedByte);
            return new CommentFrame(str, str2, decodeStringIfValid(bArr2, delimiterLength, indexOfEos(bArr2, delimiterLength, readUnsignedByte), charsetName));
        }
        int i5 = length + 87;
        setMax = i5 % 128;
        if (!(i5 % 2 == 0)) {
            return null;
        }
        int i6 = 82 / 0;
        return null;
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, @Nullable FramePredicate framePredicate2) throws UnsupportedEncodingException {
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        int position = parsableByteArray.getPosition();
        int indexOfZeroByte = indexOfZeroByte(parsableByteArray2.data, position);
        String str = new String(parsableByteArray2.data, position, indexOfZeroByte - position, "ISO-8859-1");
        boolean z2 = true;
        parsableByteArray2.setPosition(indexOfZeroByte + 1);
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long j = -1;
        if (readUnsignedInt == 4294967295L) {
            int i4 = length + 59;
            setMax = i4 % 128;
            int i5 = i4 % 2;
            readUnsignedInt = -1;
        }
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        if (readUnsignedInt2 == 4294967295L) {
            z2 = false;
        }
        if (z2) {
            j = readUnsignedInt2;
        }
        ArrayList arrayList = new ArrayList();
        int i6 = position + i;
        while (parsableByteArray.getPosition() < i6) {
            try {
                Id3Frame decodeFrame = decodeFrame(i2, parsableByteArray2, z, i3, framePredicate2);
                if ((decodeFrame != null ? 31 : ',') != ',') {
                    int i7 = setMax + 39;
                    length = i7 % 128;
                    int i8 = i7 % 2;
                    arrayList.add(decodeFrame);
                }
                parsableByteArray2 = parsableByteArray;
            } catch (Exception e) {
                throw e;
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        ChapterFrame chapterFrame = new ChapterFrame(str, readInt, readInt2, readUnsignedInt, j, id3FrameArr);
        int i9 = length + 55;
        setMax = i9 % 128;
        int i10 = i9 % 2;
        return chapterFrame;
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, @Nullable FramePredicate framePredicate2) throws UnsupportedEncodingException {
        boolean z2;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        int position = parsableByteArray.getPosition();
        int indexOfZeroByte = indexOfZeroByte(parsableByteArray2.data, position);
        String str = new String(parsableByteArray2.data, position, indexOfZeroByte - position, "ISO-8859-1");
        parsableByteArray2.setPosition(indexOfZeroByte + 1);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 2) != 0) {
            int i4 = setMax + 31;
            length = i4 % 128;
            int i5 = i4 % 2;
            z2 = true;
        } else {
            int i6 = setMax + 99;
            length = i6 % 128;
            int i7 = i6 % 2;
            z2 = false;
        }
        boolean z3 = (readUnsignedByte & 1) != 0;
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[readUnsignedByte2];
        int i8 = 0;
        while (i8 < readUnsignedByte2) {
            try {
                int position2 = parsableByteArray.getPosition();
                try {
                    int indexOfZeroByte2 = indexOfZeroByte(parsableByteArray2.data, position2);
                    strArr[i8] = new String(parsableByteArray2.data, position2, indexOfZeroByte2 - position2, "ISO-8859-1");
                    parsableByteArray2.setPosition(indexOfZeroByte2 + 1);
                    i8++;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i9 = position + i;
        while (parsableByteArray.getPosition() < i9) {
            Id3Frame decodeFrame = decodeFrame(i2, parsableByteArray2, z, i3, framePredicate2);
            if (decodeFrame != null) {
                int i10 = setMax + 117;
                length = i10 % 128;
                char c = i10 % 2 != 0 ? (char) 6 : 21;
                arrayList.add(decodeFrame);
                if (c != 21) {
                    Object[] objArr = null;
                    try {
                        int length2 = objArr.length;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i, String str) {
        byte[] bArr = new byte[i];
        boolean z = false;
        parsableByteArray.readBytes(bArr, 0, i);
        BinaryFrame binaryFrame = new BinaryFrame(str, bArr);
        try {
            int i2 = setMax + 77;
            try {
                length = i2 % 128;
                if (i2 % 2 == 0) {
                    z = true;
                }
                if (z) {
                    return binaryFrame;
                }
                Object[] objArr = null;
                int length2 = objArr.length;
                return binaryFrame;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i) {
        int i2;
        byte[] bArr;
        int i3 = setMax + 15;
        length = i3 % 128;
        if (i3 % 2 != 0) {
            bArr = parsableByteArray.data;
            i2 = parsableByteArray.getPosition();
            int i4 = 6 / 0;
        } else {
            bArr = parsableByteArray.data;
            i2 = parsableByteArray.getPosition();
        }
        while (true) {
            int i5 = i2 + 1;
            if (i5 >= i) {
                return i;
            }
            try {
                int i6 = setMax + 85;
                try {
                    length = i6 % 128;
                    if (i6 % 2 != 0) {
                        if (!((bArr[i2] & 11673) == 18278)) {
                            i2 = i5;
                        }
                    } else {
                        if (!((bArr[i2] & 255) == 255)) {
                            i2 = i5;
                        }
                    }
                    int i7 = length + 39;
                    setMax = i7 % 128;
                    if (i7 % 2 == 0) {
                        if (!(bArr[i2 << 0] == 0)) {
                            i2 = i5;
                        }
                    } else if (bArr[i5] != 0) {
                        i2 = i5;
                    }
                    System.arraycopy(bArr, i2 + 2, bArr, i5, (i - i2) - 2);
                    i--;
                    i2 = i5;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    private static String getCharsetName(int i) {
        int i2 = setMax + 67;
        length = i2 % 128;
        int i3 = i2 % 2;
        if (i == 1) {
            return C.UTF16_NAME;
        }
        if (i == 2) {
            int i4 = setMax + 11;
            length = i4 % 128;
            int i5 = i4 % 2;
            return "UTF-16BE";
        } else if (i != 3) {
            return "ISO-8859-1";
        } else {
            return setMax(new char[]{47363, 54005, 47085, 26197}, TextUtils.indexOf("", "", 0, 0) - 304941639, new char[]{29410, 43731, 10234, 48815, 9728}, new char[]{0, 0, 0, 0}, (char) (21943 - View.resolveSizeAndState(0, 0, 0))).intern();
        }
    }

    private static String getFrameId(int i, int i2, int i3, int i4, int i5) {
        if ((i == 2 ? '.' : 'Y') != 'Y') {
            int i6 = setMax + 35;
            length = i6 % 128;
            int i7 = i6 % 2;
            String format = String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            try {
                int i8 = setMax + 73;
                try {
                    length = i8 % 128;
                    if ((i8 % 2 != 0 ? 13 : 'K') != 13) {
                        return format;
                    }
                    Object obj = null;
                    super.hashCode();
                    return format;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            String format2 = String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
            int i9 = setMax + 17;
            length = i9 % 128;
            int i10 = i9 % 2;
            return format2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        if ((r6 != 0) != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r6 != 0) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int indexOfEos(byte[] r4, int r5, int r6) {
        /*
            int r0 = setMax     // Catch:{ Exception -> 0x0073 }
            int r0 = r0 + 43
            int r1 = r0 % 128
            length = r1     // Catch:{ Exception -> 0x0073 }
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0019
            int r5 = indexOfZeroByte(r4, r5)     // Catch:{ Exception -> 0x0073 }
            int r0 = r2.length     // Catch:{ all -> 0x0017 }
            if (r6 == 0) goto L_0x0057
            goto L_0x0024
        L_0x0017:
            r4 = move-exception
            throw r4
        L_0x0019:
            int r5 = indexOfZeroByte(r4, r5)
            if (r6 == 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0057
        L_0x0024:
            r0 = 3
            if (r6 != r0) goto L_0x0028
            goto L_0x0057
        L_0x0028:
            int r6 = r4.length
            int r6 = r6 - r3
            if (r5 >= r6) goto L_0x0055
            int r6 = r5 % 2
            if (r6 != 0) goto L_0x0032
            r6 = 0
            goto L_0x0033
        L_0x0032:
            r6 = 1
        L_0x0033:
            if (r6 == r3) goto L_0x004e
            int r6 = r5 + 1
            byte r6 = r4[r6]
            if (r6 != 0) goto L_0x004e
            int r4 = length
            int r4 = r4 + 101
            int r6 = r4 % 128
            setMax = r6
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x004d
            super.hashCode()     // Catch:{ all -> 0x004b }
            return r5
        L_0x004b:
            r4 = move-exception
            throw r4
        L_0x004d:
            return r5
        L_0x004e:
            int r5 = r5 + 1
            int r5 = indexOfZeroByte(r4, r5)
            goto L_0x0028
        L_0x0055:
            int r4 = r4.length
            return r4
        L_0x0057:
            int r4 = length
            int r4 = r4 + 113
            int r6 = r4 % 128
            setMax = r6
            int r4 = r4 % 2
            r6 = 46
            if (r4 != 0) goto L_0x0068
            r4 = 46
            goto L_0x006a
        L_0x0068:
            r4 = 98
        L_0x006a:
            if (r4 == r6) goto L_0x006d
            return r5
        L_0x006d:
            super.hashCode()     // Catch:{ all -> 0x0071 }
            return r5
        L_0x0071:
            r4 = move-exception
            throw r4
        L_0x0073:
            r4 = move-exception
            goto L_0x0076
        L_0x0075:
            throw r4
        L_0x0076:
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Decoder.indexOfEos(byte[], int, int):int");
    }

    private static int indexOfZeroByte(byte[] bArr, int i) {
        while (true) {
            if ((i < bArr.length ? '2' : '.') == '.') {
                return bArr.length;
            }
            int i2 = length + 37;
            setMax = i2 % 128;
            int i3 = i2 % 2;
            if ((bArr[i] == 0 ? 'B' : ' ') != ' ') {
                try {
                    int i4 = length + 77;
                    setMax = i4 % 128;
                    if ((i4 % 2 == 0 ? 'U' : 5) != 5) {
                        Object[] objArr = null;
                        int length2 = objArr.length;
                    }
                    return i;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                i++;
            }
        }
    }

    private static int delimiterLength(int i) {
        boolean z = false;
        if (i != 0) {
            int i2 = setMax + 111;
            length = i2 % 128;
            int i3 = i2 % 2;
            if (i == 3) {
                z = true;
            }
            if (!z) {
                int i4 = length + 123;
                setMax = i4 % 128;
                int i5 = i4 % 2;
                return 2;
            }
        }
        int i6 = length + 89;
        setMax = i6 % 128;
        if (i6 % 2 != 0) {
            return 1;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return 1;
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i, int i2) {
        int i3 = setMax + 93;
        length = i3 % 128;
        int i4 = i3 % 2;
        if (!(i2 > i)) {
            try {
                int i5 = length + 25;
                setMax = i5 % 128;
                int i6 = i5 % 2;
                return Util.EMPTY_BYTE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
            int i7 = length + 75;
            setMax = i7 % 128;
            int i8 = i7 % 2;
            return copyOfRange;
        }
    }

    private static String decodeStringIfValid(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        int i3 = length + 67;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        if (i2 > i) {
            int i5 = setMax + 91;
            length = i5 % 128;
            int i6 = i5 % 2;
            if ((i2 > bArr.length ? 27 : '#') != 27) {
                return new String(bArr, i, i2 - i, str);
            }
        }
        try {
            int i7 = setMax + 71;
            try {
                length = i7 % 128;
                if ((i7 % 2 != 0 ? 12 : 'W') != 12) {
                    return "";
                }
                int i8 = 48 / 0;
                return "";
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static final class Id3Header {
        /* access modifiers changed from: private */
        public final int framesSize;
        /* access modifiers changed from: private */
        public final boolean isUnsynchronized;
        /* access modifiers changed from: private */
        public final int majorVersion;

        public Id3Header(int i, boolean z, int i2) {
            this.majorVersion = i;
            this.isUnsynchronized = z;
            this.framesSize = i2;
        }
    }

    private static String setMax(char[] cArr, int i, char[] cArr2, char[] cArr3, char c) {
        char[] cArr4 = (char[]) cArr.clone();
        char[] cArr5 = (char[]) cArr3.clone();
        cArr4[0] = (char) (c ^ cArr4[0]);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length2 = cArr2.length;
        char[] cArr6 = new char[length2];
        int i2 = 0;
        while (true) {
            if (!(i2 < length2)) {
                return new String(cArr6);
            }
            int i3 = length + 71;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            OnLifecycleEvent.length(cArr4, cArr5, i2);
            cArr6[i2] = (char) ((int) (((((long) (cArr2[i2] ^ cArr4[(i2 + 3) % 4])) ^ setMin) ^ ((long) getMin)) ^ ((long) getMax)));
            i2++;
            int i5 = length + 57;
            setMax = i5 % 128;
            int i6 = i5 % 2;
        }
    }
}
