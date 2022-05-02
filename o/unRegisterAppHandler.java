package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/data/homeinfo/repository/source/local/MaintenanceBroadcastPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "lastDismissedBroadcast", "", "getLastDismissedBroadcast", "()Ljava/lang/String;", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "clearAll", "", "saveLastDismissedBroadcast", "", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class unRegisterAppHandler {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    private static final String HOME_WIDGET_STATE_PREFERENCE = "HomeWidgetStatePreferenceproduction";
    private static final String LAST_DISMISSED_BROADCAST = "last_dismissed_broadcast";
    private final onSingleFailed preferenceFacade;

    @Inject
    public unRegisterAppHandler(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(HOME_WIDGET_STATE_PREFERENCE).setUseDrutherPreference(true)).createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(buil….createData(Source.LOCAL)");
        this.preferenceFacade = createData;
    }

    @NotNull
    public final String getLastDismissedBroadcast() {
        String string = this.preferenceFacade.getString(LAST_DISMISSED_BROADCAST);
        return string == null ? "" : string;
    }

    public final boolean saveLastDismissedBroadcast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "lastDismissedBroadcast");
        this.preferenceFacade.saveData(LAST_DISMISSED_BROADCAST, str);
        return true;
    }

    public final void clearAll() {
        this.preferenceFacade.clearAllData();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/homeinfo/repository/source/local/MaintenanceBroadcastPreference$Companion;", "", "()V", "HOME_WIDGET_STATE_PREFERENCE", "", "LAST_DISMISSED_BROADCAST", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
