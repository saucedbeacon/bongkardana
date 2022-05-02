package com.uc.crashsdk.a;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public final class b {
    public static void a(File file, File file2, byte[] bArr) {
        FileInputStream fileInputStream = new FileInputStream(file);
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (file2.isDirectory()) {
            file2 = new File(file2, file.getName());
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return;
                }
            } catch (IOException e) {
                throw e;
            } catch (Throwable th) {
                fileInputStream.close();
                fileOutputStream.close();
                throw th;
            }
        }
    }

    public static boolean a(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String file2 : list) {
                if (!a(new File(file, file2))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.io.File r6) {
        /*
            boolean r0 = r6.exists()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            r0 = 0
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0038 }
            r3.<init>(r6)     // Catch:{ all -> 0x0038 }
            r6 = 256(0x100, float:3.59E-43)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x0035 }
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ all -> 0x0035 }
            r0.<init>()     // Catch:{ all -> 0x0035 }
        L_0x0019:
            int r4 = r3.read(r6)     // Catch:{ all -> 0x0035 }
            if (r4 <= 0) goto L_0x0028
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0035 }
            r5.<init>(r6, r2, r4)     // Catch:{ all -> 0x0035 }
            r0.append(r5)     // Catch:{ all -> 0x0035 }
            goto L_0x0019
        L_0x0028:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0035 }
            r3.close()     // Catch:{ all -> 0x0030 }
            goto L_0x0041
        L_0x0030:
            r6 = move-exception
            com.uc.crashsdk.a.a.a(r6, r2)
            goto L_0x0041
        L_0x0035:
            r6 = move-exception
            r0 = r3
            goto L_0x0039
        L_0x0038:
            r6 = move-exception
        L_0x0039:
            com.uc.crashsdk.a.a.a(r6, r2)     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0041
            r0.close()     // Catch:{ all -> 0x0030 }
        L_0x0041:
            return r1
        L_0x0042:
            r6 = move-exception
            if (r0 == 0) goto L_0x004d
            r0.close()     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r2)
        L_0x004d:
            goto L_0x004f
        L_0x004e:
            throw r6
        L_0x004f:
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.b.b(java.io.File):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        if (r6 == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        com.uc.crashsdk.a.a.a(r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0041, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0049, code lost:
        if (r6 == false) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0030 A[SYNTHETIC, Splitter:B:22:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0044 A[SYNTHETIC, Splitter:B:33:0x0044] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r4, int r5, boolean r6) {
        /*
            r0 = 0
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x002c }
            r2.<init>(r4)     // Catch:{ all -> 0x002c }
            byte[] r4 = new byte[r5]     // Catch:{ all -> 0x002a }
            int r5 = r2.read(r4)     // Catch:{ all -> 0x002a }
            if (r5 <= 0) goto L_0x001f
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x002a }
            r3.<init>(r4, r1, r5)     // Catch:{ all -> 0x002a }
            r2.close()     // Catch:{ all -> 0x0018 }
            goto L_0x001e
        L_0x0018:
            r4 = move-exception
            if (r6 == 0) goto L_0x001e
            com.uc.crashsdk.a.a.a(r4, r1)
        L_0x001e:
            return r3
        L_0x001f:
            r2.close()     // Catch:{ all -> 0x0023 }
            goto L_0x004c
        L_0x0023:
            r4 = move-exception
            if (r6 == 0) goto L_0x004c
        L_0x0026:
            com.uc.crashsdk.a.a.a(r4, r1)
            goto L_0x004c
        L_0x002a:
            r4 = move-exception
            goto L_0x002e
        L_0x002c:
            r4 = move-exception
            r2 = r0
        L_0x002e:
            if (r6 == 0) goto L_0x0042
            com.uc.crashsdk.a.a.a(r4, r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0042
        L_0x0034:
            r4 = move-exception
            if (r2 == 0) goto L_0x0041
            r2.close()     // Catch:{ all -> 0x003b }
            goto L_0x0041
        L_0x003b:
            r5 = move-exception
            if (r6 == 0) goto L_0x0041
            com.uc.crashsdk.a.a.a(r5, r1)
        L_0x0041:
            throw r4
        L_0x0042:
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ all -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r4 = move-exception
            if (r6 == 0) goto L_0x004c
            goto L_0x0026
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.b.a(java.io.File, int, boolean):java.lang.String");
    }

    public static ArrayList<String> a(File file, int i) {
        BufferedReader bufferedReader;
        ArrayList<String> arrayList = new ArrayList<>();
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader2, 512);
                int i2 = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        arrayList.add(readLine);
                        i2++;
                        if (i > 0 && i2 >= i) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileReader = fileReader2;
                        try {
                            a.a(th, false);
                            a((Closeable) fileReader);
                            a((Closeable) bufferedReader);
                            return arrayList;
                        } catch (Throwable th2) {
                            a((Closeable) fileReader);
                            a((Closeable) bufferedReader);
                            throw th2;
                        }
                    }
                }
                a((Closeable) fileReader2);
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                fileReader = fileReader2;
                a.a(th, false);
                a((Closeable) fileReader);
                a((Closeable) bufferedReader);
                return arrayList;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            a.a(th, false);
            a((Closeable) fileReader);
            a((Closeable) bufferedReader);
            return arrayList;
        }
        a((Closeable) bufferedReader);
        return arrayList;
    }

    public static boolean a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                a((Closeable) fileOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    a.a(th, false);
                    return false;
                } finally {
                    a((Closeable) fileOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            a.a(th, false);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0022 A[SYNTHETIC, Splitter:B:17:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r3, java.lang.String r4) {
        /*
            r0 = 0
            r1 = 0
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ all -> 0x001c }
            r2.<init>(r3)     // Catch:{ all -> 0x001c }
            int r3 = r4.length()     // Catch:{ all -> 0x0019 }
            r2.write(r4, r0, r3)     // Catch:{ all -> 0x0019 }
            r3 = 1
            r2.close()     // Catch:{ all -> 0x0013 }
            goto L_0x0017
        L_0x0013:
            r4 = move-exception
            com.uc.crashsdk.a.a.a(r4, r0)
        L_0x0017:
            r0 = 1
            goto L_0x002a
        L_0x0019:
            r3 = move-exception
            r1 = r2
            goto L_0x001d
        L_0x001c:
            r3 = move-exception
        L_0x001d:
            com.uc.crashsdk.a.a.a(r3, r0)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x002a
            r1.close()     // Catch:{ all -> 0x0026 }
            goto L_0x002a
        L_0x0026:
            r3 = move-exception
            com.uc.crashsdk.a.a.a(r3, r0)
        L_0x002a:
            return r0
        L_0x002b:
            r3 = move-exception
            if (r1 == 0) goto L_0x0036
            r1.close()     // Catch:{ all -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r4 = move-exception
            com.uc.crashsdk.a.a.a(r4, r0)
        L_0x0036:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.b.a(java.io.File, java.lang.String):boolean");
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                a.a(th, true);
            }
        }
    }
}
