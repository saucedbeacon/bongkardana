package com.google.android.play.core.tasks;

final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Task f9627a;
    final /* synthetic */ b b;

    a(b bVar, Task task) {
        this.b = bVar;
        this.f9627a = task;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onComplete(this.f9627a);
            }
        }
    }
}
