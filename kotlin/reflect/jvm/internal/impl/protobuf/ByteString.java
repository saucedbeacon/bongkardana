package kotlin.reflect.jvm.internal.impl.protobuf;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.text.Typography;
import o.onActivityPreStopped;

public abstract class ByteString implements Iterable<Byte> {
    static final /* synthetic */ boolean $assertionsDisabled;
    public static final ByteString EMPTY = new LiteralByteString(new byte[0]);
    private static char[] getMax = null;
    private static int getMin = 1;
    private static int length;
    private static char setMax;

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    static void setMax() {
        setMax = 3;
        getMax = new char[]{'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    }

    /* access modifiers changed from: protected */
    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int getTreeDepth();

    /* access modifiers changed from: protected */
    public abstract boolean isBalanced();

    public abstract boolean isValidUtf8();

    public abstract ByteIterator iterator();

    public abstract CodedInputStream newCodedInput();

    /* access modifiers changed from: protected */
    public abstract int partialHash(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int partialIsValidUtf8(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int peekCachedHashCode();

    public abstract int size();

    public abstract String toString(String str) throws UnsupportedEncodingException;

    /* access modifiers changed from: package-private */
    public abstract void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException;

    static {
        boolean z;
        setMax();
        if ((!ByteString.class.desiredAssertionStatus() ? '\\' : 27) != 27) {
            int i = length + 103;
            getMin = i % 128;
            int i2 = i % 2;
            z = true;
        } else {
            int i3 = getMin + 113;
            length = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        $assertionsDisabled = z;
    }

    ByteString() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if ((size() == 0) != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r0 = getMin + 101;
        length = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if ((r0 == 0) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isEmpty() {
        /*
            r4 = this;
            int r0 = length
            int r0 = r0 + 39
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001e
            int r0 = r4.size()
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x001c }
            if (r0 != 0) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 == 0) goto L_0x002a
            goto L_0x0029
        L_0x001c:
            r0 = move-exception
            throw r0
        L_0x001e:
            int r0 = r4.size()
            if (r0 != 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            int r0 = getMin
            int r0 = r0 + 101
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.ByteString.isEmpty():boolean");
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        LiteralByteString literalByteString = new LiteralByteString(bArr2);
        int i3 = getMin + 117;
        length = i3 % 128;
        int i4 = i3 % 2;
        return literalByteString;
    }

    public static ByteString copyFrom(byte[] bArr) {
        try {
            int i = getMin + 15;
            length = i % 128;
            int i2 = i % 2;
            try {
                ByteString copyFrom = copyFrom(bArr, 0, bArr.length);
                int i3 = length + 125;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                return copyFrom;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            LiteralByteString literalByteString = new LiteralByteString(str.getBytes(getMin(new char[]{1, 2, 0, 5, Typography.paragraph}, 4 - TextUtils.indexOf("", '0'), (byte) (127 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)))).intern()));
            int i = length + 19;
            getMin = i % 128;
            if ((i % 2 == 0 ? (char) 18 : 27) == 27) {
                return literalByteString;
            }
            Object obj = null;
            super.hashCode();
            return literalByteString;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public ByteString concat(ByteString byteString) {
        int i = getMin + 9;
        length = i % 128;
        int i2 = i % 2;
        int size = size();
        int size2 = byteString.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            ByteString concatenate = RopeByteString.concatenate(this, byteString);
            try {
                int i3 = getMin + 105;
                try {
                    length = i3 % 128;
                    int i4 = i3 % 2;
                    return concatenate;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            for (ByteString add : iterable) {
                try {
                    collection.add(add);
                } catch (Exception e) {
                    throw e;
                }
            }
        } else {
            collection = (Collection) iterable;
        }
        if ((collection.isEmpty() ? ';' : 0) != 0) {
            int i = getMin + 37;
            length = i % 128;
            if (!(i % 2 != 0)) {
                return EMPTY;
            }
            int i2 = 12 / 0;
            return EMPTY;
        }
        ByteString balancedConcat = balancedConcat(collection.iterator(), collection.size());
        int i3 = getMin + 81;
        length = i3 % 128;
        int i4 = i3 % 2;
        return balancedConcat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        if ((!$assertionsDisabled ? '5' : 16) != 16) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r3 != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static kotlin.reflect.jvm.internal.impl.protobuf.ByteString balancedConcat(java.util.Iterator<kotlin.reflect.jvm.internal.impl.protobuf.ByteString> r4, int r5) {
        /*
            int r0 = getMin
            int r0 = r0 + 23
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto L_0x001d
            boolean r0 = $assertionsDisabled     // Catch:{ Exception -> 0x001b }
            r2 = 15
            r3 = 0
            int r2 = r2 / r3
            if (r0 != 0) goto L_0x0016
            r3 = 1
        L_0x0016:
            if (r3 == 0) goto L_0x003d
            goto L_0x002a
        L_0x0019:
            r4 = move-exception
            throw r4
        L_0x001b:
            r4 = move-exception
            throw r4
        L_0x001d:
            boolean r0 = $assertionsDisabled
            r2 = 16
            if (r0 != 0) goto L_0x0026
            r0 = 53
            goto L_0x0028
        L_0x0026:
            r0 = 16
        L_0x0028:
            if (r0 == r2) goto L_0x003d
        L_0x002a:
            int r0 = getMin
            int r0 = r0 + 69
            int r2 = r0 % 128
            length = r2
            int r0 = r0 % 2
            if (r5 <= 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L_0x003d:
            r0 = 77
            if (r5 != r1) goto L_0x0044
            r1 = 79
            goto L_0x0046
        L_0x0044:
            r1 = 77
        L_0x0046:
            if (r1 == r0) goto L_0x0068
            int r5 = length
            int r5 = r5 + 109
            int r0 = r5 % 128
            getMin = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x005f
            java.lang.Object r4 = r4.next()
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString r4 = (kotlin.reflect.jvm.internal.impl.protobuf.ByteString) r4
            r5 = 0
            int r5 = r5.length     // Catch:{ all -> 0x005d }
            goto L_0x0077
        L_0x005d:
            r4 = move-exception
            throw r4
        L_0x005f:
            java.lang.Object r4 = r4.next()     // Catch:{ Exception -> 0x0066 }
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString r4 = (kotlin.reflect.jvm.internal.impl.protobuf.ByteString) r4     // Catch:{ Exception -> 0x0066 }
            goto L_0x0077
        L_0x0066:
            r4 = move-exception
            throw r4
        L_0x0068:
            int r0 = r5 >>> 1
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString r1 = balancedConcat(r4, r0)
            int r5 = r5 - r0
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString r4 = balancedConcat(r4, r5)
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString r4 = r1.concat(r4)
        L_0x0077:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.ByteString.balancedConcat(java.util.Iterator, int):kotlin.reflect.jvm.internal.impl.protobuf.ByteString");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r5 >= 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        r6 = new java.lang.StringBuilder(30);
        r6.append("Source offset < 0: ");
        r6.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bb, code lost:
        throw new java.lang.IndexOutOfBoundsException(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r5 >= 0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void copyTo(byte[] r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            int r0 = length
            int r0 = r0 + 79
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 71
            if (r0 != 0) goto L_0x0011
            r0 = 33
            goto L_0x0013
        L_0x0011:
            r0 = 71
        L_0x0013:
            r2 = 30
            if (r0 == r1) goto L_0x001e
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x001c }
            if (r5 < 0) goto L_0x00a5
            goto L_0x0020
        L_0x001c:
            r4 = move-exception
            throw r4
        L_0x001e:
            if (r5 < 0) goto L_0x00a5
        L_0x0020:
            if (r6 < 0) goto L_0x008c
            if (r7 < 0) goto L_0x0073
            int r0 = r5 + r7
            int r1 = r3.size()
            r2 = 34
            if (r0 > r1) goto L_0x005c
            int r0 = r6 + r7
            int r1 = r4.length
            if (r0 > r1) goto L_0x0043
            if (r7 <= 0) goto L_0x0042
            r3.copyToInternal(r4, r5, r6, r7)
            int r4 = length
            int r4 = r4 + 31
            int r5 = r4 % 128
            getMin = r5
            int r4 = r4 % 2
        L_0x0042:
            return
        L_0x0043:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            java.lang.String r6 = "Target end offset < 0: "
            r5.append(r6)     // Catch:{ Exception -> 0x005a }
            r5.append(r0)     // Catch:{ Exception -> 0x005a }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x005a }
            r4.<init>(r5)     // Catch:{ Exception -> 0x005a }
            throw r4     // Catch:{ Exception -> 0x005a }
        L_0x005a:
            r4 = move-exception
            throw r4
        L_0x005c:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            java.lang.String r6 = "Source end offset < 0: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0073:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 23
            r5.<init>(r6)
            java.lang.String r6 = "Length < 0: "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x008c:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            java.lang.String r7 = "Target offset < 0: "
            r5.append(r7)     // Catch:{ Exception -> 0x00a3 }
            r5.append(r6)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00a3 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00a3 }
            throw r4     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            r4 = move-exception
            throw r4
        L_0x00a5:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            java.lang.String r7 = "Source offset < 0: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.ByteString.copyTo(byte[], int, int, int):void");
    }

    public byte[] toByteArray() {
        int i = getMin + 107;
        length = i % 128;
        int i2 = i % 2;
        int size = size();
        if ((size == 0 ? 4 : 'G') != 'G') {
            int i3 = length + 61;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r4 >= 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        r5 = new java.lang.StringBuilder(30);
        r5.append("Source offset < 0: ");
        r5.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        throw new java.lang.IndexOutOfBoundsException(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r4 >= 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeTo(java.io.OutputStream r3, int r4, int r5) throws java.io.IOException {
        /*
            r2 = this;
            int r0 = length
            int r0 = r0 + 109
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 == r1) goto L_0x001b
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x0019 }
            if (r4 < 0) goto L_0x0072
            goto L_0x001d
        L_0x0019:
            r3 = move-exception
            throw r3
        L_0x001b:
            if (r4 < 0) goto L_0x0072
        L_0x001d:
            if (r5 < 0) goto L_0x0059
            int r0 = r4 + r5
            int r1 = r2.size()
            if (r0 > r1) goto L_0x0040
            r0 = 53
            if (r5 <= 0) goto L_0x002e
            r1 = 25
            goto L_0x0030
        L_0x002e:
            r1 = 53
        L_0x0030:
            if (r1 == r0) goto L_0x0035
            r2.writeToInternal(r3, r4, r5)
        L_0x0035:
            int r3 = getMin
            int r3 = r3 + 21
            int r4 = r3 % 128
            length = r4
            int r3 = r3 % 2
            return
        L_0x0040:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 39
            r4.<init>(r5)
            java.lang.String r5 = "Source end offset exceeded: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0059:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r0 = 23
            r4.<init>(r0)
            java.lang.String r0 = "Length < 0: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0072:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r0 = 30
            r5.<init>(r0)
            java.lang.String r0 = "Source offset < 0: "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.ByteString.writeTo(java.io.OutputStream, int, int):void");
    }

    public String toStringUtf8() {
        String intern;
        int i = getMin + 39;
        length = i % 128;
        if ((i % 2 != 0 ? 'T' : 'N') != 'N') {
            try {
                intern = getMin(new char[]{1, 2, 0, 5, Typography.paragraph}, 4 >> (AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1)), (byte) (67 >>> TextUtils.lastIndexOf("", 'n'))).intern();
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            intern = getMin(new char[]{1, 2, 0, 5, Typography.paragraph}, 5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (125 - TextUtils.lastIndexOf("", '0'))).intern();
        }
        String byteString = toString(intern);
        int i2 = getMin + 41;
        length = i2 % 128;
        int i3 = i2 % 2;
        return byteString;
    }

    public static Output newOutput() {
        Output output = new Output(128);
        int i = length + 75;
        getMin = i % 128;
        if ((i % 2 == 0 ? '6' : 25) != '6') {
            return output;
        }
        Object obj = null;
        super.hashCode();
        return output;
    }

    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        Output(int i) {
            if (i >= 0) {
                this.initialCapacity = i;
                this.flushedBuffers = new ArrayList<>();
                this.buffer = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        public final synchronized void write(int i) {
            if (this.bufferPos == this.buffer.length) {
                flushFullBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i2 = this.bufferPos;
            this.bufferPos = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public final synchronized void write(byte[] bArr, int i, int i2) {
            if (i2 <= this.buffer.length - this.bufferPos) {
                System.arraycopy(bArr, i, this.buffer, this.bufferPos, i2);
                this.bufferPos += i2;
                return;
            }
            int length = this.buffer.length - this.bufferPos;
            System.arraycopy(bArr, i, this.buffer, this.bufferPos, length);
            int i3 = i2 - length;
            flushFullBuffer(i3);
            System.arraycopy(bArr, i + length, this.buffer, 0, i3);
            this.bufferPos = i3;
        }

        public final synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom((Iterable<ByteString>) this.flushedBuffers);
        }

        private byte[] copyArray(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        public final synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public final String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
        }

        private void flushFullBuffer(int i) {
            this.flushedBuffers.add(new LiteralByteString(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i >= bArr.length) {
                this.flushedBuffers.add(new LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i > 0) {
                this.flushedBuffers.add(new LiteralByteString(copyArray(bArr, i)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }
    }

    public String toString() {
        int i = length + 93;
        getMin = i % 128;
        int i2 = i % 2;
        boolean z = true;
        String format = String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
        try {
            int i3 = getMin + 57;
            length = i3 % 128;
            if (i3 % 2 != 0) {
                z = false;
            }
            if (z) {
                return format;
            }
            int i4 = 50 / 0;
            return format;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String getMin(char[] cArr, int i, byte b) {
        char c;
        char c2;
        char[] cArr2 = getMax;
        char c3 = setMax;
        char[] cArr3 = new char[i];
        if ((i % 2 != 0 ? 7 : ')') != ')') {
            i--;
            cArr3[i] = (char) (cArr[i] - b);
        }
        if (i > 1) {
            for (int i2 = 0; i2 < i; i2 += 2) {
                int i3 = getMin + 41;
                length = i3 % 128;
                if ((i3 % 2 != 0) ? (c2 = cArr[i2]) != (c = cArr[i2 % 1]) : (c2 = cArr[i2]) != (c = cArr[i2 + 1])) {
                    int min = onActivityPreStopped.setMin(c2, c3);
                    int length2 = onActivityPreStopped.length(c2, c3);
                    int min2 = onActivityPreStopped.setMin(c, c3);
                    int length3 = onActivityPreStopped.length(c, c3);
                    if ((length2 == length3 ? (char) 31 : 6) != 6) {
                        int max = onActivityPreStopped.setMax(min, c3);
                        int max2 = onActivityPreStopped.setMax(min2, c3);
                        int max3 = onActivityPreStopped.getMax(max, length2, c3);
                        int max4 = onActivityPreStopped.getMax(max2, length3, c3);
                        cArr3[i2] = cArr2[max3];
                        cArr3[i2 + 1] = cArr2[max4];
                    } else {
                        if (!(min != min2)) {
                            int max5 = onActivityPreStopped.setMax(length2, c3);
                            int max6 = onActivityPreStopped.setMax(length3, c3);
                            int max7 = onActivityPreStopped.getMax(min, max5, c3);
                            int max8 = onActivityPreStopped.getMax(min2, max6, c3);
                            cArr3[i2] = cArr2[max7];
                            cArr3[i2 + 1] = cArr2[max8];
                            int i4 = length + 43;
                            getMin = i4 % 128;
                            int i5 = i4 % 2;
                        } else {
                            int max9 = onActivityPreStopped.getMax(min, length3, c3);
                            int max10 = onActivityPreStopped.getMax(min2, length2, c3);
                            cArr3[i2] = cArr2[max9];
                            cArr3[i2 + 1] = cArr2[max10];
                        }
                    }
                } else {
                    cArr3[i2] = (char) (c2 - b);
                    cArr3[i2 + 1] = (char) (c - b);
                    try {
                        int i6 = length + 55;
                        getMin = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
        }
        return new String(cArr3);
    }
}
