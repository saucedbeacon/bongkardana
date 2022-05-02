package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.setOnHide;

public interface ImageHeaderParser {
    @NonNull
    ImageType setMax(@NonNull InputStream inputStream) throws IOException;

    @NonNull
    ImageType setMax(@NonNull ByteBuffer byteBuffer) throws IOException;

    int setMin(@NonNull InputStream inputStream, @NonNull setOnHide setonhide) throws IOException;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        private ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public final boolean hasAlpha() {
            return this.hasAlpha;
        }
    }
}
