package com.iap.ac.config.lite.endcomputing.evaluator;

import androidx.annotation.NonNull;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.endcomputing.audience.AudienceGenerator;
import com.iap.ac.config.lite.endcomputing.audience.BaseAudience;
import com.iap.ac.config.lite.endcomputing.audience.BaseAudienceSets;
import com.iap.ac.config.lite.endcomputing.model.ConfigKeyGrayInfos;
import com.iap.ac.config.lite.endcomputing.model.ConfigValueGrayInfo;
import com.iap.ac.config.lite.facade.request.AmcsConfigByKeysRpcRequest;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcRequest;
import com.iap.ac.config.lite.facade.result.AmcsConfigCdnResult;
import com.iap.ac.config.lite.facade.result.AmcsConfigKeyDetails;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Evaluator {
    private static final String TAG = e.b("Evaluator");
    private ConfigCenterContext centerContext;
    private List<ConfigKeyGrayInfos> configKeyGrayInfos;

    public Evaluator(ConfigCenterContext configCenterContext, String str) {
        this.centerContext = configCenterContext;
        this.configKeyGrayInfos = a(str);
    }

    @NonNull
    private List<ConfigKeyGrayInfos> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                ConfigKeyGrayInfos configKeyGrayInfos2 = new ConfigKeyGrayInfos();
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                configKeyGrayInfos2.setKey(optJSONObject.optString("key"));
                configKeyGrayInfos2.setLastResponseTime(optJSONObject.optLong("lastResponseTime"));
                JSONArray optJSONArray = optJSONObject.optJSONArray("infos");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                        JSONObject optJSONObject3 = optJSONObject2.optJSONObject("audiences");
                        ConfigValueGrayInfo configValueGrayInfo = new ConfigValueGrayInfo();
                        configValueGrayInfo.setValue(optJSONObject2.opt("value"));
                        configValueGrayInfo.setLastModifiedTime(optJSONObject2.optLong("lastModifiedTime"));
                        BaseAudienceSets baseAudienceSets = null;
                        if (optJSONObject3 != null) {
                            baseAudienceSets = AudienceGenerator.buildAudienceSet(optJSONObject3.optString("type"));
                            JSONArray optJSONArray2 = optJSONObject3.optJSONArray("subAudiences");
                            if (optJSONArray2 != null) {
                                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                    JSONObject optJSONObject4 = optJSONArray2.optJSONObject(i3);
                                    baseAudienceSets.addSubAudience(AudienceGenerator.buildAudience(optJSONObject4.optString("type"), optJSONObject4));
                                }
                            }
                        }
                        configValueGrayInfo.setAudiences(baseAudienceSets);
                        arrayList2.add(configValueGrayInfo);
                    }
                    configKeyGrayInfos2.setInfos(arrayList2);
                    arrayList.add(configKeyGrayInfos2);
                }
            }
        } catch (Exception e) {
            this.centerContext.getConfigStorage().a();
            ACLog.e(TAG, "".concat(String.valueOf(e)));
        }
        return arrayList;
    }

    public AmcsConfigCdnResult performCalculate(AmcsConfigRpcRequest amcsConfigRpcRequest) {
        AmcsConfigRpcRequest amcsConfigRpcRequest2 = amcsConfigRpcRequest;
        AmcsConfigCdnResult amcsConfigCdnResult = new AmcsConfigCdnResult();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Map<String, Object> convertParameters = amcsConfigRpcRequest.convertParameters();
        HashSet hashSet = amcsConfigRpcRequest2 instanceof AmcsConfigByKeysRpcRequest ? new HashSet(((AmcsConfigByKeysRpcRequest) amcsConfigRpcRequest2).keys) : null;
        Iterator<ConfigKeyGrayInfos> it = this.configKeyGrayInfos.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                ConfigKeyGrayInfos next = it.next();
                if (next != null && (hashSet == null || hashSet.contains(next.getKey()))) {
                    if (amcsConfigCdnResult.getResponseTime() < next.getLastResponseTime()) {
                        amcsConfigCdnResult.setResponseTime(String.valueOf(next.getLastResponseTime()));
                    }
                    if (next.getInfos() != null) {
                        int i = 0;
                        while (true) {
                            if (i >= next.getInfos().size()) {
                                break;
                            }
                            ConfigValueGrayInfo configValueGrayInfo = next.getInfos().get(i);
                            if (configValueGrayInfo.getLastModifiedTime() <= amcsConfigRpcRequest.getLastResponseTime() && !GrayScaleUtils.isTimeRelatedAudience(configValueGrayInfo.getAudiences())) {
                                break;
                            } else if (a(configValueGrayInfo.getAudiences(), convertParameters)) {
                                try {
                                    jSONObject.put(next.getKey(), configValueGrayInfo.getValue());
                                } catch (JSONException e) {
                                    ACLog.e(TAG, "".concat(String.valueOf(e)));
                                }
                                if (configValueGrayInfo.getLastModifiedTime() > 0) {
                                    AmcsConfigKeyDetails amcsConfigKeyDetails = new AmcsConfigKeyDetails();
                                    amcsConfigKeyDetails.setVersion(String.valueOf(configValueGrayInfo.getLastModifiedTime()));
                                    hashMap.put(next.getKey(), amcsConfigKeyDetails);
                                }
                            } else {
                                i++;
                            }
                        }
                        z = false;
                        if (i >= next.getInfos().size() && !z) {
                            arrayList.add(next.getKey());
                        }
                    }
                }
            } else {
                amcsConfigCdnResult.setUpdateKeys(jSONObject);
                amcsConfigCdnResult.setDeleteKeys(arrayList);
                amcsConfigCdnResult.setUpdateKeyDetails(hashMap);
                amcsConfigCdnResult.setSuccess(true);
                return amcsConfigCdnResult;
            }
        }
    }

    private boolean a(BaseAudience baseAudience, Map<String, Object> map) {
        if (baseAudience == null) {
            return true;
        }
        try {
            return baseAudience.evaluate(map);
        } catch (Exception e) {
            ACLog.e(TAG, "failed to evaluate return false :".concat(String.valueOf(e)));
            return false;
        }
    }
}
