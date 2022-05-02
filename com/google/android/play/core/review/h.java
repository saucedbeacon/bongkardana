package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.internal.ab;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.internal.ap;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.i;

public final class h {
    /* access modifiers changed from: private */
    public static final af b = new af("ReviewService");

    /* renamed from: a  reason: collision with root package name */
    final ap<ab> f9603a;
    /* access modifiers changed from: private */
    public final String c;

    public h(Context context) {
        this.c = context.getPackageName();
        Context context2 = context;
        this.f9603a = new ap(context2, b, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), d.f9600a);
    }

    public final Task<ReviewInfo> a() {
        b.c("requestInAppReview (%s)", this.c);
        i iVar = new i();
        this.f9603a.a((ag) new e(this, iVar, iVar));
        return iVar.a();
    }
}
