package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fH\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\u00060\u0006H\u0002J\u0006\u0010\u0010\u001a\u00020\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/data/sendmoney/repository/source/local/SendMoneyPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "SEND_MONEY_PREFERENCE", "", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "saPreferencesFacade", "Lid/dana/data/account/repository/source/SecuredAccountPreferences;", "getAccount", "Lid/dana/data/account/AccountEntity;", "kotlin.jvm.PlatformType", "getExternalOnboardingPrefKey", "getPhoneNumber", "getStateSendMoneyShareFeed", "initSaPreference", "", "isNeedToShowExternalOnboardingDialog", "", "saveIsNeedToShowExternalOnboardingDialog", "isShow", "saveStateSendMoneyShareFeed", "state", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getCORSUrl {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    private static final String FIRST_STATE_SEND_MONEY_SHARE_FEED = "firstTime";
    private static final String SEND_MONEY_EXTERNAL_ONBOARDING = "send_money_external_onboarding_";
    @NotNull
    public static final String SEND_MONEY_SHARE_FEED = "send_money_share_feed";
    private String SEND_MONEY_PREFERENCE;
    private final Context context;
    private final onSingleFailed preferenceFacade;
    private getFrameMarginVerticalLess$core saPreferencesFacade;

    @Inject
    public getCORSUrl(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        this.context = context2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("production");
        this.SEND_MONEY_PREFERENCE = sb.toString();
        initSaPreference();
        onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(this.context).setPreferenceGroup(this.SEND_MONEY_PREFERENCE).setUseDrutherPreference(true)).createData("local");
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

    public final boolean saveIsNeedToShowExternalOnboardingDialog(boolean z) {
        this.preferenceFacade.saveData(getExternalOnboardingPrefKey(), Boolean.valueOf(!z));
        return true;
    }

    public final boolean isNeedToShowExternalOnboardingDialog() {
        return !this.preferenceFacade.getBoolean(getExternalOnboardingPrefKey()).booleanValue();
    }

    public final boolean saveStateSendMoneyShareFeed(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "state");
        this.preferenceFacade.saveData(SEND_MONEY_SHARE_FEED, str);
        return true;
    }

    @NotNull
    public final String getStateSendMoneyShareFeed() {
        String string = this.preferenceFacade.getString(SEND_MONEY_SHARE_FEED);
        return string == null ? "firstTime" : string;
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

    private final String getExternalOnboardingPrefKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(SEND_MONEY_EXTERNAL_ONBOARDING);
        sb.append(getPhoneNumber());
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/data/sendmoney/repository/source/local/SendMoneyPreference$Companion;", "", "()V", "FIRST_STATE_SEND_MONEY_SHARE_FEED", "", "SEND_MONEY_EXTERNAL_ONBOARDING", "SEND_MONEY_SHARE_FEED", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
