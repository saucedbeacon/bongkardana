package com.google.android.gms.measurement;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.zzfu;

@Deprecated
public class AppMeasurementContentProvider extends ContentProvider {
    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if ("com.google.android.gms.measurement.google_measurement_service".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public int delete(@NonNull Uri uri, @NonNull String str, @NonNull String[] strArr) {
        return 0;
    }

    @NonNull
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @NonNull
    public Uri insert(@NonNull Uri uri, @NonNull ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        Preconditions.checkNotNull(context);
        zzfu.zzC(context, (zzcl) null, (Long) null);
        return false;
    }

    @NonNull
    public Cursor query(@NonNull Uri uri, @NonNull String[] strArr, @NonNull String str, @NonNull String[] strArr2, @NonNull String str2) {
        return null;
    }

    public int update(@NonNull Uri uri, @NonNull ContentValues contentValues, @NonNull String str, @NonNull String[] strArr) {
        return 0;
    }
}
