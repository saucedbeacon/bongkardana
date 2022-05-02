package o;

import android.content.Context;
import javax.inject.Inject;
import o.RVResourceUtils;

public class setQueryScene {
    private static final String MIXPANEL_ALIAS_EXIST_PREFERENCES;
    private final onSingleFailed preferenceFacade;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(setQueryScene.class.getSimpleName());
        sb.append("production");
        MIXPANEL_ALIAS_EXIST_PREFERENCES = sb.toString();
    }

    @Inject
    setQueryScene(Context context, PluginInstallCallback pluginInstallCallback) {
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(MIXPANEL_ALIAS_EXIST_PREFERENCES).setSerializerFacade(pluginInstallCallback)).createData("local");
    }

    public boolean getAliasExist() {
        return this.preferenceFacade.getBoolean("mixpanel_alias_exist_key").booleanValue();
    }

    public void saveMixpanelAliasExist(boolean z) {
        this.preferenceFacade.saveData("mixpanel_alias_exist_key", Boolean.valueOf(z));
    }
}
