package com.alibaba.griver.core.jsapi.device.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.remotedebug.utils.RemoteDebugMessageUtils;
import com.alibaba.ariver.remotedebug.utils.RemoteDebugUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.security.GriverSecurityManager;
import com.alibaba.griver.base.common.utils.AppTypeUtils;
import com.alibaba.griver.base.common.utils.MD5Util;
import com.alibaba.griver.core.R;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getTabbarModel;

@Keep
public class StorageBridgeExtension implements BridgeExtension {
    private static final long AR_LOCAL_STORAGE_LIMIT = 10485760;
    private static final int EXCEPTION_KEY_NOT_EXIST = 11;
    private static final int EXCEPTION_MAXIMUM_LIMIT = 12;
    private static final int EXCEPTION_PARAM_EMPTY = 2;
    private static final int EXCEPTION_SINGLE_LENGTH = 14;
    private static final int EXCEPTION_STORAGE = 13;
    private static final long SINGLE_STORAGE_LIMIT = 204800;
    private static final String TAG = "StorageBridgeExtension";

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @Nullable
    private static SharedPreferences getSharedPreferenceForApp(Context context, Page page, String str) {
        String appId = (page == null || page.getApp() == null) ? "" : page.getApp().getAppId();
        if (AppTypeUtils.isEmbedPage(page)) {
            StringBuilder sb = new StringBuilder();
            sb.append(appId);
            sb.append("_web-view");
            appId = sb.toString();
        }
        if (str != null && str.contains("/")) {
            str = MD5Util.getMD5String(str);
        }
        if (context == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("rv_local_storage_");
        sb2.append(appId);
        sb2.append("_");
        sb2.append(str);
        return context.getSharedPreferences(sb2.toString(), 4);
    }

    @Nullable
    private static JSONObject getSharedPreferenceInfo(Context context, Page page) {
        SharedPreferences sharedPreferenceForApp = getSharedPreferenceForApp(context, page, GriverAccount.getUserId());
        if (sharedPreferenceForApp == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Map<String, ?> all = sharedPreferenceForApp.getAll();
        double totalSize = (double) getTotalSize(sharedPreferenceForApp);
        jSONObject.put("keys", (Object) all.keySet());
        Double.isNaN(totalSize);
        jSONObject.put("currentSize", (Object) Double.valueOf(totalSize / 1024.0d));
        jSONObject.put("limitSize", (Object) 10240L);
        return jSONObject;
    }

    private static long getTotalSize(SharedPreferences sharedPreferences) {
        long j = 0;
        if (sharedPreferences == null) {
            return 0;
        }
        for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
            int i = 0;
            try {
                i = 0 + ((String) next.getValue()).getBytes(getTabbarModel.ENC).length;
                i += ((String) next.getKey()).getBytes(getTabbarModel.ENC).length;
            } catch (UnsupportedEncodingException unused) {
            }
            j += (long) i;
        }
        return j;
    }

    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public synchronized void setTinyLocalStorage(@BindingNode(Page.class) Page page, @BindingParam(name = {"key"}) String str, @BindingParam(name = {"data"}) Object obj, @BindingCallback BridgeCallback bridgeCallback) {
        Page page2 = page;
        String str2 = str;
        Object obj2 = obj;
        BridgeCallback bridgeCallback2 = bridgeCallback;
        synchronized (this) {
            Context applicationContext = page.getApp().getAppContext().getContext().getApplicationContext();
            SharedPreferences sharedPreferenceForApp = getSharedPreferenceForApp(applicationContext, page2, GriverAccount.getUserId());
            if (sharedPreferenceForApp == null) {
                bridgeCallback2.sendBridgeResponse(new BridgeResponse.Error(13, applicationContext.getString(R.string.griver_core_storage_exception)));
            } else if (TextUtils.isEmpty(str)) {
                bridgeCallback2.sendBridgeResponse(new BridgeResponse.Error(2, applicationContext.getString(R.string.griver_core_required_key_empty)));
            } else {
                String str3 = null;
                if (obj2 instanceof String) {
                    str3 = (String) obj2;
                } else if (obj2 instanceof JSONObject) {
                    str3 = ((JSONObject) obj2).toJSONString();
                }
                if (!TextUtils.isEmpty(str3)) {
                    if (str3 != null) {
                        if (((long) str3.length()) > SINGLE_STORAGE_LIMIT) {
                            StringBuilder sb = new StringBuilder("current length: ");
                            sb.append(str3.getBytes().length);
                            GriverLogger.w(TAG, sb.toString());
                            bridgeCallback2.sendBridgeResponse(BridgeResponse.newError(14, applicationContext.getString(R.string.griver_core_data_exceeds_200)));
                            return;
                        }
                        long totalSize = getTotalSize(sharedPreferenceForApp);
                        long length = (long) (str.getBytes().length + str3.getBytes().length);
                        if (sharedPreferenceForApp.contains(str2)) {
                            if ((totalSize - ((long) (str.getBytes().length + sharedPreferenceForApp.getString(str2, "").getBytes().length))) + length > AR_LOCAL_STORAGE_LIMIT) {
                                bridgeCallback2.sendBridgeResponse(BridgeResponse.newError(12, applicationContext.getString(R.string.griver_core_set_stroage_exceed_limit)));
                                return;
                            }
                        } else if (totalSize + length > AR_LOCAL_STORAGE_LIMIT) {
                            bridgeCallback2.sendBridgeResponse(BridgeResponse.newError(12, applicationContext.getString(R.string.griver_core_set_stroage_exceed_limit)));
                            return;
                        }
                        try {
                            String encrypt = GriverSecurityManager.encrypt(str3);
                            if (encrypt == null) {
                                bridgeCallback2.sendBridgeResponse(new BridgeResponse.Error(13, applicationContext.getString(R.string.griver_core_storage_exception)));
                                return;
                            }
                            sharedPreferenceForApp.edit().putString(str2, encrypt).commit();
                            sendStorageToRemote(page2, sharedPreferenceForApp);
                            bridgeCallback2.sendBridgeResponse(BridgeResponse.SUCCESS);
                            return;
                        } catch (Exception e) {
                            GriverLogger.e(TAG, "encrypt exception", e);
                            bridgeCallback2.sendBridgeResponse(new BridgeResponse.Error(13, applicationContext.getString(R.string.griver_core_storage_exception)));
                            return;
                        }
                    }
                }
                bridgeCallback2.sendBridgeResponse(new BridgeResponse.Error(2, applicationContext.getString(R.string.griver_core_required_key_empty)));
            }
        }
    }

    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public synchronized void getTinyLocalStorage(@BindingNode(Page.class) Page page, @BindingParam(name = {"key"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = page.getApp().getAppContext().getContext().getApplicationContext();
        SharedPreferences sharedPreferenceForApp = getSharedPreferenceForApp(applicationContext, page, GriverAccount.getUserId());
        if (sharedPreferenceForApp == null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(13, applicationContext.getString(R.string.griver_core_storage_exception)));
        } else if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, applicationContext.getString(R.string.griver_core_required_key_empty)));
        } else if (sharedPreferenceForApp.contains(str)) {
            try {
                String decrypt = GriverSecurityManager.decrypt(sharedPreferenceForApp.getString(str, ""));
                if (decrypt == null) {
                    bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, applicationContext.getString(R.string.griver_core_no_such_key)));
                    return;
                }
                jSONObject.put("data", (Object) decrypt);
                bridgeCallback.sendJSONResponse(jSONObject);
            } catch (Exception e) {
                GriverLogger.e(TAG, "decrypt exception", e);
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(13, applicationContext.getString(R.string.griver_core_storage_exception)));
            }
        } else {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, applicationContext.getString(R.string.griver_core_no_such_key)));
        }
    }

    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public synchronized void removeTinyLocalStorage(@BindingNode(Page.class) Page page, @BindingParam(name = {"key"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        Context applicationContext = page.getApp().getAppContext().getContext().getApplicationContext();
        SharedPreferences sharedPreferenceForApp = getSharedPreferenceForApp(applicationContext, page, GriverAccount.getUserId());
        if (sharedPreferenceForApp == null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(13, applicationContext.getString(R.string.griver_core_storage_exception)));
        } else if (!TextUtils.isEmpty(str)) {
            sharedPreferenceForApp.edit().remove(str).commit();
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            sendStorageToRemote(page, sharedPreferenceForApp);
        } else {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, applicationContext.getString(R.string.griver_core_required_key_empty)));
        }
    }

    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public synchronized void clearTinyLocalStorage(@BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback) {
        Context applicationContext = page.getApp().getAppContext().getContext().getApplicationContext();
        SharedPreferences sharedPreferenceForApp = getSharedPreferenceForApp(applicationContext, page, GriverAccount.getUserId());
        if (sharedPreferenceForApp != null) {
            sharedPreferenceForApp.edit().clear().commit();
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            sendStorageToRemote(page, sharedPreferenceForApp);
            return;
        }
        bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(13, applicationContext.getString(R.string.griver_core_storage_exception)));
    }

    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public synchronized void getTinyLocalStorageInfo(@BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback) {
        Context applicationContext = page.getApp().getAppContext().getContext().getApplicationContext();
        JSONObject sharedPreferenceInfo = getSharedPreferenceInfo(applicationContext, page);
        if (sharedPreferenceInfo != null) {
            bridgeCallback.sendJSONResponse(sharedPreferenceInfo);
        } else {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(13, applicationContext.getString(R.string.griver_core_storage_exception)));
        }
    }

    public void sendStorageToRemote(Page page, SharedPreferences sharedPreferences) {
        if (RemoteDebugUtils.isRemoteDebugMode(page.getStartParams()) && RemoteDebugUtils.supportRemoteDebugMode(page.getApp().getAppId())) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (sharedPreferences.getAll() != null && sharedPreferences.getAll().size() > 0) {
                for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                    try {
                        String decrypt = GriverSecurityManager.decrypt(String.valueOf(next.getValue()));
                        if (decrypt != null) {
                            linkedHashMap.put(next.getKey(), decrypt);
                        }
                    } catch (Exception e) {
                        GriverLogger.e(TAG, "decrypt exception", e);
                    }
                }
            }
            RemoteDebugMessageUtils.sendStorage(page, linkedHashMap);
        }
    }
}
