package com.alipay.mobile.rome.syncservice.sync.register;

import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncservice.sync.register.Biz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    static final String f9499a = a.class.getSimpleName();
    private static a k;
    public ConcurrentHashMap<String, Biz> b = new ConcurrentHashMap<>();
    public ConcurrentHashMap<Integer, Biz> c = new ConcurrentHashMap<>();
    public List<String> d = new ArrayList();
    public List<String> e = new ArrayList();
    public List<Integer> f = new ArrayList();
    public List<Integer> g = new ArrayList();
    public List<Integer> h = new ArrayList();
    public List<Integer> i = new ArrayList();
    public b j;

    private a() {
        b a2 = b.a();
        this.j = a2;
        Map<String, Biz> b2 = a2.b();
        if (b2 == null) {
            c.a(f9499a, "initBizInfo xml is empty or something error!");
        } else {
            try {
                a(b2);
            } catch (Exception e2) {
                c.d(f9499a, "initBizInfo map transfer error: ".concat(String.valueOf(e2)));
            }
        }
        b();
    }

    public static a a() {
        if (k == null) {
            synchronized (a.class) {
                if (k == null) {
                    k = new a();
                }
            }
        }
        return k;
    }

    public final Biz a(Integer num) {
        return this.c.get(num);
    }

    public final String b(Integer num) {
        ConcurrentHashMap<Integer, Biz> concurrentHashMap = this.c;
        if (concurrentHashMap == null) {
            return null;
        }
        Biz biz = concurrentHashMap.get(num);
        if (biz != null) {
            return biz.f9498a;
        }
        String str = f9499a;
        StringBuilder sb = new StringBuilder("getBizName index[");
        sb.append(num);
        sb.append("] no relevant bizName found.");
        c.d(str, sb.toString());
        return "";
    }

    public final Integer a(String str) {
        ConcurrentHashMap<String, Biz> concurrentHashMap = this.b;
        if (concurrentHashMap == null) {
            return null;
        }
        Biz biz = concurrentHashMap.get(str);
        if (biz != null) {
            return biz.b;
        }
        String str2 = f9499a;
        StringBuilder sb = new StringBuilder("getBizIndex name[");
        sb.append(str);
        sb.append("] no relevant bizIndex found.");
        c.d(str2, sb.toString());
        return -1;
    }

    public final Biz.BizDimeEnum b(String str) {
        ConcurrentHashMap<String, Biz> concurrentHashMap = this.b;
        if (concurrentHashMap == null) {
            return Biz.BizDimeEnum.NULL;
        }
        Biz biz = concurrentHashMap.get(str);
        if (biz != null) {
            return biz.f;
        }
        String str2 = f9499a;
        StringBuilder sb = new StringBuilder("getBizDime name[");
        sb.append(str);
        sb.append("] no relevant bizDime found.");
        c.d(str2, sb.toString());
        return Biz.BizDimeEnum.NULL;
    }

    private void b() {
        for (Biz a2 : this.c.values()) {
            a(a2);
        }
    }

    private void a(Map<String, Biz> map) {
        Biz biz;
        if (map != null) {
            String str = f9499a;
            StringBuilder sb = new StringBuilder("initBizMap: count = ");
            sb.append(map.size());
            c.a(str, sb.toString());
            this.b.putAll(map);
            for (Map.Entry next : map.entrySet()) {
                if (!(next == null || (biz = (Biz) next.getValue()) == null)) {
                    c.a(f9499a, "    initBizMap: item = ".concat(String.valueOf(biz)));
                    this.c.put(biz.b, biz);
                }
            }
        }
    }

    public final synchronized void a(Integer num, String str, Boolean bool, Integer num2, Boolean bool2) {
        this.j.a(num, str, bool, num2, false, bool2);
    }

    public final synchronized void a(Integer num, String str) {
        this.j.a(num, str, Boolean.FALSE, 1, true, Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    public final void a(Biz biz) {
        if (biz != null) {
            if (!(!biz.c && biz.e)) {
                return;
            }
            if (biz.f == Biz.BizDimeEnum.DEVICE) {
                this.i.add(biz.b);
                this.d.add(biz.f9498a);
                if (biz.d) {
                    this.h.add(biz.b);
                }
            } else if (biz.f == Biz.BizDimeEnum.USER) {
                this.g.add(biz.b);
                this.e.add(biz.f9498a);
                if (biz.d) {
                    this.f.add(biz.b);
                }
            }
        }
    }
}
