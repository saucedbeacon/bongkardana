package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.appwidget.DanaStatementWidgetProvider;
import o.ViewBoundsCheck$ViewBounds;

public final class entities implements getBindingAdapter<DanaStatementWidgetProvider> {
    @InjectedFieldSignature("id.dana.appwidget.DanaStatementWidgetProvider.danaAppWidgetPresenter")
    public static void getMin(DanaStatementWidgetProvider danaStatementWidgetProvider, ViewBoundsCheck$ViewBounds.getMin getmin) {
        danaStatementWidgetProvider.danaAppWidgetPresenter = getmin;
    }
}
