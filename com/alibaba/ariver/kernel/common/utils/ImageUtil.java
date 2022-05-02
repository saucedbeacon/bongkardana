package com.alibaba.ariver.kernel.common.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.io.PoolingByteArrayOutputStream;
import com.alibaba.griver.image.framework.api.APImageFormat;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

public class ImageUtil {
    public static String HEADER_GIF_BASE64 = "data:image/gif;base64,";
    public static String HEADER_ICON_BASE64 = "data:image/x-icon;base64,";
    public static String HEADER_JPG_BASE64 = "data:image/jpeg;base64,";
    public static String HEADER_PNG_BASE64 = "data:image/png;base64,";
    static final String TAG = "ImageUtil";

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
            RVLogger.e(TAG, "OutOfMemoryError", e);
            return null;
        }
    }

    @Nullable
    public static Drawable byteToDrawable(String str) {
        byte[] decode;
        String base64Deal = base64Deal(str);
        if (!TextUtils.isEmpty(base64Deal) && (decode = Base64.decode(base64Deal, 0)) != null) {
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

    public static String bitmapToString(Bitmap bitmap, String str) {
        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream();
        bitmap.compress(str.equals(APImageFormat.SUFFIX_JPG) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, 100, poolingByteArrayOutputStream);
        byte[] byteArray = poolingByteArrayOutputStream.toByteArray();
        IOUtils.closeQuietly(poolingByteArrayOutputStream);
        return Base64.encodeToString(byteArray, 2);
    }

    public static Bitmap base64ToBitmap(String str) {
        if (TextUtils.isEmpty(base64Deal(str))) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(base64Deal(str), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable th) {
            RVLogger.w(TAG, "base64ToBitmap", th);
            return null;
        }
    }

    public static boolean isBase64Url(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.startsWith(HEADER_GIF_BASE64) && !str.startsWith(HEADER_PNG_BASE64) && !str.startsWith(HEADER_JPG_BASE64) && !str.startsWith(HEADER_ICON_BASE64)) {
            return false;
        }
        return true;
    }

    public static String base64Deal(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith(HEADER_GIF_BASE64)) {
            return str.replace(HEADER_GIF_BASE64, "");
        }
        if (str.startsWith(HEADER_PNG_BASE64)) {
            return str.replace(HEADER_PNG_BASE64, "");
        }
        if (str.startsWith(HEADER_JPG_BASE64)) {
            return str.replace(HEADER_JPG_BASE64, "");
        }
        if (str.startsWith(HEADER_ICON_BASE64)) {
            return str.replace(HEADER_ICON_BASE64, "");
        }
        return null;
    }

    @Nullable
    public static InputStream base64ToInputStream(String str) {
        PoolingByteArrayOutputStream poolingByteArrayOutputStream;
        String base64Deal = base64Deal(str);
        if (TextUtils.isEmpty(base64Deal)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(base64Deal, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            poolingByteArrayOutputStream = new PoolingByteArrayOutputStream();
            try {
                decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, poolingByteArrayOutputStream);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(poolingByteArrayOutputStream.toByteArray());
                IOUtils.closeQuietly(poolingByteArrayOutputStream);
                return byteArrayInputStream;
            } catch (Throwable unused) {
                try {
                    RVLogger.d(TAG, "base64ToInputStream, inputStream is null");
                    return null;
                } finally {
                    IOUtils.closeQuietly(poolingByteArrayOutputStream);
                }
            }
        } catch (Throwable unused2) {
            poolingByteArrayOutputStream = null;
            RVLogger.d(TAG, "base64ToInputStream, inputStream is null");
            return null;
        }
    }
}
