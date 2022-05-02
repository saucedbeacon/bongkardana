package com.ta.audid.g;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.ta.audid.a;
import com.ta.utdid2.a.a.b;
import com.ta.utdid2.a.a.e;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import kotlin.text.Typography;
import o.onActivityPreCreated;
import org.json.JSONObject;

public class l {
    private static long getMax = -6118463727418747362L;
    private static int getMin = 0;
    private static int setMax = 1;

    public static String V() {
        int i = setMax + 67;
        getMin = i % 128;
        int i2 = i % 2;
        Context context = a.a().getContext();
        if (!(context == null)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("UTCommon", 0);
            if (!(sharedPreferences != null)) {
                return "";
            }
            String string = sharedPreferences.getString("_lun", "");
            if (e.isEmpty(string)) {
                return "";
            }
            try {
                return new String(b.decode(string.getBytes(), 2), length(new char[]{58412, 58489, 19369, 26922, 6469, 40419, 50512, 39730, 48185}).intern());
            } catch (Exception e) {
                m.d("", e);
                return "";
            }
        } else {
            int i3 = getMin + 87;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return "";
        }
    }

    public static String W() {
        int i = getMin + 37;
        setMax = i % 128;
        int i2 = i % 2;
        Context context = a.a().getContext();
        boolean z = false;
        if (context == null) {
            int i3 = setMax + 3;
            getMin = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            if (z) {
                Object obj = null;
                super.hashCode();
            }
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("UTCommon", 0);
        if (sharedPreferences == null) {
            return "";
        }
        int i4 = getMin + 3;
        setMax = i4 % 128;
        int i5 = i4 % 2;
        String string = sharedPreferences.getString("_luid", "");
        if (e.isEmpty(string)) {
            return "";
        }
        try {
            return new String(b.decode(string.getBytes(), 2), length(new char[]{58412, 58489, 19369, 26922, 6469, 40419, 50512, 39730, 48185}).intern());
        } catch (UnsupportedEncodingException e) {
            m.d("", e);
            return "";
        }
    }

    public static void a(String str, Map<String, String> map) {
        try {
            AppMonitor.Counter.commit("UtdidMonitor", str, new JSONObject(map).toString(), 1.0d);
            int i = getMin + 73;
            setMax = i % 128;
            int i2 = i % 2;
        } catch (Throwable th) {
            m.d("", th);
        }
    }

    private static String length(char[] cArr) {
        char[] length = onActivityPreCreated.length(getMax, cArr);
        int i = 4;
        while (i < length.length) {
            try {
                int i2 = getMin + 41;
                setMax = i2 % 128;
                if ((i2 % 2 == 0 ? Typography.less : 0) != 0) {
                    length[i] = (char) ((int) (((long) (length[i] ^ length[i + 2])) % (((long) (i - 3)) % getMax)));
                    i += 36;
                } else {
                    length[i] = (char) ((int) (((long) (length[i] ^ length[i % 4])) ^ (((long) (i - 4)) * getMax)));
                    i++;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        String str = new String(length, 4, length.length - 4);
        try {
            int i3 = setMax + 93;
            getMin = i3 % 128;
            if ((i3 % 2 != 0 ? 16 : 'E') == 'E') {
                return str;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }
}
