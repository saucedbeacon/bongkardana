package com.alibaba.griver.image.photo.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.AbsListView;
import android.widget.ImageView;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.image.GriverImageService;
import com.alibaba.griver.image.R;
import com.alibaba.griver.image.framework.meta.APImageDownloadRsp;
import com.alibaba.griver.image.framework.meta.APImageLoadRequest;
import com.alibaba.griver.image.framework.meta.BaseOptions;
import com.alibaba.griver.image.framework.meta.Size;
import com.alibaba.griver.image.photo.meta.LoadInfo;
import com.alibaba.griver.image.photo.meta.PhotoInfo;
import id.dana.sendmoney.summary.SummaryActivity;
import java.io.File;

public class ImageHelper {
    public static final String TAG = "ImageHelper";

    /* renamed from: a  reason: collision with root package name */
    private static GriverImageService f10504a;
    private static String b;
    private static String c;

    public interface LoadListener {
        void onLoadCanceled(LoadInfo loadInfo);

        void onLoadComplete(LoadInfo loadInfo);

        void onLoadFailed(LoadInfo loadInfo, APImageDownloadRsp aPImageDownloadRsp);

        void onLoadProgress(LoadInfo loadInfo, int i, int i2);
    }

    public static Bitmap loadThumbPhoto(PhotoInfo photoInfo, int i) {
        return null;
    }

    public static void updateBusinessId(String str, String str2) {
        b = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" update businessId to :");
        sb.append(b);
        RVLogger.d(TAG, sb.toString());
    }

    public static void updateBizType(String str) {
        c = str;
        RVLogger.d(TAG, "setBizType:### ->".concat(String.valueOf(str)));
    }

    public static String getBizType() {
        return c;
    }

    public static void load(ImageView imageView, String str, Drawable drawable, int i, int i2, LoadInfo loadInfo) {
        a(imageView, str, drawable, i, i2, loadInfo, (Size) null, true, (String) null, -1, false);
    }

    public static void load(ImageView imageView, String str, Drawable drawable, int i, int i2, LoadInfo loadInfo, Size size) {
        a(imageView, str, drawable, i, i2, loadInfo, size, false, (String) null, -1, false);
    }

    public static void loadWidthThumbnailPath(ImageView imageView, String str, Drawable drawable, int i, int i2, Size size, String str2, int i3, boolean z) {
        a(imageView, str, drawable, i, i2, (LoadInfo) null, size, false, str2, i3, z);
    }

    private static void a(ImageView imageView, String str, Drawable drawable, int i, int i2, LoadInfo loadInfo, Size size, boolean z, String str2, int i3, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            RVLogger.d(TAG, "invalid path");
            return;
        }
        if (loadInfo != null) {
            loadInfo.loading = true;
        }
        if (f10504a == null) {
            f10504a = (GriverImageService) RVProxy.get(GriverImageService.class);
        }
        if (f10504a == null) {
            RVLogger.w(TAG, "Get GriverImageService return null!");
        } else {
            b(imageView, str, drawable, i, i2, loadInfo, size, z, str2, i3, z2);
        }
    }

    private static Bundle a(ImageView imageView) {
        Object tag = imageView.getTag(R.id.griver_image_id_photo_info_tag);
        if (tag != null) {
            return ((PhotoInfo) tag).bizExtraParams;
        }
        return null;
    }

    private static void b(ImageView imageView, String str, Drawable drawable, int i, int i2, LoadInfo loadInfo, Size size, boolean z, String str2, int i3, boolean z2) {
        APImageLoadRequest aPImageLoadRequest = new APImageLoadRequest();
        aPImageLoadRequest.imageView = imageView;
        aPImageLoadRequest.thumbPath = str2;
        aPImageLoadRequest.path = str;
        aPImageLoadRequest.imageId = i3;
        aPImageLoadRequest.defaultDrawable = drawable;
        aPImageLoadRequest.callback = loadInfo;
        aPImageLoadRequest.bundle = a(imageView);
        if (i == -1 && i2 == -1) {
            aPImageLoadRequest.width = Integer.MAX_VALUE;
            aPImageLoadRequest.height = Integer.MAX_VALUE;
            aPImageLoadRequest.loadType = 3;
        } else if (i == 0 && i2 == 0) {
            aPImageLoadRequest.width = 0;
            aPImageLoadRequest.height = 0;
        } else {
            aPImageLoadRequest.width = i;
            aPImageLoadRequest.height = i2;
            aPImageLoadRequest.srcSize = size;
        }
        aPImageLoadRequest.setProgressive(z);
        aPImageLoadRequest.setBizType(c);
        if (!TextUtils.equals(GriverConfig.getConfig("disable_local_photo_disk_cache", "false"), SummaryActivity.CHECKED) && z2) {
            aPImageLoadRequest.baseOptions = new BaseOptions();
            aPImageLoadRequest.baseOptions.saveToDiskCache = false;
        }
        f10504a.loadImage(aPImageLoadRequest, b);
    }

    public static boolean hasOriginPhoto(String str) {
        if (!isLocalFile(str)) {
            return false;
        }
        RVLogger.d(TAG, "Consider local file as original photo.");
        return true;
    }

    public static boolean isLocalFile(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith("file:") || str.startsWith(File.separator);
        }
        return false;
    }

    public static void cancel(String str) {
        RVLogger.w(TAG, "cancel path == ".concat(String.valueOf(str)));
    }

    public static void optimizeView(AbsListView absListView, AbsListView.OnScrollListener onScrollListener) {
        if (f10504a == null) {
            f10504a = (GriverImageService) RVProxy.get(GriverImageService.class);
        }
        f10504a.optimizeView(absListView, onScrollListener);
    }
}
