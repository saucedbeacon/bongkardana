package o;

import androidx.annotation.NonNull;
import id.dana.data.base.NetworkException;
import o.TitleBarRightButtonView;
import o.removeAnimatorListener;

public final class removeAllUpdateListeners<T extends removeAnimatorListener> implements RedDotDrawable<T, TitleBarRightButtonView.AnonymousClass1<T>> {
    public final TitleBarRightButtonView.AnonymousClass1<T> apply(@NonNull T t) {
        if (!t.success) {
            return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NetworkException((removeAnimatorListener) t));
        }
        return TitleBarRightButtonView.AnonymousClass1.just(t);
    }
}
