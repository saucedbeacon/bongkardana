package o;

import id.dana.AppLifeCycleObserver;
import id.dana.di.modules.ApplicationModule;
import o.b;

public final class ignores implements getAdapterPosition<AppLifeCycleObserver> {
    private final b.C0007b<isAlipayApp> getMax;
    private final ApplicationModule getMin;
    private final b.C0007b<getFrameMarginVertical$core> length;

    private ignores(ApplicationModule applicationModule, b.C0007b<getFrameMarginVertical$core> bVar, b.C0007b<isAlipayApp> bVar2) {
        this.getMin = applicationModule;
        this.length = bVar;
        this.getMax = bVar2;
    }

    public static ignores getMax(ApplicationModule applicationModule, b.C0007b<getFrameMarginVertical$core> bVar, b.C0007b<isAlipayApp> bVar2) {
        return new ignores(applicationModule, bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        AppLifeCycleObserver max = this.getMin.setMax(this.length.get(), this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
