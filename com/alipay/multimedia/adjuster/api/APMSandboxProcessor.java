package com.alipay.multimedia.adjuster.api;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Size;
import com.alipay.multimedia.adjuster.api.data.APMInsertReq;
import com.alipay.multimedia.adjuster.api.data.ICache;
import com.alipay.multimedia.adjuster.utils.IOUilts;
import com.alipay.multimedia.adjuster.utils.Log;
import com.alipay.multimedia.adjuster.utils.PathUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class APMSandboxProcessor {
    private static final int BUFFER_SIZE = 8192;
    private static final String TAG = "APMSandboxProcessor";
    public static final String TEMP_DIR = "/tmp/";
    private static final Log logger = Log.getLogger(TAG);
    private static Context mAppContext;
    private static ICache sCache = null;

    public static void setApplicationContext(Context context) {
        if (mAppContext == null) {
            mAppContext = context;
        }
    }

    public static void registerICache(ICache iCache) {
        if (sCache == null) {
            sCache = iCache;
        }
    }

    private static ContentResolver getContentResolver() {
        Context context = mAppContext;
        if (context != null) {
            return context.getContentResolver();
        }
        return null;
    }

    public static boolean checkFileExist(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (isContentUriPath(str)) {
            InputStream inputStream = null;
            if (getContentResolver() == null) {
                return false;
            }
            try {
                inputStream = getContentResolver().openInputStream(Uri.parse(str));
                if (inputStream != null) {
                    return true;
                }
                IOUilts.close(inputStream);
            } catch (FileNotFoundException unused) {
                return false;
            } finally {
                IOUilts.close(inputStream);
            }
        }
        File file = new File(PathUtils.extractPath(str));
        if (!file.isFile() || !file.exists()) {
            return false;
        }
        return true;
    }

    public static Bitmap decodeBitmap(String str, BitmapFactory.Options options) {
        if (TextUtils.isEmpty(str) || options == null) {
            return null;
        }
        if (isContentUriPath(str)) {
            return decodeBitmapByContentUri(getContentResolver(), str, options);
        }
        try {
            return BitmapFactory.decodeFile(PathUtils.extractPath(str), options);
        } catch (Throwable th) {
            logger.e(th, "decodeBitmap exp=", new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 16) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.Closeable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 16) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeBitmapByContentUri(android.content.ContentResolver r4, java.lang.String r5, android.graphics.BitmapFactory.Options r6) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x004f
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x004f
            if (r6 != 0) goto L_0x000c
            goto L_0x004f
        L_0x000c:
            r1 = 16
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "r"
            android.os.ParcelFileDescriptor r4 = r4.openFileDescriptor(r5, r2)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x002c
            java.io.FileDescriptor r5 = r4.getFileDescriptor()     // Catch:{ all -> 0x002a }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFileDescriptor(r5, r0, r6)     // Catch:{ all -> 0x002a }
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r1) goto L_0x0029
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.Closeable) r4)
        L_0x0029:
            return r5
        L_0x002a:
            r5 = move-exception
            goto L_0x0036
        L_0x002c:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r1) goto L_0x0045
        L_0x0030:
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.Closeable) r4)
            goto L_0x0045
        L_0x0034:
            r5 = move-exception
            r4 = r0
        L_0x0036:
            com.alipay.multimedia.adjuster.utils.Log r6 = logger     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "decodeBitmapByContentUri exp"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0046 }
            r6.e(r5, r2, r3)     // Catch:{ all -> 0x0046 }
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r1) goto L_0x0045
            goto L_0x0030
        L_0x0045:
            return r0
        L_0x0046:
            r5 = move-exception
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r1) goto L_0x004e
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.Closeable) r4)
        L_0x004e:
            throw r5
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.multimedia.adjuster.api.APMSandboxProcessor.decodeBitmapByContentUri(android.content.ContentResolver, java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static boolean isContentUriPath(String str) {
        return PathUtils.isContentUriPath(str);
    }

    public static String insertMediaFile(APMInsertReq aPMInsertReq) {
        return insertMediaFile(aPMInsertReq.getUri(), aPMInsertReq.getContext(), aPMInsertReq.getMimeType(), aPMInsertReq.getDisplayName(), aPMInsertReq.getDescription(), aPMInsertReq.getSourceData(), aPMInsertReq.getSavePrimaryDir(), aPMInsertReq.getSaveSecondaryDir());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010e, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0110, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0111, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x011d, code lost:
        r2.delete(r1, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0121, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0127, code lost:
        com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.InputStream) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0142, code lost:
        com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.InputStream) r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:42:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011d A[Catch:{ all -> 0x013b }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String insertMediaFile(android.net.Uri r17, android.content.Context r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.Object r22, java.lang.String r23, java.lang.String r24) {
        /*
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = 0
            if (r0 == 0) goto L_0x0148
            if (r4 != 0) goto L_0x0015
            goto L_0x0148
        L_0x0015:
            boolean r8 = r4 instanceof java.lang.String
            if (r8 == 0) goto L_0x001f
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = com.alipay.multimedia.adjuster.utils.PathUtils.extractPath(r4)
        L_0x001f:
            boolean r8 = r4 instanceof android.graphics.Bitmap
            if (r8 == 0) goto L_0x002e
            android.content.ContentResolver r0 = getContentResolver()
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.lang.String r0 = insertImage((android.content.ContentResolver) r0, (android.graphics.Bitmap) r4, (java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r1)
            return r0
        L_0x002e:
            boolean r8 = r4 instanceof java.lang.String
            java.lang.String r9 = "insertMediaFile Failed to insert media file"
            r10 = 0
            if (r8 == 0) goto L_0x004f
            boolean r8 = isImages(r0, r1)
            if (r8 == 0) goto L_0x004f
            android.content.ContentResolver r0 = getContentResolver()     // Catch:{ FileNotFoundException -> 0x0046 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ FileNotFoundException -> 0x0046 }
            java.lang.String r0 = insertImage((android.content.ContentResolver) r0, (java.lang.String) r4, (java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r1)     // Catch:{ FileNotFoundException -> 0x0046 }
            return r0
        L_0x0046:
            r0 = move-exception
            com.alipay.multimedia.adjuster.utils.Log r1 = logger
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r1.e(r0, r9, r2)
            return r7
        L_0x004f:
            boolean r8 = r4 instanceof java.io.InputStream
            if (r8 != 0) goto L_0x005d
            com.alipay.multimedia.adjuster.utils.Log r0 = logger
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r2 = "insertMediaFile fail by invalid dataSource!!!"
            r0.d(r2, r1)
            return r7
        L_0x005d:
            android.content.ContentValues r11 = new android.content.ContentValues
            r11.<init>()
            android.net.Uri r12 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String r13 = "description"
            java.lang.String r14 = "secondary_directory"
            java.lang.String r15 = "primary_directory"
            java.lang.String r10 = "mime_type"
            java.lang.String r7 = "_display_name"
            if (r12 != r0) goto L_0x0086
            r11.put(r7, r2)
            r11.put(r10, r1)
            boolean r1 = isAndroidQ()
            if (r1 == 0) goto L_0x00b6
            r11.put(r13, r3)
            r11.put(r15, r5)
            r11.put(r14, r6)
            goto L_0x00b6
        L_0x0086:
            android.net.Uri r12 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            if (r12 != r0) goto L_0x00a0
            r11.put(r7, r2)
            r11.put(r10, r1)
            boolean r1 = isAndroidQ()
            if (r1 == 0) goto L_0x00b6
            r11.put(r13, r3)
            r11.put(r15, r5)
            r11.put(r14, r6)
            goto L_0x00b6
        L_0x00a0:
            android.net.Uri r3 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            if (r3 != r0) goto L_0x00b6
            r11.put(r7, r2)
            r11.put(r10, r1)
            boolean r1 = isAndroidQ()
            if (r1 == 0) goto L_0x00b6
            r11.put(r15, r5)
            r11.put(r14, r6)
        L_0x00b6:
            if (r18 != 0) goto L_0x00ba
            r1 = 0
            return r1
        L_0x00ba:
            r1 = 0
            android.content.ContentResolver r2 = r18.getContentResolver()
            android.net.Uri r3 = r2.insert(r0, r11)     // Catch:{ Exception -> 0x0110, all -> 0x010d }
            if (r3 != 0) goto L_0x00d0
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.OutputStream) r1)
            if (r8 == 0) goto L_0x00cf
            java.io.InputStream r4 = (java.io.InputStream) r4
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.InputStream) r4)
        L_0x00cf:
            return r1
        L_0x00d0:
            java.lang.String r0 = "w"
            android.os.ParcelFileDescriptor r0 = r2.openFileDescriptor(r3, r0)     // Catch:{ Exception -> 0x010a, all -> 0x010d }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x010a, all -> 0x010d }
            java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch:{ Exception -> 0x010a, all -> 0x010d }
            r1.<init>(r0)     // Catch:{ Exception -> 0x010a, all -> 0x010d }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0103, all -> 0x0100 }
        L_0x00e3:
            r5 = r4
            java.io.InputStream r5 = (java.io.InputStream) r5     // Catch:{ Exception -> 0x0103, all -> 0x0100 }
            int r5 = r5.read(r0)     // Catch:{ Exception -> 0x0103, all -> 0x0100 }
            r6 = -1
            if (r5 == r6) goto L_0x00f2
            r6 = 0
            r1.write(r0, r6, r5)     // Catch:{ Exception -> 0x0103, all -> 0x0100 }
            goto L_0x00e3
        L_0x00f2:
            r1.flush()     // Catch:{ Exception -> 0x0103, all -> 0x0100 }
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.OutputStream) r1)
            if (r8 == 0) goto L_0x012d
            java.io.InputStream r4 = (java.io.InputStream) r4
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.InputStream) r4)
            goto L_0x012d
        L_0x0100:
            r0 = move-exception
            r7 = r1
            goto L_0x013d
        L_0x0103:
            r0 = move-exception
            r16 = r3
            r3 = r1
            r1 = r16
            goto L_0x0113
        L_0x010a:
            r0 = move-exception
            r1 = r3
            goto L_0x0112
        L_0x010d:
            r0 = move-exception
            r7 = 0
            goto L_0x013d
        L_0x0110:
            r0 = move-exception
            r1 = 0
        L_0x0112:
            r3 = 0
        L_0x0113:
            com.alipay.multimedia.adjuster.utils.Log r5 = logger     // Catch:{ all -> 0x013b }
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x013b }
            r5.e(r0, r9, r6)     // Catch:{ all -> 0x013b }
            if (r1 == 0) goto L_0x0122
            r5 = 0
            r2.delete(r1, r5, r5)     // Catch:{ all -> 0x013b }
            r1 = 0
        L_0x0122:
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.OutputStream) r3)
            if (r8 == 0) goto L_0x012c
            java.io.InputStream r4 = (java.io.InputStream) r4
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.InputStream) r4)
        L_0x012c:
            r3 = r1
        L_0x012d:
            if (r3 == 0) goto L_0x0134
            java.lang.String r7 = r3.toString()
            goto L_0x0135
        L_0x0134:
            r7 = 0
        L_0x0135:
            android.content.Context r0 = mAppContext
            com.alipay.multimedia.adjuster.utils.FileUtils.scanPictureAsync(r0, r7)
            return r7
        L_0x013b:
            r0 = move-exception
            r7 = r3
        L_0x013d:
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.OutputStream) r7)
            if (r8 == 0) goto L_0x0147
            java.io.InputStream r4 = (java.io.InputStream) r4
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.InputStream) r4)
        L_0x0147:
            throw r0
        L_0x0148:
            r1 = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.multimedia.adjuster.api.APMSandboxProcessor.insertMediaFile(android.net.Uri, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.String):java.lang.String");
    }

    private static boolean isAndroidQ() {
        return Build.VERSION.SDK_INT >= 10000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String insertImage(android.content.ContentResolver r3, android.graphics.Bitmap r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = "title"
            r1.put(r2, r5)
            java.lang.String r5 = "description"
            r1.put(r5, r6)
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L_0x001b
            r5 = r7
            goto L_0x001d
        L_0x001b:
            java.lang.String r5 = "image/jpeg"
        L_0x001d:
            java.lang.String r6 = "mime_type"
            r1.put(r6, r5)
            r5 = 0
            android.net.Uri r6 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0064 }
            android.net.Uri r6 = r3.insert(r6, r1)     // Catch:{ Exception -> 0x0064 }
            if (r4 == 0) goto L_0x0055
            java.io.OutputStream r1 = r3.openOutputStream(r6)     // Catch:{ Exception -> 0x0062 }
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x0045
            java.lang.String r2 = "image/png"
            boolean r7 = r2.equalsIgnoreCase(r7)     // Catch:{ all -> 0x0050 }
            if (r7 == 0) goto L_0x0045
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0050 }
            r2 = 100
            r4.compress(r7, r2, r1)     // Catch:{ all -> 0x0050 }
            goto L_0x004c
        L_0x0045:
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0050 }
            r2 = 80
            r4.compress(r7, r2, r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.OutputStream) r1)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0075
        L_0x0050:
            r4 = move-exception
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.OutputStream) r1)     // Catch:{ Exception -> 0x0062 }
            throw r4     // Catch:{ Exception -> 0x0062 }
        L_0x0055:
            com.alipay.multimedia.adjuster.utils.Log r4 = logger     // Catch:{ Exception -> 0x0062 }
            java.lang.String r7 = "Failed to create thumbnail, removing original"
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0062 }
            r4.e(r7, r1)     // Catch:{ Exception -> 0x0062 }
            r3.delete(r6, r0, r0)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0074
        L_0x0062:
            r4 = move-exception
            goto L_0x0066
        L_0x0064:
            r4 = move-exception
            r6 = r0
        L_0x0066:
            com.alipay.multimedia.adjuster.utils.Log r7 = logger
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = "Failed to insert image"
            r7.e(r4, r1, r5)
            if (r6 == 0) goto L_0x0075
            r3.delete(r6, r0, r0)
        L_0x0074:
            r6 = r0
        L_0x0075:
            if (r6 == 0) goto L_0x007b
            java.lang.String r0 = r6.toString()
        L_0x007b:
            android.content.Context r3 = mAppContext
            com.alipay.multimedia.adjuster.utils.FileUtils.scanPictureAsync(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.multimedia.adjuster.api.APMSandboxProcessor.insertImage(android.content.ContentResolver, android.graphics.Bitmap, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    private static final String insertImage(ContentResolver contentResolver, String str, String str2, String str3, String str4) {
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            String insertImage = insertImage(contentResolver, decodeFile, str2, str3, str4);
            decodeFile.recycle();
            return insertImage;
        } finally {
            IOUilts.close((InputStream) fileInputStream);
        }
    }

    private static final Bitmap StoreThumbnail(ContentResolver contentResolver, Bitmap bitmap, long j, float f, float f2, int i) {
        Matrix matrix = new Matrix();
        matrix.setScale(f / ((float) bitmap.getWidth()), f2 / ((float) bitmap.getHeight()));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("kind", Integer.valueOf(i));
        contentValues.put("image_id", Integer.valueOf((int) j));
        contentValues.put("height", Integer.valueOf(createBitmap.getHeight()));
        contentValues.put("width", Integer.valueOf(createBitmap.getWidth()));
        try {
            OutputStream openOutputStream = contentResolver.openOutputStream(contentResolver.insert(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, contentValues));
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, openOutputStream);
            openOutputStream.close();
            return createBitmap;
        } catch (FileNotFoundException | IOException unused) {
            return null;
        }
    }

    public static int deleteMediaFile(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        if (isContentUriPath(str)) {
            return context.getContentResolver().delete(Uri.parse(str), (String) null, (String[]) null);
        }
        new File(PathUtils.extractPath(str)).deleteOnExit();
        return 0;
    }

    private static boolean isImages(Uri uri, String str) {
        return (uri == MediaStore.Images.Media.EXTERNAL_CONTENT_URI) && (TextUtils.isEmpty(str) || (str.startsWith("image/") && !str.equalsIgnoreCase("image/gif")));
    }

    public static boolean isLocalFile(String str) {
        return PathUtils.isLocalFile(str) || isContentUriPath(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        com.alipay.multimedia.adjuster.utils.FileUtils.delete(new java.io.File(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        com.alipay.multimedia.adjuster.utils.IOUilts.close(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008d, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x007d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String copyContentUriFile(com.alipay.multimedia.adjuster.api.data.APMSaveReq r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x008e
            java.lang.String r1 = r5.getUri()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x000f
            goto L_0x008e
        L_0x000f:
            java.lang.String r1 = r5.getSavePth()
            java.lang.String r2 = r5.getSavePth()     // Catch:{ all -> 0x007c }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x007c }
            if (r2 == 0) goto L_0x003f
            com.alipay.multimedia.adjuster.api.data.ICache r2 = sCache     // Catch:{ all -> 0x007c }
            if (r2 == 0) goto L_0x003f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
            r2.<init>()     // Catch:{ all -> 0x007c }
            com.alipay.multimedia.adjuster.api.data.ICache r3 = sCache     // Catch:{ all -> 0x007c }
            java.lang.String r3 = r3.getCacheRootDir()     // Catch:{ all -> 0x007c }
            r2.append(r3)     // Catch:{ all -> 0x007c }
            java.lang.String r3 = "/tmp/"
            r2.append(r3)     // Catch:{ all -> 0x007c }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007c }
            r2.append(r3)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x007c }
        L_0x003f:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x007c }
            if (r2 == 0) goto L_0x0049
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.InputStream) r0)
            return r0
        L_0x0049:
            android.content.ContentResolver r2 = getContentResolver()     // Catch:{ all -> 0x007c }
            java.lang.String r5 = r5.getUri()     // Catch:{ all -> 0x007c }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x007c }
            java.io.InputStream r5 = r2.openInputStream(r5)     // Catch:{ all -> 0x007c }
            if (r5 == 0) goto L_0x0085
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x007d }
            r2.<init>(r1)     // Catch:{ all -> 0x007d }
            boolean r2 = com.alipay.multimedia.adjuster.utils.FileUtils.safeCopyToFile(r5, r2)     // Catch:{ all -> 0x007d }
            if (r2 == 0) goto L_0x0085
            com.alipay.multimedia.adjuster.utils.Log r2 = logger     // Catch:{ all -> 0x007d }
            java.lang.String r3 = "copyContentUriFile dest="
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x007d }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x007d }
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x007d }
            r2.d(r3, r4)     // Catch:{ all -> 0x007d }
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.InputStream) r5)
            return r1
        L_0x007c:
            r5 = r0
        L_0x007d:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0089 }
            r2.<init>(r1)     // Catch:{ all -> 0x0089 }
            com.alipay.multimedia.adjuster.utils.FileUtils.delete(r2)     // Catch:{ all -> 0x0089 }
        L_0x0085:
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.InputStream) r5)
            return r0
        L_0x0089:
            r0 = move-exception
            com.alipay.multimedia.adjuster.utils.IOUilts.close((java.io.InputStream) r5)
            throw r0
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.multimedia.adjuster.api.APMSandboxProcessor.copyContentUriFile(com.alipay.multimedia.adjuster.api.data.APMSaveReq):java.lang.String");
    }

    public static boolean isSandBoxSdk() {
        if (Build.VERSION.SDK_INT <= 28) {
            return Build.VERSION.SDK_INT == 28 && Build.VERSION.PREVIEW_SDK_INT > 0;
        }
        return true;
    }

    public static Bitmap loadThumbnail(Uri uri, int i, int i2) {
        if (isSandBoxSdk() && i > 0 && i2 > 0 && i <= 512 && i2 <= 512) {
            try {
                return getContentResolver().loadThumbnail(uri, new Size(i, i2), (CancellationSignal) null);
            } catch (Exception e) {
                Log log = logger;
                StringBuilder sb = new StringBuilder("loadThumbnail exp=");
                sb.append(e.toString());
                log.d(sb.toString(), new Object[0]);
            }
        }
        return null;
    }
}
