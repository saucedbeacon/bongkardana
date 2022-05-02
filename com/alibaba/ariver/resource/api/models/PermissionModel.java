package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Keep
public class PermissionModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<PermissionModel> CREATOR = new Parcelable.Creator<PermissionModel>() {
        public final PermissionModel createFromParcel(Parcel parcel) {
            return new PermissionModel(parcel);
        }

        public final PermissionModel[] newArray(int i) {
            return new PermissionModel[i];
        }
    };
    private static final String KEY_ENABLE_PROXY = "enableProxy";
    private static final String KEY_ENABLE_PROXY_LEGACY = "Enable_Proxy";
    private static final String KEY_EVENT_LIST = "eventList";
    private static final String KEY_EVENT_LIST_LEGACY = "EVENT_List";
    private static final String KEY_FORCE_USE_SSL = "forceUseSsl";
    private static final String KEY_FORCE_USE_SSL_LEGACY = "ForceUseSSL";
    private static final String KEY_HTTP_RES_MIME_LIST = "httpLinkSubResMimeList";
    private static final String KEY_HTTP_RES_MIME_LIST_LEGACY = "HttpLink_SubResMimeList";
    private static final String KEY_IGNORE_PERMISSION_CHECK = "ignorePermissionCheck";
    private static final String KEY_JSAPI_LIST = "jsapiNameList";
    private static final String KEY_JSAPI_LIST_LEGACY = "JSAPI_List";
    private static final String KEY_JSAPI_SP_CONFIG = "jsapiSpConfig";
    private static final String KEY_JSAPI_SP_CONFIG_LEGACY = "JSAPI_SP_Config";
    private static final String KEY_NATIVE_API_SCOPE_CONFIG = "nativeApiScopeConfig";
    private static final String KEY_NATIVE_API_USER_AUTH = "nativeApiUserAuth";
    private static final String KEY_SUB_RES_MIME_LIST = "validSubResMimeList";
    private static final String KEY_SUB_RES_MIME_LIST_LEGACY = "Valid_SubResMimeList";
    private static final String KEY_VALID_DOMAIN = "validDomain";
    private static final String KEY_WEBVIEW_CONFIG = "webViewConfig";
    private static final String KEY_WEBVIEW_CONFIG_LEGACY = "Webview_Config";
    private static final long serialVersionUID = 7945824571470124314L;
    @JSONField(name = "enableProxy")
    private String enableProxy;
    @JSONField(name = "eventList")
    private Set<String> eventList;
    @JSONField(name = "forceUseSsl")
    private String forceUseSsl;
    @JSONField(name = "httpLinkSubResMimeList")
    private Set<String> httpLinkSubResMimeList;
    @JSONField(name = "ignorePermissionCheck")
    private Set<String> ignorePermissionCheck;
    @JSONField(name = "jsapiNameList")
    private Set<String> jsapiList;
    @JSONField(name = "nativeApiScopeConfig")
    private JSONObject nativeApiScopeConfig;
    @JSONField(name = "nativeApiUserAuth")
    private JSONObject nativeApiUserAuth;
    @JSONField(deserialize = false, serialize = false)
    private Map<String, PermissionModel> pluginPermissions;
    @JSONField(name = "jsapiSpConfig")
    private JSONObject specialConfigs;
    @JSONField(name = "validDomain")
    private Set<String> validDomains;
    @JSONField(name = "validSubResMimeList")
    private Set<String> validSubResMimeList;
    @JSONField(name = "webViewConfig")
    private JSONObject webviewConfigs;

    public int describeContents() {
        return 0;
    }

    public static PermissionModel generateFromJSON(byte[] bArr) {
        return generateFromJSON(JSONUtils.parseObject(bArr));
    }

    public static PermissionModel generateFromJSON(String str) {
        return generateFromJSON(JSONUtils.parseObject(str));
    }

    public static PermissionModel generateFromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        PermissionModel permissionModel = new PermissionModel();
        JSONArray jSONArray = JSONUtils.getJSONArray(jSONObject, KEY_VALID_DOMAIN, (JSONArray) null);
        if (jSONArray != null) {
            HashSet hashSet = new HashSet();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                hashSet.add(jSONArray.getString(i));
            }
            permissionModel.setValidDomains(hashSet);
        }
        JSONObject jSONObject2 = JSONUtils.getJSONObject(jSONObject, KEY_JSAPI_SP_CONFIG, (JSONObject) null);
        if (jSONObject2 == null) {
            jSONObject2 = JSONUtils.getJSONObject(jSONObject, KEY_JSAPI_SP_CONFIG_LEGACY, (JSONObject) null);
        }
        if (jSONObject2 != null) {
            permissionModel.setSpecialConfigs(jSONObject2);
        }
        JSONObject jSONObject3 = JSONUtils.getJSONObject(jSONObject, KEY_WEBVIEW_CONFIG, (JSONObject) null);
        if (jSONObject3 == null) {
            jSONObject3 = JSONUtils.getJSONObject(jSONObject, KEY_WEBVIEW_CONFIG_LEGACY, (JSONObject) null);
        }
        if (jSONObject3 != null) {
            permissionModel.setWebviewConfigs(jSONObject3);
        }
        JSONArray jSONArray2 = JSONUtils.getJSONArray(jSONObject, KEY_JSAPI_LIST, (JSONArray) null);
        if (jSONArray2 == null) {
            jSONArray2 = JSONUtils.getJSONArray(jSONObject, KEY_JSAPI_LIST_LEGACY, (JSONArray) null);
        }
        if (jSONArray2 != null) {
            HashSet hashSet2 = new HashSet();
            int size2 = jSONArray2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hashSet2.add(jSONArray2.getString(i2));
            }
            permissionModel.setJsapiList(hashSet2);
        }
        JSONArray jSONArray3 = JSONUtils.getJSONArray(jSONObject, KEY_IGNORE_PERMISSION_CHECK, (JSONArray) null);
        if (jSONArray3 != null) {
            HashSet hashSet3 = new HashSet();
            int size3 = jSONArray3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                hashSet3.add(jSONArray3.getString(i3));
            }
            permissionModel.setIgnorePermissionCheck(hashSet3);
        }
        JSONObject jSONObject4 = JSONUtils.getJSONObject(jSONObject, KEY_NATIVE_API_USER_AUTH, (JSONObject) null);
        if (jSONObject4 != null) {
            permissionModel.setNativeApiUserAuth(jSONObject4);
        }
        JSONObject jSONObject5 = JSONUtils.getJSONObject(jSONObject, KEY_NATIVE_API_SCOPE_CONFIG, (JSONObject) null);
        if (jSONObject5 != null) {
            permissionModel.setNativeApiScopeConfig(jSONObject5);
        }
        JSONArray jSONArray4 = JSONUtils.getJSONArray(jSONObject, KEY_EVENT_LIST, (JSONArray) null);
        if (jSONArray4 == null) {
            jSONArray4 = JSONUtils.getJSONArray(jSONObject, KEY_EVENT_LIST_LEGACY, (JSONArray) null);
        }
        if (jSONArray4 != null) {
            HashSet hashSet4 = new HashSet();
            int size4 = jSONArray4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                hashSet4.add(jSONArray4.getString(i4));
            }
            permissionModel.setEventList(hashSet4);
        }
        String string = JSONUtils.getString(jSONObject, "enableProxy", (String) null);
        if (string == null) {
            string = JSONUtils.getString(jSONObject, KEY_ENABLE_PROXY_LEGACY, (String) null);
        }
        if (string != null) {
            permissionModel.setEnableProxy(string);
        }
        JSONArray jSONArray5 = JSONUtils.getJSONArray(jSONObject, KEY_SUB_RES_MIME_LIST, (JSONArray) null);
        if (jSONArray5 == null) {
            jSONArray5 = JSONUtils.getJSONArray(jSONObject, KEY_SUB_RES_MIME_LIST_LEGACY, (JSONArray) null);
        }
        if (jSONArray5 != null) {
            HashSet hashSet5 = new HashSet();
            int size5 = jSONArray5.size();
            for (int i5 = 0; i5 < size5; i5++) {
                hashSet5.add(jSONArray5.getString(i5));
            }
            permissionModel.setValidSubResMimeList(hashSet5);
        }
        JSONArray jSONArray6 = JSONUtils.getJSONArray(jSONObject, KEY_HTTP_RES_MIME_LIST, (JSONArray) null);
        if (jSONArray6 == null) {
            jSONArray6 = JSONUtils.getJSONArray(jSONObject, KEY_HTTP_RES_MIME_LIST_LEGACY, (JSONArray) null);
        }
        if (jSONArray6 != null) {
            HashSet hashSet6 = new HashSet();
            int size6 = jSONArray6.size();
            for (int i6 = 0; i6 < size6; i6++) {
                hashSet6.add(jSONArray6.getString(i6));
            }
            permissionModel.setHttpLinkSubResMimeList(hashSet6);
        }
        String string2 = JSONUtils.getString(jSONObject, KEY_FORCE_USE_SSL, (String) null);
        if (string2 == null) {
            string2 = JSONUtils.getString(jSONObject, KEY_FORCE_USE_SSL_LEGACY, (String) null);
        }
        if (string2 != null) {
            permissionModel.setForceUseSsl(string2);
        }
        return permissionModel;
    }

    public PermissionModel() {
    }

    protected PermissionModel(Parcel parcel) {
        HashSet hashSet = new HashSet();
        this.validDomains = hashSet;
        readToArray(hashSet, parcel);
        this.specialConfigs = (JSONObject) parcel.readSerializable();
        this.webviewConfigs = (JSONObject) parcel.readSerializable();
        HashSet hashSet2 = new HashSet();
        this.jsapiList = hashSet2;
        readToArray(hashSet2, parcel);
        HashSet hashSet3 = new HashSet();
        this.ignorePermissionCheck = hashSet3;
        readToArray(hashSet3, parcel);
        this.nativeApiUserAuth = (JSONObject) parcel.readSerializable();
        this.nativeApiScopeConfig = (JSONObject) parcel.readSerializable();
        HashSet hashSet4 = new HashSet();
        this.validSubResMimeList = hashSet4;
        readToArray(hashSet4, parcel);
        this.enableProxy = parcel.readString();
        HashSet hashSet5 = new HashSet();
        this.httpLinkSubResMimeList = hashSet5;
        readToArray(hashSet5, parcel);
        HashSet hashSet6 = new HashSet();
        this.eventList = hashSet6;
        readToArray(hashSet6, parcel);
        this.forceUseSsl = parcel.readString();
        this.pluginPermissions = new HashMap();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(PermissionModel.class.getClassLoader());
            for (int i = 0; i < readInt; i++) {
                if (readParcelableArray[i] instanceof PermissionModel) {
                    this.pluginPermissions.put(strArr[i], (PermissionModel) readParcelableArray[i]);
                }
            }
        }
    }

    private void readToArray(Set<String> set, Parcel parcel) {
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        if (z) {
            for (Object obj : parcel.readArray(PermissionModel.class.getClassLoader())) {
                set.add((String) obj);
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (this.validDomains != null ? 1 : 0));
        Set<String> set = this.validDomains;
        if (set != null) {
            parcel.writeArray(set.toArray());
        }
        parcel.writeSerializable(this.specialConfigs);
        parcel.writeSerializable(this.webviewConfigs);
        parcel.writeByte((byte) (this.jsapiList != null ? 1 : 0));
        Set<String> set2 = this.jsapiList;
        if (set2 != null) {
            parcel.writeArray(set2.toArray());
        }
        parcel.writeByte((byte) (this.ignorePermissionCheck != null ? 1 : 0));
        Set<String> set3 = this.ignorePermissionCheck;
        if (set3 != null) {
            parcel.writeArray(set3.toArray());
        }
        parcel.writeSerializable(this.nativeApiUserAuth);
        parcel.writeSerializable(this.nativeApiScopeConfig);
        parcel.writeByte((byte) (this.validSubResMimeList != null ? 1 : 0));
        Set<String> set4 = this.validSubResMimeList;
        if (set4 != null) {
            parcel.writeArray(set4.toArray());
        }
        parcel.writeString(this.enableProxy);
        parcel.writeByte((byte) (this.httpLinkSubResMimeList != null ? 1 : 0));
        Set<String> set5 = this.httpLinkSubResMimeList;
        if (set5 != null) {
            parcel.writeArray(set5.toArray());
        }
        parcel.writeByte((byte) (this.eventList != null ? 1 : 0));
        Set<String> set6 = this.eventList;
        if (set6 != null) {
            parcel.writeArray(set6.toArray());
        }
        parcel.writeString(this.forceUseSsl);
        Map<String, PermissionModel> map = this.pluginPermissions;
        int size = map == null ? 0 : map.size();
        parcel.writeInt(size);
        if (size > 0) {
            String[] strArr = new String[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            int i2 = 0;
            for (Map.Entry next : this.pluginPermissions.entrySet()) {
                strArr[i2] = (String) next.getKey();
                parcelableArr[i2] = (Parcelable) next.getValue();
                i2++;
            }
            parcel.writeStringArray(strArr);
            parcel.writeParcelableArray(parcelableArr, 0);
        }
    }

    public Set<String> getValidDomains() {
        return this.validDomains;
    }

    public void setValidDomains(Set<String> set) {
        this.validDomains = set;
    }

    public JSONObject getSpecialConfigs() {
        return this.specialConfigs;
    }

    public void setSpecialConfigs(JSONObject jSONObject) {
        this.specialConfigs = jSONObject;
    }

    public JSONObject getWebviewConfigs() {
        return this.webviewConfigs;
    }

    public void setWebviewConfigs(JSONObject jSONObject) {
        this.webviewConfigs = jSONObject;
    }

    public Set<String> getJsapiList() {
        return this.jsapiList;
    }

    public void setJsapiList(Set<String> set) {
        this.jsapiList = set;
    }

    public JSONObject getNativeApiUserAuth() {
        return this.nativeApiUserAuth;
    }

    public void setNativeApiUserAuth(JSONObject jSONObject) {
        this.nativeApiUserAuth = jSONObject;
    }

    public JSONObject getNativeApiScopeConfig() {
        return this.nativeApiScopeConfig;
    }

    public void setNativeApiScopeConfig(JSONObject jSONObject) {
        this.nativeApiScopeConfig = jSONObject;
    }

    public Set<String> getValidSubResMimeList() {
        return this.validSubResMimeList;
    }

    public void setValidSubResMimeList(Set<String> set) {
        this.validSubResMimeList = set;
    }

    public Set<String> getHttpLinkSubResMimeList() {
        return this.httpLinkSubResMimeList;
    }

    public void setHttpLinkSubResMimeList(Set<String> set) {
        this.httpLinkSubResMimeList = set;
    }

    public String getEnableProxy() {
        return this.enableProxy;
    }

    public void setEnableProxy(String str) {
        this.enableProxy = str;
    }

    public Set<String> getEventList() {
        return this.eventList;
    }

    public void setEventList(Set<String> set) {
        this.eventList = set;
    }

    public String getForceUseSsl() {
        return this.forceUseSsl;
    }

    public void setForceUseSsl(String str) {
        this.forceUseSsl = str;
    }

    public Set<String> getIgnorePermissionCheck() {
        return this.ignorePermissionCheck;
    }

    public void setIgnorePermissionCheck(Set<String> set) {
        this.ignorePermissionCheck = set;
    }

    @JSONField(deserialize = false, serialize = false)
    public Map<String, PermissionModel> getPluginPermissions() {
        return this.pluginPermissions;
    }

    @JSONField(deserialize = false, serialize = false)
    public void setPluginPermissions(Map<String, PermissionModel> map) {
        this.pluginPermissions = map;
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder("PermissionModel{validDomains=");
        sb.append(this.validDomains);
        sb.append(", specialConfigs=");
        sb.append(this.specialConfigs);
        sb.append(", webviewConfigs=");
        sb.append(this.webviewConfigs);
        sb.append(", jsapiList=$list(");
        Set<String> set = this.jsapiList;
        if (set == null) {
            i = 0;
        } else {
            i = set.size();
        }
        sb.append(i);
        sb.append("), ignorePermissionCheck=");
        sb.append(this.ignorePermissionCheck);
        sb.append(", nativeApiUserAuth=");
        sb.append(this.nativeApiUserAuth);
        sb.append(", nativeApiScopeConfig=");
        sb.append(this.nativeApiScopeConfig);
        sb.append(", validSubResMimeList=");
        sb.append(this.validSubResMimeList);
        sb.append(", httpLinkSubResMimeList=");
        sb.append(this.httpLinkSubResMimeList);
        sb.append(", enableProxy='");
        sb.append(this.enableProxy);
        sb.append('\'');
        sb.append(", eventList=");
        sb.append(this.eventList);
        sb.append(", forceUseSsl=");
        sb.append(this.forceUseSsl);
        sb.append('}');
        return sb.toString();
    }
}
