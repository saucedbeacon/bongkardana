package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVResourceUtils;

@Singleton
public class toFullString {
    private static final String SYNC_CONTACT_PREFERENCES;
    private final onSingleFailed preferenceFacade;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(toFullString.class.getSimpleName());
        sb.append("production");
        SYNC_CONTACT_PREFERENCES = sb.toString();
    }

    @Inject
    public toFullString(Context context, PluginInstallCallback pluginInstallCallback) {
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(SYNC_CONTACT_PREFERENCES).setUseDrutherPreference(true).setSerializerFacade(pluginInstallCallback)).createData("local");
    }

    /* access modifiers changed from: package-private */
    public boolean isSyncContactProgressDone() {
        return this.preferenceFacade.getBoolean("is_sync_process_completed").booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean saveSyncProcessCompleteStatus() {
        this.preferenceFacade.saveData("is_sync_process_completed", Boolean.TRUE);
        return true;
    }

    public setSnapshotTitleBarParams getLastSyncedContact() {
        setSnapshotTitleBarParams setsnapshottitlebarparams = (setSnapshotTitleBarParams) this.preferenceFacade.getObject("last_synced_contact", setSnapshotTitleBarParams.class);
        return setsnapshottitlebarparams == null ? new setSnapshotTitleBarParams() : setsnapshottitlebarparams;
    }

    public boolean saveLastSyncedContact(setSnapshotTitleBarParams setsnapshottitlebarparams) {
        this.preferenceFacade.saveData("last_synced_contact", setsnapshottitlebarparams);
        return true;
    }
}
