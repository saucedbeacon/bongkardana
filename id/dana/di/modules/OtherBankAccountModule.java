package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.setEnableSaliency;
import o.setPriority;

@Module
public class OtherBankAccountModule {
    private final setPriority.length length;

    /* access modifiers changed from: package-private */
    @PerActivity
    @Provides
    public setPriority.getMin getMin(setEnableSaliency setenablesaliency) {
        return setenablesaliency;
    }

    public OtherBankAccountModule(setPriority.length length2) {
        this.length = length2;
    }

    @PerActivity
    @Provides
    public setPriority.length length() {
        return this.length;
    }
}
