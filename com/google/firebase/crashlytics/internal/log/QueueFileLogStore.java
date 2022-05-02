package com.google.firebase.crashlytics.internal.log;

import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.log.QueueFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

class QueueFileLogStore implements FileLogStore {
    private static int IsOverlapping = 1;
    private static final Charset UTF_8;
    private static boolean getMax;
    private static int getMin;
    private static boolean length;
    private static int setMax;
    private static char[] setMin;
    private QueueFile logFile;
    private final int maxLogSize;
    private final File workingFile;

    static void getMax() {
        getMin = 182;
        getMax = true;
        length = true;
        setMin = new char[]{267, 266, 252, 227, 238};
    }

    static {
        getMax();
        char[] cArr = null;
        UTF_8 = Charset.forName(setMax(new byte[]{-123, -124, -125, -126, -127}, 127 - ExpandableListView.getPackedPositionType(0), cArr, cArr).intern());
        int i = IsOverlapping + 15;
        setMax = i % 128;
        if (!(i % 2 == 0)) {
            super.hashCode();
        }
    }

    static class LogBytes {
        public final byte[] bytes;
        public final int offset;

        LogBytes(byte[] bArr, int i) {
            this.bytes = bArr;
            this.offset = i;
        }
    }

    QueueFileLogStore(File file, int i) {
        this.workingFile = file;
        this.maxLogSize = i;
    }

    public void writeToLog(long j, String str) {
        int i = setMax + 91;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        openLogFile();
        doWriteToLog(j, str);
        int i3 = IsOverlapping + 105;
        setMax = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if ((r0 == null) != true) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r0 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0047, code lost:
        r1 = new byte[r0.offset];
        java.lang.System.arraycopy(r0.bytes, 0, r1, 0, r0.offset);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getLogAsBytes() {
        /*
            r4 = this;
            int r0 = setMax
            int r0 = r0 + 69
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 90
            if (r0 != 0) goto L_0x0011
            r0 = 90
            goto L_0x0013
        L_0x0011:
            r0 = 75
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x0023
            com.google.firebase.crashlytics.internal.log.QueueFileLogStore$LogBytes r0 = r4.getLogBytes()
            r1 = 1
            if (r0 != 0) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            if (r3 == r1) goto L_0x002b
            goto L_0x0047
        L_0x0023:
            com.google.firebase.crashlytics.internal.log.QueueFileLogStore$LogBytes r0 = r4.getLogBytes()
            r1 = 5
            int r1 = r1 / r2
            if (r0 != 0) goto L_0x0047
        L_0x002b:
            int r0 = setMax     // Catch:{ Exception -> 0x0045 }
            r1 = 61
            int r0 = r0 + r1
            int r2 = r0 % 128
            IsOverlapping = r2     // Catch:{ Exception -> 0x0045 }
            int r0 = r0 % 2
            r2 = 34
            if (r0 != 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r1 = 34
        L_0x003d:
            r0 = 0
            if (r1 == r2) goto L_0x0044
            int r1 = r0.length     // Catch:{ all -> 0x0042 }
            return r0
        L_0x0042:
            r0 = move-exception
            throw r0
        L_0x0044:
            return r0
        L_0x0045:
            r0 = move-exception
            throw r0
        L_0x0047:
            int r1 = r0.offset
            byte[] r1 = new byte[r1]
            byte[] r3 = r0.bytes
            int r0 = r0.offset
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
        L_0x0053:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.log.QueueFileLogStore.getLogAsBytes():byte[]");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0 != null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getLogAsString() {
        /*
            r4 = this;
            int r0 = setMax
            int r0 = r0 + 51
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 54
            if (r0 != 0) goto L_0x0011
            r0 = 54
            goto L_0x0013
        L_0x0011:
            r0 = 46
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x001d
            byte[] r0 = r4.getLogAsBytes()
            if (r0 == 0) goto L_0x0047
            goto L_0x0026
        L_0x001d:
            byte[] r0 = r4.getLogAsBytes()     // Catch:{ Exception -> 0x004a }
            super.hashCode()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0047
        L_0x0026:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r3 = UTF_8     // Catch:{ Exception -> 0x004a }
            r1.<init>(r0, r3)
            int r0 = setMax
            int r0 = r0 + 35
            int r3 = r0 % 128
            IsOverlapping = r3
            int r0 = r0 % 2
            r3 = 86
            if (r0 != 0) goto L_0x003e
            r0 = 86
            goto L_0x0040
        L_0x003e:
            r0 = 18
        L_0x0040:
            if (r0 == r3) goto L_0x0043
            return r1
        L_0x0043:
            int r0 = r2.length     // Catch:{ all -> 0x0045 }
            return r1
        L_0x0045:
            r0 = move-exception
            throw r0
        L_0x0047:
            return r2
        L_0x0048:
            r0 = move-exception
            throw r0
        L_0x004a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.log.QueueFileLogStore.getLogAsString():java.lang.String");
    }

    private LogBytes getLogBytes() {
        if (!(!this.workingFile.exists())) {
            openLogFile();
            QueueFile queueFile = this.logFile;
            if (queueFile == null) {
                return null;
            }
            final int[] iArr = {0};
            final byte[] bArr = new byte[queueFile.usedBytes()];
            try {
                this.logFile.forEach(new QueueFile.ElementReader() {
                    public void read(InputStream inputStream, int i) throws IOException {
                        try {
                            inputStream.read(bArr, iArr[0], i);
                            int[] iArr = iArr;
                            iArr[0] = iArr[0] + i;
                        } finally {
                            inputStream.close();
                        }
                    }
                });
                int i = setMax + 57;
                IsOverlapping = i % 128;
                int i2 = i % 2;
            } catch (IOException e) {
                Logger.getLogger().e("A problem occurred while reading the Crashlytics log file.", e);
            }
            return new LogBytes(bArr, iArr[0]);
        }
        int i3 = setMax + 79;
        IsOverlapping = i3 % 128;
        int i4 = i3 % 2;
        int i5 = setMax + 77;
        IsOverlapping = i5 % 128;
        if ((i5 % 2 == 0 ? 22 : '8') != 22) {
            return null;
        }
        int i6 = 30 / 0;
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.google.firebase.crashlytics.internal.log.QueueFile] */
    public void closeLogFile() {
        int i = setMax + 15;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        CommonUtils.closeOrLog(this.logFile, "There was a problem closing the Crashlytics log file.");
        ? r0 = 0;
        this.logFile = r0;
        int i3 = IsOverlapping + 91;
        setMax = i3 % 128;
        if (!(i3 % 2 == 0)) {
            int length2 = r0.length;
        }
    }

    public void deleteLogFile() {
        int i = setMax + 43;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        try {
            closeLogFile();
            try {
                this.workingFile.delete();
                int i3 = setMax + 125;
                IsOverlapping = i3 % 128;
                if ((i3 % 2 == 0 ? ')' : 8) == ')') {
                    Object obj = null;
                    super.hashCode();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private void openLogFile() {
        int i = IsOverlapping + 37;
        setMax = i % 128;
        if (i % 2 == 0) {
            try {
                if (this.logFile != null) {
                    return;
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i2 = 38 / 0;
            if (this.logFile != null) {
                return;
            }
        }
        try {
            this.logFile = new QueueFile(this.workingFile);
            int i3 = IsOverlapping + 19;
            setMax = i3 % 128;
            if ((i3 % 2 != 0 ? 12 : ')') != ')') {
                Object obj = null;
                super.hashCode();
            }
        } catch (IOException e2) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Could not open log file: ");
            sb.append(this.workingFile);
            logger.e(sb.toString(), e2);
        }
    }

    private void doWriteToLog(long j, String str) {
        if (this.logFile != null) {
            if (str == null) {
                int i = setMax + 43;
                IsOverlapping = i % 128;
                if (i % 2 == 0) {
                    Object[] objArr = null;
                    int length2 = objArr.length;
                }
                str = "null";
            }
            try {
                int i2 = this.maxLogSize / 4;
                if (str.length() > i2) {
                    StringBuilder sb = new StringBuilder("...");
                    sb.append(str.substring(str.length() - i2));
                    str = sb.toString();
                }
                this.logFile.add(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(UTF_8));
                while (!this.logFile.isEmpty()) {
                    int i3 = setMax + 41;
                    IsOverlapping = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 19 / 0;
                        if ((this.logFile.usedBytes() > this.maxLogSize ? 30 : 'V') == 'V') {
                            return;
                        }
                    } else {
                        if ((this.logFile.usedBytes() > this.maxLogSize ? '0' : 20) != '0') {
                            return;
                        }
                    }
                    this.logFile.remove();
                }
            } catch (IOException e) {
                Logger.getLogger().e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    private static String setMax(byte[] bArr, int i, int[] iArr, char[] cArr) {
        char[] cArr2 = setMin;
        int i2 = getMin;
        int i3 = 0;
        if (length) {
            int i4 = IsOverlapping + 71;
            setMax = i4 % 128;
            int i5 = i4 % 2;
            int length2 = bArr.length;
            char[] cArr3 = new char[length2];
            int i6 = setMax + 17;
            IsOverlapping = i6 % 128;
            int i7 = i6 % 2;
            while (i3 < length2) {
                cArr3[i3] = (char) (cArr2[bArr[(length2 - 1) - i3] + i] - i2);
                i3++;
                int i8 = IsOverlapping + 97;
                setMax = i8 % 128;
                int i9 = i8 % 2;
            }
            return new String(cArr3);
        }
        try {
            if ((getMax ? 12 : 'S') != 'S') {
                int length3 = cArr.length;
                char[] cArr4 = new char[length3];
                while (true) {
                    if ((i3 < length3 ? (char) 23 : 1) == 1) {
                        return new String(cArr4);
                    }
                    cArr4[i3] = (char) (cArr2[cArr[(length3 - 1) - i3] - i] - i2);
                    i3++;
                }
            } else {
                int length4 = iArr.length;
                char[] cArr5 = new char[length4];
                int i10 = setMax + 123;
                IsOverlapping = i10 % 128;
                int i11 = i10 % 2;
                while (i3 < length4) {
                    cArr5[i3] = (char) (cArr2[iArr[(length4 - 1) - i3] - i] - i2);
                    i3++;
                }
                return new String(cArr5);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
