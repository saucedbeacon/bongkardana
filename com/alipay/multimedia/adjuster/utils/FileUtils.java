package com.alipay.multimedia.adjuster.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtils {
    private static final Log logger = Log.getLogger(com.alibaba.griver.image.framework.utils.FileUtils.TAG);

    public static boolean copyToFile(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        try {
            deleteFile(file);
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

    public static boolean safeCopyToFile(InputStream inputStream, File file) {
        if (file == null) {
            return false;
        }
        deleteFile(file);
        File createTmpFile = createTmpFile(file);
        boolean copyToFile = copyToFile(inputStream, createTmpFile);
        if (!copyToFile) {
            return copyToFile;
        }
        deleteFile(file);
        boolean renameTo = createTmpFile.renameTo(file);
        Log log = logger;
        StringBuilder sb = new StringBuilder("safeCopyToFile tmpFile: ");
        sb.append(createTmpFile);
        sb.append(", dstFile: ");
        sb.append(file);
        log.d(sb.toString(), new Object[0]);
        return renameTo;
    }

    private static void deleteFile(File file) {
        boolean delete;
        if (file.exists() && file.isFile() && !delete) {
            Log log = logger;
            StringBuilder sb = new StringBuilder("deleteFile file: ");
            sb.append(file);
            sb.append(", ret? ");
            sb.append((delete = file.delete()));
            log.d(sb.toString(), new Object[0]);
            throw new IOException("delete dstFile failed!!");
        }
    }

    private static File createTmpFile(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        sb.append(".");
        sb.append(System.nanoTime());
        File file2 = new File(sb.toString());
        if (file2.exists()) {
            boolean delete = file2.delete();
            if (!delete) {
                Log log = logger;
                StringBuilder sb2 = new StringBuilder("createTmpFile del exists file: ");
                sb2.append(file2);
                sb2.append(", ret: ");
                sb2.append(delete);
                log.d(sb2.toString(), new Object[0]);
                throw new IOException("delete tmp file error!!!");
            }
        } else {
            file2.getParentFile().mkdirs();
        }
        file2.createNewFile();
        return file2;
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

    public static void scanPictureAsync(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                if (PathUtils.isContentUriPath(str)) {
                    intent.setData(Uri.parse(str));
                } else {
                    intent.setData(Uri.fromFile(new File(str)));
                }
                context.sendBroadcast(intent);
            } catch (Exception e) {
                Log log = logger;
                StringBuilder sb = new StringBuilder("scanPictureAsync exp: ");
                sb.append(e.toString());
                log.d(sb.toString(), new Object[0]);
            }
        }
    }
}
