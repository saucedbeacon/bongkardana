package o;

import android.app.Activity;
import com.google.firebase.perf.metrics.Trace;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.oauth.activity.InputNameActivity;
import id.dana.oauth.activity.OauthGrantActivity;
import id.dana.oauth.model.OauthParamsModel;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0007J\u001e\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002J\u001e\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\r"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureOauth;", "", "()V", "invoke", "", "activity", "Landroid/app/Activity;", "params", "", "", "shouldInputName", "", "shouldShowAgreement", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class excludeId {
    @NotNull
    public static final excludeId getMin = new excludeId();

    private excludeId() {
    }

    @JvmStatic
    public static final void setMax(@Nullable Activity activity, @NotNull Map<String, String> map) {
        List<String> list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Activity activity2 = activity;
        Map<String, String> map2 = map;
        Intrinsics.checkNotNullParameter(map2, "params");
        if (activity2 != null) {
            Intrinsics.checkNotNullParameter(map2, "$this$toOauthParamsModel");
            String str13 = map2.get("clientId");
            String str14 = str13 == null ? "" : str13;
            String str15 = map2.get(BranchLinkConstant.OauthParams.SCOPES);
            if (str15 == null || (list = setStartContext.toScopes(str15)) == null) {
                list = CollectionsKt.emptyList();
            }
            List<String> list2 = list;
            String str16 = map2.get("state");
            if (str16 == null) {
                str = "";
            } else {
                str = str16;
            }
            String str17 = map2.get(BranchLinkConstant.OauthParams.REDIRECT_URL);
            if (str17 == null) {
                str2 = "";
            } else {
                str2 = str17;
            }
            String str18 = map2.get(BranchLinkConstant.OauthParams.BIND_DANA_TYPE);
            if (str18 == null) {
                str3 = "";
            } else {
                str3 = str18;
            }
            String str19 = map2.get(BranchLinkConstant.OauthParams.ACQ_SITE_ID);
            if (str19 == null) {
                str4 = "";
            } else {
                str4 = str19;
            }
            String str20 = map2.get("merchantId");
            if (str20 == null) {
                str5 = "";
            } else {
                str5 = str20;
            }
            String str21 = map2.get(BranchLinkConstant.OauthParams.MERCHANT_NAME);
            if (str21 == null) {
                str6 = "";
            } else {
                str6 = str21;
            }
            String str22 = map2.get(BranchLinkConstant.OauthParams.NET_AUTH_ID);
            if (str22 == null) {
                str7 = "";
            } else {
                str7 = str22;
            }
            String str23 = map2.get(BranchLinkConstant.OauthParams.PAY_SITE_ID);
            if (str23 == null) {
                str8 = "";
            } else {
                str8 = str23;
            }
            String str24 = map2.get(BranchLinkConstant.OauthParams.TERMINAL_TYPE);
            if (str24 == null) {
                str9 = "";
            } else {
                str9 = str24;
            }
            String str25 = map2.get(BranchLinkConstant.OauthParams.SIGNATURE);
            if (str25 == null) {
                str10 = "";
            } else {
                str10 = str25;
            }
            String str26 = map2.get(BranchLinkConstant.OauthParams.MCC);
            if (str26 == null) {
                str11 = "";
            } else {
                str11 = str26;
            }
            String str27 = map2.get(BranchLinkConstant.OauthParams.REFERRING_LINK);
            if (str27 == null) {
                str12 = "";
            } else {
                str12 = str27;
            }
            OauthParamsModel oauthParamsModel = new OauthParamsModel((String) null, str14, (String) null, list2, str, (String) null, str2, (Boolean) null, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, (Boolean) null, 262309);
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.getMin(true);
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.ICustomTabsCallback();
            getBubbleHeight min = getBubbleHeight.getMax.getMin();
            Intrinsics.checkNotNullParameter("binding_gn", "name");
            Trace trace = min.getMin.get("binding_gn");
            if (trace != null) {
                trace.stop();
            }
            if (getMax(map)) {
                InputNameActivity.length length = InputNameActivity.Companion;
                activity2.startActivity(InputNameActivity.length.length(activity2, oauthParamsModel));
            } else if (setMin(map)) {
                OauthGrantActivity.getMin getmin = OauthGrantActivity.Companion;
                activity2.startActivity(OauthGrantActivity.getMin.setMax(activity2, oauthParamsModel));
            }
        }
    }

    private static boolean getMax(Map<String, String> map) {
        return !Intrinsics.areEqual((Object) SummaryActivity.CHECKED, (Object) map.get(BranchLinkConstant.Params.PREMIUM_USER)) && !Intrinsics.areEqual((Object) SummaryActivity.CHECKED, (Object) map.get(BranchLinkConstant.Params.HAS_NICKNAME)) && !Intrinsics.areEqual((Object) SummaryActivity.CHECKED, (Object) map.get(BranchLinkConstant.Params.IGNORE_NICKNAME));
    }

    private static boolean setMin(Map<String, String> map) {
        boolean areEqual = Intrinsics.areEqual((Object) SummaryActivity.CHECKED, (Object) map.get(BranchLinkConstant.Params.HAS_NICKNAME));
        boolean areEqual2 = Intrinsics.areEqual((Object) SummaryActivity.CHECKED, (Object) map.get(BranchLinkConstant.Params.PREMIUM_USER));
        if (Intrinsics.areEqual((Object) SummaryActivity.CHECKED, (Object) map.get(BranchLinkConstant.Params.IGNORE_NICKNAME)) || areEqual2) {
            return true;
        }
        return !areEqual2 && areEqual;
    }
}
