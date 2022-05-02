package com.facebook.stetho.dumpapp;

import android.text.TextUtils;
import android.view.KeyEvent;
import com.facebook.stetho.common.LogUtil;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

class Framer {
    public static final byte ENTER_FRAME_PREFIX = 33;
    public static final byte EXIT_FRAME_PREFIX = 120;
    public static final byte STDERR_FRAME_PREFIX = 50;
    public static final byte STDIN_FRAME_PREFIX = 45;
    public static final byte STDIN_REQUEST_FRAME_PREFIX = 95;
    public static final byte STDOUT_FRAME_PREFIX = 49;
    private static final String TAG = "FramingSocket";
    private static char getMax = '\u0003';
    private static int getMin = 0;
    private static char[] setMax = {'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    private static int setMin = 1;
    private final DataInputStream mInput;
    private final DataOutputStream mMultiplexedOutputStream;
    private final PrintStream mStderr = new PrintStream(new FramingOutputStream(STDERR_FRAME_PREFIX));
    private final InputStream mStdin = new FramingInputStream();
    private final PrintStream mStdout = new PrintStream(new BufferedOutputStream(new FramingOutputStream(STDOUT_FRAME_PREFIX)));

    static /* synthetic */ DataInputStream access$200(Framer framer) {
        int i = getMin + 117;
        setMin = i % 128;
        if (!(i % 2 == 0)) {
            return framer.mInput;
        }
        int i2 = 86 / 0;
        return framer.mInput;
    }

    static /* synthetic */ DataOutputStream access$300(Framer framer) {
        int i = getMin + 5;
        setMin = i % 128;
        if ((i % 2 == 0 ? ':' : '!') != ':') {
            return framer.mMultiplexedOutputStream;
        }
        try {
            DataOutputStream dataOutputStream = framer.mMultiplexedOutputStream;
            Object[] objArr = null;
            int length = objArr.length;
            return dataOutputStream;
        } catch (Exception e) {
            throw e;
        }
    }

    public Framer(InputStream inputStream, OutputStream outputStream) throws IOException {
        this.mInput = new DataInputStream(inputStream);
        this.mMultiplexedOutputStream = new DataOutputStream(outputStream);
    }

    public InputStream getStdin() {
        int i = setMin + 15;
        getMin = i % 128;
        int i2 = i % 2;
        InputStream inputStream = this.mStdin;
        try {
            int i3 = getMin + 91;
            try {
                setMin = i3 % 128;
                if (i3 % 2 != 0) {
                    return inputStream;
                }
                Object obj = null;
                super.hashCode();
                return inputStream;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public PrintStream getStdout() {
        try {
            int i = setMin + 113;
            getMin = i % 128;
            int i2 = i % 2;
            PrintStream printStream = this.mStdout;
            int i3 = getMin + 49;
            setMin = i3 % 128;
            int i4 = i3 % 2;
            return printStream;
        } catch (Exception e) {
            throw e;
        }
    }

    public PrintStream getStderr() {
        int i = setMin + 85;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            PrintStream printStream = this.mStderr;
            int i3 = setMin + 81;
            getMin = i3 % 128;
            if ((i3 % 2 != 0 ? '9' : 29) != '9') {
                return printStream;
            }
            int i4 = 35 / 0;
            return printStream;
        } catch (Exception e) {
            throw e;
        }
    }

    public byte readFrameType() throws IOException {
        byte b;
        int i = setMin + 89;
        getMin = i % 128;
        if ((i % 2 != 0 ? 'c' : 16) != 16) {
            b = this.mInput.readByte();
            int i2 = 17 / 0;
        } else {
            b = this.mInput.readByte();
        }
        int i3 = setMin + 97;
        getMin = i3 % 128;
        int i4 = i3 % 2;
        return b;
    }

    public int readInt() throws IOException {
        int i;
        int i2 = setMin + 51;
        getMin = i2 % 128;
        if (!(i2 % 2 == 0)) {
            try {
                i = this.mInput.readInt();
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            i = this.mInput.readInt();
        }
        int i3 = getMin + 121;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return i;
    }

    public String readString() throws IOException {
        byte[] bArr = new byte[this.mInput.readUnsignedShort()];
        this.mInput.readFully(bArr);
        String str = new String(bArr, Charset.forName(setMax(new char[]{1, 2, 0, 5, 143}, ((byte) KeyEvent.getModifierMetaStateMask()) + 6, (byte) (TextUtils.indexOf("", '0') + 88)).intern()));
        int i = setMin + 61;
        getMin = i % 128;
        if ((i % 2 != 0 ? (char) 0 : 19) == 19) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    public void writeExitCode(int i) throws IOException {
        int i2 = getMin + 105;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        this.mStdout.flush();
        this.mStderr.flush();
        writeIntFrame(EXIT_FRAME_PREFIX, i);
        int i4 = setMin + 37;
        getMin = i4 % 128;
        int i5 = i4 % 2;
    }

    public void writeIntFrame(byte b, int i) throws IOException {
        try {
            int i2 = setMin + 75;
            getMin = i2 % 128;
            int i3 = i2 % 2;
            this.mMultiplexedOutputStream.write(b);
            this.mMultiplexedOutputStream.writeInt(i);
            int i4 = setMin + 27;
            getMin = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public void writeBlob(byte[] bArr, int i, int i2) throws IOException {
        int i3 = setMin + 59;
        getMin = i3 % 128;
        int i4 = i3 % 2;
        this.mMultiplexedOutputStream.write(bArr, i, i2);
        int i5 = setMin + 103;
        getMin = i5 % 128;
        if ((i5 % 2 != 0 ? 'b' : 'S') != 'S') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    private static <T extends Throwable> T handleSuppression(@Nullable T t, T t2) {
        int i = getMin + 21;
        setMin = i % 128;
        int i2 = i % 2;
        if ((t == null ? '!' : 'B') != 'B') {
            int i3 = setMin + 123;
            getMin = i3 % 128;
            if ((i3 % 2 != 0 ? 7 : 'S') == 7) {
                Object[] objArr = null;
                int length = objArr.length;
            }
            return t2;
        }
        LogUtil.i(TAG, t2, "Suppressed while handling ".concat(String.valueOf(t)));
        return t;
    }

    class FramingInputStream extends InputStream {
        private final ClosedHelper mClosedHelper;

        private FramingInputStream() {
            this.mClosedHelper = new ClosedHelper();
        }

        public int read() throws IOException {
            byte[] bArr = new byte[1];
            if (read(bArr) == 0) {
                return -1;
            }
            return bArr[0];
        }

        public int read(byte[] bArr) throws IOException {
            return read(bArr, 0, bArr.length);
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int readInt;
            this.mClosedHelper.throwIfClosed();
            synchronized (Framer.this) {
                Framer.this.writeIntFrame(Framer.STDIN_REQUEST_FRAME_PREFIX, i2);
                byte readFrameType = Framer.this.readFrameType();
                if (readFrameType == 45) {
                    readInt = Framer.this.readInt();
                    if (readInt > 0) {
                        if (readInt <= i2) {
                            Framer.access$200(Framer.this).readFully(bArr, i, readInt);
                        } else {
                            StringBuilder sb = new StringBuilder("Expected at most ");
                            sb.append(i2);
                            sb.append(" bytes, got: ");
                            sb.append(readInt);
                            throw new DumpappFramingException(sb.toString());
                        }
                    }
                } else {
                    throw new UnexpectedFrameException(Framer.STDIN_FRAME_PREFIX, readFrameType);
                }
            }
            return readInt;
        }

        public long skip(long j) throws IOException {
            long j2;
            byte[] bArr = new byte[((int) Math.min(j, 2048))];
            synchronized (Framer.this) {
                j2 = 0;
                while (j2 < j) {
                    int read = read(bArr);
                    if (read < 0) {
                        break;
                    }
                    j2 += (long) read;
                }
            }
            return j2;
        }

        public void close() throws IOException {
            this.mClosedHelper.close();
        }
    }

    class FramingOutputStream extends OutputStream {
        private final ClosedHelper mClosedHelper = new ClosedHelper();
        private final byte mPrefix;

        public FramingOutputStream(byte b) {
            this.mPrefix = b;
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.mClosedHelper.throwIfClosed();
            if (i2 > 0) {
                try {
                    synchronized (Framer.this) {
                        Framer.this.writeIntFrame(this.mPrefix, i2);
                        Framer.this.writeBlob(bArr, i, i2);
                        Framer.access$300(Framer.this).flush();
                    }
                } catch (IOException e) {
                    throw new DumpappOutputBrokenException((Throwable) e);
                }
            }
        }

        public void write(int i) throws IOException {
            write(new byte[]{(byte) i}, 0, 1);
        }

        public void write(byte[] bArr) throws IOException {
            write(bArr, 0, bArr.length);
        }

        public void close() throws IOException {
            this.mClosedHelper.close();
        }
    }

    static class ClosedHelper {
        private volatile boolean mClosed;

        private ClosedHelper() {
        }

        public void throwIfClosed() throws IOException {
            if (this.mClosed) {
                throw new IOException("Stream is closed");
            }
        }

        public void close() {
            this.mClosed = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if ((r14 + 5) != 0) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if ((r14 % 2) != 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(char[] r13, int r14, byte r15) {
        /*
            int r0 = setMin
            int r0 = r0 + 29
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == r2) goto L_0x0020
            char[] r0 = setMax     // Catch:{ Exception -> 0x001e }
            char r3 = getMax     // Catch:{ Exception -> 0x001e }
            char[] r4 = new char[r14]     // Catch:{ Exception -> 0x001e }
            int r5 = r14 % 2
            if (r5 == 0) goto L_0x0032
            goto L_0x002a
        L_0x001e:
            r13 = move-exception
            throw r13
        L_0x0020:
            char[] r0 = setMax
            char r3 = getMax
            char[] r4 = new char[r14]
            int r5 = r14 + 5
            if (r5 == 0) goto L_0x0032
        L_0x002a:
            int r14 = r14 + -1
            char r5 = r13[r14]
            int r5 = r5 - r15
            char r5 = (char) r5
            r4[r14] = r5
        L_0x0032:
            if (r14 <= r2) goto L_0x00c7
            r5 = 0
        L_0x0035:
            if (r5 >= r14) goto L_0x00c7
            char r6 = r13[r5]
            int r7 = r5 + 1
            char r8 = r13[r7]
            if (r6 != r8) goto L_0x0048
            int r6 = r6 - r15
            char r6 = (char) r6
            r4[r5] = r6
            int r8 = r8 - r15
            char r6 = (char) r8
            r4[r7] = r6
            goto L_0x00b9
        L_0x0048:
            int r9 = o.onActivityPreStopped.setMin(r6, r3)
            int r6 = o.onActivityPreStopped.length(r6, r3)
            int r10 = o.onActivityPreStopped.setMin(r8, r3)
            int r8 = o.onActivityPreStopped.length(r8, r3)
            if (r6 != r8) goto L_0x0087
            int r11 = getMin
            int r11 = r11 + 35
            int r12 = r11 % 128
            setMin = r12
            int r11 = r11 % 2
            int r9 = o.onActivityPreStopped.setMax(r9, r3)
            int r10 = o.onActivityPreStopped.setMax(r10, r3)
            int r6 = o.onActivityPreStopped.getMax(r9, r6, r3)
            int r8 = o.onActivityPreStopped.getMax(r10, r8, r3)
            char r6 = r0[r6]
            r4[r5] = r6
            char r6 = r0[r8]
            r4[r7] = r6
            int r6 = getMin
            int r6 = r6 + 109
            int r7 = r6 % 128
            setMin = r7
            int r6 = r6 % 2
            goto L_0x00b9
        L_0x0087:
            if (r9 != r10) goto L_0x008b
            r11 = 1
            goto L_0x008c
        L_0x008b:
            r11 = 0
        L_0x008c:
            if (r11 == r2) goto L_0x00a1
            int r8 = o.onActivityPreStopped.getMax(r9, r8, r3)     // Catch:{ Exception -> 0x009f }
            int r6 = o.onActivityPreStopped.getMax(r10, r6, r3)     // Catch:{ Exception -> 0x009f }
            char r8 = r0[r8]     // Catch:{ Exception -> 0x009f }
            r4[r5] = r8     // Catch:{ Exception -> 0x009f }
            char r6 = r0[r6]     // Catch:{ Exception -> 0x009f }
            r4[r7] = r6     // Catch:{ Exception -> 0x009f }
            goto L_0x00b9
        L_0x009f:
            r13 = move-exception
            throw r13
        L_0x00a1:
            int r6 = o.onActivityPreStopped.setMax(r6, r3)
            int r8 = o.onActivityPreStopped.setMax(r8, r3)
            int r6 = o.onActivityPreStopped.getMax(r9, r6, r3)
            int r8 = o.onActivityPreStopped.getMax(r10, r8, r3)
            char r6 = r0[r6]
            r4[r5] = r6
            char r6 = r0[r8]
            r4[r7] = r6
        L_0x00b9:
            int r5 = r5 + 2
            int r6 = getMin
            int r6 = r6 + 93
            int r7 = r6 % 128
            setMin = r7
            int r6 = r6 % 2
            goto L_0x0035
        L_0x00c7:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.dumpapp.Framer.setMax(char[], int, byte):java.lang.String");
    }
}
