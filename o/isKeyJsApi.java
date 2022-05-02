package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVResourceUtils;

@Singleton
public class isKeyJsApi {
    private static final String REFERRAL_PREFERENCES;
    private final onSingleFailed preferenceFacade;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(isKeyJsApi.class.getSimpleName());
        sb.append("production");
        REFERRAL_PREFERENCES = sb.toString();
    }

    @Inject
    public isKeyJsApi(Context context, PluginInstallCallback pluginInstallCallback) {
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(REFERRAL_PREFERENCES).setUseDrutherPreference(true).setSerializerFacade(pluginInstallCallback)).createData("local");
    }

    public String getReferralCode() {
        if (this.preferenceFacade.getString("referral_code_key") != null) {
            return this.preferenceFacade.getString("referral_code_key");
        }
        return null;
    }

    public Boolean saveReferralCode(String str) {
        this.preferenceFacade.saveData("referral_code_key", str);
        return Boolean.TRUE;
    }

    public void clearAll() {
        this.preferenceFacade.clearAllData();
    }
}
