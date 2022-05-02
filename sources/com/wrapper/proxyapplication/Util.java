package com.wrapper.proxyapplication;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Util {
    public static String CPUABI = null;
    static final int ERROR_EXCEPTION = -2;
    static final int ERROR_FALSE = 0;
    static final int ERROR_FILE_EXIST = 2;
    static final int ERROR_FILE_NOT_FOUND = -1;
    static final int ERROR_FILE_NOT_FOUND_INZIP = -3;
    static final int ERROR_SUCCESS = 1;
    public static int MAX_DEX_NUM = 300;
    public static String TAG = "Util";
    public static String dexname = "classes.dex";
    public static boolean ifoverwrite = true;
    public static String libname;
    public static String securename0 = "00O000ll111l.dex";
    public static String securename1 = "00O000ll111l.jar";
    public static String securename11 = ".flag00O000ll111l.vdex";
    public static String securename14 = "00O000ll111l.vdex";
    public static String securename15 = "00O000ll111l.odex";
    public static String securename2 = "000O00ll111l.dex";
    public static String securename3 = "0000000lllll.dex";
    public static String securename4 = "000000olllll.dex";
    public static String securename5 = "0OO00l111l1l";
    public static String securename6 = "o0oooOO0ooOo.dat";
    public static String securename7 = "exportService.txt";
    public static String securename8 = ".flag00O000ll111l.dex";
    public static String securename9 = ".updateIV.dat";
    public static String simplelibname = "tosprotection";
    public static String versionname = "tosversion";

    static {
        libname = "";
        libname = "shell-super.2019";
    }

    public static int DeleteFile(String filepath) {
        File tmpfile = new File(filepath);
        if (!tmpfile.exists()) {
            return ERROR_FILE_NOT_FOUND;
        }
        if (!tmpfile.delete()) {
            return ERROR_EXCEPTION;
        }
        return ERROR_SUCCESS;
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x009a A[SYNTHETIC, Splitter:B:74:0x009a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean UnzipFile(java.util.zip.ZipFile r10, java.lang.String r11, java.io.File r12) {
        /*
            r8 = 0
            r0 = 0
            r3 = 0
            r7 = 0
            java.util.zip.ZipEntry r7 = r10.getEntry(r11)     // Catch:{ Exception -> 0x00fa }
            if (r7 != 0) goto L_0x0035
            if (r0 == 0) goto L_0x0014
            r0.close()     // Catch:{ IOException -> 0x0015 }
            if (r3 == 0) goto L_0x0014
            r3.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0014:
            return r8
        L_0x0015:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x0024 }
            if (r3 == 0) goto L_0x0014
            r3.close()     // Catch:{ IOException -> 0x001f }
            goto L_0x0014
        L_0x001f:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x0014
        L_0x0024:
            r9 = move-exception
            if (r3 == 0) goto L_0x002a
            r3.close()     // Catch:{ IOException -> 0x002b }
        L_0x002a:
            throw r9
        L_0x002b:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x0014
        L_0x0030:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x0014
        L_0x0035:
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00fa }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00fa }
            r9.<init>(r12)     // Catch:{ Exception -> 0x00fa }
            r1.<init>(r9)     // Catch:{ Exception -> 0x00fa }
            r9 = 65536(0x10000, float:9.18355E-41)
            byte[] r2 = new byte[r9]     // Catch:{ Exception -> 0x00fd, all -> 0x00f3 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00fd, all -> 0x00f3 }
            java.io.InputStream r9 = r10.getInputStream(r7)     // Catch:{ Exception -> 0x00fd, all -> 0x00f3 }
            r4.<init>(r9)     // Catch:{ Exception -> 0x00fd, all -> 0x00f3 }
        L_0x004c:
            int r6 = r4.read(r2)     // Catch:{ Exception -> 0x0065, all -> 0x00f6 }
            if (r6 >= 0) goto L_0x0060
            if (r1 == 0) goto L_0x005c
            r1.close()     // Catch:{ IOException -> 0x00c7 }
            if (r4 == 0) goto L_0x005c
            r4.close()     // Catch:{ IOException -> 0x00eb }
        L_0x005c:
            r8 = 1
            r3 = r4
            r0 = r1
            goto L_0x0014
        L_0x0060:
            r9 = 0
            r1.write(r2, r9, r6)     // Catch:{ Exception -> 0x0065, all -> 0x00f6 }
            goto L_0x004c
        L_0x0065:
            r5 = move-exception
            r3 = r4
            r0 = r1
        L_0x0068:
            r5.printStackTrace()     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0014
            r0.close()     // Catch:{ IOException -> 0x007b }
            if (r3 == 0) goto L_0x0014
            r3.close()     // Catch:{ IOException -> 0x0076 }
            goto L_0x0014
        L_0x0076:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x0014
        L_0x007b:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0014
            r3.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x0014
        L_0x0085:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x0014
        L_0x008a:
            r9 = move-exception
            if (r3 == 0) goto L_0x0090
            r3.close()     // Catch:{ IOException -> 0x0091 }
        L_0x0090:
            throw r9
        L_0x0091:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x0014
        L_0x0097:
            r9 = move-exception
        L_0x0098:
            if (r0 == 0) goto L_0x00a2
            r0.close()     // Catch:{ IOException -> 0x00a3 }
            if (r3 == 0) goto L_0x00a2
            r3.close()     // Catch:{ IOException -> 0x00c1 }
        L_0x00a2:
            throw r9
        L_0x00a3:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x00b4 }
            if (r3 == 0) goto L_0x0014
            r3.close()     // Catch:{ IOException -> 0x00ae }
            goto L_0x0014
        L_0x00ae:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x0014
        L_0x00b4:
            r9 = move-exception
            if (r3 == 0) goto L_0x00ba
            r3.close()     // Catch:{ IOException -> 0x00bb }
        L_0x00ba:
            throw r9
        L_0x00bb:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x0014
        L_0x00c1:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x0014
        L_0x00c7:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x00dc }
            if (r4 == 0) goto L_0x00d0
            r4.close()     // Catch:{ IOException -> 0x00d4 }
        L_0x00d0:
            r3 = r4
            r0 = r1
            goto L_0x0014
        L_0x00d4:
            r5 = move-exception
            r5.printStackTrace()
            r3 = r4
            r0 = r1
            goto L_0x0014
        L_0x00dc:
            r9 = move-exception
            if (r4 == 0) goto L_0x00e2
            r4.close()     // Catch:{ IOException -> 0x00e3 }
        L_0x00e2:
            throw r9
        L_0x00e3:
            r5 = move-exception
            r5.printStackTrace()
            r3 = r4
            r0 = r1
            goto L_0x0014
        L_0x00eb:
            r5 = move-exception
            r5.printStackTrace()
            r3 = r4
            r0 = r1
            goto L_0x0014
        L_0x00f3:
            r9 = move-exception
            r0 = r1
            goto L_0x0098
        L_0x00f6:
            r9 = move-exception
            r3 = r4
            r0 = r1
            goto L_0x0098
        L_0x00fa:
            r5 = move-exception
            goto L_0x0068
        L_0x00fd:
            r5 = move-exception
            r0 = r1
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wrapper.proxyapplication.Util.UnzipFile(java.util.zip.ZipFile, java.lang.String, java.io.File):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0092 A[SYNTHETIC, Splitter:B:48:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00c8 A[SYNTHETIC, Splitter:B:74:0x00c8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int Comparetxtinzip(java.util.zip.ZipFile r16, java.lang.String r17, java.io.File r18) {
        /*
            r11 = -1
            r7 = 0
            r4 = 0
            r1 = 0
            java.util.zip.ZipEntry r7 = r16.getEntry(r17)
            if (r7 != 0) goto L_0x003a
            if (r4 == 0) goto L_0x0014
            r4.close()     // Catch:{ IOException -> 0x0016 }
            if (r1 == 0) goto L_0x0014
            r1.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0014:
            r14 = -3
        L_0x0015:
            return r14
        L_0x0016:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x001f
            r1.close()     // Catch:{ IOException -> 0x0021 }
        L_0x001f:
            r14 = -2
            goto L_0x0015
        L_0x0021:
            r8 = move-exception
            r8.printStackTrace()
            r14 = -2
            goto L_0x0015
        L_0x0027:
            r14 = move-exception
            if (r1 == 0) goto L_0x002d
            r1.close()     // Catch:{ IOException -> 0x002e }
        L_0x002d:
            throw r14
        L_0x002e:
            r8 = move-exception
            r8.printStackTrace()
            r14 = -2
            goto L_0x0015
        L_0x0034:
            r8 = move-exception
            r8.printStackTrace()
            r14 = -2
            goto L_0x0015
        L_0x003a:
            r14 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r14]     // Catch:{ Exception -> 0x008c }
            r14 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r14]     // Catch:{ Exception -> 0x008c }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x008c }
            r0 = r16
            java.io.InputStream r14 = r0.getInputStream(r7)     // Catch:{ Exception -> 0x008c }
            r5.<init>(r14)     // Catch:{ Exception -> 0x008c }
            int r10 = r5.read(r6)     // Catch:{ Exception -> 0x0130, all -> 0x0129 }
            java.lang.String r14 = new java.lang.String     // Catch:{ Exception -> 0x0130, all -> 0x0129 }
            r14.<init>(r6)     // Catch:{ Exception -> 0x0130, all -> 0x0129 }
            r15 = 0
            java.lang.String r13 = r14.substring(r15, r10)     // Catch:{ Exception -> 0x0130, all -> 0x0129 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0130, all -> 0x0129 }
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0130, all -> 0x0129 }
            r0 = r18
            r14.<init>(r0)     // Catch:{ Exception -> 0x0130, all -> 0x0129 }
            r2.<init>(r14)     // Catch:{ Exception -> 0x0130, all -> 0x0129 }
            int r9 = r2.read(r3)     // Catch:{ Exception -> 0x0134, all -> 0x012c }
            java.lang.String r14 = new java.lang.String     // Catch:{ Exception -> 0x0134, all -> 0x012c }
            r14.<init>(r3)     // Catch:{ Exception -> 0x0134, all -> 0x012c }
            r15 = 0
            java.lang.String r12 = r14.substring(r15, r9)     // Catch:{ Exception -> 0x0134, all -> 0x012c }
            boolean r14 = r12.equals(r13)     // Catch:{ Exception -> 0x0134, all -> 0x012c }
            if (r14 == 0) goto L_0x008a
            r11 = 1
        L_0x007c:
            if (r5 == 0) goto L_0x0086
            r5.close()     // Catch:{ IOException -> 0x00f9 }
            if (r2 == 0) goto L_0x0086
            r2.close()     // Catch:{ IOException -> 0x0120 }
        L_0x0086:
            r1 = r2
            r4 = r5
            r14 = r11
            goto L_0x0015
        L_0x008a:
            r11 = 0
            goto L_0x007c
        L_0x008c:
            r8 = move-exception
        L_0x008d:
            r8.printStackTrace()     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x009a
            r4.close()     // Catch:{ IOException -> 0x009d }
            if (r1 == 0) goto L_0x009a
            r1.close()     // Catch:{ IOException -> 0x00be }
        L_0x009a:
            r14 = -2
            goto L_0x0015
        L_0x009d:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x00a6
            r1.close()     // Catch:{ IOException -> 0x00a9 }
        L_0x00a6:
            r14 = -2
            goto L_0x0015
        L_0x00a9:
            r8 = move-exception
            r8.printStackTrace()
            r14 = -2
            goto L_0x0015
        L_0x00b0:
            r14 = move-exception
            if (r1 == 0) goto L_0x00b6
            r1.close()     // Catch:{ IOException -> 0x00b7 }
        L_0x00b6:
            throw r14
        L_0x00b7:
            r8 = move-exception
            r8.printStackTrace()
            r14 = -2
            goto L_0x0015
        L_0x00be:
            r8 = move-exception
            r8.printStackTrace()
            r14 = -2
            goto L_0x0015
        L_0x00c5:
            r14 = move-exception
        L_0x00c6:
            if (r4 == 0) goto L_0x00d0
            r4.close()     // Catch:{ IOException -> 0x00d1 }
            if (r1 == 0) goto L_0x00d0
            r1.close()     // Catch:{ IOException -> 0x00f2 }
        L_0x00d0:
            throw r14
        L_0x00d1:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00da
            r1.close()     // Catch:{ IOException -> 0x00dd }
        L_0x00da:
            r14 = -2
            goto L_0x0015
        L_0x00dd:
            r8 = move-exception
            r8.printStackTrace()
            r14 = -2
            goto L_0x0015
        L_0x00e4:
            r14 = move-exception
            if (r1 == 0) goto L_0x00ea
            r1.close()     // Catch:{ IOException -> 0x00eb }
        L_0x00ea:
            throw r14
        L_0x00eb:
            r8 = move-exception
            r8.printStackTrace()
            r14 = -2
            goto L_0x0015
        L_0x00f2:
            r8 = move-exception
            r8.printStackTrace()
            r14 = -2
            goto L_0x0015
        L_0x00f9:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ all -> 0x0110 }
            if (r2 == 0) goto L_0x0102
            r2.close()     // Catch:{ IOException -> 0x0107 }
        L_0x0102:
            r14 = -2
            r1 = r2
            r4 = r5
            goto L_0x0015
        L_0x0107:
            r8 = move-exception
            r8.printStackTrace()
            r14 = -2
            r1 = r2
            r4 = r5
            goto L_0x0015
        L_0x0110:
            r14 = move-exception
            if (r2 == 0) goto L_0x0116
            r2.close()     // Catch:{ IOException -> 0x0117 }
        L_0x0116:
            throw r14
        L_0x0117:
            r8 = move-exception
            r8.printStackTrace()
            r14 = -2
            r1 = r2
            r4 = r5
            goto L_0x0015
        L_0x0120:
            r8 = move-exception
            r8.printStackTrace()
            r14 = -2
            r1 = r2
            r4 = r5
            goto L_0x0015
        L_0x0129:
            r14 = move-exception
            r4 = r5
            goto L_0x00c6
        L_0x012c:
            r14 = move-exception
            r1 = r2
            r4 = r5
            goto L_0x00c6
        L_0x0130:
            r8 = move-exception
            r4 = r5
            goto L_0x008d
        L_0x0134:
            r8 = move-exception
            r1 = r2
            r4 = r5
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wrapper.proxyapplication.Util.Comparetxtinzip(java.util.zip.ZipFile, java.lang.String, java.io.File):int");
    }

    public static boolean deleteDir(File file) {
        boolean result = true;
        if (file.isDirectory()) {
            String[] children = file.list();
            for (int i = ERROR_FALSE; i < children.length; i += ERROR_SUCCESS) {
                if (!deleteDir(new File(file, children[i]))) {
                    return false;
                }
            }
        }
        if (file.exists()) {
            result = file.delete();
        }
        return result;
    }

    /* JADX WARNING: Removed duplicated region for block: B:232:0x105a A[SYNTHETIC, Splitter:B:232:0x105a] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x1129  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x11a3  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x121d  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x12a0 A[SYNTHETIC, Splitter:B:335:0x12a0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int PrepareSecurefiles(android.content.Context r32, java.util.zip.ZipFile r33) {
        /*
            r6 = 0
            r19 = 0
            r23 = 0
            r25 = 0
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.io.File r28 = r32.getFilesDir()
            java.lang.String r28 = r28.getAbsolutePath()
            java.lang.String r28 = java.lang.String.valueOf(r28)
            r27.<init>(r28)
            java.lang.String r28 = "/prodexdir"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r4 = r27.toString()
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r27 = r5.isDirectory()
            if (r27 != 0) goto L_0x0030
            r5.mkdir()
        L_0x0030:
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = java.lang.String.valueOf(r4)
            r27.<init>(r28)
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r28 = versionname
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r9 = r27.toString()
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = java.lang.String.valueOf(r4)
            r27.<init>(r28)
            java.lang.String r28 = "/backUp"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r11 = r27.toString()
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = java.lang.String.valueOf(r4)
            r27.<init>(r28)
            java.lang.String r28 = "/firstLoad"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r24 = r27.toString()
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            java.lang.String r28 = versionname
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r8 = r27.toString()
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "libtosprotection."
            r27.<init>(r28)
            java.lang.String r28 = CPUABI
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r28 = ".so"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r10 = r27.toString()
            java.io.RandomAccessFile r26 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0ed0 }
            java.lang.String r27 = "rw"
            r0 = r26
            r1 = r27
            r0.<init>(r9, r1)     // Catch:{ Exception -> 0x0ed0 }
            java.nio.channels.FileChannel r19 = r26.getChannel()     // Catch:{ Exception -> 0x1424, all -> 0x1419 }
            java.nio.channels.FileLock r23 = r19.lock()     // Catch:{ Exception -> 0x1424, all -> 0x1419 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x1424, all -> 0x1419 }
            r7.<init>(r9)     // Catch:{ Exception -> 0x1424, all -> 0x1419 }
            long r28 = r7.length()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r30 = 0
            int r27 = (r28 > r30 ? 1 : (r28 == r30 ? 0 : -1))
            if (r27 == 0) goto L_0x03ad
            r0 = r33
            int r12 = Comparetxtinzip(r0, r8, r7)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27 = 1
            r0 = r27
            if (r12 != r0) goto L_0x0395
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "assets/"
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename5     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.io.File r28 = new java.io.File     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r29 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r29.<init>(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = securename5     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r29 = r29.append(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = r29.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r28.<init>(r29)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r33
            r1 = r27
            r2 = r28
            boolean r27 = checkCopiedFileCrc(r0, r1, r2)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            if (r27 == 0) goto L_0x0395
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "assets/"
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename6     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.io.File r28 = new java.io.File     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r29 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r29.<init>(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = securename6     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r29 = r29.append(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = r29.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r28.<init>(r29)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r33
            r1 = r27
            r2 = r28
            boolean r27 = checkCopiedFileCrc(r0, r1, r2)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            if (r27 == 0) goto L_0x0395
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            r0 = r27
            java.lang.StringBuilder r27 = r0.append(r10)
            java.lang.String r27 = r27.toString()
            r0 = r33
            r1 = r27
            java.util.zip.ZipEntry r18 = r0.getEntry(r1)
            if (r18 == 0) goto L_0x01b1
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = java.lang.String.valueOf(r4)
            r27.<init>(r28)
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r28 = libname
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            long r28 = r18.getSize()
            boolean r27 = isFileValid(r27, r28)
            if (r27 != 0) goto L_0x01b1
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            r0 = r27
            java.lang.StringBuilder r27 = r0.append(r10)
            java.lang.String r27 = r27.toString()
            java.io.File r28 = new java.io.File
            java.lang.StringBuilder r29 = new java.lang.StringBuilder
            java.lang.String r30 = java.lang.String.valueOf(r4)
            r29.<init>(r30)
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r30 = libname
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r29 = r29.toString()
            r28.<init>(r29)
            r0 = r33
            r1 = r27
            r2 = r28
            UnzipFile(r0, r1, r2)
        L_0x01b1:
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            r0 = r27
            java.lang.StringBuilder r27 = r0.append(r10)
            java.lang.String r27 = r27.toString()
            r0 = r33
            r1 = r27
            java.util.zip.ZipEntry r18 = r0.getEntry(r1)
            if (r18 == 0) goto L_0x0227
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = java.lang.String.valueOf(r4)
            r27.<init>(r28)
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r28 = securename6
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            long r28 = r18.getSize()
            boolean r27 = isFileValid(r27, r28)
            if (r27 != 0) goto L_0x0227
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            java.lang.String r28 = securename6
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            java.io.File r28 = new java.io.File
            java.lang.StringBuilder r29 = new java.lang.StringBuilder
            java.lang.String r30 = java.lang.String.valueOf(r4)
            r29.<init>(r30)
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r30 = securename6
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r29 = r29.toString()
            r28.<init>(r29)
            r0 = r33
            r1 = r27
            r2 = r28
            UnzipFile(r0, r1, r2)
        L_0x0227:
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            r0 = r27
            java.lang.StringBuilder r27 = r0.append(r10)
            java.lang.String r27 = r27.toString()
            r0 = r33
            r1 = r27
            java.util.zip.ZipEntry r18 = r0.getEntry(r1)
            if (r18 == 0) goto L_0x029d
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = java.lang.String.valueOf(r4)
            r27.<init>(r28)
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r28 = securename7
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            long r28 = r18.getSize()
            boolean r27 = isFileValid(r27, r28)
            if (r27 != 0) goto L_0x029d
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            java.lang.String r28 = securename7
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            java.io.File r28 = new java.io.File
            java.lang.StringBuilder r29 = new java.lang.StringBuilder
            java.lang.String r30 = java.lang.String.valueOf(r4)
            r29.<init>(r30)
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r30 = securename7
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r29 = r29.toString()
            r28.<init>(r29)
            r0 = r33
            r1 = r27
            r2 = r28
            UnzipFile(r0, r1, r2)
        L_0x029d:
            r0 = r33
            java.util.zip.ZipEntry r18 = r0.getEntry(r8)
            if (r18 == 0) goto L_0x02bf
            long r28 = r18.getSize()
            r0 = r28
            boolean r27 = isFileValid(r9, r0)
            if (r27 != 0) goto L_0x02bf
            java.io.File r27 = new java.io.File
            r0 = r27
            r0.<init>(r9)
            r0 = r33
            r1 = r27
            UnzipFile(r0, r8, r1)
        L_0x02bf:
            if (r23 == 0) goto L_0x02ce
            r23.release()     // Catch:{ IOException -> 0x02d4 }
            if (r19 == 0) goto L_0x02ce
            r19.close()     // Catch:{ IOException -> 0x035d }
            if (r26 == 0) goto L_0x02ce
            r26.close()     // Catch:{ IOException -> 0x038a }
        L_0x02ce:
            r27 = 2
            r25 = r26
            r6 = r7
        L_0x02d3:
            return r27
        L_0x02d4:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x031c }
            if (r19 == 0) goto L_0x02e2
            r19.close()     // Catch:{ IOException -> 0x02e8 }
            if (r26 == 0) goto L_0x02e2
            r26.close()     // Catch:{ IOException -> 0x0312 }
        L_0x02e2:
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x02e8:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x0301 }
            if (r26 == 0) goto L_0x02f1
            r26.close()     // Catch:{ IOException -> 0x02f7 }
        L_0x02f1:
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x02f7:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x0301:
            r27 = move-exception
            if (r26 == 0) goto L_0x0307
            r26.close()     // Catch:{ IOException -> 0x0308 }
        L_0x0307:
            throw r27
        L_0x0308:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x0312:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x031c:
            r27 = move-exception
            if (r19 == 0) goto L_0x0327
            r19.close()     // Catch:{ IOException -> 0x0328 }
            if (r26 == 0) goto L_0x0327
            r26.close()     // Catch:{ IOException -> 0x0352 }
        L_0x0327:
            throw r27
        L_0x0328:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x0341 }
            if (r26 == 0) goto L_0x0331
            r26.close()     // Catch:{ IOException -> 0x0337 }
        L_0x0331:
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x0337:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x0341:
            r27 = move-exception
            if (r26 == 0) goto L_0x0347
            r26.close()     // Catch:{ IOException -> 0x0348 }
        L_0x0347:
            throw r27
        L_0x0348:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x0352:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x035d:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x0378 }
            if (r26 == 0) goto L_0x0366
            r26.close()     // Catch:{ IOException -> 0x036d }
        L_0x0366:
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x036d:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x0378:
            r27 = move-exception
            if (r26 == 0) goto L_0x037e
            r26.close()     // Catch:{ IOException -> 0x037f }
        L_0x037e:
            throw r27
        L_0x037f:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x038a:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x0395:
            r27 = -1
            r0 = r27
            if (r12 == r0) goto L_0x03a1
            r27 = -3
            r0 = r27
            if (r12 != r0) goto L_0x03ad
        L_0x03a1:
            int r27 = android.os.Process.myPid()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            android.os.Process.killProcess(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27 = 0
            java.lang.System.exit(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
        L_0x03ad:
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = libname     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename6     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r13 = -1
            r15 = -1
            r16 = -1
            r14 = -1
            r20 = 0
            r20 = 0
        L_0x03ee:
            int r27 = MAX_DEX_NUM     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r20
            r1 = r27
            if (r0 < r1) goto L_0x06c6
        L_0x03f6:
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename9     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename5     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "assets/"
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename5     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.io.File r28 = new java.io.File     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r29 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r29.<init>(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = securename5     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r29 = r29.append(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = r29.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r28.<init>(r29)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r33
            r1 = r27
            r2 = r28
            UnzipFile(r0, r1, r2)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "assets/"
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = libname     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.io.File r28 = new java.io.File     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r29 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r29.<init>(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = libname     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r29 = r29.append(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = r29.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r28.<init>(r29)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r33
            r1 = r27
            r2 = r28
            UnzipFile(r0, r1, r2)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "assets/"
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename6     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.io.File r28 = new java.io.File     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r29 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r29.<init>(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = securename6     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r29 = r29.append(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = r29.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r28.<init>(r29)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r33
            r1 = r27
            r2 = r28
            UnzipFile(r0, r1, r2)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "assets/"
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename7     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.io.File r28 = new java.io.File     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r29 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r29.<init>(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = securename7     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r29 = r29.append(r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = r29.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r28.<init>(r29)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r33
            r1 = r27
            r2 = r28
            UnzipFile(r0, r1, r2)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.io.File r27 = new java.io.File     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r27
            r0.<init>(r9)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r33
            r1 = r27
            UnzipFile(r0, r8, r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r21 = 0
        L_0x051e:
            r0 = r21
            r1 = r20
            if (r0 < r1) goto L_0x0974
        L_0x0524:
            r22 = 0
        L_0x0526:
            r0 = r22
            r1 = r20
            if (r0 < r1) goto L_0x0c22
        L_0x052c:
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            r0 = r27
            java.lang.StringBuilder r27 = r0.append(r10)
            java.lang.String r27 = r27.toString()
            r0 = r33
            r1 = r27
            java.util.zip.ZipEntry r18 = r0.getEntry(r1)
            if (r18 == 0) goto L_0x05a2
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = java.lang.String.valueOf(r4)
            r27.<init>(r28)
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r28 = libname
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            long r28 = r18.getSize()
            boolean r27 = isFileValid(r27, r28)
            if (r27 != 0) goto L_0x05a2
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            r0 = r27
            java.lang.StringBuilder r27 = r0.append(r10)
            java.lang.String r27 = r27.toString()
            java.io.File r28 = new java.io.File
            java.lang.StringBuilder r29 = new java.lang.StringBuilder
            java.lang.String r30 = java.lang.String.valueOf(r4)
            r29.<init>(r30)
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r30 = libname
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r29 = r29.toString()
            r28.<init>(r29)
            r0 = r33
            r1 = r27
            r2 = r28
            UnzipFile(r0, r1, r2)
        L_0x05a2:
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            r0 = r27
            java.lang.StringBuilder r27 = r0.append(r10)
            java.lang.String r27 = r27.toString()
            r0 = r33
            r1 = r27
            java.util.zip.ZipEntry r18 = r0.getEntry(r1)
            if (r18 == 0) goto L_0x0618
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = java.lang.String.valueOf(r4)
            r27.<init>(r28)
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r28 = securename6
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            long r28 = r18.getSize()
            boolean r27 = isFileValid(r27, r28)
            if (r27 != 0) goto L_0x0618
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            java.lang.String r28 = securename6
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            java.io.File r28 = new java.io.File
            java.lang.StringBuilder r29 = new java.lang.StringBuilder
            java.lang.String r30 = java.lang.String.valueOf(r4)
            r29.<init>(r30)
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r30 = securename6
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r29 = r29.toString()
            r28.<init>(r29)
            r0 = r33
            r1 = r27
            r2 = r28
            UnzipFile(r0, r1, r2)
        L_0x0618:
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            r0 = r27
            java.lang.StringBuilder r27 = r0.append(r10)
            java.lang.String r27 = r27.toString()
            r0 = r33
            r1 = r27
            java.util.zip.ZipEntry r18 = r0.getEntry(r1)
            if (r18 == 0) goto L_0x068e
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = java.lang.String.valueOf(r4)
            r27.<init>(r28)
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r28 = securename7
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            long r28 = r18.getSize()
            boolean r27 = isFileValid(r27, r28)
            if (r27 != 0) goto L_0x068e
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            java.lang.String r28 = securename7
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            java.io.File r28 = new java.io.File
            java.lang.StringBuilder r29 = new java.lang.StringBuilder
            java.lang.String r30 = java.lang.String.valueOf(r4)
            r29.<init>(r30)
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r30 = securename7
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r29 = r29.toString()
            r28.<init>(r29)
            r0 = r33
            r1 = r27
            r2 = r28
            UnzipFile(r0, r1, r2)
        L_0x068e:
            r0 = r33
            java.util.zip.ZipEntry r18 = r0.getEntry(r8)
            if (r18 == 0) goto L_0x06b0
            long r28 = r18.getSize()
            r0 = r28
            boolean r27 = isFileValid(r9, r0)
            if (r27 != 0) goto L_0x06b0
            java.io.File r27 = new java.io.File
            r0 = r27
            r0.<init>(r9)
            r0 = r33
            r1 = r27
            UnzipFile(r0, r8, r1)
        L_0x06b0:
            if (r23 == 0) goto L_0x06bf
            r23.release()     // Catch:{ IOException -> 0x1350 }
            if (r19 == 0) goto L_0x06bf
            r19.close()     // Catch:{ IOException -> 0x13e1 }
            if (r26 == 0) goto L_0x06bf
            r26.close()     // Catch:{ IOException -> 0x140e }
        L_0x06bf:
            r27 = 0
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x06c6:
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename0     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r20
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            int r13 = DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename1     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r20
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            int r15 = DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "odexdir"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename0     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r20
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            int r16 = DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "odexdir"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename8     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r20
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            int r14 = DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename11     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r20
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm64"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename11     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r20
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename14     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r20
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename15     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r20
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm64"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename14     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r20
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm64"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename15     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r20
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27 = -1
            r0 = r27
            if (r0 != r13) goto L_0x0950
            r27 = -1
            r0 = r27
            if (r0 != r15) goto L_0x0950
            r27 = -1
            r0 = r27
            r1 = r16
            if (r0 == r1) goto L_0x03f6
        L_0x0950:
            r27 = -2
            r0 = r27
            if (r0 == r13) goto L_0x0964
            r27 = -2
            r0 = r27
            if (r0 == r15) goto L_0x0964
            r27 = -2
            r0 = r27
            r1 = r16
            if (r0 != r1) goto L_0x0970
        L_0x0964:
            int r27 = android.os.Process.myPid()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            android.os.Process.killProcess(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27 = 0
            java.lang.System.exit(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
        L_0x0970:
            int r20 = r20 + 1
            goto L_0x03ee
        L_0x0974:
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename0     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r21
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            int r13 = DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename1     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r21
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            int r15 = DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "odexdir"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename0     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r21
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            int r16 = DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "odexdir"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename8     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r21
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            int r14 = DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename11     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r21
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm64"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename11     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r21
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename14     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r21
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename15     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r21
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm64"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename14     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r21
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm64"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename15     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r21
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27 = -1
            r0 = r27
            if (r0 != r13) goto L_0x0bfe
            r27 = -1
            r0 = r27
            if (r0 != r15) goto L_0x0bfe
            r27 = -1
            r0 = r27
            r1 = r16
            if (r0 == r1) goto L_0x0524
        L_0x0bfe:
            r27 = -2
            r0 = r27
            if (r0 == r13) goto L_0x0c12
            r27 = -2
            r0 = r27
            if (r0 == r15) goto L_0x0c12
            r27 = -2
            r0 = r27
            r1 = r16
            if (r0 != r1) goto L_0x0c1e
        L_0x0c12:
            int r27 = android.os.Process.myPid()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            android.os.Process.killProcess(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27 = 0
            java.lang.System.exit(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
        L_0x0c1e:
            int r21 = r21 + 1
            goto L_0x051e
        L_0x0c22:
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r24)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename0     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r22
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            int r13 = DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r24)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename1     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r22
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            int r15 = DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r24)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "odexdir"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename0     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r22
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            int r16 = DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r24)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "odexdir"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename8     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r22
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            int r14 = DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r24)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename11     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r22
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r24)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm64"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename11     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r22
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r24)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename14     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r22
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r24)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename15     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r22
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r24)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm64"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename14     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r22
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = java.lang.String.valueOf(r24)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27.<init>(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "oat/arm64"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = securename15     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r29 = "."
            java.lang.StringBuilder r30 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r31 = "_"
            r30.<init>(r31)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r0 = r30
            r1 = r22
            java.lang.StringBuilder r30 = r0.append(r1)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r30 = r30.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r28 = CreatenewFileName(r28, r29, r30)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.StringBuilder r27 = r27.append(r28)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            java.lang.String r27 = r27.toString()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            DeleteFile(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27 = -1
            r0 = r27
            if (r0 != r13) goto L_0x0eac
            r27 = -1
            r0 = r27
            if (r0 != r15) goto L_0x0eac
            r27 = -1
            r0 = r27
            r1 = r16
            if (r0 == r1) goto L_0x052c
        L_0x0eac:
            r27 = -2
            r0 = r27
            if (r0 == r13) goto L_0x0ec0
            r27 = -2
            r0 = r27
            if (r0 == r15) goto L_0x0ec0
            r27 = -2
            r0 = r27
            r1 = r16
            if (r0 != r1) goto L_0x0ecc
        L_0x0ec0:
            int r27 = android.os.Process.myPid()     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            android.os.Process.killProcess(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
            r27 = 0
            java.lang.System.exit(r27)     // Catch:{ Exception -> 0x1429, all -> 0x141e }
        L_0x0ecc:
            int r22 = r22 + 1
            goto L_0x0526
        L_0x0ed0:
            r17 = move-exception
        L_0x0ed1:
            r17.printStackTrace()     // Catch:{ all -> 0x110d }
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            r0 = r27
            java.lang.StringBuilder r27 = r0.append(r10)
            java.lang.String r27 = r27.toString()
            r0 = r33
            r1 = r27
            java.util.zip.ZipEntry r18 = r0.getEntry(r1)
            if (r18 == 0) goto L_0x0f4a
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = java.lang.String.valueOf(r4)
            r27.<init>(r28)
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r28 = libname
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            long r28 = r18.getSize()
            boolean r27 = isFileValid(r27, r28)
            if (r27 != 0) goto L_0x0f4a
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            r0 = r27
            java.lang.StringBuilder r27 = r0.append(r10)
            java.lang.String r27 = r27.toString()
            java.io.File r28 = new java.io.File
            java.lang.StringBuilder r29 = new java.lang.StringBuilder
            java.lang.String r30 = java.lang.String.valueOf(r4)
            r29.<init>(r30)
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r30 = libname
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r29 = r29.toString()
            r28.<init>(r29)
            r0 = r33
            r1 = r27
            r2 = r28
            UnzipFile(r0, r1, r2)
        L_0x0f4a:
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            r0 = r27
            java.lang.StringBuilder r27 = r0.append(r10)
            java.lang.String r27 = r27.toString()
            r0 = r33
            r1 = r27
            java.util.zip.ZipEntry r18 = r0.getEntry(r1)
            if (r18 == 0) goto L_0x0fc0
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = java.lang.String.valueOf(r4)
            r27.<init>(r28)
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r28 = securename6
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            long r28 = r18.getSize()
            boolean r27 = isFileValid(r27, r28)
            if (r27 != 0) goto L_0x0fc0
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            java.lang.String r28 = securename6
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            java.io.File r28 = new java.io.File
            java.lang.StringBuilder r29 = new java.lang.StringBuilder
            java.lang.String r30 = java.lang.String.valueOf(r4)
            r29.<init>(r30)
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r30 = securename6
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r29 = r29.toString()
            r28.<init>(r29)
            r0 = r33
            r1 = r27
            r2 = r28
            UnzipFile(r0, r1, r2)
        L_0x0fc0:
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            r0 = r27
            java.lang.StringBuilder r27 = r0.append(r10)
            java.lang.String r27 = r27.toString()
            r0 = r33
            r1 = r27
            java.util.zip.ZipEntry r18 = r0.getEntry(r1)
            if (r18 == 0) goto L_0x1036
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = java.lang.String.valueOf(r4)
            r27.<init>(r28)
            java.lang.String r28 = "/"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r28 = securename7
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            long r28 = r18.getSize()
            boolean r27 = isFileValid(r27, r28)
            if (r27 != 0) goto L_0x1036
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            java.lang.String r28 = "assets/"
            r27.<init>(r28)
            java.lang.String r28 = securename7
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            java.io.File r28 = new java.io.File
            java.lang.StringBuilder r29 = new java.lang.StringBuilder
            java.lang.String r30 = java.lang.String.valueOf(r4)
            r29.<init>(r30)
            java.lang.String r30 = "/"
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r30 = securename7
            java.lang.StringBuilder r29 = r29.append(r30)
            java.lang.String r29 = r29.toString()
            r28.<init>(r29)
            r0 = r33
            r1 = r27
            r2 = r28
            UnzipFile(r0, r1, r2)
        L_0x1036:
            r0 = r33
            java.util.zip.ZipEntry r18 = r0.getEntry(r8)
            if (r18 == 0) goto L_0x1058
            long r28 = r18.getSize()
            r0 = r28
            boolean r27 = isFileValid(r9, r0)
            if (r27 != 0) goto L_0x1058
            java.io.File r27 = new java.io.File
            r0 = r27
            r0.<init>(r9)
            r0 = r33
            r1 = r27
            UnzipFile(r0, r8, r1)
        L_0x1058:
            if (r23 == 0) goto L_0x1067
            r23.release()     // Catch:{ IOException -> 0x106b }
            if (r19 == 0) goto L_0x1067
            r19.close()     // Catch:{ IOException -> 0x10e1 }
            if (r25 == 0) goto L_0x1067
            r25.close()     // Catch:{ IOException -> 0x1105 }
        L_0x1067:
            r27 = -1
            goto L_0x02d3
        L_0x106b:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x10a9 }
            if (r19 == 0) goto L_0x1079
            r19.close()     // Catch:{ IOException -> 0x107d }
            if (r25 == 0) goto L_0x1079
            r25.close()     // Catch:{ IOException -> 0x10a1 }
        L_0x1079:
            r27 = -1
            goto L_0x02d3
        L_0x107d:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x1092 }
            if (r25 == 0) goto L_0x1086
            r25.close()     // Catch:{ IOException -> 0x108a }
        L_0x1086:
            r27 = -1
            goto L_0x02d3
        L_0x108a:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x1092:
            r27 = move-exception
            if (r25 == 0) goto L_0x1098
            r25.close()     // Catch:{ IOException -> 0x1099 }
        L_0x1098:
            throw r27
        L_0x1099:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x10a1:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x10a9:
            r27 = move-exception
            if (r19 == 0) goto L_0x10b4
            r19.close()     // Catch:{ IOException -> 0x10b5 }
            if (r25 == 0) goto L_0x10b4
            r25.close()     // Catch:{ IOException -> 0x10d9 }
        L_0x10b4:
            throw r27
        L_0x10b5:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x10ca }
            if (r25 == 0) goto L_0x10be
            r25.close()     // Catch:{ IOException -> 0x10c2 }
        L_0x10be:
            r27 = -1
            goto L_0x02d3
        L_0x10c2:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x10ca:
            r27 = move-exception
            if (r25 == 0) goto L_0x10d0
            r25.close()     // Catch:{ IOException -> 0x10d1 }
        L_0x10d0:
            throw r27
        L_0x10d1:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x10d9:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x10e1:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x10f6 }
            if (r25 == 0) goto L_0x10ea
            r25.close()     // Catch:{ IOException -> 0x10ee }
        L_0x10ea:
            r27 = -1
            goto L_0x02d3
        L_0x10ee:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x10f6:
            r27 = move-exception
            if (r25 == 0) goto L_0x10fc
            r25.close()     // Catch:{ IOException -> 0x10fd }
        L_0x10fc:
            throw r27
        L_0x10fd:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x1105:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x110d:
            r27 = move-exception
        L_0x110e:
            java.lang.StringBuilder r28 = new java.lang.StringBuilder
            java.lang.String r29 = "assets/"
            r28.<init>(r29)
            r0 = r28
            java.lang.StringBuilder r28 = r0.append(r10)
            java.lang.String r28 = r28.toString()
            r0 = r33
            r1 = r28
            java.util.zip.ZipEntry r18 = r0.getEntry(r1)
            if (r18 == 0) goto L_0x1188
            java.lang.StringBuilder r28 = new java.lang.StringBuilder
            java.lang.String r29 = java.lang.String.valueOf(r4)
            r28.<init>(r29)
            java.lang.String r29 = "/"
            java.lang.StringBuilder r28 = r28.append(r29)
            java.lang.String r29 = libname
            java.lang.StringBuilder r28 = r28.append(r29)
            java.lang.String r28 = r28.toString()
            long r30 = r18.getSize()
            r0 = r28
            r1 = r30
            boolean r28 = isFileValid(r0, r1)
            if (r28 != 0) goto L_0x1188
            java.lang.StringBuilder r28 = new java.lang.StringBuilder
            java.lang.String r29 = "assets/"
            r28.<init>(r29)
            r0 = r28
            java.lang.StringBuilder r28 = r0.append(r10)
            java.lang.String r28 = r28.toString()
            java.io.File r29 = new java.io.File
            java.lang.StringBuilder r30 = new java.lang.StringBuilder
            java.lang.String r31 = java.lang.String.valueOf(r4)
            r30.<init>(r31)
            java.lang.String r31 = "/"
            java.lang.StringBuilder r30 = r30.append(r31)
            java.lang.String r31 = libname
            java.lang.StringBuilder r30 = r30.append(r31)
            java.lang.String r30 = r30.toString()
            r29.<init>(r30)
            r0 = r33
            r1 = r28
            r2 = r29
            UnzipFile(r0, r1, r2)
        L_0x1188:
            java.lang.StringBuilder r28 = new java.lang.StringBuilder
            java.lang.String r29 = "assets/"
            r28.<init>(r29)
            r0 = r28
            java.lang.StringBuilder r28 = r0.append(r10)
            java.lang.String r28 = r28.toString()
            r0 = r33
            r1 = r28
            java.util.zip.ZipEntry r18 = r0.getEntry(r1)
            if (r18 == 0) goto L_0x1202
            java.lang.StringBuilder r28 = new java.lang.StringBuilder
            java.lang.String r29 = java.lang.String.valueOf(r4)
            r28.<init>(r29)
            java.lang.String r29 = "/"
            java.lang.StringBuilder r28 = r28.append(r29)
            java.lang.String r29 = securename6
            java.lang.StringBuilder r28 = r28.append(r29)
            java.lang.String r28 = r28.toString()
            long r30 = r18.getSize()
            r0 = r28
            r1 = r30
            boolean r28 = isFileValid(r0, r1)
            if (r28 != 0) goto L_0x1202
            java.lang.StringBuilder r28 = new java.lang.StringBuilder
            java.lang.String r29 = "assets/"
            r28.<init>(r29)
            java.lang.String r29 = securename6
            java.lang.StringBuilder r28 = r28.append(r29)
            java.lang.String r28 = r28.toString()
            java.io.File r29 = new java.io.File
            java.lang.StringBuilder r30 = new java.lang.StringBuilder
            java.lang.String r31 = java.lang.String.valueOf(r4)
            r30.<init>(r31)
            java.lang.String r31 = "/"
            java.lang.StringBuilder r30 = r30.append(r31)
            java.lang.String r31 = securename6
            java.lang.StringBuilder r30 = r30.append(r31)
            java.lang.String r30 = r30.toString()
            r29.<init>(r30)
            r0 = r33
            r1 = r28
            r2 = r29
            UnzipFile(r0, r1, r2)
        L_0x1202:
            java.lang.StringBuilder r28 = new java.lang.StringBuilder
            java.lang.String r29 = "assets/"
            r28.<init>(r29)
            r0 = r28
            java.lang.StringBuilder r28 = r0.append(r10)
            java.lang.String r28 = r28.toString()
            r0 = r33
            r1 = r28
            java.util.zip.ZipEntry r18 = r0.getEntry(r1)
            if (r18 == 0) goto L_0x127c
            java.lang.StringBuilder r28 = new java.lang.StringBuilder
            java.lang.String r29 = java.lang.String.valueOf(r4)
            r28.<init>(r29)
            java.lang.String r29 = "/"
            java.lang.StringBuilder r28 = r28.append(r29)
            java.lang.String r29 = securename7
            java.lang.StringBuilder r28 = r28.append(r29)
            java.lang.String r28 = r28.toString()
            long r30 = r18.getSize()
            r0 = r28
            r1 = r30
            boolean r28 = isFileValid(r0, r1)
            if (r28 != 0) goto L_0x127c
            java.lang.StringBuilder r28 = new java.lang.StringBuilder
            java.lang.String r29 = "assets/"
            r28.<init>(r29)
            java.lang.String r29 = securename7
            java.lang.StringBuilder r28 = r28.append(r29)
            java.lang.String r28 = r28.toString()
            java.io.File r29 = new java.io.File
            java.lang.StringBuilder r30 = new java.lang.StringBuilder
            java.lang.String r31 = java.lang.String.valueOf(r4)
            r30.<init>(r31)
            java.lang.String r31 = "/"
            java.lang.StringBuilder r30 = r30.append(r31)
            java.lang.String r31 = securename7
            java.lang.StringBuilder r30 = r30.append(r31)
            java.lang.String r30 = r30.toString()
            r29.<init>(r30)
            r0 = r33
            r1 = r28
            r2 = r29
            UnzipFile(r0, r1, r2)
        L_0x127c:
            r0 = r33
            java.util.zip.ZipEntry r18 = r0.getEntry(r8)
            if (r18 == 0) goto L_0x129e
            long r28 = r18.getSize()
            r0 = r28
            boolean r28 = isFileValid(r9, r0)
            if (r28 != 0) goto L_0x129e
            java.io.File r28 = new java.io.File
            r0 = r28
            r0.<init>(r9)
            r0 = r33
            r1 = r28
            UnzipFile(r0, r8, r1)
        L_0x129e:
            if (r23 == 0) goto L_0x12ad
            r23.release()     // Catch:{ IOException -> 0x12ae }
            if (r19 == 0) goto L_0x12ad
            r19.close()     // Catch:{ IOException -> 0x1324 }
            if (r25 == 0) goto L_0x12ad
            r25.close()     // Catch:{ IOException -> 0x1348 }
        L_0x12ad:
            throw r27
        L_0x12ae:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x12ec }
            if (r19 == 0) goto L_0x12bc
            r19.close()     // Catch:{ IOException -> 0x12c0 }
            if (r25 == 0) goto L_0x12bc
            r25.close()     // Catch:{ IOException -> 0x12e4 }
        L_0x12bc:
            r27 = -1
            goto L_0x02d3
        L_0x12c0:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x12d5 }
            if (r25 == 0) goto L_0x12c9
            r25.close()     // Catch:{ IOException -> 0x12cd }
        L_0x12c9:
            r27 = -1
            goto L_0x02d3
        L_0x12cd:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x12d5:
            r27 = move-exception
            if (r25 == 0) goto L_0x12db
            r25.close()     // Catch:{ IOException -> 0x12dc }
        L_0x12db:
            throw r27
        L_0x12dc:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x12e4:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x12ec:
            r27 = move-exception
            if (r19 == 0) goto L_0x12f7
            r19.close()     // Catch:{ IOException -> 0x12f8 }
            if (r25 == 0) goto L_0x12f7
            r25.close()     // Catch:{ IOException -> 0x131c }
        L_0x12f7:
            throw r27
        L_0x12f8:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x130d }
            if (r25 == 0) goto L_0x1301
            r25.close()     // Catch:{ IOException -> 0x1305 }
        L_0x1301:
            r27 = -1
            goto L_0x02d3
        L_0x1305:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x130d:
            r27 = move-exception
            if (r25 == 0) goto L_0x1313
            r25.close()     // Catch:{ IOException -> 0x1314 }
        L_0x1313:
            throw r27
        L_0x1314:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x131c:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x1324:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x1339 }
            if (r25 == 0) goto L_0x132d
            r25.close()     // Catch:{ IOException -> 0x1331 }
        L_0x132d:
            r27 = -1
            goto L_0x02d3
        L_0x1331:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x1339:
            r27 = move-exception
            if (r25 == 0) goto L_0x133f
            r25.close()     // Catch:{ IOException -> 0x1340 }
        L_0x133f:
            throw r27
        L_0x1340:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x1348:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            goto L_0x02d3
        L_0x1350:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x139d }
            if (r19 == 0) goto L_0x135e
            r19.close()     // Catch:{ IOException -> 0x1365 }
            if (r26 == 0) goto L_0x135e
            r26.close()     // Catch:{ IOException -> 0x1392 }
        L_0x135e:
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x1365:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x1380 }
            if (r26 == 0) goto L_0x136e
            r26.close()     // Catch:{ IOException -> 0x1375 }
        L_0x136e:
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x1375:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x1380:
            r27 = move-exception
            if (r26 == 0) goto L_0x1386
            r26.close()     // Catch:{ IOException -> 0x1387 }
        L_0x1386:
            throw r27
        L_0x1387:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x1392:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x139d:
            r27 = move-exception
            if (r19 == 0) goto L_0x13a8
            r19.close()     // Catch:{ IOException -> 0x13a9 }
            if (r26 == 0) goto L_0x13a8
            r26.close()     // Catch:{ IOException -> 0x13d6 }
        L_0x13a8:
            throw r27
        L_0x13a9:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x13c4 }
            if (r26 == 0) goto L_0x13b2
            r26.close()     // Catch:{ IOException -> 0x13b9 }
        L_0x13b2:
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x13b9:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x13c4:
            r27 = move-exception
            if (r26 == 0) goto L_0x13ca
            r26.close()     // Catch:{ IOException -> 0x13cb }
        L_0x13ca:
            throw r27
        L_0x13cb:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x13d6:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x13e1:
            r17 = move-exception
            r17.printStackTrace()     // Catch:{ all -> 0x13fc }
            if (r26 == 0) goto L_0x13ea
            r26.close()     // Catch:{ IOException -> 0x13f1 }
        L_0x13ea:
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x13f1:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x13fc:
            r27 = move-exception
            if (r26 == 0) goto L_0x1402
            r26.close()     // Catch:{ IOException -> 0x1403 }
        L_0x1402:
            throw r27
        L_0x1403:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x140e:
            r17 = move-exception
            r17.printStackTrace()
            r27 = -1
            r25 = r26
            r6 = r7
            goto L_0x02d3
        L_0x1419:
            r27 = move-exception
            r25 = r26
            goto L_0x110e
        L_0x141e:
            r27 = move-exception
            r25 = r26
            r6 = r7
            goto L_0x110e
        L_0x1424:
            r17 = move-exception
            r25 = r26
            goto L_0x0ed1
        L_0x1429:
            r17 = move-exception
            r25 = r26
            r6 = r7
            goto L_0x0ed1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wrapper.proxyapplication.Util.PrepareSecurefiles(android.content.Context, java.util.zip.ZipFile):int");
    }

    private static boolean isFileValid(String path, long length) {
        File tmpfile = new File(path);
        if (!tmpfile.exists() || tmpfile.length() != length) {
            return false;
        }
        return true;
    }

    public static void getCPUABI() {
        if (CPUABI == null) {
            try {
                String os_cpuabi = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.product.cpu.abi").getInputStream())).readLine();
                if (os_cpuabi.contains("x86")) {
                    CPUABI = "x86";
                } else if (os_cpuabi.contains("armeabi-v7a") || os_cpuabi.contains("arm64-v8a")) {
                    CPUABI = "armeabi-v7a";
                } else {
                    CPUABI = "armeabi";
                }
            } catch (Exception e) {
                CPUABI = "armeabi";
            }
        }
    }

    public static long getCRC32(File fileUri) {
        CheckedInputStream checkedinputstream;
        CRC32 crc32 = new CRC32();
        long crc = 0;
        try {
            BufferedInputStream bufbr = new BufferedInputStream(new FileInputStream(fileUri));
            try {
                checkedinputstream = new CheckedInputStream(bufbr, crc32);
            } catch (FileNotFoundException e) {
                e = e;
                BufferedInputStream bufferedInputStream = bufbr;
                e.printStackTrace();
                return crc;
            } catch (IOException e2) {
                e = e2;
                BufferedInputStream bufferedInputStream2 = bufbr;
                e.printStackTrace();
                return crc;
            }
            try {
                do {
                } while (checkedinputstream.read(new byte[65536]) >= 0);
                crc = checkedinputstream.getChecksum().getValue();
                checkedinputstream.close();
                CheckedInputStream checkedInputStream = checkedinputstream;
                BufferedInputStream bufferedInputStream3 = bufbr;
            } catch (FileNotFoundException e3) {
                e = e3;
                CheckedInputStream checkedInputStream2 = checkedinputstream;
                BufferedInputStream bufferedInputStream4 = bufbr;
                e.printStackTrace();
                return crc;
            } catch (IOException e4) {
                e = e4;
                CheckedInputStream checkedInputStream3 = checkedinputstream;
                BufferedInputStream bufferedInputStream5 = bufbr;
                e.printStackTrace();
                return crc;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
            e.printStackTrace();
            return crc;
        } catch (IOException e6) {
            e = e6;
            e.printStackTrace();
            return crc;
        }
        return crc;
    }

    public static String CreatenewFileName(String Oldfilename, String SplitString, String InsertString) {
        int index = Oldfilename.lastIndexOf(SplitString);
        if (index >= 0) {
            return String.valueOf(Oldfilename.substring(ERROR_FALSE, index)) + InsertString + Oldfilename.substring(index, Oldfilename.length());
        }
        return null;
    }

    public static boolean SafeUnzipFile(ZipFile zf, String filepathinzip, File fileinfiledir) {
        return SafeUnzipFile(zf, filepathinzip, fileinfiledir, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0101 A[SYNTHETIC, Splitter:B:124:0x0101] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean SafeUnzipFile(java.util.zip.ZipFile r11, java.lang.String r12, java.io.File r13, long r14) {
        /*
            r0 = 0
            r3 = 0
            r6 = 0
            r2 = 0
            r5 = 0
            java.util.zip.ZipEntry r6 = r11.getEntry(r12)     // Catch:{ Exception -> 0x00c5 }
            if (r6 != 0) goto L_0x003b
            if (r0 == 0) goto L_0x0015
            r0.close()     // Catch:{ IOException -> 0x0017 }
            if (r3 == 0) goto L_0x0015
            r3.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0015:
            r7 = 0
        L_0x0016:
            return r7
        L_0x0017:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0020
            r3.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0020:
            r7 = 0
            goto L_0x0016
        L_0x0022:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x0028:
            r7 = move-exception
            if (r3 == 0) goto L_0x002e
            r3.close()     // Catch:{ IOException -> 0x002f }
        L_0x002e:
            throw r7
        L_0x002f:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x0035:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x003b:
            r8 = 0
            int r7 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0079
            long r8 = r6.getCrc()     // Catch:{ Exception -> 0x00c5 }
            int r7 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            if (r0 == 0) goto L_0x0053
            r0.close()     // Catch:{ IOException -> 0x0055 }
            if (r3 == 0) goto L_0x0053
            r3.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0053:
            r7 = 1
            goto L_0x0016
        L_0x0055:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x005e
            r3.close()     // Catch:{ IOException -> 0x0060 }
        L_0x005e:
            r7 = 0
            goto L_0x0016
        L_0x0060:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x0066:
            r7 = move-exception
            if (r3 == 0) goto L_0x006c
            r3.close()     // Catch:{ IOException -> 0x006d }
        L_0x006c:
            throw r7
        L_0x006d:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x0073:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x0079:
            r5 = 1
            byte[] r2 = UnzipFile(r11, r6)     // Catch:{ Exception -> 0x00c5 }
            if (r5 == 0) goto L_0x0090
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00c5 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00c5 }
            r7.<init>(r13)     // Catch:{ Exception -> 0x00c5 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x00c5 }
            r7 = 0
            int r8 = r2.length     // Catch:{ Exception -> 0x0135, all -> 0x0132 }
            r1.write(r2, r7, r8)     // Catch:{ Exception -> 0x0135, all -> 0x0132 }
            r0 = r1
        L_0x0090:
            if (r0 == 0) goto L_0x009a
            r0.close()     // Catch:{ IOException -> 0x009d }
            if (r3 == 0) goto L_0x009a
            r3.close()     // Catch:{ IOException -> 0x00be }
        L_0x009a:
            r7 = 1
            goto L_0x0016
        L_0x009d:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x00a6
            r3.close()     // Catch:{ IOException -> 0x00a9 }
        L_0x00a6:
            r7 = 0
            goto L_0x0016
        L_0x00a9:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x00b0:
            r7 = move-exception
            if (r3 == 0) goto L_0x00b6
            r3.close()     // Catch:{ IOException -> 0x00b7 }
        L_0x00b6:
            throw r7
        L_0x00b7:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x00be:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x00c5:
            r4 = move-exception
        L_0x00c6:
            r4.printStackTrace()     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x00d3
            r0.close()     // Catch:{ IOException -> 0x00d6 }
            if (r3 == 0) goto L_0x00d3
            r3.close()     // Catch:{ IOException -> 0x00f7 }
        L_0x00d3:
            r7 = 0
            goto L_0x0016
        L_0x00d6:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x00e9 }
            if (r3 == 0) goto L_0x00df
            r3.close()     // Catch:{ IOException -> 0x00e2 }
        L_0x00df:
            r7 = 0
            goto L_0x0016
        L_0x00e2:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x00e9:
            r7 = move-exception
            if (r3 == 0) goto L_0x00ef
            r3.close()     // Catch:{ IOException -> 0x00f0 }
        L_0x00ef:
            throw r7
        L_0x00f0:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x00f7:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x00fe:
            r7 = move-exception
        L_0x00ff:
            if (r0 == 0) goto L_0x0109
            r0.close()     // Catch:{ IOException -> 0x010a }
            if (r3 == 0) goto L_0x0109
            r3.close()     // Catch:{ IOException -> 0x012b }
        L_0x0109:
            throw r7
        L_0x010a:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x011d }
            if (r3 == 0) goto L_0x0113
            r3.close()     // Catch:{ IOException -> 0x0116 }
        L_0x0113:
            r7 = 0
            goto L_0x0016
        L_0x0116:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x011d:
            r7 = move-exception
            if (r3 == 0) goto L_0x0123
            r3.close()     // Catch:{ IOException -> 0x0124 }
        L_0x0123:
            throw r7
        L_0x0124:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x012b:
            r4 = move-exception
            r4.printStackTrace()
            r7 = 0
            goto L_0x0016
        L_0x0132:
            r7 = move-exception
            r0 = r1
            goto L_0x00ff
        L_0x0135:
            r4 = move-exception
            r0 = r1
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wrapper.proxyapplication.Util.SafeUnzipFile(java.util.zip.ZipFile, java.lang.String, java.io.File, long):boolean");
    }

    public static byte[] UnzipFile(ZipFile zf, ZipEntry ze) throws IOException {
        byte[] buf = new byte[((int) ze.getSize())];
        BufferedInputStream bufbr = new BufferedInputStream(zf.getInputStream(ze));
        int totallen = ERROR_FALSE;
        do {
            int readlen = bufbr.read(buf, totallen, ((int) ze.getSize()) - totallen);
            if (readlen < 0) {
                break;
            }
            totallen += readlen;
        } while (((long) totallen) != ze.getSize());
        if (totallen == ((int) ze.getSize())) {
            return buf;
        }
        throw new IOException("incorrect zip file size");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC, Splitter:B:20:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0045 A[SYNTHETIC, Splitter:B:28:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0051 A[SYNTHETIC, Splitter:B:34:0x0051] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0040=Splitter:B:25:0x0040, B:17:0x0031=Splitter:B:17:0x0031} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long getFileCRC32(java.io.File r12) {
        /*
            r8 = -1
            long r10 = r12.length()
            int r10 = (int) r10
            byte[] r5 = new byte[r10]
            r3 = 0
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x003f }
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x003f }
            r10.<init>(r12)     // Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x003f }
            r4.<init>(r10)     // Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x003f }
            r7 = 0
        L_0x001a:
            int r6 = r4.read(r5)     // Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x0063, all -> 0x0060 }
            if (r6 >= 0) goto L_0x002b
            long r8 = r0.getValue()     // Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x0063, all -> 0x0060 }
            if (r4 == 0) goto L_0x005e
            r4.close()     // Catch:{ IOException -> 0x005a }
            r3 = r4
        L_0x002a:
            return r8
        L_0x002b:
            r0.update(r5)     // Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x0063, all -> 0x0060 }
            int r7 = r7 + r6
            goto L_0x001a
        L_0x0030:
            r2 = move-exception
        L_0x0031:
            r2.printStackTrace()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x002a
            r3.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x002a
        L_0x003a:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x002a
        L_0x003f:
            r1 = move-exception
        L_0x0040:
            r1.printStackTrace()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x002a
            r3.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x002a
        L_0x0049:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x002a
        L_0x004e:
            r10 = move-exception
        L_0x004f:
            if (r3 == 0) goto L_0x0054
            r3.close()     // Catch:{ IOException -> 0x0055 }
        L_0x0054:
            throw r10
        L_0x0055:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0054
        L_0x005a:
            r1 = move-exception
            r1.printStackTrace()
        L_0x005e:
            r3 = r4
            goto L_0x002a
        L_0x0060:
            r10 = move-exception
            r3 = r4
            goto L_0x004f
        L_0x0063:
            r1 = move-exception
            r3 = r4
            goto L_0x0040
        L_0x0066:
            r2 = move-exception
            r3 = r4
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wrapper.proxyapplication.Util.getFileCRC32(java.io.File):long");
    }

    private static boolean checkCopiedFileCrc(ZipFile zf, String filepathinzip, File file) {
        long crc = getFileCRC32(file);
        if (crc == -1) {
            return false;
        }
        try {
            ZipEntry ze = zf.getEntry(filepathinzip);
            if (ze == null || crc == 0 || ze.getCrc() != crc) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
