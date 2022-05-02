package com.alibaba.griver.image.photo.utils;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.image.framework.meta.Size;
import com.alibaba.griver.image.framework.utils.PathUtils;
import com.alibaba.griver.image.photo.meta.CloudConfig;
import com.alibaba.griver.image.photo.meta.PhotoInfo;
import com.alipay.multimedia.adjuster.api.APMSandboxProcessor;
import com.alipay.multimedia.adjuster.api.data.APMInsertReq;
import java.util.Calendar;

public class PhotoUtil {
    public static final float DEFAULT_HEIGHT_SCALE = 0.5625f;
    public static final float MAX_HEIGHT_SCALE = 1.3333334f;
    public static final int MAX_WIDTH = 800;
    public static final float MIN_HEIGHT_SCALE = 0.18518518f;
    public static final String TAG = "PhotoUtil";

    public static boolean isPowerOfTwo(int i) {
        boolean z = false;
        boolean z2 = i > 0;
        if ((i & (i - 1)) == 0) {
            z = true;
        }
        return z2 & z;
    }

    public static void startAnimation(View view, int i) {
        view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), i));
    }

    public static final void notifyScanner(String str, String str2) {
        if (isQCompact()) {
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            if (!TextUtils.isEmpty(str2) && str2.contains("video")) {
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            }
            APMSandboxProcessor.insertMediaFile(new APMInsertReq.Builder(uri, str, a(str)).mimeType(str2).build());
            RVLogger.d(TAG, "notifyScanner:### Q compact.path =".concat(String.valueOf(str)));
            return;
        }
        RVLogger.d(TAG, "notifyScanner:###".concat(String.valueOf(str)));
        MediaScannerConnection.scanFile(GriverEnv.getApplicationContext(), new String[]{str}, new String[]{str2}, (MediaScannerConnection.OnScanCompletedListener) null);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            String substring = str.substring(str.lastIndexOf("\\") + 1);
            return substring.substring(0, substring.lastIndexOf("."));
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("getNameFromPath### Exception = ");
            sb.append(th.getMessage());
            RVLogger.e(TAG, sb.toString());
            return str;
        }
    }

    public static long getThisMonth() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.clear(12);
        instance.clear(13);
        instance.clear(14);
        instance.set(5, 1);
        return instance.getTimeInMillis();
    }

    public static long getLastMonth() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.clear(12);
        instance.clear(13);
        instance.clear(14);
        instance.set(5, 1);
        instance.add(2, -1);
        return instance.getTimeInMillis();
    }

    public static void runOnMain(Runnable runnable) {
        if (runnable != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                new Handler(Looper.getMainLooper()).post(runnable);
            }
        }
    }

    public static final int dp2px(Context context, int i) {
        return Math.round(TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics()));
    }

    public static final Size reorderSize(Size size) {
        return PathUtils.getDjangoNearestImageSize(size);
    }

    public static final Size reorderSize(int i) {
        return reorderSize(new Size(i, i));
    }

    public static final Size getPhotoSize(PhotoInfo photoInfo) {
        try {
            if (photoInfo.oriPhotoSize != null) {
                return photoInfo.oriPhotoSize;
            }
            int photoWidth = photoInfo.getPhotoWidth();
            int photoHeight = photoInfo.getPhotoHeight();
            if (photoInfo.getPhotoOrientation() == 90 || photoInfo.getPhotoOrientation() == 270) {
                int i = photoHeight;
                photoHeight = photoWidth;
                photoWidth = i;
            }
            photoInfo.oriPhotoSize = new Size(photoWidth, photoHeight);
            return photoInfo.oriPhotoSize;
        } catch (Exception unused) {
            return new Size(0, 0);
        }
    }

    public static boolean isQVersion() {
        if (Build.VERSION.SDK_INT <= 28) {
            return Build.VERSION.SDK_INT == 28 && Build.VERSION.PREVIEW_SDK_INT > 0;
        }
        return true;
    }

    public static boolean isQCompact() {
        return isQVersion() && !CloudConfig.isConfigToDisableQCompact();
    }
}
