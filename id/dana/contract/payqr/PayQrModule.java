package id.dana.contract.payqr;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.isUserInputEnabled;
import o.onPageScrollStateChanged;

@Module
public class PayQrModule {
    private final isUserInputEnabled.length setMax;

    @PerActivity
    @Provides
    public isUserInputEnabled.getMax getMin(onPageScrollStateChanged onpagescrollstatechanged) {
        return onpagescrollstatechanged;
    }

    public PayQrModule(isUserInputEnabled.length length) {
        this.setMax = length;
    }

    @PerActivity
    @Provides
    public isUserInputEnabled.length setMin() {
        return this.setMax;
    }
}
