package com.google.android.play.core.review.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;

public class FakeReviewManager implements ReviewManager {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10956a;
    private ReviewInfo b;

    public FakeReviewManager(Context context) {
        this.f10956a = context;
    }

    @NonNull
    public Task<Void> launchReviewFlow(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        return reviewInfo != this.b ? Tasks.a((Exception) new a()) : Tasks.a(null);
    }

    @NonNull
    public Task<ReviewInfo> requestReviewFlow() {
        ReviewInfo a2 = ReviewInfo.a(PendingIntent.getBroadcast(this.f10956a, 0, new Intent(), 0));
        this.b = a2;
        return Tasks.a(a2);
    }
}
