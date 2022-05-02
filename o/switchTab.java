package o;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class switchTab {
    @Inject
    public switchTab(Context context, AppPausePoint appPausePoint) {
        if (!appPausePoint.isInitialized()) {
            appPausePoint.startAmcsService(context, "prod");
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<JSONObject> getH5OnlineConfig(String str, Set<String> set) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new setAutoShow(str)).map(recreate.getMax).map(new isShowing(this, set)).onErrorResumeNext(getCommonSection(str, set));
    }

    /* access modifiers changed from: private */
    /* renamed from: getH5OnlineConfigs */
    public JSONObject lambda$getH5OnlineConfig$1(JSONObject jSONObject, Set<String> set) {
        if (set == null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String h5OnlineConfig : set) {
            jSONObject2.putAll(getH5OnlineConfig(jSONObject, h5OnlineConfig));
        }
        return jSONObject2;
    }

    private TitleBarRightButtonView.AnonymousClass1<JSONObject> getCommonSection(String str, Set<String> set) {
        if ("Common".equals(str)) {
            return TitleBarRightButtonView.AnonymousClass1.fromCallable(isAutoShow.getMin).map(recreate.getMax).map(new setTabBarBadge(this, set));
        }
        return TitleBarRightButtonView.AnonymousClass1.just(new JSONObject());
    }

    private JSONObject getH5OnlineConfig(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        Iterator<Map.Entry<String, Object>> it = jSONObject.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry next = it.next();
                if (next != null) {
                    if (!TextUtils.isEmpty(str) && ((String) next.getKey()).equals(str)) {
                        jSONObject3.put((String) next.getKey(), next.getValue());
                        break;
                    }
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
            } else {
                break;
            }
        }
        return TextUtils.isEmpty(str) ? jSONObject2 : jSONObject3;
    }
}
