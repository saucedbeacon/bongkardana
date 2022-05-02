package com.alibaba.ariver.kernel.api.extension;

import com.alibaba.ariver.kernel.api.extension.Action;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.service.executor.RVExecutorService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.List;
import java.util.Map;

public class ActionCallback<T> implements ExtensionCallback<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Action, ExecutorType> f9008a;
    private final RVExecutorService b = ((RVExecutorService) RVProxy.get(RVExecutorService.class));
    private final T c;

    public void onFail(Throwable th) {
    }

    public ActionCallback(Map<Action, ExecutorType> map, T t) {
        this.f9008a = map;
        this.c = t;
    }

    public void onStart(List<Extension> list) {
        for (final Action next : this.f9008a.keySet()) {
            final long currentTimeMillis = System.currentTimeMillis();
            if (next instanceof Action.Start) {
                final List<Extension> list2 = list;
                this.b.getExecutor(this.f9008a.get(next)).execute(new Runnable() {
                    public void run() {
                        StringBuilder sb = new StringBuilder("onComplete for ");
                        sb.append(next.getClass().getName());
                        sb.append(" schedule ");
                        sb.append(System.currentTimeMillis() - currentTimeMillis);
                        RVLogger.debug("AriverKernel:ActionCallback", sb.toString());
                        ((Action.Start) next).onStart(list2);
                    }
                });
            }
        }
    }

    public void onProgress(final Extension extension, final T t) {
        for (final Action next : this.f9008a.keySet()) {
            if (next instanceof Action.Progress) {
                this.b.getExecutor(this.f9008a.get(next)).execute(new Runnable() {
                    public void run() {
                        ((Action.Progress) next).onProgress(extension, t);
                    }
                });
            }
        }
    }

    public void onException(final Extension extension, final Throwable th) {
        for (final Action next : this.f9008a.keySet()) {
            if (next instanceof Action.Exception) {
                this.b.getExecutor(this.f9008a.get(next)).execute(new Runnable() {
                    public void run() {
                        ((Action.Exception) next).onException(extension, th);
                    }
                });
            }
        }
    }

    public void onInterrupt(final Extension extension) {
        for (final Action next : this.f9008a.keySet()) {
            if (next instanceof Action.Interrupt) {
                this.b.getExecutor(this.f9008a.get(next)).execute(new Runnable() {
                    public void run() {
                        ((Action.Interrupt) next).onInterrupt(extension);
                    }
                });
            }
        }
    }

    public void onComplete(T t) {
        if (t == null) {
            t = this.c;
        }
        for (final Action next : this.f9008a.keySet()) {
            if (next instanceof Action.Complete) {
                final long currentTimeMillis = System.currentTimeMillis();
                final T t2 = t;
                this.b.getExecutor(this.f9008a.get(next)).execute(new Runnable() {
                    public void run() {
                        StringBuilder sb = new StringBuilder("onComplete for ");
                        sb.append(next.getClass().getName());
                        sb.append(" schedule ");
                        sb.append(System.currentTimeMillis() - currentTimeMillis);
                        RVLogger.debug("AriverKernel:ActionCallback", sb.toString());
                        ((Action.Complete) next).onComplete(t2);
                    }
                });
            }
        }
    }
}
