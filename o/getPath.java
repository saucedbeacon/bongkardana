package o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.iap.ac.android.biz.IAPConnect;
import id.dana.danah5.DanaH5;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.di.PerActivity;
import id.dana.sendmoney.summary.SummaryActivity;
import id.dana.tracker.TrackerKey;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.AutoTransition;
import o.BindInt;
import o.BindView;
import o.R;
import o.getPlatformCallback;
import o.getRunningAnimators;
import o.onAnimationEnd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ2\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u001d2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010(\u001a\u00020\u0013H\u0002J\b\u0010)\u001a\u00020#H\u0016J\b\u0010*\u001a\u00020#H\u0002J0\u0010+\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u001d2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001dH\u0002J0\u0010/\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u001d2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010\u001dJ2\u00100\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u001d2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010\u001dH\u0016J\u001e\u00101\u001a\u00020#2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0018\u00010&H\u0016J\u0012\u00102\u001a\u00020#2\b\u00103\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u00104\u001a\u00020#2\u0006\u0010.\u001a\u00020\u001d2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u00107\u001a\u00020#2\b\u0010.\u001a\u0004\u0018\u00010\u001dH\u0016J\"\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010:\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010;\u001a\u00020#2\b\u0010<\u001a\u0004\u0018\u00010\u001dH\u0016J4\u0010=\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u001d2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010\u001dH\u0016J \u0010>\u001a\u00020#2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010&H\u0016JB\u0010?\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001d2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d0&2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u001d2\b\u0010C\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010D\u001a\u00020#2\u0006\u0010E\u001a\u00020FH\u0016J\u0012\u0010G\u001a\u00020#2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0010\u0010J\u001a\u00020#2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0012\u0010K\u001a\u00020#2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010L\u001a\u00020#H\u0016J0\u0010M\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u001d2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010\u001dR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001d8VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006N"}, d2 = {"Lid/dana/contract/deeplink/DeepLinkView;", "Lid/dana/contract/deeplink/DeepLinkContract$View;", "Lid/dana/contract/deeplink/H5ListenerHandler;", "scanQrPresenter", "Lid/dana/contract/staticqr/ScanQrContract$Presenter;", "restoreUrlPresenter", "Lid/dana/contract/shortener/RestoreUrlContract$Presenter;", "featurePresenter", "Lid/dana/contract/deeplink/path/FeatureContract$Presenter;", "oauthPresenter", "Lid/dana/contract/deeplink/path/OauthContract$Presenter;", "servicesPresenter", "Lid/dana/contract/services/ServicesPresenter;", "(Lid/dana/contract/staticqr/ScanQrContract$Presenter;Lid/dana/contract/shortener/RestoreUrlContract$Presenter;Lid/dana/contract/deeplink/path/FeatureContract$Presenter;Lid/dana/contract/deeplink/path/OauthContract$Presenter;Lid/dana/contract/services/ServicesPresenter;)V", "activity", "Landroid/app/Activity;", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "danah5Listener", "Lid/dana/danah5/DanaH5Listener;", "deepLinkCallback", "Lid/dana/contract/deeplink/DeepLinkCallback;", "getDeepLinkCallback", "()Lid/dana/contract/deeplink/DeepLinkCallback;", "setDeepLinkCallback", "(Lid/dana/contract/deeplink/DeepLinkCallback;)V", "multipleClickHandler", "Lid/dana/base/MultipleClickHandler;", "source", "", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "checkNicknameForPathFeature", "", "action", "params", "", "promoCode", "createH5AppListener", "dismissProgress", "enableClick", "getKcyStatusPathGn", "isEmoneyUrl", "", "url", "onCheckAddingNameInputWhitelist", "onCheckKycStatusForPathFeature", "onCheckKycStatusForPathGn", "onError", "errorMessage", "onGetSuccessDeepLinkPathContainer", "intent", "Landroid/content/Intent;", "onGetSuccessDeepLinkPathCustomContainer", "onGetSuccessDeepLinkPathDecode", "urlDecode", "scene", "onGetSuccessDeepLinkPathExpand", "shortCode", "onGetSuccessDeepLinkPathFeature", "onGetSuccessDeepLinkPathGn", "onGetSuccessDeepLinkPathMiniProgram", "extendedInfo", "Lorg/json/JSONObject;", "destinationPath", "orderId", "onGetSuccessDeepLinkPathOauth", "oauthParams", "Lid/dana/domain/deeplink/model/OauthParams;", "onSessionInitialized", "deepLinkPayloadModel", "Lid/dana/model/DeepLinkPayloadModel;", "setActivity", "setH5Listener", "showProgress", "validateRequestIdGn", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class getPath implements AutoTransition.setMax {
    private final R.id.getMax IsOverlapping;
    final onAnimationEnd.length equals;
    @Nullable
    public String getMax = TrackerKey.SourceType.DEEP_LINK;
    public autoGenerate getMin;
    private final BindInt hashCode;
    private final getRunningAnimators.setMax isInside;
    public setCancelOnTouchOutside$core length;
    public Activity setMax;
    @Nullable
    public ArcMotion setMin;
    private setPublishStatus toFloatRange;
    private final BindView.setMin toIntRange;

    @Inject
    public getPath(@NotNull R.id.getMax getmax, @NotNull BindView.setMin setmin, @NotNull getRunningAnimators.setMax setmax, @NotNull onAnimationEnd.length length2, @NotNull BindInt bindInt) {
        Intrinsics.checkNotNullParameter(getmax, "scanQrPresenter");
        Intrinsics.checkNotNullParameter(setmin, "restoreUrlPresenter");
        Intrinsics.checkNotNullParameter(setmax, "featurePresenter");
        Intrinsics.checkNotNullParameter(length2, "oauthPresenter");
        Intrinsics.checkNotNullParameter(bindInt, "servicesPresenter");
        this.IsOverlapping = getmax;
        this.toIntRange = setmin;
        this.isInside = setmax;
        this.equals = length2;
        this.hashCode = bindInt;
        getmax.getMin();
        this.IsOverlapping.length();
    }

    @Nullable
    public final String length() {
        String str = this.getMax;
        return str == null ? TrackerKey.SourceType.DEEP_LINK : str;
    }

    public final void getMax(@NotNull isForMainFrame isformainframe) {
        Intrinsics.checkNotNullParameter(isformainframe, "oauthParams");
        this.equals.length(isformainframe);
        ArcMotion arcMotion = this.setMin;
        if (arcMotion != null) {
            arcMotion.setMax();
        }
    }

    public final void setMax(@NotNull String str, @NotNull Map<String, String> map, @NotNull JSONObject jSONObject, @Nullable String str2) {
        String str3;
        Intrinsics.checkNotNullParameter(str, "action");
        Intrinsics.checkNotNullParameter(map, "params");
        Intrinsics.checkNotNullParameter(jSONObject, "extendedInfo");
        BindInt bindInt = this.hashCode;
        Intrinsics.checkNotNullParameter(str, "action");
        Intrinsics.checkNotNullParameter(map, "params");
        Intrinsics.checkNotNullParameter(jSONObject, "extendedInfo");
        if (Intrinsics.areEqual((Object) str, (Object) BranchLinkConstant.ActionTarget.OPEN_APP) && (str3 = map.get("appId")) != null) {
            bindInt.length.showProgress();
            bindInt.setMin.execute(onReceivedIcon.INSTANCE, new BindInt.equals(bindInt, str3, str2, jSONObject), new BindInt.isInside(bindInt));
        }
        ArcMotion arcMotion = this.setMin;
        if (arcMotion != null) {
            arcMotion.setMax();
        }
    }

    public final void setMin(@Nullable String str) {
        this.isInside.length(str);
        ArcMotion arcMotion = this.setMin;
        if (arcMotion != null) {
            arcMotion.setMax();
        }
    }

    public final void setMax(@NotNull String str, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter(str, "url");
        Bundle bundle = new Bundle();
        if (getMin(str)) {
            this.hashCode.length(intent, true);
            return;
        }
        bundle.putString("url", str);
        DanaH5.startContainerFullUrlWithSendCredentials$default(str, new setMin(), (Bundle) null, 4, (Object) null);
        ArcMotion arcMotion = this.setMin;
        if (arcMotion != null) {
            arcMotion.setMax();
        }
    }

    private static boolean getMin(String str) {
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "electronicMoney", false, 2, (Object) null);
    }

    public final void getMax(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "urlDecode");
        Intrinsics.checkNotNullParameter(str2, "source");
        this.IsOverlapping.setMax(str, str2, str3);
        ArcMotion arcMotion = this.setMin;
        if (arcMotion != null) {
            arcMotion.setMax();
        }
    }

    public final void getMax(@Nullable String str) {
        this.toIntRange.setMin(str);
        ArcMotion arcMotion = this.setMin;
        if (arcMotion != null) {
            arcMotion.setMax();
        }
    }

    public final void getMax(@Nullable String str, @Nullable Map<String, String> map, @Nullable String str2) {
        String str3 = null;
        if (StringsKt.equals$default(str, "oauth", false, 2, (Object) null)) {
            getBubbleHeight.getMax.getMin().length("binding_gn");
            if (map != null) {
                str3 = map.get("merchantId");
            }
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.valueOf();
            this.equals.setMax(str3, new getMax(this, str, map, str2));
            return;
        }
        setMin(str, map, str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/contract/deeplink/DeepLinkView$onCheckKycStatusForPathFeature$1", "Lid/dana/contract/deeplink/path/OauthPresenter$WhitelistedSubMerchantIdListener;", "onNonWhitelistedSubMerchantId", "", "onWhitelistedSubMerchantId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements getPlatformCallback.setMin {
        final /* synthetic */ String getMin;
        final /* synthetic */ String length;
        final /* synthetic */ Map setMax;
        final /* synthetic */ getPath setMin;

        getMax(getPath getpath, String str, Map map, String str2) {
            this.setMin = getpath;
            this.length = str;
            this.setMax = map;
            this.getMin = str2;
        }

        public final void setMin() {
            this.setMin.length(this.length, this.setMax, this.getMin);
        }

        public final void length() {
            this.setMin.setMax(this.length, this.setMax, this.getMin);
        }
    }

    public final void setMin(@Nullable Map<String, String> map) {
        getBubbleHeight.getMax.getMin().length("binding_gn");
        String str = map != null ? map.get("merchantId") : null;
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        ScreenBrightnessBridgeExtension.valueOf();
        this.equals.setMax(str, new IsOverlapping(this, map));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/contract/deeplink/DeepLinkView$onCheckKycStatusForPathGn$1", "Lid/dana/contract/deeplink/path/OauthPresenter$WhitelistedSubMerchantIdListener;", "onNonWhitelistedSubMerchantId", "", "onWhitelistedSubMerchantId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping implements getPlatformCallback.setMin {
        final /* synthetic */ getPath getMax;
        final /* synthetic */ Map length;

        IsOverlapping(getPath getpath, Map map) {
            this.getMax = getpath;
            this.length = map;
        }

        public final void setMin() {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            if (ScreenBrightnessBridgeExtension.isInside() != 0) {
                this.getMax.length("oauth", this.length, (String) null);
            }
        }

        public final void length() {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            if (ScreenBrightnessBridgeExtension.isInside() != 0) {
                this.getMax.setMax("oauth", this.length, (String) null);
            }
        }
    }

    public final void length(@Nullable String str, @Nullable Map<String, String> map, @Nullable String str2) {
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        if (!ScreenBrightnessBridgeExtension.toFloatRange()) {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.equals();
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension3 = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.setMax(true);
            getLeftSelectedIndex.setMin(equals.INSTANCE);
            return;
        }
        setMax(str, map, str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function0<Unit> {
        public static final equals INSTANCE = new equals();

        equals() {
            super(0);
        }

        public final void invoke() {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.setMax.authUrl = ScreenBrightnessBridgeExtension.invokeSuspend();
            ScreenBrightnessBridgeExtension.setMax.bizContent = "";
            ScreenBrightnessBridgeExtension.setMax.needCallback = false;
            IAPConnect.signContract(ScreenBrightnessBridgeExtension.setMax, AnonymousClass2.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/contract/deeplink/DeepLinkView$onCheckAddingNameInputWhitelist$1", "Lid/dana/contract/deeplink/path/OauthPresenter$AddingNameSubMerchantIdListener;", "onBlacklistedSubMerchantId", "", "onNonBlacklistedSubMerchantId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements getPlatformCallback.setMax {
        final /* synthetic */ getPath getMax;
        final /* synthetic */ Map getMin;
        final /* synthetic */ String length;
        final /* synthetic */ String setMax;

        length(getPath getpath, Map map, String str, String str2) {
            this.getMax = getpath;
            this.getMin = map;
            this.setMax = str;
            this.length = str2;
        }

        public final void setMax() {
            Map map;
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            if (ScreenBrightnessBridgeExtension.isInside() != 0) {
                Map map2 = this.getMin;
                if (map2 == null || (map = MapsKt.toMutableMap(map2)) == null) {
                    map = null;
                } else {
                    map.put(BranchLinkConstant.Params.IGNORE_NICKNAME, SummaryActivity.CHECKED);
                }
                this.getMax.setMin(this.setMax, map, this.length);
            }
        }

        public final void getMin() {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            if (ScreenBrightnessBridgeExtension.isInside() != 0) {
                getPath getpath = this.getMax;
                String str = this.setMax;
                getpath.equals.getMin(new setMax(getpath, this.getMin, str, this.length));
            }
        }
    }

    public final void setMax(@Nullable String str, @Nullable Map<String, String> map, @Nullable String str2) {
        this.equals.setMin(map != null ? map.get("merchantId") : null, new length(this, map, str, str2));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"id/dana/contract/deeplink/DeepLinkView$getKcyStatusPathGn$1", "Lid/dana/contract/deeplink/path/OauthPresenter$GetKycStatusCallback;", "onErrorGetKycStatus", "", "onGetKycStatus", "premiumUser", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements getPlatformCallback.getMin {
        final /* synthetic */ Map getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ getPath length;
        final /* synthetic */ String setMax;

        setMax(getPath getpath, Map map, String str, String str2) {
            this.length = getpath;
            this.getMax = map;
            this.setMax = str;
            this.getMin = str2;
        }

        public final void setMax(boolean z) {
            Map map;
            Map map2 = this.getMax;
            if (map2 == null || (map = MapsKt.toMutableMap(map2)) == null) {
                map = null;
            } else {
                map.put(BranchLinkConstant.Params.PREMIUM_USER, String.valueOf(z));
            }
            if (z) {
                this.length.setMin(this.setMax, map, this.getMin);
                return;
            }
            getPath getpath = this.length;
            getpath.equals.getMax(new getMin(getpath, map, this.setMax, this.getMin));
        }

        public final void getMax() {
            Map map;
            Map map2 = this.getMax;
            if (map2 == null || (map = MapsKt.toMutableMap(map2)) == null) {
                map = null;
            } else {
                map.put(BranchLinkConstant.Params.IGNORE_NICKNAME, SummaryActivity.CHECKED);
            }
            this.length.setMin(this.setMax, map, this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/contract/deeplink/DeepLinkView$onGetSuccessDeepLinkPathFeature$1", "Lid/dana/contract/deeplink/listener/DeeplinkFeatureListener;", "onDismiss", "", "onFinishHandleDeepLinkFeature", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange implements addUnmatched {
        final /* synthetic */ getPath getMin;

        toFloatRange(getPath getpath) {
            this.getMin = getpath;
        }

        public final void setMin() {
            this.getMin.dismissProgress();
            ArcMotion arcMotion = this.getMin.setMin;
            if (arcMotion != null) {
                arcMotion.setMax();
            }
        }

        public final void setMax() {
            this.getMin.dismissProgress();
        }
    }

    public final void setMin(@Nullable String str, @Nullable Map<String, String> map, @Nullable String str2) {
        this.isInside.getMax(new toFloatRange(this));
        this.isInside.setMax(str, map, str2);
    }

    public final void showProgress() {
        Activity activity = this.setMax;
        if (activity != null) {
            setPublishStatus setpublishstatus = new setPublishStatus(activity);
            if (!setpublishstatus.length.isShowing()) {
                setpublishstatus.length.show();
                setpublishstatus.getMax.startRefresh();
            }
            Unit unit = Unit.INSTANCE;
            this.toFloatRange = setpublishstatus;
        }
    }

    public final void dismissProgress() {
        setPublishStatus setpublishstatus = this.toFloatRange;
        if (setpublishstatus != null) {
            setpublishstatus.getMax();
        }
        this.toFloatRange = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hasNickname", "", "onGetNickname"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements getPlatformCallback.length {
        final /* synthetic */ Map getMax;
        final /* synthetic */ getPath getMin;
        final /* synthetic */ String length;
        final /* synthetic */ String setMax;

        getMin(getPath getpath, Map map, String str, String str2) {
            this.getMin = getpath;
            this.getMax = map;
            this.length = str;
            this.setMax = str2;
        }

        public final void getMin(boolean z) {
            Map map;
            Map map2 = this.getMax;
            if (map2 == null || (map = MapsKt.toMutableMap(map2)) == null) {
                map = null;
            } else {
                map.put(BranchLinkConstant.Params.HAS_NICKNAME, String.valueOf(z));
            }
            this.getMin.setMin(this.length, map, this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/contract/deeplink/DeepLinkView$createH5AppListener$1", "Lid/dana/danah5/DanaH5Listener;", "onContainerDestroyed", "", "bundle", "Landroid/os/Bundle;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements setCancelOnTouchOutside$core {
        @JvmDefault
        public final void onContainerCreated(@Nullable Bundle bundle) {
        }

        setMin() {
        }

        public final void onContainerDestroyed(@Nullable Bundle bundle) {
            DanaH5.dispose();
        }
    }

    public final void setMax(@Nullable showSoftInput showsoftinput) {
        autoGenerate autogenerate = this.getMin;
        if (autogenerate != null) {
            autogenerate.enableClick();
        }
        ArcMotion arcMotion = this.setMin;
        if (arcMotion != null) {
            arcMotion.getMin(showsoftinput);
        }
    }

    public final void onError(@Nullable String str) {
        autoGenerate autogenerate = this.getMin;
        if (autogenerate != null) {
            autogenerate.enableClick();
        }
        ArcMotion arcMotion = this.setMin;
        if (arcMotion != null) {
            arcMotion.length(str);
        }
    }
}
