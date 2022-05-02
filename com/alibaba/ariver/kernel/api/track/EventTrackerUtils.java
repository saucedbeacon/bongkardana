package com.alibaba.ariver.kernel.api.track;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.j256.ormlite.stmt.query.SimpleComparison;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EventTrackerUtils {
    public static final String TAG = "EventTrackerUtils";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Integer> f10088a = new ConcurrentHashMap();
    private static final List<String> b;

    static {
        ArrayList arrayList = new ArrayList();
        b = arrayList;
        arrayList.add("NBComponent.render");
        b.add("getCurrentLocation");
        b.add("rpc");
        b.add("httpRequest");
        b.add(RequestPermissionsEvent.REQUEST);
        b.add("showLoading");
        b.add("hideLoading");
        b.add(Constants.JS_API_GET_AUTH_CODE);
        b.add(ApiDowngradeConstant.ActionType.TOAST);
        b.add(ApiDowngradeConstant.ActionType.ALERT);
        b.add("confirm");
        b.add("registerWorker");
        b.add("startApp");
        b.add(RVStartParams.FROM_TYPE_PUSH_WINDOW);
    }

    public static synchronized String getTrackerIdWithIndex(String str) {
        synchronized (EventTrackerUtils.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!f10088a.containsKey(str)) {
                f10088a.put(str, 1);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_1");
                String obj = sb.toString();
                return obj;
            }
            int intValue = f10088a.get(str).intValue() + 1;
            f10088a.put(str, Integer.valueOf(intValue));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("_");
            sb2.append(intValue);
            String obj2 = sb2.toString();
            return obj2;
        }
    }

    public static synchronized String getTrackerIdWithIndex(String str, String str2) {
        synchronized (EventTrackerUtils.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!f10088a.containsKey(str)) {
                f10088a.put(str, 1);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_");
                sb.append(str2);
                sb.append("_1");
                String obj = sb.toString();
                return obj;
            }
            int intValue = f10088a.get(str).intValue() + 1;
            f10088a.put(str, Integer.valueOf(intValue));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("_");
            sb2.append(str2);
            sb2.append("_");
            sb2.append(intValue);
            String obj2 = sb2.toString();
            return obj2;
        }
    }

    public static String getExtraAttrByJoinList(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        Map.Entry next = it.next();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append((String) next.getKey());
        sb.append(SimpleComparison.EQUAL_TO_OPERATION);
        sb.append(next.getValue());
        String obj = sb.toString();
        while (it.hasNext()) {
            Map.Entry next2 = it.next();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("|");
            sb2.append((String) next2.getKey());
            sb2.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb2.append(next2.getValue());
            obj = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append("]");
        String obj2 = sb3.toString();
        RVLogger.d(TAG, "getExtraAttrByJoinList ".concat(String.valueOf(obj2)));
        return obj2;
    }

    public static synchronized void clearTrackIdIndexDict() {
        synchronized (EventTrackerUtils.class) {
            RVLogger.d(TAG, "clearTrackIdIndexDict");
            f10088a.clear();
        }
    }

    public static boolean isKeyJsApi(String str) {
        return b.contains(str);
    }
}
