package id.dana.contract.staticqr;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.OnItemSelected$Callback;
import o.callback;

@Module
public class DecodeQrImageModule {
    private final callback.getMin getMin;

    @PerActivity
    @Provides
    public callback.setMax setMax(OnItemSelected$Callback onItemSelected$Callback) {
        return onItemSelected$Callback;
    }

    public DecodeQrImageModule(callback.getMin getmin) {
        this.getMin = getmin;
    }

    @PerActivity
    @Provides
    public callback.getMin length() {
        return this.getMin;
    }
}
