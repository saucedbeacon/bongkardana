package kotlin.reflect.jvm.internal.impl.protobuf;

import com.alibaba.fastjson.parser.JSONLexer;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.text.Typography;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class CodedInputStream {
    private static int getMax = 1;
    private static long length = -552399006574136924L;
    private static int setMax;
    private final byte[] buffer;
    private final boolean bufferIsImmutable;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private RefillCallback refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    interface RefillCallback {
        void onRefill();
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        CodedInputStream codedInputStream = new CodedInputStream(inputStream);
        int i = setMax + 93;
        getMax = i % 128;
        if ((i % 2 == 0 ? '?' : 'M') != '?') {
            return codedInputStream;
        }
        Object obj = null;
        super.hashCode();
        return codedInputStream;
    }

    static CodedInputStream newInstance(LiteralByteString literalByteString) {
        CodedInputStream codedInputStream = new CodedInputStream(literalByteString);
        try {
            codedInputStream.pushLimit(literalByteString.size());
            int i = getMax + 85;
            setMax = i % 128;
            int i2 = i % 2;
            return codedInputStream;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final int readTag() throws IOException {
        boolean z = false;
        if ((isAtEnd() ? 'a' : JSONLexer.EOI) != 'a') {
            int readRawVarint32 = readRawVarint32();
            this.lastTag = readRawVarint32;
            if ((WireFormat.getTagFieldNumber(readRawVarint32) == 0 ? ',' : 'Y') != 'Y') {
                int i = getMax + 85;
                setMax = i % 128;
                if (i % 2 != 0) {
                    z = true;
                }
                if (z) {
                    try {
                        InvalidProtocolBufferException invalidTag = InvalidProtocolBufferException.invalidTag();
                        Object[] objArr = null;
                        int length2 = objArr.length;
                        throw invalidTag;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidTag();
                }
            } else {
                try {
                    return this.lastTag;
                } catch (Exception e2) {
                    throw e2;
                }
            }
        } else {
            int i2 = getMax + 45;
            setMax = i2 % 128;
            int i3 = i2 % 2;
            this.lastTag = 0;
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r6 != r0) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r6 != r0) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void checkLastTagWas(int r6) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r5 = this;
            int r0 = setMax
            int r0 = r0 + 97
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = 0
            if (r0 == 0) goto L_0x0020
            int r0 = o.dispatchOnCancelled.setMax(r6)     // Catch:{ Exception -> 0x0061 }
            super.hashCode()     // Catch:{ all -> 0x001e }
            if (r6 == r0) goto L_0x0034
            goto L_0x0026
        L_0x001e:
            r6 = move-exception
            throw r6
        L_0x0020:
            int r0 = o.dispatchOnCancelled.setMax(r6)     // Catch:{ Exception -> 0x0061 }
            if (r6 == r0) goto L_0x0034
        L_0x0026:
            o.onCanceled r4 = new o.onCanceled
            r4.<init>(r6, r0, r2)
            r0 = -916975606(0xffffffffc958100a, float:-884992.6)
            o.onCancelLoad.setMax(r0, r4)
            o.onCancelLoad.getMin(r0, r4)
        L_0x0034:
            int r0 = r5.lastTag     // Catch:{ Exception -> 0x005f }
            if (r0 == r6) goto L_0x0039
            r1 = 1
        L_0x0039:
            if (r1 == 0) goto L_0x0054
            int r6 = setMax
            int r6 = r6 + 77
            int r0 = r6 % 128
            getMax = r0
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x004f
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r6 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.invalidEndTag()     // Catch:{ Exception -> 0x005f }
            int r0 = r3.length     // Catch:{ all -> 0x004d }
            throw r6     // Catch:{ all -> 0x004d }
        L_0x004d:
            r6 = move-exception
            throw r6
        L_0x004f:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r6 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.invalidEndTag()     // Catch:{ Exception -> 0x005f }
            throw r6     // Catch:{ Exception -> 0x005f }
        L_0x0054:
            int r6 = getMax
            int r6 = r6 + 9
            int r0 = r6 % 128
            setMax = r0
            int r6 = r6 % 2
            return
        L_0x005f:
            r6 = move-exception
            throw r6
        L_0x0061:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.checkLastTagWas(int):void");
    }

    public final boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
        int i2 = getMax + 111;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        try {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            } else if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                int i4 = setMax + 63;
                getMax = i4 % 128;
                if ((i4 % 2 == 0 ? 'b' : '8') == '8') {
                    return true;
                }
                int i5 = 82 / 0;
                return true;
            } else if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            } else if (tagWireType == 3) {
                codedOutputStream.writeRawVarint32(i);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeRawVarint32(makeTag);
                return true;
            } else if (tagWireType == 4) {
                return false;
            } else {
                if (tagWireType == 5) {
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public final void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        while (true) {
            int readTag = readTag();
            if (readTag != 0) {
                try {
                    int i = getMax + 87;
                    setMax = i % 128;
                    int i2 = i % 2;
                    if (skipField(readTag, codedOutputStream)) {
                        int i3 = getMax + 31;
                        setMax = i3 % 128;
                        int i4 = i3 % 2;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else {
                return;
            }
        }
    }

    public final double readDouble() throws IOException {
        int i = setMax + 81;
        getMax = i % 128;
        if ((i % 2 == 0 ? 16 : 'J') != 16) {
            try {
                return Double.longBitsToDouble(readRawLittleEndian64());
            } catch (Exception e) {
                throw e;
            }
        } else {
            double longBitsToDouble = Double.longBitsToDouble(readRawLittleEndian64());
            Object obj = null;
            super.hashCode();
            return longBitsToDouble;
        }
    }

    public final float readFloat() throws IOException {
        try {
            int i = setMax + 71;
            getMax = i % 128;
            int i2 = i % 2;
            try {
                float intBitsToFloat = Float.intBitsToFloat(readRawLittleEndian32());
                int i3 = getMax + 83;
                setMax = i3 % 128;
                int i4 = i3 % 2;
                return intBitsToFloat;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final long readUInt64() throws IOException {
        long j;
        int i = getMax + 121;
        setMax = i % 128;
        Object[] objArr = null;
        if (i % 2 != 0) {
            try {
                j = readRawVarint64();
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            j = readRawVarint64();
        }
        int i2 = getMax + 17;
        setMax = i2 % 128;
        if ((i2 % 2 != 0 ? 'W' : ')') == ')') {
            return j;
        }
        int length2 = objArr.length;
        return j;
    }

    public final long readInt64() throws IOException {
        try {
            int i = setMax + 25;
            getMax = i % 128;
            int i2 = i % 2;
            long readRawVarint64 = readRawVarint64();
            int i3 = getMax + 47;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return readRawVarint64;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int readInt32() throws IOException {
        int i = setMax + 91;
        getMax = i % 128;
        int i2 = i % 2;
        int readRawVarint32 = readRawVarint32();
        int i3 = setMax + 1;
        getMax = i3 % 128;
        int i4 = i3 % 2;
        return readRawVarint32;
    }

    public final long readFixed64() throws IOException {
        int i = setMax + 49;
        getMax = i % 128;
        boolean z = i % 2 == 0;
        long readRawLittleEndian64 = readRawLittleEndian64();
        if (z) {
            int i2 = 16 / 0;
        }
        int i3 = setMax + 101;
        getMax = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 30 : 3) == 3) {
            return readRawLittleEndian64;
        }
        int i4 = 40 / 0;
        return readRawLittleEndian64;
    }

    public final int readFixed32() throws IOException {
        int i = getMax + 77;
        setMax = i % 128;
        int i2 = i % 2;
        int readRawLittleEndian32 = readRawLittleEndian32();
        try {
            int i3 = getMax + 107;
            setMax = i3 % 128;
            if (i3 % 2 == 0) {
                return readRawLittleEndian32;
            }
            Object obj = null;
            super.hashCode();
            return readRawLittleEndian32;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if ((r5 != 0 ? (char) 18 : 23) != 18) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r5 != 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0048, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean readBool() throws java.io.IOException {
        /*
            r8 = this;
            int r0 = getMax     // Catch:{ Exception -> 0x004b }
            int r0 = r0 + 43
            int r1 = r0 % 128
            setMax = r1     // Catch:{ Exception -> 0x0049 }
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = 0
            long r5 = r8.readRawVarint64()
            if (r0 == 0) goto L_0x0027
            r0 = 18
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0022
            r3 = 18
            goto L_0x0024
        L_0x0022:
            r3 = 23
        L_0x0024:
            if (r3 == r0) goto L_0x002b
            goto L_0x0048
        L_0x0027:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0048
        L_0x002b:
            int r0 = getMax     // Catch:{ Exception -> 0x0049 }
            int r0 = r0 + 105
            int r2 = r0 % 128
            setMax = r2     // Catch:{ Exception -> 0x0049 }
            int r0 = r0 % 2
            r2 = 20
            if (r0 == 0) goto L_0x003c
            r0 = 41
            goto L_0x003e
        L_0x003c:
            r0 = 20
        L_0x003e:
            if (r0 == r2) goto L_0x0047
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x0045 }
            return r1
        L_0x0045:
            r0 = move-exception
            throw r0
        L_0x0047:
            return r1
        L_0x0048:
            return r2
        L_0x0049:
            r0 = move-exception
            throw r0
        L_0x004b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readBool():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r0 > 0) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r0 > 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String readString() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = getMax
            int r0 = r0 + 73
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            int r0 = r5.readRawVarint32()
            int r1 = r5.bufferSize
            int r2 = r5.bufferPos
            int r1 = r1 - r2
            r2 = 0
            r3 = 6
            if (r0 > r1) goto L_0x004d
            int r1 = setMax
            int r1 = r1 + 17
            int r4 = r1 % 128
            getMax = r4
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x0026
            r1 = 31
            goto L_0x0027
        L_0x0026:
            r1 = 6
        L_0x0027:
            if (r1 == r3) goto L_0x002f
            int r1 = r2.length     // Catch:{ all -> 0x002d }
            if (r0 <= 0) goto L_0x004d
            goto L_0x0031
        L_0x002d:
            r0 = move-exception
            throw r0
        L_0x002f:
            if (r0 <= 0) goto L_0x004d
        L_0x0031:
            java.lang.String r1 = new java.lang.String
            byte[] r2 = r5.buffer
            int r4 = r5.bufferPos
            char[] r3 = new char[r3]
            r3 = {-12519, 32488, 12226, -9047, -29203, -17695} // fill-array
            java.lang.String r3 = length(r3)
            java.lang.String r3 = r3.intern()
            r1.<init>(r2, r4, r0, r3)
            int r2 = r5.bufferPos
            int r2 = r2 + r0
            r5.bufferPos = r2
            return r1
        L_0x004d:
            r1 = 44
            if (r0 != 0) goto L_0x0054
            r4 = 55
            goto L_0x0056
        L_0x0054:
            r4 = 44
        L_0x0056:
            if (r4 == r1) goto L_0x006d
            int r0 = setMax
            int r0 = r0 + 57
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x006c
            super.hashCode()     // Catch:{ all -> 0x006a }
            return r1
        L_0x006a:
            r0 = move-exception
            throw r0
        L_0x006c:
            return r1
        L_0x006d:
            java.lang.String r1 = new java.lang.String
            byte[] r0 = r5.readRawBytesSlowPath(r0)
            char[] r2 = new char[r3]
            r2 = {-12519, 32488, 12226, -9047, -29203, -17695} // fill-array
            java.lang.String r2 = length(r2)
            java.lang.String r2 = r2.intern()
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readString():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0 <= (r6.bufferSize * r2)) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if ((r0 <= r6.bufferSize - r2 ? (char) 23 : 21) != 23) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String readStringRequireUtf8() throws java.io.IOException {
        /*
            r6 = this;
            int r0 = getMax
            int r0 = r0 + 33
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x001a
            int r0 = r6.readRawVarint32()
            int r2 = r6.bufferPos
            int r3 = r6.bufferSize
            int r3 = r3 * r2
            if (r0 > r3) goto L_0x0036
            goto L_0x002f
        L_0x001a:
            int r0 = r6.readRawVarint32()
            int r2 = r6.bufferPos
            int r3 = r6.bufferSize
            int r3 = r3 - r2
            r4 = 23
            if (r0 > r3) goto L_0x002a
            r3 = 23
            goto L_0x002c
        L_0x002a:
            r3 = 21
        L_0x002c:
            if (r3 == r4) goto L_0x002f
            goto L_0x0036
        L_0x002f:
            if (r0 <= 0) goto L_0x0033
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            if (r3 == 0) goto L_0x0049
        L_0x0036:
            r2 = 15
            if (r0 != 0) goto L_0x003d
            r3 = 15
            goto L_0x003f
        L_0x003d:
            r3 = 55
        L_0x003f:
            if (r3 == r2) goto L_0x0046
            byte[] r2 = r6.readRawBytesSlowPath(r0)
            goto L_0x0063
        L_0x0046:
            java.lang.String r0 = ""
            return r0
        L_0x0049:
            int r1 = setMax
            int r1 = r1 + 77
            int r3 = r1 % 128
            getMax = r3
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x005a
            byte[] r1 = r6.buffer
            int r3 = r2 * r0
            goto L_0x005e
        L_0x005a:
            byte[] r1 = r6.buffer
            int r3 = r2 + r0
        L_0x005e:
            r6.bufferPos = r3
            r5 = r2
            r2 = r1
            r1 = r5
        L_0x0063:
            int r3 = r1 + r0
            boolean r3 = kotlin.reflect.jvm.internal.impl.protobuf.Utf8.isValidUtf8(r2, r1, r3)
            if (r3 != 0) goto L_0x007a
            int r0 = setMax
            int r0 = r0 + 37
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r0
        L_0x007a:
            java.lang.String r3 = new java.lang.String
            r4 = 6
            char[] r4 = new char[r4]
            r4 = {-12519, 32488, 12226, -9047, -29203, -17695} // fill-array
            java.lang.String r4 = length(r4)
            java.lang.String r4 = r4.intern()
            r3.<init>(r2, r1, r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readStringRequireUtf8():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r5.recursionDepth < r5.recursionLimit) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.recursionLimitExceeded();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if ((r0 < r3) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void readGroup(int r6, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder r7, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r8) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = setMax
            int r0 = r0 + 67
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001d
            int r0 = r5.recursionDepth
            int r3 = r5.recursionLimit
            int r4 = r1.length     // Catch:{ all -> 0x001b }
            if (r0 < r3) goto L_0x0017
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            if (r0 == 0) goto L_0x0054
            goto L_0x0023
        L_0x001b:
            r6 = move-exception
            throw r6
        L_0x001d:
            int r0 = r5.recursionDepth
            int r3 = r5.recursionLimit
            if (r0 >= r3) goto L_0x0054
        L_0x0023:
            int r0 = r5.recursionDepth
            int r0 = r0 + r2
            r5.recursionDepth = r0
            r7.mergeFrom(r5, r8)
            r7 = 4
            int r6 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.makeTag(r6, r7)
            r5.checkLastTagWas(r6)
            int r6 = r5.recursionDepth
            int r6 = r6 - r2
            r5.recursionDepth = r6
            int r6 = getMax
            int r6 = r6 + 89
            int r7 = r6 % 128
            setMax = r7
            int r6 = r6 % 2
            r7 = 14
            if (r6 == 0) goto L_0x0049
            r6 = 14
            goto L_0x004b
        L_0x0049:
            r6 = 92
        L_0x004b:
            if (r6 == r7) goto L_0x004e
            return
        L_0x004e:
            super.hashCode()     // Catch:{ all -> 0x0052 }
            return
        L_0x0052:
            r6 = move-exception
            throw r6
        L_0x0054:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r6 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.recursionLimitExceeded()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readGroup(int, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
    }

    public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        try {
            int readRawVarint32 = readRawVarint32();
            if (!(this.recursionDepth < this.recursionLimit)) {
                int i = setMax + 51;
                getMax = i % 128;
                if ((i % 2 == 0 ? 'Y' : '3') != '3') {
                    InvalidProtocolBufferException recursionLimitExceeded = InvalidProtocolBufferException.recursionLimitExceeded();
                    Object obj = null;
                    super.hashCode();
                    throw recursionLimitExceeded;
                }
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(pushLimit);
            int i2 = setMax + 49;
            getMax = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r6.recursionDepth < r6.recursionLimit) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        if ((r6.recursionDepth < r6.recursionLimit) == true) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.recursionLimitExceeded();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> T readMessage(kotlin.reflect.jvm.internal.impl.protobuf.Parser<T> r7, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r8) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = getMax
            int r0 = r0 + 71
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == 0) goto L_0x0027
            int r0 = r6.readRawVarint32()     // Catch:{ Exception -> 0x0025 }
            int r3 = r6.recursionDepth     // Catch:{ Exception -> 0x0023 }
            int r4 = r6.recursionLimit     // Catch:{ Exception -> 0x0023 }
            r5 = 43
            int r5 = r5 / r1
            if (r3 >= r4) goto L_0x005b
            goto L_0x0036
        L_0x0021:
            r7 = move-exception
            throw r7
        L_0x0023:
            r7 = move-exception
            goto L_0x0060
        L_0x0025:
            r7 = move-exception
            throw r7
        L_0x0027:
            int r0 = r6.readRawVarint32()
            int r3 = r6.recursionDepth
            int r4 = r6.recursionLimit
            if (r3 < r4) goto L_0x0033
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            if (r3 != r2) goto L_0x005b
        L_0x0036:
            int r0 = r6.pushLimit(r0)
            int r3 = r6.recursionDepth
            int r3 = r3 + r2
            r6.recursionDepth = r3
            java.lang.Object r7 = r7.parsePartialFrom(r6, r8)
            kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r7 = (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) r7
            r6.checkLastTagWas(r1)
            int r8 = r6.recursionDepth
            int r8 = r8 - r2
            r6.recursionDepth = r8
            r6.popLimit(r0)
            int r8 = setMax
            int r8 = r8 + 19
            int r0 = r8 % 128
            getMax = r0
            int r8 = r8 % 2
            return r7
        L_0x005b:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r7 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.recursionLimitExceeded()     // Catch:{ Exception -> 0x0023 }
            throw r7
        L_0x0060:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.protobuf.Parser, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.protobuf.MessageLite");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if ((r0 <= (r4.bufferSize >> r4.bufferPos) ? kotlin.text.Typography.dollar : 'I') != 'I') goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if ((r0 > r4.bufferSize - r4.bufferPos) != false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.protobuf.ByteString readBytes() throws java.io.IOException {
        /*
            r4 = this;
            int r0 = setMax     // Catch:{ Exception -> 0x0082 }
            int r0 = r0 + 3
            int r1 = r0 % 128
            getMax = r1     // Catch:{ Exception -> 0x0082 }
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0023
            int r0 = r4.readRawVarint32()     // Catch:{ Exception -> 0x0082 }
            int r1 = r4.bufferSize     // Catch:{ Exception -> 0x0082 }
            int r2 = r4.bufferPos     // Catch:{ Exception -> 0x0021 }
            int r1 = r1 >> r2
            r2 = 73
            if (r0 > r1) goto L_0x001c
            r1 = 36
            goto L_0x001e
        L_0x001c:
            r1 = 73
        L_0x001e:
            if (r1 == r2) goto L_0x0073
            goto L_0x0034
        L_0x0021:
            r0 = move-exception
            throw r0
        L_0x0023:
            int r0 = r4.readRawVarint32()
            int r1 = r4.bufferSize
            int r2 = r4.bufferPos
            int r1 = r1 - r2
            if (r0 > r1) goto L_0x0030
            r1 = 0
            goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            if (r1 == 0) goto L_0x0034
            goto L_0x0073
        L_0x0034:
            if (r0 <= 0) goto L_0x0073
            boolean r1 = r4.bufferIsImmutable
            r2 = 57
            if (r1 == 0) goto L_0x003f
            r1 = 58
            goto L_0x0041
        L_0x003f:
            r1 = 57
        L_0x0041:
            if (r1 == r2) goto L_0x005b
            int r1 = getMax
            int r1 = r1 + 77
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % 2
            boolean r1 = r4.enableAliasing
            if (r1 == 0) goto L_0x005b
            kotlin.reflect.jvm.internal.impl.protobuf.BoundedByteString r1 = new kotlin.reflect.jvm.internal.impl.protobuf.BoundedByteString
            byte[] r2 = r4.buffer
            int r3 = r4.bufferPos
            r1.<init>(r2, r3, r0)
            goto L_0x0063
        L_0x005b:
            byte[] r1 = r4.buffer
            int r2 = r4.bufferPos
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString r1 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.copyFrom(r1, r2, r0)
        L_0x0063:
            int r2 = r4.bufferPos
            int r2 = r2 + r0
            r4.bufferPos = r2
            int r0 = setMax
            int r0 = r0 + 11
            int r2 = r0 % 128
            getMax = r2
            int r0 = r0 % 2
            return r1
        L_0x0073:
            if (r0 != 0) goto L_0x0078
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY
            return r0
        L_0x0078:
            kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString r1 = new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
            byte[] r0 = r4.readRawBytesSlowPath(r0)
            r1.<init>(r0)
            return r1
        L_0x0082:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readBytes():kotlin.reflect.jvm.internal.impl.protobuf.ByteString");
    }

    public final int readUInt32() throws IOException {
        int i = setMax + 31;
        getMax = i % 128;
        int i2 = i % 2;
        int readRawVarint32 = readRawVarint32();
        try {
            int i3 = setMax + 89;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            return readRawVarint32;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int readEnum() throws IOException {
        int i = getMax + 29;
        setMax = i % 128;
        if (i % 2 == 0) {
            return readRawVarint32();
        }
        int readRawVarint32 = readRawVarint32();
        Object[] objArr = null;
        int length2 = objArr.length;
        return readRawVarint32;
    }

    public final int readSFixed32() throws IOException {
        int i = setMax + 87;
        getMax = i % 128;
        int i2 = i % 2;
        try {
            int readRawLittleEndian32 = readRawLittleEndian32();
            int i3 = getMax + 63;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return readRawLittleEndian32;
        } catch (Exception e) {
            throw e;
        }
    }

    public final long readSFixed64() throws IOException {
        int i = getMax + 103;
        setMax = i % 128;
        int i2 = i % 2;
        long readRawLittleEndian64 = readRawLittleEndian64();
        try {
            int i3 = setMax + 71;
            try {
                getMax = i3 % 128;
                int i4 = i3 % 2;
                return readRawLittleEndian64;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final int readSInt32() throws IOException {
        int i = setMax + 85;
        getMax = i % 128;
        int i2 = i % 2;
        int decodeZigZag32 = decodeZigZag32(readRawVarint32());
        int i3 = getMax + 31;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        return decodeZigZag32;
    }

    public final long readSInt64() throws IOException {
        long j;
        try {
            int i = getMax + 31;
            setMax = i % 128;
            if (!(i % 2 != 0)) {
                j = decodeZigZag64(readRawVarint64());
            } else {
                j = decodeZigZag64(readRawVarint64());
                Object[] objArr = null;
                int length2 = objArr.length;
            }
            int i2 = getMax + 23;
            setMax = i2 % 128;
            int i3 = i2 % 2;
            return j;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cf, code lost:
        if (r1[r2] >= 0) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int readRawVarint32() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.bufferPos
            int r1 = r11.bufferSize
            r2 = 75
            if (r1 == r0) goto L_0x000b
            r1 = 75
            goto L_0x000d
        L_0x000b:
            r1 = 85
        L_0x000d:
            if (r1 == r2) goto L_0x0011
            goto L_0x00d2
        L_0x0011:
            byte[] r1 = r11.buffer
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x001c
            r11.bufferPos = r2
            return r0
        L_0x001c:
            int r3 = r11.bufferSize
            int r3 = r3 - r2
            r4 = 9
            r5 = 0
            r6 = 1
            if (r3 < r4) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            if (r3 == r6) goto L_0x002c
            goto L_0x00d2
        L_0x002c:
            int r3 = getMax
            int r3 = r3 + 103
            int r4 = r3 % 128
            setMax = r4
            int r3 = r3 % 2
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            long r7 = (long) r0
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0045
            r5 = 1
        L_0x0045:
            if (r5 == 0) goto L_0x004d
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 ^ r7
        L_0x004a:
            int r1 = (int) r0
            goto L_0x00d8
        L_0x004d:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r3 = r3 << 14
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x0060
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r3
            int r1 = (int) r0
        L_0x005d:
            r3 = r2
            goto L_0x00d8
        L_0x0060:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            long r4 = (long) r0
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0071
            r0 = -2080896(0xffffffffffe03f80, double:NaN)
            long r0 = r0 ^ r4
            goto L_0x004a
        L_0x0071:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r4 = r3 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            r4 = 40
            if (r3 >= 0) goto L_0x0085
            r3 = 40
            goto L_0x0087
        L_0x0085:
            r3 = 89
        L_0x0087:
            if (r3 == r4) goto L_0x008b
        L_0x0089:
            r1 = r0
            goto L_0x005d
        L_0x008b:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            r4 = 79
            if (r2 >= 0) goto L_0x0096
            r2 = 79
            goto L_0x0098
        L_0x0096:
            r2 = 88
        L_0x0098:
            if (r2 == r4) goto L_0x009c
        L_0x009a:
            r1 = r0
            goto L_0x00d8
        L_0x009c:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            r4 = 23
            if (r3 >= 0) goto L_0x00a7
            r3 = 47
            goto L_0x00a9
        L_0x00a7:
            r3 = 23
        L_0x00a9:
            if (r3 == r4) goto L_0x0089
            int r3 = getMax
            int r3 = r3 + 97
            int r4 = r3 % 128
            setMax = r4
            int r3 = r3 % 2
            int r3 = r2 + 1
            byte r2 = r1[r2]
            r4 = 51
            if (r2 >= 0) goto L_0x00c0
            r2 = 51
            goto L_0x00c2
        L_0x00c0:
            r2 = 66
        L_0x00c2:
            if (r2 == r4) goto L_0x00c5
            goto L_0x009a
        L_0x00c5:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x0089
            int r3 = r2 + 1
            byte r1 = r1[r2]
            if (r1 < 0) goto L_0x00d2
            goto L_0x009a
        L_0x00d2:
            long r0 = r11.readRawVarint64SlowPath()
            int r1 = (int) r0
            return r1
        L_0x00d8:
            r11.bufferPos = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint32():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        if ((r3 == -1 ? (char) 29 : 21) != 29) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0073, code lost:
        if (r3 != -1) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0081, code lost:
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int readRawVarint32(int r7, java.io.InputStream r8) throws java.io.IOException {
        /*
            r0 = r7 & 128(0x80, float:1.794E-43)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == r2) goto L_0x0088
            r7 = r7 & 127(0x7f, float:1.78E-43)
            r0 = 7
        L_0x000e:
            r3 = 32
            r4 = -1
            if (r0 >= r3) goto L_0x0045
            int r3 = setMax
            int r3 = r3 + 123
            int r5 = r3 % 128
            getMax = r5
            int r3 = r3 % 2
            int r3 = r8.read()
            if (r3 != r4) goto L_0x0034
            int r7 = getMax
            int r7 = r7 + 111
            int r8 = r7 % 128
            setMax = r8
            int r7 = r7 % 2
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r7 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage()     // Catch:{ Exception -> 0x0032 }
            throw r7     // Catch:{ Exception -> 0x0032 }
        L_0x0032:
            r7 = move-exception
            goto L_0x0082
        L_0x0034:
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r4 = r4 << r0
            r7 = r7 | r4
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            if (r3 == r2) goto L_0x0044
            int r0 = r0 + 7
            goto L_0x000e
        L_0x0044:
            return r7
        L_0x0045:
            r3 = 64
            if (r0 >= r3) goto L_0x004b
            r3 = 0
            goto L_0x004c
        L_0x004b:
            r3 = 1
        L_0x004c:
            if (r3 == r2) goto L_0x0083
            int r3 = getMax
            int r3 = r3 + 123
            int r5 = r3 % 128
            setMax = r5
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x006f
            int r3 = r8.read()
            r5 = 54
            int r5 = r5 / r1
            r5 = 29
            if (r3 != r4) goto L_0x0068
            r6 = 29
            goto L_0x006a
        L_0x0068:
            r6 = 21
        L_0x006a:
            if (r6 == r5) goto L_0x007d
            goto L_0x0075
        L_0x006d:
            r7 = move-exception
            throw r7
        L_0x006f:
            int r3 = r8.read()
            if (r3 == r4) goto L_0x007d
        L_0x0075:
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x007a
            return r7
        L_0x007a:
            int r0 = r0 + 7
            goto L_0x0045
        L_0x007d:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r7 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage()     // Catch:{ Exception -> 0x0032 }
            throw r7
        L_0x0082:
            throw r7
        L_0x0083:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r7 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.malformedVarint()
            throw r7
        L_0x0088:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint32(int, java.io.InputStream):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r13.bufferSize != r0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0068, code lost:
        if ((r9 < 0 ? '*' : 'V') != 'V') goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        if ((r9 < 0) != true) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r2 != r0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0159, code lost:
        if (r4 != false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0167, code lost:
        if (r4 != true) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x016a, code lost:
        r9 = r9 ^ -128;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long readRawVarint64() throws java.io.IOException {
        /*
            r13 = this;
            int r0 = setMax
            int r0 = r0 + 103
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 != 0) goto L_0x001d
            int r0 = r13.bufferPos     // Catch:{ Exception -> 0x001a }
            int r2 = r13.bufferSize     // Catch:{ Exception -> 0x001a }
            r3 = 0
            super.hashCode()     // Catch:{ all -> 0x0018 }
            if (r2 == r0) goto L_0x0173
            goto L_0x0023
        L_0x0018:
            r0 = move-exception
            throw r0
        L_0x001a:
            r0 = move-exception
            goto L_0x0181
        L_0x001d:
            int r0 = r13.bufferPos
            int r2 = r13.bufferSize
            if (r2 == r0) goto L_0x0173
        L_0x0023:
            byte[] r2 = r13.buffer     // Catch:{ Exception -> 0x0171 }
            int r3 = r0 + 1
            byte r0 = r2[r0]
            r4 = 0
            if (r0 < 0) goto L_0x002e
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r5 == 0) goto L_0x0035
            r13.bufferPos = r3
            long r0 = (long) r0
            return r0
        L_0x0035:
            int r5 = r13.bufferSize
            int r5 = r5 - r3
            r6 = 9
            r7 = 54
            if (r5 < r6) goto L_0x0041
            r5 = 84
            goto L_0x0043
        L_0x0041:
            r5 = 54
        L_0x0043:
            if (r5 == r7) goto L_0x0173
            int r5 = setMax
            int r5 = r5 + 41
            int r6 = r5 % 128
            getMax = r6
            int r5 = r5 % 2
            r6 = 42
            r7 = 0
            if (r5 != 0) goto L_0x006c
            int r5 = r3 + 103
            byte r3 = r2[r3]
            int r3 = r3 >>> 13
            r0 = r0 & r3
            long r9 = (long) r0
            r0 = 86
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0066
            r3 = 42
            goto L_0x0068
        L_0x0066:
            r3 = 86
        L_0x0068:
            if (r3 == r0) goto L_0x007d
            goto L_0x016a
        L_0x006c:
            int r5 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r9 = (long) r0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x007a
            r0 = 1
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            if (r0 == r1) goto L_0x016a
        L_0x007d:
            int r0 = r5 + 1
            byte r3 = r2[r5]
            int r3 = r3 << 14
            long r11 = (long) r3
            long r9 = r9 ^ r11
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x008b
            r3 = 0
            goto L_0x008c
        L_0x008b:
            r3 = 1
        L_0x008c:
            if (r3 == r1) goto L_0x00a3
            int r1 = getMax
            int r1 = r1 + 67
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % 2
            r2 = 16256(0x3f80, double:8.0315E-320)
            if (r1 == 0) goto L_0x00a0
            long r9 = r9 * r2
            goto L_0x016e
        L_0x00a0:
            long r9 = r9 ^ r2
            goto L_0x016e
        L_0x00a3:
            int r3 = r0 + 1
            byte r0 = r2[r0]
            int r0 = r0 << 21
            long r11 = (long) r0
            long r9 = r9 ^ r11
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c0
            int r0 = getMax
            int r0 = r0 + 79
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r0 = -2080896(0xffffffffffe03f80, double:NaN)
        L_0x00bc:
            long r9 = r9 ^ r0
        L_0x00bd:
            r0 = r3
            goto L_0x016e
        L_0x00c0:
            int r0 = r3 + 1
            byte r3 = r2[r3]
            long r11 = (long) r3
            r3 = 28
            long r11 = r11 << r3
            long r9 = r9 ^ r11
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x00d3
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r9 = r9 ^ r1
            goto L_0x016e
        L_0x00d3:
            int r3 = r0 + 1
            byte r0 = r2[r0]
            long r11 = (long) r0
            r0 = 35
            long r11 = r11 << r0
            long r9 = r9 ^ r11
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e6
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L_0x00bc
        L_0x00e6:
            int r5 = r3 + 1
            byte r3 = r2[r3]
            long r11 = (long) r3
            long r11 = r11 << r6
            long r9 = r9 ^ r11
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x011a
            int r1 = getMax
            int r1 = r1 + 75
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % 2
            r2 = 80
            if (r1 == 0) goto L_0x0101
            r0 = 80
        L_0x0101:
            r3 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            if (r0 == r2) goto L_0x010c
            long r0 = r9 ^ r3
        L_0x010a:
            r9 = r0
            goto L_0x010f
        L_0x010c:
            long r0 = r9 | r3
            goto L_0x010a
        L_0x010f:
            int r0 = setMax
            int r0 = r0 + 17
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            goto L_0x016d
        L_0x011a:
            int r0 = r5 + 1
            byte r3 = r2[r5]
            long r5 = (long) r3
            r3 = 49
            long r5 = r5 << r3
            long r5 = r5 ^ r9
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x012f
            r1 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            long r9 = r5 ^ r1
            goto L_0x016e
        L_0x012f:
            int r3 = r0 + 1
            byte r0 = r2[r0]
            long r9 = (long) r0
            r0 = 56
            long r9 = r9 << r0
            long r5 = r5 ^ r9
            r9 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r9 = r9 ^ r5
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bd
            int r0 = getMax
            int r0 = r0 + 69
            int r5 = r0 % 128
            setMax = r5
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x015c
            int r0 = r3 + 86
            byte r2 = r2[r3]
            long r2 = (long) r2
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x0158
            goto L_0x0159
        L_0x0158:
            r4 = 1
        L_0x0159:
            if (r4 == 0) goto L_0x016e
            goto L_0x0173
        L_0x015c:
            int r0 = r3 + 1
            byte r2 = r2[r3]
            long r2 = (long) r2
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x0166
            goto L_0x0167
        L_0x0166:
            r4 = 1
        L_0x0167:
            if (r4 == r1) goto L_0x0173
            goto L_0x016e
        L_0x016a:
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r9 = r9 ^ r0
        L_0x016d:
            r0 = r5
        L_0x016e:
            r13.bufferPos = r0
            return r9
        L_0x0171:
            r0 = move-exception
            throw r0
        L_0x0173:
            long r2 = r13.readRawVarint64SlowPath()     // Catch:{ Exception -> 0x001a }
            int r0 = setMax
            int r0 = r0 + r1
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            return r2
        L_0x0181:
            goto L_0x0183
        L_0x0182:
            throw r0
        L_0x0183:
            goto L_0x0182
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint64():long");
    }

    /* access modifiers changed from: package-private */
    public final long readRawVarint64SlowPath() throws IOException {
        long j = 0;
        int i = 0;
        while (true) {
            if ((i < 64 ? 31 : '5') == 31) {
                try {
                    int i2 = setMax + 125;
                    getMax = i2 % 128;
                    if (i2 % 2 == 0) {
                        byte readRawByte = readRawByte();
                        j *= ((long) (readRawByte | Byte.MAX_VALUE)) >> i;
                        if ((readRawByte | 10182) == 0) {
                            break;
                        }
                        i += 7;
                    } else {
                        byte readRawByte2 = readRawByte();
                        j |= ((long) (readRawByte2 & Byte.MAX_VALUE)) << i;
                        if (!((readRawByte2 & 128) != 0)) {
                            break;
                        }
                        i += 7;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else {
                throw InvalidProtocolBufferException.malformedVarint();
            }
        }
        int i3 = setMax + 27;
        getMax = i3 % 128;
        int i4 = i3 % 2;
        return j;
    }

    public final int readRawLittleEndian32() throws IOException {
        int i = this.bufferPos;
        if ((this.bufferSize - i < 4 ? '8' : 'G') != 'G') {
            int i2 = getMax + 123;
            setMax = i2 % 128;
            if (i2 % 2 == 0) {
                refillBuffer(4);
                i = this.bufferPos;
            } else {
                refillBuffer(4);
                try {
                    i = this.bufferPos;
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 4;
        byte b = ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
        int i3 = getMax + 7;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        return b;
    }

    public final long readRawLittleEndian64() throws IOException {
        int i = setMax + 125;
        getMax = i % 128;
        int i2 = i % 2;
        int i3 = this.bufferPos;
        if ((this.bufferSize - i3 < 8 ? 'A' : 27) != 27) {
            int i4 = getMax + 53;
            setMax = i4 % 128;
            int i5 = i4 % 2;
            refillBuffer(8);
            i3 = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i3 + 8;
        long j = ((((long) bArr[i3 + 7]) & 255) << 56) | ((((long) bArr[i3 + 1]) & 255) << 8) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
        int i6 = setMax + 49;
        getMax = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public static int decodeZigZag32(int i) {
        int i2 = setMax + 21;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        int i4 = (-(i & 1)) ^ (i >>> 1);
        try {
            int i5 = setMax + 65;
            try {
                getMax = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static long decodeZigZag64(long j) {
        int i = setMax + 1;
        getMax = i % 128;
        int i2 = i % 2;
        long j2 = (-(j & 1)) ^ (j >>> 1);
        int i3 = setMax + 3;
        getMax = i3 % 128;
        if ((i3 % 2 == 0 ? 'F' : 'L') != 'F') {
            return j2;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return j2;
    }

    private CodedInputStream(InputStream inputStream) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = new byte[4096];
        this.bufferSize = 0;
        this.bufferPos = 0;
        this.totalBytesRetired = 0;
        this.input = inputStream;
        this.bufferIsImmutable = false;
    }

    private CodedInputStream(LiteralByteString literalByteString) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = literalByteString.bytes;
        int offsetIntoBytes = literalByteString.getOffsetIntoBytes();
        this.bufferPos = offsetIntoBytes;
        this.bufferSize = offsetIntoBytes + literalByteString.size();
        this.totalBytesRetired = -this.bufferPos;
        this.input = null;
        this.bufferIsImmutable = true;
    }

    public final int pushLimit(int i) throws InvalidProtocolBufferException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1736645643, oncanceled);
            onCancelLoad.getMin(-1736645643, oncanceled);
            try {
                int i2 = setMax + 99;
                getMax = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
        if ((i < 0 ? 'G' : 'D') != 'G') {
            int i4 = i + this.totalBytesRetired + this.bufferPos;
            int i5 = this.currentLimit;
            if (!(i4 <= i5)) {
                int i6 = getMax + 9;
                setMax = i6 % 128;
                int i7 = i6 % 2;
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            try {
                this.currentLimit = i4;
                recomputeBufferSizeAfterLimit();
                return i5;
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    private void recomputeBufferSizeAfterLimit() {
        int i = getMax + 83;
        setMax = i % 128;
        int i2 = i % 2;
        try {
            int i3 = this.bufferSize + this.bufferSizeAfterLimit;
            this.bufferSize = i3;
            int i4 = this.totalBytesRetired + i3;
            if (!(i4 > this.currentLimit)) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i5 = i4 - this.currentLimit;
            this.bufferSizeAfterLimit = i5;
            this.bufferSize -= i5;
            int i6 = getMax + 71;
            setMax = i6 % 128;
            int i7 = i6 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void popLimit(int i) {
        try {
            int i2 = getMax + 113;
            try {
                setMax = i2 % 128;
                if ((i2 % 2 != 0 ? 28 : ')') != 28) {
                    this.currentLimit = i;
                    recomputeBufferSizeAfterLimit();
                } else {
                    this.currentLimit = i;
                    recomputeBufferSizeAfterLimit();
                    Object[] objArr = null;
                    int length2 = objArr.length;
                }
                int i3 = getMax + 75;
                setMax = i3 % 128;
                if ((i3 % 2 != 0 ? 22 : '@') == 22) {
                    int i4 = 58 / 0;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        if ((r3.currentLimit == Integer.MAX_VALUE ? (char) 29 : 12) != 29) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getBytesUntilLimit() {
        /*
            r3 = this;
            int r0 = getMax
            int r0 = r0 + 59
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 40
            if (r0 == 0) goto L_0x0011
            r0 = 40
            goto L_0x0013
        L_0x0011:
            r0 = 78
        L_0x0013:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x001d
            int r0 = r3.currentLimit     // Catch:{ Exception -> 0x004f }
            if (r0 != r2) goto L_0x002e
            goto L_0x0041
        L_0x001d:
            int r0 = r3.currentLimit     // Catch:{ Exception -> 0x004f }
            r1 = 17
            int r1 = r1 / 0
            r1 = 29
            if (r0 != r2) goto L_0x002a
            r0 = 29
            goto L_0x002c
        L_0x002a:
            r0 = 12
        L_0x002c:
            if (r0 == r1) goto L_0x0041
        L_0x002e:
            int r0 = r3.totalBytesRetired
            int r1 = r3.bufferPos
            int r0 = r0 + r1
            int r1 = r3.currentLimit
            int r1 = r1 - r0
            int r0 = setMax
            int r0 = r0 + 81
            int r2 = r0 % 128
            getMax = r2
            int r0 = r0 % 2
            return r1
        L_0x0041:
            r0 = -1
            int r1 = setMax
            int r1 = r1 + 111
            int r2 = r1 % 128
            getMax = r2
            int r1 = r1 % 2
            return r0
        L_0x004d:
            r0 = move-exception
            throw r0
        L_0x004f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.getBytesUntilLimit():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if ((r6.bufferPos == r6.bufferSize) != true) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r0 == r4 ? ']' : '=') != ']') goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isAtEnd() throws java.io.IOException {
        /*
            r6 = this;
            int r0 = setMax
            int r0 = r0 + 55
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0022
            int r0 = r6.bufferPos
            int r4 = r6.bufferSize
            int r5 = r1.length     // Catch:{ all -> 0x0020 }
            r5 = 93
            if (r0 != r4) goto L_0x001b
            r0 = 93
            goto L_0x001d
        L_0x001b:
            r0 = 61
        L_0x001d:
            if (r0 == r5) goto L_0x002e
            goto L_0x003f
        L_0x0020:
            r0 = move-exception
            throw r0
        L_0x0022:
            int r0 = r6.bufferPos
            int r4 = r6.bufferSize
            if (r0 != r4) goto L_0x002a
            r0 = 1
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 == r3) goto L_0x002e
            goto L_0x003f
        L_0x002e:
            boolean r0 = r6.tryRefillBuffer(r3)
            if (r0 != 0) goto L_0x003f
            int r0 = setMax
            int r0 = r0 + 27
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            return r3
        L_0x003f:
            int r0 = getMax     // Catch:{ Exception -> 0x0057 }
            int r0 = r0 + 107
            int r4 = r0 % 128
            setMax = r4     // Catch:{ Exception -> 0x0057 }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x004d
            r0 = 0
            goto L_0x004e
        L_0x004d:
            r0 = 1
        L_0x004e:
            if (r0 == r3) goto L_0x0056
            super.hashCode()     // Catch:{ all -> 0x0054 }
            return r2
        L_0x0054:
            r0 = move-exception
            throw r0
        L_0x0056:
            return r2
        L_0x0057:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.isAtEnd():boolean");
    }

    private void ensureAvailable(int i) throws IOException {
        int i2 = setMax + 115;
        getMax = i2 % 128;
        boolean z = false;
        if (i2 % 2 == 0) {
            try {
                try {
                    if (this.bufferSize + this.bufferPos >= i) {
                        z = true;
                    }
                    if (z) {
                        return;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            if (this.bufferSize - this.bufferPos < i) {
                z = true;
            }
            if (!z) {
                return;
            }
        }
        refillBuffer(i);
        int i3 = getMax + 121;
        setMax = i3 % 128;
        int i4 = i3 % 2;
    }

    private void refillBuffer(int i) throws IOException {
        if (tryRefillBuffer(i)) {
            int i2 = setMax + 95;
            getMax = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = getMax + 123;
        setMax = i4 % 128;
        int i5 = i4 % 2;
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    private boolean tryRefillBuffer(int i) throws IOException {
        boolean z;
        do {
            int i2 = this.bufferPos;
            if (i2 + i > this.bufferSize) {
                z = false;
                if (((this.totalBytesRetired + i2) + i > this.currentLimit ? ')' : 14) != 14) {
                    return false;
                }
                RefillCallback refillCallback2 = this.refillCallback;
                if (refillCallback2 != null) {
                    int i3 = setMax + 25;
                    getMax = i3 % 128;
                    int i4 = i3 % 2;
                    refillCallback2.onRefill();
                    if (i4 == 0) {
                        Object obj = null;
                        super.hashCode();
                    }
                }
                try {
                    if (this.input != null) {
                        int i5 = getMax + 95;
                        setMax = i5 % 128;
                        int i6 = i5 % 2;
                        int i7 = this.bufferPos;
                        if (i7 > 0) {
                            int i8 = this.bufferSize;
                            if (i8 > i7) {
                                byte[] bArr = this.buffer;
                                System.arraycopy(bArr, i7, bArr, 0, i8 - i7);
                            }
                            this.totalBytesRetired += i7;
                            this.bufferSize -= i7;
                            this.bufferPos = 0;
                        }
                        InputStream inputStream = this.input;
                        byte[] bArr2 = this.buffer;
                        int i9 = this.bufferSize;
                        int read = inputStream.read(bArr2, i9, bArr2.length - i9);
                        if (read != 0) {
                            int i10 = setMax + 15;
                            getMax = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 0 / 0;
                                if (read < -1) {
                                }
                            } else if (read < -1) {
                            }
                            if (read <= this.buffer.length) {
                                if (read > 0) {
                                    try {
                                        this.bufferSize += read;
                                        if ((this.totalBytesRetired + i) - this.sizeLimit > 0) {
                                            int i12 = setMax + 95;
                                            getMax = i12 % 128;
                                            if (i12 % 2 == 0) {
                                                int i13 = 42 / 0;
                                                throw InvalidProtocolBufferException.sizeLimitExceeded();
                                            }
                                            throw InvalidProtocolBufferException.sizeLimitExceeded();
                                        }
                                        recomputeBufferSizeAfterLimit();
                                        if (this.bufferSize < i) {
                                            z = true;
                                            continue;
                                        }
                                    } catch (Exception e) {
                                        throw e;
                                    }
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder(102);
                        sb.append("InputStream#read(byte[]) returned invalid result: ");
                        sb.append(read);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    return false;
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                StringBuilder sb2 = new StringBuilder(77);
                sb2.append("refillBuffer() called when ");
                sb2.append(i);
                sb2.append(" bytes were already available in buffer");
                throw new IllegalStateException(sb2.toString());
            }
        } while (z);
        int i14 = getMax + 31;
        setMax = i14 % 128;
        int i15 = i14 % 2;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if ((r0 == r2 ? 'K' : '/') != 'K') goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if ((r4.bufferPos == r4.bufferSize ? 'J' : '=') != '=') goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte readRawByte() throws java.io.IOException {
        /*
            r4 = this;
            int r0 = getMax
            int r0 = r0 + 89
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto L_0x000f
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 == r1) goto L_0x0028
            int r0 = r4.bufferPos
            int r2 = r4.bufferSize
            r3 = 0
            super.hashCode()     // Catch:{ all -> 0x0026 }
            r3 = 75
            if (r0 != r2) goto L_0x0021
            r0 = 75
            goto L_0x0023
        L_0x0021:
            r0 = 47
        L_0x0023:
            if (r0 == r3) goto L_0x0037
            goto L_0x0044
        L_0x0026:
            r0 = move-exception
            throw r0
        L_0x0028:
            int r0 = r4.bufferPos
            int r2 = r4.bufferSize
            r3 = 61
            if (r0 != r2) goto L_0x0033
            r0 = 74
            goto L_0x0035
        L_0x0033:
            r0 = 61
        L_0x0035:
            if (r0 == r3) goto L_0x0044
        L_0x0037:
            int r0 = getMax
            int r0 = r0 + 33
            int r2 = r0 % 128
            setMax = r2
            int r0 = r0 % 2
            r4.refillBuffer(r1)
        L_0x0044:
            byte[] r0 = r4.buffer     // Catch:{ Exception -> 0x0059 }
            int r1 = r4.bufferPos     // Catch:{ Exception -> 0x0059 }
            int r2 = r1 + 1
            r4.bufferPos = r2     // Catch:{ Exception -> 0x0059 }
            byte r0 = r0[r1]     // Catch:{ Exception -> 0x0059 }
            int r1 = setMax
            int r1 = r1 + 29
            int r2 = r1 % 128
            getMax = r2
            int r1 = r1 % 2
            return r0
        L_0x0059:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawByte():byte");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if ((r14 <= 0) != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r14 <= 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (((r13.totalBytesRetired + r13.bufferPos) + r14) <= r13.currentLimit) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        if (r0 == true) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        if (r14 >= 4096) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        r0 = new byte[r14];
        r1 = r13.bufferSize;
        r3 = r13.bufferPos;
        r1 = r1 - r3;
        java.lang.System.arraycopy(r13.buffer, r3, r0, 0, r1);
        r13.bufferPos = r13.bufferSize;
        r14 = r14 - r1;
        ensureAvailable(r14);
        java.lang.System.arraycopy(r13.buffer, 0, r0, r1, r14);
        r13.bufferPos = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        r3 = r13.bufferPos;
        r4 = r13.bufferSize;
        r13.totalBytesRetired += r4;
        r13.bufferPos = 0;
        r13.bufferSize = 0;
        r4 = r4 - r3;
        r5 = r14 - r4;
        r6 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r5 <= 0) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        r7 = java.lang.Math.min(r5, 4096);
        r8 = new byte[r7];
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r9 >= r7) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
        if (r10 == true) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        if (r13.input != null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = '_';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        r10 = '6';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0090, code lost:
        if (r10 == '_') goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0092, code lost:
        r10 = r13.input.read(r8, r9, r7 - r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009b, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009c, code lost:
        if (r10 != -1) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009e, code lost:
        r14 = setMax + 35;
        getMax = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ac, code lost:
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ad, code lost:
        r13.totalBytesRetired += r10;
        r9 = r9 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        r5 = r5 - r7;
        r6.add(r8);
        r7 = getMax + 35;
        setMax = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        r14 = new byte[r14];
        java.lang.System.arraycopy(r13.buffer, r3, r14, 0, r4);
        r0 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d2, code lost:
        if (r0.hasNext() == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r1 = (byte[]) r0.next();
        java.lang.System.arraycopy(r1, 0, r14, r4, r1.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00df, code lost:
        r4 = r4 + r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e1, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e2, code lost:
        skipRawBytes((r13.currentLimit - r13.totalBytesRetired) - r13.bufferPos);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f1, code lost:
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] readRawBytesSlowPath(int r14) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = getMax     // Catch:{ Exception -> 0x00f2 }
            int r0 = r0 + 35
            int r1 = r0 % 128
            setMax = r1     // Catch:{ Exception -> 0x00f2 }
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            r0 = 61
            int r0 = r0 / r2
            if (r14 > 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0030
            goto L_0x001d
        L_0x0019:
            r14 = move-exception
            throw r14
        L_0x001b:
            if (r14 > 0) goto L_0x0030
        L_0x001d:
            int r0 = setMax
            int r0 = r0 + r1
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            if (r14 != 0) goto L_0x002b
            byte[] r14 = kotlin.reflect.jvm.internal.impl.protobuf.Internal.EMPTY_BYTE_ARRAY
            return r14
        L_0x002b:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r14 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r14
        L_0x0030:
            int r0 = r13.totalBytesRetired
            int r3 = r13.bufferPos
            int r0 = r0 + r3
            int r0 = r0 + r14
            int r3 = r13.currentLimit
            if (r0 <= r3) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r0 == r1) goto L_0x00e2
            r0 = 4096(0x1000, float:5.74E-42)
            if (r14 >= r0) goto L_0x005f
            byte[] r0 = new byte[r14]
            int r1 = r13.bufferSize
            int r3 = r13.bufferPos
            int r1 = r1 - r3
            byte[] r4 = r13.buffer
            java.lang.System.arraycopy(r4, r3, r0, r2, r1)
            int r3 = r13.bufferSize
            r13.bufferPos = r3
            int r14 = r14 - r1
            r13.ensureAvailable(r14)
            byte[] r3 = r13.buffer
            java.lang.System.arraycopy(r3, r2, r0, r1, r14)
            r13.bufferPos = r14
            return r0
        L_0x005f:
            int r3 = r13.bufferPos
            int r4 = r13.bufferSize
            int r5 = r13.totalBytesRetired
            int r5 = r5 + r4
            r13.totalBytesRetired = r5
            r13.bufferPos = r2
            r13.bufferSize = r2
            int r4 = r4 - r3
            int r5 = r14 - r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0074:
            if (r5 <= 0) goto L_0x00c3
            int r7 = java.lang.Math.min(r5, r0)
            byte[] r8 = new byte[r7]
            r9 = 0
        L_0x007d:
            if (r9 >= r7) goto L_0x0081
            r10 = 0
            goto L_0x0082
        L_0x0081:
            r10 = 1
        L_0x0082:
            if (r10 == r1) goto L_0x00b4
            java.io.InputStream r10 = r13.input
            r11 = 95
            if (r10 != 0) goto L_0x008d
            r10 = 95
            goto L_0x008f
        L_0x008d:
            r10 = 54
        L_0x008f:
            r12 = -1
            if (r10 == r11) goto L_0x009b
            java.io.InputStream r10 = r13.input
            int r11 = r7 - r9
            int r10 = r10.read(r8, r9, r11)
            goto L_0x009c
        L_0x009b:
            r10 = -1
        L_0x009c:
            if (r10 != r12) goto L_0x00ad
            int r14 = setMax
            int r14 = r14 + 35
            int r0 = r14 % 128
            getMax = r0
            int r14 = r14 % 2
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r14 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r14
        L_0x00ad:
            int r11 = r13.totalBytesRetired
            int r11 = r11 + r10
            r13.totalBytesRetired = r11
            int r9 = r9 + r10
            goto L_0x007d
        L_0x00b4:
            int r5 = r5 - r7
            r6.add(r8)
            int r7 = getMax
            int r7 = r7 + 35
            int r8 = r7 % 128
            setMax = r8
            int r7 = r7 % 2
            goto L_0x0074
        L_0x00c3:
            byte[] r14 = new byte[r14]
            byte[] r0 = r13.buffer
            java.lang.System.arraycopy(r0, r3, r14, r2, r4)
            java.util.Iterator r0 = r6.iterator()
        L_0x00ce:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e1
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x00f2 }
            byte[] r1 = (byte[]) r1     // Catch:{ Exception -> 0x00f2 }
            int r3 = r1.length     // Catch:{ Exception -> 0x00f2 }
            java.lang.System.arraycopy(r1, r2, r14, r4, r3)     // Catch:{ Exception -> 0x00f2 }
            int r1 = r1.length     // Catch:{ Exception -> 0x00f2 }
            int r4 = r4 + r1
            goto L_0x00ce
        L_0x00e1:
            return r14
        L_0x00e2:
            int r14 = r13.currentLimit
            int r0 = r13.totalBytesRetired
            int r14 = r14 - r0
            int r0 = r13.bufferPos
            int r14 = r14 - r0
            r13.skipRawBytes(r14)
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r14 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r14
        L_0x00f2:
            r14 = move-exception
            goto L_0x00f5
        L_0x00f4:
            throw r14
        L_0x00f5:
            goto L_0x00f4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawBytesSlowPath(int):byte[]");
    }

    public final void skipRawBytes(int i) throws IOException {
        int max = dispatchOnCancelled.setMax(i);
        boolean z = true;
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(218715807, oncanceled);
            onCancelLoad.getMin(218715807, oncanceled);
            int i2 = getMax + 37;
            setMax = i2 % 128;
            int i3 = i2 % 2;
        }
        try {
            if ((i <= this.bufferSize - this.bufferPos ? '!' : 'J') == '!') {
                int i4 = setMax + 23;
                try {
                    getMax = i4 % 128;
                    int i5 = i4 % 2;
                    if (i >= 0) {
                        this.bufferPos += i;
                        int i6 = setMax + 37;
                        getMax = i6 % 128;
                        if (i6 % 2 == 0) {
                            z = false;
                        }
                        if (!z) {
                            Object obj = null;
                            super.hashCode();
                            return;
                        }
                        return;
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
            skipRawBytesSlowPath(i);
        } catch (Exception e2) {
            throw e2;
        }
    }

    private void skipRawBytesSlowPath(int i) throws IOException {
        int i2 = setMax + 11;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        if ((i < 0 ? 'J' : 11) != 11) {
            int i4 = setMax + 17;
            getMax = i4 % 128;
            if ((i4 % 2 == 0 ? Typography.dollar : 'B') != '$') {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i5 = 31 / 0;
            throw InvalidProtocolBufferException.negativeSize();
        }
        try {
            int i6 = this.totalBytesRetired;
            int i7 = this.bufferPos;
            int i8 = i6 + i7 + i;
            int i9 = this.currentLimit;
            if (i8 <= i9) {
                int i10 = this.bufferSize;
                int i11 = i10 - i7;
                this.bufferPos = i10;
                refillBuffer(1);
                while (true) {
                    int i12 = i - i11;
                    if (i12 > this.bufferSize) {
                        int i13 = getMax + 97;
                        setMax = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i14 = this.bufferSize;
                            i11 += i14;
                            this.bufferPos = i14;
                            refillBuffer(1);
                        } else {
                            i11 += this.bufferSize;
                            this.bufferPos = this.bufferSize;
                            refillBuffer(1);
                        }
                    } else {
                        try {
                            this.bufferPos = i12;
                            return;
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            } else {
                skipRawBytes((i9 - this.totalBytesRetired) - i7);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String length(char[] cArr) {
        int i;
        char c;
        int i2 = setMax + 51;
        getMax = i2 % 128;
        int i3 = 1;
        if (i2 % 2 == 0) {
            c = cArr[1];
            i = cArr.length >>> 0;
        } else {
            c = cArr[0];
            i = cArr.length - 1;
        }
        char[] cArr2 = new char[i];
        while (true) {
            if ((i3 < cArr.length ? 0 : '\'') != 0) {
                return new String(cArr2);
            }
            int i4 = getMax + 29;
            setMax = i4 % 128;
            int i5 = i4 % 2;
            cArr2[i3 - 1] = (char) ((int) (((long) (cArr[i3] ^ (i3 * c))) ^ length));
            i3++;
            try {
                int i6 = setMax + 39;
                getMax = i6 % 128;
                int i7 = i6 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
