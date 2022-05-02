package com.google.android.play.core.appupdate;

import android.content.Context;
import androidx.annotation.NonNull;

public class AppUpdateManagerFactory {
    @NonNull
    public static AppUpdateManager create(@NonNull Context context) {
        return w.a(context).a();
    }
}
