package com.iap.ac.android.common.imageloader;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.imageloader.IACImageLoader;
import com.iap.ac.android.common.log.ACLog;

public class ACImageLoader {
    private static final String NO_IMAGE_LOADER_ERROR = "No imageLoader impl!";
    private static final String TAG = "ACImageLoader";
    @NonNull
    private static IACImageLoader sAcImageLoader = new IACImageLoader() {
        public final void loadImage(@NonNull ImageView imageView, @NonNull String str, @Nullable Drawable drawable) {
            ACLog.e(ACImageLoader.TAG, ACImageLoader.NO_IMAGE_LOADER_ERROR);
            imageView.setImageDrawable(drawable);
        }

        public final void loadImageAsync(@NonNull Context context, int i, int i2, @NonNull String str, @NonNull IACImageLoader.Callback callback) {
            ACLog.e(ACImageLoader.TAG, ACImageLoader.NO_IMAGE_LOADER_ERROR);
            callback.onLoadFailure(new Exception(ACImageLoader.NO_IMAGE_LOADER_ERROR));
        }
    };

    public static void setImageLoaderImpl(@NonNull IACImageLoader iACImageLoader) {
        sAcImageLoader = iACImageLoader;
    }

    @NonNull
    public static IACImageLoader getImageLoader() {
        return sAcImageLoader;
    }
}
