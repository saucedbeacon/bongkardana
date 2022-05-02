package o;

import android.content.Context;
import android.text.TextUtils;
import javax.inject.Inject;
import o.RVResourceUtils;

public class getViewId {
    private static final String PLAYSTORE_PREFERENCES;
    private final onSingleFailed preferenceFacade;
    private final PluginInstallCallback serializer;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(getViewId.class.getSimpleName());
        sb.append("production");
        PLAYSTORE_PREFERENCES = sb.toString();
    }

    @Inject
    public getViewId(Context context, PluginInstallCallback pluginInstallCallback) {
        this.serializer = pluginInstallCallback;
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(PLAYSTORE_PREFERENCES).setUseDrutherPreference(true).setSerializerFacade(pluginInstallCallback)).createData("local");
    }

    public boolean saveLastPlayStoreReviewShow(RVManifest rVManifest) {
        this.preferenceFacade.saveData("play_store_review_last_show_key", this.serializer.serialize(rVManifest));
        return true;
    }

    public RVManifest getLastPlayStoreReviewShow() {
        String string = this.preferenceFacade.getString("play_store_review_last_show_key");
        if (TextUtils.isEmpty(string)) {
            return new RVManifest((String) null, (String) null, (String) null);
        }
        return (RVManifest) this.serializer.deserialize(string, RVManifest.class);
    }

    public int getTransactionSuccessCount() {
        return this.preferenceFacade.getInteger("first_success_transaction_count").intValue();
    }

    public boolean saveFirstSuccessTransactionResult(int i) {
        this.preferenceFacade.saveData("first_success_transaction_count", Integer.valueOf(i));
        return true;
    }

    public void clearAll() {
        this.preferenceFacade.clearAllData();
    }
}
