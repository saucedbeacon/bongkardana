package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class EnhancedIntentService$$Lambda$2 implements OnCompleteListener {
    private final EnhancedIntentService arg$1;
    private final Intent arg$2;

    EnhancedIntentService$$Lambda$2(EnhancedIntentService enhancedIntentService, Intent intent) {
        this.arg$1 = enhancedIntentService;
        this.arg$2 = intent;
    }

    public final void onComplete(Task task) {
        this.arg$1.lambda$onStartCommand$1$EnhancedIntentService(this.arg$2, task);
    }
}
