package o;

import android.content.Context;
import javax.inject.Inject;
import o.RVResourceUtils;

public class getDownloadTime {
    private static final String length;
    final onSingleFailed setMin;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(getDownloadTime.class.getSimpleName());
        sb.append("production");
        length = sb.toString();
    }

    @Inject
    public getDownloadTime(Context context, PluginInstallCallback pluginInstallCallback) {
        this.setMin = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(length).setUseDrutherPreference(true).setSerializerFacade(pluginInstallCallback)).createData("local");
    }

    public final boolean setMax(int i) {
        this.setMin.saveData("storage_version", Integer.valueOf(i));
        return true;
    }
}
