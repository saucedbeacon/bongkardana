package com.google.protobuf;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    public static final int COMPLETE = 0;
    public static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor = ((!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor());

    /* access modifiers changed from: private */
    public static int incompleteStateFor(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return processor.isValidUtf8(bArr, i, i2);
    }

    public static int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
        return processor.partialIsValidUtf8(i, bArr, i2, i3);
    }

    /* access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return incompleteStateFor(b);
        }
        if (i3 == 1) {
            return incompleteStateFor(b, bArr[i]);
        }
        if (i3 == 2) {
            return incompleteStateFor((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return incompleteStateFor(i);
        }
        if (i3 == 1) {
            return incompleteStateFor(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return incompleteStateFor(i, (int) byteBuffer.get(i2), (int) byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        UnpairedSurrogateException(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unpaired surrogate at index "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r3 = " of "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnpairedSurrogateException.<init>(int, int):void");
        }
    }

    static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= 2048) {
                    i2 += encodedLengthGeneral(charSequence, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        StringBuilder sb = new StringBuilder("UTF-8 length does not fit in int: ");
        sb.append(((long) i2) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) >= 65536) {
                        i++;
                    } else {
                        throw new UnpairedSurrogateException(i, length);
                    }
                }
            }
            i++;
        }
        return i2;
    }

    static int encode(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return processor.encodeUtf8(charSequence, bArr, i, i2);
    }

    static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    static int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return processor.partialIsValidUtf8(i, byteBuffer, i2, i3);
    }

    static String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i, i2);
    }

    static String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i, i2);
    }

    static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    /* access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & ASCII_MASK_LONG) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    static abstract class Processor {
        /* access modifiers changed from: package-private */
        public abstract String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        /* access modifiers changed from: package-private */
        public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException;

        /* access modifiers changed from: package-private */
        public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* access modifiers changed from: package-private */
        public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        /* access modifiers changed from: package-private */
        public abstract int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3);

        /* access modifiers changed from: package-private */
        public abstract int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3);

        Processor() {
        }

        /* access modifiers changed from: package-private */
        public final boolean isValidUtf8(byte[] bArr, int i, int i2) {
            return partialIsValidUtf8(0, bArr, i, i2) == 0;
        }

        /* access modifiers changed from: package-private */
        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
            return partialIsValidUtf8(0, byteBuffer, i, i2) == 0;
        }

        /* access modifiers changed from: package-private */
        public final int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                return partialIsValidUtf8(i, byteBuffer.array(), i2 + arrayOffset, arrayOffset + i3);
            } else if (byteBuffer.isDirect()) {
                return partialIsValidUtf8Direct(i, byteBuffer, i2, i3);
            } else {
                return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
            if (r8.get(r9) > -65) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x008b, code lost:
            if (r8.get(r9) > -65) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r8.get(r9) > -65) goto L_0x001d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x008e
                if (r9 < r10) goto L_0x0005
                return r7
            L_0x0005:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L_0x001e
                r7 = -62
                if (r0 < r7) goto L_0x001d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L_0x001a
                goto L_0x001d
            L_0x001a:
                r9 = r7
                goto L_0x008e
            L_0x001d:
                return r2
            L_0x001e:
                r4 = -16
                if (r0 >= r4) goto L_0x004f
                int r7 = r7 >> 8
                r7 = r7 ^ r2
                byte r7 = (byte) r7
                if (r7 != 0) goto L_0x0038
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L_0x0035
                int r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r9)
                return r7
            L_0x0035:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0038:
                if (r7 > r3) goto L_0x004e
                r4 = -96
                if (r0 != r1) goto L_0x0040
                if (r7 < r4) goto L_0x004e
            L_0x0040:
                r1 = -19
                if (r0 != r1) goto L_0x0046
                if (r7 >= r4) goto L_0x004e
            L_0x0046:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L_0x001a
            L_0x004e:
                return r2
            L_0x004f:
                int r1 = r7 >> 8
                r1 = r1 ^ r2
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L_0x0065
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L_0x0063
                int r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r1)
                return r7
            L_0x0063:
                r9 = r7
                goto L_0x0068
            L_0x0065:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L_0x0068:
                if (r4 != 0) goto L_0x0078
                int r7 = r9 + 1
                byte r4 = r8.get(r9)
                if (r7 < r10) goto L_0x0077
                int r7 = com.google.protobuf.Utf8.incompleteStateFor((int) r0, (int) r1, (int) r4)
                return r7
            L_0x0077:
                r9 = r7
            L_0x0078:
                if (r1 > r3) goto L_0x008d
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L_0x008d
                if (r4 > r3) goto L_0x008d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L_0x001a
            L_0x008d:
                return r2
            L_0x008e:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
            int access$200 = i + Utf8.estimateConsecutiveAscii(byteBuffer, i, i2);
            while (access$200 < i2) {
                int i3 = access$200 + 1;
                byte b = byteBuffer.get(access$200);
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b < -62 || byteBuffer.get(i3) > -65) {
                            return -1;
                        }
                        access$200 = i3 + 1;
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return Utf8.incompleteStateFor(byteBuffer, b, i3, i2 - i3);
                        }
                        int i4 = i3 + 1;
                        byte b2 = byteBuffer.get(i3);
                        if (b2 > -65 || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || byteBuffer.get(i4) > -65))) {
                            return -1;
                        }
                        access$200 = i4 + 1;
                    } else if (i3 >= i2 - 2) {
                        return Utf8.incompleteStateFor(byteBuffer, b, i3, i2 - i3);
                    } else {
                        int i5 = i3 + 1;
                        byte b3 = byteBuffer.get(i3);
                        if (b3 <= -65 && (((b << Ascii.FS) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (byteBuffer.get(i5) <= -65) {
                                i3 = i6 + 1;
                                if (byteBuffer.get(i6) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                access$200 = i3;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public final String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            } else if (byteBuffer.isDirect()) {
                return decodeUtf8Direct(byteBuffer, i, i2);
            } else {
                return decodeUtf8Default(byteBuffer, i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        public final String decodeUtf8Default(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = byteBuffer.get(r13);
                    if (!DecodeUtil.isOneByte(b)) {
                        break;
                    }
                    i = r13 + 1;
                    DecodeUtil.handleOneByte(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte b2 = byteBuffer.get(r13);
                    if (DecodeUtil.isOneByte(b2)) {
                        int i7 = i5 + 1;
                        DecodeUtil.handleOneByte(b2, cArr, i5);
                        while (i6 < i3) {
                            byte b3 = byteBuffer.get(i6);
                            if (!DecodeUtil.isOneByte(b3)) {
                                break;
                            }
                            i6++;
                            DecodeUtil.handleOneByte(b3, cArr, i7);
                            i7++;
                        }
                        r13 = i6;
                        i5 = i7;
                    } else if (DecodeUtil.isTwoBytes(b2)) {
                        if (i6 < i3) {
                            DecodeUtil.handleTwoBytes(b2, byteBuffer.get(i6), cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (DecodeUtil.isThreeBytes(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            DecodeUtil.handleThreeBytes(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                            r13 = i8 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = byteBuffer.get(i6);
                        int i10 = i9 + 1;
                        DecodeUtil.handleFourBytes(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                        r13 = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* access modifiers changed from: package-private */
        public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                byteBuffer.position(Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        /* access modifiers changed from: package-private */
        public final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int i;
            int length = charSequence.length();
            int position = byteBuffer.position();
            int i2 = 0;
            while (i2 < length) {
                try {
                    char charAt = charSequence.charAt(i2);
                    if (charAt >= 128) {
                        break;
                    }
                    byteBuffer.put(position + i2, (byte) charAt);
                    i2++;
                } catch (IndexOutOfBoundsException unused) {
                    StringBuilder sb = new StringBuilder("Failed writing ");
                    sb.append(charSequence.charAt(i2));
                    sb.append(" at index ");
                    sb.append(byteBuffer.position() + Math.max(i2, (position - byteBuffer.position()) + 1));
                    throw new ArrayIndexOutOfBoundsException(sb.toString());
                }
            }
            if (i2 == length) {
                byteBuffer.position(position + i2);
                return;
            }
            position += i2;
            while (i2 < length) {
                char charAt2 = charSequence.charAt(i2);
                if (charAt2 < 128) {
                    byteBuffer.put(position, (byte) charAt2);
                } else if (charAt2 < 2048) {
                    i = position + 1;
                    try {
                        byteBuffer.put(position, (byte) ((charAt2 >>> 6) | PsExtractor.AUDIO_STREAM));
                        byteBuffer.put(i, (byte) ((charAt2 & '?') | 128));
                        position = i;
                    } catch (IndexOutOfBoundsException unused2) {
                        position = i;
                        StringBuilder sb2 = new StringBuilder("Failed writing ");
                        sb2.append(charSequence.charAt(i2));
                        sb2.append(" at index ");
                        sb2.append(byteBuffer.position() + Math.max(i2, (position - byteBuffer.position()) + 1));
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                } else if (charAt2 < 55296 || 57343 < charAt2) {
                    i = position + 1;
                    byteBuffer.put(position, (byte) ((charAt2 >>> 12) | 224));
                    position = i + 1;
                    byteBuffer.put(i, (byte) (((charAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
                } else {
                    int i3 = i2 + 1;
                    if (i3 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i3);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i4 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    position = i4 + 1;
                                    byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                    i4 = position + 1;
                                    byteBuffer.put(position, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(i4, (byte) ((codePoint & 63) | 128));
                                    position = i4;
                                    i2 = i3;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i4;
                                    i2 = i3;
                                    StringBuilder sb22 = new StringBuilder("Failed writing ");
                                    sb22.append(charSequence.charAt(i2));
                                    sb22.append(" at index ");
                                    sb22.append(byteBuffer.position() + Math.max(i2, (position - byteBuffer.position()) + 1));
                                    throw new ArrayIndexOutOfBoundsException(sb22.toString());
                                }
                            } else {
                                i2 = i3;
                            }
                        } catch (IndexOutOfBoundsException unused4) {
                            i2 = i3;
                            StringBuilder sb222 = new StringBuilder("Failed writing ");
                            sb222.append(charSequence.charAt(i2));
                            sb222.append(" at index ");
                            sb222.append(byteBuffer.position() + Math.max(i2, (position - byteBuffer.position()) + 1));
                            throw new ArrayIndexOutOfBoundsException(sb222.toString());
                        }
                    }
                    throw new UnpairedSurrogateException(i2, length);
                }
                i2++;
                position++;
            }
            byteBuffer.position(position);
        }
    }

    static final class SafeProcessor extends Processor {
        SafeProcessor() {
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
            if (r8[r9] > -65) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x007f, code lost:
            if (r8[r9] > -65) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r8[r9] > -65) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0082
                if (r9 < r10) goto L_0x0005
                return r7
            L_0x0005:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L_0x001c
                r7 = -62
                if (r0 < r7) goto L_0x001b
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
                goto L_0x001b
            L_0x0018:
                r9 = r7
                goto L_0x0082
            L_0x001b:
                return r2
            L_0x001c:
                r4 = -16
                if (r0 >= r4) goto L_0x0049
                int r7 = r7 >> 8
                r7 = r7 ^ r2
                byte r7 = (byte) r7
                if (r7 != 0) goto L_0x0034
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r7 < r10) goto L_0x0031
                int r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r9)
                return r7
            L_0x0031:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0034:
                if (r7 > r3) goto L_0x0048
                r4 = -96
                if (r0 != r1) goto L_0x003c
                if (r7 < r4) goto L_0x0048
            L_0x003c:
                r1 = -19
                if (r0 != r1) goto L_0x0042
                if (r7 >= r4) goto L_0x0048
            L_0x0042:
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
            L_0x0048:
                return r2
            L_0x0049:
                int r1 = r7 >> 8
                r1 = r1 ^ r2
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L_0x005d
                int r7 = r9 + 1
                byte r1 = r8[r9]
                if (r7 < r10) goto L_0x005b
                int r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r1)
                return r7
            L_0x005b:
                r9 = r7
                goto L_0x0060
            L_0x005d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L_0x0060:
                if (r4 != 0) goto L_0x006e
                int r7 = r9 + 1
                byte r4 = r8[r9]
                if (r7 < r10) goto L_0x006d
                int r7 = com.google.protobuf.Utf8.incompleteStateFor((int) r0, (int) r1, (int) r4)
                return r7
            L_0x006d:
                r9 = r7
            L_0x006e:
                if (r1 > r3) goto L_0x0081
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L_0x0081
                if (r4 > r3) goto L_0x0081
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
            L_0x0081:
                return r2
            L_0x0082:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* access modifiers changed from: package-private */
        public final int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
        }

        /* access modifiers changed from: package-private */
        public final String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = bArr[r13];
                    if (!DecodeUtil.isOneByte(b)) {
                        break;
                    }
                    i = r13 + 1;
                    DecodeUtil.handleOneByte(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte b2 = bArr[r13];
                    if (DecodeUtil.isOneByte(b2)) {
                        int i7 = i5 + 1;
                        DecodeUtil.handleOneByte(b2, cArr, i5);
                        while (i6 < i3) {
                            byte b3 = bArr[i6];
                            if (!DecodeUtil.isOneByte(b3)) {
                                break;
                            }
                            i6++;
                            DecodeUtil.handleOneByte(b3, cArr, i7);
                            i7++;
                        }
                        r13 = i6;
                        i5 = i7;
                    } else if (DecodeUtil.isTwoBytes(b2)) {
                        if (i6 < i3) {
                            DecodeUtil.handleTwoBytes(b2, bArr[i6], cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (DecodeUtil.isThreeBytes(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            DecodeUtil.handleThreeBytes(b2, bArr[i6], bArr[i8], cArr, i5);
                            r13 = i8 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = bArr[i6];
                        int i10 = i9 + 1;
                        DecodeUtil.handleFourBytes(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                        r13 = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* access modifiers changed from: package-private */
        public final String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i, i2);
        }

        /* access modifiers changed from: package-private */
        public final int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char charAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) charAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 < 128 && i8 < i6) {
                    i4 = i8 + 1;
                    bArr[i8] = (byte) charAt2;
                } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & '?') | 128);
                    i7++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                    int i10 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                    int i11 = i10 + 1;
                    bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i4 = i11 + 1;
                    bArr[i11] = (byte) ((charAt2 & '?') | 128);
                } else if (i8 <= i6 - 4) {
                    int i12 = i7 + 1;
                    if (i12 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i12);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i13 = i8 + 1;
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i15 = i14 + 1;
                            bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 = i15 + 1;
                            bArr[i15] = (byte) ((codePoint & 63) | 128);
                            i7 = i12;
                            i7++;
                        } else {
                            i7 = i12;
                        }
                    }
                    throw new UnpairedSurrogateException(i7 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                    StringBuilder sb = new StringBuilder("Failed writing ");
                    sb.append(charAt2);
                    sb.append(" at index ");
                    sb.append(i8);
                    throw new ArrayIndexOutOfBoundsException(sb.toString());
                } else {
                    throw new UnpairedSurrogateException(i7, length);
                }
                i8 = i4;
                i7++;
            }
            return i8;
        }

        /* access modifiers changed from: package-private */
        public final void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i, i2);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i = i3 + 1;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return Utf8.incompleteStateFor(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i = i4 + 1;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 2) {
                        return Utf8.incompleteStateFor(bArr, i3, i2);
                    } else {
                        int i5 = i3 + 1;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && (((b << Ascii.FS) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (bArr[i5] <= -65) {
                                i3 = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return 0;
        }
    }

    static final class UnsafeProcessor extends Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x006e, code lost:
            if (com.google.protobuf.UnsafeUtil.getByte(r13, r0) > -65) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b3, code lost:
            if (com.google.protobuf.UnsafeUtil.getByte(r13, r0) > -65) goto L_0x00b5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int partialIsValidUtf8(int r12, byte[] r13, int r14, int r15) {
            /*
                r11 = this;
                int r0 = o.dispatchOnCancelled.setMax(r12)
                r1 = 1
                if (r12 == r0) goto L_0x0015
                o.onCanceled r2 = new o.onCanceled
                r2.<init>(r12, r0, r1)
                r0 = 1341863928(0x4ffb37f8, float:8.4294984E9)
                o.onCancelLoad.setMax(r0, r2)
                o.onCancelLoad.getMin(r0, r2)
            L_0x0015:
                r0 = r14 | r15
                int r2 = r13.length
                int r2 = r2 - r15
                r0 = r0 | r2
                r2 = 0
                if (r0 < 0) goto L_0x00bd
                long r0 = (long) r14
                long r14 = (long) r15
                if (r12 == 0) goto L_0x00b6
                int r3 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
                if (r3 < 0) goto L_0x0026
                return r12
            L_0x0026:
                byte r3 = (byte) r12
                r4 = -32
                r5 = -1
                r6 = -65
                r7 = 1
                if (r3 >= r4) goto L_0x0040
                r12 = -62
                if (r3 < r12) goto L_0x003f
                long r7 = r7 + r0
                byte r12 = com.google.protobuf.UnsafeUtil.getByte((byte[]) r13, (long) r0)
                if (r12 <= r6) goto L_0x003c
                goto L_0x003f
            L_0x003c:
                r0 = r7
                goto L_0x00b6
            L_0x003f:
                return r5
            L_0x0040:
                r9 = -16
                if (r3 >= r9) goto L_0x0074
                int r12 = r12 >> 8
                r12 = r12 ^ r5
                byte r12 = (byte) r12
                if (r12 != 0) goto L_0x005a
                long r9 = r0 + r7
                byte r12 = com.google.protobuf.UnsafeUtil.getByte((byte[]) r13, (long) r0)
                int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r0 < 0) goto L_0x0059
                int r12 = com.google.protobuf.Utf8.incompleteStateFor(r3, r12)
                return r12
            L_0x0059:
                r0 = r9
            L_0x005a:
                if (r12 > r6) goto L_0x0073
                r2 = -96
                if (r3 != r4) goto L_0x0062
                if (r12 < r2) goto L_0x0073
            L_0x0062:
                r4 = -19
                if (r3 != r4) goto L_0x0068
                if (r12 >= r2) goto L_0x0073
            L_0x0068:
                long r2 = r0 + r7
                byte r12 = com.google.protobuf.UnsafeUtil.getByte((byte[]) r13, (long) r0)
                if (r12 <= r6) goto L_0x0071
                goto L_0x0073
            L_0x0071:
                r0 = r2
                goto L_0x00b6
            L_0x0073:
                return r5
            L_0x0074:
                int r4 = r12 >> 8
                r4 = r4 ^ r5
                byte r4 = (byte) r4
                if (r4 != 0) goto L_0x008b
                long r9 = r0 + r7
                byte r4 = com.google.protobuf.UnsafeUtil.getByte((byte[]) r13, (long) r0)
                int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r12 < 0) goto L_0x0089
                int r12 = com.google.protobuf.Utf8.incompleteStateFor(r3, r4)
                return r12
            L_0x0089:
                r0 = r9
                goto L_0x008e
            L_0x008b:
                int r12 = r12 >> 16
                byte r2 = (byte) r12
            L_0x008e:
                if (r2 != 0) goto L_0x00a0
                long r9 = r0 + r7
                byte r2 = com.google.protobuf.UnsafeUtil.getByte((byte[]) r13, (long) r0)
                int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r12 < 0) goto L_0x009f
                int r12 = com.google.protobuf.Utf8.incompleteStateFor((int) r3, (int) r4, (int) r2)
                return r12
            L_0x009f:
                r0 = r9
            L_0x00a0:
                if (r4 > r6) goto L_0x00b5
                int r12 = r3 << 28
                int r4 = r4 + 112
                int r12 = r12 + r4
                int r12 = r12 >> 30
                if (r12 != 0) goto L_0x00b5
                if (r2 > r6) goto L_0x00b5
                long r2 = r0 + r7
                byte r12 = com.google.protobuf.UnsafeUtil.getByte((byte[]) r13, (long) r0)
                if (r12 <= r6) goto L_0x0071
            L_0x00b5:
                return r5
            L_0x00b6:
                long r14 = r14 - r0
                int r12 = (int) r14
                int r12 = partialIsValidUtf8(r13, r0, r12)
                return r12
            L_0x00bd:
                java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r13 = r13.length
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r2] = r13
                java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
                r0[r1] = r13
                r13 = 2
                java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
                r0[r13] = r14
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r13 = java.lang.String.format(r13, r0)
                r12.<init>(r13)
                goto L_0x00e1
            L_0x00e0:
                throw r12
            L_0x00e1:
                goto L_0x00e0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
            if (com.google.protobuf.UnsafeUtil.getByte(r2) > -65) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a8, code lost:
            if (com.google.protobuf.UnsafeUtil.getByte(r2) > -65) goto L_0x00aa;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int partialIsValidUtf8Direct(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                r10 = this;
                r0 = r13 | r14
                int r1 = r12.limit()
                int r1 = r1 - r14
                r0 = r0 | r1
                r1 = 0
                if (r0 < 0) goto L_0x00b2
                long r2 = com.google.protobuf.UnsafeUtil.addressOffset(r12)
                long r4 = (long) r13
                long r2 = r2 + r4
                int r14 = r14 - r13
                long r12 = (long) r14
                long r12 = r12 + r2
                if (r11 == 0) goto L_0x00ab
                int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r14 < 0) goto L_0x001b
                return r11
            L_0x001b:
                byte r14 = (byte) r11
                r0 = -32
                r4 = -1
                r5 = -65
                r6 = 1
                if (r14 >= r0) goto L_0x0035
                r11 = -62
                if (r14 < r11) goto L_0x0034
                long r6 = r6 + r2
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r2)
                if (r11 <= r5) goto L_0x0031
                goto L_0x0034
            L_0x0031:
                r2 = r6
                goto L_0x00ab
            L_0x0034:
                return r4
            L_0x0035:
                r8 = -16
                if (r14 >= r8) goto L_0x0069
                int r11 = r11 >> 8
                r11 = r11 ^ r4
                byte r11 = (byte) r11
                if (r11 != 0) goto L_0x004f
                long r8 = r2 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r2)
                int r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r1 < 0) goto L_0x004e
                int r11 = com.google.protobuf.Utf8.incompleteStateFor(r14, r11)
                return r11
            L_0x004e:
                r2 = r8
            L_0x004f:
                if (r11 > r5) goto L_0x0068
                r1 = -96
                if (r14 != r0) goto L_0x0057
                if (r11 < r1) goto L_0x0068
            L_0x0057:
                r0 = -19
                if (r14 != r0) goto L_0x005d
                if (r11 >= r1) goto L_0x0068
            L_0x005d:
                long r0 = r2 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r2)
                if (r11 <= r5) goto L_0x0066
                goto L_0x0068
            L_0x0066:
                r2 = r0
                goto L_0x00ab
            L_0x0068:
                return r4
            L_0x0069:
                int r0 = r11 >> 8
                r0 = r0 ^ r4
                byte r0 = (byte) r0
                if (r0 != 0) goto L_0x0080
                long r8 = r2 + r6
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r2)
                int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r11 < 0) goto L_0x007e
                int r11 = com.google.protobuf.Utf8.incompleteStateFor(r14, r0)
                return r11
            L_0x007e:
                r2 = r8
                goto L_0x0083
            L_0x0080:
                int r11 = r11 >> 16
                byte r1 = (byte) r11
            L_0x0083:
                if (r1 != 0) goto L_0x0095
                long r8 = r2 + r6
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r2)
                int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r11 < 0) goto L_0x0094
                int r11 = com.google.protobuf.Utf8.incompleteStateFor((int) r14, (int) r0, (int) r1)
                return r11
            L_0x0094:
                r2 = r8
            L_0x0095:
                if (r0 > r5) goto L_0x00aa
                int r11 = r14 << 28
                int r0 = r0 + 112
                int r11 = r11 + r0
                int r11 = r11 >> 30
                if (r11 != 0) goto L_0x00aa
                if (r1 > r5) goto L_0x00aa
                long r0 = r2 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r2)
                if (r11 <= r5) goto L_0x0066
            L_0x00aa:
                return r4
            L_0x00ab:
                long r12 = r12 - r2
                int r11 = (int) r12
                int r11 = partialIsValidUtf8(r2, r11)
                return r11
            L_0x00b2:
                java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r12 = r12.limit()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r0[r1] = r12
                r12 = 1
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r12] = r13
                r12 = 2
                java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
                r0[r12] = r13
                java.lang.String r12 = "buffer limit=%d, index=%d, limit=%d"
                java.lang.String r12 = java.lang.String.format(r12, r0)
                r11.<init>(r12)
                goto L_0x00da
            L_0x00d9:
                throw r11
            L_0x00da:
                goto L_0x00d9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        /* access modifiers changed from: package-private */
        public final String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = UnsafeUtil.getByte(bArr, (long) r13);
                    if (!DecodeUtil.isOneByte(b)) {
                        break;
                    }
                    i = r13 + 1;
                    DecodeUtil.handleOneByte(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte b2 = UnsafeUtil.getByte(bArr, (long) r13);
                    if (DecodeUtil.isOneByte(b2)) {
                        int i7 = i5 + 1;
                        DecodeUtil.handleOneByte(b2, cArr, i5);
                        while (i6 < i3) {
                            byte b3 = UnsafeUtil.getByte(bArr, (long) i6);
                            if (!DecodeUtil.isOneByte(b3)) {
                                break;
                            }
                            i6++;
                            DecodeUtil.handleOneByte(b3, cArr, i7);
                            i7++;
                        }
                        r13 = i6;
                        i5 = i7;
                    } else if (DecodeUtil.isTwoBytes(b2)) {
                        if (i6 < i3) {
                            int i8 = i6 + 1;
                            DecodeUtil.handleTwoBytes(b2, UnsafeUtil.getByte(bArr, (long) i6), cArr, i5);
                            r13 = i8;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (DecodeUtil.isThreeBytes(b2)) {
                        if (i6 < i3 - 1) {
                            int i9 = i6 + 1;
                            int i10 = i9 + 1;
                            DecodeUtil.handleThreeBytes(b2, UnsafeUtil.getByte(bArr, (long) i6), UnsafeUtil.getByte(bArr, (long) i9), cArr, i5);
                            r13 = i10;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i6 < i3 - 2) {
                        int i11 = i6 + 1;
                        byte b4 = UnsafeUtil.getByte(bArr, (long) i6);
                        int i12 = i11 + 1;
                        DecodeUtil.handleFourBytes(b2, b4, UnsafeUtil.getByte(bArr, (long) i11), UnsafeUtil.getByte(bArr, (long) i12), cArr, i5);
                        r13 = i12 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* access modifiers changed from: package-private */
        public final String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            long j;
            int i3 = i;
            int i4 = i2;
            if ((i3 | i4 | ((byteBuffer.limit() - i3) - i4)) >= 0) {
                long addressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i3);
                long j2 = ((long) i4) + addressOffset;
                char[] cArr = new char[i4];
                int i5 = 0;
                while (addressOffset < j2) {
                    byte b = UnsafeUtil.getByte(addressOffset);
                    if (!DecodeUtil.isOneByte(b)) {
                        break;
                    }
                    addressOffset++;
                    DecodeUtil.handleOneByte(b, cArr, i5);
                    i5++;
                }
                while (true) {
                    int i6 = i5;
                    while (j < j2) {
                        long j3 = j + 1;
                        byte b2 = UnsafeUtil.getByte(j);
                        if (DecodeUtil.isOneByte(b2)) {
                            int i7 = i6 + 1;
                            DecodeUtil.handleOneByte(b2, cArr, i6);
                            while (j3 < j2) {
                                byte b3 = UnsafeUtil.getByte(j3);
                                if (!DecodeUtil.isOneByte(b3)) {
                                    break;
                                }
                                j3++;
                                DecodeUtil.handleOneByte(b3, cArr, i7);
                                i7++;
                            }
                            i6 = i7;
                            j = j3;
                        } else if (DecodeUtil.isTwoBytes(b2)) {
                            if (j3 < j2) {
                                j = j3 + 1;
                                DecodeUtil.handleTwoBytes(b2, UnsafeUtil.getByte(j3), cArr, i6);
                                i6++;
                            } else {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                        } else if (DecodeUtil.isThreeBytes(b2)) {
                            if (j3 < j2 - 1) {
                                long j4 = j3 + 1;
                                DecodeUtil.handleThreeBytes(b2, UnsafeUtil.getByte(j3), UnsafeUtil.getByte(j4), cArr, i6);
                                i6++;
                                j = j4 + 1;
                            } else {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                        } else if (j3 < j2 - 2) {
                            long j5 = j3 + 1;
                            byte b4 = UnsafeUtil.getByte(j3);
                            long j6 = j5 + 1;
                            byte b5 = UnsafeUtil.getByte(j5);
                            addressOffset = j6 + 1;
                            DecodeUtil.handleFourBytes(b2, b4, b5, UnsafeUtil.getByte(j6), cArr, i6);
                            i5 = i6 + 1 + 1;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                    return new String(cArr, 0, i6);
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00fb, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int encodeUtf8(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
            /*
                r22 = this;
                r0 = r23
                r1 = r24
                r2 = r25
                r3 = r26
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r23.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0141
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0141
                r2 = 0
            L_0x001a:
                r3 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                com.google.protobuf.UnsafeUtil.putByte((byte[]) r1, (long) r4, (byte) r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x013f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x004b
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x004b
                long r14 = r4 + r11
                byte r13 = (byte) r13
                com.google.protobuf.UnsafeUtil.putByte((byte[]) r1, (long) r4, (byte) r13)
                r4 = r11
                r12 = r14
            L_0x0047:
                r11 = 128(0x80, float:1.794E-43)
                goto L_0x00fb
            L_0x004b:
                r14 = 2048(0x800, float:2.87E-42)
                if (r13 >= r14) goto L_0x0075
                r14 = 2
                long r14 = r6 - r14
                int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r16 > 0) goto L_0x0075
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                com.google.protobuf.UnsafeUtil.putByte((byte[]) r1, (long) r4, (byte) r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r13 = 128(0x80, float:1.794E-43)
                r5 = r5 | r13
                byte r5 = (byte) r5
                com.google.protobuf.UnsafeUtil.putByte((byte[]) r1, (long) r14, (byte) r5)
                r20 = r11
                r11 = 128(0x80, float:1.794E-43)
                r12 = r3
                r4 = r20
                goto L_0x00fb
            L_0x0075:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x007f
                if (r3 >= r13) goto L_0x00ae
            L_0x007f:
                r15 = 3
                long r15 = r6 - r15
                int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r17 > 0) goto L_0x00ae
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                com.google.protobuf.UnsafeUtil.putByte((byte[]) r1, (long) r4, (byte) r3)
                long r3 = r14 + r11
                int r5 = r13 >>> 6
                r5 = r5 & 63
                r11 = 128(0x80, float:1.794E-43)
                r5 = r5 | r11
                byte r5 = (byte) r5
                com.google.protobuf.UnsafeUtil.putByte((byte[]) r1, (long) r14, (byte) r5)
                r14 = 1
                long r18 = r3 + r14
                r5 = r13 & 63
                r5 = r5 | r11
                byte r5 = (byte) r5
                com.google.protobuf.UnsafeUtil.putByte((byte[]) r1, (long) r3, (byte) r5)
                r12 = r18
                r4 = 1
                goto L_0x0047
            L_0x00ae:
                r11 = 4
                long r11 = r6 - r11
                int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r15 > 0) goto L_0x010f
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x0107
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x0106
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                com.google.protobuf.UnsafeUtil.putByte((byte[]) r1, (long) r4, (byte) r15)
                long r4 = r13 + r11
                int r15 = r2 >>> 12
                r15 = r15 & 63
                r11 = 128(0x80, float:1.794E-43)
                r12 = r15 | 128(0x80, float:1.794E-43)
                byte r12 = (byte) r12
                com.google.protobuf.UnsafeUtil.putByte((byte[]) r1, (long) r13, (byte) r12)
                r12 = 1
                long r14 = r4 + r12
                int r16 = r2 >>> 6
                r12 = r16 & 63
                r12 = r12 | r11
                byte r12 = (byte) r12
                com.google.protobuf.UnsafeUtil.putByte((byte[]) r1, (long) r4, (byte) r12)
                r4 = 1
                long r12 = r14 + r4
                r2 = r2 & 63
                r2 = r2 | r11
                byte r2 = (byte) r2
                com.google.protobuf.UnsafeUtil.putByte((byte[]) r1, (long) r14, (byte) r2)
                r2 = r3
            L_0x00fb:
                int r2 = r2 + 1
                r3 = 128(0x80, float:1.794E-43)
                r20 = r4
                r4 = r12
                r11 = r20
                goto L_0x0033
            L_0x0106:
                r2 = r3
            L_0x0107:
                com.google.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x010f:
                if (r14 > r13) goto L_0x0127
                if (r13 > r3) goto L_0x0127
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0121
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0127
            L_0x0121:
                com.google.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException
                r0.<init>(r2, r8)
                throw r0
            L_0x0127:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x013f:
                int r0 = (int) r4
                return r0
            L_0x0141:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r10)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                goto L_0x0162
            L_0x0161:
                throw r1
            L_0x0162:
                goto L_0x0161
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.encodeUtf8(java.lang.CharSequence, byte[], int, int):int");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0041 A[LOOP:1: B:11:0x0041->B:36:0x0100, LOOP_START, PHI: r2 r4 r9 r10 
          PHI: (r2v2 long) = (r2v0 long), (r2v3 long) binds: [B:8:0x0039, B:36:0x0100] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v4 long) = (r4v3 long), (r4v6 long) binds: [B:8:0x0039, B:36:0x0100] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:8:0x0039, B:36:0x0100] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v1 char) = (r10v0 char), (r10v2 char) binds: [B:8:0x0039, B:36:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void encodeUtf8Direct(java.lang.CharSequence r22, java.nio.ByteBuffer r23) {
            /*
                r21 = this;
                r0 = r22
                r1 = r23
                long r2 = com.google.protobuf.UnsafeUtil.addressOffset(r23)
                int r4 = r23.position()
                long r4 = (long) r4
                long r4 = r4 + r2
                int r6 = r23.limit()
                long r6 = (long) r6
                long r6 = r6 + r2
                int r8 = r22.length()
                long r9 = (long) r8
                long r11 = r6 - r4
                java.lang.String r13 = " at index "
                java.lang.String r14 = "Failed writing "
                int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r15 > 0) goto L_0x014e
                r9 = 0
            L_0x0024:
                r10 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r9 >= r8) goto L_0x0039
                char r15 = r0.charAt(r9)
                if (r15 >= r10) goto L_0x0039
                long r11 = r11 + r4
                byte r10 = (byte) r15
                com.google.protobuf.UnsafeUtil.putByte(r4, r10)
                int r9 = r9 + 1
                r4 = r11
                goto L_0x0024
            L_0x0039:
                if (r9 != r8) goto L_0x0041
                long r4 = r4 - r2
                int r0 = (int) r4
                r1.position(r0)
                return
            L_0x0041:
                if (r9 >= r8) goto L_0x0143
                char r15 = r0.charAt(r9)
                if (r15 >= r10) goto L_0x005b
                int r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r16 >= 0) goto L_0x005b
                long r16 = r4 + r11
                byte r15 = (byte) r15
                com.google.protobuf.UnsafeUtil.putByte(r4, r15)
                r4 = r16
                r15 = 128(0x80, float:1.794E-43)
                r17 = r2
                goto L_0x0100
            L_0x005b:
                r10 = 2048(0x800, float:2.87E-42)
                if (r15 >= r10) goto L_0x0083
                r17 = 2
                long r17 = r6 - r17
                int r10 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
                if (r10 > 0) goto L_0x0083
                r17 = r2
                long r1 = r4 + r11
                int r3 = r15 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                com.google.protobuf.UnsafeUtil.putByte(r4, r3)
                long r3 = r1 + r11
                r5 = r15 & 63
                r10 = 128(0x80, float:1.794E-43)
                r5 = r5 | r10
                byte r5 = (byte) r5
                com.google.protobuf.UnsafeUtil.putByte(r1, r5)
                r4 = r3
            L_0x007f:
                r15 = 128(0x80, float:1.794E-43)
                goto L_0x0100
            L_0x0083:
                r17 = r2
                r1 = 57343(0xdfff, float:8.0355E-41)
                r2 = 55296(0xd800, float:7.7486E-41)
                if (r15 < r2) goto L_0x008f
                if (r1 >= r15) goto L_0x00b9
            L_0x008f:
                r19 = 3
                long r19 = r6 - r19
                int r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
                if (r3 > 0) goto L_0x00b9
                long r1 = r4 + r11
                int r3 = r15 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                com.google.protobuf.UnsafeUtil.putByte(r4, r3)
                long r3 = r1 + r11
                int r5 = r15 >>> 6
                r5 = r5 & 63
                r10 = 128(0x80, float:1.794E-43)
                r5 = r5 | r10
                byte r5 = (byte) r5
                com.google.protobuf.UnsafeUtil.putByte(r1, r5)
                long r1 = r3 + r11
                r5 = r15 & 63
                r5 = r5 | r10
                byte r5 = (byte) r5
                com.google.protobuf.UnsafeUtil.putByte(r3, r5)
                r4 = r1
                goto L_0x007f
            L_0x00b9:
                r19 = 4
                long r19 = r6 - r19
                int r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
                if (r3 > 0) goto L_0x0113
                int r1 = r9 + 1
                if (r1 == r8) goto L_0x010b
                char r2 = r0.charAt(r1)
                boolean r3 = java.lang.Character.isSurrogatePair(r15, r2)
                if (r3 == 0) goto L_0x010a
                int r2 = java.lang.Character.toCodePoint(r15, r2)
                long r9 = r4 + r11
                int r3 = r2 >>> 18
                r3 = r3 | 240(0xf0, float:3.36E-43)
                byte r3 = (byte) r3
                com.google.protobuf.UnsafeUtil.putByte(r4, r3)
                long r3 = r9 + r11
                int r5 = r2 >>> 12
                r5 = r5 & 63
                r15 = 128(0x80, float:1.794E-43)
                r5 = r5 | r15
                byte r5 = (byte) r5
                com.google.protobuf.UnsafeUtil.putByte(r9, r5)
                long r9 = r3 + r11
                int r5 = r2 >>> 6
                r5 = r5 & 63
                r5 = r5 | r15
                byte r5 = (byte) r5
                com.google.protobuf.UnsafeUtil.putByte(r3, r5)
                long r3 = r9 + r11
                r2 = r2 & 63
                r2 = r2 | r15
                byte r2 = (byte) r2
                com.google.protobuf.UnsafeUtil.putByte(r9, r2)
                r9 = r1
                r4 = r3
            L_0x0100:
                int r9 = r9 + 1
                r1 = r23
                r2 = r17
                r10 = 128(0x80, float:1.794E-43)
                goto L_0x0041
            L_0x010a:
                r9 = r1
            L_0x010b:
                com.google.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException
                int r9 = r9 + -1
                r0.<init>(r9, r8)
                throw r0
            L_0x0113:
                if (r2 > r15) goto L_0x012b
                if (r15 > r1) goto L_0x012b
                int r1 = r9 + 1
                if (r1 == r8) goto L_0x0125
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r15, r0)
                if (r0 != 0) goto L_0x012b
            L_0x0125:
                com.google.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException
                r0.<init>(r9, r8)
                throw r0
            L_0x012b:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r14)
                r1.append(r15)
                r1.append(r13)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0143:
                r17 = r2
                long r4 = r4 - r17
                int r0 = (int) r4
                r1 = r23
                r1.position(r0)
                return
            L_0x014e:
                java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r14)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r3.append(r0)
                r3.append(r13)
                int r0 = r23.limit()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                goto L_0x0171
            L_0x0170:
                throw r2
            L_0x0171:
                goto L_0x0170
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.encodeUtf8Direct(java.lang.CharSequence, java.nio.ByteBuffer):void");
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (i2 < i) {
                long j2 = 1 + j;
                if (UnsafeUtil.getByte(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            return i;
        }

        private static int unsafeEstimateConsecutiveAscii(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = 8 - (((int) j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (UnsafeUtil.getByte(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (UnsafeUtil.getLong(j) & Utf8.ASCII_MASK_LONG) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static int partialIsValidUtf8(byte[] r8, long r9, int r11) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L_0x0007:
                r0 = 0
                r1 = 0
            L_0x0009:
                r2 = 1
                if (r11 <= 0) goto L_0x001a
                long r4 = r9 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte((byte[]) r8, (long) r9)
                if (r1 < 0) goto L_0x0019
                int r11 = r11 + -1
                r9 = r4
                goto L_0x0009
            L_0x0019:
                r9 = r4
            L_0x001a:
                if (r11 != 0) goto L_0x001d
                return r0
            L_0x001d:
                int r11 = r11 + -1
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L_0x003a
                if (r11 != 0) goto L_0x0029
                return r1
            L_0x0029:
                int r11 = r11 + -1
                r0 = -62
                if (r1 < r0) goto L_0x0039
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.UnsafeUtil.getByte((byte[]) r8, (long) r9)
                if (r9 <= r4) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r9 = r2
                goto L_0x0007
            L_0x0039:
                return r5
            L_0x003a:
                r6 = -16
                if (r1 >= r6) goto L_0x0065
                r6 = 2
                if (r11 >= r6) goto L_0x0046
                int r8 = unsafeIncompleteStateFor(r8, r1, r9, r11)
                return r8
            L_0x0046:
                int r11 = r11 + -2
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.UnsafeUtil.getByte((byte[]) r8, (long) r9)
                if (r9 > r4) goto L_0x0064
                r10 = -96
                if (r1 != r0) goto L_0x0056
                if (r9 < r10) goto L_0x0064
            L_0x0056:
                r0 = -19
                if (r1 != r0) goto L_0x005c
                if (r9 >= r10) goto L_0x0064
            L_0x005c:
                long r9 = r6 + r2
                byte r0 = com.google.protobuf.UnsafeUtil.getByte((byte[]) r8, (long) r6)
                if (r0 <= r4) goto L_0x0007
            L_0x0064:
                return r5
            L_0x0065:
                r0 = 3
                if (r11 >= r0) goto L_0x006d
                int r8 = unsafeIncompleteStateFor(r8, r1, r9, r11)
                return r8
            L_0x006d:
                int r11 = r11 + -3
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.UnsafeUtil.getByte((byte[]) r8, (long) r9)
                if (r9 > r4) goto L_0x008f
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L_0x008f
                long r9 = r6 + r2
                byte r0 = com.google.protobuf.UnsafeUtil.getByte((byte[]) r8, (long) r6)
                if (r0 > r4) goto L_0x008f
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.UnsafeUtil.getByte((byte[]) r8, (long) r9)
                if (r9 <= r4) goto L_0x0037
            L_0x008f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static int partialIsValidUtf8(long r8, int r10) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r8, r10)
                long r1 = (long) r0
                long r8 = r8 + r1
                int r10 = r10 - r0
            L_0x0007:
                r0 = 0
                r1 = 0
            L_0x0009:
                r2 = 1
                if (r10 <= 0) goto L_0x001a
                long r4 = r8 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r8)
                if (r1 < 0) goto L_0x0019
                int r10 = r10 + -1
                r8 = r4
                goto L_0x0009
            L_0x0019:
                r8 = r4
            L_0x001a:
                if (r10 != 0) goto L_0x001d
                return r0
            L_0x001d:
                int r10 = r10 + -1
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L_0x003a
                if (r10 != 0) goto L_0x0029
                return r1
            L_0x0029:
                int r10 = r10 + -1
                r0 = -62
                if (r1 < r0) goto L_0x0039
                long r2 = r2 + r8
                byte r8 = com.google.protobuf.UnsafeUtil.getByte(r8)
                if (r8 <= r4) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r8 = r2
                goto L_0x0007
            L_0x0039:
                return r5
            L_0x003a:
                r6 = -16
                if (r1 >= r6) goto L_0x0065
                r6 = 2
                if (r10 >= r6) goto L_0x0046
                int r8 = unsafeIncompleteStateFor(r8, r1, r10)
                return r8
            L_0x0046:
                int r10 = r10 + -2
                long r6 = r8 + r2
                byte r8 = com.google.protobuf.UnsafeUtil.getByte(r8)
                if (r8 > r4) goto L_0x0064
                r9 = -96
                if (r1 != r0) goto L_0x0056
                if (r8 < r9) goto L_0x0064
            L_0x0056:
                r0 = -19
                if (r1 != r0) goto L_0x005c
                if (r8 >= r9) goto L_0x0064
            L_0x005c:
                long r8 = r6 + r2
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r6)
                if (r0 <= r4) goto L_0x0007
            L_0x0064:
                return r5
            L_0x0065:
                r0 = 3
                if (r10 >= r0) goto L_0x006d
                int r8 = unsafeIncompleteStateFor(r8, r1, r10)
                return r8
            L_0x006d:
                int r10 = r10 + -3
                long r6 = r8 + r2
                byte r8 = com.google.protobuf.UnsafeUtil.getByte(r8)
                if (r8 > r4) goto L_0x008f
                int r9 = r1 << 28
                int r8 = r8 + 112
                int r9 = r9 + r8
                int r8 = r9 >> 30
                if (r8 != 0) goto L_0x008f
                long r8 = r6 + r2
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r6)
                if (r0 > r4) goto L_0x008f
                long r2 = r2 + r8
                byte r8 = com.google.protobuf.UnsafeUtil.getByte(r8)
                if (r8 <= r4) goto L_0x0037
            L_0x008f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return Utf8.incompleteStateFor(i);
            }
            if (i2 == 1) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.incompleteStateFor(i, (int) UnsafeUtil.getByte(bArr, j), (int) UnsafeUtil.getByte(bArr, j + 1));
            }
            throw new AssertionError();
        }

        private static int unsafeIncompleteStateFor(long j, int i, int i2) {
            if (i2 == 0) {
                return Utf8.incompleteStateFor(i);
            }
            if (i2 == 1) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(j));
            }
            if (i2 == 2) {
                return Utf8.incompleteStateFor(i, (int) UnsafeUtil.getByte(j), (int) UnsafeUtil.getByte(j + 1));
            }
            throw new AssertionError();
        }
    }

    static class DecodeUtil {
        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b) {
            return b > -65;
        }

        /* access modifiers changed from: private */
        public static boolean isOneByte(byte b) {
            return b >= 0;
        }

        /* access modifiers changed from: private */
        public static boolean isThreeBytes(byte b) {
            return b < -16;
        }

        /* access modifiers changed from: private */
        public static boolean isTwoBytes(byte b) {
            return b < -32;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & 1023) + 56320);
        }

        private static int trailingByteValue(byte b) {
            return b & 63;
        }

        private DecodeUtil() {
        }

        /* access modifiers changed from: private */
        public static void handleOneByte(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* access modifiers changed from: private */
        public static void handleTwoBytes(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b < -62 || isNotTrailingByte(b2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & Ascii.US) << 6) | trailingByteValue(b2));
        }

        /* access modifiers changed from: private */
        public static void handleThreeBytes(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || isNotTrailingByte(b3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & Ascii.SI) << Ascii.FF) | (trailingByteValue(b2) << 6) | trailingByteValue(b3));
        }

        /* access modifiers changed from: private */
        public static void handleFourBytes(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b2) || (((b << Ascii.FS) + (b2 + 112)) >> 30) != 0 || isNotTrailingByte(b3) || isNotTrailingByte(b4)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int trailingByteValue = ((b & 7) << Ascii.DC2) | (trailingByteValue(b2) << 12) | (trailingByteValue(b3) << 6) | trailingByteValue(b4);
            cArr[i] = highSurrogate(trailingByteValue);
            cArr[i + 1] = lowSurrogate(trailingByteValue);
        }
    }

    private Utf8() {
    }
}