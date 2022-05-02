package o;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import o.TitleBarRightButtonView;

public final class getPrepareData {
    private getPrepareData() {
    }

    public static <T> TitleBarRightButtonView.AnonymousClass1<T> getFeatureSwitch(String str, T t) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new setOriginHasAppInfo(str, t)).onErrorReturnItem(t);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r0.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T getFeatureSwitchObject(java.lang.String r1, T r2) {
        /*
            com.alibaba.fastjson.JSONObject r0 = getFeatureSwitchSection()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x000d
            return r1
        L_0x000d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPrepareData.getFeatureSwitchObject(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public static JSONArray getFeatureSwitchJSONArray(String str) {
        JSONObject featureSwitchSection = getFeatureSwitchSection();
        if (featureSwitchSection != null) {
            return featureSwitchSection.getJSONArray(str);
        }
        return null;
    }

    public static JSONObject getFeatureSwitchJSONObject(String str) {
        JSONObject featureSwitchSection = getFeatureSwitchSection();
        if (featureSwitchSection != null) {
            return featureSwitchSection.getJSONObject(str);
        }
        return null;
    }

    private static JSONObject getFeatureSwitchSection() {
        org.json.JSONObject section = fromString.getSection("FeatureSwitch");
        if (section != null) {
            return getPositiveString.parseObject(section);
        }
        return null;
    }
}
