package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lid/dana/data/kycrenewal/repository/source/session/KycRenewalPreference;", "", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "kycRenewalPreference", "", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "clearAll", "", "getKycRenewalPopup", "Lid/dana/domain/kycrenewal/model/ShowDialogPreference;", "getKycRenewalPopupButtonClicked", "", "getKycRenewalPopupDismissed", "", "getKycRenewalPopupShown", "getLastTimeKycRenewalPopupCheck", "", "getLastTimeKycRenewalPopupShown", "saveKycRenewalPopupButtonClicked", "clicked", "saveKycRenewalPopupShown", "show", "saveLastTimeKycRenewalPopupCheck", "timeStamp", "saveLastTimeKycRenewalPopupShown", "setKycRenewalPopupDismissed", "count", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getSmallDotView {
    @NotNull
    public static final length setMin = new length((byte) 0);
    private final Context getMax;
    private final String getMin = "KycRenewalPreferenceproduction";
    public final onSingleFailed setMax;

    @Inject
    public getSmallDotView(@NotNull Context context, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.getMax = context;
        onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(this.getMax).setPreferenceGroup(this.getMin).setUseDrutherPreference(true).setSerializerFacade(pluginInstallCallback)).createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(it).createData(Source.LOCAL)");
        this.setMax = createData;
    }

    public final boolean setMax(long j) {
        this.setMax.saveData("popup_check", Long.valueOf(j));
        return true;
    }

    public final boolean length() {
        Boolean bool = this.setMax.getBoolean("popup_show", false);
        Intrinsics.checkNotNullExpressionValue(bool, "preferenceFacade.getBoolean(POPUP_SHOW, false)");
        return bool.booleanValue();
    }

    public final boolean getMin(boolean z) {
        this.setMax.saveData("popup_show", Boolean.valueOf(z));
        return true;
    }

    public final boolean setMin(long j) {
        this.setMax.saveData("popup_show_last_time", Long.valueOf(j));
        return true;
    }

    public final boolean getMax(int i) {
        this.setMax.saveData("popup_dismiss", Integer.valueOf(i));
        return true;
    }

    public final boolean getMin() {
        Boolean bool = this.setMax.getBoolean("button_clicked", false);
        Intrinsics.checkNotNullExpressionValue(bool, "preferenceFacade.getBoolean(BUTTON_CLICKED, false)");
        return bool.booleanValue();
    }

    public final boolean length(boolean z) {
        this.setMax.saveData("button_clicked", Boolean.valueOf(z));
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/data/kycrenewal/repository/source/session/KycRenewalPreference$Companion;", "", "()V", "BUTTON_CLICKED", "", "POPUP_CHECK", "POPUP_DISMISS", "POPUP_SHOW", "POPUP_SHOW_LAST_TIME", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }
}
