package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Primitives;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@GwtIncompatible
public final class MutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {
    private final Map<Class<? extends B>, B> delegate;

    public static <B> MutableClassToInstanceMap<B> create() {
        return new MutableClassToInstanceMap<>(new HashMap());
    }

    public static <B> MutableClassToInstanceMap<B> create(Map<Class<? extends B>, B> map) {
        return new MutableClassToInstanceMap<>(map);
    }

    private MutableClassToInstanceMap(Map<Class<? extends B>, B> map) {
        this.delegate = (Map) Preconditions.checkNotNull(map);
    }

    /* access modifiers changed from: protected */
    public final Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    static <B> Map.Entry<Class<? extends B>, B> checkedEntry(final Map.Entry<Class<? extends B>, B> entry) {
        return new ForwardingMapEntry<Class<? extends B>, B>() {
            /* access modifiers changed from: protected */
            public final Map.Entry<Class<? extends B>, B> delegate() {
                return entry;
            }

            public final B setValue(B b) {
                return super.setValue(MutableClassToInstanceMap.cast((Class) getKey(), b));
            }
        };
    }

    public final Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new ForwardingSet<Map.Entry<Class<? extends B>, B>>() {
            /* access modifiers changed from: protected */
            public Set<Map.Entry<Class<? extends B>, B>> delegate() {
                return MutableClassToInstanceMap.this.delegate().entrySet();
            }

            public Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
                return new TransformedIterator<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>>(delegate().iterator()) {
                    /* access modifiers changed from: package-private */
                    public Map.Entry<Class<? extends B>, B> transform(Map.Entry<Class<? extends B>, B> entry) {
                        return MutableClassToInstanceMap.checkedEntry(entry);
                    }
                };
            }

            public Object[] toArray() {
                return standardToArray();
            }

            public <T> T[] toArray(T[] tArr) {
                return standardToArray(tArr);
            }
        };
    }

    @CanIgnoreReturnValue
    public final B put(Class<? extends B> cls, B b) {
        return super.put(cls, cast(cls, b));
    }

    public final void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            cast((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    @CanIgnoreReturnValue
    public final <T extends B> T putInstance(Class<T> cls, T t) {
        return cast(cls, put(cls, t));
    }

    public final <T extends B> T getInstance(Class<T> cls) {
        return cast(cls, get(cls));
    }

    /* access modifiers changed from: private */
    @CanIgnoreReturnValue
    public static <B, T extends B> T cast(Class<T> cls, B b) {
        return Primitives.wrap(cls).cast(b);
    }

    private Object writeReplace() {
        return new SerializedForm(delegate());
    }

    static final class SerializedForm<B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Map<Class<? extends B>, B> backingMap;

        SerializedForm(Map<Class<? extends B>, B> map) {
            this.backingMap = map;
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return MutableClassToInstanceMap.create(this.backingMap);
        }
    }
}
