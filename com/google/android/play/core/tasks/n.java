package com.google.android.play.core.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class n implements OnSuccessListener, OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f11007a = new CountDownLatch(1);

    private n() {
    }

    /* synthetic */ n(byte[] bArr) {
    }

    public final void a() throws InterruptedException {
        this.f11007a.await();
    }

    public final boolean a(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f11007a.await(j, timeUnit);
    }

    public final void onFailure(Exception exc) {
        this.f11007a.countDown();
    }

    public final void onSuccess(Object obj) {
        this.f11007a.countDown();
    }
}
