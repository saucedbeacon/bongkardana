package com.wrapper.proxyapplication;

import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class CustomerClassLoader extends PathClassLoader {
    private static final boolean VERBOSE_DEBUG = false;
    private boolean initialized;
    private final String libPath;
    private final String mDexOutputPath;
    private DexFile[] mDexs;
    private File[] mFiles;
    private String[] mLibPaths;
    private String[] mPaths;
    private ZipFile[] mZips;
    private final String path;

    private native int ShowLogs(String str, int i);

    public CustomerClassLoader(String str, String str2, String str3, ClassLoader classLoader) throws NoSuchFieldException, IllegalAccessException, IllegalArgumentException, NullPointerException, IOException {
        super("", str3, classLoader.getParent());
        if (str == null || str2 == null) {
            throw new NullPointerException();
        }
        this.path = str;
        this.libPath = str3;
        this.mDexOutputPath = str2;
        try {
            findField(classLoader, "parent").set(classLoader, this);
            ensureInit();
        } catch (NoSuchFieldException e) {
            throw e;
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0043 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005e */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[Catch:{ IOException -> 0x0066, RuntimeException -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void ensureInit() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.initialized     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r6)
            return
        L_0x0007:
            r0 = 1
            r6.initialized = r0     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = r6.path     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ all -> 0x00d9 }
            r6.mPaths = r0     // Catch:{ all -> 0x00d9 }
            java.lang.String[] r0 = r6.mPaths     // Catch:{ all -> 0x00d9 }
            int r0 = r0.length     // Catch:{ all -> 0x00d9 }
            java.io.File[] r1 = new java.io.File[r0]     // Catch:{ all -> 0x00d9 }
            r6.mFiles = r1     // Catch:{ all -> 0x00d9 }
            java.util.zip.ZipFile[] r1 = new java.util.zip.ZipFile[r0]     // Catch:{ all -> 0x00d9 }
            r6.mZips = r1     // Catch:{ all -> 0x00d9 }
            dalvik.system.DexFile[] r1 = new dalvik.system.DexFile[r0]     // Catch:{ all -> 0x00d9 }
            r6.mDexs = r1     // Catch:{ all -> 0x00d9 }
            r1 = 0
            r2 = 0
        L_0x0025:
            if (r2 >= r0) goto L_0x0071
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x00d9 }
            java.lang.String[] r4 = r6.mPaths     // Catch:{ all -> 0x00d9 }
            r4 = r4[r2]     // Catch:{ all -> 0x00d9 }
            r3.<init>(r4)     // Catch:{ all -> 0x00d9 }
            java.io.File[] r4 = r6.mFiles     // Catch:{ all -> 0x00d9 }
            r4[r2] = r3     // Catch:{ all -> 0x00d9 }
            boolean r4 = r3.isFile()     // Catch:{ all -> 0x00d9 }
            if (r4 == 0) goto L_0x006e
            java.util.zip.ZipFile[] r4 = r6.mZips     // Catch:{ IOException -> 0x0043 }
            java.util.zip.ZipFile r5 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0043 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0043 }
            r4[r2] = r5     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            java.lang.String r3 = r6.mDexOutputPath     // Catch:{ IOException -> 0x0066, RuntimeException -> 0x005e }
            if (r3 == 0) goto L_0x006e
            java.lang.String[] r3 = r6.mPaths     // Catch:{ IOException -> 0x0066, RuntimeException -> 0x005e }
            r3 = r3[r2]     // Catch:{ IOException -> 0x0066, RuntimeException -> 0x005e }
            java.lang.String r4 = r6.mDexOutputPath     // Catch:{ IOException -> 0x0066, RuntimeException -> 0x005e }
            java.lang.String r3 = generateOutputName(r3, r4)     // Catch:{ IOException -> 0x0066, RuntimeException -> 0x005e }
            dalvik.system.DexFile[] r4 = r6.mDexs     // Catch:{ IOException -> 0x0066, RuntimeException -> 0x005e }
            java.lang.String[] r5 = r6.mPaths     // Catch:{ IOException -> 0x0066, RuntimeException -> 0x005e }
            r5 = r5[r2]     // Catch:{ IOException -> 0x0066, RuntimeException -> 0x005e }
            dalvik.system.DexFile r3 = dalvik.system.DexFile.loadDex(r5, r3, r1)     // Catch:{ IOException -> 0x0066, RuntimeException -> 0x005e }
            r4[r2] = r3     // Catch:{ IOException -> 0x0066, RuntimeException -> 0x005e }
            goto L_0x006e
        L_0x005e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = "load dex fail"
            r0.<init>(r1)     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x0066:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = "load dex fail"
            r0.<init>(r1)     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x006e:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0071:
            java.lang.String r0 = "java.library.path"
            java.lang.String r2 = "."
            java.lang.String r0 = java.lang.System.getProperty(r0, r2)     // Catch:{ all -> 0x00d9 }
            java.lang.String r2 = "path.separator"
            java.lang.String r3 = ":"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)     // Catch:{ all -> 0x00d9 }
            java.lang.String r3 = "file.separator"
            java.lang.String r4 = "/"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)     // Catch:{ all -> 0x00d9 }
            java.lang.String r4 = r6.libPath     // Catch:{ all -> 0x00d9 }
            if (r4 == 0) goto L_0x00aa
            int r4 = r0.length()     // Catch:{ all -> 0x00d9 }
            if (r4 <= 0) goto L_0x00a8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r4.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String r5 = r6.libPath     // Catch:{ all -> 0x00d9 }
            r4.append(r5)     // Catch:{ all -> 0x00d9 }
            r4.append(r2)     // Catch:{ all -> 0x00d9 }
            r4.append(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00d9 }
            goto L_0x00aa
        L_0x00a8:
            java.lang.String r0 = r6.libPath     // Catch:{ all -> 0x00d9 }
        L_0x00aa:
            java.lang.String[] r0 = r0.split(r2)     // Catch:{ all -> 0x00d9 }
            r6.mLibPaths = r0     // Catch:{ all -> 0x00d9 }
            java.lang.String[] r0 = r6.mLibPaths     // Catch:{ all -> 0x00d9 }
            int r0 = r0.length     // Catch:{ all -> 0x00d9 }
        L_0x00b3:
            if (r1 >= r0) goto L_0x00d7
            java.lang.String[] r2 = r6.mLibPaths     // Catch:{ all -> 0x00d9 }
            r2 = r2[r1]     // Catch:{ all -> 0x00d9 }
            boolean r2 = r2.endsWith(r3)     // Catch:{ all -> 0x00d9 }
            if (r2 != 0) goto L_0x00d4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r2.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String[] r4 = r6.mLibPaths     // Catch:{ all -> 0x00d9 }
            r5 = r4[r1]     // Catch:{ all -> 0x00d9 }
            r2.append(r5)     // Catch:{ all -> 0x00d9 }
            r2.append(r3)     // Catch:{ all -> 0x00d9 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00d9 }
            r4[r1] = r2     // Catch:{ all -> 0x00d9 }
        L_0x00d4:
            int r1 = r1 + 1
            goto L_0x00b3
        L_0x00d7:
            monitor-exit(r6)
            return
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r6)
            goto L_0x00dd
        L_0x00dc:
            throw r0
        L_0x00dd:
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wrapper.proxyapplication.CustomerClassLoader.ensureInit():void");
    }

    private static String generateOutputName(String str, String str2) {
        StringBuilder sb = new StringBuilder(80);
        sb.append(str2);
        if (!str2.endsWith("/")) {
            sb.append("/");
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str = str.substring(lastIndexOf + 1);
        }
        int lastIndexOf2 = str.lastIndexOf(".");
        if (lastIndexOf2 < 0) {
            sb.append(str);
        } else {
            sb.append(str, 0, lastIndexOf2);
        }
        sb.append(".dex");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public Class<?> findClass(String str) throws ClassNotFoundException {
        try {
            ensureInit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int length = this.mPaths.length;
        for (int i = 0; i < length; i++) {
            if (this.mDexs[i] != null) {
                ShowLogs(str, i);
                Class<?> loadClass = this.mDexs[i].loadClass(str.replace('.', '/'), this);
                if (loadClass != null) {
                    return loadClass;
                }
                try {
                    Class<?> findClass = super.findClass(str);
                    if (findClass != null) {
                        return findClass;
                    }
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            } else if (this.mZips[i] != null) {
                loadFromArchive(this.mZips[i], str.replace('.', '/') + ".class");
            } else if (this.mFiles[i].isDirectory()) {
                loadFromDirectory(this.mPaths[i] + "/" + str.replace('.', '/') + ".class");
            }
        }
        throw new ClassNotFoundException(str + " in loader " + this);
    }

    /* access modifiers changed from: protected */
    public URL findResource(String str) {
        URL findResource = super.findResource(str);
        if (findResource != null) {
            return findResource;
        }
        int length = this.mPaths.length;
        int i = 0;
        while (i < length) {
            File file = this.mFiles[i];
            ZipFile zipFile = this.mZips[i];
            if (this.mPaths[i].endsWith(".dex") || zipFile.getEntry(str) == null) {
                i++;
            } else {
                try {
                    return new URL("jar:" + file.toURL() + "!/" + str);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return null;
    }

    private byte[] loadFromDirectory(String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            try {
                byte[] bArr = new byte[((int) randomAccessFile.length())];
                randomAccessFile.read(bArr);
                randomAccessFile.close();
                return bArr;
            } catch (IOException unused) {
                return null;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        }
    }

    private byte[] loadFromArchive(ZipFile zipFile, String str) {
        ZipEntry entry = zipFile.getEntry(str);
        if (entry == null) {
            return null;
        }
        try {
            InputStream inputStream = zipFile.getInputStream(entry);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) entry.getSize());
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    inputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean isInArchive(ZipFile zipFile, String str) {
        return zipFile.getEntry(str) != null;
    }

    public String findLibrary(String str) {
        try {
            ensureInit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String mapLibraryName = System.mapLibraryName(str);
        for (int i = 0; i < this.mLibPaths.length; i++) {
            String str2 = this.mLibPaths[i] + mapLibraryName;
            if (new File(str2).exists()) {
                return str2;
            }
            String findLibrary = super.findLibrary(str);
            if (findLibrary != null) {
                return findLibrary;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Package getPackage(String str) {
        Package packageR;
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (this) {
            packageR = super.getPackage(str);
            if (packageR == null) {
                packageR = definePackage(str, "Unknown", "0.0", "Unknown", "Unknown", "0.0", "Unknown", (URL) null);
            }
        }
        return packageR;
    }

    private static Field findField(Object obj, String str) throws NoSuchFieldException {
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
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }
}
