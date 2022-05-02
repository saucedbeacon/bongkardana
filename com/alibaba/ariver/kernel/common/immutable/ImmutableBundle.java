package com.alibaba.ariver.kernel.common.immutable;

import android.os.Bundle;

public class ImmutableBundle implements Immutable<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private Bundle f9134a;

    public ImmutableBundle(Bundle bundle) {
        this.f9134a = bundle;
    }

    public boolean getBoolean(String str, boolean z) {
        Bundle bundle = this.f9134a;
        return bundle != null ? bundle.getBoolean(str, z) : z;
    }

    public int getInt(String str, int i) {
        Bundle bundle = this.f9134a;
        return bundle != null ? bundle.getInt(str, i) : i;
    }

    public long getLong(String str, long j) {
        Bundle bundle = this.f9134a;
        return bundle != null ? bundle.getLong(str, j) : j;
    }

    public double getDouble(String str, double d) {
        Bundle bundle = this.f9134a;
        return bundle != null ? bundle.getDouble(str, d) : d;
    }

    public String getString(String str, String str2) {
        Bundle bundle = this.f9134a;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    public boolean containsKey(String str) {
        Bundle bundle = this.f9134a;
        return bundle != null && bundle.containsKey(str);
    }

    public int size() {
        Bundle bundle = this.f9134a;
        if (bundle != null) {
            return bundle.size();
        }
        return 0;
    }

    public boolean isEmpty() {
        Bundle bundle = this.f9134a;
        return bundle == null || bundle.isEmpty();
    }

    public ImmutableSet<String> keySet() {
        if (this.f9134a != null) {
            return new ImmutableSet<>(this.f9134a.keySet());
        }
        return null;
    }

    public Bundle mutable() {
        return new Bundle(this.f9134a);
    }

    public String toString() {
        if (this.f9134a == null) {
            return "ImmutableBundle{NULL}";
        }
        StringBuilder sb = new StringBuilder("ImmutableBundle{");
        sb.append(this.f9134a.toString());
        sb.append("}");
        return sb.toString();
    }
}
