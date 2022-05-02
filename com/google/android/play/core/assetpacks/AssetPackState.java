package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.play.core.assetpacks.model.AssetPackErrorCode;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import com.google.android.play.core.internal.h;

public abstract class AssetPackState {
    static AssetPackState a(Bundle bundle, String str, bz bzVar, az azVar) {
        return a(str, azVar.a(bundle.getInt(h.a("status", str)), str), bundle.getInt(h.a("error_code", str)), bundle.getLong(h.a("bytes_downloaded", str)), bundle.getLong(h.a("total_bytes_to_download", str)), bzVar.b(str));
    }

    public static AssetPackState a(@NonNull String str, @AssetPackStatus int i, @AssetPackErrorCode int i2, long j, long j2, double d) {
        return new bh(str, i, i2, j, j2, (int) Math.rint(100.0d * d));
    }

    public abstract long bytesDownloaded();

    @AssetPackErrorCode
    public abstract int errorCode();

    public abstract String name();

    @AssetPackStatus
    public abstract int status();

    public abstract long totalBytesToDownload();

    public abstract int transferProgressPercentage();
}
