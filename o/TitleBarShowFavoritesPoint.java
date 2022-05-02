package o;

import java.util.concurrent.TimeUnit;
import o.TitleBarRightButtonView;

final class TitleBarShowFavoritesPoint implements RedDotDrawable {
    public static final TitleBarShowFavoritesPoint getMin = new TitleBarShowFavoritesPoint();

    public final Object apply(Object obj) {
        return TitleBarRightButtonView.AnonymousClass1.timer((long) Math.pow(5.0d, (double) ((Integer) obj).intValue()), TimeUnit.SECONDS);
    }
}
