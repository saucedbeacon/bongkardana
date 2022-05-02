package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import o.onActivityPreCreated;
import o.setOnHide;

public final class DefaultImageHeaderParser implements ImageHeaderParser {
    static final byte[] getMax = "Exif\u0000\u0000".getBytes(Charset.forName(length(new char[]{48633, 27648, 48556, 52241, 55776, 42815, 26259, 18338, 27460}).intern()));
    private static final int[] getMin = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    private static int length = 0;
    private static int setMax = 1;
    private static long setMin;

    static void setMin() {
        setMin = 9010809657600095668L;
    }

    static {
        setMin();
        int i = length + 61;
        setMax = i % 128;
        int i2 = i % 2;
    }

    @NonNull
    public final ImageHeaderParser.ImageType setMax(@NonNull InputStream inputStream) throws IOException {
        if (inputStream != null) {
            return length((Reader) new setMin(inputStream));
        }
        throw new NullPointerException("Argument must not be null");
    }

    @NonNull
    public final ImageHeaderParser.ImageType setMax(@NonNull ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            return length((Reader) new setMax(byteBuffer));
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final int setMin(@NonNull InputStream inputStream, @NonNull setOnHide setonhide) throws IOException {
        if (inputStream != null) {
            try {
                setMin setmin = new setMin(inputStream);
                if (setonhide != null) {
                    int max = getMax((Reader) setmin, setonhide);
                    int i = length + 91;
                    setMax = i % 128;
                    if ((i % 2 == 0 ? 'L' : 'M') == 'M') {
                        return max;
                    }
                    int i2 = 71 / 0;
                    return max;
                }
                throw new NullPointerException("Argument must not be null");
            } catch (Exception e) {
                throw e;
            }
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00f4, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x00f2 */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bumptech.glide.load.ImageHeaderParser.ImageType length(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r6) throws java.io.IOException {
        /*
            int r0 = r6.setMin()     // Catch:{ EndOfFileException -> 0x00f5 }
            r1 = 65496(0xffd8, float:9.178E-41)
            r2 = 89
            if (r0 != r1) goto L_0x000e
            r1 = 81
            goto L_0x0010
        L_0x000e:
            r1 = 89
        L_0x0010:
            if (r1 == r2) goto L_0x0015
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ EndOfFileException -> 0x00f5 }
            return r6
        L_0x0015:
            int r0 = r0 << 8
            short r1 = r6.getMax()     // Catch:{ EndOfFileException -> 0x00f5 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x0024
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ EndOfFileException -> 0x00f5 }
            return r6
        L_0x0024:
            int r0 = r0 << 8
            short r1 = r6.getMax()     // Catch:{ EndOfFileException -> 0x00f5 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0034
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            if (r1 == 0) goto L_0x00e0
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0049
            int r6 = length
            int r6 = r6 + 109
            int r0 = r6 % 128
            setMax = r0
            int r6 = r6 % 2
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00f5 }
            return r6
        L_0x0049:
            r0 = 4
            r6.length(r0)     // Catch:{ EndOfFileException -> 0x00f5 }
            int r4 = r6.setMin()     // Catch:{ EndOfFileException -> 0x00f5 }
            int r4 = r4 << 16
            int r5 = r6.setMin()     // Catch:{ EndOfFileException -> 0x00f5 }
            r4 = r4 | r5
            r5 = 1464156752(0x57454250, float:2.16888601E14)
            if (r4 == r5) goto L_0x005f
            r2 = 1
        L_0x005f:
            if (r2 == 0) goto L_0x006e
            int r6 = length
            int r6 = r6 + 53
            int r0 = r6 % 128
            setMax = r0
            int r6 = r6 % 2
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00f5 }
            return r6
        L_0x006e:
            int r2 = r6.setMin()     // Catch:{ EndOfFileException -> 0x00f5 }
            int r2 = r2 << 16
            int r3 = r6.setMin()     // Catch:{ EndOfFileException -> 0x00f5 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0083
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00f5 }
            return r6
        L_0x0083:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x009a
            r6.length(r0)     // Catch:{ EndOfFileException -> 0x00f5 }
            short r6 = r6.getMax()     // Catch:{ EndOfFileException -> 0x00f5 }
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0097
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00f5 }
            return r6
        L_0x0097:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00f5 }
            return r6
        L_0x009a:
            r3 = 76
            if (r2 != r3) goto L_0x00dd
            int r2 = length
            int r2 = r2 + 55
            int r4 = r2 % 128
            setMax = r4
            int r2 = r2 % 2
            r6.length(r0)     // Catch:{ EndOfFileException -> 0x00f5 }
            short r6 = r6.getMax()     // Catch:{ EndOfFileException -> 0x00f5 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x00d0
            int r6 = length
            int r6 = r6 + 59
            int r0 = r6 % 128
            setMax = r0
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x00c2
            r6 = 56
            goto L_0x00c4
        L_0x00c2:
            r6 = 76
        L_0x00c4:
            if (r6 == r3) goto L_0x00cd
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00f5 }
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x00cb }
            return r6
        L_0x00cb:
            r6 = move-exception
            throw r6
        L_0x00cd:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00f5 }
            return r6
        L_0x00d0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00f5 }
            int r0 = length
            int r0 = r0 + 111
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            return r6
        L_0x00dd:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00f5 }
            return r6
        L_0x00e0:
            r0 = 21
            r6.length(r0)     // Catch:{ EndOfFileException -> 0x00f5 }
            short r6 = r6.getMax()     // Catch:{ EndOfFileException -> 0x00f2 }
            r0 = 3
            if (r6 < r0) goto L_0x00ef
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ EndOfFileException -> 0x00f2 }
            return r6
        L_0x00ef:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x00f2 }
            return r6
        L_0x00f2:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x00f5 }
            return r6
        L_0x00f5:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.length(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3 = setMax + 71;
        length = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x009c, code lost:
        if (getMax(r3, r6) != false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getMax(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r16, o.setOnHide r17) throws java.io.IOException {
        /*
            r0 = r16
            r1 = r17
            r2 = -1
            int r3 = r16.setMin()     // Catch:{ EndOfFileException -> 0x0186 }
            boolean r3 = setMin(r3)     // Catch:{ EndOfFileException -> 0x0186 }
            r5 = 1
            if (r3 != 0) goto L_0x0012
            r3 = 1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            if (r3 == 0) goto L_0x0016
            return r2
        L_0x0016:
            short r3 = r16.getMax()     // Catch:{ EndOfFileException -> 0x0186 }
            r6 = 255(0xff, float:3.57E-43)
            r7 = 0
            if (r3 == r6) goto L_0x0021
        L_0x001f:
            r6 = -1
            goto L_0x0071
        L_0x0021:
            short r3 = r16.getMax()     // Catch:{ EndOfFileException -> 0x0186 }
            r6 = 218(0xda, float:3.05E-43)
            if (r3 != r6) goto L_0x002a
            goto L_0x001f
        L_0x002a:
            r6 = 217(0xd9, float:3.04E-43)
            if (r3 != r6) goto L_0x003c
            int r3 = setMax     // Catch:{ Exception -> 0x0039 }
            int r3 = r3 + 71
            int r6 = r3 % 128
            length = r6     // Catch:{ Exception -> 0x0039 }
            int r3 = r3 % 2
            goto L_0x001f
        L_0x0039:
            r0 = move-exception
            goto L_0x011e
        L_0x003c:
            int r6 = r16.setMin()     // Catch:{ EndOfFileException -> 0x0186 }
            int r6 = r6 + -2
            r8 = 225(0xe1, float:3.15E-43)
            if (r3 == r8) goto L_0x0071
            int r3 = length
            int r3 = r3 + 45
            int r8 = r3 % 128
            setMax = r8
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0062
            long r8 = (long) r6
            long r10 = r0.length(r8)     // Catch:{ EndOfFileException -> 0x0186 }
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            super.hashCode()     // Catch:{ all -> 0x005f }
            if (r3 == 0) goto L_0x0016
            goto L_0x0070
        L_0x005f:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0062:
            long r8 = (long) r6
            long r10 = r0.length(r8)     // Catch:{ EndOfFileException -> 0x0186 }
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x006d
            r3 = 1
            goto L_0x006e
        L_0x006d:
            r3 = 0
        L_0x006e:
            if (r3 == 0) goto L_0x0016
        L_0x0070:
            goto L_0x001f
        L_0x0071:
            if (r6 != r2) goto L_0x0074
            return r2
        L_0x0074:
            java.lang.Class<byte[]> r3 = byte[].class
            java.lang.Object r3 = r1.length(r6, r3)     // Catch:{ EndOfFileException -> 0x0186 }
            byte[] r3 = (byte[]) r3     // Catch:{ EndOfFileException -> 0x0186 }
            int r0 = r0.length(r3, r6)     // Catch:{ all -> 0x0181 }
            if (r0 != r6) goto L_0x017c
            int r0 = setMax
            int r0 = r0 + 75
            int r8 = r0 % 128
            length = r8
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0098
            boolean r0 = getMax((byte[]) r3, (int) r6)     // Catch:{ all -> 0x0181 }
            super.hashCode()     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x017c
            goto L_0x009e
        L_0x0098:
            boolean r0 = getMax((byte[]) r3, (int) r6)     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x017c
        L_0x009e:
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$getMin r0 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$getMin     // Catch:{ all -> 0x0181 }
            r0.<init>(r3, r6)     // Catch:{ all -> 0x0181 }
            r6 = 6
            short r7 = r0.getMax(r6)     // Catch:{ all -> 0x0181 }
            r8 = 18761(0x4949, float:2.629E-41)
            if (r7 == r8) goto L_0x00b6
            r8 = 19789(0x4d4d, float:2.773E-41)
            if (r7 == r8) goto L_0x00b3
            java.nio.ByteOrder r7 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x0181 }
            goto L_0x00b8
        L_0x00b3:
            java.nio.ByteOrder r7 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x0181 }
            goto L_0x00b8
        L_0x00b6:
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x0181 }
        L_0x00b8:
            java.nio.ByteBuffer r8 = r0.length     // Catch:{ all -> 0x0181 }
            r8.order(r7)     // Catch:{ all -> 0x0181 }
            r7 = 10
            r8 = 4
            boolean r9 = r0.getMax(r7, r8)     // Catch:{ all -> 0x0181 }
            if (r9 == 0) goto L_0x00cd
            java.nio.ByteBuffer r9 = r0.length     // Catch:{ all -> 0x0181 }
            int r7 = r9.getInt(r7)     // Catch:{ all -> 0x0181 }
            goto L_0x00ce
        L_0x00cd:
            r7 = -1
        L_0x00ce:
            int r7 = r7 + r6
            short r6 = r0.getMax(r7)     // Catch:{ all -> 0x0181 }
            r9 = 0
        L_0x00d4:
            if (r9 >= r6) goto L_0x017c
            int r10 = r7 + 2
            int r11 = r9 * 12
            int r10 = r10 + r11
            short r11 = r0.getMax(r10)     // Catch:{ all -> 0x0181 }
            r12 = 274(0x112, float:3.84E-43)
            if (r11 != r12) goto L_0x0178
            int r11 = setMax
            int r11 = r11 + 21
            int r12 = r11 % 128
            length = r12
            int r11 = r11 % 2
            int r11 = r10 + 2
            short r11 = r0.getMax(r11)     // Catch:{ all -> 0x0181 }
            r12 = 3
            java.lang.String r13 = "DfltImageHeaderParser"
            if (r11 <= 0) goto L_0x0174
            r14 = 90
            r15 = 12
            if (r11 <= r15) goto L_0x0101
            r15 = 90
            goto L_0x0103
        L_0x0101:
            r15 = 49
        L_0x0103:
            if (r15 == r14) goto L_0x0174
            int r14 = r10 + 4
            boolean r15 = r0.getMax(r14, r8)     // Catch:{ all -> 0x0181 }
            if (r15 == 0) goto L_0x011f
            int r15 = setMax     // Catch:{ Exception -> 0x0039 }
            int r15 = r15 + 113
            int r4 = r15 % 128
            length = r4     // Catch:{ Exception -> 0x0039 }
            int r15 = r15 % 2
            java.nio.ByteBuffer r4 = r0.length     // Catch:{ all -> 0x0181 }
            int r4 = r4.getInt(r14)     // Catch:{ all -> 0x0181 }
            goto L_0x0120
        L_0x011e:
            throw r0
        L_0x011f:
            r4 = -1
        L_0x0120:
            if (r4 >= 0) goto L_0x0127
            boolean r4 = android.util.Log.isLoggable(r13, r12)     // Catch:{ all -> 0x0181 }
            goto L_0x0178
        L_0x0127:
            int[] r14 = getMin     // Catch:{ all -> 0x0181 }
            r11 = r14[r11]     // Catch:{ all -> 0x0181 }
            int r4 = r4 + r11
            if (r4 <= r8) goto L_0x0142
            int r4 = setMax
            int r4 = r4 + 39
            int r10 = r4 % 128
            length = r10
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x013c
            r4 = 1
            goto L_0x013d
        L_0x013c:
            r4 = 0
        L_0x013d:
            boolean r4 = android.util.Log.isLoggable(r13, r12)     // Catch:{ all -> 0x0181 }
            goto L_0x0178
        L_0x0142:
            int r10 = r10 + 8
            if (r10 < 0) goto L_0x016f
            java.nio.ByteBuffer r11 = r0.length     // Catch:{ all -> 0x0181 }
            int r11 = r11.remaining()     // Catch:{ all -> 0x0181 }
            if (r10 <= r11) goto L_0x014f
            goto L_0x016f
        L_0x014f:
            if (r4 < 0) goto L_0x016a
            int r11 = setMax
            int r11 = r11 + 109
            int r14 = r11 % 128
            length = r14
            int r11 = r11 % 2
            int r4 = r4 + r10
            java.nio.ByteBuffer r11 = r0.length     // Catch:{ all -> 0x0181 }
            int r11 = r11.remaining()     // Catch:{ all -> 0x0181 }
            if (r4 <= r11) goto L_0x0165
            goto L_0x016a
        L_0x0165:
            short r0 = r0.getMax(r10)     // Catch:{ all -> 0x0181 }
            goto L_0x017d
        L_0x016a:
            boolean r4 = android.util.Log.isLoggable(r13, r12)     // Catch:{ all -> 0x0181 }
            goto L_0x0178
        L_0x016f:
            boolean r4 = android.util.Log.isLoggable(r13, r12)     // Catch:{ all -> 0x0181 }
            goto L_0x0178
        L_0x0174:
            boolean r4 = android.util.Log.isLoggable(r13, r12)     // Catch:{ all -> 0x0181 }
        L_0x0178:
            int r9 = r9 + 1
            goto L_0x00d4
        L_0x017c:
            r0 = -1
        L_0x017d:
            r1.setMin(r3)     // Catch:{ EndOfFileException -> 0x0186 }
            return r0
        L_0x0181:
            r0 = move-exception
            r1.setMin(r3)     // Catch:{ EndOfFileException -> 0x0186 }
            throw r0     // Catch:{ EndOfFileException -> 0x0186 }
        L_0x0186:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.getMax(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader, o.setOnHide):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if ((r8 > r0 ? '(' : 12) != '(') goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if ((r8 > getMax.length ? '\'' : 14) != '\'') goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0087, code lost:
        r7 = length + 79;
        setMax = r7 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0090, code lost:
        if ((r7 % 2) != 0) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A[SYNTHETIC, Splitter:B:28:0x004c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getMax(byte[] r7, int r8) {
        /*
            int r0 = setMax
            int r0 = r0 + 83
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            r0 = 63
            if (r7 == 0) goto L_0x0011
            r1 = 63
            goto L_0x0013
        L_0x0011:
            r1 = 76
        L_0x0013:
            r2 = 1
            r3 = 0
            if (r1 == r0) goto L_0x0018
            goto L_0x0047
        L_0x0018:
            int r0 = setMax
            int r0 = r0 + 45
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0039
            byte[] r0 = getMax
            int r0 = r0.length
            r1 = 0
            super.hashCode()     // Catch:{ all -> 0x0037 }
            r1 = 40
            if (r8 <= r0) goto L_0x0032
            r8 = 40
            goto L_0x0034
        L_0x0032:
            r8 = 12
        L_0x0034:
            if (r8 == r1) goto L_0x0049
            goto L_0x0047
        L_0x0037:
            r7 = move-exception
            throw r7
        L_0x0039:
            byte[] r0 = getMax     // Catch:{ Exception -> 0x009a }
            int r0 = r0.length
            r1 = 39
            if (r8 <= r0) goto L_0x0043
            r8 = 39
            goto L_0x0045
        L_0x0043:
            r8 = 14
        L_0x0045:
            if (r8 == r1) goto L_0x0049
        L_0x0047:
            r8 = 0
            goto L_0x004a
        L_0x0049:
            r8 = 1
        L_0x004a:
            if (r8 == 0) goto L_0x0098
            int r0 = length     // Catch:{ Exception -> 0x009a }
            int r0 = r0 + 97
            int r1 = r0 % 128
            setMax = r1     // Catch:{ Exception -> 0x009a }
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x005a
            r0 = 1
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            byte[] r1 = getMax
            int r4 = r1.length
            if (r0 >= r4) goto L_0x0098
            int r4 = length
            int r4 = r4 + 111
            int r5 = r4 % 128
            setMax = r5
            int r4 = r4 % 2
            r5 = 79
            if (r4 != 0) goto L_0x007a
            byte r4 = r7[r0]
            byte r1 = r1[r0]
            r6 = 81
            int r6 = r6 / r3
            if (r4 == r1) goto L_0x0095
            goto L_0x0087
        L_0x0078:
            r7 = move-exception
            throw r7
        L_0x007a:
            byte r4 = r7[r0]
            byte r1 = r1[r0]     // Catch:{ Exception -> 0x009a }
            if (r4 == r1) goto L_0x0083
            r1 = 34
            goto L_0x0085
        L_0x0083:
            r1 = 79
        L_0x0085:
            if (r1 == r5) goto L_0x0095
        L_0x0087:
            int r7 = length
            int r7 = r7 + r5
            int r8 = r7 % 128
            setMax = r8
            int r7 = r7 % 2
            if (r7 != 0) goto L_0x0093
            goto L_0x0099
        L_0x0093:
            r2 = 0
            goto L_0x0099
        L_0x0095:
            int r0 = r0 + 1
            goto L_0x005b
        L_0x0098:
            r3 = r8
        L_0x0099:
            return r3
        L_0x009a:
            r7 = move-exception
            goto L_0x009d
        L_0x009c:
            throw r7
        L_0x009d:
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.getMax(byte[], int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (((r5 ^ 65496) != 65496) != true) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (((r5 & 65496) != 65496 ? ')' : '=') != '=') goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean setMin(int r5) {
        /*
            int r0 = length
            int r0 = r0 + 117
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 60
            if (r0 != 0) goto L_0x0011
            r0 = 67
            goto L_0x0013
        L_0x0011:
            r0 = 60
        L_0x0013:
            r2 = 0
            r3 = 1
            r4 = 65496(0xffd8, float:9.178E-41)
            if (r0 == r1) goto L_0x0024
            r0 = r5 ^ r4
            if (r0 == r4) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 == r3) goto L_0x0031
            goto L_0x0055
        L_0x0024:
            r0 = r5 & r4
            r1 = 61
            if (r0 == r4) goto L_0x002d
            r0 = 41
            goto L_0x002f
        L_0x002d:
            r0 = 61
        L_0x002f:
            if (r0 == r1) goto L_0x0055
        L_0x0031:
            int r0 = setMax     // Catch:{ Exception -> 0x0053 }
            int r0 = r0 + 109
            int r1 = r0 % 128
            length = r1     // Catch:{ Exception -> 0x0053 }
            int r0 = r0 % 2
            r0 = 19789(0x4d4d, float:2.773E-41)
            if (r5 == r0) goto L_0x0041
            r0 = 0
            goto L_0x0042
        L_0x0041:
            r0 = 1
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            goto L_0x0055
        L_0x0045:
            r0 = 18761(0x4949, float:2.629E-41)
            r1 = 31
            if (r5 != r0) goto L_0x004e
            r5 = 31
            goto L_0x0050
        L_0x004e:
            r5 = 9
        L_0x0050:
            if (r5 == r1) goto L_0x0055
            return r2
        L_0x0053:
            r5 = move-exception
            throw r5
        L_0x0055:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.setMin(int):boolean");
    }

    static final class getMin {
        final ByteBuffer length;

        getMin(byte[] bArr, int i) {
            this.length = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* access modifiers changed from: package-private */
        public final short getMax(int i) {
            if (getMax(i, 2)) {
                return this.length.getShort(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax(int i, int i2) {
            return this.length.remaining() - i >= i2;
        }
    }

    interface Reader {
        short getMax() throws IOException;

        int length(byte[] bArr, int i) throws IOException;

        long length(long j) throws IOException;

        int setMin() throws IOException;

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }
    }

    static final class setMax implements Reader {
        private final ByteBuffer getMax;

        setMax(ByteBuffer byteBuffer) {
            this.getMax = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final short getMax() throws Reader.EndOfFileException {
            if (this.getMax.remaining() > 0) {
                return (short) (this.getMax.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        public final int setMin() throws Reader.EndOfFileException {
            return (getMax() << 8) | getMax();
        }

        public final int length(byte[] bArr, int i) {
            int min = Math.min(i, this.getMax.remaining());
            if (min == 0) {
                return -1;
            }
            this.getMax.get(bArr, 0, min);
            return min;
        }

        public final long length(long j) {
            int min = (int) Math.min((long) this.getMax.remaining(), j);
            ByteBuffer byteBuffer = this.getMax;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    static final class setMin implements Reader {
        private final InputStream setMax;

        setMin(InputStream inputStream) {
            this.setMax = inputStream;
        }

        public final short getMax() throws IOException {
            int read = this.setMax.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        public final int setMin() throws IOException {
            return (getMax() << 8) | getMax();
        }

        public final int length(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.setMax.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new Reader.EndOfFileException();
        }

        public final long length(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.setMax.skip(j2);
                if (skip <= 0) {
                    if (this.setMax.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    private static String length(char[] cArr) {
        int i = length + 115;
        setMax = i % 128;
        if (i % 2 == 0) {
        }
        char[] length2 = onActivityPreCreated.length(setMin, cArr);
        int i2 = 4;
        while (true) {
            if (i2 >= length2.length) {
                return new String(length2, 4, length2.length - 4);
            }
            int i3 = setMax + 27;
            length = i3 % 128;
            int i4 = i3 % 2;
            length2[i2] = (char) ((int) (((long) (length2[i2] ^ length2[i2 % 4])) ^ (((long) (i2 - 4)) * setMin)));
            i2++;
        }
    }
}
