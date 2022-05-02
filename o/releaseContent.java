package o;

import java.util.concurrent.TimeUnit;
import o.TitleBarRightButtonView;

final class releaseContent implements RedDotDrawable {
    public static final releaseContent setMax = new releaseContent();

    public final Object apply(Object obj) {
        return ((TitleBarRightButtonView.AnonymousClass1) obj).delay(60, TimeUnit.SECONDS);
    }
}
