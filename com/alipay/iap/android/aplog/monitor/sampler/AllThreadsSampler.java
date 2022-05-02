package com.alipay.iap.android.aplog.monitor.sampler;

import android.text.TextUtils;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.monitor.util.ANRUtil;
import java.util.LinkedHashMap;

public class AllThreadsSampler extends AbstractSampler {
    private static final LinkedHashMap<Long, String> c = new LinkedHashMap<>();
    private int d;

    public AllThreadsSampler(long j) {
        this(3, j);
    }

    public AllThreadsSampler(int i, long j) {
        super(j);
        this.d = 3;
        this.d = i;
    }

    public String a(long j, long j2) {
        String str;
        synchronized (c) {
            str = null;
            for (Long next : c.keySet()) {
                if (j < next.longValue() && next.longValue() <= j2) {
                    str = c.get(next);
                }
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public void c() {
        LoggerFactory.getTraceLogger().info("ANRMonitor", "AllThreadsSampler.doSample");
        String a2 = ANRUtil.a();
        if (!TextUtils.isEmpty(a2)) {
            synchronized (c) {
                if (c.size() >= this.d && this.d > 0) {
                    LinkedHashMap<Long, String> linkedHashMap = c;
                    linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                }
                c.put(Long.valueOf(System.currentTimeMillis()), a2);
            }
        }
    }
}
