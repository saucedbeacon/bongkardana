package com.alibaba.griver.image.framework.utils;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class BFileUtils {
    public static boolean safeCopyToFile(InputStream inputStream, File file) {
        if (file == null) {
            return false;
        }
        a(file);
        File b = b(file);
        boolean copyToFile = copyToFile(inputStream, b);
        if (!copyToFile) {
            return copyToFile;
        }
        a(file);
        boolean renameTo = b.renameTo(file);
        StringBuilder sb = new StringBuilder("safeCopyToFile tmpFile: ");
        sb.append(b);
        sb.append(", dstFile: ");
        sb.append(file);
        RVLogger.d(sb.toString());
        return renameTo;
    }

    private static void a(File file) {
        boolean delete;
        if (file.exists() && file.isFile() && !delete) {
            StringBuilder sb = new StringBuilder("deleteFile file: ");
            sb.append(file);
            sb.append(", ret? ");
            sb.append((delete = file.delete()));
            RVLogger.d(sb.toString());
            throw new IOException("delete dstFile failed!!");
        }
    }

    private static File b(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        sb.append(".");
        sb.append(System.nanoTime());
        File file2 = new File(sb.toString());
        if (file2.exists()) {
            boolean delete = file2.delete();
            if (!delete) {
                StringBuilder sb2 = new StringBuilder("createTmpFile del exists file: ");
                sb2.append(file2);
                sb2.append(", ret: ");
                sb2.append(delete);
                RVLogger.d(sb2.toString());
                throw new IOException("delete tmp file error!!!");
            }
        } else {
            file2.getParentFile().mkdirs();
        }
        file2.createNewFile();
        return file2;
    }

    public static boolean copyToFile(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        try {
            a(file);
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (IOException unused) {
            return false;
        } catch (Throwable th) {
            fileOutputStream.flush();
            fileOutputStream.close();
            throw th;
        }
    }

    public static boolean checkFile(File file) {
        return file != null && file.exists();
    }

    public static boolean mkdirs(File file) {
        boolean z = false;
        if (file == null) {
            return false;
        }
        if (file.exists() && file.isDirectory()) {
            return true;
        }
        File file2 = file;
        while (file2 != null) {
            z = file.mkdirs();
            if (!z) {
                if (file2.exists() && file2.isFile()) {
                    String parent = file2.getParent();
                    StringBuilder sb = new StringBuilder();
                    sb.append(file2.getName());
                    sb.append("_");
                    sb.append(System.currentTimeMillis());
                    if (!file2.renameTo(new File(parent, sb.toString()))) {
                        break;
                    }
                } else {
                    file2 = file2.getParentFile();
                }
            } else {
                break;
            }
        }
        return z;
    }

    public static boolean delete(File file) {
        if (file != null) {
            if (file.isFile() && file.exists()) {
                return file.delete();
            }
            if (file.isDirectory() && file.exists()) {
                File[] listFiles = file.listFiles();
                boolean z = true;
                if (listFiles != null && listFiles.length > 0) {
                    for (File delete : listFiles) {
                        z &= delete(delete);
                    }
                }
                return file.delete() & z;
            }
        }
        return false;
    }
}
