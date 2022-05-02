package o;

import android.content.Context;
import javax.inject.Inject;
import o.RVResourceUtils;

public class RVPerfLogLifeCycleExtension {
    private static final String PROMO_CENTER_CATEGORY_PREFERENCES;
    private final onSingleFailed preferenceFacade;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(RVPerfLogLifeCycleExtension.class.getSimpleName());
        sb.append("production");
        PROMO_CENTER_CATEGORY_PREFERENCES = sb.toString();
    }

    @Inject
    RVPerfLogLifeCycleExtension(Context context, PluginInstallCallback pluginInstallCallback) {
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(PROMO_CENTER_CATEGORY_PREFERENCES).setSerializerFacade(pluginInstallCallback)).createData("local");
    }

    public transSyncThreadNames getCategories() {
        transSyncThreadNames transsyncthreadnames = (transSyncThreadNames) this.preferenceFacade.getObject("promo_center_category_key", transSyncThreadNames.class);
        return transsyncthreadnames == null ? new transSyncThreadNames() : transsyncthreadnames;
    }

    /* access modifiers changed from: package-private */
    public boolean saveCategories(transSyncThreadNames transsyncthreadnames) {
        this.preferenceFacade.saveData("promo_center_category_key", transsyncthreadnames);
        return true;
    }
}
