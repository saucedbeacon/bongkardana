package com.alibaba.ariver.kernel.common.immutable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableMap<K, V> implements Immutable<Map<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private Map<K, V> f10093a;

    public ImmutableMap(Map<K, V> map) {
        this.f10093a = map;
    }

    public int size() {
        Map<K, V> map = this.f10093a;
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    public boolean isEmpty() {
        Map<K, V> map = this.f10093a;
        return map == null || map.isEmpty();
    }

    public boolean containsKey(K k) {
        Map<K, V> map = this.f10093a;
        return map != null && map.containsKey(k);
    }

    public boolean containsValue(V v) {
        Map<K, V> map = this.f10093a;
        return map != null && map.containsValue(v);
    }

    public V get(K k, V v) {
        Map<K, V> map = this.f10093a;
        return map != null ? map.get(k) : v;
    }

    public ImmutableSet<K> keySet() {
        if (this.f10093a != null) {
            return new ImmutableSet<>(this.f10093a.keySet());
        }
        return null;
    }

    public ImmutableSet<V> values() {
        if (this.f10093a != null) {
            return new ImmutableSet<>(this.f10093a.values());
        }
        return null;
    }

    public Map<K, V> mutable() {
        return new HashMap(this.f10093a);
    }
}
