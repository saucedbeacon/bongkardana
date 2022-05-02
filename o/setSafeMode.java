package o;

import android.content.Context;
import o.OnlineResourceFetcher;
import o.b;

public final class setSafeMode implements getAdapterPosition<getPerformanceTracker> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<OnlineResourceFetcher.ResourceListener> utdidFacadeProvider;

    public setSafeMode(b.C0007b<Context> bVar, b.C0007b<OnlineResourceFetcher.ResourceListener> bVar2) {
        this.contextProvider = bVar;
        this.utdidFacadeProvider = bVar2;
    }

    public final getPerformanceTracker get() {
        return newInstance(this.contextProvider.get(), this.utdidFacadeProvider.get());
    }

    public static setSafeMode create(b.C0007b<Context> bVar, b.C0007b<OnlineResourceFetcher.ResourceListener> bVar2) {
        return new setSafeMode(bVar, bVar2);
    }

    public static getPerformanceTracker newInstance(Context context, OnlineResourceFetcher.ResourceListener resourceListener) {
        return new getPerformanceTracker(context, resourceListener);
    }
}
