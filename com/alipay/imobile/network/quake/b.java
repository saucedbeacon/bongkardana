package com.alipay.imobile.network.quake;

import android.os.Process;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.exception.ClientException;
import com.alipay.imobile.network.quake.protocol.Protocol;
import com.alipay.imobile.network.quake.request.RequestInterceptor;
import com.alipay.mobile.common.rpc.RpcException;
import java.util.concurrent.BlockingQueue;

public class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<c> f9349a;
    private final h b;
    private volatile boolean c = false;
    private f d;

    public b(BlockingQueue<c> blockingQueue, h hVar, f fVar) {
        this.f9349a = blockingQueue;
        this.b = hVar;
        this.d = fVar;
    }

    private void a(Request request, RpcException rpcException) {
        this.b.a(request, request.parseNetworkError(rpcException));
    }

    public void a() {
        this.c = true;
        interrupt();
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c take = this.f9349a.take();
                Request request = take.f9350a;
                NetworkResponse networkResponse = take.b;
                take.f9350a = null;
                take.b = null;
                try {
                    request.addMarker("Deserialize-queue-take");
                    if (request.isCanceled()) {
                        request.finish("Deserialize-discard-cancelled");
                    } else if (!networkResponse.notModified || !request.hasHadResponseDelivered()) {
                        for (RequestInterceptor afterReceiveResponse : Quake.instance().getRequestInterceptors()) {
                            afterReceiveResponse.afterReceiveResponse(request, networkResponse);
                        }
                        Protocol protocol = request.getProtocol();
                        Response deserialize = protocol.deserialize(request, networkResponse);
                        request.addMarker("network-parse-complete");
                        if (request.shouldCache() && deserialize.cacheEntry != null) {
                            this.d.d(request.getCacheName()).put(protocol.generateCacheKey(request), deserialize.cacheEntry);
                            request.addMarker("network-cache-written");
                        }
                        request.markDelivered();
                        this.b.a(request, (Response<?>) deserialize);
                    } else {
                        request.finish("not-modified");
                        return;
                    }
                } catch (RpcException e) {
                    a(request, e);
                } catch (Throwable th) {
                    LoggerWrapper.e(Quake.TAG, LoggerWrapper.buildMessage("Unhandled throwable %s", th.toString()), th);
                    this.b.a(request, (RpcException) new ClientException((Integer) 0, th));
                }
            } catch (InterruptedException unused) {
                if (this.c) {
                    return;
                }
            }
        }
    }
}
