package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.appwidget.DanaStatementLargeWidgetProvider;
import o.ViewBoundsCheck$ViewBounds;

public final class Dao implements getBindingAdapter<DanaStatementLargeWidgetProvider> {
    @InjectedFieldSignature("id.dana.appwidget.DanaStatementLargeWidgetProvider.danaAppWidgetPresenter")
    public static void getMin(DanaStatementLargeWidgetProvider danaStatementLargeWidgetProvider, ViewBoundsCheck$ViewBounds.getMin getmin) {
        danaStatementLargeWidgetProvider.danaAppWidgetPresenter = getmin;
    }
}
