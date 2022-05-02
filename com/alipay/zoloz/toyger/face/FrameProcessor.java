package com.alipay.zoloz.toyger.face;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Environment;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class FrameProcessor {
    public static final SimpleDateFormat DATE_FORMAT2 = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss-SSS", Locale.US);
    private static final boolean SAVE_BITMAP = false;
    private static final String TAG = "FrameProcessor";
    private TGFrame mTgFrame;

    static void saveBitmap(TGFrame tGFrame, ToygerFaceAttr toygerFaceAttr, String str) {
    }

    public static String getDetailDateFormat(long j) {
        String format;
        synchronized (DATE_FORMAT2) {
            format = DATE_FORMAT2.format(new Date(j));
        }
        return format;
    }

    /* access modifiers changed from: package-private */
    public void initFame(TGFrame tGFrame) {
        this.mTgFrame = tGFrame;
    }

    public TGFrame getTgFrame() {
        return this.mTgFrame;
    }

    /* access modifiers changed from: package-private */
    public void saveBitmap(ToygerFaceAttr toygerFaceAttr, String str) {
        saveBitmap(this.mTgFrame, toygerFaceAttr, str);
    }

    public static void saveBitmap(Bitmap bitmap, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getDetailDateFormat(System.currentTimeMillis()));
        sb.append("_");
        sb.append(str);
        sb.append(".png");
        String obj = sb.toString();
        File file = new File(Environment.getExternalStorageDirectory(), "Download");
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmap2File(bitmap, new File(file, obj));
    }

    public static void bitmap2File(Bitmap bitmap, File file) {
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException | IOException unused) {
        }
    }

    public static synchronized boolean save(File file, byte[] bArr) {
        boolean z;
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        synchronized (FrameProcessor.class) {
            z = false;
            if (!(file == null || bArr == null)) {
                if (file.exists()) {
                    file.delete();
                } else {
                    try {
                        file.createNewFile();
                    } catch (IOException unused) {
                    }
                }
                BufferedOutputStream bufferedOutputStream2 = null;
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    } catch (IOException unused2) {
                        close(bufferedOutputStream2);
                        close(fileOutputStream);
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        close(bufferedOutputStream2);
                        close(fileOutputStream);
                        throw th;
                    }
                    try {
                        bufferedOutputStream.write(bArr);
                        bufferedOutputStream.flush();
                        z = true;
                        close(bufferedOutputStream);
                    } catch (IOException unused3) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        close(bufferedOutputStream2);
                        close(fileOutputStream);
                        return z;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream2 = bufferedOutputStream;
                        close(bufferedOutputStream2);
                        close(fileOutputStream);
                        throw th;
                    }
                } catch (IOException unused4) {
                    fileOutputStream = null;
                    close(bufferedOutputStream2);
                    close(fileOutputStream);
                    return z;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                    close(bufferedOutputStream2);
                    close(fileOutputStream);
                    throw th;
                }
                close(fileOutputStream);
            }
        }
        return z;
    }

    public static void close(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void clearFrame() {
        this.mTgFrame = null;
    }

    public void saveTgFrame(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1076087175, oncanceled);
            onCancelLoad.getMin(-1076087175, oncanceled);
        }
        File file = new File(Environment.getExternalStorageDirectory(), "Download");
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getDetailDateFormat(System.currentTimeMillis()));
        sb.append("_");
        sb.append(str);
        String obj = sb.toString();
        byte[] bArr = this.mTgFrame.data;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("_raw.bin");
        save(new File(file, sb2.toString()), bArr);
    }

    public void saveTgDepthFrame(String str) {
        File file = new File(Environment.getExternalStorageDirectory(), "Download");
        if (!file.exists()) {
            file.mkdirs();
        }
        getDetailDateFormat(System.currentTimeMillis());
    }

    @TargetApi(9)
    public static void clearOldBinFiles() {
        File file = new File(Environment.getExternalStorageDirectory(), "Download");
        if (file.exists()) {
            try {
                File[] listFiles = file.listFiles(new LogFileNameFilter());
                if (listFiles != null && listFiles.length > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(3);
                    for (File file2 : listFiles) {
                        if (file2.lastModified() < currentTimeMillis && file2.delete()) {
                            file2.deleteOnExit();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    static class LogFileNameFilter implements FilenameFilter {
        LogFileNameFilter() {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(".bin");
        }
    }
}
