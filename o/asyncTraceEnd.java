package o;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.iap.ac.config.lite.ConfigCenter;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class asyncTraceEnd implements RVAccountService {
    private final PluginInstallCallback serializer;

    @Inject
    public asyncTraceEnd(Context context, AppPausePoint appPausePoint, PluginInstallCallback pluginInstallCallback) {
        this.serializer = pluginInstallCallback;
        if (!appPausePoint.isInitialized()) {
            appPausePoint.startAmcsService(context, "prod");
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, addExtraDataParser>> getAddPayMethodConfig() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new asyncTraceBegin(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Map lambda$getAddPayMethodConfig$0() throws Exception {
        JSONObject parseObject = getPositiveString.parseObject(ConfigCenter.getInstance().getSectionConfig("SendMoney_Add_PayMethod"));
        if (parseObject == null || parseObject.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : parseObject.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof JSONObject) {
                hashMap.put(str, (addExtraDataParser) this.serializer.deserialize(((JSONObject) value).toJSONString(), addExtraDataParser.class));
            }
        }
        return hashMap;
    }
}
