package o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

public class setTransitioning implements SupportSQLiteOpenHelper, setHeaderView {
    private static int FastBitmap$CoordinateSystem = 1;
    public static final int getMin = 46;
    public static final byte[] length = {123, -101, 41, 70, -5, -8, -6, 56, -62, -20, -9, -17, 68, -67, -5, -15, -12, 3, -21};
    private static int toDoubleRange;
    @Nullable
    private final Callable<InputStream> IsOverlapping;
    @Nullable
    private final File equals;
    @Nullable
    private final String getMax;
    private boolean isInside;
    @Nullable
    public setOverrideVisibleItems setMax;
    @NonNull
    private final Context setMin;
    @NonNull
    private final SupportSQLiteOpenHelper toFloatRange;
    private final int toIntRange;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length() {
        /*
            byte[] r0 = length
            r1 = 16
            byte[] r2 = new byte[r1]
            r3 = 0
            r4 = 114(0x72, float:1.6E-43)
            r5 = 4
            r6 = 0
            if (r0 != 0) goto L_0x0010
            r7 = 16
            goto L_0x001f
        L_0x0010:
            byte r7 = (byte) r4
            r2[r6] = r7
            int r6 = r6 + 1
            if (r6 != r1) goto L_0x001d
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r3)
            return r0
        L_0x001d:
            byte r7 = r0[r5]
        L_0x001f:
            int r7 = -r7
            int r4 = r4 + r7
            int r4 = r4 + -8
            int r5 = r5 + 1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTransitioning.length():java.lang.String");
    }

    setTransitioning(@NonNull Context context, @Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, int i, @NonNull SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        this.setMin = context;
        this.getMax = str;
        this.equals = file;
        this.IsOverlapping = callable;
        this.toIntRange = i;
        this.toFloatRange = supportSQLiteOpenHelper;
    }

    public String getDatabaseName() {
        return this.toFloatRange.getDatabaseName();
    }

    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.toFloatRange.setWriteAheadLoggingEnabled(z);
    }

    public synchronized SupportSQLiteDatabase getWritableDatabase() {
        if (!this.isInside) {
            setMin(true);
            this.isInside = true;
        }
        return this.toFloatRange.getWritableDatabase();
    }

    public synchronized SupportSQLiteDatabase getReadableDatabase() {
        if (!this.isInside) {
            setMin(false);
            this.isInside = true;
        }
        return this.toFloatRange.getReadableDatabase();
    }

    public synchronized void close() {
        this.toFloatRange.close();
        this.isInside = false;
    }

    @NonNull
    public final SupportSQLiteOpenHelper setMin() {
        return this.toFloatRange;
    }

    private void setMin(boolean z) {
        String databaseName = getDatabaseName();
        File databasePath = this.setMin.getDatabasePath(databaseName);
        setOverrideVisibleItems setoverridevisibleitems = this.setMax;
        ActionBarContextView actionBarContextView = new ActionBarContextView(databaseName, this.setMin.getFilesDir(), setoverridevisibleitems == null || setoverridevisibleitems.toDoubleRange);
        try {
            actionBarContextView.setMin();
            if (!databasePath.exists()) {
                getMax(databasePath, z);
                if (actionBarContextView.setMin != null) {
                    try {
                        actionBarContextView.setMin.close();
                    } catch (IOException unused) {
                    }
                }
                actionBarContextView.getMin.unlock();
            } else if (this.setMax == null) {
                if (actionBarContextView.setMin != null) {
                    try {
                        actionBarContextView.setMin.close();
                    } catch (IOException unused2) {
                    }
                }
                actionBarContextView.getMin.unlock();
            } else {
                try {
                    int length2 = setSubtitle.length(databasePath);
                    if (length2 == this.toIntRange) {
                        if (actionBarContextView.setMin != null) {
                            try {
                                actionBarContextView.setMin.close();
                            } catch (IOException unused3) {
                            }
                        }
                        actionBarContextView.getMin.unlock();
                    } else if (this.setMax.getMax(length2, this.toIntRange)) {
                        if (actionBarContextView.setMin != null) {
                            try {
                                actionBarContextView.setMin.close();
                            } catch (IOException unused4) {
                            }
                        }
                        actionBarContextView.getMin.unlock();
                    } else {
                        if (this.setMin.deleteDatabase(databaseName)) {
                            try {
                                getMax(databasePath, z);
                            } catch (IOException unused5) {
                            }
                        }
                        if (actionBarContextView.setMin != null) {
                            try {
                                actionBarContextView.setMin.close();
                            } catch (IOException unused6) {
                            }
                        }
                        actionBarContextView.getMin.unlock();
                    }
                } catch (IOException unused7) {
                    if (actionBarContextView.setMin != null) {
                        try {
                            actionBarContextView.setMin.close();
                        } catch (IOException unused8) {
                        }
                    }
                    actionBarContextView.getMin.unlock();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Unable to copy database file.", e);
        } catch (Throwable th) {
            if (actionBarContextView.setMin != null) {
                try {
                    actionBarContextView.setMin.close();
                } catch (IOException unused9) {
                }
            }
            actionBarContextView.getMin.unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if ((r9.getMax == null) != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0074, code lost:
        r1 = r9.setMin.getAssets();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r7 = new java.lang.Object[2];
        r7[1] = r9.getMax;
        r7[0] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        r0 = java.nio.channels.Channels.newChannel((java.io.InputStream) ((java.lang.Class) o.upFrom.setMax((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19, android.os.Process.myPid() >> 22, (char) (56348 - android.text.TextUtils.indexOf("", "")))).getMethod("getMin", new java.lang.Class[]{android.content.res.AssetManager.class, java.lang.String.class}).invoke(r3, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r9.getMax != null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0154, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0155, code lost:
        r11 = r10.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0159, code lost:
        if (r11 != null) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015b, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015c, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getMax(java.io.File r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ""
            int r1 = FastBitmap$CoordinateSystem
            int r1 = r1 + 125
            int r2 = r1 % 128
            toDoubleRange = r2
            r2 = 2
            int r1 = r1 % r2
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = r9.getMax
            r6 = 96
            int r6 = r6 / r5
            if (r1 == 0) goto L_0x0024
            goto L_0x0074
        L_0x0019:
            r10 = move-exception
            throw r10
        L_0x001b:
            java.lang.String r1 = r9.getMax
            if (r1 == 0) goto L_0x0021
            r1 = 0
            goto L_0x0022
        L_0x0021:
            r1 = 1
        L_0x0022:
            if (r1 == 0) goto L_0x0074
        L_0x0024:
            java.io.File r0 = r9.equals
            if (r0 == 0) goto L_0x0035
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r9.equals
            r0.<init>(r1)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            goto L_0x00b9
        L_0x0035:
            java.util.concurrent.Callable<java.io.InputStream> r0 = r9.IsOverlapping
            if (r0 == 0) goto L_0x006c
            int r0 = FastBitmap$CoordinateSystem
            int r0 = r0 + 85
            int r1 = r0 % 128
            toDoubleRange = r1
            int r0 = r0 % r2
            if (r0 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r4 = 0
        L_0x0046:
            if (r4 == 0) goto L_0x0056
            java.util.concurrent.Callable<java.io.InputStream> r0 = r9.IsOverlapping     // Catch:{ Exception -> 0x0063 }
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x0063 }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ Exception -> 0x0063 }
            super.hashCode()     // Catch:{ all -> 0x0054 }
            goto L_0x005e
        L_0x0054:
            r10 = move-exception
            throw r10
        L_0x0056:
            java.util.concurrent.Callable<java.io.InputStream> r0 = r9.IsOverlapping     // Catch:{ Exception -> 0x0063 }
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x0063 }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ Exception -> 0x0063 }
        L_0x005e:
            java.nio.channels.ReadableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
            goto L_0x00b9
        L_0x0063:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r0 = "inputStreamCallable exception on call"
            r11.<init>(r0, r10)
            throw r11
        L_0x006c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "copyFromAssetPath, copyFromFile and copyFromInputStream are all null!"
            r10.<init>(r11)
            throw r10
        L_0x0074:
            android.content.Context r1 = r9.setMin
            android.content.res.AssetManager r1 = r1.getAssets()
            java.lang.String r6 = r9.getMax
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0154 }
            r7[r4] = r6     // Catch:{ all -> 0x0154 }
            r7[r5] = r1     // Catch:{ all -> 0x0154 }
            int r1 = android.view.ViewConfiguration.getKeyRepeatTimeout()     // Catch:{ all -> 0x0154 }
            int r1 = r1 >> 16
            int r1 = r1 + 19
            int r6 = android.os.Process.myPid()     // Catch:{ all -> 0x0154 }
            int r6 = r6 >> 22
            r8 = 56348(0xdc1c, float:7.896E-41)
            int r0 = android.text.TextUtils.indexOf(r0, r0)     // Catch:{ all -> 0x0154 }
            int r8 = r8 - r0
            char r0 = (char) r8     // Catch:{ all -> 0x0154 }
            java.lang.Object r0 = o.upFrom.setMax(r1, r6, r0)     // Catch:{ all -> 0x0154 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x0154 }
            java.lang.String r1 = "getMin"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x0154 }
            java.lang.Class<android.content.res.AssetManager> r8 = android.content.res.AssetManager.class
            r6[r5] = r8     // Catch:{ all -> 0x0154 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6[r4] = r5     // Catch:{ all -> 0x0154 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r6)     // Catch:{ all -> 0x0154 }
            java.lang.Object r0 = r0.invoke(r3, r7)     // Catch:{ all -> 0x0154 }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ all -> 0x0154 }
            java.nio.channels.ReadableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
        L_0x00b9:
            java.lang.String r1 = length()
            android.content.Context r3 = r9.setMin
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r4 = ".tmp"
            java.io.File r1 = java.io.File.createTempFile(r1, r4, r3)
            r1.deleteOnExit()
            java.io.FileOutputStream r3 = new java.io.FileOutputStream
            r3.<init>(r1)
            java.nio.channels.FileChannel r3 = r3.getChannel()
            o.setCustomView.setMin(r0, r3)
            java.io.File r0 = r10.getParentFile()
            r3 = 76
            if (r0 == 0) goto L_0x00e3
            r4 = 76
            goto L_0x00e5
        L_0x00e3:
            r4 = 50
        L_0x00e5:
            if (r4 == r3) goto L_0x00e8
            goto L_0x00fe
        L_0x00e8:
            boolean r3 = r0.exists()
            r4 = 70
            if (r3 != 0) goto L_0x00f3
            r3 = 70
            goto L_0x00f5
        L_0x00f3:
            r3 = 29
        L_0x00f5:
            if (r3 == r4) goto L_0x00f8
            goto L_0x00fe
        L_0x00f8:
            boolean r0 = r0.mkdirs()
            if (r0 == 0) goto L_0x013c
        L_0x00fe:
            r9.getMin(r1, r11)
            boolean r11 = r1.renameTo(r10)
            if (r11 == 0) goto L_0x0111
            int r10 = FastBitmap$CoordinateSystem
            int r10 = r10 + 25
            int r11 = r10 % 128
            toDoubleRange = r11
            int r10 = r10 % r2
            return
        L_0x0111:
            java.io.IOException r11 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to move intermediate file ("
            r0.<init>(r2)     // Catch:{ Exception -> 0x013a }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x013a }
            r0.append(r1)     // Catch:{ Exception -> 0x013a }
            java.lang.String r1 = ") to destination ("
            r0.append(r1)     // Catch:{ Exception -> 0x013a }
            java.lang.String r10 = r10.getAbsolutePath()     // Catch:{ Exception -> 0x013a }
            r0.append(r10)     // Catch:{ Exception -> 0x013a }
            java.lang.String r10 = ")."
            r0.append(r10)     // Catch:{ Exception -> 0x013a }
            java.lang.String r10 = r0.toString()     // Catch:{ Exception -> 0x013a }
            r11.<init>(r10)     // Catch:{ Exception -> 0x013a }
            throw r11     // Catch:{ Exception -> 0x013a }
        L_0x013a:
            r10 = move-exception
            throw r10
        L_0x013c:
            java.io.IOException r11 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to create directories for "
            r0.<init>(r1)
            java.lang.String r10 = r10.getAbsolutePath()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        L_0x0154:
            r10 = move-exception
            java.lang.Throwable r11 = r10.getCause()
            if (r11 == 0) goto L_0x015c
            throw r11
        L_0x015c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTransitioning.getMax(java.io.File, boolean):void");
    }

    private void getMin(File file, boolean z) {
        setOverrideVisibleItems setoverridevisibleitems = this.setMax;
        if (setoverridevisibleitems != null && setoverridevisibleitems.isInside != null) {
            SupportSQLiteOpenHelper min = getMin(file);
            if (z) {
                try {
                    min.getWritableDatabase();
                } catch (Throwable th) {
                    min.close();
                    throw th;
                }
            } else {
                min.getReadableDatabase();
            }
            min.close();
        }
    }

    private SupportSQLiteOpenHelper getMin(File file) {
        String name = file.getName();
        try {
            int length2 = setSubtitle.length(file);
            isInOverlayMode isinoverlaymode = new isInOverlayMode();
            SupportSQLiteOpenHelper.Configuration.getMax min = SupportSQLiteOpenHelper.Configuration.setMin(this.setMin);
            min.length = name;
            min.getMax = new SupportSQLiteOpenHelper.setMax(length2) {
                public final void getMax(@NonNull SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
                }

                public final void length(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
                }
            };
            return isinoverlaymode.create(min.setMax());
        } catch (IOException e) {
            throw new RuntimeException("Malformed database file, unable to read version.", e);
        }
    }
}
