package com.alipay.imobile.network.quake;

import android.os.Process;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.cache.Cache;
import com.alipay.imobile.network.quake.protocol.Protocol;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class a extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Request> f9345a;
    /* access modifiers changed from: private */
    public final BlockingQueue<Request> b;
    private final h c;
    private volatile boolean d = false;
    private f e;

    public a(BlockingQueue<Request> blockingQueue, BlockingQueue<Request> blockingQueue2, h hVar, f fVar) {
        this.f9345a = blockingQueue;
        this.b = blockingQueue2;
        this.c = hVar;
        this.e = fVar;
    }

    public void a() {
        this.d = true;
        interrupt();
    }

    public void run() {
        BlockingQueue<Request> blockingQueue;
        LoggerWrapper.v(Quake.TAG, "start new dispatcher");
        Process.setThreadPriority(10);
        while (true) {
            try {
                final Request take = this.f9345a.take();
                take.addMarker("cache-queue-take");
                if (take.isCanceled()) {
                    take.finish("cache-discard-canceled");
                } else {
                    Protocol protocol = take.getProtocol();
                    String generateCacheKey = protocol.generateCacheKey(take);
                    Cache d2 = this.e.d(take.getCacheName());
                    if (!d2.isInitialized()) {
                        d2.initialize();
                    }
                    Cache.Entry entry = null;
                    try {
                        entry = d2.get(generateCacheKey);
                    } catch (IOException e2) {
                        LoggerWrapper.e(Quake.TAG, LoggerWrapper.buildMessage("Unhandled exception %s", e2.toString()), e2);
                        d2.remove(generateCacheKey);
                    }
                    if (entry == null) {
                        take.addMarker("cache-miss");
                        blockingQueue = this.b;
                    } else if (entry.isExpired()) {
                        take.addMarker("cache-hit-expired");
                        take.setCacheEntry(entry);
                        blockingQueue = this.b;
                    } else {
                        take.addMarker("cache-hit");
                        Response deserialize = protocol.deserialize(take, new NetworkResponse(0, entry.data));
                        take.addMarker("cache-hit-parsed");
                        if (!entry.refreshNeeded()) {
                            this.c.a(take, (Response<?>) deserialize);
                        } else {
                            take.addMarker("cache-hit-refresh-needed");
                            StringBuilder sb = new StringBuilder("softExpireTime=");
                            sb.append(entry.softExpireTime);
                            sb.append(", finalExpireTime=");
                            sb.append(entry.finalExpireTime);
                            sb.append("currentTime=");
                            sb.append(System.currentTimeMillis());
                            take.addMarker(sb.toString());
                            take.setCacheEntry(entry);
                            deserialize.intermediate = true;
                            this.c.a(take, deserialize, new Runnable() {
                                public void run() {
                                    try {
                                        a.this.b.put(take);
                                    } catch (InterruptedException unused) {
                                    }
                                }
                            });
                        }
                    }
                    blockingQueue.put(take);
                }
            } catch (InterruptedException e3) {
                LoggerWrapper.e(Quake.TAG, LoggerWrapper.buildMessage("Unhandled InterruptedException %s", e3.toString()), e3);
                if (this.d) {
                    return;
                }
            } catch (Throwable th) {
                LoggerWrapper.e(Quake.TAG, LoggerWrapper.buildMessage("Unhandled throwable %s", th.toString()), th);
            }
        }
    }
}
