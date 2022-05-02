package o;

import o.ResourceLoadContext;
import o.b;

public final class BackInterceptPoint implements getAdapterPosition<ResourceLoadContext.Builder> {
    private final b.C0007b<WorkerStartParamInjectPoint> scopeResultMapperProvider;

    public BackInterceptPoint(b.C0007b<WorkerStartParamInjectPoint> bVar) {
        this.scopeResultMapperProvider = bVar;
    }

    public final ResourceLoadContext.Builder get() {
        return newInstance(this.scopeResultMapperProvider.get());
    }

    public static BackInterceptPoint create(b.C0007b<WorkerStartParamInjectPoint> bVar) {
        return new BackInterceptPoint(bVar);
    }

    public static ResourceLoadContext.Builder newInstance(WorkerStartParamInjectPoint workerStartParamInjectPoint) {
        return new ResourceLoadContext.Builder(workerStartParamInjectPoint);
    }
}
