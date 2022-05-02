package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVResourceUtils;

@Singleton
public class isAppPermission {
    private static final String KEY_ACTIVE_TIMESTAMP = "active_timestamp";
    private static final String SESSION_PREFERENCES = "SessionPreferencesproduction";
    private onSingleFailed preferenceFacade;

    @Inject
    public isAppPermission(Context context, PluginInstallCallback pluginInstallCallback) {
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(SESSION_PREFERENCES).setUseDrutherPreference(true).setSerializerFacade(pluginInstallCallback)).createData("local");
    }

    public Long getActiveTimestamp() {
        return this.preferenceFacade.getLong(KEY_ACTIVE_TIMESTAMP);
    }

    public void setActiveTimestamp(Long l) {
        this.preferenceFacade.saveData(KEY_ACTIVE_TIMESTAMP, l);
    }

    public void clearAll() {
        this.preferenceFacade.clearAllData();
    }
}
