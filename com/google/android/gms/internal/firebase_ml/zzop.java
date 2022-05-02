package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

enum zzop implements Executor {
    INSTANCE;

    public final void execute(@NonNull Runnable runnable) {
        zzon.zzmy().handler.post(runnable);
    }
}
