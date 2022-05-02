package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.elements.Descriptor;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public final class DescriptorMap implements DescriptorRegistrar {
    private Descriptor.Host mHost;
    private boolean mIsInitializing;
    private final Map<Class<?>, Descriptor> mMap = new IdentityHashMap();

    public final DescriptorMap beginInit() {
        Util.throwIf(this.mIsInitializing);
        this.mIsInitializing = true;
        return this;
    }

    public final DescriptorMap registerDescriptor(Class<?> cls, Descriptor descriptor) {
        Util.throwIfNull(cls);
        Util.throwIfNull(descriptor);
        Util.throwIf(descriptor.isInitialized());
        Util.throwIfNot(this.mIsInitializing);
        if (this.mMap.containsKey(cls)) {
            throw new UnsupportedOperationException();
        } else if (!this.mMap.containsValue(descriptor)) {
            this.mMap.put(cls, descriptor);
            return this;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final DescriptorMap setHost(Descriptor.Host host) {
        Util.throwIfNull(host);
        Util.throwIfNot(this.mIsInitializing);
        Util.throwIfNotNull(this.mHost);
        this.mHost = host;
        return this;
    }

    public final DescriptorMap endInit() {
        Util.throwIfNot(this.mIsInitializing);
        Util.throwIfNull(this.mHost);
        this.mIsInitializing = false;
        for (Class next : this.mMap.keySet()) {
            Descriptor descriptor = this.mMap.get(next);
            if (descriptor instanceof ChainedDescriptor) {
                ((ChainedDescriptor) descriptor).setSuper(getImpl(next.getSuperclass()));
            }
            descriptor.initialize(this.mHost);
        }
        return this;
    }

    @Nullable
    public final Descriptor get(Class<?> cls) {
        Util.throwIfNull(cls);
        Util.throwIf(this.mIsInitializing);
        return getImpl(cls);
    }

    @Nullable
    private Descriptor getImpl(Class<?> cls) {
        Class<? super Object> cls2;
        while (cls2 != null) {
            Descriptor descriptor = this.mMap.get(cls2);
            if (descriptor != null) {
                return descriptor;
            }
            Class<? super Object> superclass = cls2.getSuperclass();
            cls2 = cls;
            cls2 = superclass;
        }
        return null;
    }
}
