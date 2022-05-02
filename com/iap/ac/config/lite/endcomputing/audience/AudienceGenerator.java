package com.iap.ac.config.lite.endcomputing.audience;

import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.config.lite.endcomputing.model.AudienceType;
import com.iap.ac.config.lite.endcomputing.model.SubAudienceType;
import org.json.JSONObject;

public class AudienceGenerator {
    public static BaseAudience buildAudience(String str, JSONObject jSONObject) {
        return (BaseAudience) JsonUtils.fromJson(jSONObject, SubAudienceType.valueOf(str).getClazz());
    }

    public static BaseAudienceSets buildAudienceSet(String str) throws Exception {
        return (BaseAudienceSets) AudienceType.valueOf(str).getClazz().newInstance();
    }
}
