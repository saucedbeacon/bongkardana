package o;

import android.app.Application;
import android.content.Context;
import id.dana.appwidget.DanaIncomeWidgetProvider;
import id.dana.appwidget.DanaQuickActionMediumWidgetProvider;
import id.dana.appwidget.DanaQuickActionWidgetProvider;
import id.dana.appwidget.DanaStatementLargeWidgetProvider;
import id.dana.appwidget.DanaStatementWidgetProvider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lid/dana/appwidget/AppWidgetUtils;", "", "()V", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AutoMigration {
    @NotNull
    public static final setMax setMax = new setMax((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\b"}, d2 = {"Lid/dana/appwidget/AppWidgetUtils$Companion;", "", "()V", "showWidgetContentView", "", "context", "Landroid/app/Application;", "showWidgetLoginView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    @JvmStatic
    public static final void setMax(@Nullable Application application) {
        if (application != null) {
            DanaQuickActionWidgetProvider.length length = DanaQuickActionWidgetProvider.Companion;
            Context context = application;
            DanaQuickActionWidgetProvider.length.getMin(context, true);
            DanaStatementWidgetProvider.length length2 = DanaStatementWidgetProvider.Companion;
            DanaStatementWidgetProvider.length.getMin(context, true);
            DanaIncomeWidgetProvider.length length3 = DanaIncomeWidgetProvider.Companion;
            DanaIncomeWidgetProvider.length.getMax(context, true);
            DanaQuickActionMediumWidgetProvider.setMin setmin = DanaQuickActionMediumWidgetProvider.Companion;
            DanaQuickActionMediumWidgetProvider.setMin.length(context, true);
            DanaStatementLargeWidgetProvider.getMin getmin = DanaStatementLargeWidgetProvider.Companion;
            DanaStatementLargeWidgetProvider.getMin.setMin(context, true);
        }
    }

    @JvmStatic
    public static final void setMin(@Nullable Application application) {
        if (application != null) {
            DanaQuickActionWidgetProvider.length length = DanaQuickActionWidgetProvider.Companion;
            Context context = application;
            DanaQuickActionWidgetProvider.length.getMin(context, false);
            DanaStatementWidgetProvider.length length2 = DanaStatementWidgetProvider.Companion;
            DanaStatementWidgetProvider.length.getMin(context, false);
            DanaIncomeWidgetProvider.length length3 = DanaIncomeWidgetProvider.Companion;
            DanaIncomeWidgetProvider.length.getMax(context, false);
            DanaQuickActionMediumWidgetProvider.setMin setmin = DanaQuickActionMediumWidgetProvider.Companion;
            DanaQuickActionMediumWidgetProvider.setMin.length(context, false);
            DanaStatementLargeWidgetProvider.getMin getmin = DanaStatementLargeWidgetProvider.Companion;
            DanaStatementLargeWidgetProvider.getMin.setMin(context, false);
        }
    }
}
