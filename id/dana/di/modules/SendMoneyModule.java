package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.DiagnosticsReceiver;
import o.cancelAllWorkByTag;

@Module
public class SendMoneyModule {
    private DiagnosticsReceiver.length setMax;

    @PerActivity
    @Provides
    public DiagnosticsReceiver.getMin length(cancelAllWorkByTag cancelallworkbytag) {
        return cancelallworkbytag;
    }

    public SendMoneyModule(DiagnosticsReceiver.length length) {
        this.setMax = length;
    }

    @PerActivity
    @Provides
    public DiagnosticsReceiver.length getMin() {
        return this.setMax;
    }
}
