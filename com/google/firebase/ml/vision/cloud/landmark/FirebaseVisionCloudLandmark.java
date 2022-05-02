package com.google.firebase.ml.vision.cloud.landmark;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.firebase_ml.zzjx;
import com.google.android.gms.internal.firebase_ml.zzki;
import com.google.android.gms.internal.firebase_ml.zzlx;
import com.google.android.gms.internal.firebase_ml.zzpy;
import com.google.firebase.ml.vision.common.FirebaseVisionLatLng;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.Immutable;

@Immutable
public class FirebaseVisionCloudLandmark {
    private final List<FirebaseVisionLatLng> locations;
    private final String mid;
    private final float zzbfk;
    private final String zzbhc;
    private final Rect zzbhd;

    @NonNull
    public String getEntityId() {
        return this.mid;
    }

    @NonNull
    public String getLandmark() {
        return this.zzbhc;
    }

    @Nullable
    public Rect getBoundingBox() {
        return this.zzbhd;
    }

    public float getConfidence() {
        return this.zzbfk;
    }

    @NonNull
    public List<FirebaseVisionLatLng> getLocations() {
        return this.locations;
    }

    private FirebaseVisionCloudLandmark(@Nullable String str, float f, @Nullable Rect rect, @Nullable String str2, @NonNull List<FirebaseVisionLatLng> list) {
        this.zzbhd = rect;
        this.zzbhc = zzlx.zzay(str);
        this.mid = zzlx.zzay(str2);
        this.locations = list;
        if (Float.compare(f, 0.0f) < 0) {
            f = 0.0f;
        } else if (Float.compare(f, 1.0f) > 0) {
            f = 1.0f;
        }
        this.zzbfk = f;
    }

    @Nullable
    static FirebaseVisionCloudLandmark zza(@Nullable zzjx zzjx, float f) {
        ArrayList arrayList;
        if (zzjx == null) {
            return null;
        }
        float zza = zzpy.zza(zzjx.zzie());
        Rect zza2 = zzpy.zza(zzjx.zzid(), f);
        String description = zzjx.getDescription();
        String mid2 = zzjx.getMid();
        List<zzki> locations2 = zzjx.getLocations();
        if (locations2 == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (zzki next : locations2) {
                if (!(next.zzih() == null || next.zzih().zzif() == null || next.zzih().zzig() == null)) {
                    arrayList2.add(new FirebaseVisionLatLng(next.zzih().zzif().doubleValue(), next.zzih().zzig().doubleValue()));
                }
            }
            arrayList = arrayList2;
        }
        return new FirebaseVisionCloudLandmark(description, zza, zza2, mid2, arrayList);
    }
}
