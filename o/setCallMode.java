package o;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVResourceUtils;

@Singleton
public class setCallMode {
    private static final String KEY_NEARBYME_TOOLTIP = "nearbyme_tooltip";
    private static final String KEY_NEARBY_SHOPS_WITH_PAGINATION = "nearby_shops_with_pagination";
    private static final String SESSION_PREFERENCES = "SessionPreferencesproduction";
    private final onSingleFailed preferenceFacade;
    private final BackKeyDownPoint securityGuardFacade;

    @Inject
    public setCallMode(Context context, PluginInstallCallback pluginInstallCallback) {
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(SESSION_PREFERENCES).setUseDrutherPreference(true).setSerializerFacade(pluginInstallCallback)).createData("local");
        this.securityGuardFacade = new BackKeyDownPoint(context);
    }

    public String getNearbyShopsWithPagination() {
        if (!this.preferenceFacade.getBoolean(RVResourceUtils.KEY_SECURED, false).booleanValue()) {
            String string = this.preferenceFacade.getString(KEY_NEARBY_SHOPS_WITH_PAGINATION);
            setNearbyShopsWithPagination(string);
            return string;
        }
        try {
            return this.securityGuardFacade.decryptString(this.preferenceFacade.getString(KEY_NEARBY_SHOPS_WITH_PAGINATION));
        } catch (SecException unused) {
            return null;
        }
    }

    public void setNearbyShopsWithPagination(String str) {
        try {
            this.preferenceFacade.saveData(KEY_NEARBY_SHOPS_WITH_PAGINATION, this.securityGuardFacade.encryptString(str));
            this.preferenceFacade.saveData(RVResourceUtils.KEY_SECURED, Boolean.TRUE);
        } catch (SecException unused) {
            this.preferenceFacade.saveData(KEY_NEARBY_SHOPS_WITH_PAGINATION, str);
        }
    }

    public void clearAll() {
        this.preferenceFacade.clearAllData();
    }

    public boolean getToolTipShow(String str) {
        return this.preferenceFacade.getBoolean(KEY_NEARBYME_TOOLTIP.concat(String.valueOf(str)), false).booleanValue();
    }

    public boolean saveToolTipShow(String str) {
        this.preferenceFacade.saveData(KEY_NEARBYME_TOOLTIP.concat(String.valueOf(str)), Boolean.TRUE);
        return true;
    }
}
