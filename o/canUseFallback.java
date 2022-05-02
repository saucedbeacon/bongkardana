package o;

import o.ResourceLoadContext;

final class canUseFallback implements RedDotDrawable {
    private final ResourceLoadContext.Builder setMin;

    public canUseFallback(ResourceLoadContext.Builder builder) {
        this.setMin = builder;
    }

    public final Object apply(Object obj) {
        return this.setMin.apply(obj);
    }
}
