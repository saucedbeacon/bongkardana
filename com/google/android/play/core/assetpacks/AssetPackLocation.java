package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import com.google.android.play.core.assetpacks.model.AssetPackStorageMethod;

public abstract class AssetPackLocation {

    /* renamed from: a  reason: collision with root package name */
    private static final AssetPackLocation f10835a = new bg(1, (String) null, (String) null);

    static AssetPackLocation a() {
        return f10835a;
    }

    static AssetPackLocation a(String str, String str2) {
        return new bg(0, str, str2);
    }

    @Nullable
    public abstract String assetsPath();

    @AssetPackStorageMethod
    public abstract int packStorageMethod();

    @Nullable
    public abstract String path();
}
