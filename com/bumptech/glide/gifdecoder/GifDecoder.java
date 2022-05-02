package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

public interface GifDecoder {

    @Retention(RetentionPolicy.SOURCE)
    public @interface GifDecodeStatus {
    }

    public interface setMax {
        void getMax(@NonNull Bitmap bitmap);

        @NonNull
        byte[] getMax(int i);

        @NonNull
        Bitmap getMin(int i, int i2, @NonNull Bitmap.Config config);

        void getMin(@NonNull int[] iArr);

        @NonNull
        int[] length(int i);

        void setMax(@NonNull byte[] bArr);
    }

    void IsOverlapping();

    @Nullable
    Bitmap equals();

    void getMax();

    int getMin();

    @NonNull
    ByteBuffer length();

    void length(@NonNull Bitmap.Config config);

    int setMax();

    int setMin();

    int toFloatRange();

    void toIntRange();
}
