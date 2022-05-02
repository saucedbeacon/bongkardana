package o;

import android.content.Context;
import android.text.TextUtils;
import com.iap.ac.config.lite.ConfigCenter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVLogger;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Singleton
public class RVTraceKey implements RVLogger.AnonymousClass1 {
    private final PluginInstallCallback serializer;

    @Inject
    public RVTraceKey(Context context, AppPausePoint appPausePoint, PluginInstallCallback pluginInstallCallback) {
        this.serializer = pluginInstallCallback;
        if (!appPausePoint.isInitialized()) {
            appPausePoint.startAmcsService(context, "prod");
        }
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<List<getExtension>> getSendMoneyMenuItems(List<String> list) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new RVPhaseRecorder(this, list));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List lambda$getSendMoneyMenuItems$0(List list) throws Exception {
        getExtension getextension;
        ArrayList arrayList = new ArrayList();
        JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig("SendMoney_Scenario");
        if (sectionConfig == null || sectionConfig.length() == 0) {
            return Collections.emptyList();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String jSONObject = sectionConfig.getJSONObject((String) it.next()).toString();
            if (!TextUtils.isEmpty(jSONObject) && (getextension = (getExtension) this.serializer.deserialize(jSONObject, getExtension.class)) != null) {
                arrayList.add(getextension);
            }
        }
        return arrayList;
    }

    public TitleBarRightButtonView.AnonymousClass1<List<getExtension>> getSendMoneyHomeMenus() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new traceEndSection(this)).flatMap(new RVTraceUtils(this));
    }

    /* access modifiers changed from: private */
    @Nullable
    public List<String> getMenuCategories() {
        JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig("SendMoney_Categories");
        if (sectionConfig == null || sectionConfig.length() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = sectionConfig.getJSONArray("send_money_scenarios");
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            arrayList.add(string);
                        }
                    }
                    return arrayList;
                }
            }
            return Collections.emptyList();
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }
}
