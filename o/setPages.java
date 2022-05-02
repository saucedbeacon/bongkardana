package o;

import android.content.Context;
import javax.inject.Inject;
import o.RVResourceUtils;

public class setPages {
    private static final String ERROR_CONFIG_PREFERENCES;
    private final onSingleFailed preferenceFacade;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(setPages.class.getSimpleName());
        sb.append("production");
        ERROR_CONFIG_PREFERENCES = sb.toString();
    }

    @Inject
    public setPages(Context context, PluginInstallCallback pluginInstallCallback) {
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(ERROR_CONFIG_PREFERENCES).setUseDrutherPreference(true).setSerializerFacade(pluginInstallCallback)).createData("local");
    }

    public int getErrorConfigVersion() {
        if (this.preferenceFacade.getInteger("error_config_version_code_key") != null) {
            return this.preferenceFacade.getInteger("error_config_version_code_key").intValue();
        }
        return 0;
    }

    public void saveErrorConfigVersion(int i) {
        this.preferenceFacade.saveData("error_config_version_code_key", Integer.valueOf(i));
    }
}
