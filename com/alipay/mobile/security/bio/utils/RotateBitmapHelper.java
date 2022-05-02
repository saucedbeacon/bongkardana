package com.alipay.mobile.security.bio.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class RotateBitmapHelper {
    public static Bitmap getRotateBitmap(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (NullPointerException | OutOfMemoryError unused) {
            return null;
        }
    }

    public static Bitmap getVerticalRotateBitmap(Bitmap bitmap, float f) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        matrix.postRotate(f);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static Bitmap getUprightBitmap(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        matrix.postScale(1.0f, -1.0f);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (NullPointerException | OutOfMemoryError unused) {
            return null;
        }
    }
}
