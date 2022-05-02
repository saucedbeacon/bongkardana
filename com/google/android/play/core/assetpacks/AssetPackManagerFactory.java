package com.google.android.play.core.assetpacks;

import android.content.Context;
import androidx.annotation.NonNull;

public class AssetPackManagerFactory {
    @NonNull
    public static synchronized AssetPackManager getInstance(@NonNull Context context) {
        AssetPackManager a2;
        synchronized (AssetPackManagerFactory.class) {
            a2 = db.a(context).a();
        }
        return a2;
    }
}
