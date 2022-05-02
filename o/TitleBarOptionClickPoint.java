package o;

import java.util.concurrent.TimeUnit;
import o.TitleBarRightButtonView;

final class TitleBarOptionClickPoint implements RedDotDrawable {
    public static final TitleBarOptionClickPoint getMax = new TitleBarOptionClickPoint();

    public final Object apply(Object obj) {
        return TitleBarRightButtonView.AnonymousClass1.timer((long) Math.pow(5.0d, (double) ((Integer) obj).intValue()), TimeUnit.SECONDS);
    }
}
