package com.iap.ac.android.common.imageloader;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface IACImageLoader {

    public interface Callback {
        void onLoadFailure(@NonNull Throwable th);

        void onLoadSuccess(@NonNull Drawable drawable);
    }

    void loadImage(@NonNull ImageView imageView, @NonNull String str, @Nullable Drawable drawable);

    void loadImageAsync(@NonNull Context context, int i, int i2, @NonNull String str, @NonNull Callback callback);
}
