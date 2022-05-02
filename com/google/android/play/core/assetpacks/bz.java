package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

final class bz {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Double> f10880a = new HashMap();

    bz() {
    }

    /* access modifiers changed from: package-private */
    public final synchronized double a(String str, cr crVar) {
        double d;
        double d2 = (double) ((bs) crVar).e;
        Double.isNaN(d2);
        double d3 = d2 + 1.0d;
        double d4 = (double) ((bs) crVar).f;
        Double.isNaN(d4);
        d = d3 / d4;
        this.f10880a.put(str, Double.valueOf(d));
        return d;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str) {
        this.f10880a.put(str, Double.valueOf(0.0d));
    }

    /* access modifiers changed from: package-private */
    public final synchronized double b(String str) {
        Double d = this.f10880a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }
}
