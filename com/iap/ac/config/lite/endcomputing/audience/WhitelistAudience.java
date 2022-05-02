package com.iap.ac.config.lite.endcomputing.audience;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WhitelistAudience extends BaseAudience {
    private transient Set<String> listSet;
    private String variable;
    private String whitelistIds;

    public WhitelistAudience(String str, String str2) {
        this.variable = str2;
        this.whitelistIds = str;
    }

    public boolean evaluate(Map<String, Object> map) {
        if (map == null || this.variable == null) {
            return false;
        }
        if (this.listSet == null) {
            synchronized (this) {
                if (this.listSet == null) {
                    if (!TextUtils.isEmpty(this.whitelistIds)) {
                        this.listSet = new HashSet(Arrays.asList(this.whitelistIds.split(",")));
                    } else {
                        this.listSet = new HashSet();
                        return false;
                    }
                }
            }
        }
        Object obj = map.get(this.variable);
        return this.listSet.contains(obj == null ? null : obj.toString());
    }
}
