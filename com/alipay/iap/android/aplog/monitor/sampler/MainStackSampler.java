package com.alipay.iap.android.aplog.monitor.sampler;

import android.text.TextUtils;
import android.util.Log;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.monitor.watchdog.ANRError;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainStackSampler extends AbstractSampler {
    private static final LinkedHashMap<Long, String> c = new LinkedHashMap<>();
    private static String d;
    private int e;

    public MainStackSampler(long j) {
        this(10, j);
    }

    public MainStackSampler(int i, long j) {
        super(j);
        this.e = 10;
        this.e = i;
    }

    public String a(long j, long j2) {
        StringBuilder sb = new StringBuilder();
        synchronized (c) {
            for (Long next : c.keySet()) {
                if (j < next.longValue() && next.longValue() <= j2) {
                    sb.append(this.f10657a.format(next));
                    sb.append(" :");
                    sb.append("\n");
                    sb.append(c.get(next));
                    sb.append("\n");
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    public String b(long j, long j2) {
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

    public String c(long j, long j2) {
        int i;
        String str;
        synchronized (c) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            i = 0;
            int i2 = 0;
            for (Long next : c.keySet()) {
                if (j < next.longValue() && next.longValue() <= j2) {
                    i2++;
                    String str2 = c.get(next);
                    int i3 = 1;
                    if (linkedHashMap.containsKey(str2)) {
                        i3 = 1 + ((Integer) linkedHashMap.get(str2)).intValue();
                    }
                    linkedHashMap.put(str2, Integer.valueOf(i3));
                }
            }
            str = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int intValue = ((Integer) entry.getValue()).intValue();
                double d2 = (double) intValue;
                double d3 = (double) i2;
                Double.isNaN(d2);
                Double.isNaN(d3);
                double d4 = d2 / d3;
                if (intValue >= i && d4 > 0.6d) {
                    str = (String) entry.getKey();
                    i = intValue;
                }
            }
        }
        return i <= 0 ? b(j, j2) : str;
    }

    public synchronized void d(long j, long j2) {
        d = c(j, j2);
    }

    public synchronized String d() {
        String str;
        str = d;
        d = null;
        return str;
    }

    /* access modifiers changed from: protected */
    public void c() {
        LoggerFactory.getTraceLogger().info("ANRMonitor", "MainStackSampler.doSample");
        String stackTraceString = Log.getStackTraceString(ANRError.NewMainOnly());
        if (!TextUtils.isEmpty(stackTraceString)) {
            synchronized (c) {
                if (c.size() >= this.e && this.e > 0) {
                    LinkedHashMap<Long, String> linkedHashMap = c;
                    linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                }
                c.put(Long.valueOf(System.currentTimeMillis()), stackTraceString);
            }
        }
    }
}
