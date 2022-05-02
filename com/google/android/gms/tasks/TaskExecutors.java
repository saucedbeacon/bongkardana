package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.tasks.zzb;
import java.util.concurrent.Executor;

public final class TaskExecutors {
    public static final Executor MAIN_THREAD = new zza();
    static final Executor zza = new zzt();

    private TaskExecutors() {
    }

    static final class zza implements Executor {
        private final Handler zza = new zzb(Looper.getMainLooper());

        public final void execute(@NonNull Runnable runnable) {
            this.zza.post(runnable);
        }
    }
}
