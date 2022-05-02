package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.PopManager;

@Module
public class SplitBillShareQRModule {
    private final PopManager.length setMax;

    @PerActivity
    @Provides
    public PopManager.getMax getMax(PopManager.AnonymousClass1 r1) {
        return r1;
    }

    public SplitBillShareQRModule(PopManager.length length) {
        this.setMax = length;
    }

    @PerActivity
    @Provides
    public PopManager.length setMax() {
        return this.setMax;
    }
}
