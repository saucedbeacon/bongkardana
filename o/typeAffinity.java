package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.appwidget.DanaIncomeWidgetProvider;
import o.ViewBoundsCheck$ViewBounds;

public final class typeAffinity implements getBindingAdapter<DanaIncomeWidgetProvider> {
    @InjectedFieldSignature("id.dana.appwidget.DanaIncomeWidgetProvider.danaAppWidgetPresenter")
    public static void setMin(DanaIncomeWidgetProvider danaIncomeWidgetProvider, ViewBoundsCheck$ViewBounds.getMin getmin) {
        danaIncomeWidgetProvider.danaAppWidgetPresenter = getmin;
    }
}
