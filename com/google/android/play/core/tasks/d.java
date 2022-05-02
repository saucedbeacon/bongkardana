package com.google.android.play.core.tasks;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

final class d<ResultT> implements g<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f9630a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    @Nullable
    public final OnFailureListener c;

    public d(Executor executor, OnFailureListener onFailureListener) {
        this.f9630a = executor;
        this.c = onFailureListener;
    }

    public final void a(Task<ResultT> task) {
        OnFailureListener onFailureListener;
        if (!task.isSuccessful()) {
            synchronized (this.b) {
                onFailureListener = this.c;
            }
            if (onFailureListener != null) {
                this.f9630a.execute(new c(this, task));
            }
        }
    }
}
