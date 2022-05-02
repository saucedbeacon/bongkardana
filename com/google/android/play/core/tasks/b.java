package com.google.android.play.core.tasks;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

final class b<ResultT> implements g<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f9628a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    @Nullable
    public final OnCompleteListener<ResultT> c;

    public b(Executor executor, OnCompleteListener<ResultT> onCompleteListener) {
        this.f9628a = executor;
        this.c = onCompleteListener;
    }

    public final void a(Task<ResultT> task) {
        OnCompleteListener<ResultT> onCompleteListener;
        synchronized (this.b) {
            onCompleteListener = this.c;
        }
        if (onCompleteListener != null) {
            this.f9628a.execute(new a(this, task));
        }
    }
}
