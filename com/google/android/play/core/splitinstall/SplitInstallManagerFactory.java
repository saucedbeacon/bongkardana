package com.google.android.play.core.splitinstall;

import android.content.Context;
import androidx.annotation.NonNull;

public class SplitInstallManagerFactory {
    @NonNull
    public static SplitInstallManager create(@NonNull Context context) {
        return k.a(context).a();
    }
}
