package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVResourceUtils;

@Singleton
public class errorLog {
    private static final String EXPLORE_DANA_PREFERENCES = "ExploreDanaPreferencesproduction";
    private onSingleFailed preferenceFacade;

    @Inject
    public errorLog(Context context, PluginInstallCallback pluginInstallCallback) {
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(EXPLORE_DANA_PREFERENCES).setUseDrutherPreference(true).setSerializerFacade(pluginInstallCallback)).createData("local");
    }

    public List<getDefaultProxy> checkExploreDanaItem(List<getDefaultProxy> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (int i = 0; i < list.size(); i++) {
            if (this.preferenceFacade.getString(list.get(i).getContentId()) == null) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    public Boolean setDismissAll(List<String> list) {
        if (list == null) {
            return Boolean.FALSE;
        }
        for (String saveExploreDanaItem : list) {
            saveExploreDanaItem(saveExploreDanaItem);
        }
        return Boolean.TRUE;
    }

    public Boolean saveExploreDanaItem(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-677754552, oncanceled);
            onCancelLoad.getMin(-677754552, oncanceled);
        }
        this.preferenceFacade.saveData(str, str);
        return Boolean.TRUE;
    }
}
