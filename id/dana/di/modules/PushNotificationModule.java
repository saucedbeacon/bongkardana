package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.isDecorView;
import o.sortChildDrawingOrder;

@Module
public class PushNotificationModule {
    private final sortChildDrawingOrder.length setMin;

    /* access modifiers changed from: package-private */
    @PerActivity
    @Provides
    public sortChildDrawingOrder.getMin length(isDecorView isdecorview) {
        return isdecorview;
    }

    public PushNotificationModule(sortChildDrawingOrder.length length) {
        this.setMin = length;
    }

    @PerActivity
    @Provides
    public sortChildDrawingOrder.length getMax() {
        return this.setMin;
    }
}
