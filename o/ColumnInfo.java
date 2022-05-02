package o;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.database.ContentObserver;
import android.os.Handler;
import dagger.internal.InjectedFieldSignature;
import id.dana.R;
import id.dana.appwidget.DanaQuickActionMediumWidgetProvider;
import id.dana.appwidget.DanaStatementMediumWidgetProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ViewBoundsCheck$ViewBounds;
import org.jetbrains.annotations.NotNull;

public final class ColumnInfo implements getBindingAdapter<DanaQuickActionMediumWidgetProvider> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/appwidget/collectionview/StatementDataProviderObserver;", "Landroid/database/ContentObserver;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "componentName", "Landroid/content/ComponentName;", "handler", "Landroid/os/Handler;", "(Landroid/appwidget/AppWidgetManager;Landroid/content/ComponentName;Landroid/os/Handler;)V", "onChange", "", "selfChange", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class SQLiteTypeAffinity extends ContentObserver {
        private final ComponentName getMax;
        private final AppWidgetManager setMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SQLiteTypeAffinity(@NotNull AppWidgetManager appWidgetManager, @NotNull ComponentName componentName, @NotNull Handler handler) {
            super(handler);
            Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.setMin = appWidgetManager;
            this.getMax = componentName;
        }

        public final void onChange(boolean z) {
            AppWidgetManager appWidgetManager = this.setMin;
            appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetManager.getAppWidgetIds(this.getMax), R.id.f54192131363977);
            AppWidgetManager appWidgetManager2 = this.setMin;
            appWidgetManager2.notifyAppWidgetViewDataChanged(appWidgetManager2.getAppWidgetIds(this.getMax), R.id.f54182131363976);
        }
    }

    public final class Collate implements getBindingAdapter<DanaStatementMediumWidgetProvider> {
        @InjectedFieldSignature("id.dana.appwidget.DanaStatementMediumWidgetProvider.danaAppWidgetPresenter")
        public static void getMin(DanaStatementMediumWidgetProvider danaStatementMediumWidgetProvider, ViewBoundsCheck$ViewBounds.getMin getmin) {
            danaStatementMediumWidgetProvider.danaAppWidgetPresenter = getmin;
        }
    }

    @InjectedFieldSignature("id.dana.appwidget.DanaQuickActionMediumWidgetProvider.danaAppWidgetPresenter")
    public static void length(DanaQuickActionMediumWidgetProvider danaQuickActionMediumWidgetProvider, ViewBoundsCheck$ViewBounds.getMin getmin) {
        danaQuickActionMediumWidgetProvider.danaAppWidgetPresenter = getmin;
    }
}
