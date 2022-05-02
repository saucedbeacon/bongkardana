package o;

import android.content.Context;
import id.dana.data.errorconfig.ErrorConfigKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;

public class getPages implements AppConfigModel {
    private static final String ENGLISH_LANGUAGE = "en";
    private static final String INDONESIAN_LANGUAGE = "in";
    private final Context context;
    private final PluginInstallCallback serializer;

    @Inject
    public getPages(PluginInstallCallback pluginInstallCallback, Context context2) {
        this.serializer = pluginInstallCallback;
        this.context = context2;
    }

    private Map<String, List<getWorkerById>> getErrorConfig(resetRenderToTop resetrendertotop) {
        HashMap hashMap = new HashMap();
        if (getLeftSelectedOption.getMax(this.context, "android.permission.READ_EXTERNAL_STORAGE")) {
            StringBuilder sb = new StringBuilder(ErrorConfigKey.FILE_NAME_PREFIX);
            sb.append(resetrendertotop.getVersion());
            sb.append(".json");
            for (Map.Entry next : this.serializer.deserializeMap(getPositiveString.loadJSONFromInternalStorage(this.context, sb.toString())).entrySet()) {
                hashMap.put((String) next.getKey(), createErrorCodeConfigFromMap(next));
            }
        }
        return hashMap;
    }

    private List<getWorkerById> createErrorCodeConfigFromMap(Map.Entry<String, String> entry) {
        Map<String, String> deserializeMap = this.serializer.deserializeMap(entry.getValue());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : deserializeMap.entrySet()) {
            arrayList.add(new getWorkerById((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }

    private String searchErrorMessage(String str, String str2, resetRenderToTop resetrendertotop) {
        List<getWorkerById> list = getErrorConfig(resetrendertotop).get(str);
        if (list == null) {
            return null;
        }
        for (getWorkerById getworkerbyid : list) {
            if (getworkerbyid.getId().equals(str2)) {
                return getworkerbyid.getMessage();
            }
        }
        return null;
    }

    public String getErrorMessageByKey(String str, resetRenderToTop resetrendertotop) {
        if (resetrendertotop == null || !resetrendertotop.isEnable()) {
            return null;
        }
        if (new Locale("in").getLanguage().equals(Locale.getDefault().getLanguage())) {
            return searchErrorMessage("in", str, resetrendertotop);
        }
        return searchErrorMessage("en", str, resetrendertotop);
    }

    public resetRenderToTop getErrorConfigAmcs() {
        throw new UnsupportedOperationException();
    }
}
