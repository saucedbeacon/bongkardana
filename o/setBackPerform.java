package o;

import android.app.Application;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.member.MemberInfo;
import com.alipay.iap.android.wallet.acl.member.MemberInfoResult;
import com.alipay.iap.android.wallet.acl.member.MemberInfoScope;
import com.alipay.iap.android.wallet.acl.member.MemberService;
import com.alipay.iap.android.wallet.acl.oauth.OAuthService;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/data/miniprogram/provider/MemberServiceProvider;", "Lcom/alipay/iap/android/wallet/acl/member/MemberService;", "()V", "miniProgramPreference", "Lid/dana/data/miniprogram/source/local/MiniProgramPreference;", "getMiniProgramPreference", "()Lid/dana/data/miniprogram/source/local/MiniProgramPreference;", "miniProgramPreference$delegate", "Lkotlin/Lazy;", "userEntityRepository", "Lid/dana/data/user/UserEntityRepository;", "getMemberInfo", "", "fetchStrategy", "Lcom/alipay/iap/android/wallet/acl/member/MemberService$MemberInfoFetchStrategy;", "memberInfoScope", "Lcom/alipay/iap/android/wallet/acl/member/MemberInfoScope;", "apiContext", "Lcom/alipay/iap/android/wallet/acl/base/APIContext;", "callback", "Lcom/alipay/iap/android/wallet/acl/base/Callback;", "Lcom/alipay/iap/android/wallet/acl/member/MemberInfoResult;", "setUserInfoRepository", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setBackPerform implements MemberService {
    private final Lazy length = LazyKt.lazy(getMin.INSTANCE);
    public hasInputException setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T> implements RedDotManager<Throwable> {
        public static final setMax getMax = new setMax();

        setMax() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            updateActionSheetContent.e(DanaLogConstants.TAG.MP_USER_INFO, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "user", "Lid/dana/domain/user/MiniProgramUserInfoResponse;", "kotlin.jvm.PlatformType", "accept", "id/dana/data/miniprogram/provider/MemberServiceProvider$getMemberInfo$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T> implements RedDotManager<startBleScan> {
        final /* synthetic */ setBackPerform getMax;
        final /* synthetic */ Callback getMin;
        final /* synthetic */ MemberInfoScope setMax;
        final /* synthetic */ MemberService.MemberInfoFetchStrategy setMin;

        setMin(setBackPerform setbackperform, MemberService.MemberInfoFetchStrategy memberInfoFetchStrategy, Callback callback, MemberInfoScope memberInfoScope) {
            this.getMax = setbackperform;
            this.setMin = memberInfoFetchStrategy;
            this.getMin = callback;
            this.setMax = memberInfoScope;
        }

        public final /* synthetic */ void accept(Object obj) {
            startBleScan startblescan = (startBleScan) obj;
            Intrinsics.checkNotNullExpressionValue(startblescan, "user");
            Intrinsics.checkNotNullParameter(startblescan, "$this$toMemberInfo");
            MemberInfo memberInfo = new MemberInfo();
            memberInfo.userId = startblescan.getUserInfo().get("USER_ID");
            memberInfo.loginId = startblescan.getUserInfo().get(OAuthService.SCOPE_USER_LOGIN_ID);
            memberInfo.avatar = startblescan.getUserInfo().get(OAuthService.SCOPE_USER_AVATAR);
            memberInfo.gender = startblescan.getUserInfo().get(OAuthService.SCOPE_USER_GENDER);
            memberInfo.birthday = startblescan.getUserInfo().get(OAuthService.SCOPE_USER_BIRTHDAY);
            memberInfo.extendedInfo = startblescan.getUserInfo();
            this.getMin.result(new MemberInfoResult(memberInfo));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/miniprogram/source/local/MiniProgramPreference;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<setExitPerform> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(0);
        }

        @NotNull
        public final setExitPerform invoke() {
            Application applicationContext = GriverEnv.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "GriverEnv.getApplicationContext()");
            return new setExitPerform(applicationContext);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMemberInfo(@org.jetbrains.annotations.NotNull com.alipay.iap.android.wallet.acl.member.MemberService.MemberInfoFetchStrategy r5, @org.jetbrains.annotations.Nullable com.alipay.iap.android.wallet.acl.member.MemberInfoScope r6, @org.jetbrains.annotations.Nullable com.alipay.iap.android.wallet.acl.base.APIContext r7, @org.jetbrains.annotations.NotNull com.alipay.iap.android.wallet.acl.base.Callback<com.alipay.iap.android.wallet.acl.member.MemberInfoResult> r8) {
        /*
            r4 = this;
            java.lang.String r7 = "fetchStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            java.lang.String r7 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            kotlin.Lazy r7 = r4.length
            java.lang.Object r7 = r7.getValue()
            o.setExitPerform r7 = (o.setExitPerform) r7
            int[] r0 = o.BaseRenderImpl.getMin
            int r1 = r5.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0096
            if (r6 == 0) goto L_0x0025
            java.lang.String r0 = r6.getAppId()
            goto L_0x0026
        L_0x0025:
            r0 = r1
        L_0x0026:
            kotlin.Lazy r2 = r4.length
            java.lang.Object r2 = r2.getValue()
            o.setExitPerform r2 = (o.setExitPerform) r2
            java.util.HashMap r2 = r2.setMax()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 != 0) goto L_0x0040
        L_0x003e:
            r0 = r1
            goto L_0x0054
        L_0x0040:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x003e }
            r2.<init>(r0)     // Catch:{ Exception -> 0x003e }
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch:{ Exception -> 0x003e }
            r0.<init>()     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x003e }
            java.lang.Class<id.dana.data.globalnetwork.model.GnAuthResult> r3 = id.dana.data.globalnetwork.model.GnAuthResult.class
            java.lang.Object r0 = r0.fromJson((java.lang.String) r2, r3)     // Catch:{ Exception -> 0x003e }
        L_0x0054:
            id.dana.data.globalnetwork.model.GnAuthResult r0 = (id.dana.data.globalnetwork.model.GnAuthResult) r0
            if (r0 != 0) goto L_0x0059
            return
        L_0x0059:
            java.lang.String r0 = r0.getClientId()
            o.getFrameMarginVerticalLess$core r7 = r7.length
            o.attach r7 = r7.getAccount()
            o.hasInputException r2 = r4.setMin
            if (r2 != 0) goto L_0x006d
            java.lang.String r3 = "userEntityRepository"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x006d:
            if (r7 == 0) goto L_0x0073
            java.lang.String r1 = r7.getUserId()
        L_0x0073:
            o.TitleBarRightButtonView$1 r7 = r2.getMiniProgramUserInfo(r0, r1)
            o.hasCornerMarking r0 = o.getSecureSignatureComp.setMin()
            o.TitleBarRightButtonView$1 r7 = r7.subscribeOn(r0)
            o.hasCornerMarking r0 = o.getSecureSignatureComp.setMin()
            o.TitleBarRightButtonView$1 r7 = r7.observeOn(r0)
            o.setBackPerform$setMin r0 = new o.setBackPerform$setMin
            r0.<init>(r4, r5, r8, r6)
            o.RedDotManager r0 = (o.RedDotManager) r0
            o.setBackPerform$setMax r5 = o.setBackPerform.setMax.getMax
            o.RedDotManager r5 = (o.RedDotManager) r5
            r7.subscribe(r0, r5)
            return
        L_0x0096:
            com.alipay.iap.android.wallet.acl.member.MemberInfo r5 = new com.alipay.iap.android.wallet.acl.member.MemberInfo
            r5.<init>()
            o.getFrameMarginVerticalLess$core r6 = r7.length
            o.attach r6 = r6.getAccount()
            if (r6 == 0) goto L_0x00a7
            java.lang.String r1 = r6.getUserId()
        L_0x00a7:
            r5.userId = r1
            com.alipay.iap.android.wallet.acl.member.MemberInfoResult r6 = new com.alipay.iap.android.wallet.acl.member.MemberInfoResult
            r6.<init>(r5)
            com.alipay.iap.android.wallet.acl.base.Result r6 = (com.alipay.iap.android.wallet.acl.base.Result) r6
            r8.result(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setBackPerform.getMemberInfo(com.alipay.iap.android.wallet.acl.member.MemberService$MemberInfoFetchStrategy, com.alipay.iap.android.wallet.acl.member.MemberInfoScope, com.alipay.iap.android.wallet.acl.base.APIContext, com.alipay.iap.android.wallet.acl.base.Callback):void");
    }
}
