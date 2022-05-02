package io.reactivex.internal.disposables;

import io.reactivex.annotations.Nullable;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;
import o.setOptionMenuIcon;
import o.setRefreshTips;
import o.switchFavoriteIconFont;

public enum EmptyDisposable implements setRefreshTips<Object> {
    INSTANCE,
    NEVER;

    public final void clear() {
    }

    public final void dispose() {
    }

    public final boolean isEmpty() {
        return true;
    }

    @Nullable
    public final Object poll() throws Exception {
        return null;
    }

    public final int requestFusion(int i) {
        return i & 2;
    }

    public final boolean isDisposed() {
        return this == INSTANCE;
    }

    public static void complete(GriverProgressBar<?> griverProgressBar) {
        griverProgressBar.onSubscribe(INSTANCE);
        griverProgressBar.onComplete();
    }

    public static void complete(setOptionMenuIcon<?> setoptionmenuicon) {
        setoptionmenuicon.onSubscribe(INSTANCE);
        setoptionmenuicon.onComplete();
    }

    public static void error(Throwable th, GriverProgressBar<?> griverProgressBar) {
        griverProgressBar.onSubscribe(INSTANCE);
        griverProgressBar.onError(th);
    }

    public static void complete(switchFavoriteIconFont switchfavoriteiconfont) {
        switchfavoriteiconfont.onSubscribe(INSTANCE);
        switchfavoriteiconfont.onComplete();
    }

    public static void error(Throwable th, switchFavoriteIconFont switchfavoriteiconfont) {
        switchfavoriteiconfont.onSubscribe(INSTANCE);
        switchfavoriteiconfont.onError(th);
    }

    public static void error(Throwable th, TitleBarRightButtonView.CornerMarkingUIController<?> cornerMarkingUIController) {
        cornerMarkingUIController.onSubscribe(INSTANCE);
        cornerMarkingUIController.onError(th);
    }

    public static void error(Throwable th, setOptionMenuIcon<?> setoptionmenuicon) {
        setoptionmenuicon.onSubscribe(INSTANCE);
        setoptionmenuicon.onError(th);
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
