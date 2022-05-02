package io.reactivex.internal.util;

import o.GriverProgressBar;
import o.SecuritySignature;
import o.TitleBarRightButtonView;
import o.getFmt;
import o.getbEva;
import o.setOptionMenuIcon;
import o.switchFavoriteIconFont;
import o.switchTheme;

public enum EmptyComponent implements switchTheme<Object>, GriverProgressBar<Object>, setOptionMenuIcon<Object>, TitleBarRightButtonView.CornerMarkingUIController<Object>, switchFavoriteIconFont, getFmt, GriverProgressBar.UpdateRunnable {
    INSTANCE;

    public final void cancel() {
    }

    public final void dispose() {
    }

    public final boolean isDisposed() {
        return true;
    }

    public final void onComplete() {
    }

    public final void onNext(Object obj) {
    }

    public final void onSuccess(Object obj) {
    }

    public final void request(long j) {
    }

    public static <T> getbEva<T> asSubscriber() {
        return INSTANCE;
    }

    public static <T> GriverProgressBar<T> asObserver() {
        return INSTANCE;
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        updateRunnable.dispose();
    }

    public final void onSubscribe(getFmt getfmt) {
        getfmt.cancel();
    }

    public final void onError(Throwable th) {
        SecuritySignature.getMax(th);
    }
}
