package com.google.firebase.ml.vision.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class FirebaseVisionImageMetadata {
    public static final int IMAGE_FORMAT_NV21 = 17;
    public static final int IMAGE_FORMAT_YV12 = 842094169;
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;
    @ImageFormat
    private final int format;
    private final int height;
    @Rotation
    private final int rotation;
    private final int width;

    @Retention(RetentionPolicy.CLASS)
    public @interface ImageFormat {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface Rotation {
    }

    public static class Builder {
        @ImageFormat
        private int format;
        private int height;
        @Rotation
        private int rotation;
        private int width;

        @NonNull
        public Builder setWidth(int i) {
            Preconditions.checkArgument(i > 0, "Image buffer width should be positive.");
            this.width = i;
            return this;
        }

        @NonNull
        public Builder setHeight(int i) {
            Preconditions.checkArgument(i > 0, "Image buffer height should be positive.");
            this.height = i;
            return this;
        }

        @NonNull
        public Builder setRotation(@Rotation int i) {
            boolean z = true;
            if (!(i == 0 || i == 1 || i == 2 || i == 3)) {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.rotation = i;
            return this;
        }

        @NonNull
        public Builder setFormat(@ImageFormat int i) {
            Preconditions.checkArgument(i == 842094169 || i == 17);
            this.format = i;
            return this;
        }

        @NonNull
        public FirebaseVisionImageMetadata build() {
            return new FirebaseVisionImageMetadata(this.width, this.height, this.rotation, this.format);
        }
    }

    public FirebaseVisionImageMetadata(@NonNull FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        this.width = firebaseVisionImageMetadata.getWidth();
        this.height = firebaseVisionImageMetadata.getHeight();
        this.format = firebaseVisionImageMetadata.getFormat();
        this.rotation = firebaseVisionImageMetadata.getRotation();
    }

    private FirebaseVisionImageMetadata(int i, int i2, @Rotation int i3, @ImageFormat int i4) {
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.format = i4;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    @Rotation
    public int getRotation() {
        return this.rotation;
    }

    @ImageFormat
    public int getFormat() {
        return this.format;
    }
}
