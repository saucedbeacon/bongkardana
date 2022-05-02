package kotlin.reflect.jvm.internal.impl.protobuf;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.fastjson.parser.JSONLexer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import kotlin.text.Typography;

public final class CodedOutputStream {
    private static int equals = 0;
    private static short[] getMax = null;
    private static int getMin = -326904374;
    private static int isInside = 1;
    private static int length = -1537687615;
    private static byte[] setMax = {Framer.ENTER_FRAME_PREFIX, -67, -86, -75, 0};
    private static int setMin = 51;
    private final byte[] buffer;
    private final int limit;
    private final OutputStream output;
    private int position;
    private int totalBytesWritten;

    public static int computeFixed64SizeNoTag(long j) {
        int i = isInside + 49;
        equals = i % 128;
        int i2 = i % 2;
        int i3 = equals + 21;
        isInside = i3 % 128;
        int i4 = i3 % 2;
        return 8;
    }

    public static int computeSFixed32SizeNoTag(int i) {
        int i2 = equals + 111;
        isInside = i2 % 128;
        return (i2 % 2 == 0 ? (char) 3 : 16) != 16 ? 2 : 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if ((r3 > 4096 ? '[' : 'U') != '[') goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3 = equals + 27;
        isInside = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        return 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if ((r3 > 28214) != true) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int computePreferredBufferSize(int r3) {
        /*
            int r0 = isInside
            int r0 = r0 + 39
            int r1 = r0 % 128
            equals = r1
            int r0 = r0 % 2
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0019
            r0 = 28214(0x6e36, float:3.9536E-41)
            r2 = 1
            if (r3 <= r0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == r2) goto L_0x0025
            goto L_0x0024
        L_0x0019:
            r0 = 91
            if (r3 <= r1) goto L_0x0020
            r2 = 91
            goto L_0x0022
        L_0x0020:
            r2 = 85
        L_0x0022:
            if (r2 == r0) goto L_0x0025
        L_0x0024:
            return r3
        L_0x0025:
            int r3 = equals     // Catch:{ Exception -> 0x0030 }
            int r3 = r3 + 27
            int r0 = r3 % 128
            isInside = r0     // Catch:{ Exception -> 0x0030 }
            int r3 = r3 % 2
            return r1
        L_0x0030:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computePreferredBufferSize(int):int");
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        try {
            this.totalBytesWritten = 0;
            this.output = outputStream;
            try {
                this.buffer = bArr;
                this.position = 0;
                this.limit = bArr.length;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i) {
        CodedOutputStream codedOutputStream = new CodedOutputStream(outputStream, new byte[i]);
        try {
            int i2 = equals + 97;
            try {
                isInside = i2 % 128;
                if (i2 % 2 != 0) {
                    return codedOutputStream;
                }
                int i3 = 10 / 0;
                return codedOutputStream;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void writeDouble(int i, double d) throws IOException {
        int i2 = isInside + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        boolean z = true;
        writeTag(i, 1);
        writeDoubleNoTag(d);
        try {
            int i4 = isInside + 29;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                z = false;
            }
            if (z) {
                int i5 = 87 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public final void writeFloat(int i, float f) throws IOException {
        char c = '1';
        int i2 = isInside + 49;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            c = 3;
        }
        if (c != 3) {
            writeTag(i, 2);
            writeFloatNoTag(f);
        } else {
            try {
                writeTag(i, 5);
                writeFloatNoTag(f);
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = equals + 95;
        isInside = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void writeInt32(int i, int i2) throws IOException {
        int i3 = equals + 121;
        isInside = i3 % 128;
        if ((i3 % 2 == 0 ? 'B' : 8) != 8) {
            writeTag(i, 0);
            writeInt32NoTag(i2);
            return;
        }
        try {
            writeTag(i, 0);
            try {
                writeInt32NoTag(i2);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void writeBool(int i, boolean z) throws IOException {
        int i2 = equals + 99;
        isInside = i2 % 128;
        int i3 = i2 % 2;
        try {
            writeTag(i, 0);
            writeBoolNoTag(z);
            int i4 = equals + 31;
            isInside = i4 % 128;
            if ((i4 % 2 == 0 ? '\'' : 18) == '\'') {
                Object obj = null;
                super.hashCode();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public final void writeGroup(int i, MessageLite messageLite) throws IOException {
        int i2 = isInside + 63;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            writeTag(i, 3);
            writeGroupNoTag(messageLite);
            writeTag(i, 4);
            return;
        }
        writeTag(i, 5);
        writeGroupNoTag(messageLite);
        writeTag(i, 2);
    }

    public final void writeMessage(int i, MessageLite messageLite) throws IOException {
        int i2 = equals + 49;
        isInside = i2 % 128;
        if ((i2 % 2 == 0 ? ',' : 'M') != 'M') {
            writeTag(i, 5);
            writeMessageNoTag(messageLite);
        } else {
            try {
                writeTag(i, 2);
                try {
                    writeMessageNoTag(messageLite);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i3 = equals + 13;
        isInside = i3 % 128;
        if (!(i3 % 2 != 0)) {
            Object obj = null;
            super.hashCode();
        }
    }

    public final void writeBytes(int i, ByteString byteString) throws IOException {
        int i2 = isInside + 91;
        equals = i2 % 128;
        int i3 = i2 % 2;
        writeTag(i, 2);
        writeBytesNoTag(byteString);
        char c = 'W';
        int i4 = equals + 87;
        isInside = i4 % 128;
        if (i4 % 2 == 0) {
            c = ']';
        }
        if (c == ']') {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    public final void writeUInt32(int i, int i2) throws IOException {
        int i3 = equals + 117;
        isInside = i3 % 128;
        int i4 = i3 % 2;
        writeTag(i, 0);
        writeUInt32NoTag(i2);
        int i5 = isInside + 87;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void writeEnum(int i, int i2) throws IOException {
        int i3 = isInside + 115;
        equals = i3 % 128;
        if ((i3 % 2 != 0 ? 'J' : 'D') != 'J') {
            try {
                writeTag(i, 0);
                writeEnumNoTag(i2);
            } catch (Exception e) {
                throw e;
            }
        } else {
            writeTag(i, 0);
            writeEnumNoTag(i2);
        }
    }

    public final void writeSInt64(int i, long j) throws IOException {
        int i2 = isInside + 17;
        equals = i2 % 128;
        int i3 = i2 % 2;
        writeTag(i, 0);
        writeSInt64NoTag(j);
        try {
            int i4 = isInside + 85;
            equals = i4 % 128;
            if ((i4 % 2 != 0 ? (char) 10 : 20) == 10) {
                int i5 = 19 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public final void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException {
        try {
            int i2 = equals + 45;
            isInside = i2 % 128;
            int i3 = i2 % 2;
            char c = 1;
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
            try {
                int i4 = isInside + 3;
                equals = i4 % 128;
                if (i4 % 2 == 0) {
                    c = 'F';
                }
                if (c != 'F') {
                    Object[] objArr = null;
                    int length2 = objArr.length;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void writeDoubleNoTag(double d) throws IOException {
        int i = equals + 93;
        isInside = i % 128;
        boolean z = i % 2 == 0;
        writeRawLittleEndian64(Double.doubleToRawLongBits(d));
        if (z) {
            int i2 = 5 / 0;
        }
        try {
            int i3 = isInside + 117;
            try {
                equals = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void writeFloatNoTag(float f) throws IOException {
        int i = isInside + 39;
        equals = i % 128;
        if ((i % 2 != 0 ? 'Z' : 0) != 'Z') {
            writeRawLittleEndian32(Float.floatToRawIntBits(f));
            return;
        }
        writeRawLittleEndian32(Float.floatToRawIntBits(f));
        int i2 = 34 / 0;
    }

    public final void writeUInt64NoTag(long j) throws IOException {
        int i = isInside + 45;
        equals = i % 128;
        int i2 = i % 2;
        writeRawVarint64(j);
        int i3 = equals + 107;
        isInside = i3 % 128;
        if ((i3 % 2 == 0 ? 'Q' : 10) == 'Q') {
            int i4 = 71 / 0;
        }
    }

    public final void writeInt64NoTag(long j) throws IOException {
        try {
            int i = isInside + 81;
            equals = i % 128;
            boolean z = i % 2 == 0;
            writeRawVarint64(j);
            if (!z) {
                Object obj = null;
                super.hashCode();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public final void writeInt32NoTag(int i) throws IOException {
        int i2 = equals + 69;
        isInside = i2 % 128;
        int i3 = i2 % 2;
        if (!(i < 0)) {
            writeRawVarint32(i);
            try {
                int i4 = isInside + 55;
                equals = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e) {
                throw e;
            }
        } else {
            writeRawVarint64((long) i);
        }
    }

    public final void writeFixed64NoTag(long j) throws IOException {
        int i = isInside + 63;
        equals = i % 128;
        int i2 = i % 2;
        writeRawLittleEndian64(j);
        int i3 = isInside + 97;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    public final void writeFixed32NoTag(int i) throws IOException {
        int i2 = isInside + 63;
        equals = i2 % 128;
        int i3 = i2 % 2;
        writeRawLittleEndian32(i);
        int i4 = equals + 53;
        isInside = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (r2 != '?') goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if ((r4 ? ',' : '5') != ',') goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeBoolNoTag(boolean r4) throws java.io.IOException {
        /*
            r3 = this;
            int r0 = equals
            int r0 = r0 + 61
            int r1 = r0 % 128
            isInside = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 94
            if (r0 != 0) goto L_0x001e
            int r2 = r2 / r1
            r0 = 44
            if (r4 == 0) goto L_0x0017
            r4 = 44
            goto L_0x0019
        L_0x0017:
            r4 = 53
        L_0x0019:
            if (r4 == r0) goto L_0x0031
            goto L_0x0026
        L_0x001c:
            r4 = move-exception
            throw r4
        L_0x001e:
            r0 = 63
            if (r4 == 0) goto L_0x0024
            r2 = 63
        L_0x0024:
            if (r2 == r0) goto L_0x0031
        L_0x0026:
            int r4 = equals
            int r4 = r4 + 21
            int r0 = r4 % 128
            isInside = r0
            int r4 = r4 % 2
            goto L_0x0032
        L_0x0031:
            r1 = 1
        L_0x0032:
            r3.writeRawByte((int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.writeBoolNoTag(boolean):void");
    }

    public final void writeStringNoTag(String str) throws IOException {
        try {
            int i = isInside + 73;
            equals = i % 128;
            int i2 = i % 2;
            byte[] bytes = str.getBytes(length(ExpandableListView.getPackedPositionType(0) - 46, (byte) (49 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 326904373 - TextUtils.lastIndexOf("", '0', 0, 0), 1537687704 - AndroidCharacter.getEastAsianWidth('0'), (short) (View.MeasureSpec.getMode(0) + 25)).intern());
            writeRawVarint32(bytes.length);
            writeRawBytes(bytes);
            int i3 = isInside + 67;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 69 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public final void writeGroupNoTag(MessageLite messageLite) throws IOException {
        int i = isInside + 73;
        equals = i % 128;
        int i2 = i % 2;
        messageLite.writeTo(this);
        int i3 = equals + 125;
        isInside = i3 % 128;
        if (!(i3 % 2 != 0)) {
            Object obj = null;
            super.hashCode();
        }
    }

    public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
        try {
            int i = isInside + 121;
            try {
                equals = i % 128;
                int i2 = i % 2;
                writeRawVarint32(messageLite.getSerializedSize());
                messageLite.writeTo(this);
                int i3 = equals + 57;
                isInside = i3 % 128;
                if ((i3 % 2 == 0 ? 'P' : 'O') != 'O') {
                    int i4 = 55 / 0;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void writeBytesNoTag(ByteString byteString) throws IOException {
        int i = equals + 57;
        isInside = i % 128;
        int i2 = i % 2;
        writeRawVarint32(byteString.size());
        writeRawBytes(byteString);
        int i3 = isInside + 61;
        equals = i3 % 128;
        if ((i3 % 2 != 0 ? 'L' : 'W') != 'W') {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        int i = equals + 1;
        isInside = i % 128;
        int i2 = i % 2;
        try {
            writeRawVarint32(bArr.length);
            try {
                writeRawBytes(bArr);
                int i3 = equals + 13;
                isInside = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void writeUInt32NoTag(int i) throws IOException {
        try {
            int i2 = equals + 65;
            isInside = i2 % 128;
            int i3 = i2 % 2;
            writeRawVarint32(i);
            int i4 = equals + 29;
            isInside = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = null;
                int length2 = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public final void writeEnumNoTag(int i) throws IOException {
        int i2 = equals + 63;
        isInside = i2 % 128;
        char c = i2 % 2 == 0 ? 14 : JSONLexer.EOI;
        writeInt32NoTag(i);
        if (c == 14) {
            Object obj = null;
            super.hashCode();
        }
    }

    public final void writeSFixed32NoTag(int i) throws IOException {
        int i2 = isInside + 39;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            try {
                writeRawLittleEndian32(i);
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            writeRawLittleEndian32(i);
        }
        try {
            int i3 = isInside + 77;
            equals = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void writeSFixed64NoTag(long j) throws IOException {
        int i = isInside + 95;
        equals = i % 128;
        if (!(i % 2 != 0)) {
            try {
                writeRawLittleEndian64(j);
            } catch (Exception e) {
                throw e;
            }
        } else {
            writeRawLittleEndian64(j);
            Object obj = null;
            super.hashCode();
        }
    }

    public final void writeSInt32NoTag(int i) throws IOException {
        int i2 = equals + 23;
        isInside = i2 % 128;
        if ((i2 % 2 == 0 ? ']' : 10) != 10) {
            try {
                writeRawVarint32(encodeZigZag32(i));
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                writeRawVarint32(encodeZigZag32(i));
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i3 = equals + 35;
        isInside = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void writeSInt64NoTag(long j) throws IOException {
        int i = equals + 11;
        isInside = i % 128;
        boolean z = i % 2 != 0;
        writeRawVarint64(encodeZigZag64(j));
        if (!z) {
            int i2 = 77 / 0;
        }
        int i3 = equals + 31;
        isInside = i3 % 128;
        int i4 = i3 % 2;
    }

    public static int computeDoubleSize(int i, double d) {
        try {
            int i2 = equals + 117;
            isInside = i2 % 128;
            char c = i2 % 2 == 0 ? '2' : '*';
            int computeTagSize = computeTagSize(i);
            int computeDoubleSizeNoTag = computeDoubleSizeNoTag(d);
            int i3 = c != '2' ? computeTagSize + computeDoubleSizeNoTag : computeTagSize / computeDoubleSizeNoTag;
            int i4 = equals + 35;
            isInside = i4 % 128;
            if (i4 % 2 != 0) {
                return i3;
            }
            int i5 = 97 / 0;
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    public static int computeFloatSize(int i, float f) {
        int i2 = isInside + 87;
        equals = i2 % 128;
        if (!(i2 % 2 == 0)) {
            return computeTagSize(i) % computeFloatSizeNoTag(f);
        }
        try {
            try {
                return computeTagSize(i) + computeFloatSizeNoTag(f);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static int computeInt32Size(int i, int i2) {
        int i3 = isInside + 39;
        equals = i3 % 128;
        if ((i3 % 2 != 0 ? 0 : 'Z') != 'Z') {
            try {
                return computeTagSize(i) << computeInt32SizeNoTag(i2);
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                return computeTagSize(i) + computeInt32SizeNoTag(i2);
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public static int computeBoolSize(int i, boolean z) {
        int i2 = equals + 27;
        isInside = i2 % 128;
        boolean z2 = i2 % 2 != 0;
        int computeTagSize = computeTagSize(i);
        int computeBoolSizeNoTag = computeBoolSizeNoTag(z);
        return !z2 ? computeTagSize % computeBoolSizeNoTag : computeTagSize + computeBoolSizeNoTag;
    }

    public static int computeMessageSize(int i, MessageLite messageLite) {
        int i2 = equals + 85;
        isInside = i2 % 128;
        boolean z = i2 % 2 != 0;
        int computeTagSize = computeTagSize(i);
        int computeMessageSizeNoTag = computeMessageSizeNoTag(messageLite);
        int i3 = !z ? computeTagSize << computeMessageSizeNoTag : computeTagSize + computeMessageSizeNoTag;
        int i4 = isInside + 111;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        int i2 = isInside + 47;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int computeTagSize = computeTagSize(i) + computeBytesSizeNoTag(byteString);
        int i4 = equals + 31;
        isInside = i4 % 128;
        if (!(i4 % 2 == 0)) {
            return computeTagSize;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return computeTagSize;
    }

    public static int computeEnumSize(int i, int i2) {
        int i3 = isInside + 117;
        equals = i3 % 128;
        int i4 = i3 % 2;
        int computeTagSize = computeTagSize(i) + computeEnumSizeNoTag(i2);
        int i5 = equals + 55;
        isInside = i5 % 128;
        if (i5 % 2 != 0) {
            return computeTagSize;
        }
        Object obj = null;
        super.hashCode();
        return computeTagSize;
    }

    public static int computeSInt64Size(int i, long j) {
        int i2 = equals + 1;
        isInside = i2 % 128;
        char c = i2 % 2 == 0 ? 3 : 'P';
        int computeTagSize = computeTagSize(i);
        int computeSInt64SizeNoTag = computeSInt64SizeNoTag(j);
        return c != 'P' ? computeTagSize >> computeSInt64SizeNoTag : computeTagSize + computeSInt64SizeNoTag;
    }

    public static int computeDoubleSizeNoTag(double d) {
        int i = equals + 115;
        isInside = i % 128;
        return (i % 2 == 0 ? 'R' : '\'') != 'R' ? 8 : 55;
    }

    public static int computeFloatSizeNoTag(float f) {
        int i = equals + 45;
        isInside = i % 128;
        return (i % 2 == 0 ? 28 : 'S') != 'S' ? 5 : 4;
    }

    public static int computeUInt64SizeNoTag(long j) {
        int i;
        int i2 = equals + 55;
        isInside = i2 % 128;
        Object[] objArr = null;
        if (i2 % 2 == 0) {
            try {
                i = computeRawVarint64Size(j);
                int length2 = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            i = computeRawVarint64Size(j);
        }
        int i3 = equals + 67;
        isInside = i3 % 128;
        if ((i3 % 2 == 0 ? 22 : ';') != 22) {
            return i;
        }
        super.hashCode();
        return i;
    }

    public static int computeInt64SizeNoTag(long j) {
        int i = equals + 31;
        isInside = i % 128;
        if ((i % 2 == 0 ? 'B' : ';') != 'B') {
            return computeRawVarint64Size(j);
        }
        int i2 = 56 / 0;
        return computeRawVarint64Size(j);
    }

    public static int computeInt32SizeNoTag(int i) {
        int i2;
        if (i < 0) {
            return 10;
        }
        int i3 = isInside + 39;
        equals = i3 % 128;
        if ((i3 % 2 != 0 ? '8' : 10) != 10) {
            i2 = computeRawVarint32Size(i);
            int i4 = 2 / 0;
        } else {
            i2 = computeRawVarint32Size(i);
        }
        try {
            int i5 = isInside + 95;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                return i2;
            }
            int i6 = 75 / 0;
            return i2;
        } catch (Exception e) {
            throw e;
        }
    }

    public static int computeFixed32SizeNoTag(int i) {
        try {
            int i2 = equals + 7;
            isInside = i2 % 128;
            int i3 = i2 % 2;
            int i4 = isInside + 93;
            equals = i4 % 128;
            if (!(i4 % 2 != 0)) {
                return 4;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return 4;
        } catch (Exception e) {
            throw e;
        }
    }

    public static int computeBoolSizeNoTag(boolean z) {
        int i = equals + 29;
        isInside = i % 128;
        int i2 = i % 2 == 0 ? 0 : 1;
        int i3 = isInside + 71;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return i2;
    }

    public static int computeStringSizeNoTag(String str) {
        int i = isInside + 39;
        equals = i % 128;
        int i2 = i % 2;
        try {
            byte[] bytes = str.getBytes(length((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 46, (byte) (49 - View.MeasureSpec.makeMeasureSpec(0, 0)), 326904373 - TextUtils.indexOf("", '0', 0, 0), TextUtils.getCapsMode("", 0, 0) + 1537687700, (short) (25 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern());
            int computeRawVarint32Size = computeRawVarint32Size(bytes.length) + bytes.length;
            int i3 = isInside + 97;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return computeRawVarint32Size;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        int i = equals + 93;
        isInside = i % 128;
        int i2 = i % 2;
        int serializedSize = messageLite.getSerializedSize();
        int i3 = isInside + 113;
        equals = i3 % 128;
        if ((i3 % 2 != 0 ? Typography.less : '\'') != '<') {
            return serializedSize;
        }
        int i4 = 97 / 0;
        return serializedSize;
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        try {
            int i = equals + 19;
            isInside = i % 128;
            if (i % 2 == 0) {
            }
            int serializedSize = messageLite.getSerializedSize();
            return computeRawVarint32Size(serializedSize) + serializedSize;
        } catch (Exception e) {
            throw e;
        }
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        int i;
        int i2 = isInside + 23;
        equals = i2 % 128;
        if ((i2 % 2 != 0 ? ':' : JSONLexer.EOI) != ':') {
            int serializedSize = lazyFieldLite.getSerializedSize();
            i = computeRawVarint32Size(serializedSize) + serializedSize;
        } else {
            try {
                int serializedSize2 = lazyFieldLite.getSerializedSize();
                i = computeRawVarint32Size(serializedSize2) >> serializedSize2;
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = isInside + 17;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return i;
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        int i = equals + 113;
        isInside = i % 128;
        int computeRawVarint32Size = (i % 2 == 0 ? '(' : '4') != '(' ? computeRawVarint32Size(byteString.size()) + byteString.size() : computeRawVarint32Size(byteString.size()) >>> byteString.size();
        int i2 = equals + 61;
        isInside = i2 % 128;
        if (!(i2 % 2 == 0)) {
            return computeRawVarint32Size;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return computeRawVarint32Size;
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        try {
            int i = equals + 99;
            isInside = i % 128;
            int i2 = i % 2;
            int computeRawVarint32Size = computeRawVarint32Size(bArr.length) + bArr.length;
            int i3 = equals + 109;
            isInside = i3 % 128;
            int i4 = i3 % 2;
            return computeRawVarint32Size;
        } catch (Exception e) {
            throw e;
        }
    }

    public static int computeUInt32SizeNoTag(int i) {
        int i2 = equals + 11;
        isInside = i2 % 128;
        int i3 = i2 % 2;
        try {
            int computeRawVarint32Size = computeRawVarint32Size(i);
            int i4 = isInside + 23;
            equals = i4 % 128;
            if ((i4 % 2 != 0 ? (char) 22 : 16) != 22) {
                return computeRawVarint32Size;
            }
            Object obj = null;
            super.hashCode();
            return computeRawVarint32Size;
        } catch (Exception e) {
            throw e;
        }
    }

    public static int computeEnumSizeNoTag(int i) {
        try {
            int i2 = equals + 23;
            isInside = i2 % 128;
            char c = i2 % 2 == 0 ? '3' : Typography.amp;
            int computeInt32SizeNoTag = computeInt32SizeNoTag(i);
            if (c == '3') {
                Object obj = null;
                super.hashCode();
            }
            try {
                int i3 = isInside + 125;
                equals = i3 % 128;
                int i4 = i3 % 2;
                return computeInt32SizeNoTag;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static int computeSFixed64SizeNoTag(long j) {
        int i = isInside + 15;
        equals = i % 128;
        int i2 = i % 2;
        int i3 = isInside + 13;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return 8;
        }
        Object obj = null;
        super.hashCode();
        return 8;
    }

    public static int computeSInt32SizeNoTag(int i) {
        int i2 = equals + 115;
        isInside = i2 % 128;
        int i3 = i2 % 2;
        int computeRawVarint32Size = computeRawVarint32Size(encodeZigZag32(i));
        int i4 = isInside + 43;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return computeRawVarint32Size;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return computeRawVarint32Size;
    }

    public static int computeSInt64SizeNoTag(long j) {
        int i = isInside + 51;
        equals = i % 128;
        int i2 = i % 2;
        try {
            int computeRawVarint64Size = computeRawVarint64Size(encodeZigZag64(j));
            int i3 = isInside + 105;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return computeRawVarint64Size;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0049, code lost:
        throw new kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.OutOfSpaceException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r6.output != null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void refreshBuffer() throws java.io.IOException {
        /*
            r6 = this;
            int r0 = equals
            int r0 = r0 + 29
            int r1 = r0 % 128
            isInside = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = 0
            if (r0 == r1) goto L_0x001b
            java.io.OutputStream r0 = r6.output     // Catch:{ Exception -> 0x0019 }
            if (r0 == 0) goto L_0x0044
            goto L_0x0022
        L_0x0019:
            r0 = move-exception
            goto L_0x0041
        L_0x001b:
            java.io.OutputStream r0 = r6.output
            super.hashCode()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0044
        L_0x0022:
            java.io.OutputStream r0 = r6.output
            byte[] r4 = r6.buffer
            int r5 = r6.position
            r0.write(r4, r2, r5)
            r6.position = r2
            int r0 = equals     // Catch:{ Exception -> 0x0042 }
            int r0 = r0 + 15
            int r4 = r0 % 128
            isInside = r4     // Catch:{ Exception -> 0x0019 }
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x003a
            r2 = 1
        L_0x003a:
            if (r2 == r1) goto L_0x003d
            return
        L_0x003d:
            int r0 = r3.length     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r0 = move-exception
            throw r0
        L_0x0041:
            throw r0
        L_0x0042:
            r0 = move-exception
            throw r0
        L_0x0044:
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream$OutOfSpaceException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream$OutOfSpaceException
            r0.<init>()
            throw r0
        L_0x004a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.refreshBuffer():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r0 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r1 != true) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void flush() throws java.io.IOException {
        /*
            r3 = this;
            int r0 = equals     // Catch:{ Exception -> 0x0033 }
            int r0 = r0 + 43
            int r1 = r0 % 128
            isInside = r1     // Catch:{ Exception -> 0x0033 }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == r2) goto L_0x001b
            java.io.OutputStream r0 = r3.output     // Catch:{ Exception -> 0x0033 }
            if (r0 == 0) goto L_0x0018
            r1 = 1
        L_0x0018:
            if (r1 == r2) goto L_0x0023
            goto L_0x0026
        L_0x001b:
            java.io.OutputStream r0 = r3.output
            r1 = 0
            super.hashCode()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0026
        L_0x0023:
            r3.refreshBuffer()
        L_0x0026:
            int r0 = isInside
            int r0 = r0 + 99
            int r1 = r0 % 128
            equals = r1
            int r0 = r0 % 2
            return
        L_0x0031:
            r0 = move-exception
            throw r0
        L_0x0033:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.flush():void");
    }

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public final void writeRawByte(byte b) throws IOException {
        if (this.position == this.limit) {
            int i = isInside + 101;
            equals = i % 128;
            int i2 = i % 2;
            refreshBuffer();
        }
        byte[] bArr = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        bArr[i3] = b;
        this.totalBytesWritten++;
        int i4 = isInside + 3;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void writeRawByte(int i) throws IOException {
        try {
            int i2 = isInside + 61;
            equals = i2 % 128;
            int i3 = i2 % 2;
            writeRawByte((byte) i);
            int i4 = isInside + 11;
            equals = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
        try {
            int i = isInside + 51;
            equals = i % 128;
            if ((i % 2 != 0 ? (char) 5 : 23) != 23) {
                writeRawBytes(byteString, 1, byteString.size());
            } else {
                writeRawBytes(byteString, 0, byteString.size());
            }
            try {
                int i2 = isInside + 1;
                equals = i2 % 128;
                if ((i2 % 2 != 0 ? 'S' : '0') == 'S') {
                    Object[] objArr = null;
                    int length2 = objArr.length;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void writeRawBytes(byte[] bArr) throws IOException {
        int i = equals + 123;
        isInside = i % 128;
        int i2 = i % 2;
        boolean z = false;
        writeRawBytes(bArr, 0, bArr.length);
        int i3 = isInside + 65;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            z = true;
        }
        if (!z) {
            Object obj = null;
            super.hashCode();
        }
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) throws IOException {
        int i3 = equals + 39;
        isInside = i3 % 128;
        int i4 = i3 % 2;
        if (this.limit - this.position < i2) {
            int i5 = this.limit;
            int i6 = this.position;
            int i7 = i5 - i6;
            System.arraycopy(bArr, i, this.buffer, i6, i7);
            int i8 = i + i7;
            i2 -= i7;
            this.position = this.limit;
            this.totalBytesWritten += i7;
            refreshBuffer();
            if (!(i2 > this.limit)) {
                System.arraycopy(bArr, i8, this.buffer, 0, i2);
                this.position = i2;
            } else {
                this.output.write(bArr, i8, i2);
                int i9 = equals + 51;
                isInside = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (Exception e) {
                throw e;
            }
        }
        this.totalBytesWritten += i2;
        int i11 = isInside + 69;
        equals = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (((r3.limit >>> r3.position) >= r6 ? 22 : ']') != 22) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        if ((r3.limit - r3.position >= r6 ? '%' : '2') != '2') goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        r0 = r3.limit;
        r1 = r3.position;
        r0 = r0 - r1;
        r4.copyTo(r3.buffer, r5, r1, r0);
        r5 = r5 + r0;
        r6 = r6 - r0;
        r3.position = r3.limit;
        r3.totalBytesWritten += r0;
        refreshBuffer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r6 > r3.limit) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        r0 = isInside + 23;
        equals = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if ((r0 % 2) == 0) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        r0 = '-';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        r0 = 'M';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        if (r0 == '-') goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        r4.copyTo(r3.buffer, r5, 0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        r4.copyTo(r3.buffer, r5, 1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        r3.position = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        r4.writeTo(r3.output, r5, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeRawBytes(kotlin.reflect.jvm.internal.impl.protobuf.ByteString r4, int r5, int r6) throws java.io.IOException {
        /*
            r3 = this;
            int r0 = equals     // Catch:{ Exception -> 0x0088 }
            int r0 = r0 + 15
            int r1 = r0 % 128
            isInside = r1     // Catch:{ Exception -> 0x0088 }
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x001f
            int r0 = r3.limit     // Catch:{ Exception -> 0x001d }
            int r1 = r3.position     // Catch:{ Exception -> 0x001d }
            int r0 = r0 >>> r1
            r1 = 22
            if (r0 < r6) goto L_0x0018
            r0 = 22
            goto L_0x001a
        L_0x0018:
            r0 = 93
        L_0x001a:
            if (r0 == r1) goto L_0x002f
            goto L_0x003c
        L_0x001d:
            r4 = move-exception
            throw r4
        L_0x001f:
            int r0 = r3.limit
            int r1 = r3.position
            int r0 = r0 - r1
            r1 = 50
            if (r0 < r6) goto L_0x002b
            r0 = 37
            goto L_0x002d
        L_0x002b:
            r0 = 50
        L_0x002d:
            if (r0 == r1) goto L_0x003c
        L_0x002f:
            byte[] r0 = r3.buffer
            int r1 = r3.position
            r4.copyTo(r0, r5, r1, r6)
            int r4 = r3.position
            int r4 = r4 + r6
            r3.position = r4
            goto L_0x0082
        L_0x003c:
            int r0 = r3.limit
            int r1 = r3.position
            int r0 = r0 - r1
            byte[] r2 = r3.buffer
            r4.copyTo(r2, r5, r1, r0)
            int r5 = r5 + r0
            int r6 = r6 - r0
            int r1 = r3.limit
            r3.position = r1
            int r1 = r3.totalBytesWritten
            int r1 = r1 + r0
            r3.totalBytesWritten = r1
            r3.refreshBuffer()
            int r0 = r3.limit
            if (r6 > r0) goto L_0x007d
            int r0 = isInside
            int r0 = r0 + 23
            int r1 = r0 % 128
            equals = r1
            int r0 = r0 % 2
            r1 = 45
            if (r0 == 0) goto L_0x0069
            r0 = 45
            goto L_0x006b
        L_0x0069:
            r0 = 77
        L_0x006b:
            if (r0 == r1) goto L_0x0074
            byte[] r0 = r3.buffer
            r1 = 0
            r4.copyTo(r0, r5, r1, r6)
            goto L_0x007a
        L_0x0074:
            byte[] r0 = r3.buffer
            r1 = 1
            r4.copyTo(r0, r5, r1, r6)
        L_0x007a:
            r3.position = r6
            goto L_0x0082
        L_0x007d:
            java.io.OutputStream r0 = r3.output
            r4.writeTo(r0, r5, r6)
        L_0x0082:
            int r4 = r3.totalBytesWritten
            int r4 = r4 + r6
            r3.totalBytesWritten = r4
            return
        L_0x0088:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.writeRawBytes(kotlin.reflect.jvm.internal.impl.protobuf.ByteString, int, int):void");
    }

    public final void writeTag(int i, int i2) throws IOException {
        int i3 = isInside + 63;
        equals = i3 % 128;
        int i4 = i3 % 2;
        try {
            writeRawVarint32(WireFormat.makeTag(i, i2));
            try {
                int i5 = isInside + 95;
                equals = i5 % 128;
                if ((i5 % 2 != 0 ? 'B' : 'V') == 'B') {
                    Object[] objArr = null;
                    int length2 = objArr.length;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static int computeTagSize(int i) {
        int i2 = equals + 61;
        isInside = i2 % 128;
        if ((i2 % 2 == 0 ? '[' : '*') == '*') {
            return computeRawVarint32Size(WireFormat.makeTag(i, 0));
        }
        try {
            return computeRawVarint32Size(WireFormat.makeTag(i, 1));
        } catch (Exception e) {
            throw e;
        }
    }

    public final void writeRawVarint32(int i) throws IOException {
        while (true) {
            if (!((i & -128) != 0)) {
                int i2 = equals + 23;
                isInside = i2 % 128;
                int i3 = i2 % 2;
                writeRawByte(i);
                return;
            }
            writeRawByte((i & 127) | 128);
            i >>>= 7;
            try {
                int i4 = isInside + 29;
                equals = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if ((r4 & -128) == 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if ((r4 & -16384) != 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        if ((-2097152 & r4) != 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4 = isInside + 121;
        equals = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if ((r4 % 2) == 0) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        if ((r4 & -268435456) != 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0 = isInside + 105;
        equals = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        if ((r0 % 2) == 0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        r0 = '+';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0051, code lost:
        r0 = '#';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        if (r0 == '#') goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0 = 57 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0058, code lost:
        return 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005b, code lost:
        return 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005d, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005e, code lost:
        r4 = equals + 115;
        isInside = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0067, code lost:
        return 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (((r4 ^ 19) != 0) != true) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int computeRawVarint32Size(int r4) {
        /*
            int r0 = equals
            int r0 = r0 + 85
            int r1 = r0 % 128
            isInside = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == 0) goto L_0x001d
            r0 = r4 ^ 19
            if (r0 != 0) goto L_0x0019
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            if (r0 == r3) goto L_0x0022
            goto L_0x0021
        L_0x001d:
            r0 = r4 & -128(0xffffffffffffff80, float:NaN)
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            return r3
        L_0x0022:
            r0 = r4 & -16384(0xffffffffffffc000, float:NaN)
            if (r0 != 0) goto L_0x0027
            return r1
        L_0x0027:
            r0 = -2097152(0xffffffffffe00000, float:NaN)
            r0 = r0 & r4
            r3 = 5
            if (r0 != 0) goto L_0x003b
            int r4 = isInside
            int r4 = r4 + 121
            int r0 = r4 % 128
            equals = r0
            int r4 = r4 % r1
            if (r4 == 0) goto L_0x0039
            return r3
        L_0x0039:
            r4 = 3
            return r4
        L_0x003b:
            r0 = -268435456(0xfffffffff0000000, float:-1.58456325E29)
            r4 = r4 & r0
            if (r4 != 0) goto L_0x005e
            r4 = 4
            int r0 = isInside     // Catch:{ Exception -> 0x005c }
            int r0 = r0 + 105
            int r3 = r0 % 128
            equals = r3     // Catch:{ Exception -> 0x005c }
            int r0 = r0 % r1
            r1 = 35
            if (r0 == 0) goto L_0x0051
            r0 = 43
            goto L_0x0053
        L_0x0051:
            r0 = 35
        L_0x0053:
            if (r0 == r1) goto L_0x005b
            r0 = 57
            int r0 = r0 / r2
            return r4
        L_0x0059:
            r4 = move-exception
            throw r4
        L_0x005b:
            return r4
        L_0x005c:
            r4 = move-exception
            throw r4
        L_0x005e:
            int r4 = equals
            int r4 = r4 + 115
            int r0 = r4 % 128
            isInside = r0
            int r4 = r4 % r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeRawVarint32Size(int):int");
    }

    public final void writeRawVarint64(long j) throws IOException {
        while ((-128 & j) != 0) {
            writeRawByte((((int) j) & 127) | 128);
            j >>>= 7;
            int i = isInside + 9;
            equals = i % 128;
            int i2 = i % 2;
        }
        int i3 = isInside + 47;
        equals = i3 % 128;
        int i4 = (int) j;
        if ((i3 % 2 != 0 ? 7 : 'C') != 7) {
            try {
                writeRawByte(i4);
            } catch (Exception e) {
                throw e;
            }
        } else {
            writeRawByte(i4);
            Object obj = null;
            super.hashCode();
        }
    }

    public static int computeRawVarint64Size(long j) {
        boolean z = false;
        if ((-128 & j) != 0) {
            if (((-16384 & j) == 0 ? ';' : 'b') != 'b') {
                return 2;
            }
            if ((-2097152 & j) == 0) {
                return 3;
            }
            if ((-268435456 & j) == 0) {
                return 4;
            }
            if ((-34359738368L & j) == 0) {
                return 5;
            }
            if ((-4398046511104L & j) == 0) {
                return 6;
            }
            if ((-562949953421312L & j) == 0) {
                return 7;
            }
            if ((-72057594037927936L & j) != 0) {
                z = true;
            }
            if (!z) {
                int i = equals + 75;
                isInside = i % 128;
                int i2 = i % 2;
                return 8;
            } else if ((j & Long.MIN_VALUE) != 0) {
                return 10;
            } else {
                try {
                    int i3 = isInside + 21;
                    equals = i3 % 128;
                    int i4 = i3 % 2;
                    return 9;
                } catch (Exception e) {
                    throw e;
                }
            }
        } else {
            try {
                int i5 = isInside + 123;
                equals = i5 % 128;
                if (i5 % 2 != 0) {
                }
                return 1;
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public final void writeRawLittleEndian32(int i) throws IOException {
        int i2 = isInside + 33;
        equals = i2 % 128;
        int i3 = i2 % 2;
        writeRawByte(i & 255);
        writeRawByte((i >> 8) & 255);
        writeRawByte((i >> 16) & 255);
        writeRawByte((i >> 24) & 255);
        int i4 = isInside + 79;
        equals = i4 % 128;
        if ((i4 % 2 != 0 ? 6 : 'F') != 'F') {
            Object obj = null;
            super.hashCode();
        }
    }

    public final void writeRawLittleEndian64(long j) throws IOException {
        try {
            int i = isInside + 83;
            equals = i % 128;
            int i2 = i % 2;
            writeRawByte(((int) j) & 255);
            writeRawByte(((int) (j >> 8)) & 255);
            writeRawByte(((int) (j >> 16)) & 255);
            writeRawByte(((int) (j >> 24)) & 255);
            writeRawByte(((int) (j >> 32)) & 255);
            writeRawByte(((int) (j >> 40)) & 255);
            writeRawByte(((int) (j >> 48)) & 255);
            writeRawByte(((int) (j >> 56)) & 255);
            int i3 = isInside + 55;
            equals = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public static int encodeZigZag32(int i) {
        try {
            int i2 = equals + 107;
            isInside = i2 % 128;
            int i3 = i2 % 2;
            int i4 = (i >> 31) ^ (i << 1);
            int i5 = equals + 33;
            isInside = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        } catch (Exception e) {
            throw e;
        }
    }

    public static long encodeZigZag64(long j) {
        try {
            int i = equals + 61;
            try {
                isInside = i % 128;
                long j2 = (i % 2 == 0 ? 'M' : Typography.quote) != 'M' ? (j >> 63) ^ (j << 1) : (j >> 87) * (j << 1);
                int i2 = equals + 43;
                isInside = i2 % 128;
                if ((i2 % 2 == 0 ? ')' : 6) == 6) {
                    return j2;
                }
                Object[] objArr = null;
                int length2 = objArr.length;
                return j2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String length(int i, byte b, int i2, int i3, short s) {
        int i4;
        int i5;
        short s2;
        StringBuilder sb = new StringBuilder();
        int i6 = i + setMin;
        int i7 = 0;
        int i8 = 1;
        boolean z = i6 == -1;
        if ((z ? (char) 6 : 20) != 20) {
            try {
                int i9 = equals + 9;
                isInside = i9 % 128;
                int i10 = i9 % 2;
                try {
                    if (setMax == null) {
                        i6 = (short) (getMax[getMin + i2] + setMin);
                    } else {
                        i6 = (byte) (setMax[getMin + i2] + setMin);
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        if ((i6 > 0 ? 23 : Typography.greater) == 23) {
            int i11 = ((i2 + i6) - 2) + getMin;
            if ((z ? 12 : 'H') == 12) {
                int i12 = isInside + 55;
                equals = i12 % 128;
                int i13 = i12 % 2;
                i7 = 1;
            }
            int i14 = i11 + i7;
            char c = (char) (i3 + length);
            sb.append(c);
            while (i8 < i6) {
                byte[] bArr = setMax;
                if (bArr != null) {
                    int i15 = isInside + 69;
                    equals = i15 % 128;
                    if (i15 % 2 != 0) {
                        i5 = i14 + 53;
                        i4 = c - (((byte) (bArr[i14] * s)) ^ b);
                        c = (char) i4;
                        i14 = i5;
                        sb.append(c);
                        i8++;
                        int i16 = equals + 77;
                        isInside = i16 % 128;
                        int i17 = i16 % 2;
                    } else {
                        i5 = i14 - 1;
                        s2 = (byte) (bArr[i14] + s);
                    }
                } else {
                    i5 = i14 - 1;
                    s2 = (short) (getMax[i14] + s);
                }
                i4 = c + (s2 ^ b);
                c = (char) i4;
                i14 = i5;
                sb.append(c);
                i8++;
                int i162 = equals + 77;
                isInside = i162 % 128;
                int i172 = i162 % 2;
            }
        }
        return sb.toString();
    }
}
