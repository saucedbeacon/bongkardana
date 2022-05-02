package o;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Singleton;

@Singleton
public class PluginInstallCallback implements compareVersion {
    private final Gson gson = new Gson();

    private boolean isBlank(String str) {
        return str == null || str.length() <= 0;
    }

    public String serialize(Object obj, Class cls) {
        return JSON.toJSONString(obj);
    }

    public String serialize(Object obj) {
        return serialize(obj, (Class) null);
    }

    public <T> T deserialize(String str, Class<T> cls) {
        try {
            return JSON.parseObject(str, cls);
        } catch (JSONException e) {
            if (isNoDefaultConstructorError(e)) {
                return this.gson.fromJson(str, cls);
            }
            throw e;
        }
    }

    private boolean isNoDefaultConstructorError(Exception exc) {
        return (exc instanceof JSONException) && exc.getMessage() != null && exc.getMessage().contains("default constructor not found");
    }

    public Map<String, String> deserializeMap(String str) {
        if (isBlank(str)) {
            return new HashMap();
        }
        return (Map) JSON.parseObject(str, new TypeReference<Map<String, String>>() {
        }, new Feature[0]);
    }

    public Map<String, Integer> deserializeMaps(String str) {
        if (isBlank(str)) {
            return new HashMap();
        }
        return (Map) JSON.parseObject(str, new TypeReference<Map<String, Integer>>() {
        }, new Feature[0]);
    }

    public List<String> deserializeList(String str) {
        ArrayList arrayList = new ArrayList();
        if (!(str == null || str.length() == 0)) {
            JSONArray parseArray = JSON.parseArray(str);
            for (int i = 0; i < parseArray.size(); i++) {
                arrayList.add(parseArray.getString(i));
            }
        }
        return arrayList;
    }

    public <T> List<T> deserializeList(String str, Class<T> cls) {
        return TextUtils.isEmpty(str) ? new ArrayList() : JSON.parseArray(str, cls);
    }
}
