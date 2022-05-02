package id.dana.contract.notification;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.isDecorView;
import o.sortChildDrawingOrder;

@Module
public class PushNotificationModule {
    private final sortChildDrawingOrder.length getMax;

    @PerActivity
    @Provides
    public sortChildDrawingOrder.getMin setMin(isDecorView isdecorview) {
        return isdecorview;
    }

    public PushNotificationModule(sortChildDrawingOrder.length length) {
        this.getMax = length;
    }

    @PerActivity
    @Provides
    public sortChildDrawingOrder.length getMin() {
        return this.getMax;
    }
}
