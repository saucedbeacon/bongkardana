package o;

import android.content.Context;
import id.dana.data.user.source.network.request.UserInfoRequest;
import o.TitleBarRightButtonView;

public final class setAlias extends setRepeatCount<getVhost> implements ResourceProviderPoint {
    public setAlias(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public final Class<getVhost> getFacadeClass() {
        return getVhost.class;
    }

    public final TitleBarRightButtonView.AnonymousClass1<setTemplateConfig> getUserInfo() {
        UserInfoRequest userInfoRequest = new UserInfoRequest();
        userInfoRequest.queryType = "FULL";
        userInfoRequest.envInfo = generateMobileEnvInfo();
        return wrapper(new getFallbackBaseUrl(userInfoRequest));
    }

    public final TitleBarRightButtonView.AnonymousClass1<getTemplateConfig> checkUserInfo(String str, String str2, String str3) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1205933565, oncanceled);
            onCancelLoad.getMin(-1205933565, oncanceled);
        }
        setVhost setvhost = new setVhost(str, str2, str3);
        setvhost.envInfo = generateMobileEnvInfo();
        return wrapper(new setDeveloperVersion(setvhost));
    }

    public final TitleBarRightButtonView.AnonymousClass1<setStatus> getMiniProgramUserInfo(String str, String str2) {
        setAppKey setappkey = new setAppKey(str, str2);
        setappkey.envInfo = generateMobileEnvInfo();
        return wrapper(new getDesc(setappkey));
    }

    public final TitleBarRightButtonView.AnonymousClass1<setTemplateConfig> getFaceAuthInfo() {
        UserInfoRequest userInfoRequest = new UserInfoRequest();
        userInfoRequest.queryType = UserInfoRequest.FACE_AUTH;
        userInfoRequest.envInfo = generateMobileEnvInfo();
        return wrapper(new getDeveloperVersion(userInfoRequest));
    }

    public final TitleBarRightButtonView.AnonymousClass1<setTemplateConfig> getBalance() {
        UserInfoRequest userInfoRequest = new UserInfoRequest();
        userInfoRequest.queryType = "BALANCE";
        userInfoRequest.envInfo = generateMobileEnvInfo();
        return wrapper(new setFallbackBaseUrl(userInfoRequest));
    }

    public final TitleBarRightButtonView.AnonymousClass1<setTemplateConfig> getInfoWithKyc() {
        UserInfoRequest userInfoRequest = new UserInfoRequest();
        userInfoRequest.queryType = UserInfoRequest.KYC_INFO;
        userInfoRequest.envInfo = generateMobileEnvInfo();
        return wrapper(new setPackageSize(userInfoRequest));
    }

    public final TitleBarRightButtonView.AnonymousClass1<setTemplateConfig> getUserInfoWithUserPan() {
        UserInfoRequest userInfoRequest = new UserInfoRequest();
        userInfoRequest.queryType = UserInfoRequest.USER_PAN;
        userInfoRequest.envInfo = generateMobileEnvInfo();
        return wrapper(new setPackageUrl(userInfoRequest));
    }

    public final TitleBarRightButtonView.AnonymousClass1<setSubPackages> checkUsername(String str) {
        return wrapper(new getPackageSize(new getSubPackages(str)));
    }

    public final TitleBarRightButtonView.AnonymousClass1<setTemplateConfig> getUserStatusInfo() {
        UserInfoRequest userInfoRequest = new UserInfoRequest();
        userInfoRequest.queryType = UserInfoRequest.STATUS_INFO;
        userInfoRequest.envInfo = generateMobileEnvInfo();
        return wrapper(new getPackageUrl(userInfoRequest));
    }
}
