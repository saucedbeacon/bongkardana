package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.i;

public final class c implements ReviewManager {

    /* renamed from: a  reason: collision with root package name */
    private final h f9599a;
    private final Handler b = new Handler(Looper.getMainLooper());

    c(h hVar) {
        this.f9599a = hVar;
    }

    @NonNull
    public final Task<Void> launchReviewFlow(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        i iVar = new i();
        intent.putExtra("result_receiver", new b(this.b, iVar));
        activity.startActivity(intent);
        return iVar.a();
    }

    @NonNull
    public final Task<ReviewInfo> requestReviewFlow() {
        return this.f9599a.a();
    }
}
