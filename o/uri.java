package o;

import com.alipay.mobile.security.bio.utils.StringUtil;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.ResourceLoadContext;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class uri extends setMinProgress implements getMD5Byte {
    private final assertOneSet authEntityDataFactory;
    private final getWidthAndHeight authMapper;
    private final intercepted oauthConfirmResultMapper;
    private final ResourceLoadContext.Builder oauthInitResultMapper;

    @Inject
    uri(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, ResourceLoadContext.Builder builder, assertOneSet assertoneset, intercepted intercepted, getWidthAndHeight getwidthandheight) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.oauthInitResultMapper = builder;
        this.authEntityDataFactory = assertoneset;
        this.oauthConfirmResultMapper = intercepted;
        this.authMapper = getwidthandheight;
    }

    public TitleBarRightButtonView.AnonymousClass1<getMD5String> getOauthScope(String str, String str2, List<String> list, String str3, boolean z) {
        TitleBarRightButtonView.AnonymousClass1<SplashEntryInfo> authCode = getAuthCode(str3, str2, StringUtil.join(list, ","), false, str, z);
        ResourceLoadContext.Builder builder = this.oauthInitResultMapper;
        Objects.requireNonNull(builder);
        return authCode.map(new canUseFallback(builder));
    }

    public TitleBarRightButtonView.AnonymousClass1<getMD5Digest> confirmOauthScope(String str, String str2, List<String> list, String str3, boolean z) {
        TitleBarRightButtonView.AnonymousClass1<SplashEntryInfo> authCode = getAuthCode(str3, str2, StringUtil.join(list, ","), true, str, z);
        intercepted intercepted = this.oauthConfirmResultMapper;
        Objects.requireNonNull(intercepted);
        return authCode.map(new AppxVersionStore(intercepted));
    }

    public TitleBarRightButtonView.AnonymousClass1<SplashEntryInfo> getGnAuthAgreement(String str, List<String> list, String str2, String str3, String str4, String str5, String str6) {
        List<String> list2 = list;
        return getGnAuthCode(str2, str, StringUtil.join(list, ","), false, str3, str4, "", str5, str6);
    }

    public TitleBarRightButtonView.AnonymousClass1<SplashEntryInfo> submitGnAuthApply(String str, String str2, List<String> list, String str3, String str4, String str5, String str6) {
        List<String> list2 = list;
        return getGnAuthCode(str, str3, str2, StringUtil.join(list, ","), true, str4, str5, str6, "", "");
    }

    public TitleBarRightButtonView.AnonymousClass1<SplashEntryInfo> getAuthCode(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        TitleBarRightButtonView.AnonymousClass1<maybeSetTextColor> authenticatedRequest = authenticatedRequest(createAuthData().getAuthCode(str, str2, str3, z, str4, z2, ""));
        getWidthAndHeight getwidthandheight = this.authMapper;
        Objects.requireNonNull(getwidthandheight);
        return authenticatedRequest.map(new canDegradeGlobalPackage(getwidthandheight));
    }

    public TitleBarRightButtonView.AnonymousClass1<SplashEntryInfo> getGnAuthCode(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9) {
        TitleBarRightButtonView.AnonymousClass1<maybeSetTextColor> authenticatedRequest = authenticatedRequest(createAuthData().getGnAuthCode(str, str2, str3, str4, z, str5, str6, str7, str8, str9));
        getWidthAndHeight getwidthandheight = this.authMapper;
        Objects.requireNonNull(getwidthandheight);
        return authenticatedRequest.map(new canDegradeGlobalPackage(getwidthandheight));
    }

    public TitleBarRightButtonView.AnonymousClass1<SplashEntryInfo> getGnAuthCode(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8) {
        TitleBarRightButtonView.AnonymousClass1<maybeSetTextColor> authenticatedRequest = authenticatedRequest(createAuthData().getGnAuthCode("", str, str2, str3, z, str4, str5, str6, str7, str8));
        getWidthAndHeight getwidthandheight = this.authMapper;
        Objects.requireNonNull(getwidthandheight);
        return authenticatedRequest.map(new canDegradeGlobalPackage(getwidthandheight));
    }

    private updatePadding createAuthData() {
        return this.authEntityDataFactory.createData("network");
    }
}
