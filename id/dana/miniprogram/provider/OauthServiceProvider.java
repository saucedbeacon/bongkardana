package id.dana.miniprogram.provider;

import android.app.Application;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.resource.utils.ErrorPageUtils;
import com.alipay.iap.android.wallet.acl.base.APIContext;
import com.alipay.iap.android.wallet.acl.base.BaseResult;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.ResultError;
import com.alipay.iap.android.wallet.acl.oauth.OAuthCodeFlowType;
import com.alipay.iap.android.wallet.acl.oauth.OAuthConsultResult;
import com.alipay.iap.android.wallet.acl.oauth.OAuthPageConfirmResult;
import com.alipay.iap.android.wallet.acl.oauth.OAuthResult;
import com.alipay.iap.android.wallet.acl.oauth.OAuthService;
import com.google.gson.Gson;
import com.iap.ac.config.lite.ConfigCenter;
import id.dana.DanaApplication;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.globalnetwork.model.GnAuthResult;
import id.dana.di.modules.GContainerModule;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.DefaultEmbedViewManager;
import o.IComponent;
import o.PrepareException;
import o.onInput;
import o.saveSnapshot;
import o.setExitPerform;
import o.setInterceptors;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 J2\u00020\u0001:\u0002IJB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001eH\u0002J:\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070!2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004H\u0016JH\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070!2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004H\u0016J,\u0010&\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070'2\u0006\u0010(\u001a\u00020)H\u0002JB\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010(\u001a\u00020)2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070'2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0016JP\u0010*\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070,2\u0006\u0010-\u001a\u00020)2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070'2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0016J:\u0010.\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070!2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020/0\u0004H\u0016J\n\u00100\u001a\u0004\u0018\u000101H\u0002J\u000e\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\rJ\u0010\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u000206H\u0007J\u0018\u00107\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0002JL\u00109\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u00072\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00070,2\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010'2\b\u0010=\u001a\u0004\u0018\u00010#2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0004H\u0016J\u0016\u0010@\u001a\u00020\u001b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ&\u0010A\u001a\u00020B2\u0006\u0010-\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070,H\u0002JX\u0010C\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070,2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070'2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0012\u0010G\u001a\u0004\u0018\u00010\u00072\u0006\u0010H\u001a\u00020\u0007H\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X.¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006K"}, d2 = {"Lid/dana/miniprogram/provider/OauthServiceProvider;", "Lcom/alipay/iap/android/wallet/acl/oauth/OAuthService;", "()V", "authCallback", "Lcom/alipay/iap/android/wallet/acl/base/Callback;", "Lcom/alipay/iap/android/wallet/acl/oauth/OAuthPageConfirmResult;", "authCodeValue", "", "gnAuthResult", "Lid/dana/data/globalnetwork/model/GnAuthResult;", "gnAuthResultPublishSubject", "Lio/reactivex/subjects/PublishSubject;", "gnCallbackResult", "Lcom/alipay/iap/android/wallet/acl/oauth/OAuthResult;", "miniProgramPreference", "Lid/dana/data/miniprogram/source/local/MiniProgramPreference;", "getMiniProgramPreference", "()Lid/dana/data/miniprogram/source/local/MiniProgramPreference;", "setMiniProgramPreference", "(Lid/dana/data/miniprogram/source/local/MiniProgramPreference;)V", "remoteGnPaymentEntityData", "Lid/dana/data/globalnetwork/source/remote/RemoteGnPaymentEntityData;", "getRemoteGnPaymentEntityData", "()Lid/dana/data/globalnetwork/source/remote/RemoteGnPaymentEntityData;", "setRemoteGnPaymentEntityData", "(Lid/dana/data/globalnetwork/source/remote/RemoteGnPaymentEntityData;)V", "applyAuthCode", "", "appId", "scopes", "", "consultAuthPage", "extendInfo", "", "apiContext", "Lcom/alipay/iap/android/wallet/acl/base/APIContext;", "callback", "Lcom/alipay/iap/android/wallet/acl/oauth/OAuthConsultResult;", "getAuthClientId", "", "oAuthCodeFlowType", "Lcom/alipay/iap/android/wallet/acl/oauth/OAuthCodeFlowType;", "getAuthCode", "url", "", "flowType", "getAuthorizedScopes", "Lcom/alipay/iap/android/wallet/acl/oauth/OAuthScopeQueryResult;", "getMiniProgramSection", "Lorg/json/JSONObject;", "gnGolCallback", "authResult", "onReceiveAgreementMessageEvent", "event", "Lid/dana/miniprogram/provider/OauthServiceProvider$AgreementMessageEvent;", "openGnAuthForSpecialMerchantDeeplink", "originalLink", "revokeAuthorizedScopes", "p0", "p1", "p2", "p3", "p4", "Lcom/alipay/iap/android/wallet/acl/base/BaseResult;", "setPublishSubject", "shouldShowAgreementPage", "", "showAuthPage", "name", "logo", "extendedInfo", "validateSubMerchantId", "subMerchantId", "AgreementMessageEvent", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OauthServiceProvider implements OAuthService {
    @NotNull
    public static final setMax length = new setMax((byte) 0);
    private Callback<OAuthPageConfirmResult> IsOverlapping;
    private String getMax = "";
    private GnAuthResult getMin;
    @Inject
    public setExitPerform miniProgramPreference;
    @Inject
    public DefaultEmbedViewManager remoteGnPaymentEntityData;
    public Callback<OAuthResult> setMax;
    public IComponent<GnAuthResult> setMin;

    public final void consultAuthPage(@NotNull String str, @NotNull Map<String, String> map, @NotNull APIContext aPIContext, @NotNull Callback<OAuthConsultResult> callback) {
        Intrinsics.checkNotNullParameter(str, "appId");
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        Intrinsics.checkNotNullParameter(aPIContext, "apiContext");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public final void consultAuthPage(@NotNull String str, @NotNull Set<String> set, @NotNull Map<String, String> map, @NotNull APIContext aPIContext, @NotNull Callback<OAuthConsultResult> callback) {
        Intrinsics.checkNotNullParameter(str, "appId");
        Intrinsics.checkNotNullParameter(set, BranchLinkConstant.OauthParams.SCOPES);
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        Intrinsics.checkNotNullParameter(aPIContext, "apiContext");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public OauthServiceProvider() {
        saveSnapshot.getMax getmax = new saveSnapshot.getMax((byte) 0);
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) applicationContext).getApplicationComponent();
            if (applicationComponent != null) {
                getmax.setMin = applicationComponent;
                getmax.getMin = new GContainerModule();
                getmax.getMin().length(this);
                onInput.getDefault().register(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    public final void getAuthCode(@NotNull String str, @NotNull OAuthCodeFlowType oAuthCodeFlowType, @NotNull Map<String, String> map, @NotNull APIContext aPIContext, @NotNull Callback<OAuthResult> callback) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(oAuthCodeFlowType, "oAuthCodeFlowType");
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        Intrinsics.checkNotNullParameter(aPIContext, "apiContext");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CharSequence charSequence = str;
        if (StringsKt.contains$default(charSequence, (CharSequence) "https://m.dana.id/m/portal/oauth", false, 2, (Object) null)) {
            str2 = StringsKt.replace(str, "https://m.dana.id/m/portal/oauth", "https://link.dana.id/bind", true);
        } else {
            str2 = StringsKt.contains$default(charSequence, (CharSequence) "https://m.dana.id/d/portal/oauth", false, 2, (Object) null) ? StringsKt.replace(str, "https://m.dana.id/d/portal/oauth", "https://link.dana.id/bind", true) : str;
        }
        this.setMax = callback;
        if (setInterceptors.isDeepLink(str2)) {
            onInput.getDefault().post(new DanaApplication.length(str2, str));
        }
    }

    private final boolean setMin(OAuthCodeFlowType oAuthCodeFlowType, String str, Set<String> set) {
        setExitPerform setexitperform = this.miniProgramPreference;
        if (setexitperform == null) {
            Intrinsics.throwUninitializedPropertyAccessException("miniProgramPreference");
        }
        String valueOf = String.valueOf(setexitperform.setMax().get(str));
        Object obj = null;
        if (valueOf != null) {
            try {
                obj = new Gson().fromJson(new JSONObject(valueOf).toString(), GnAuthResult.class);
            } catch (Exception unused) {
            }
        }
        GnAuthResult gnAuthResult = (GnAuthResult) obj;
        if (gnAuthResult == null || gnAuthResult.isExpired()) {
            return true;
        }
        String authCode = gnAuthResult.getAuthCode();
        if (authCode == null) {
            authCode = "";
        }
        this.getMax = authCode;
        boolean z = !Intrinsics.areEqual((Object) gnAuthResult.getScopes(), (Object) set);
        if (oAuthCodeFlowType == OAuthCodeFlowType.ALIPAY_CONNECT) {
            return false;
        }
        if (gnAuthResult.getAuthCode() == null || z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0034, code lost:
        r3 = r3.getMerchantId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showAuthPage(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r15, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r16, @org.jetbrains.annotations.NotNull com.alipay.iap.android.wallet.acl.base.APIContext r17, @org.jetbrains.annotations.NotNull com.alipay.iap.android.wallet.acl.base.Callback<com.alipay.iap.android.wallet.acl.oauth.OAuthPageConfirmResult> r18) {
        /*
            r11 = this;
            r0 = r15
            r1 = r16
            r2 = r18
            java.lang.String r3 = "appId"
            r5 = r12
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            java.lang.String r3 = "name"
            r9 = r13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r3)
            java.lang.String r3 = "logo"
            r8 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r3)
            java.lang.String r3 = "scopes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r3)
            java.lang.String r3 = "extendedInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "apiContext"
            r4 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r3 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            com.alipay.iap.android.wallet.acl.base.MiniProgramMetaData r3 = r17.getMiniProgramInfo()
            r4 = 0
            if (r3 == 0) goto L_0x0046
            java.lang.String r3 = r3.getMerchantId()
            if (r3 == 0) goto L_0x0046
            r6 = 0
            r7 = 2
            java.lang.String r10 = "SUB"
            boolean r6 = kotlin.text.StringsKt.startsWith$default(r3, r10, r6, r7, r4)
            if (r6 == 0) goto L_0x0046
            r10 = r3
            goto L_0x0047
        L_0x0046:
            r10 = r4
        L_0x0047:
            id.dana.miniprogram.tnc.TncMiniProgramDialogActivity$StartParams r3 = new id.dana.miniprogram.tnc.TncMiniProgramDialogActivity$StartParams
            java.lang.String r4 = "authClientId"
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0055
            java.lang.String r1 = ""
        L_0x0055:
            r6 = r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r0)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            r4 = r3
            r5 = r12
            r8 = r14
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0 = r11
            r0.IsOverlapping = r2
            android.app.Application r1 = com.alibaba.griver.base.common.env.GriverEnv.getApplicationContext()
            android.content.Intent r2 = new android.content.Intent
            r4 = r1
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Class<id.dana.miniprogram.tnc.TncMiniProgramDialogActivity> r5 = id.dana.miniprogram.tnc.TncMiniProgramDialogActivity.class
            r2.<init>(r4, r5)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r2 = r2.addFlags(r4)
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            java.lang.String r4 = "startParams"
            android.content.Intent r2 = r2.putExtra(r4, r3)
            java.lang.String r3 = "Intent(context, TncMiniP…TRA_START_PARAMS, params)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.startActivity(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.miniprogram.provider.OauthServiceProvider.showAuthPage(java.lang.String, java.lang.String, java.lang.String, java.util.Set, java.util.Map, com.alipay.iap.android.wallet.acl.base.APIContext, com.alipay.iap.android.wallet.acl.base.Callback):void");
    }

    public final void revokeAuthorizedScopes(@NotNull String str, @NotNull Set<String> set, @Nullable Map<String, String> map, @Nullable APIContext aPIContext, @NotNull Callback<BaseResult> callback) {
        Intrinsics.checkNotNullParameter(str, "p0");
        Intrinsics.checkNotNullParameter(set, "p1");
        Intrinsics.checkNotNullParameter(callback, "p4");
        throw new NotImplementedError("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Subscribe
    public final void onReceiveAgreementMessageEvent(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "event");
        if (getmin.setMin()) {
            GnAuthResult gnAuthResult = this.getMin;
            if (gnAuthResult == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gnAuthResult");
            }
            gnAuthResult.setAuthCode(getmin.setMin);
            setExitPerform setexitperform = this.miniProgramPreference;
            if (setexitperform == null) {
                Intrinsics.throwUninitializedPropertyAccessException("miniProgramPreference");
            }
            String str = getmin.setMax;
            GnAuthResult gnAuthResult2 = this.getMin;
            if (gnAuthResult2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gnAuthResult");
            }
            setexitperform.getMax(str, gnAuthResult2);
            Callback<OAuthPageConfirmResult> callback = this.IsOverlapping;
            if (callback != null) {
                callback.result(new OAuthPageConfirmResult((String) null));
            }
        } else {
            OAuthPageConfirmResult oAuthPageConfirmResult = new OAuthPageConfirmResult("");
            oAuthPageConfirmResult.setResultError(new ResultError(1001, ""));
            Callback<OAuthPageConfirmResult> callback2 = this.IsOverlapping;
            if (callback2 != null) {
                callback2.result(oAuthPageConfirmResult);
            }
        }
        this.IsOverlapping = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lid/dana/miniprogram/provider/OauthServiceProvider$AgreementMessageEvent;", "", "agree", "", "appId", "", "authCode", "(ZLjava/lang/String;Ljava/lang/String;)V", "getAgree", "()Z", "getAppId", "()Ljava/lang/String;", "getAuthCode", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private final boolean length;
        @NotNull
        final String setMax;
        @Nullable
        final String setMin;

        public getMin(boolean z, @NotNull String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, "appId");
            this.length = z;
            this.setMax = str;
            this.setMin = str2;
        }

        public final boolean setMin() {
            return this.length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0057, code lost:
        if (r5 == null) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getAuthorizedScopes(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r5, @org.jetbrains.annotations.NotNull com.alipay.iap.android.wallet.acl.base.APIContext r6, @org.jetbrains.annotations.NotNull com.alipay.iap.android.wallet.acl.base.Callback<com.alipay.iap.android.wallet.acl.oauth.OAuthScopeQueryResult> r7) {
        /*
            r3 = this;
            java.lang.String r0 = "appId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "extendInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r5 = "apiContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            java.lang.String r5 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            o.setExitPerform r5 = r3.miniProgramPreference
            if (r5 != 0) goto L_0x001d
            java.lang.String r6 = "miniProgramPreference"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x001d:
            java.util.HashMap r5 = r5.setMax()
            java.lang.Object r5 = r5.get(r4)
            id.dana.data.globalnetwork.model.GnAuthResult r5 = (id.dana.data.globalnetwork.model.GnAuthResult) r5
            r6 = 0
            if (r5 == 0) goto L_0x0059
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = r5.getClientId()
            r0[r6] = r1
            r1 = 1
            r0[r1] = r4
            r1 = 2
            org.json.JSONArray r2 = new org.json.JSONArray
            java.util.Set r5 = r5.getScopes()
            if (r5 != 0) goto L_0x0043
            java.util.Set r5 = kotlin.collections.SetsKt.emptySet()
        L_0x0043:
            java.util.Collection r5 = (java.util.Collection) r5
            r2.<init>(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r2 = "JSONArray(scopes.orEmpty()).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r0[r1] = r5
            java.util.Set r5 = kotlin.collections.SetsKt.setOf(r0)
            if (r5 != 0) goto L_0x005d
        L_0x0059:
            java.util.Set r5 = kotlin.collections.SetsKt.setOf(r4)
        L_0x005d:
            com.alipay.iap.android.wallet.acl.oauth.OAuthScopeQueryResult r4 = new com.alipay.iap.android.wallet.acl.oauth.OAuthScopeQueryResult
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            if (r5 == 0) goto L_0x007b
            java.lang.String[] r5 = (java.lang.String[]) r5
            int r6 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r4.<init>(r5)
            com.alipay.iap.android.wallet.acl.base.Result r4 = (com.alipay.iap.android.wallet.acl.base.Result) r4
            r7.result(r4)
            return
        L_0x007b:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.miniprogram.provider.OauthServiceProvider.getAuthorizedScopes(java.lang.String, java.util.Map, com.alipay.iap.android.wallet.acl.base.APIContext, com.alipay.iap.android.wallet.acl.base.Callback):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/miniprogram/provider/OauthServiceProvider$Companion;", "", "()V", "AGREE", "", "SUB_MERCHANT_PREFIX", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void getAuthCode(@NotNull String str, @NotNull Set<String> set, @NotNull OAuthCodeFlowType oAuthCodeFlowType, @NotNull Map<String, String> map, @NotNull APIContext aPIContext, @NotNull Callback<OAuthResult> callback) {
        String str2;
        String str3 = str;
        Set<String> set2 = set;
        OAuthCodeFlowType oAuthCodeFlowType2 = oAuthCodeFlowType;
        Map<String, String> map2 = map;
        Callback<OAuthResult> callback2 = callback;
        Intrinsics.checkNotNullParameter(str3, "appId");
        Intrinsics.checkNotNullParameter(set2, BranchLinkConstant.OauthParams.SCOPES);
        Intrinsics.checkNotNullParameter(oAuthCodeFlowType2, "flowType");
        Intrinsics.checkNotNullParameter(map2, "extendInfo");
        Intrinsics.checkNotNullParameter(aPIContext, "apiContext");
        Intrinsics.checkNotNullParameter(callback2, "callback");
        if (OAuthCodeFlowType.ALIPAY_CONNECT == oAuthCodeFlowType2) {
            str2 = str3;
        } else {
            String str4 = map2.get(GriverBaseConstants.KEY_CLIENT_ID);
            str2 = str4 == null ? "" : str4;
        }
        GnAuthResult gnAuthResult = new GnAuthResult(str2, (Set) null, (OAuthCodeFlowType) null, (Map) null, (String) null, 0, (Callback) null, 126, (DefaultConstructorMarker) null);
        gnAuthResult.setOAuthCodeFlowType(oAuthCodeFlowType2);
        gnAuthResult.setScopes(set2);
        gnAuthResult.setExtendInfo(map2);
        gnAuthResult.setCallback(callback2);
        Unit unit = Unit.INSTANCE;
        this.getMin = gnAuthResult;
        JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig(DanaLogConstants.TAG.MINI_PROGRAM);
        if (StringsKt.contains$default((CharSequence) String.valueOf(sectionConfig != null ? sectionConfig.get("internal_miniprogram") : null), (CharSequence) str3, false, 2, (Object) null)) {
            GnAuthResult gnAuthResult2 = this.getMin;
            if (gnAuthResult2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gnAuthResult");
            }
            gnAuthResult2.setScopes(SetsKt.setOf(ErrorPageUtils.ERROR_TYPE_MINI));
            IComponent<GnAuthResult> iComponent = this.setMin;
            if (iComponent != null) {
                GnAuthResult gnAuthResult3 = this.getMin;
                if (gnAuthResult3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gnAuthResult");
                }
                iComponent.onNext(gnAuthResult3);
            }
            setExitPerform setexitperform = this.miniProgramPreference;
            if (setexitperform == null) {
                Intrinsics.throwUninitializedPropertyAccessException("miniProgramPreference");
            }
            GnAuthResult gnAuthResult4 = this.getMin;
            if (gnAuthResult4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gnAuthResult");
            }
            setexitperform.getMax(str3, gnAuthResult4);
        } else if (setMin(oAuthCodeFlowType2, str3, set2)) {
            OAuthResult oAuthResult = new OAuthResult();
            oAuthResult.setResultError(new ResultError(2001, ""));
            callback2.result(oAuthResult);
        } else {
            OAuthResult oAuthResult2 = new OAuthResult();
            Object[] array = set2.toArray(new String[0]);
            if (array != null) {
                oAuthResult2.setAuthSuccessScopes((String[]) array);
                oAuthResult2.setAuthCode(this.getMax);
                Unit unit2 = Unit.INSTANCE;
                callback2.result(oAuthResult2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
