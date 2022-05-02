package com.alipay.imobile.network.quake;

import android.os.Handler;
import android.os.Looper;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class g implements Request.a {

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f9364a;
    private final Map<String, Queue<Request>> b;
    private final Set<Request> c;
    private final PriorityBlockingQueue<Request> d;
    private final PriorityBlockingQueue<Request> e;
    private final BlockingQueue<c> f;
    private final h g;
    private e h;
    private a i;
    private b j;
    private f k;
    private final List<b> l;

    public interface b {
        void a(Request request);
    }

    public interface a {
        boolean a(Request request);
    }

    public g(f fVar, int i2) {
        this(fVar, i2, new d(new Handler(Looper.getMainLooper())));
    }

    public g(f fVar, int i2, h hVar) {
        this.f9364a = new AtomicInteger();
        this.b = new HashMap();
        this.c = new HashSet();
        this.d = new PriorityBlockingQueue<>();
        this.e = new PriorityBlockingQueue<>();
        this.f = new PriorityBlockingQueue();
        this.l = new ArrayList();
        this.g = hVar;
        this.k = fVar;
    }

    public void a() {
        b();
        a aVar = new a(this.d, this.e, this.g, this.k);
        this.i = aVar;
        aVar.start();
        e eVar = new e(this.e, this.f, this.g, this.k);
        this.h = eVar;
        eVar.start();
        b bVar = new b(this.f, this.g, this.k);
        this.j = bVar;
        bVar.start();
    }

    public void a(Request request) {
        synchronized (this.c) {
            this.c.remove(request);
        }
        synchronized (this.l) {
            for (b a2 : this.l) {
                a2.a(request);
            }
        }
        if (request.shouldCache()) {
            synchronized (this.b) {
                String generateCacheKey = this.k.b(request.getProtocolName()).generateCacheKey(request);
                Queue remove = this.b.remove(generateCacheKey);
                if (remove != null) {
                    LoggerWrapper.v(Quake.TAG, LoggerWrapper.buildMessage("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), generateCacheKey));
                    this.d.addAll(remove);
                }
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.c) {
            for (Request next : this.c) {
                if (aVar.a(next)) {
                    next.cancel();
                }
            }
        }
    }

    public void a(final Object obj) {
        if (obj != null) {
            a((a) new a() {
                public boolean a(Request request) {
                    return request.getTag() == obj;
                }
            });
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    public Request b(Request request) {
        request.setFinishListener(this);
        synchronized (this.c) {
            this.c.add(request);
        }
        request.setSequence(c());
        request.addMarker("add-to-queue");
        if (!request.shouldCache()) {
            this.e.add(request);
            return request;
        }
        synchronized (this.b) {
            String generateCacheKey = request.getProtocol().generateCacheKey(request);
            if (this.b.containsKey(generateCacheKey)) {
                Queue queue = this.b.get(generateCacheKey);
                if (queue == null) {
                    queue = new LinkedList();
                }
                queue.add(request);
                this.b.put(generateCacheKey, queue);
                LoggerWrapper.v(Quake.TAG, LoggerWrapper.buildMessage("Request for cacheKey=%s is in flight, putting on hold.", generateCacheKey));
            } else {
                this.b.put(generateCacheKey, (Object) null);
                this.d.add(request);
            }
        }
        return request;
    }

    public void b() {
        a aVar = this.i;
        if (aVar != null) {
            aVar.a();
        }
        e eVar = this.h;
        if (eVar != null) {
            eVar.a();
        }
        b bVar = this.j;
        if (bVar != null) {
            bVar.a();
        }
    }

    public int c() {
        return this.f9364a.incrementAndGet();
    }
}
