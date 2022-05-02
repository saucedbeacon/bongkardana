package o;

import java.util.concurrent.TimeUnit;
import o.TitleBarRightButtonView;

final class H5ServiceWorkerPushProvider implements RedDotDrawable {
    public static final H5ServiceWorkerPushProvider setMin = new H5ServiceWorkerPushProvider();

    public final Object apply(Object obj) {
        return ((TitleBarRightButtonView.AnonymousClass1) obj).delay(30, TimeUnit.SECONDS);
    }
}
