package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.appwidget.DanaQuickActionWidgetProvider;
import o.ViewBoundsCheck$ViewBounds;

public final class Database implements getBindingAdapter<DanaQuickActionWidgetProvider> {
    @InjectedFieldSignature("id.dana.appwidget.DanaQuickActionWidgetProvider.danaAppWidgetPresenter")
    public static void getMin(DanaQuickActionWidgetProvider danaQuickActionWidgetProvider, ViewBoundsCheck$ViewBounds.getMin getmin) {
        danaQuickActionWidgetProvider.danaAppWidgetPresenter = getmin;
    }
}
