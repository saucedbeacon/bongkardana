package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVResourceUtils;

@Singleton
public class setFrame {
    private static final String CARD_PREFERENCES = "Cardproduction";
    private final String key = "CARD_INDEX_NO";
    private onSingleFailed preferenceFacade;

    @Inject
    public setFrame(Context context, PluginInstallCallback pluginInstallCallback) {
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(CARD_PREFERENCES).setUseDrutherPreference(true).setSerializerFacade(pluginInstallCallback)).createData("local");
    }

    public Boolean saveLastCardUsed(String str) {
        this.preferenceFacade.saveData("CARD_INDEX_NO", str);
        return Boolean.TRUE;
    }

    public String getDefaultCard() {
        String string = this.preferenceFacade.getString("CARD_INDEX_NO");
        return string == null ? "" : string;
    }
}
