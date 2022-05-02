package o;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import java.util.ArrayList;
import java.util.List;

public final class setColorSchemeDecider {
    private setColorSchemeDecider() {
    }

    public static List<onResultFailed> parseToF2FPayResultResponses(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        if (str.charAt(0) != '[') {
            StringBuilder sb = new StringBuilder("[");
            sb.append(str);
            sb.append("]");
            str = sb.toString();
        }
        return (List) JSON.parseObject(str.replace("&quot;", "\"").replaceAll(",\\\"extendInfo\\\":\\\"\\{.*\\}\\\"", ""), new TypeReference<List<onResultFailed>>() {
        }, new Feature[0]);
    }
}
