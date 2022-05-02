package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fH\u0002J\u0013\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u000f0\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\u0013\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\u00130\u0013¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\n \r*\u0004\u0018\u00010\u00060\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lid/dana/data/requestmoney/repository/source/local/RequestMoneyPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "REQUEST_MONEY_PREFERENCE", "", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "saPreferencesFacade", "Lid/dana/data/account/repository/source/SecuredAccountPreferences;", "getAccount", "Lid/dana/data/account/AccountEntity;", "kotlin.jvm.PlatformType", "getNameCheckCount", "", "()Ljava/lang/Integer;", "getNameCheckExpiredPrefKey", "getNameCheckExpiredTime", "", "()Ljava/lang/Long;", "getNameCheckPrefKey", "getPhoneNumber", "initSaPreference", "", "setNameCheckCount", "", "count", "setNameCheckExpiredTime", "timestamp", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getSimpleNetworkType {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    private static final String REQUEST_MONEY_NAME_CHECK_COUNT = "request_money_name_check_count_";
    private static final String REQUEST_MONEY_NAME_CHECK_EXPIRED_TIME = "request_money_name_check_count_expired_time_";
    private String REQUEST_MONEY_PREFERENCE;
    private final Context context;
    private final onSingleFailed preferenceFacade;
    private getFrameMarginVerticalLess$core saPreferencesFacade;

    @Inject
    public getSimpleNetworkType(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        this.context = context2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("production");
        this.REQUEST_MONEY_PREFERENCE = sb.toString();
        initSaPreference();
        onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(this.context).setPreferenceGroup(this.REQUEST_MONEY_PREFERENCE).setUseDrutherPreference(true)).createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(loca….createData(Source.LOCAL)");
        this.preferenceFacade = createData;
    }

    private final void initSaPreference() {
        getFrameMarginVerticalLess$core getframemarginverticalless_core = new getFrameMarginVerticalLess$core(this.context, (PluginInstallCallback) null);
        this.saPreferencesFacade = getframemarginverticalless_core;
        if (getframemarginverticalless_core == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saPreferencesFacade");
        }
        getframemarginverticalless_core.init(getBadgeList.getUserId(new BackKeyDownPoint(this.context), ""));
    }

    public final boolean setNameCheckCount(int i) {
        this.preferenceFacade.saveData(getNameCheckPrefKey(), Integer.valueOf(i));
        return true;
    }

    public final Integer getNameCheckCount() {
        return this.preferenceFacade.getInteger(getNameCheckPrefKey());
    }

    public final boolean setNameCheckExpiredTime(long j) {
        this.preferenceFacade.saveData(getNameCheckExpiredPrefKey(), Long.valueOf(j));
        return true;
    }

    public final Long getNameCheckExpiredTime() {
        return this.preferenceFacade.getLong(getNameCheckExpiredPrefKey());
    }

    private final attach getAccount() {
        getFrameMarginVerticalLess$core getframemarginverticalless_core = this.saPreferencesFacade;
        if (getframemarginverticalless_core == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saPreferencesFacade");
        }
        return getframemarginverticalless_core.getAccount();
    }

    private final String getPhoneNumber() {
        if (getAccount() != null) {
            attach account = getAccount();
            Intrinsics.checkNotNullExpressionValue(account, "getAccount()");
            return account.getPhoneNumber();
        }
        initSaPreference();
        attach account2 = getAccount();
        Intrinsics.checkNotNullExpressionValue(account2, "getAccount()");
        return account2.getPhoneNumber();
    }

    private final String getNameCheckPrefKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(REQUEST_MONEY_NAME_CHECK_COUNT);
        sb.append(getPhoneNumber());
        return sb.toString();
    }

    private final String getNameCheckExpiredPrefKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(REQUEST_MONEY_NAME_CHECK_EXPIRED_TIME);
        sb.append(getPhoneNumber());
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/requestmoney/repository/source/local/RequestMoneyPreference$Companion;", "", "()V", "REQUEST_MONEY_NAME_CHECK_COUNT", "", "REQUEST_MONEY_NAME_CHECK_EXPIRED_TIME", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
