package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVResourceUtils;

@Singleton
public class getVersion {
    private static final String APP_INFO_PREFERENCES;
    private final onSingleFailed preferenceFacade;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(getVersion.class.getSimpleName());
        sb.append("production");
        APP_INFO_PREFERENCES = sb.toString();
    }

    @Inject
    public getVersion(Context context, PluginInstallCallback pluginInstallCallback) {
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(APP_INFO_PREFERENCES).setUseDrutherPreference(true).setSerializerFacade(pluginInstallCallback)).createData("local");
    }

    public void saveUtdid(String str) {
        this.preferenceFacade.saveData("utdid", str);
    }

    public void saveUtdIdWithTimestamp(String str) {
        this.preferenceFacade.saveData("utdid_with_timestamp", str);
    }

    public String getUtdid() {
        return this.preferenceFacade.getString("utdid");
    }

    public String getUtdidWithTimestamp() {
        return this.preferenceFacade.getString("utdid_with_timestamp");
    }
}
