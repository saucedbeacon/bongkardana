package com.iap.ac.android.acs.plugin.downgrade.router;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.ActionExecutor;
import com.iap.ac.android.acs.plugin.downgrade.amcs.NavigateSceneConfigManager;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.acs.plugin.utils.AclAPIContextUtils;
import com.iap.ac.android.biz.common.callback.OpenBizSceneCallback;
import com.iap.ac.android.biz.common.model.acl.AclAPIContext;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.common.log.ACLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class BizSceneNavigateManager {
    public static final String KEY_ALL = "all";
    public static final String KEY_DEFAULT = "default";
    private static final String LOGGER_KEY_FAILED = "failed";
    private static final String LOGGER_KEY_FROM_ALL = "fromAll";
    private static final String LOGGER_KEY_FROM_APPID = "fromAppId";
    private static final String LOGGER_KEY_FROM_COMMON = "fromCommon";
    private static final String LOGGER_KEY_FROM_DEFAULT = "fromDefault";
    private static final String LOGGER_KEY_FROM_REMOTE = "fromRemote";
    private static final String LOGGER_KEY_FROM_SPI = "fromSPI";
    private static final String LOGGER_KEY_FROM_WALLET = "fromWallet";
    private static final String SCENE_SCHEME_PRESET_PATH_IN_COMMON;
    private static final String SCENE_SCHEME_PRESET_PATH_IN_WALLET;
    /* access modifiers changed from: private */
    public static final String TAG = ApiDowngradeUtils.logTag("BizSceneNavigateManager");
    private static BizSceneNavigateManager sInstance;
    /* access modifiers changed from: private */
    public String JSON_KEY_DOWNGRADED = "downgraded";
    private String JSON_KEY_PARAM = "param";

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(ApiDowngradeUtils.dirInAssets());
        sb.append("scene_scheme_map.json");
        SCENE_SCHEME_PRESET_PATH_IN_WALLET = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ApiDowngradeUtils.dirInAssets());
        sb2.append("scene_scheme_map_in_common.json");
        SCENE_SCHEME_PRESET_PATH_IN_COMMON = sb2.toString();
    }

    public static BizSceneNavigateManager getInstance() {
        if (sInstance == null) {
            synchronized (BizSceneNavigateManager.class) {
                if (sInstance == null) {
                    sInstance = new BizSceneNavigateManager();
                }
            }
        }
        return sInstance;
    }

    private BizSceneNavigateManager() {
    }

    public void navigate(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull String str, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        String str2 = iAPConnectPluginContext.miniProgramAppID;
        JSONObject jSONObject = iAPConnectPluginContext.jsParameters;
        String str3 = TAG;
        StringBuilder sb = new StringBuilder("navigate() appId: ");
        sb.append(str2);
        sb.append(", sceneCode: ");
        sb.append(str);
        sb.append(", params: ");
        sb.append(jSONObject);
        ACLog.d(str3, sb.toString());
        if (TextUtils.isEmpty(str2)) {
            String concat = "the appId is empty when navigate to sceneCode: ".concat(String.valueOf(str));
            onHandleActionFailed(iActionHandlerCallback, concat);
            ACLog.e(TAG, concat);
            ApiDowngradeLogger.logException(ApiDowngradeLogger.EVENT_JSAPI_DOWNGRADE_APPID_IS_NULL, concat);
        } else if (!handleBeforeAction(iAPConnectPluginContext, NavigateSceneConfigManager.getInstance().getBeforeAction(), str, iActionHandlerCallback)) {
            ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_MAP_START, str2, str).addParams(ApiDowngradeLogger.EXT_KEY_EXT_PARAMS, (Object) jSONObject).event();
            handleSceneNavigateAndFailure(iAPConnectPluginContext, NavigateSceneConfigManager.getInstance().getSceneSchemeMap(), str, iActionHandlerCallback);
        }
    }

    private boolean handleBeforeAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @Nullable JSONObject jSONObject, @NonNull String str, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        String str2;
        JSONObject optJSONObject;
        ACLog.d(TAG, "handleBeforeNavigate() start beforeActionConfig: ".concat(String.valueOf(jSONObject)));
        if (jSONObject == null) {
            ACLog.d(TAG, "handleBeforeNavigate() canceled for the beforeActionConfig is null");
            return false;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject(iAPConnectPluginContext.miniProgramAppID);
        JSONObject jSONObject2 = null;
        if (optJSONObject2 != null) {
            jSONObject2 = optJSONObject2.optJSONObject(str);
            str2 = LOGGER_KEY_FROM_APPID;
        } else {
            str2 = null;
        }
        if (jSONObject2 == null && (optJSONObject = jSONObject.optJSONObject("default")) != null) {
            jSONObject2 = optJSONObject.optJSONObject(str);
            str2 = LOGGER_KEY_FROM_DEFAULT;
        }
        if (jSONObject2 == null) {
            String str3 = TAG;
            StringBuilder sb = new StringBuilder("handleBeforeNavigate() canceled for the beforeActionConfig in sceneCode: ");
            sb.append(str);
            sb.append(" is null");
            ACLog.d(str3, sb.toString());
            return false;
        }
        onHandleActionSuccess(iAPConnectPluginContext, jSONObject2, iActionHandlerCallback);
        ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_DOWNGRADE_BEFORE, iAPConnectPluginContext.miniProgramAppID, str).addParams(ApiDowngradeLogger.EXT_KEY_DOWNGRADE_TYPE, str2).addParams(ApiDowngradeLogger.EXT_KEY_EXT_PARAMS, (Object) iAPConnectPluginContext.jsParameters).event();
        ACLog.d(TAG, "handleBeforeNavigate() success, returns true to consume the action.");
        return true;
    }

    /* access modifiers changed from: private */
    public void handleFailureAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull String str, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        String str2;
        JSONObject optJSONObject;
        JSONObject failureAction = NavigateSceneConfigManager.getInstance().getFailureAction();
        ACLog.d(TAG, "handleFailureNavigate() start, failure config: ".concat(String.valueOf(failureAction)));
        String str3 = "failed";
        if (failureAction != null) {
            JSONObject optJSONObject2 = failureAction.optJSONObject(iAPConnectPluginContext.miniProgramAppID);
            JSONObject jSONObject = null;
            if (optJSONObject2 != null) {
                jSONObject = optJSONObject2.optJSONObject(str);
                str2 = LOGGER_KEY_FROM_APPID;
            } else {
                str2 = null;
            }
            if (jSONObject == null && (optJSONObject = failureAction.optJSONObject("default")) != null) {
                jSONObject = optJSONObject.optJSONObject(str);
                str2 = LOGGER_KEY_FROM_DEFAULT;
            }
            if (jSONObject == null) {
                jSONObject = failureAction.optJSONObject("all");
                if (jSONObject != null) {
                    str3 = LOGGER_KEY_FROM_ALL;
                }
            } else {
                str3 = str2;
            }
            if (jSONObject != null) {
                onHandleActionSuccess(iAPConnectPluginContext, jSONObject, iActionHandlerCallback);
            } else {
                onHandleActionFailed(iActionHandlerCallback, "failure action is null in sceneCode:".concat(String.valueOf(str)));
            }
        } else {
            callbackWithError(iActionHandlerCallback, "handleFailureNavigate() the failureActionConfig is null");
            ACLog.e(TAG, "handleFailureNavigate() the failureActionConfig is null");
        }
        ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_DOWNGRADE_AFTER, iAPConnectPluginContext.miniProgramAppID, str).addParams(ApiDowngradeLogger.EXT_KEY_DOWNGRADE_TYPE, str3).addParams(ApiDowngradeLogger.EXT_KEY_EXT_PARAMS, (Object) iAPConnectPluginContext.jsParameters).event();
    }

    /* access modifiers changed from: protected */
    public void onHandleActionSuccess(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull final IActionHandlerCallback iActionHandlerCallback) {
        ActionExecutor.getInstance().handleAction(iAPConnectPluginContext, jSONObject, new IActionHandlerCallback() {
            public void onHandleSuccess(@NonNull JSONObject jSONObject) {
                ACLog.d(BizSceneNavigateManager.TAG, "onHandleActionSuccess() on ActionExecutor#handleAction onHandleSuccess() response: ".concat(String.valueOf(jSONObject)));
                try {
                    jSONObject.put(BizSceneNavigateManager.this.JSON_KEY_DOWNGRADED, true);
                } catch (JSONException e) {
                    ACLog.w(BizSceneNavigateManager.TAG, "onHandleActionSuccess() on ActionExecutor#handleAction onHandleSuccess() put value error: ".concat(String.valueOf(e)));
                }
                iActionHandlerCallback.onHandleSuccess(jSONObject);
            }

            public void onHandleFailure(@NonNull JSONObject jSONObject) {
                ACLog.d(BizSceneNavigateManager.TAG, "onHandleActionSuccess() on ActionExecutor#handleAction onHandleFailure() response: ".concat(String.valueOf(jSONObject)));
                try {
                    jSONObject.put(BizSceneNavigateManager.this.JSON_KEY_DOWNGRADED, true);
                } catch (JSONException e) {
                    ACLog.w(BizSceneNavigateManager.TAG, "onHandleActionSuccess() on ActionExecutor#handleAction onHandleFailure() put value error: ".concat(String.valueOf(e)));
                }
                iActionHandlerCallback.onHandleSuccess(jSONObject);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onHandleActionFailed(@NonNull IActionHandlerCallback iActionHandlerCallback, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(this.JSON_KEY_DOWNGRADED, false);
            jSONObject.put("errorMessage", str);
        } catch (JSONException e) {
            ACLog.e(TAG, "handleBeforeNavigate() onHandleFailure() put value error: ".concat(String.valueOf(e)));
        }
        iActionHandlerCallback.onHandleFailure(jSONObject);
    }

    private void handleSceneNavigateAndFailure(@NonNull final IAPConnectPluginContext iAPConnectPluginContext, @Nullable JSONObject jSONObject, @NonNull final String str, @NonNull final IActionHandlerCallback iActionHandlerCallback) {
        String str2;
        JSONObject readJSONFromAssets;
        JSONObject readJSONFromAssets2;
        ACLog.d(TAG, "handleSceneNavigateAndFailure() start sceneAction: ".concat(String.valueOf(jSONObject)));
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            jSONObject2 = jSONObject.optJSONObject(str);
            str2 = LOGGER_KEY_FROM_REMOTE;
        } else {
            str2 = null;
        }
        if (jSONObject2 == null && (readJSONFromAssets2 = ApiDowngradeUtils.readJSONFromAssets(iAPConnectPluginContext.getContext(), SCENE_SCHEME_PRESET_PATH_IN_WALLET)) != null) {
            jSONObject2 = readJSONFromAssets2.optJSONObject(str);
            str2 = LOGGER_KEY_FROM_WALLET;
        }
        if (jSONObject2 == null && (readJSONFromAssets = ApiDowngradeUtils.readJSONFromAssets(iAPConnectPluginContext.getContext(), SCENE_SCHEME_PRESET_PATH_IN_COMMON)) != null) {
            jSONObject2 = readJSONFromAssets.optJSONObject(str);
            str2 = LOGGER_KEY_FROM_COMMON;
        }
        final String str3 = str2;
        if (jSONObject2 != null) {
            String str4 = TAG;
            StringBuilder sb = new StringBuilder("handleSceneNavigateAndFailure() start handleAction by ActionExecutor#handleAction(), sceneCode: ");
            sb.append(str);
            sb.append(", sceneAction: ");
            sb.append(jSONObject2);
            ACLog.d(str4, sb.toString());
            final IAPConnectPluginContext iAPConnectPluginContext2 = iAPConnectPluginContext;
            final String str5 = str;
            final IActionHandlerCallback iActionHandlerCallback2 = iActionHandlerCallback;
            ActionExecutor.getInstance().handleAction(iAPConnectPluginContext, jSONObject2, new IActionHandlerCallback() {
                public void onHandleSuccess(@NonNull JSONObject jSONObject) {
                    ACLog.d(BizSceneNavigateManager.TAG, "handleSceneNavigateAndFailure() handleAction by ActionExecutor#handleAction(), onHandleSuccess() response: ".concat(String.valueOf(jSONObject)));
                    ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_MAP_SUCCESS, iAPConnectPluginContext2.miniProgramAppID, str5).addParams(ApiDowngradeLogger.EXT_KEY_NAVIGATE_TYPE, str3).event();
                    iActionHandlerCallback2.onHandleSuccess(jSONObject);
                }

                public void onHandleFailure(@NonNull JSONObject jSONObject) {
                    ACLog.d(BizSceneNavigateManager.TAG, "handleSceneNavigateAndFailure() handleAction by ActionExecutor#handleAction(), onHandleFailure() response: ".concat(String.valueOf(jSONObject)));
                    ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_MAP_FAILURE, iAPConnectPluginContext2.miniProgramAppID, str5).addParams(ApiDowngradeLogger.EXT_KEY_NAVIGATE_TYPE, str3).event();
                    iActionHandlerCallback2.onHandleFailure(jSONObject);
                }
            });
            return;
        }
        Map<String, String> parseJSONParamsToMap = ApiDowngradeUtils.parseJSONParamsToMap(iAPConnectPluginContext.jsParameters.optJSONObject(this.JSON_KEY_PARAM));
        AclAPIContext createAclAPIContext = AclAPIContextUtils.createAclAPIContext(iAPConnectPluginContext);
        try {
            ACLog.d(TAG, String.format("before SPIManager#openBizScene, sceneCode: %s, jsParameters: %s", new Object[]{str, iAPConnectPluginContext.jsParameters}));
            SPIManager.getInstance().openBizScene(str, parseJSONParamsToMap, createAclAPIContext, new OpenBizSceneCallback() {
                public void sendJSONResponse(@NonNull JSONObject jSONObject) {
                    ACLog.d(BizSceneNavigateManager.TAG, String.format("after SPIManager#openBizScene, sceneCode: %s, result: %s", new Object[]{str, jSONObject}));
                    if (jSONObject.optBoolean("success", false)) {
                        ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_MAP_SUCCESS, iAPConnectPluginContext.miniProgramAppID, str).addParams(ApiDowngradeLogger.EXT_KEY_NAVIGATE_TYPE, BizSceneNavigateManager.LOGGER_KEY_FROM_SPI).event();
                        iActionHandlerCallback.onHandleSuccess(jSONObject);
                        return;
                    }
                    ACLog.e(BizSceneNavigateManager.TAG, "handle scene navigate failed, start handle by failure action.");
                    ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_MAP_FAILURE, iAPConnectPluginContext.miniProgramAppID, str).addParams("error", (Object) Integer.valueOf(ApiDowngradeConstant.Error.ERR_DEF_CODE)).addParams("errorMessage", "handle scene navigate failed, start handle by failure action.").event();
                    BizSceneNavigateManager.this.handleFailureAction(iAPConnectPluginContext, str, iActionHandlerCallback);
                }
            });
        } catch (Exception e) {
            handleFailureAction(iAPConnectPluginContext, str, iActionHandlerCallback);
            ACLog.e(TAG, "handleSceneNavigateAndFailure() failed with exception :".concat(String.valueOf(e)));
        }
    }

    private void callbackWithError(@NonNull IActionHandlerCallback iActionHandlerCallback, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error", ApiDowngradeConstant.Error.ERR_DEF_CODE);
            jSONObject.put("errorMessage", str);
        } catch (JSONException e) {
            ACLog.e(TAG, "callbackWithError() error: ".concat(String.valueOf(e)));
        }
        iActionHandlerCallback.onHandleFailure(jSONObject);
    }
}
