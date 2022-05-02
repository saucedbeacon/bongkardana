package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.isEnableEventBus;
import o.setAspectRatio;

@Module
public class PaymentAuthenticationModule {
    private setAspectRatio.length getMax;

    @Provides
    public setAspectRatio.setMax setMin(isEnableEventBus isenableeventbus) {
        return isenableeventbus;
    }

    public PaymentAuthenticationModule(setAspectRatio.length length) {
        this.getMax = length;
    }

    @Provides
    public setAspectRatio.length setMin() {
        return this.getMax;
    }
}
