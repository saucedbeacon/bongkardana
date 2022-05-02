package com.alipay.imobile.network.quake;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.alipay.mobile.common.rpc.RpcException;
import java.util.concurrent.Executor;
import o.Rsa;

public class d implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f9354a;

    class a implements Runnable {
        private final Request b;
        private final Response c;
        private final Runnable d;

        public a(Request request, Response response, Runnable runnable) {
            this.b = request;
            this.c = response;
            this.d = runnable;
        }

        public void run() {
            if (this.b.isCanceled()) {
                this.b.finish("canceled-at-delivery");
                return;
            }
            if (this.c.isSuccess()) {
                this.b.deliverResponse(this.c.result);
            } else {
                this.b.deliverError(this.c.error);
            }
            if (this.c.intermediate) {
                this.b.addMarker("intermediate-response");
            } else {
                this.b.finish(Rsa.DONE_PROPERTY);
            }
            Runnable runnable = this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public d(final Handler handler) {
        this.f9354a = new Executor() {
            public void execute(@NonNull Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public void a(Request request, Response<?> response) {
        a(request, response, (Runnable) null);
    }

    public void a(Request request, Response<?> response, Runnable runnable) {
        request.markDelivered();
        request.addMarker("post-response");
        this.f9354a.execute(new a(request, response, runnable));
    }

    public void a(Request request, RpcException rpcException) {
        request.addMarker("post-error");
        this.f9354a.execute(new a(request, Response.error(rpcException), (Runnable) null));
    }
}
