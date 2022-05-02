package o;

import android.content.Context;
import o.TitleBarRightButtonView;
import o.inflate;

public final class afterTextChanged extends setRepeatCount<inflate.Cdefault> implements updatePadding {
    public afterTextChanged(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public final Class<inflate.Cdefault> getFacadeClass() {
        return inflate.Cdefault.class;
    }

    public final TitleBarRightButtonView.AnonymousClass1<maybeSetTextColor> getAuthCode(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2) {
        waitForWidth waitforwidth = new waitForWidth();
        waitforwidth.envInfo = generateMobileEnvInfo();
        waitforwidth.setRedirectUrl(str);
        waitforwidth.setClientId(str2);
        waitforwidth.setScopes(str3);
        waitforwidth.setAgreed(z);
        waitforwidth.setRequestSourceType(str4);
        waitforwidth.setMiniProgram(z2);
        waitforwidth.setSubMerchantId(str5);
        return wrapper(new setLastHeight(waitforwidth));
    }

    public final TitleBarRightButtonView.AnonymousClass1<maybeSetTextColor> getAuthCode(String str, String str2, String str3, boolean z, String str4, boolean z2, String str5) {
        waitForWidth waitforwidth = new waitForWidth();
        waitforwidth.envInfo = generateMobileEnvInfo();
        waitforwidth.setRedirectUrl(str);
        waitforwidth.setClientId(str2);
        waitforwidth.setScopes(str3);
        waitforwidth.setAgreed(z);
        waitforwidth.setCodeChallenge(str4);
        waitforwidth.setNeedMobileToken(z2);
        waitforwidth.setRequestSourceType(str5);
        return wrapper(new getLastHeight(waitforwidth));
    }

    public final TitleBarRightButtonView.AnonymousClass1<maybeSetTextColor> getGnAuthCode(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9) {
        waitForWidth waitforwidth = new waitForWidth();
        waitforwidth.envInfo = generateMobileEnvInfo();
        waitforwidth.setState(str);
        waitforwidth.setRedirectUrl(str2);
        waitforwidth.setClientId(str3);
        waitforwidth.setScopes(str4);
        waitforwidth.setAgreed(z);
        waitforwidth.setNetAuthId(str5);
        waitforwidth.setSubMerchantId(str6);
        waitforwidth.setSecurityId(str7);
        waitforwidth.setSignatureCode(str8);
        waitforwidth.setOriginalAuthUrl(str9);
        return wrapper(new beforeTextChanged(waitforwidth));
    }
}
