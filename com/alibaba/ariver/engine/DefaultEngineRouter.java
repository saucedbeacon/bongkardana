package com.alibaba.ariver.engine;

import android.text.TextUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.bridge.EngineRouter;
import com.alibaba.ariver.kernel.common.utils.CollectionUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultEngineRouter implements EngineRouter {

    /* renamed from: a  reason: collision with root package name */
    private static final String f8966a;
    private final Object b = new Object();
    private final Map<String, Worker> c = new ConcurrentHashMap();
    private final Stack<Worker> d = new Stack<>();
    private final Map<String, Render> e = new ConcurrentHashMap();
    private final Stack<Render> f = new Stack<>();
    private Map<String, List<EngineRouter.RenderInitListener>> g;

    static {
        StringBuilder sb = new StringBuilder("AriverEngine:");
        sb.append(DefaultEngineRouter.class.getSimpleName());
        f8966a = sb.toString();
    }

    public void registerWorker(String str, Worker worker) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.d) {
                if (!this.c.containsKey(str)) {
                    this.c.put(str, worker);
                    this.d.push(worker);
                } else {
                    RVLogger.d(f8966a, "DefaultEngineRouter has sample worker ".concat(String.valueOf(str)));
                }
            }
        }
    }

    public void unRegisterWorker(String str) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.d) {
                RVLogger.d(f8966a, "unRegisterWorker: ".concat(String.valueOf(str)));
                Worker worker = this.c.get(str);
                if (worker != null) {
                    this.c.remove(str);
                    this.d.remove(worker);
                }
            }
        }
    }

    public Worker getWorkerById(String str) {
        synchronized (this.d) {
            if (!TextUtils.isEmpty(str)) {
                Worker worker = this.c.get(str);
                return worker;
            } else if (this.d.size() <= 0) {
                return null;
            } else {
                Worker peek = this.d.peek();
                return peek;
            }
        }
    }

    public void resetRenderToTop(Render render) {
        RVLogger.d(f8966a, "resetRenderToTop: ".concat(String.valueOf(render)));
        if (render != null) {
            synchronized (this.f) {
                if (this.f.remove(render)) {
                    this.f.push(render);
                }
            }
        }
    }

    public void registerRender(String str, Render render) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f) {
                if (!this.e.containsKey(str)) {
                    this.e.put(str, render);
                    this.f.push(render);
                } else {
                    RVLogger.d(f8966a, "DefaultEngineRouter has sample worker ".concat(String.valueOf(str)));
                }
                a(render);
            }
        }
    }

    public void unRegisterRender(String str) {
        RVLogger.d(f8966a, "unRegisterRender: ".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f) {
                Render render = this.e.get(str);
                if (render != null) {
                    this.e.remove(str);
                    this.f.remove(render);
                }
            }
        }
    }

    public Render getRenderById(String str) {
        synchronized (this.f) {
            if (!TextUtils.isEmpty(str)) {
                Render render = this.e.get(str);
                return render;
            } else if (this.f.size() <= 0) {
                return null;
            } else {
                Render peek = this.f.peek();
                return peek;
            }
        }
    }

    public List<Render> getRegisteredRender() {
        ArrayList arrayList;
        synchronized (this.f) {
            arrayList = new ArrayList(this.f);
        }
        return arrayList;
    }

    public void destroy() {
        Collection<Worker> values = this.c.values();
        for (Worker destroy : values) {
            destroy.destroy();
        }
        this.c.clear();
        this.e.clear();
        this.f.clear();
        values.clear();
        synchronized (this.b) {
            if (this.g != null) {
                this.g.clear();
            }
            this.g = null;
        }
    }

    public void registerRenderInitListener(String str, EngineRouter.RenderInitListener renderInitListener) {
        synchronized (this.b) {
            if (this.g == null) {
                this.g = new HashMap();
            }
            if (!this.g.containsKey(str)) {
                this.g.put(str, new LinkedList());
            }
            this.g.get(str).add(renderInitListener);
            Render renderById = getRenderById(str);
            if (renderById != null) {
                a(renderById);
            }
        }
    }

    private void a(Render render) {
        if (render != null) {
            String renderId = render.getRenderId();
            if (!TextUtils.isEmpty(renderId)) {
                synchronized (this.b) {
                    if (!CollectionUtils.isEmpty((Map) this.g)) {
                        List<EngineRouter.RenderInitListener> list = this.g.get(renderId);
                        if (!CollectionUtils.isEmpty((List) list)) {
                            for (EngineRouter.RenderInitListener onRenderInit : list) {
                                onRenderInit.onRenderInit(render);
                            }
                        }
                        this.g.remove(renderId);
                    }
                }
            }
        }
    }
}
