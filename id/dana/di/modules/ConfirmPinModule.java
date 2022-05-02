package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.SensorBridgeExtension;
import o.SensorServiceManager;

@Module
public class ConfirmPinModule {
    private SensorBridgeExtension.AnonymousClass4.getMax getMin;

    @PerActivity
    @Provides
    public SensorBridgeExtension.AnonymousClass4.length setMax(SensorServiceManager sensorServiceManager) {
        return sensorServiceManager;
    }

    public ConfirmPinModule(SensorBridgeExtension.AnonymousClass4.getMax getmax) {
        this.getMin = getmax;
    }

    @PerActivity
    @Provides
    public SensorBridgeExtension.AnonymousClass4.getMax getMin() {
        return this.getMin;
    }
}
