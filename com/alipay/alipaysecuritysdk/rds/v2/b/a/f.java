package com.alipay.alipaysecuritysdk.rds.v2.b.a;

import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.griver.core.jsapi.actionsheet.ActionSheetItem;
import com.alipay.alipaysecuritysdk.common.e.e;
import com.alipay.alipaysecuritysdk.rds.v2.b.b;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f9283a = {"type", "pn", "cn", "et", "ad", SecurityConstants.KEY_TEXT, "seq", ActionSheetItem.BadgeInfo.TYPE_NUM};
    private Map<String, Object> b = new HashMap();
    private List<Map<String, String>> c = new ArrayList();

    public f(String str, String str2, String str3, int i) {
        this.b.put("type", str3);
        this.b.put("pn", e.c(str) ? "-" : str);
        this.b.put("cn", e.c(str2) ? "-" : str2);
        this.b.put("et", RVParams.SHOW_TITLEBAR);
        this.b.put("ad", this.c);
        this.b.put("seq", String.valueOf(i));
        this.b.put(ActionSheetItem.BadgeInfo.TYPE_NUM, 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Map<String, Object> map = this.b;
        map.put(ActionSheetItem.BadgeInfo.TYPE_NUM, String.valueOf(map.get(ActionSheetItem.BadgeInfo.TYPE_NUM)));
        for (String str : f9283a) {
            Object obj = this.b.get(str);
            if (obj != null && (obj instanceof String)) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException unused) {
                }
            } else if (obj != null && (obj instanceof b)) {
                jSONObject.put(str, ((b) obj).a());
            } else if (obj != null && (obj instanceof List)) {
                List list = (List) obj;
                if (list.size() > 20) {
                    list = list.subList(list.size() - 20, list.size());
                }
                jSONObject.put(str, com.alipay.alipaysecuritysdk.common.e.b.a(list));
            }
        }
        return jSONObject;
    }

    public final synchronized void a(double d) {
        this.b.put(ActionSheetItem.BadgeInfo.TYPE_NUM, Integer.valueOf(((Integer) this.b.get(ActionSheetItem.BadgeInfo.TYPE_NUM)).intValue() + 1));
        b(d);
    }

    public final synchronized void b(double d) {
        HashMap hashMap = new HashMap();
        hashMap.put("x", String.valueOf(d));
        hashMap.put("y", String.valueOf(d));
        hashMap.put(SecurityConstants.KEY_TEXT, String.valueOf(System.currentTimeMillis()));
        this.c.add(hashMap);
    }
}
