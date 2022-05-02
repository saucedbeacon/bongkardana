package o;

import android.content.Context;
import android.os.StrictMode;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class tryCaptureView extends onViewReleased {
    @Nullable
    protected String IsOverlapping;
    private final Map<String, Object> getMin = new HashMap();
    @Nullable
    String[] isInside;
    protected final Context toIntRange;

    /* access modifiers changed from: protected */
    public abstract setMax getMin() throws IOException;

    public static class getMin {
        public final String getMax;
        public final String setMax;

        public getMin(String str, String str2) {
            this.setMax = str;
            this.getMax = str2;
        }
    }

    public static final class length {
        public final getMin[] getMin;

        public length(getMin[] getminArr) {
            this.getMin = getminArr;
        }

        static final length length(DataInput dataInput) throws IOException {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    getMin[] getminArr = new getMin[readInt];
                    for (int i = 0; i < readInt; i++) {
                        getminArr[i] = new getMin(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new length(getminArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        public final void getMax(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.getMin.length);
            int i = 0;
            while (true) {
                getMin[] getminArr = this.getMin;
                if (i < getminArr.length) {
                    dataOutput.writeUTF(getminArr[i].setMax);
                    dataOutput.writeUTF(this.getMin[i].getMax);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    protected static final class setMin implements Closeable {
        public final InputStream getMin;
        public final getMin length;

        public setMin(getMin getmin, InputStream inputStream) {
            this.length = getmin;
            this.getMin = inputStream;
        }

        public final void close() throws IOException {
            this.getMin.close();
        }
    }

    protected static abstract class getMax implements Closeable {
        public void close() throws IOException {
        }

        public abstract boolean getMax();

        public abstract setMin length() throws IOException;

        protected getMax() {
        }
    }

    protected static abstract class setMax implements Closeable {
        public void close() throws IOException {
        }

        /* access modifiers changed from: protected */
        public abstract getMax getMax() throws IOException;

        /* access modifiers changed from: protected */
        public abstract length setMax() throws IOException;

        protected setMax() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r4 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void getMax(java.io.File r3, byte r4) throws java.io.IOException {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)
            r1 = 0
            r0.seek(r1)     // Catch:{ all -> 0x0021 }
            r0.write(r4)     // Catch:{ all -> 0x0021 }
            long r3 = r0.getFilePointer()     // Catch:{ all -> 0x0021 }
            r0.setLength(r3)     // Catch:{ all -> 0x0021 }
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ all -> 0x0021 }
            r3.sync()     // Catch:{ all -> 0x0021 }
            r0.close()
            return
        L_0x0021:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x002c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryCaptureView.getMax(java.io.File, byte):void");
    }

    private void length(getMin[] getminArr) throws IOException {
        String[] list = this.length.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z = false;
                    int i = 0;
                    while (!z && i < getminArr.length) {
                        if (getminArr[i].setMax.equals(str)) {
                            z = true;
                        }
                        i++;
                    }
                    if (!z) {
                        DrawerLayout.getMin(new File(this.length, str));
                    }
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder("unable to list directory ");
        sb.append(this.length);
        throw new IOException(sb.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:31|32|33|34|35|36|37|(2:39|(1:41))|42|(3:44|45|82)(3:46|47|48)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0085 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036 A[Catch:{ all -> 0x00f0, all -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMax(byte r13, o.tryCaptureView.length r14, o.tryCaptureView.getMax r15) throws java.io.IOException {
        /*
            r12 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r12.length
            java.lang.String r2 = "dso_manifest"
            r0.<init>(r1, r2)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)
            r0 = 1
            if (r13 != r0) goto L_0x001b
            o.tryCaptureView$length r13 = o.tryCaptureView.length.length(r1)     // Catch:{ Exception -> 0x001b }
            goto L_0x001c
        L_0x0018:
            r13 = move-exception
            goto L_0x00fe
        L_0x001b:
            r13 = 0
        L_0x001c:
            r3 = 0
            if (r13 != 0) goto L_0x0026
            o.tryCaptureView$length r13 = new o.tryCaptureView$length     // Catch:{ all -> 0x0018 }
            o.tryCaptureView$getMin[] r4 = new o.tryCaptureView.getMin[r3]     // Catch:{ all -> 0x0018 }
            r13.<init>(r4)     // Catch:{ all -> 0x0018 }
        L_0x0026:
            o.tryCaptureView$getMin[] r14 = r14.getMin     // Catch:{ all -> 0x0018 }
            r12.length((o.tryCaptureView.getMin[]) r14)     // Catch:{ all -> 0x0018 }
            r14 = 32768(0x8000, float:4.5918E-41)
            byte[] r14 = new byte[r14]     // Catch:{ all -> 0x0018 }
        L_0x0030:
            boolean r4 = r15.getMax()     // Catch:{ all -> 0x0018 }
            if (r4 == 0) goto L_0x00fa
            o.tryCaptureView$setMin r4 = r15.length()     // Catch:{ all -> 0x0018 }
            r5 = 1
            r6 = 0
        L_0x003c:
            if (r5 == 0) goto L_0x006a
            o.tryCaptureView$getMin[] r7 = r13.getMin     // Catch:{ all -> 0x0067 }
            int r7 = r7.length     // Catch:{ all -> 0x0067 }
            if (r6 >= r7) goto L_0x006a
            o.tryCaptureView$getMin[] r7 = r13.getMin     // Catch:{ all -> 0x0067 }
            r7 = r7[r6]     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = r7.setMax     // Catch:{ all -> 0x0067 }
            o.tryCaptureView$getMin r8 = r4.length     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = r8.setMax     // Catch:{ all -> 0x0067 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x0064
            o.tryCaptureView$getMin[] r7 = r13.getMin     // Catch:{ all -> 0x0067 }
            r7 = r7[r6]     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = r7.getMax     // Catch:{ all -> 0x0067 }
            o.tryCaptureView$getMin r8 = r4.length     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = r8.getMax     // Catch:{ all -> 0x0067 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x0064
            r5 = 0
        L_0x0064:
            int r6 = r6 + 1
            goto L_0x003c
        L_0x0067:
            r13 = move-exception
            goto L_0x00ea
        L_0x006a:
            if (r5 == 0) goto L_0x00f5
            java.io.File r5 = r12.length     // Catch:{ all -> 0x0067 }
            boolean r5 = r5.setWritable(r0, r0)     // Catch:{ all -> 0x0067 }
            if (r5 == 0) goto L_0x00d4
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0067 }
            java.io.File r6 = r12.length     // Catch:{ all -> 0x0067 }
            o.tryCaptureView$getMin r7 = r4.length     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = r7.setMax     // Catch:{ all -> 0x0067 }
            r5.<init>(r6, r7)     // Catch:{ all -> 0x0067 }
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0085 }
            r6.<init>(r5, r2)     // Catch:{ IOException -> 0x0085 }
            goto L_0x008d
        L_0x0085:
            o.DrawerLayout.getMin(r5)     // Catch:{ all -> 0x0067 }
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0067 }
            r6.<init>(r5, r2)     // Catch:{ all -> 0x0067 }
        L_0x008d:
            java.io.InputStream r7 = r4.getMin     // Catch:{ IOException -> 0x00cb }
            int r7 = r7.available()     // Catch:{ IOException -> 0x00cb }
            if (r7 <= r0) goto L_0x00a3
            java.io.FileDescriptor r8 = r6.getFD()     // Catch:{ IOException -> 0x00cb }
            long r9 = (long) r7     // Catch:{ IOException -> 0x00cb }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x00cb }
            r11 = 21
            if (r7 < r11) goto L_0x00a3
            o.DrawerLayout.setMax.length(r8, r9)     // Catch:{ IOException -> 0x00cb }
        L_0x00a3:
            java.io.InputStream r7 = r4.getMin     // Catch:{ IOException -> 0x00cb }
            o.DrawerLayout.getMin(r6, r7, r14)     // Catch:{ IOException -> 0x00cb }
            long r7 = r6.getFilePointer()     // Catch:{ IOException -> 0x00cb }
            r6.setLength(r7)     // Catch:{ IOException -> 0x00cb }
            boolean r7 = r5.setExecutable(r0, r3)     // Catch:{ IOException -> 0x00cb }
            if (r7 == 0) goto L_0x00b9
            r6.close()     // Catch:{ all -> 0x0067 }
            goto L_0x00f5
        L_0x00b9:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ IOException -> 0x00cb }
            java.lang.String r14 = "cannot make file executable: "
            java.lang.String r15 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x00cb }
            java.lang.String r14 = r14.concat(r15)     // Catch:{ IOException -> 0x00cb }
            r13.<init>(r14)     // Catch:{ IOException -> 0x00cb }
            throw r13     // Catch:{ IOException -> 0x00cb }
        L_0x00c9:
            r13 = move-exception
            goto L_0x00d0
        L_0x00cb:
            r13 = move-exception
            o.DrawerLayout.getMin(r5)     // Catch:{ all -> 0x00c9 }
            throw r13     // Catch:{ all -> 0x00c9 }
        L_0x00d0:
            r6.close()     // Catch:{ all -> 0x0067 }
            throw r13     // Catch:{ all -> 0x0067 }
        L_0x00d4:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ all -> 0x0067 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            java.lang.String r15 = "cannot make directory writable for us: "
            r14.<init>(r15)     // Catch:{ all -> 0x0067 }
            java.io.File r15 = r12.length     // Catch:{ all -> 0x0067 }
            r14.append(r15)     // Catch:{ all -> 0x0067 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0067 }
            r13.<init>(r14)     // Catch:{ all -> 0x0067 }
            throw r13     // Catch:{ all -> 0x0067 }
        L_0x00ea:
            throw r13     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r14 = move-exception
            r4.close()     // Catch:{ all -> 0x00f0 }
            goto L_0x00f4
        L_0x00f0:
            r15 = move-exception
            r13.addSuppressed(r15)     // Catch:{ all -> 0x0018 }
        L_0x00f4:
            throw r14     // Catch:{ all -> 0x0018 }
        L_0x00f5:
            r4.close()     // Catch:{ all -> 0x0018 }
            goto L_0x0030
        L_0x00fa:
            r1.close()
            return
        L_0x00fe:
            throw r13     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r14 = move-exception
            r1.close()     // Catch:{ all -> 0x0104 }
            goto L_0x0108
        L_0x0104:
            r15 = move-exception
            r13.addSuppressed(r15)
        L_0x0108:
            goto L_0x010a
        L_0x0109:
            throw r14
        L_0x010a:
            goto L_0x0109
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryCaptureView.setMax(byte, o.tryCaptureView$length, o.tryCaptureView$getMax):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r11.addSuppressed(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r3 != 1) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a7, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ac, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r11.addSuppressed(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b0, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b3, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b8, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r11.addSuppressed(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00bc, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00bf, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c4, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c5, code lost:
        r11.addSuppressed(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c8, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean setMin(o.getOrderedChildIndex r11, int r12, byte[] r13) throws java.io.IOException {
        /*
            r10 = this;
            java.io.File r5 = new java.io.File
            java.io.File r0 = r10.length
            java.lang.String r1 = "dso_state"
            r5.<init>(r0, r1)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r5, r1)
            r7 = 1
            r2 = 0
            byte r3 = r0.readByte()     // Catch:{ EOFException -> 0x0025, all -> 0x0019 }
            if (r3 == r7) goto L_0x0026
            goto L_0x0025
        L_0x0019:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x001b }
        L_0x001b:
            r12 = move-exception
            r0.close()     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r13 = move-exception
            r11.addSuppressed(r13)
        L_0x0024:
            throw r12
        L_0x0025:
            r3 = 0
        L_0x0026:
            r0.close()
            java.io.File r4 = new java.io.File
            java.io.File r0 = r10.length
            java.lang.String r6 = "dso_deps"
            r4.<init>(r0, r6)
            r0 = 0
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile
            r6.<init>(r4, r1)
            long r8 = r6.length()     // Catch:{ all -> 0x00bd }
            int r1 = (int) r8     // Catch:{ all -> 0x00bd }
            byte[] r8 = new byte[r1]     // Catch:{ all -> 0x00bd }
            int r9 = r6.read(r8)     // Catch:{ all -> 0x00bd }
            if (r9 == r1) goto L_0x0046
            r3 = 0
        L_0x0046:
            boolean r1 = java.util.Arrays.equals(r8, r13)     // Catch:{ all -> 0x00bd }
            if (r1 != 0) goto L_0x004d
            r3 = 0
        L_0x004d:
            if (r3 == 0) goto L_0x0056
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r8 = r0
            goto L_0x006f
        L_0x0056:
            getMax(r5, r2)     // Catch:{ all -> 0x00bd }
            o.tryCaptureView$setMax r0 = r10.getMin()     // Catch:{ all -> 0x00bd }
            o.tryCaptureView$length r1 = r0.setMax()     // Catch:{ all -> 0x00b1 }
            o.tryCaptureView$getMax r8 = r0.getMax()     // Catch:{ all -> 0x00b1 }
            r10.setMax(r3, r1, r8)     // Catch:{ all -> 0x00a5 }
            r8.close()     // Catch:{ all -> 0x00b1 }
            r0.close()     // Catch:{ all -> 0x00bd }
            r8 = r1
        L_0x006f:
            r6.close()
            if (r8 != 0) goto L_0x0075
            return r2
        L_0x0075:
            o.tryCaptureView$2 r9 = new o.tryCaptureView$2
            r0 = r9
            r1 = r10
            r2 = r4
            r3 = r13
            r4 = r8
            r6 = r11
            r0.<init>(r2, r3, r4, r5, r6)
            r11 = r12 & 1
            if (r11 == 0) goto L_0x00a1
            java.lang.Thread r11 = new java.lang.Thread
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "SoSync:"
            r12.<init>(r13)
            java.io.File r13 = r10.length
            java.lang.String r13 = r13.getName()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r9, r12)
            r11.start()
            goto L_0x00a4
        L_0x00a1:
            r9.run()
        L_0x00a4:
            return r7
        L_0x00a5:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r12 = move-exception
            r8.close()     // Catch:{ all -> 0x00ac }
            goto L_0x00b0
        L_0x00ac:
            r13 = move-exception
            r11.addSuppressed(r13)     // Catch:{ all -> 0x00b1 }
        L_0x00b0:
            throw r12     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r12 = move-exception
            r0.close()     // Catch:{ all -> 0x00b8 }
            goto L_0x00bc
        L_0x00b8:
            r13 = move-exception
            r11.addSuppressed(r13)     // Catch:{ all -> 0x00bd }
        L_0x00bc:
            throw r12     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r12 = move-exception
            r6.close()     // Catch:{ all -> 0x00c4 }
            goto L_0x00c8
        L_0x00c4:
            r13 = move-exception
            r11.addSuppressed(r13)
        L_0x00c8:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryCaptureView.setMin(o.getOrderedChildIndex, int, byte[]):boolean");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] setMax() throws java.io.IOException {
        /*
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            o.tryCaptureView$setMax r1 = r5.getMin()
            o.tryCaptureView$length r2 = r1.setMax()     // Catch:{ all -> 0x0036 }
            o.tryCaptureView$getMin[] r2 = r2.getMin     // Catch:{ all -> 0x0036 }
            r3 = 1
            r0.writeByte(r3)     // Catch:{ all -> 0x0036 }
            int r3 = r2.length     // Catch:{ all -> 0x0036 }
            r0.writeInt(r3)     // Catch:{ all -> 0x0036 }
            r3 = 0
        L_0x0017:
            int r4 = r2.length     // Catch:{ all -> 0x0036 }
            if (r3 >= r4) goto L_0x002b
            r4 = r2[r3]     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.setMax     // Catch:{ all -> 0x0036 }
            r0.writeString(r4)     // Catch:{ all -> 0x0036 }
            r4 = r2[r3]     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.getMax     // Catch:{ all -> 0x0036 }
            r0.writeString(r4)     // Catch:{ all -> 0x0036 }
            int r3 = r3 + 1
            goto L_0x0017
        L_0x002b:
            r1.close()
            byte[] r1 = r0.marshall()
            r0.recycle()
            return r1
        L_0x0036:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r1 = move-exception
            r0.addSuppressed(r1)
        L_0x0041:
            goto L_0x0043
        L_0x0042:
            throw r2
        L_0x0043:
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryCaptureView.setMax():byte[]");
    }

    /* access modifiers changed from: protected */
    public final void getMax(int i) throws IOException {
        File file = this.length;
        if (file.mkdirs() || file.isDirectory()) {
            getOrderedChildIndex getorderedchildindex = new getOrderedChildIndex(new File(this.length, "dso_lock"));
            try {
                if (setMin(getorderedchildindex, i, setMax())) {
                    getorderedchildindex = null;
                }
                if (getorderedchildindex == null) {
                }
            } finally {
                getorderedchildindex.close();
            }
        } else {
            throw new IOException("cannot mkdir: ".concat(String.valueOf(file)));
        }
    }

    private Object setMax(String str) {
        Object obj;
        synchronized (this.getMin) {
            obj = this.getMin.get(str);
            if (obj == null) {
                obj = new Object();
                this.getMin.put(str, obj);
            }
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public final synchronized void length(String str) throws IOException {
        synchronized (setMax(str)) {
            this.IsOverlapping = str;
            getMax(2);
        }
    }

    public final int getMin(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        int length2;
        synchronized (setMax(str)) {
            length2 = length(str, i, this.length, threadPolicy);
        }
        return length2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected tryCaptureView(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.pm.ApplicationInfo r2 = r4.getApplicationInfo()
            java.lang.String r2 = r2.dataDir
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            r5 = 1
            r3.<init>(r0, r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r3.getMin = r5
            r3.toIntRange = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryCaptureView.<init>(android.content.Context, java.lang.String):void");
    }
}
