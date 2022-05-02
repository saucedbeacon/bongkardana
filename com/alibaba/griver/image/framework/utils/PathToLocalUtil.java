package com.alibaba.griver.image.framework.utils;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.proxy.LocalIdTool;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PathToLocalUtil {
    public static final String AL_MEDIA_FILES = "apFilePaths";
    public static final String AL_MEDIA_FILES_V2 = "apFilePathsV2";
    public static final String TAG = "PathToLocalUtil";

    public static Map<String, String> mapImageFilePathToLocalIds(JSONObject jSONObject, List<String> list, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedList linkedList = new LinkedList();
        for (String next : list) {
            String covertPathToLocalId = covertPathToLocalId(next);
            if (!TextUtils.isEmpty(covertPathToLocalId)) {
                String localIdToUrl = H5ResourceHandlerUtil.localIdToUrl(covertPathToLocalId, H5ResourceHandlerUtil.IMAGE);
                linkedList.add(localIdToUrl);
                linkedHashMap.put(next, localIdToUrl);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(next);
                sb.append("covert failed!");
                RVLogger.w(TAG, sb.toString());
            }
        }
        if (!linkedList.isEmpty()) {
            if (z) {
                jSONObject.put(AL_MEDIA_FILES, JSON.toJSON(linkedList));
            } else {
                jSONObject.put(AL_MEDIA_FILES, (Object) JSONArray.toJSONString(linkedList));
                jSONObject.put(AL_MEDIA_FILES_V2, JSONArray.toJSON(linkedList));
            }
        }
        return linkedHashMap;
    }

    public static String covertPathToLocalId(String str) {
        return LocalIdTool.get().encodeToLocalId(str);
    }
}
