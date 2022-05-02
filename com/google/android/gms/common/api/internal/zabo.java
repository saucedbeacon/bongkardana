package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

public class zabo extends zal {
    private TaskCompletionSource<Void> zad = new TaskCompletionSource<>();

    public static zabo zaa(@NonNull Activity activity) {
        LifecycleFragment fragment = getFragment(activity);
        zabo zabo = (zabo) fragment.getCallbackOrNull("GmsAvailabilityHelper", zabo.class);
        if (zabo == null) {
            return new zabo(fragment);
        }
        if (zabo.zad.getTask().isComplete()) {
            zabo.zad = new TaskCompletionSource<>();
        }
        return zabo;
    }

    private zabo(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("GmsAvailabilityHelper", this);
    }

    /* access modifiers changed from: protected */
    public final void zaa(ConnectionResult connectionResult, int i) {
        this.zad.setException(ApiExceptionUtil.fromStatus(new Status(connectionResult.getErrorCode(), connectionResult.getErrorMessage(), connectionResult.getResolution())));
    }

    /* access modifiers changed from: protected */
    public final void zaa() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        if (lifecycleActivity == null) {
            this.zad.trySetException(new ApiException(new Status(8)));
            return;
        }
        int isGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(lifecycleActivity);
        if (isGooglePlayServicesAvailable == 0) {
            this.zad.trySetResult(null);
        } else if (!this.zad.getTask().isComplete()) {
            zab(new ConnectionResult(isGooglePlayServicesAvailable, (PendingIntent) null), 0);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.zad.trySetException(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public final Task<Void> zac() {
        return this.zad.getTask();
    }
}
