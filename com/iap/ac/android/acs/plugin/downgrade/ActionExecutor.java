package com.iap.ac.android.acs.plugin.downgrade;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.AlertActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.BaseActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.CallbackResultActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.ConfirmActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.ErrorPageActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.MiniProgramActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.NavigateSceneActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.NoneActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.RedirectActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.SchemeActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.ToastActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.common.log.ACLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class ActionExecutor {
    private static final String TAG = ApiDowngradeUtils.logTag("ActionExecutor");
    private static ActionExecutor sInstance;
    private final Map<String, BaseActionHandler> mActionHandlers = new ConcurrentHashMap();

    public static ActionExecutor getInstance() {
        if (sInstance == null) {
            synchronized (ActionExecutor.class) {
                if (sInstance == null) {
                    sInstance = new ActionExecutor();
                }
            }
        }
        return sInstance;
    }

    private ActionExecutor() {
        registerActionHandlers();
    }

    private void registerActionHandlers() {
        BaseActionHandler[] baseActionHandlerArr = {new AlertActionHandler(), new CallbackResultActionHandler(), new ConfirmActionHandler(), new ErrorPageActionHandler(), new MiniProgramActionHandler(), new NavigateSceneActionHandler(), new NoneActionHandler(), new RedirectActionHandler(), new SchemeActionHandler(), new ToastActionHandler()};
        for (int i = 0; i < 10; i++) {
            registerActionHandler(baseActionHandlerArr[i]);
        }
    }

    public synchronized boolean handleAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("handleAction() start. appId: ");
        sb.append(iAPConnectPluginContext.miniProgramAppID);
        sb.append(" config: ");
        sb.append(jSONObject);
        sb.append(", params: ");
        sb.append(iAPConnectPluginContext.jsParameters);
        ACLog.d(str, sb.toString());
        if (!ApiDowngradeUtils.isApiDowngradeEnabled()) {
            ACLog.w(TAG, "handleAction(), ".concat("cancel apidowngrade, for it is not enabled"));
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("error", ApiDowngradeConstant.Error.ERR_DEF_CODE);
                jSONObject2.put("errorMessage", "cancel apidowngrade, for it is not enabled");
                iActionHandlerCallback.onHandleFailure(jSONObject2);
            } catch (JSONException e) {
                ACLog.w(TAG, "handleAction(), json error: ".concat(String.valueOf(e)));
            }
        } else if (UIUtils.isActivityDisabled(iAPConnectPluginContext.getActivity())) {
            ACLog.w(TAG, "handleAction(), ".concat("cancel apidowngrade, for the activity is null or disabled"));
            return false;
        } else {
            String optString = jSONObject.optString("actionType");
            if (TextUtils.isEmpty(optString)) {
                optString = "none";
            }
            IActionHandler iActionHandler = this.mActionHandlers.get(optString);
            if (iActionHandler == null) {
                String concat = "apidowngrade failed, can't find the actionHandler in actionType: ".concat(String.valueOf(optString));
                ACLog.w(TAG, "handleAction(), ".concat(String.valueOf(concat)));
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("error", ApiDowngradeConstant.Error.ERR_DEF_CODE);
                    jSONObject3.put("errorMessage", concat);
                } catch (JSONException e2) {
                    ACLog.w(TAG, "handleAction(), json error: ".concat(String.valueOf(e2)));
                }
                iActionHandlerCallback.onHandleFailure(jSONObject3);
                return false;
            }
            ACLog.d(TAG, String.format("handleAction(), find actionHandler: %s, config: %s, jsParameters: %s", new Object[]{iActionHandler.getClass().getSimpleName(), jSONObject, iAPConnectPluginContext.jsParameters}));
            return iActionHandler.handleAction(iAPConnectPluginContext, jSONObject, iActionHandlerCallback);
        }
        return false;
    }

    public void registerActionHandler(BaseActionHandler baseActionHandler) {
        this.mActionHandlers.put(baseActionHandler.getActionType(), baseActionHandler);
    }
}
