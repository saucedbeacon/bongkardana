package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import com.facebook.soloader.DoNotOptimize;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class getViewVerticalDragRange {
    @Nullable
    private static setDrawerElevation FastBitmap$CoordinateSystem = null;
    @GuardedBy("sSoSourcesLock")
    @Nullable
    private static onViewDragStateChanged IsOverlapping;
    @GuardedBy("SoLoader.class")
    private static final HashSet<String> equals = new HashSet<>();
    @GuardedBy("sSoSourcesLock")
    @Nullable
    private static clampViewPositionVertical[] getMax = null;
    static final boolean getMin;
    @GuardedBy("sSoSourcesLock")
    @Nullable
    private static tryCaptureView[] isInside;
    @Nullable
    static onEdgeDragStarted length;
    private static final ReentrantReadWriteLock setMax = new ReentrantReadWriteLock();
    private static int setMin = 0;
    @GuardedBy("sSoSourcesLock")
    private static int toDoubleRange;
    private static final Set<String> toFloatRange = Collections.newSetFromMap(new ConcurrentHashMap());
    @GuardedBy("SoLoader.class")
    private static final Map<String, Object> toIntRange = new HashMap();

    static {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        getMin = z;
    }

    private static int setMax() {
        setMax.writeLock().lock();
        try {
            return (toDoubleRange & 2) != 0 ? 1 : 0;
        } finally {
            setMax.writeLock().unlock();
        }
    }

    private static synchronized void length() {
        String str;
        String str2;
        synchronized (getViewVerticalDragRange.class) {
            final Runtime runtime = Runtime.getRuntime();
            final Method min = getMin();
            final boolean z = min != null;
            if (z) {
                str = getMax.setMax();
            } else {
                str = null;
            }
            if (str == null) {
                str2 = null;
            } else {
                String[] split = str.split(":");
                ArrayList arrayList = new ArrayList(split.length);
                for (String str3 : split) {
                    if (!str3.contains("!")) {
                        arrayList.add(str3);
                    }
                }
                str2 = TextUtils.join(":", arrayList);
            }
            final String str4 = str;
            final String str5 = str2;
            length = new onEdgeDragStarted() {
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
                    if (r10 == null) goto L_?;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
                    getMin(r9);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
                    return;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:40:0x006f  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void setMax(java.lang.String r9, int r10) {
                    /*
                        r8 = this;
                        boolean r0 = r2
                        if (r0 == 0) goto L_0x0073
                        r0 = 4
                        r10 = r10 & r0
                        r1 = 1
                        r2 = 0
                        if (r10 != r0) goto L_0x000c
                        r10 = 1
                        goto L_0x000d
                    L_0x000c:
                        r10 = 0
                    L_0x000d:
                        if (r10 == 0) goto L_0x0012
                        java.lang.String r10 = r3
                        goto L_0x0014
                    L_0x0012:
                        java.lang.String r10 = r4
                    L_0x0014:
                        r0 = 0
                        java.lang.Runtime r3 = r5     // Catch:{ IllegalAccessException -> 0x0058, IllegalArgumentException -> 0x0056, InvocationTargetException -> 0x0054, all -> 0x004f }
                        monitor-enter(r3)     // Catch:{ IllegalAccessException -> 0x0058, IllegalArgumentException -> 0x0056, InvocationTargetException -> 0x0054, all -> 0x004f }
                        java.lang.reflect.Method r4 = r6     // Catch:{ all -> 0x0043 }
                        java.lang.Runtime r5 = r5     // Catch:{ all -> 0x0043 }
                        r6 = 3
                        java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0043 }
                        r6[r2] = r9     // Catch:{ all -> 0x0043 }
                        java.lang.Class<o.getViewVerticalDragRange> r2 = o.getViewVerticalDragRange.class
                        java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ all -> 0x0043 }
                        r6[r1] = r2     // Catch:{ all -> 0x0043 }
                        r1 = 2
                        r6[r1] = r10     // Catch:{ all -> 0x0043 }
                        java.lang.Object r10 = r4.invoke(r5, r6)     // Catch:{ all -> 0x0043 }
                        java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0043 }
                        if (r10 != 0) goto L_0x003d
                        monitor-exit(r3)     // Catch:{ all -> 0x003b }
                        if (r10 == 0) goto L_0x003a
                        getMin(r9)
                    L_0x003a:
                        return
                    L_0x003b:
                        r0 = move-exception
                        goto L_0x0047
                    L_0x003d:
                        java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x003b }
                        r0.<init>(r10)     // Catch:{ all -> 0x003b }
                        throw r0     // Catch:{ all -> 0x003b }
                    L_0x0043:
                        r10 = move-exception
                        r7 = r0
                        r0 = r10
                        r10 = r7
                    L_0x0047:
                        monitor-exit(r3)     // Catch:{ IllegalAccessException -> 0x004d, IllegalArgumentException -> 0x004b, InvocationTargetException -> 0x0049 }
                        throw r0     // Catch:{ IllegalAccessException -> 0x004d, IllegalArgumentException -> 0x004b, InvocationTargetException -> 0x0049 }
                    L_0x0049:
                        r0 = move-exception
                        goto L_0x005c
                    L_0x004b:
                        r0 = move-exception
                        goto L_0x005c
                    L_0x004d:
                        r0 = move-exception
                        goto L_0x005c
                    L_0x004f:
                        r10 = move-exception
                        r7 = r0
                        r0 = r10
                        r10 = r7
                        goto L_0x006d
                    L_0x0054:
                        r10 = move-exception
                        goto L_0x0059
                    L_0x0056:
                        r10 = move-exception
                        goto L_0x0059
                    L_0x0058:
                        r10 = move-exception
                    L_0x0059:
                        r7 = r0
                        r0 = r10
                        r10 = r7
                    L_0x005c:
                        java.lang.String r1 = "Error: Cannot load "
                        java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x006c }
                        java.lang.String r10 = r1.concat(r2)     // Catch:{ all -> 0x006c }
                        java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x006c }
                        r1.<init>(r10, r0)     // Catch:{ all -> 0x006c }
                        throw r1     // Catch:{ all -> 0x006c }
                    L_0x006c:
                        r0 = move-exception
                    L_0x006d:
                        if (r10 == 0) goto L_0x0072
                        getMin(r9)
                    L_0x0072:
                        throw r0
                    L_0x0073:
                        java.lang.System.load(r9)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.getViewVerticalDragRange.AnonymousClass2.setMax(java.lang.String, int):void");
                }

                /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
                    r0 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
                    r1.close();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
                    throw r0;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private static java.lang.String getMin(java.lang.String r6) {
                    /*
                        java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        r0.<init>(r6)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        java.lang.String r6 = "MD5"
                        java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        r1.<init>(r0)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        r0 = 4096(0x1000, float:5.74E-42)
                        byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0037 }
                    L_0x0014:
                        int r2 = r1.read(r0)     // Catch:{ all -> 0x0037 }
                        r3 = 0
                        if (r2 <= 0) goto L_0x001f
                        r6.update(r0, r3, r2)     // Catch:{ all -> 0x0037 }
                        goto L_0x0014
                    L_0x001f:
                        java.lang.String r0 = "%32x"
                        r2 = 1
                        java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0037 }
                        java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ all -> 0x0037 }
                        byte[] r6 = r6.digest()     // Catch:{ all -> 0x0037 }
                        r5.<init>(r2, r6)     // Catch:{ all -> 0x0037 }
                        r4[r3] = r5     // Catch:{ all -> 0x0037 }
                        java.lang.String r6 = java.lang.String.format(r0, r4)     // Catch:{ all -> 0x0037 }
                        r1.close()     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        goto L_0x0054
                    L_0x0037:
                        r6 = move-exception
                        throw r6     // Catch:{ all -> 0x0039 }
                    L_0x0039:
                        r0 = move-exception
                        r1.close()     // Catch:{ all -> 0x003e }
                        goto L_0x0042
                    L_0x003e:
                        r1 = move-exception
                        r6.addSuppressed(r1)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                    L_0x0042:
                        throw r0     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                    L_0x0043:
                        r6 = move-exception
                        java.lang.String r6 = r6.toString()
                        goto L_0x0054
                    L_0x0049:
                        r6 = move-exception
                        java.lang.String r6 = r6.toString()
                        goto L_0x0054
                    L_0x004f:
                        r6 = move-exception
                        java.lang.String r6 = r6.toString()
                    L_0x0054:
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.getViewVerticalDragRange.AnonymousClass2.getMin(java.lang.String):java.lang.String");
                }
            };
        }
    }

    @Nullable
    private static Method getMin() {
        if (Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT <= 27) {
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{String.class, ClassLoader.class, String.class});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException | SecurityException unused) {
            }
        }
        return null;
    }

    public static final class length extends UnsatisfiedLinkError {
        length(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    public static boolean setMin(String str) {
        return setMax(str);
    }

    private static boolean setMax(String str) throws UnsatisfiedLinkError {
        boolean z;
        setMax.readLock().lock();
        try {
            if (getMax == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    setMax.readLock().lock();
                    if (getMax != null) {
                        setMax.readLock().unlock();
                    } else {
                        throw new RuntimeException("SoLoader.init() not yet called");
                    }
                } else {
                    synchronized (getViewVerticalDragRange.class) {
                        z = !equals.contains(str);
                        if (z && FastBitmap$CoordinateSystem == null) {
                            System.loadLibrary(str);
                        }
                    }
                    setMax.readLock().unlock();
                    return z;
                }
            }
            setMax.readLock().unlock();
            return getMin(System.mapLibraryName(str), str, 2, (StrictMode.ThreadPolicy) null);
        } catch (Throwable th) {
            setMax.readLock().unlock();
            throw th;
        }
    }

    static void setMin(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        getMin(str, (String) null, i, threadPolicy);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (equals.contains(r4) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        getMax(r4, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        equals.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004e, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0053, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0055, code lost:
        toFloatRange.contains(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0060, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0061, code lost:
        r5 = r4.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0065, code lost:
        if (r5 == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0074, code lost:
        throw new o.getViewVerticalDragRange.length(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0075, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0076, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007c, code lost:
        throw new java.lang.RuntimeException(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getMin(java.lang.String r4, @javax.annotation.Nullable java.lang.String r5, int r6, @javax.annotation.Nullable android.os.StrictMode.ThreadPolicy r7) {
        /*
            java.lang.Class<o.getViewVerticalDragRange> r0 = o.getViewVerticalDragRange.class
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            r2 = 0
            if (r1 != 0) goto L_0x0012
            java.util.Set<java.lang.String> r1 = toFloatRange
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L_0x0012
            return r2
        L_0x0012:
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r1 = equals     // Catch:{ all -> 0x0083 }
            boolean r1 = r1.contains(r4)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0083 }
            return r2
        L_0x001d:
            java.util.Map<java.lang.String, java.lang.Object> r1 = toIntRange     // Catch:{ all -> 0x0083 }
            boolean r1 = r1.containsKey(r4)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x002c
            java.util.Map<java.lang.String, java.lang.Object> r1 = toIntRange     // Catch:{ all -> 0x0083 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0083 }
            goto L_0x0036
        L_0x002c:
            java.lang.Object r1 = new java.lang.Object     // Catch:{ all -> 0x0083 }
            r1.<init>()     // Catch:{ all -> 0x0083 }
            java.util.Map<java.lang.String, java.lang.Object> r3 = toIntRange     // Catch:{ all -> 0x0083 }
            r3.put(r4, r1)     // Catch:{ all -> 0x0083 }
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0083 }
            monitor-enter(r1)
            monitor-enter(r0)     // Catch:{ all -> 0x0080 }
            java.util.HashSet<java.lang.String> r3 = equals     // Catch:{ all -> 0x007d }
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x0044
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            monitor-exit(r1)     // Catch:{ all -> 0x0080 }
            return r2
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            getMax(r4, r6, r7)     // Catch:{ IOException -> 0x0076, UnsatisfiedLinkError -> 0x0060 }
            monitor-enter(r0)     // Catch:{ all -> 0x0080 }
            java.util.HashSet<java.lang.String> r6 = equals     // Catch:{ all -> 0x005d }
            r6.add(r4)     // Catch:{ all -> 0x005d }
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0080 }
            if (r4 != 0) goto L_0x005a
            java.util.Set<java.lang.String> r4 = toFloatRange     // Catch:{ all -> 0x0080 }
            r4.contains(r5)     // Catch:{ all -> 0x0080 }
        L_0x005a:
            monitor-exit(r1)     // Catch:{ all -> 0x0080 }
            r4 = 1
            return r4
        L_0x005d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            throw r4     // Catch:{ all -> 0x0080 }
        L_0x0060:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0075
            java.lang.String r6 = "unexpected e_machine:"
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0075
            o.getViewVerticalDragRange$length r5 = new o.getViewVerticalDragRange$length     // Catch:{ all -> 0x0080 }
            r5.<init>(r4)     // Catch:{ all -> 0x0080 }
            throw r5     // Catch:{ all -> 0x0080 }
        L_0x0075:
            throw r4     // Catch:{ all -> 0x0080 }
        L_0x0076:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x0080 }
            r5.<init>(r4)     // Catch:{ all -> 0x0080 }
            throw r5     // Catch:{ all -> 0x0080 }
        L_0x007d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            throw r4     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L_0x0083:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getViewVerticalDragRange.getMin(java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    /* JADX INFO: finally extract failed */
    private static void getMax(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        boolean z;
        boolean z2;
        setMax.readLock().lock();
        try {
            if (getMax != null) {
                setMax.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (getMin) {
                    StringBuilder sb = new StringBuilder("SoLoader.loadLibrary[");
                    sb.append(str);
                    sb.append("]");
                    Trace.beginSection(sb.toString());
                }
                int i2 = 0;
                do {
                    try {
                        setMax.readLock().lock();
                        int i3 = setMin;
                        int i4 = 0;
                        while (true) {
                            if (i2 == 0) {
                                if (i4 < getMax.length) {
                                    i2 = getMax[i4].getMin(str, i, threadPolicy);
                                    if (i2 == 3 && isInside != null) {
                                        tryCaptureView[] trycaptureviewArr = isInside;
                                        int length2 = trycaptureviewArr.length;
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= length2) {
                                                break;
                                            }
                                            tryCaptureView trycaptureview = trycaptureviewArr[i5];
                                            trycaptureview.length(str);
                                            int min = trycaptureview.getMin(str, i, threadPolicy);
                                            if (min == 1) {
                                                i2 = min;
                                                break;
                                            }
                                            i5++;
                                        }
                                    } else {
                                        i4++;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        setMax.readLock().unlock();
                        if ((i & 2) == 2 && i2 == 0) {
                            setMax.writeLock().lock();
                            if (IsOverlapping != null && IsOverlapping.getMax()) {
                                setMin++;
                            }
                            z2 = setMin != i3;
                            setMax.writeLock().unlock();
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                    } catch (Throwable th) {
                        if (getMin) {
                            Trace.endSection();
                        }
                        if (z) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        if (i2 == 0 || i2 == 3) {
                            String concat = "couldn't find DSO to load: ".concat(String.valueOf(str));
                            String message = th.getMessage();
                            if (message == null) {
                                message = th.toString();
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(concat);
                            sb2.append(" caused by: ");
                            sb2.append(message);
                            throw new UnsatisfiedLinkError(sb2.toString());
                        }
                        return;
                    }
                } while (z2);
                if (getMin) {
                    Trace.endSection();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i2 == 0 || i2 == 3) {
                    throw new UnsatisfiedLinkError("couldn't find DSO to load: ".concat(String.valueOf(str)));
                }
                return;
            }
            throw new UnsatisfiedLinkError("couldn't find DSO to load: ".concat(String.valueOf(str)));
        } catch (Throwable th2) {
            setMax.readLock().unlock();
            throw th2;
        }
    }

    @DoNotOptimize
    @TargetApi(14)
    static class getMax {
        public static String setMax() {
            ClassLoader classLoader = getViewVerticalDragRange.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            } else {
                StringBuilder sb = new StringBuilder("ClassLoader ");
                sb.append(classLoader.getClass().getName());
                sb.append(" should be of type BaseDexClassLoader");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public static void setMax(Context context) {
        int i;
        try {
            StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            try {
                length();
                setMax.writeLock().lock();
                if (getMax == null) {
                    toDoubleRange = 0;
                    ArrayList arrayList = new ArrayList();
                    String str = System.getenv("LD_LIBRARY_PATH");
                    if (str == null) {
                        str = "/vendor/lib:/system/lib";
                    }
                    String[] split = str.split(":");
                    for (String file : split) {
                        arrayList.add(new onViewReleased(new File(file), 2));
                    }
                    if (context != null) {
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if ((applicationInfo.flags & 1) != 0 && (applicationInfo.flags & 128) == 0) {
                            i = 0;
                        } else {
                            onViewDragStateChanged onviewdragstatechanged = new onViewDragStateChanged(context, Build.VERSION.SDK_INT <= 17 ? 1 : 0);
                            IsOverlapping = onviewdragstatechanged;
                            arrayList.add(0, onviewdragstatechanged);
                            i = 1;
                        }
                        if ((toDoubleRange & 8) != 0) {
                            isInside = null;
                        } else {
                            File file2 = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new onViewPositionChanged(context, file2, "lib-main", i));
                            if (Build.VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length2 = strArr.length;
                                int i2 = 0;
                                int i3 = 0;
                                while (i2 < length2) {
                                    File file3 = new File(strArr[i2]);
                                    StringBuilder sb = new StringBuilder("lib-");
                                    sb.append(i3);
                                    arrayList2.add(new onViewPositionChanged(context, file3, sb.toString(), i));
                                    i2++;
                                    i3++;
                                }
                            }
                            isInside = (tryCaptureView[]) arrayList2.toArray(new tryCaptureView[arrayList2.size()]);
                            arrayList.addAll(0, arrayList2);
                        }
                    }
                    clampViewPositionVertical[] clampviewpositionverticalArr = (clampViewPositionVertical[]) arrayList.toArray(new clampViewPositionVertical[arrayList.size()]);
                    int max = setMax();
                    int length3 = clampviewpositionverticalArr.length;
                    while (true) {
                        int i4 = length3 - 1;
                        if (length3 <= 0) {
                            break;
                        }
                        clampviewpositionverticalArr[i4].getMax(max);
                        length3 = i4;
                    }
                    getMax = clampviewpositionverticalArr;
                    setMin++;
                }
                setMax.writeLock().unlock();
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
