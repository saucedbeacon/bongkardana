package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVResourceUtils;

@Singleton
public class onRequestPermissionResult {
    private static final String DEEPLINK_PREFERENCES;
    private final onSingleFailed preferenceFacade;

    private String getKey(boolean z) {
        return z ? "profile_deeplink_url_key" : "profile_deeplink_url_key_without_referral";
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(onRequestPermissionResult.class.getSimpleName());
        sb.append("production");
        DEEPLINK_PREFERENCES = sb.toString();
    }

    @Inject
    public onRequestPermissionResult(Context context, PluginInstallCallback pluginInstallCallback) {
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(DEEPLINK_PREFERENCES).setUseDrutherPreference(true).setSerializerFacade(pluginInstallCallback)).createData("local");
    }

    public String getProfileDeepLinkUrl(boolean z) {
        return this.preferenceFacade.getString(getKey(z));
    }

    public Boolean saveProfileDeepLinkUrl(String str, boolean z) {
        this.preferenceFacade.saveData(getKey(z), str);
        return Boolean.TRUE;
    }

    public void clearAll() {
        this.preferenceFacade.clearAllData();
    }
}
