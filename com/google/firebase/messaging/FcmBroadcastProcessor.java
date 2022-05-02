package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.ServiceStarter;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public class FcmBroadcastProcessor {
    @GuardedBy("lock")
    private static WithinAppServiceConnection fcmServiceConn;
    private static final Object lock = new Object();
    private final Context context;
    private final Executor executor;

    public FcmBroadcastProcessor(@NonNull Context context2) {
        this.context = context2;
        this.executor = FcmBroadcastProcessor$$Lambda$0.$instance;
    }

    public FcmBroadcastProcessor(@NonNull Context context2, @NonNull ExecutorService executorService) {
        this.context = context2;
        this.executor = executorService;
    }

    private static WithinAppServiceConnection getServiceConnection(Context context2, String str) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (lock) {
            if (fcmServiceConn == null) {
                fcmServiceConn = new WithinAppServiceConnection(context2, ServiceStarter.ACTION_MESSAGING_EVENT);
            }
            withinAppServiceConnection = fcmServiceConn;
        }
        return withinAppServiceConnection;
    }

    static final /* synthetic */ Integer lambda$bindToMessagingService$3$FcmBroadcastProcessor(Task task) throws Exception {
        return -1;
    }

    static final /* synthetic */ Integer lambda$startMessagingService$1$FcmBroadcastProcessor(Task task) throws Exception {
        return 403;
    }

    static final /* synthetic */ Task lambda$startMessagingService$2$FcmBroadcastProcessor(Context context2, Intent intent, Task task) throws Exception {
        return (!PlatformVersion.isAtLeastO() || ((Integer) task.getResult()).intValue() != 402) ? task : bindToMessagingService(context2, intent).continueWith(FcmBroadcastProcessor$$Lambda$5.$instance, FcmBroadcastProcessor$$Lambda$6.$instance);
    }

    @VisibleForTesting
    public static void reset() {
        synchronized (lock) {
            fcmServiceConn = null;
        }
    }

    @NonNull
    @KeepForSdk
    public Task<Integer> process(@NonNull Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra(Constants.MessagePayloadKeys.RAW_DATA, Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return startMessagingService(this.context, intent);
    }

    @SuppressLint({"InlinedApi"})
    @NonNull
    public Task<Integer> startMessagingService(@NonNull Context context2, @NonNull Intent intent) {
        boolean z = false;
        if (PlatformVersion.isAtLeastO() && context2.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (!z || flags != 0) {
            return Tasks.call(this.executor, new FcmBroadcastProcessor$$Lambda$1(context2, intent)).continueWithTask(this.executor, new FcmBroadcastProcessor$$Lambda$2(context2, intent));
        }
        return bindToMessagingService(context2, intent);
    }

    private static Task<Integer> bindToMessagingService(Context context2, Intent intent) {
        return getServiceConnection(context2, ServiceStarter.ACTION_MESSAGING_EVENT).sendIntent(intent).continueWith(FcmBroadcastProcessor$$Lambda$3.$instance, FcmBroadcastProcessor$$Lambda$4.$instance);
    }
}
