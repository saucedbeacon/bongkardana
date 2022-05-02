package o;

import android.util.Pair;
import o.TitleBarRightButtonView;

final class getLongValue implements RedDotDrawable {
    private final String length;

    public getLongValue(String str) {
        this.length = str;
    }

    public final Object apply(Object obj) {
        return TitleBarRightButtonView.AnonymousClass1.just(new Pair(this.length, (String) obj));
    }
}
