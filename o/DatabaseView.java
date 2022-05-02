package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.appwidget.collectionview.StatementDataProvider;
import o.ViewBoundsCheck$ViewBounds;

public final class DatabaseView implements getBindingAdapter<StatementDataProvider> {
    @InjectedFieldSignature("id.dana.appwidget.collectionview.StatementDataProvider.danaAppWidgetPresenter")
    public static void setMin(StatementDataProvider statementDataProvider, ViewBoundsCheck$ViewBounds.getMin getmin) {
        statementDataProvider.danaAppWidgetPresenter = getmin;
    }
}
