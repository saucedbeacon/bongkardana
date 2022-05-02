package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/data/paymentsetting/repository/source/session/PaymentSettingPreference;", "", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "paymentSettingPreference", "", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "getPaymentSettingCheck", "", "phoneNumber", "savePaymentSettingCheck", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getAppRecord {
    @NotNull
    public static final getMin getMin = new getMin((byte) 0);
    private final String getMax = "PaymentSettingPreferenceproduction";
    private final onSingleFailed length;
    private final Context setMin;

    @Inject
    public getAppRecord(@NotNull Context context, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.setMin = context;
        onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(this.setMin).setPreferenceGroup(this.getMax).setUseDrutherPreference(true).setSerializerFacade(pluginInstallCallback)).createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(it).createData(Source.LOCAL)");
        this.length = createData;
    }

    public final boolean setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Boolean bool = this.length.getBoolean("BOTTOMSHEET_PAYMENT_SETTING_CHECK".concat(String.valueOf(str)), true);
        Intrinsics.checkNotNullExpressionValue(bool, "preferenceFacade.getBool…HECK + phoneNumber, true)");
        return bool.booleanValue();
    }

    public final boolean getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        this.length.saveData("BOTTOMSHEET_PAYMENT_SETTING_CHECK".concat(String.valueOf(str)), Boolean.FALSE);
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/paymentsetting/repository/source/session/PaymentSettingPreference$Companion;", "", "()V", "BOTTOMSHEET_PAYMENT_SETTING_CHECK", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }
}
