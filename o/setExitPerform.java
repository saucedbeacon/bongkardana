package o;

import android.content.Context;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.oauth.OAuthResult;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.data.globalnetwork.model.GnAuthResult;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010`\u0011J\u0016\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/data/miniprogram/source/local/MiniProgramPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mpPreferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "saPreferencesFacade", "Lid/dana/data/account/repository/source/SecuredAccountPreferences;", "clearAll", "", "getAccount", "Lid/dana/data/account/AccountEntity;", "getCacheAppCredential", "Ljava/util/HashMap;", "", "Lid/dana/data/globalnetwork/model/GnAuthResult;", "Lkotlin/collections/HashMap;", "saveCacheAuthCode", "appId", "gnAuthResult", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setExitPerform {
    @NotNull
    public static final getMin getMax;
    private static final String setMin;
    public final onSingleFailed getMin;
    public final getFrameMarginVerticalLess$core length;

    @Inject
    public setExitPerform(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(setMin).setUseDrutherPreference(true).setSerializerFacade((compareVersion) null)).createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(mpBu….createData(Source.LOCAL)");
        this.getMin = createData;
        getFrameMarginVerticalLess$core getframemarginverticalless_core = new getFrameMarginVerticalLess$core(context, (PluginInstallCallback) null);
        this.length = getframemarginverticalless_core;
        getframemarginverticalless_core.init(getBadgeList.getUserId(new BackKeyDownPoint(context), ""));
    }

    public final void getMax(@NotNull String str, @NotNull GnAuthResult gnAuthResult) {
        Intrinsics.checkNotNullParameter(str, "appId");
        Intrinsics.checkNotNullParameter(gnAuthResult, "gnAuthResult");
        gnAuthResult.setCallback((Callback<OAuthResult>) null);
        gnAuthResult.setAgreedOn(System.currentTimeMillis());
        HashMap<String, GnAuthResult> max = setMax();
        max.put(str, gnAuthResult);
        this.getMin.saveData("CACHE_AUTH_RESULT", max);
    }

    @NotNull
    public final HashMap<String, GnAuthResult> setMax() {
        HashMap<String, GnAuthResult> hashMap = (HashMap) this.getMin.getObject("CACHE_AUTH_RESULT", new HashMap().getClass());
        return hashMap == null ? new HashMap<>() : hashMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/miniprogram/source/local/MiniProgramPreference$Companion;", "", "()V", "CACHE_AUTH_RESULT", "", "MINI_PROGRAM_PREFERENCE", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    static {
        getMin getmin = new getMin((byte) 0);
        getMax = getmin;
        setMin = Intrinsics.stringPlus(Reflection.getOrCreateKotlinClass(getmin.getClass()).getSimpleName(), "production");
    }
}
