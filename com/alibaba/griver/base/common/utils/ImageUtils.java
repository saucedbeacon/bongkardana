package com.alibaba.griver.base.common.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.ariver.kernel.common.io.PoolingByteArrayOutputStream;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.common.ImageLoader;
import com.alibaba.griver.base.common.adapter.ImageListener;
import com.alibaba.griver.base.common.config.GriverInnerConfig;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.image.framework.api.APImageFormat;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ImageUtils {
    static final String TAG = "ImageUtil";

    /* renamed from: a  reason: collision with root package name */
    private static String[] f9058a = {APImageFormat.SUFFIX_PNG, APImageFormat.SUFFIX_JPG, "jpeg", APImageFormat.SUFFIX_WEBP, "bmp", APImageFormat.SUFFIX_GIF, "tif"};
    public static String gifBase64 = "data:image/gif;base64,";
    public static String iconBase64 = "data:image/x-icon;base64,";
    public static String jpgBae64 = "data:image/jpeg;base64,";
    public static String pngBase64 = "data:image/png;base64,";

    public static Bitmap scaleBitmap(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float min = Math.min(((float) i) / ((float) width), ((float) i2) / ((float) height));
        Matrix matrix = new Matrix();
        matrix.postScale(min, min);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        } catch (OutOfMemoryError e) {
            GriverLogger.e(TAG, "OutOfMemoryError", e);
            return null;
        }
    }

    public static Drawable byteToDrawable(String str) {
        byte[] decode = Base64.decode(base64Deal(str), 0);
        if (decode != null) {
            return new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
        }
        return null;
    }

    public static String getImageTempDir(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir());
        sb.append("/h5container/image/temp");
        sb.append(File.separator);
        return sb.toString();
    }

    public static Bitmap imageQuality(Bitmap bitmap, int i) {
        Bitmap bitmap2 = null;
        if (bitmap == null) {
            return null;
        }
        if (i >= 100) {
            return bitmap;
        }
        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, poolingByteArrayOutputStream);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(poolingByteArrayOutputStream.toByteArray());
        try {
            bitmap2 = BitmapFactory.decodeStream(byteArrayInputStream, (Rect) null, new BitmapFactory.Options());
        } catch (OutOfMemoryError e) {
            GriverLogger.e(TAG, "exception detail", e);
        } catch (Throwable th) {
            IOUtils.closeQuietly(poolingByteArrayOutputStream);
            IOUtils.closeQuietly(byteArrayInputStream);
            throw th;
        }
        IOUtils.closeQuietly(poolingByteArrayOutputStream);
        IOUtils.closeQuietly(byteArrayInputStream);
        return bitmap2;
    }

    public static Bitmap getDiskBitmap(String str, int i, int i2) {
        FileInputStream fileInputStream;
        Bitmap bitmap = null;
        if (!FileUtils.exists(str)) {
            return null;
        }
        GriverLogger.debug(TAG, "getDiskBitmap begin");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ALPHA_8;
        options.inJustDecodeBounds = true;
        options.inDither = false;
        options.inTempStorage = new byte[32768];
        GriverLogger.debug(TAG, "getDiskBitmap decodeFile begin");
        BitmapFactory.decodeFile(str, options);
        GriverLogger.debug(TAG, "getDiskBitmap decodeFile after");
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if ((i3 <= i && i4 <= i2) || i <= 0 || i2 <= 0) {
            return BitmapFactory.decodeFile(str);
        }
        float f = (float) i3;
        float f2 = f / ((float) i);
        float f3 = (float) i4;
        float f4 = f3 / ((float) i2);
        if (f2 > f4) {
            i2 = (int) (f3 / f2);
        } else {
            i = (int) (f / f4);
        }
        options.inSampleSize = Math.min(i3 / i, i4 / i2);
        options.inJustDecodeBounds = false;
        try {
            fileInputStream = new FileInputStream(new File(str));
        } catch (FileNotFoundException e) {
            GriverLogger.e(TAG, "".concat(String.valueOf(e)));
            fileInputStream = null;
        }
        if (fileInputStream != null) {
            try {
                GriverLogger.debug(TAG, "getDiskBitmap decodeFileDescriptor begin");
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileInputStream.getFD(), (Rect) null, options);
                GriverLogger.debug(TAG, "getDiskBitmap decodeFileDescriptor after");
                bitmap = Bitmap.createScaledBitmap(decodeFileDescriptor, i, i2, true);
                if (decodeFileDescriptor != bitmap) {
                    decodeFileDescriptor.recycle();
                }
                fileInputStream.close();
            } catch (IOException e2) {
                GriverLogger.e(TAG, "create bitmap exception:".concat(String.valueOf(e2)));
            }
        } else {
            GriverLogger.e(TAG, "not file.".concat(String.valueOf(str)));
        }
        GriverLogger.debug(TAG, "getDiskBitmap after");
        return bitmap;
    }

    @SuppressLint({"NewApi"})
    public static Bitmap getDiskBitmap(String str, int i, int i2, int i3) {
        Bitmap diskBitmap = getDiskBitmap(str, i, i2);
        if (diskBitmap == null) {
            return null;
        }
        if (i3 < 50 || i3 > 100) {
            GriverLogger.d(TAG, "set quality as default 75.");
            i3 = 75;
        }
        if (i3 == 100) {
            return diskBitmap;
        }
        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream();
        diskBitmap.compress(Bitmap.CompressFormat.JPEG, i3, poolingByteArrayOutputStream);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(poolingByteArrayOutputStream.toByteArray());
        diskBitmap.recycle();
        Bitmap decodeStream = BitmapFactory.decodeStream(byteArrayInputStream, (Rect) null, (BitmapFactory.Options) null);
        IOUtils.closeQuietly(poolingByteArrayOutputStream);
        return decodeStream;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x002a A[SYNTHETIC, Splitter:B:24:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0035 A[SYNTHETIC, Splitter:B:31:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void writeImage(android.graphics.Bitmap r4, android.graphics.Bitmap.CompressFormat r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "Exception"
            java.lang.String r1 = "ImageUtil"
            if (r4 == 0) goto L_0x003e
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0022 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0022 }
            r6 = 100
            r4.compress(r5, r6, r3)     // Catch:{ IOException -> 0x001d, all -> 0x001a }
            r3.close()     // Catch:{ IOException -> 0x0015 }
            return
        L_0x0015:
            r4 = move-exception
            com.alibaba.griver.base.common.logger.GriverLogger.e(r1, r0, r4)
            return
        L_0x001a:
            r4 = move-exception
            r2 = r3
            goto L_0x0033
        L_0x001d:
            r4 = move-exception
            r2 = r3
            goto L_0x0023
        L_0x0020:
            r4 = move-exception
            goto L_0x0033
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            java.lang.String r5 = "exception detail."
            com.alibaba.griver.base.common.logger.GriverLogger.e(r1, r5, r4)     // Catch:{ all -> 0x0020 }
            if (r2 == 0) goto L_0x003e
            r2.close()     // Catch:{ IOException -> 0x002e }
            return
        L_0x002e:
            r4 = move-exception
            com.alibaba.griver.base.common.logger.GriverLogger.e(r1, r0, r4)
            return
        L_0x0033:
            if (r2 == 0) goto L_0x003d
            r2.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            r5 = move-exception
            com.alibaba.griver.base.common.logger.GriverLogger.e(r1, r0, r5)
        L_0x003d:
            throw r4
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.ImageUtils.writeImage(android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat, java.lang.String):void");
    }

    public static String bitmapToString(Bitmap bitmap, String str) {
        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream();
        bitmap.compress(str.equals(APImageFormat.SUFFIX_JPG) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, 100, poolingByteArrayOutputStream);
        byte[] byteArray = poolingByteArrayOutputStream.toByteArray();
        IOUtils.closeQuietly(poolingByteArrayOutputStream);
        return Base64.encodeToString(byteArray, 2);
    }

    public static Bitmap base64ToBitmap(String str) {
        try {
            byte[] decode = Base64.decode(base64Deal(str), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable th) {
            GriverLogger.e(TAG, "base64 to bitmap error", th);
            return null;
        }
    }

    @Deprecated
    public static String getMimeType(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        byte[] decode = Base64.decode(base64Deal(str), 0);
        BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
        StringBuilder sb = new StringBuilder("--type is ");
        sb.append(options.outMimeType);
        GriverLogger.d(TAG, sb.toString());
        return options.outMimeType;
    }

    public static String base64Deal(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith(gifBase64)) {
            return str.replace(gifBase64, "");
        }
        if (str.startsWith(pngBase64)) {
            return str.replace(pngBase64, "");
        }
        if (str.startsWith(jpgBae64)) {
            return str.replace(jpgBae64, "");
        }
        return str.startsWith(iconBase64) ? str.replace(iconBase64, "") : str;
    }

    public static InputStream base64ToInputStream(String str) {
        PoolingByteArrayOutputStream poolingByteArrayOutputStream;
        if (!"no".equalsIgnoreCase(GriverInnerConfig.getConfigWithProcessCache(GriverConfigConstants.KEY_ENABLE_BASE64_TO_IS, "YES"))) {
            return a(str);
        }
        try {
            byte[] decode = Base64.decode(base64Deal(str), 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            poolingByteArrayOutputStream = new PoolingByteArrayOutputStream();
            try {
                decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, poolingByteArrayOutputStream);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(poolingByteArrayOutputStream.toByteArray());
                IOUtils.closeQuietly(poolingByteArrayOutputStream);
                return byteArrayInputStream;
            } catch (Throwable unused) {
                try {
                    GriverLogger.d(TAG, "base64ToInputStream, inputStream is null");
                    return null;
                } finally {
                    IOUtils.closeQuietly(poolingByteArrayOutputStream);
                }
            }
        } catch (Throwable unused2) {
            poolingByteArrayOutputStream = null;
            GriverLogger.d(TAG, "base64ToInputStream, inputStream is null");
            return null;
        }
    }

    private static InputStream a(String str) {
        try {
            GriverLogger.d(TAG, "");
            return new ByteArrayInputStream(Base64.decode(base64Deal(str), 0));
        } catch (Throwable th) {
            GriverLogger.e(TAG, "error", th);
            return null;
        }
    }

    public static boolean checkBitmap(Bitmap bitmap) {
        return bitmap != null && !bitmap.isRecycled();
    }

    public static void loadImage(String str, final ImageListener imageListener) {
        GriverExecutors.getExecutor(ExecutorType.NETWORK).execute(new ImageLoader(str, new ImageListener() {
            public final void onImage(Bitmap bitmap) {
                ImageListener imageListener = imageListener;
                if (imageListener != null) {
                    imageListener.onImage(bitmap);
                }
            }
        }));
    }

    public static final boolean isImage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.endsWith(".png") || str.endsWith(".jpg") || str.endsWith(".jpeg") || str.endsWith(".gif") || str.endsWith(".bmp") || str.endsWith(".tiff") || str.endsWith(".pcx") || str.endsWith(".tga") || str.endsWith(".exif") || str.endsWith(".fpx") || str.endsWith(".svg") || str.endsWith(".psd") || str.endsWith(".cdr") || str.endsWith(".pcd") || str.endsWith(".dxf") || str.endsWith(".ufo") || str.endsWith(".eps") || str.endsWith(".ai") || str.endsWith(".raw") || str.endsWith(".webp")) {
            return true;
        }
        return false;
    }

    public static boolean checkSuffixSupported(String str) {
        boolean z;
        String substring = str.substring(str.lastIndexOf(".") + 1);
        RVLogger.d(TAG, "checkSuffixSupported...suffix=".concat(String.valueOf(substring)));
        if (RVLogger.isEmpty(substring)) {
            RVLogger.d(TAG, "checkSuffixSupported... suffix is null");
            return false;
        }
        String lowerCase = substring.toLowerCase();
        String[] strArr = f9058a;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (strArr[i].equals(lowerCase)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return true;
        }
        RVLogger.d(TAG, "checkSuffixSupported...unsupported suffix = ".concat(String.valueOf(substring)));
        return false;
    }

    public static float getScale(int i, int i2, float f, float f2) {
        if (i > 0 && i2 > 0) {
            return Math.min(((float) i) / f, ((float) i2) / f2);
        }
        if (i > 0) {
            return ((float) i) / f;
        }
        if (i2 > 0) {
            return ((float) i2) / f2;
        }
        return 1.0f;
    }

    public static boolean isSdkMatch() {
        return Build.VERSION.SDK_INT >= 15 && Build.VERSION.SDK_INT < 21;
    }
}
