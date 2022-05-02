package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.alibaba.fastjson.JSONObject;
import o.TitleBarRightButtonView;

public final class hasKeyResourceFallback extends setRepeatCount<prefetchUrl> implements setExtEnable {
    private static final String ACTION = "BUILD_MENU";
    private static final String DEVICE_TYPE = "android";
    private static final String MODULE = "APP_SETTING_NATIVE";
    private static final String PRODMNG_ID = "query";
    private static final String SCENE_ID = "dana_app_securitysetting";
    private static final String TAG = "NetworkUserSecurityQuestionStateEntityData";
    private final onAppResume apSecurityFacade;
    private final Context context;
    private final BackKeyDownPoint securityGuardFacade;

    public hasKeyResourceFallback(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, BackKeyDownPoint backKeyDownPoint, Context context2) {
        super(setisurgentresource, appxloadfailed, onappresume, context2);
        this.apSecurityFacade = onappresume;
        this.securityGuardFacade = backKeyDownPoint;
        this.context = context2;
    }

    public final Class<prefetchUrl> getFacadeClass() {
        return prefetchUrl.class;
    }

    public final TitleBarRightButtonView.AnonymousClass1<createOnlineResource> getSecurityQuestionState(String str, String str2) {
        OfflineMode offlineMode = new OfflineMode();
        offlineMode.action = "BUILD_MENU";
        offlineMode.data = generateData(str);
        offlineMode.envData = generateEnvData(str2);
        offlineMode.isDisplaySensitiveField = false;
        offlineMode.module = MODULE;
        offlineMode.prodmngId = "query";
        return wrapper(new startFallback(offlineMode));
    }

    private String generateData(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", (Object) str);
        jSONObject.put("sceneId", (Object) SCENE_ID);
        return jSONObject.toString();
    }

    private String generateEnvData(String str) {
        String str2;
        try {
            str2 = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            updateActionSheetContent.e(TAG, e.getMessage());
            str2 = "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceType", (Object) DEVICE_TYPE);
        jSONObject.put("appVersion", (Object) str2);
        jSONObject.put("osVersion", (Object) Build.VERSION.RELEASE);
        jSONObject.put("clientKey", (Object) getBadgeList.getClientKey(this.securityGuardFacade, ""));
        jSONObject.put("apdidToken", (Object) this.apSecurityFacade.getApdidToken());
        jSONObject.put("sdkVersion", (Object) str);
        jSONObject.put("deviceModel", (Object) Build.MODEL);
        jSONObject.put("language", (Object) "en_US");
        jSONObject.put("apdid", (Object) this.apSecurityFacade.getApdid());
        jSONObject.put("umidToken", (Object) this.apSecurityFacade.getUmidToken());
        return jSONObject.toString();
    }
}
