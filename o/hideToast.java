package o;

import java.util.concurrent.TimeUnit;
import o.TitleBarRightButtonView;

final class hideToast implements RedDotDrawable {
    public static final hideToast getMax = new hideToast();

    public final Object apply(Object obj) {
        return ((TitleBarRightButtonView.AnonymousClass1) obj).delay(3, TimeUnit.SECONDS);
    }
}
