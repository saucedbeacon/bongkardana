package com.google.android.play.core.tasks;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

final class f<ResultT> implements g<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f9632a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    @Nullable
    public final OnSuccessListener<? super ResultT> c;

    public f(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        this.f9632a = executor;
        this.c = onSuccessListener;
    }

    public final void a(Task<ResultT> task) {
        OnSuccessListener<? super ResultT> onSuccessListener;
        if (task.isSuccessful()) {
            synchronized (this.b) {
                onSuccessListener = this.c;
            }
            if (onSuccessListener != null) {
                this.f9632a.execute(new e(this, task));
            }
        }
    }
}
