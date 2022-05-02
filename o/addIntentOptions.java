package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;

public final class addIntentOptions {
    private static final Set<File> getMax = new HashSet();
    private static final boolean setMax = length(System.getProperty("java.vm.version"));

    public static void getMax(Context context) {
        if (!setMax) {
            if (Build.VERSION.SDK_INT >= 4) {
                try {
                    ApplicationInfo length = length(context);
                    if (length != null) {
                        length(context, new File(length.sourceDir), new File(length.dataDir), "secondary-dexes", "");
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("MultiDex installation failed (");
                    sb.append(e.getMessage());
                    sb.append(").");
                    throw new RuntimeException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder("MultiDex installation failed. SDK ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(" is unsupported. Min SDK version is 4.");
                throw new RuntimeException(sb2.toString());
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x006d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0095 */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e A[SYNTHETIC, Splitter:B:47:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void length(android.content.Context r9, java.io.File r10, java.io.File r11, java.lang.String r12, java.lang.String r13) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.util.Set<java.io.File> r0 = getMax
            monitor-enter(r0)
            java.util.Set<java.io.File> r1 = getMax     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.contains(r10)     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x000d:
            java.util.Set<java.io.File> r1 = getMax     // Catch:{ all -> 0x0096 }
            r1.add(r10)     // Catch:{ all -> 0x0096 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0096 }
            r2 = 20
            if (r1 <= r2) goto L_0x001d
            java.lang.String r1 = "java.vm.version"
            java.lang.System.getProperty(r1)     // Catch:{ all -> 0x0096 }
        L_0x001d:
            java.lang.ClassLoader r1 = setMin(r9)     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0025
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0025:
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x006d }
            java.io.File r4 = r9.getFilesDir()     // Catch:{ all -> 0x006d }
            java.lang.String r5 = "secondary-dexes"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x006d }
            boolean r4 = r3.isDirectory()     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x006d
            r3.getPath()     // Catch:{ all -> 0x006d }
            java.io.File[] r4 = r3.listFiles()     // Catch:{ all -> 0x006d }
            if (r4 != 0) goto L_0x0044
            r3.getPath()     // Catch:{ all -> 0x006d }
            goto L_0x006d
        L_0x0044:
            int r5 = r4.length     // Catch:{ all -> 0x006d }
            r6 = 0
        L_0x0046:
            if (r6 >= r5) goto L_0x0060
            r7 = r4[r6]     // Catch:{ all -> 0x006d }
            r7.getPath()     // Catch:{ all -> 0x006d }
            r7.length()     // Catch:{ all -> 0x006d }
            boolean r8 = r7.delete()     // Catch:{ all -> 0x006d }
            if (r8 != 0) goto L_0x005a
            r7.getPath()     // Catch:{ all -> 0x006d }
            goto L_0x005d
        L_0x005a:
            r7.getPath()     // Catch:{ all -> 0x006d }
        L_0x005d:
            int r6 = r6 + 1
            goto L_0x0046
        L_0x0060:
            boolean r4 = r3.delete()     // Catch:{ all -> 0x006d }
            if (r4 != 0) goto L_0x006a
            r3.getPath()     // Catch:{ all -> 0x006d }
            goto L_0x006d
        L_0x006a:
            r3.getPath()     // Catch:{ all -> 0x006d }
        L_0x006d:
            java.io.File r11 = getMax(r9, r11, r12)     // Catch:{ all -> 0x0096 }
            o.clearAll r12 = new o.clearAll     // Catch:{ all -> 0x0096 }
            r12.<init>(r10, r11)     // Catch:{ all -> 0x0096 }
            r10 = 0
            java.util.List r2 = r12.getMin(r9, r13, r2)     // Catch:{ all -> 0x0091 }
            setMin(r1, r11, r2)     // Catch:{ IOException -> 0x007f }
            goto L_0x0087
        L_0x007f:
            r2 = 1
            java.util.List r9 = r12.getMin(r9, r13, r2)     // Catch:{ all -> 0x0091 }
            setMin(r1, r11, r9)     // Catch:{ all -> 0x0091 }
        L_0x0087:
            r12.close()     // Catch:{ IOException -> 0x008b }
            goto L_0x008c
        L_0x008b:
            r10 = move-exception
        L_0x008c:
            if (r10 != 0) goto L_0x0090
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0090:
            throw r10     // Catch:{ all -> 0x0096 }
        L_0x0091:
            r9 = move-exception
            r12.close()     // Catch:{ IOException -> 0x0095 }
        L_0x0095:
            throw r9     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r9 = move-exception
            monitor-exit(r0)
            goto L_0x009a
        L_0x0099:
            throw r9
        L_0x009a:
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addIntentOptions.length(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String):void");
    }

    private static ClassLoader setMin(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (Build.VERSION.SDK_INT >= 14) {
                if (classLoader instanceof BaseDexClassLoader) {
                    return classLoader;
                }
            } else if ((classLoader instanceof DexClassLoader) || (classLoader instanceof PathClassLoader)) {
                return classLoader;
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static ApplicationInfo length(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static boolean length(String str) {
        if (str == null) {
            return false;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        String str2 = null;
        String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
        if (stringTokenizer.hasMoreTokens()) {
            str2 = stringTokenizer.nextToken();
        }
        if (nextToken == null || str2 == null) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(nextToken);
            int parseInt2 = Integer.parseInt(str2);
            if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static void setMin(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (list.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            getMin.length(classLoader, list, file);
        } else if (Build.VERSION.SDK_INT >= 14) {
            setMin.getMin(classLoader, list);
        } else {
            setMax.getMax(classLoader, list);
        }
    }

    /* access modifiers changed from: private */
    public static Field setMin(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new NoSuchFieldException(sb.toString());
    }

    /* access modifiers changed from: private */
    public static Method length(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder("Method ");
        sb.append(str);
        sb.append(" with parameters ");
        sb.append(Arrays.asList(clsArr));
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new NoSuchMethodException(sb.toString());
    }

    private static File getMax(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            getMax(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            getMax(file2);
        }
        File file3 = new File(file2, str);
        getMax(file3);
        return file3;
    }

    private static void getMax(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                file.getPath();
            } else {
                file.getPath();
                parentFile.isDirectory();
                parentFile.isFile();
                parentFile.exists();
                parentFile.canRead();
                parentFile.canWrite();
            }
            StringBuilder sb = new StringBuilder("Failed to create directory ");
            sb.append(file.getPath());
            throw new IOException(sb.toString());
        }
    }

    static final class getMin {
        static void length(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = addIntentOptions.setMin(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            addIntentOptions.getMin(obj, "dexElements", setMax(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                Field max = addIntentOptions.setMin(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) max.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                max.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        private static Object[] setMax(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) addIntentOptions.length(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    static final class setMin {
        private static final int setMin = 4;
        private final getMin setMax;

        interface getMin {
            Object getMax(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
        }

        static class setMax implements getMin {
            private final Constructor<?> getMax;

            setMax(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
                this.getMax = constructor;
                constructor.setAccessible(true);
            }

            public Object getMax(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                return this.getMax.newInstance(new Object[]{file, new ZipFile(file), dexFile});
            }
        }

        static class getMax implements getMin {
            private final Constructor<?> length;

            getMax(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
                this.length = constructor;
                constructor.setAccessible(true);
            }

            public Object getMax(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.length.newInstance(new Object[]{file, file, dexFile});
            }
        }

        static class length implements getMin {
            private final Constructor<?> getMax;

            length(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
                this.getMax = constructor;
                constructor.setAccessible(true);
            }

            public Object getMax(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.getMax.newInstance(new Object[]{file, Boolean.FALSE, file, dexFile});
            }
        }

        static void getMin(ClassLoader classLoader, List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
            Object obj = addIntentOptions.setMin(classLoader, "pathList").get(classLoader);
            setMin setmin = new setMin();
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = (File) list.get(i);
                getMin getmin = setmin.setMax;
                String path = file.getPath();
                File parentFile = file.getParentFile();
                String name = file.getName();
                StringBuilder sb = new StringBuilder();
                sb.append(name.substring(0, name.length() - setMin));
                sb.append(".dex");
                objArr[i] = getmin.getMax(file, DexFile.loadDex(path, new File(parentFile, sb.toString()).getPath(), 0));
            }
            try {
                addIntentOptions.getMin(obj, "dexElements", objArr);
            } catch (NoSuchFieldException unused) {
                addIntentOptions.getMin(obj, "pathElements", objArr);
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private setMin() throws java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.NoSuchMethodException {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                o.addIntentOptions$setMin$setMax r1 = new o.addIntentOptions$setMin$setMax     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                o.addIntentOptions$setMin$getMax r1 = new o.addIntentOptions$setMin$getMax     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                o.addIntentOptions$setMin$length r1 = new o.addIntentOptions$setMin$length
                r1.<init>(r0)
            L_0x001a:
                r2.setMax = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.addIntentOptions.setMin.<init>():void");
        }
    }

    static final class setMax {
        static void getMax(ClassLoader classLoader, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            Field max = addIntentOptions.setMin(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) max.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(absolutePath);
                sb2.append(".dex");
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, sb2.toString(), 0);
            }
            max.set(classLoader, sb.toString());
            addIntentOptions.getMin(classLoader, "mPaths", strArr);
            addIntentOptions.getMin(classLoader, "mFiles", fileArr);
            addIntentOptions.getMin(classLoader, "mZips", zipFileArr);
            addIntentOptions.getMin(classLoader, "mDexs", dexFileArr);
        }
    }

    static /* synthetic */ void getMin(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field min = setMin(obj, str);
        Object[] objArr2 = (Object[]) min.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        min.set(obj, objArr3);
    }
}
