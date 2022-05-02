package com.alipay.alipaysecuritysdk.apdid.e;

import android.content.Context;
import com.alipay.alipaysecuritysdk.common.b.b;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f9259a;
    private static final String[] b = {"AD1", "AD2", "AD3", "AD8", "AD9", "AD10", "AD11", "AD12", "AD14", "AD15", "AD16", "AD18", "AD20", "AD23", "AD24", "AD27", "AD28", "AD29", "AD30", "AD31", "AD34", "AA1", "AA2", "AA3", "AA4", "AC4", "AC10", "AE1", "AE2", "AE3", "AE4", "AE5", "AE6", "AE7", "AE8", "AE9", "AE10", "AE11", "AE12", "AE13", "AE14", "AE15"};

    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        Map<String, String> map2;
        synchronized (e.class) {
            if (f9259a == null) {
                c(context, map);
            }
            map2 = f9259a;
        }
        return map2;
    }

    private static synchronized void c(Context context, Map<String, String> map) {
        synchronized (e.class) {
            TreeMap treeMap = new TreeMap();
            f9259a = treeMap;
            treeMap.putAll(b.a(context, map));
            f9259a.putAll(d.a(context));
            f9259a.putAll(c.a(context));
            f9259a.putAll(a.a(context, map));
        }
    }

    public static synchronized String b(Context context, Map<String, String> map) {
        String a2;
        synchronized (e.class) {
            if (f9259a == null) {
                c(context, map);
            }
            TreeMap treeMap = new TreeMap();
            for (String str : b) {
                if (f9259a.containsKey(str)) {
                    treeMap.put(str, f9259a.get(str));
                }
            }
            a2 = b.a(a(treeMap));
        }
        return a2;
    }

    public static synchronized void a() {
        synchronized (e.class) {
            f9259a = null;
        }
    }

    private static String a(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            String str2 = map.get(str);
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            StringBuilder sb = new StringBuilder();
            if (i != 0) {
                str3 = "&";
            }
            sb.append(str3);
            sb.append(str);
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append(str2);
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }
}
