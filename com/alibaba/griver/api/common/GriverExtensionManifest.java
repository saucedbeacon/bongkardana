package com.alibaba.griver.api.common;

public class GriverExtensionManifest {

    /* renamed from: a  reason: collision with root package name */
    private Class<? extends GriverExtension> f9158a;
    private GriverExtension b;

    public Class<? extends GriverExtension> getExtensionClass() {
        return this.f9158a;
    }

    public void setExtensionClass(Class<? extends GriverExtension> cls) {
        this.f9158a = cls;
    }

    public GriverExtension getExtensionImpl() {
        return this.b;
    }

    public void setExtensionImpl(GriverExtension griverExtension) {
        this.b = griverExtension;
    }

    public GriverExtensionManifest(Class<? extends GriverExtension> cls, GriverExtension griverExtension) {
        this.f9158a = cls;
        this.b = griverExtension;
    }
}
