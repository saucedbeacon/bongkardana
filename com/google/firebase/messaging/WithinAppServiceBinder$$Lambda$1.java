package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;

final /* synthetic */ class WithinAppServiceBinder$$Lambda$1 implements OnCompleteListener {
    private final WithinAppServiceConnection.BindRequest arg$1;

    WithinAppServiceBinder$$Lambda$1(WithinAppServiceConnection.BindRequest bindRequest) {
        this.arg$1 = bindRequest;
    }

    public final void onComplete(Task task) {
        this.arg$1.finish();
    }
}
