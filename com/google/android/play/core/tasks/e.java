package com.google.android.play.core.tasks;

final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Task f9631a;
    final /* synthetic */ f b;

    e(f fVar, Task task) {
        this.b = fVar;
        this.f9631a = task;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onSuccess(this.f9631a.getResult());
            }
        }
    }
}
