package o;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class setHorizontalAlign implements Closeable {
    private long FastBitmap$CoordinateSystem = 0;
    private final File IsOverlapping;
    private long equals;
    final File getMax;
    Writer getMin;
    private final LinkedHashMap<String, setMax> hashCode = new LinkedHashMap<>(0, 0.75f, true);
    private final File isInside;
    int length;
    final ThreadPoolExecutor setMax = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new getMin((byte) 0));
    final int setMin;
    private final Callable<Void> toDoubleRange = new Callable<Void>() {
        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
            return null;
         */
        /* renamed from: getMax */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                o.setHorizontalAlign r0 = o.setHorizontalAlign.this
                monitor-enter(r0)
                o.setHorizontalAlign r1 = o.setHorizontalAlign.this     // Catch:{ all -> 0x0025 }
                java.io.Writer r1 = r1.getMin     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000c
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000c:
                o.setHorizontalAlign r1 = o.setHorizontalAlign.this     // Catch:{ all -> 0x0025 }
                r1.getMax()     // Catch:{ all -> 0x0025 }
                o.setHorizontalAlign r1 = o.setHorizontalAlign.this     // Catch:{ all -> 0x0025 }
                boolean r1 = r1.setMin()     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0023
                o.setHorizontalAlign r1 = o.setHorizontalAlign.this     // Catch:{ all -> 0x0025 }
                r1.length()     // Catch:{ all -> 0x0025 }
                o.setHorizontalAlign r1 = o.setHorizontalAlign.this     // Catch:{ all -> 0x0025 }
                r3 = 0
                r1.length = r3     // Catch:{ all -> 0x0025 }
            L_0x0023:
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setHorizontalAlign.AnonymousClass4.call():java.lang.Void");
        }
    };
    private final int toFloatRange;
    private final File toIntRange;
    private long toString = 0;

    private setHorizontalAlign(File file, long j) {
        File file2 = file;
        this.getMax = file2;
        this.toFloatRange = 1;
        this.isInside = new File(file2, "journal");
        this.IsOverlapping = new File(file2, "journal.tmp");
        this.toIntRange = new File(file2, "journal.bkp");
        this.setMin = 1;
        this.equals = j;
    }

    public static setHorizontalAlign getMin(File file, long j) throws IOException {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            setHorizontalAlign sethorizontalalign = new setHorizontalAlign(file, j);
            if (sethorizontalalign.isInside.exists()) {
                try {
                    sethorizontalalign.getMin();
                    sethorizontalalign.setMax();
                    return sethorizontalalign;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    sethorizontalalign.close();
                    updatePreDraw.setMax(sethorizontalalign.getMax);
                }
            }
            file.mkdirs();
            setHorizontalAlign sethorizontalalign2 = new setHorizontalAlign(file, j);
            sethorizontalalign2.length();
            return sethorizontalalign2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:51|52|(1:54)(1:55)|56|57) */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r11.length = r2 - r11.hashCode.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010c, code lost:
        if (r1.setMin() != false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010e, code lost:
        length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0112, code lost:
        r11.getMin = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r11.isInside, true), o.updatePreDraw.getMax));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00ff */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:58:0x012c=Splitter:B:58:0x012c, B:51:0x00ff=Splitter:B:51:0x00ff} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getMin() throws java.io.IOException {
        /*
            r11 = this;
            java.lang.String r0 = ", "
            o.setVerticalAlign r1 = new o.setVerticalAlign
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r11.isInside
            r2.<init>(r3)
            java.nio.charset.Charset r3 = o.updatePreDraw.getMax
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.getMin()     // Catch:{ all -> 0x0158 }
            java.lang.String r3 = r1.getMin()     // Catch:{ all -> 0x0158 }
            java.lang.String r4 = r1.getMin()     // Catch:{ all -> 0x0158 }
            java.lang.String r5 = r1.getMin()     // Catch:{ all -> 0x0158 }
            java.lang.String r6 = r1.getMin()     // Catch:{ all -> 0x0158 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x0158 }
            if (r7 == 0) goto L_0x012c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x0158 }
            if (r7 == 0) goto L_0x012c
            int r7 = r11.toFloatRange     // Catch:{ all -> 0x0158 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0158 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x0158 }
            if (r4 == 0) goto L_0x012c
            int r4 = r11.setMin     // Catch:{ all -> 0x0158 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0158 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0158 }
            if (r4 == 0) goto L_0x012c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0158 }
            if (r4 == 0) goto L_0x012c
            r0 = 0
            r2 = 0
        L_0x0056:
            java.lang.String r3 = r1.getMin()     // Catch:{ EOFException -> 0x00ff }
            r4 = 32
            int r5 = r3.indexOf(r4)     // Catch:{ EOFException -> 0x00ff }
            java.lang.String r6 = "unexpected journal line: "
            r7 = -1
            if (r5 == r7) goto L_0x00f1
            int r8 = r5 + 1
            int r4 = r3.indexOf(r4, r8)     // Catch:{ EOFException -> 0x00ff }
            if (r4 != r7) goto L_0x0083
            java.lang.String r8 = r3.substring(r8)     // Catch:{ EOFException -> 0x00ff }
            r9 = 6
            if (r5 != r9) goto L_0x0087
            java.lang.String r9 = "REMOVE"
            boolean r9 = r3.startsWith(r9)     // Catch:{ EOFException -> 0x00ff }
            if (r9 == 0) goto L_0x0087
            java.util.LinkedHashMap<java.lang.String, o.setHorizontalAlign$setMax> r3 = r11.hashCode     // Catch:{ EOFException -> 0x00ff }
            r3.remove(r8)     // Catch:{ EOFException -> 0x00ff }
            goto L_0x00df
        L_0x0083:
            java.lang.String r8 = r3.substring(r8, r4)     // Catch:{ EOFException -> 0x00ff }
        L_0x0087:
            java.util.LinkedHashMap<java.lang.String, o.setHorizontalAlign$setMax> r9 = r11.hashCode     // Catch:{ EOFException -> 0x00ff }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ EOFException -> 0x00ff }
            o.setHorizontalAlign$setMax r9 = (o.setHorizontalAlign.setMax) r9     // Catch:{ EOFException -> 0x00ff }
            if (r9 != 0) goto L_0x009b
            o.setHorizontalAlign$setMax r9 = new o.setHorizontalAlign$setMax     // Catch:{ EOFException -> 0x00ff }
            r9.<init>(r11, r8, r0)     // Catch:{ EOFException -> 0x00ff }
            java.util.LinkedHashMap<java.lang.String, o.setHorizontalAlign$setMax> r10 = r11.hashCode     // Catch:{ EOFException -> 0x00ff }
            r10.put(r8, r9)     // Catch:{ EOFException -> 0x00ff }
        L_0x009b:
            r8 = 5
            if (r4 == r7) goto L_0x00be
            if (r5 != r8) goto L_0x00be
            java.lang.String r10 = "CLEAN"
            boolean r10 = r3.startsWith(r10)     // Catch:{ EOFException -> 0x00ff }
            if (r10 == 0) goto L_0x00be
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ EOFException -> 0x00ff }
            java.lang.String r4 = " "
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ EOFException -> 0x00ff }
            boolean unused = r9.toIntRange = true     // Catch:{ EOFException -> 0x00ff }
            r4 = 0
            r9.setMin = r4     // Catch:{ EOFException -> 0x00ff }
            r9.setMax(r3)     // Catch:{ EOFException -> 0x00ff }
            goto L_0x00df
        L_0x00be:
            if (r4 != r7) goto L_0x00d2
            if (r5 != r8) goto L_0x00d2
            java.lang.String r8 = "DIRTY"
            boolean r8 = r3.startsWith(r8)     // Catch:{ EOFException -> 0x00ff }
            if (r8 == 0) goto L_0x00d2
            o.setHorizontalAlign$getMax r3 = new o.setHorizontalAlign$getMax     // Catch:{ EOFException -> 0x00ff }
            r3.<init>(r11, r9, r0)     // Catch:{ EOFException -> 0x00ff }
            r9.setMin = r3     // Catch:{ EOFException -> 0x00ff }
            goto L_0x00df
        L_0x00d2:
            if (r4 != r7) goto L_0x00e3
            r4 = 4
            if (r5 != r4) goto L_0x00e3
            java.lang.String r4 = "READ"
            boolean r4 = r3.startsWith(r4)     // Catch:{ EOFException -> 0x00ff }
            if (r4 == 0) goto L_0x00e3
        L_0x00df:
            int r2 = r2 + 1
            goto L_0x0056
        L_0x00e3:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ EOFException -> 0x00ff }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ EOFException -> 0x00ff }
            java.lang.String r3 = r6.concat(r3)     // Catch:{ EOFException -> 0x00ff }
            r0.<init>(r3)     // Catch:{ EOFException -> 0x00ff }
            throw r0     // Catch:{ EOFException -> 0x00ff }
        L_0x00f1:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ EOFException -> 0x00ff }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ EOFException -> 0x00ff }
            java.lang.String r3 = r6.concat(r3)     // Catch:{ EOFException -> 0x00ff }
            r0.<init>(r3)     // Catch:{ EOFException -> 0x00ff }
            throw r0     // Catch:{ EOFException -> 0x00ff }
        L_0x00ff:
            java.util.LinkedHashMap<java.lang.String, o.setHorizontalAlign$setMax> r0 = r11.hashCode     // Catch:{ all -> 0x0158 }
            int r0 = r0.size()     // Catch:{ all -> 0x0158 }
            int r2 = r2 - r0
            r11.length = r2     // Catch:{ all -> 0x0158 }
            boolean r0 = r1.setMin()     // Catch:{ all -> 0x0158 }
            if (r0 == 0) goto L_0x0112
            r11.length()     // Catch:{ all -> 0x0158 }
            goto L_0x0128
        L_0x0112:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0158 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0158 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0158 }
            java.io.File r4 = r11.isInside     // Catch:{ all -> 0x0158 }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0158 }
            java.nio.charset.Charset r4 = o.updatePreDraw.getMax     // Catch:{ all -> 0x0158 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0158 }
            r0.<init>(r2)     // Catch:{ all -> 0x0158 }
            r11.getMin = r0     // Catch:{ all -> 0x0158 }
        L_0x0128:
            o.updatePreDraw.length(r1)
            return
        L_0x012c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0158 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0158 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.<init>(r8)     // Catch:{ all -> 0x0158 }
            r7.append(r2)     // Catch:{ all -> 0x0158 }
            r7.append(r0)     // Catch:{ all -> 0x0158 }
            r7.append(r3)     // Catch:{ all -> 0x0158 }
            r7.append(r0)     // Catch:{ all -> 0x0158 }
            r7.append(r5)     // Catch:{ all -> 0x0158 }
            r7.append(r0)     // Catch:{ all -> 0x0158 }
            r7.append(r6)     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0158 }
            r4.<init>(r0)     // Catch:{ all -> 0x0158 }
            throw r4     // Catch:{ all -> 0x0158 }
        L_0x0158:
            r0 = move-exception
            o.updatePreDraw.length(r1)
            goto L_0x015e
        L_0x015d:
            throw r0
        L_0x015e:
            goto L_0x015d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHorizontalAlign.getMin():void");
    }

    private void setMax() throws IOException {
        File file = this.IsOverlapping;
        if (!file.exists() || file.delete()) {
            Iterator<setMax> it = this.hashCode.values().iterator();
            while (it.hasNext()) {
                setMax next = it.next();
                int i = 0;
                if (next.setMin == null) {
                    while (i < this.setMin) {
                        this.FastBitmap$CoordinateSystem += next.setMax[i];
                        i++;
                    }
                } else {
                    next.setMin = null;
                    while (i < this.setMin) {
                        File file2 = next.length[i];
                        if (!file2.exists() || file2.delete()) {
                            File file3 = next.getMin[i];
                            if (!file3.exists() || file3.delete()) {
                                i++;
                            } else {
                                throw new IOException();
                            }
                        } else {
                            throw new IOException();
                        }
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IOException();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final synchronized void length() throws IOException {
        if (this.getMin != null) {
            getMin(this.getMin);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.IsOverlapping), updatePreDraw.getMax));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.toFloatRange));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.setMin));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (setMax next : this.hashCode.values()) {
                if (next.setMin != null) {
                    StringBuilder sb = new StringBuilder("DIRTY ");
                    sb.append(next.getMax);
                    sb.append(10);
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder("CLEAN ");
                    sb2.append(next.getMax);
                    sb2.append(next.getMin());
                    sb2.append(10);
                    bufferedWriter.write(sb2.toString());
                }
            }
            getMin((Writer) bufferedWriter);
            if (this.isInside.exists()) {
                File file = this.isInside;
                File file2 = this.toIntRange;
                if (file2.exists()) {
                    if (!file2.delete()) {
                        throw new IOException();
                    }
                }
                if (!file.renameTo(file2)) {
                    throw new IOException();
                }
            }
            if (this.IsOverlapping.renameTo(this.isInside)) {
                this.toIntRange.delete();
                this.getMin = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.isInside, true), updatePreDraw.getMax));
            } else {
                throw new IOException();
            }
        } catch (Throwable th) {
            getMin((Writer) bufferedWriter);
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public boolean setMin() {
        int i = this.length;
        return i >= 2000 && i >= this.hashCode.size();
    }

    public final synchronized void close() throws IOException {
        if (this.getMin != null) {
            Iterator it = new ArrayList(this.hashCode.values()).iterator();
            while (it.hasNext()) {
                setMax setmax = (setMax) it.next();
                if (setmax.setMin != null) {
                    getMax getmax = setmax.setMin;
                    setHorizontalAlign.this.setMax(getmax, false);
                }
            }
            getMax();
            getMin(this.getMin);
            this.getMin = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMax() throws IOException {
        while (this.FastBitmap$CoordinateSystem > this.equals) {
            getMin((String) this.hashCode.entrySet().iterator().next().getKey());
        }
    }

    @TargetApi(26)
    private static void getMin(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @TargetApi(26)
    private static void setMin(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final class setMin {
        public final File[] getMax;
        private final long[] getMin;
        private final long length;
        private final String setMin;

        /* synthetic */ setMin(setHorizontalAlign sethorizontalalign, String str, long j, File[] fileArr, long[] jArr, byte b) {
            this(str, j, fileArr, jArr);
        }

        private setMin(String str, long j, File[] fileArr, long[] jArr) {
            this.setMin = str;
            this.length = j;
            this.getMax = fileArr;
            this.getMin = jArr;
        }
    }

    public final class getMax {
        final setMax getMax;
        /* access modifiers changed from: private */
        public final boolean[] getMin;
        public boolean length;

        /* synthetic */ getMax(setHorizontalAlign sethorizontalalign, setMax setmax, byte b) {
            this(setmax);
        }

        private getMax(setMax setmax) {
            boolean[] zArr;
            this.getMax = setmax;
            if (setmax.toIntRange) {
                zArr = null;
            } else {
                zArr = new boolean[setHorizontalAlign.this.setMin];
            }
            this.getMin = zArr;
        }

        public final File setMin() throws IOException {
            File file;
            synchronized (setHorizontalAlign.this) {
                if (this.getMax.setMin == this) {
                    if (!this.getMax.toIntRange) {
                        this.getMin[0] = true;
                    }
                    file = this.getMax.getMin[0];
                    if (!setHorizontalAlign.this.getMax.exists()) {
                        setHorizontalAlign.this.getMax.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    final class setMax {
        final String getMax;
        File[] getMin;
        long isInside;
        File[] length;
        final long[] setMax;
        getMax setMin;
        /* access modifiers changed from: private */
        public boolean toIntRange;

        /* synthetic */ setMax(setHorizontalAlign sethorizontalalign, String str, byte b) {
            this(str);
        }

        private setMax(String str) {
            this.getMax = str;
            this.setMax = new long[setHorizontalAlign.this.setMin];
            this.length = new File[setHorizontalAlign.this.setMin];
            this.getMin = new File[setHorizontalAlign.this.setMin];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length2 = sb.length();
            for (int i = 0; i < setHorizontalAlign.this.setMin; i++) {
                sb.append(i);
                this.length[i] = new File(setHorizontalAlign.this.getMax, sb.toString());
                sb.append(".tmp");
                this.getMin[i] = new File(setHorizontalAlign.this.getMax, sb.toString());
                sb.setLength(length2);
            }
        }

        public final String getMin() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.setMax) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public final void setMax(String[] strArr) throws IOException {
            if (strArr.length == setHorizontalAlign.this.setMin) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.setMax[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        StringBuilder sb = new StringBuilder("unexpected journal line: ");
                        sb.append(Arrays.toString(strArr));
                        throw new IOException(sb.toString());
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder("unexpected journal line: ");
            sb2.append(Arrays.toString(strArr));
            throw new IOException(sb2.toString());
        }
    }

    static final class getMin implements ThreadFactory {
        private getMin() {
        }

        /* synthetic */ getMin(byte b) {
            this();
        }

        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final synchronized setMin setMin(String str) throws IOException {
        if (this.getMin != null) {
            setMax setmax = this.hashCode.get(str);
            if (setmax == null) {
                return null;
            }
            if (!setmax.toIntRange) {
                return null;
            }
            for (File exists : setmax.length) {
                if (!exists.exists()) {
                    return null;
                }
            }
            this.length++;
            this.getMin.append("READ");
            this.getMin.append(' ');
            this.getMin.append(str);
            this.getMin.append(10);
            if (setMin()) {
                this.setMax.submit(this.toDoubleRange);
            }
            return new setMin(this, str, setmax.isInside, setmax.length, setmax.setMax, (byte) 0);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized getMax getMax(String str) throws IOException {
        if (this.getMin != null) {
            setMax setmax = this.hashCode.get(str);
            if (setmax == null) {
                setmax = new setMax(this, str, (byte) 0);
                this.hashCode.put(str, setmax);
            } else if (setmax.setMin != null) {
                return null;
            }
            getMax getmax = new getMax(this, setmax, (byte) 0);
            setmax.setMin = getmax;
            this.getMin.append("DIRTY");
            this.getMin.append(' ');
            this.getMin.append(str);
            this.getMin.append(10);
            setMin(this.getMin);
            return getmax;
        }
        throw new IllegalStateException("cache is closed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0104, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void setMax(o.setHorizontalAlign.getMax r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            o.setHorizontalAlign$setMax r0 = r10.getMax     // Catch:{ all -> 0x010b }
            o.setHorizontalAlign$getMax r1 = r0.setMin     // Catch:{ all -> 0x010b }
            if (r1 != r10) goto L_0x0105
            r1 = 0
            if (r11 == 0) goto L_0x0046
            boolean r2 = r0.toIntRange     // Catch:{ all -> 0x010b }
            if (r2 != 0) goto L_0x0046
            r2 = 0
        L_0x0011:
            int r3 = r9.setMin     // Catch:{ all -> 0x010b }
            if (r2 >= r3) goto L_0x0046
            boolean[] r3 = r10.getMin     // Catch:{ all -> 0x010b }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010b }
            if (r3 == 0) goto L_0x0031
            java.io.File[] r3 = r0.getMin     // Catch:{ all -> 0x010b }
            r3 = r3[r2]     // Catch:{ all -> 0x010b }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010b }
            if (r3 != 0) goto L_0x002e
            o.setHorizontalAlign r11 = o.setHorizontalAlign.this     // Catch:{ all -> 0x010b }
            r11.setMax(r10, r1)     // Catch:{ all -> 0x010b }
            monitor-exit(r9)
            return
        L_0x002e:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0031:
            o.setHorizontalAlign r11 = o.setHorizontalAlign.this     // Catch:{ all -> 0x010b }
            r11.setMax(r10, r1)     // Catch:{ all -> 0x010b }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010b }
            java.lang.String r11 = "Newly created entry didn't create value for index "
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x010b }
            java.lang.String r11 = r11.concat(r0)     // Catch:{ all -> 0x010b }
            r10.<init>(r11)     // Catch:{ all -> 0x010b }
            throw r10     // Catch:{ all -> 0x010b }
        L_0x0046:
            int r10 = r9.setMin     // Catch:{ all -> 0x010b }
            if (r1 >= r10) goto L_0x0086
            java.io.File[] r10 = r0.getMin     // Catch:{ all -> 0x010b }
            r10 = r10[r1]     // Catch:{ all -> 0x010b }
            if (r11 == 0) goto L_0x0070
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010b }
            if (r2 == 0) goto L_0x0083
            java.io.File[] r2 = r0.length     // Catch:{ all -> 0x010b }
            r2 = r2[r1]     // Catch:{ all -> 0x010b }
            r10.renameTo(r2)     // Catch:{ all -> 0x010b }
            long[] r10 = r0.setMax     // Catch:{ all -> 0x010b }
            r3 = r10[r1]     // Catch:{ all -> 0x010b }
            long r5 = r2.length()     // Catch:{ all -> 0x010b }
            long[] r10 = r0.setMax     // Catch:{ all -> 0x010b }
            r10[r1] = r5     // Catch:{ all -> 0x010b }
            long r7 = r9.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x010b }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.FastBitmap$CoordinateSystem = r7     // Catch:{ all -> 0x010b }
            goto L_0x0083
        L_0x0070:
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010b }
            if (r2 == 0) goto L_0x0083
            boolean r10 = r10.delete()     // Catch:{ all -> 0x010b }
            if (r10 == 0) goto L_0x007d
            goto L_0x0083
        L_0x007d:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x010b }
            r10.<init>()     // Catch:{ all -> 0x010b }
            throw r10     // Catch:{ all -> 0x010b }
        L_0x0083:
            int r1 = r1 + 1
            goto L_0x0046
        L_0x0086:
            int r10 = r9.length     // Catch:{ all -> 0x010b }
            int r10 = r10 + 1
            r9.length = r10     // Catch:{ all -> 0x010b }
            r10 = 0
            r0.setMin = r10     // Catch:{ all -> 0x010b }
            boolean r10 = r0.toIntRange     // Catch:{ all -> 0x010b }
            r10 = r10 | r11
            r1 = 10
            r2 = 32
            if (r10 == 0) goto L_0x00ca
            boolean unused = r0.toIntRange = true     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.getMin     // Catch:{ all -> 0x010b }
            java.lang.String r3 = "CLEAN"
            r10.append(r3)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.getMin     // Catch:{ all -> 0x010b }
            r10.append(r2)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.getMin     // Catch:{ all -> 0x010b }
            java.lang.String r2 = r0.getMax     // Catch:{ all -> 0x010b }
            r10.append(r2)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.getMin     // Catch:{ all -> 0x010b }
            java.lang.String r2 = r0.getMin()     // Catch:{ all -> 0x010b }
            r10.append(r2)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.getMin     // Catch:{ all -> 0x010b }
            r10.append(r1)     // Catch:{ all -> 0x010b }
            if (r11 == 0) goto L_0x00e9
            long r10 = r9.toString     // Catch:{ all -> 0x010b }
            r1 = 1
            long r1 = r1 + r10
            r9.toString = r1     // Catch:{ all -> 0x010b }
            r0.isInside = r10     // Catch:{ all -> 0x010b }
            goto L_0x00e9
        L_0x00ca:
            java.util.LinkedHashMap<java.lang.String, o.setHorizontalAlign$setMax> r10 = r9.hashCode     // Catch:{ all -> 0x010b }
            java.lang.String r11 = r0.getMax     // Catch:{ all -> 0x010b }
            r10.remove(r11)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.getMin     // Catch:{ all -> 0x010b }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.getMin     // Catch:{ all -> 0x010b }
            r10.append(r2)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.getMin     // Catch:{ all -> 0x010b }
            java.lang.String r11 = r0.getMax     // Catch:{ all -> 0x010b }
            r10.append(r11)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.getMin     // Catch:{ all -> 0x010b }
            r10.append(r1)     // Catch:{ all -> 0x010b }
        L_0x00e9:
            java.io.Writer r10 = r9.getMin     // Catch:{ all -> 0x010b }
            setMin((java.io.Writer) r10)     // Catch:{ all -> 0x010b }
            long r10 = r9.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x010b }
            long r0 = r9.equals     // Catch:{ all -> 0x010b }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00fc
            boolean r10 = r9.setMin()     // Catch:{ all -> 0x010b }
            if (r10 == 0) goto L_0x0103
        L_0x00fc:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.setMax     // Catch:{ all -> 0x010b }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.toDoubleRange     // Catch:{ all -> 0x010b }
            r10.submit(r11)     // Catch:{ all -> 0x010b }
        L_0x0103:
            monitor-exit(r9)
            return
        L_0x0105:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010b }
            r10.<init>()     // Catch:{ all -> 0x010b }
            throw r10     // Catch:{ all -> 0x010b }
        L_0x010b:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x010f
        L_0x010e:
            throw r10
        L_0x010f:
            goto L_0x010e
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHorizontalAlign.setMax(o.setHorizontalAlign$getMax, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean getMin(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            java.io.Writer r0 = r7.getMin     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0082
            java.util.LinkedHashMap<java.lang.String, o.setHorizontalAlign$setMax> r0 = r7.hashCode     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008a }
            o.setHorizontalAlign$setMax r0 = (o.setHorizontalAlign.setMax) r0     // Catch:{ all -> 0x008a }
            r1 = 0
            if (r0 == 0) goto L_0x0080
            o.setHorizontalAlign$getMax r2 = r0.setMin     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x0015
            goto L_0x0080
        L_0x0015:
            int r2 = r7.setMin     // Catch:{ all -> 0x008a }
            if (r1 >= r2) goto L_0x004c
            java.io.File[] r2 = r0.length     // Catch:{ all -> 0x008a }
            r2 = r2[r1]     // Catch:{ all -> 0x008a }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x003a
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x002a
            goto L_0x003a
        L_0x002a:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008a }
            java.lang.String r0 = "failed to delete "
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x008a }
            r8.<init>(r0)     // Catch:{ all -> 0x008a }
            throw r8     // Catch:{ all -> 0x008a }
        L_0x003a:
            long r2 = r7.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x008a }
            long[] r4 = r0.setMax     // Catch:{ all -> 0x008a }
            r5 = r4[r1]     // Catch:{ all -> 0x008a }
            long r2 = r2 - r5
            r7.FastBitmap$CoordinateSystem = r2     // Catch:{ all -> 0x008a }
            long[] r2 = r0.setMax     // Catch:{ all -> 0x008a }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008a }
            int r1 = r1 + 1
            goto L_0x0015
        L_0x004c:
            int r0 = r7.length     // Catch:{ all -> 0x008a }
            r1 = 1
            int r0 = r0 + r1
            r7.length = r0     // Catch:{ all -> 0x008a }
            java.io.Writer r0 = r7.getMin     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.io.Writer r0 = r7.getMin     // Catch:{ all -> 0x008a }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.io.Writer r0 = r7.getMin     // Catch:{ all -> 0x008a }
            r0.append(r8)     // Catch:{ all -> 0x008a }
            java.io.Writer r0 = r7.getMin     // Catch:{ all -> 0x008a }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, o.setHorizontalAlign$setMax> r0 = r7.hashCode     // Catch:{ all -> 0x008a }
            r0.remove(r8)     // Catch:{ all -> 0x008a }
            boolean r8 = r7.setMin()     // Catch:{ all -> 0x008a }
            if (r8 == 0) goto L_0x007e
            java.util.concurrent.ThreadPoolExecutor r8 = r7.setMax     // Catch:{ all -> 0x008a }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.toDoubleRange     // Catch:{ all -> 0x008a }
            r8.submit(r0)     // Catch:{ all -> 0x008a }
        L_0x007e:
            monitor-exit(r7)
            return r1
        L_0x0080:
            monitor-exit(r7)
            return r1
        L_0x0082:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008a }
            java.lang.String r0 = "cache is closed"
            r8.<init>(r0)     // Catch:{ all -> 0x008a }
            throw r8     // Catch:{ all -> 0x008a }
        L_0x008a:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x008e
        L_0x008d:
            throw r8
        L_0x008e:
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHorizontalAlign.getMin(java.lang.String):boolean");
    }
}
