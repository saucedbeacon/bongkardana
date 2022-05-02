package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

final class clearAll implements Closeable {
    private final File getMax;
    private final RandomAccessFile getMin;
    private final FileChannel length;
    private final File setMax;
    private final long setMin;
    private final FileLock toFloatRange;

    static class length extends File {
        public long crc = -1;

        public length(File file, String str) {
            super(file, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        r5 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004b */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c A[ExcHandler: Error | RuntimeException (e java.lang.Throwable), Splitter:B:4:0x002c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    clearAll(java.io.File r5, java.io.File r6) throws java.io.IOException {
        /*
            r4 = this;
            r4.<init>()
            r5.getPath()
            r6.getPath()
            r4.getMax = r5
            r4.setMax = r6
            long r0 = o.clear.getMax(r5)
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x001a
            r2 = 1
            long r0 = r0 - r2
        L_0x001a:
            r4.setMin = r0
            java.io.File r5 = new java.io.File
            java.lang.String r0 = "MultiDex.lock"
            r5.<init>(r6, r0)
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile
            java.lang.String r0 = "rw"
            r6.<init>(r5, r0)
            r4.getMin = r6
            java.nio.channels.FileChannel r6 = r6.getChannel()     // Catch:{ IOException -> 0x0050, RuntimeException -> 0x004e, Error -> 0x004c }
            r4.length = r6     // Catch:{ IOException -> 0x0050, RuntimeException -> 0x004e, Error -> 0x004c }
            r5.getPath()     // Catch:{ IOException -> 0x0045, RuntimeException -> 0x0043, Error -> 0x0041 }
            java.nio.channels.FileChannel r6 = r4.length     // Catch:{ IOException -> 0x0045, RuntimeException -> 0x0043, Error -> 0x0041 }
            java.nio.channels.FileLock r6 = r6.lock()     // Catch:{ IOException -> 0x0045, RuntimeException -> 0x0043, Error -> 0x0041 }
            r4.toFloatRange = r6     // Catch:{ IOException -> 0x0045, RuntimeException -> 0x0043, Error -> 0x0041 }
            r5.getPath()     // Catch:{ IOException -> 0x0050, RuntimeException -> 0x004e, Error -> 0x004c }
            return
        L_0x0041:
            r5 = move-exception
            goto L_0x0046
        L_0x0043:
            r5 = move-exception
            goto L_0x0046
        L_0x0045:
            r5 = move-exception
        L_0x0046:
            java.nio.channels.FileChannel r6 = r4.length     // Catch:{ IOException -> 0x0050, RuntimeException -> 0x004e, Error -> 0x004c }
            r6.close()     // Catch:{ IOException -> 0x004b, RuntimeException -> 0x004e, Error -> 0x004c }
        L_0x004b:
            throw r5     // Catch:{ IOException -> 0x0050, RuntimeException -> 0x004e, Error -> 0x004c }
        L_0x004c:
            r5 = move-exception
            goto L_0x0051
        L_0x004e:
            r5 = move-exception
            goto L_0x0051
        L_0x0050:
            r5 = move-exception
        L_0x0051:
            java.io.RandomAccessFile r6 = r4.getMin
            r6.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.clearAll.<init>(java.io.File, java.io.File):void");
    }

    /* access modifiers changed from: package-private */
    public final List<? extends File> getMin(Context context, String str, boolean z) throws IOException {
        List<length> list;
        List<length> list2;
        this.getMax.getPath();
        if (this.toFloatRange.isValid()) {
            if (!z) {
                if (!setMax(context, this.getMax, this.setMin, str)) {
                    try {
                        list = getMax(context, str);
                    } catch (IOException unused) {
                        list2 = setMin();
                        long lastModified = this.getMax.lastModified();
                        if (lastModified == -1) {
                            lastModified--;
                        }
                        setMin(context, str, lastModified, this.setMin, list2);
                    }
                    list.size();
                    return list;
                }
            } else {
                Context context2 = context;
                String str2 = str;
            }
            list2 = setMin();
            long lastModified2 = this.getMax.lastModified();
            if (lastModified2 == -1) {
                lastModified2--;
            }
            setMin(context, str, lastModified2, this.setMin, list2);
            list = list2;
            list.size();
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public final void close() throws IOException {
        this.toFloatRange.release();
        this.length.close();
        this.getMin.close();
    }

    private List<length> getMax(Context context, String str) throws IOException {
        String str2 = str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.getMax.getName());
        sb.append(".classes");
        String obj = sb.toString();
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("dex.number");
        int i = sharedPreferences.getInt(sb2.toString(), 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(i2);
            sb3.append(".zip");
            length length2 = new length(this.setMax, sb3.toString());
            if (length2.isFile()) {
                long max = clear.getMax(length2);
                if (max == -1) {
                    max--;
                }
                length2.crc = max;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append("dex.crc.");
                sb4.append(i2);
                long j = sharedPreferences.getLong(sb4.toString(), -1);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append("dex.time.");
                sb5.append(i2);
                long j2 = sharedPreferences.getLong(sb5.toString(), -1);
                long lastModified = length2.lastModified();
                if (j2 == lastModified) {
                    String str3 = obj;
                    SharedPreferences sharedPreferences2 = sharedPreferences;
                    if (j == length2.crc) {
                        arrayList.add(length2);
                        i2++;
                        sharedPreferences = sharedPreferences2;
                        obj = str3;
                    }
                }
                StringBuilder sb6 = new StringBuilder("Invalid extracted dex: ");
                sb6.append(length2);
                sb6.append(" (key \"");
                sb6.append(str2);
                sb6.append("\"), expected modification time: ");
                sb6.append(j2);
                sb6.append(", modification time: ");
                sb6.append(lastModified);
                sb6.append(", expected crc: ");
                sb6.append(j);
                sb6.append(", file crc: ");
                sb6.append(length2.crc);
                throw new IOException(sb6.toString());
            }
            StringBuilder sb7 = new StringBuilder("Missing extracted secondary dex file '");
            sb7.append(length2.getPath());
            sb7.append("'");
            throw new IOException(sb7.toString());
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r6.getAbsolutePath();
        r8 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<o.clearAll.length> setMin() throws java.io.IOException {
        /*
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r13.getMax
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ".classes"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.getMin()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile
            java.io.File r3 = r13.getMax
            r2.<init>(r3)
            r3 = 2
            java.lang.String r4 = "classes2.dex"
            java.util.zip.ZipEntry r4 = r2.getEntry(r4)     // Catch:{ all -> 0x00c9 }
        L_0x002d:
            if (r4 == 0) goto L_0x00c5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r5.<init>()     // Catch:{ all -> 0x00c9 }
            r5.append(r0)     // Catch:{ all -> 0x00c9 }
            r5.append(r3)     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = ".zip"
            r5.append(r6)     // Catch:{ all -> 0x00c9 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00c9 }
            o.clearAll$length r6 = new o.clearAll$length     // Catch:{ all -> 0x00c9 }
            java.io.File r7 = r13.setMax     // Catch:{ all -> 0x00c9 }
            r6.<init>(r7, r5)     // Catch:{ all -> 0x00c9 }
            r1.add(r6)     // Catch:{ all -> 0x00c9 }
            r5 = 0
            r7 = 0
            r8 = 0
        L_0x0050:
            r9 = 3
            if (r7 >= r9) goto L_0x0084
            if (r8 != 0) goto L_0x0084
            int r7 = r7 + 1
            getMin(r2, r4, r6, r0)     // Catch:{ all -> 0x00c9 }
            long r8 = o.clear.getMax(r6)     // Catch:{ IOException -> 0x006b }
            r10 = -1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0067
            r10 = 1
            long r8 = r8 - r10
        L_0x0067:
            r6.crc = r8     // Catch:{ IOException -> 0x006b }
            r8 = 1
            goto L_0x006f
        L_0x006b:
            r6.getAbsolutePath()     // Catch:{ all -> 0x00c9 }
            r8 = 0
        L_0x006f:
            r6.getAbsolutePath()     // Catch:{ all -> 0x00c9 }
            r6.length()     // Catch:{ all -> 0x00c9 }
            if (r8 != 0) goto L_0x0050
            r6.delete()     // Catch:{ all -> 0x00c9 }
            boolean r9 = r6.exists()     // Catch:{ all -> 0x00c9 }
            if (r9 == 0) goto L_0x0050
            r6.getPath()     // Catch:{ all -> 0x00c9 }
            goto L_0x0050
        L_0x0084:
            if (r8 == 0) goto L_0x00a0
            int r3 = r3 + 1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            java.lang.String r5 = "classes"
            r4.<init>(r5)     // Catch:{ all -> 0x00c9 }
            r4.append(r3)     // Catch:{ all -> 0x00c9 }
            java.lang.String r5 = ".dex"
            r4.append(r5)     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00c9 }
            java.util.zip.ZipEntry r4 = r2.getEntry(r4)     // Catch:{ all -> 0x00c9 }
            goto L_0x002d
        L_0x00a0:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00c9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = "Could not create zip file "
            r1.<init>(r4)     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = r6.getAbsolutePath()     // Catch:{ all -> 0x00c9 }
            r1.append(r4)     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = " for secondary dex ("
            r1.append(r4)     // Catch:{ all -> 0x00c9 }
            r1.append(r3)     // Catch:{ all -> 0x00c9 }
            java.lang.String r3 = ")"
            r1.append(r3)     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c9 }
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c5:
            r2.close()     // Catch:{ IOException -> 0x00c8 }
        L_0x00c8:
            return r1
        L_0x00c9:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            goto L_0x00cf
        L_0x00ce:
            throw r0
        L_0x00cf:
            goto L_0x00ce
        */
        throw new UnsupportedOperationException("Method not decompiled: o.clearAll.setMin():java.util.List");
    }

    private void getMin() {
        File[] listFiles = this.setMax.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return !file.getName().equals("MultiDex.lock");
            }
        });
        if (listFiles == null) {
            this.setMax.getPath();
            return;
        }
        for (File file : listFiles) {
            file.getPath();
            file.length();
            if (!file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    private static void getMin(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-".concat(String.valueOf(str)), ".zip", file.getParentFile());
        createTempFile.getPath();
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                file.getPath();
                if (createTempFile.renameTo(file)) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    createTempFile.delete();
                    return;
                }
                StringBuilder sb = new StringBuilder("Failed to rename \"");
                sb.append(createTempFile.getAbsolutePath());
                sb.append("\" to \"");
                sb.append(file.getAbsolutePath());
                sb.append("\"");
                throw new IOException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder("Failed to mark readonly \"");
            sb2.append(createTempFile.getAbsolutePath());
            sb2.append("\" (tmp of \"");
            sb2.append(file.getAbsolutePath());
            sb2.append("\")");
            throw new IOException(sb2.toString());
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            createTempFile.delete();
            throw th;
        }
    }

    private static boolean setMax(Context context, File file, long j, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP);
        long j2 = sharedPreferences.getLong(sb.toString(), -1);
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            lastModified--;
        }
        if (j2 != lastModified) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("crc");
        if (sharedPreferences.getLong(sb2.toString(), -1) != j) {
            return true;
        }
        return false;
    }

    private static void setMin(Context context, String str, long j, long j2, List<length> list) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4).edit();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP);
        edit.putLong(sb.toString(), j);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("crc");
        edit.putLong(sb2.toString(), j2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("dex.number");
        edit.putInt(sb3.toString(), list.size() + 1);
        int i = 2;
        for (length next : list) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("dex.crc.");
            sb4.append(i);
            edit.putLong(sb4.toString(), next.crc);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("dex.time.");
            sb5.append(i);
            edit.putLong(sb5.toString(), next.lastModified());
            i++;
        }
        edit.commit();
    }
}
