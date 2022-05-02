package com.google.firebase.ml.vision.objects;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.ml.vision.objects.internal.zzj;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.concurrent.Immutable;

@Immutable
public class FirebaseVisionObject {
    public static final int CATEGORY_FASHION_GOOD = 2;
    public static final int CATEGORY_FOOD = 3;
    public static final int CATEGORY_HOME_GOOD = 1;
    public static final int CATEGORY_PLACE = 4;
    public static final int CATEGORY_PLANT = 5;
    public static final int CATEGORY_UNKNOWN = 0;
    @Category
    private final int category;
    private final Float confidence;
    private final Rect zzbhd;
    private final Integer zzbjq;

    @Retention(RetentionPolicy.CLASS)
    public @interface Category {
    }

    public FirebaseVisionObject(@NonNull zzj zzj) {
        Preconditions.checkNotNull(zzj, "Returned Object Detector Parcel can not be null");
        int[] iArr = zzj.zzbke;
        Preconditions.checkArgument(iArr.length == 4);
        this.zzbhd = new Rect(iArr[0], iArr[1], iArr[2], iArr[3]);
        this.zzbjq = zzj.zzbjq;
        this.confidence = zzj.confidence;
        this.category = zzj.category;
    }

    @Category
    public int getClassificationCategory() {
        return this.category;
    }

    @NonNull
    public Rect getBoundingBox() {
        return this.zzbhd;
    }

    @Nullable
    public Integer getTrackingId() {
        return this.zzbjq;
    }

    @Nullable
    public Float getClassificationConfidence() {
        return this.confidence;
    }
}
