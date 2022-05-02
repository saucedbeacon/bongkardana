package com.alibaba.ariver.kernel.common.utils;

import android.net.Uri;
import com.alibaba.fastjson.JSONArray;
import java.util.List;

public class DomainUtil {
    public static String getNewDomainSuffix(String str) {
        Uri parseUrl = UrlUtils.parseUrl(str);
        if (parseUrl == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(parseUrl.getScheme());
        sb.append("://");
        sb.append(parseUrl.getHost());
        return sb.toString();
    }

    public static boolean isSomeDomainInternal(String str, String str2) {
        if (str == null) {
            return false;
        }
        try {
            JSONArray parseArray = JSONUtils.parseArray(str2);
            if (parseArray != null) {
                for (int i = 0; i < parseArray.size(); i++) {
                    if (PatternUtils.matchRegex(parseArray.getString(i), str)) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            RVLogger.e("DomainUtil", "exception detail.", th);
        }
        return false;
    }

    public static boolean isInDomain(String str, List<String> list) {
        if (!(str == null || list == null)) {
            try {
                if (!list.isEmpty()) {
                    for (String matchRegex : list) {
                        if (PatternUtils.matchRegex(matchRegex, str)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                RVLogger.e("DomainUtil", "exception detail.", th);
            }
        }
        return false;
    }
}
