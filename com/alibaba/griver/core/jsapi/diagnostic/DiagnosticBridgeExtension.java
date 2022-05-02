package com.alibaba.griver.core.jsapi.diagnostic;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.iap.ac.android.diagnoselog.api.DiagnoseLogService;
import com.iap.ac.android.diagnoselog.api.OnLogUploadListener;
import com.iap.ac.android.diagnoselog.core.LogUploadInfo;
import java.util.Date;

@Keep
public class DiagnosticBridgeExtension implements BridgeExtension {
    private static final String ACTION_UPLOAD_LOG = "uploadDigoLogs";
    private static final String TAG = "DiagnosticBridgeExtension";

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ActionFilter
    public void griverInternalDiagnoticTool(@BindingNode(App.class) App app, @BindingNode(Page.class) Page page, @BindingParam(name = {"action"}) String str, @BindingParam(name = {"dateTimeStamp"}) Long l, @BindingCallback final BridgeCallback bridgeCallback) {
        if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else if (!TextUtils.equals(str, ACTION_UPLOAD_LOG)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else if (l == null || l.longValue() <= 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            GriverLogger.d(TAG, "start to upload");
            DiagnoseLogService.setOnLogUploadListener(new OnLogUploadListener() {
                public void onProgress(LogUploadInfo logUploadInfo) {
                    if (logUploadInfo != null) {
                        StringBuilder sb = new StringBuilder("OnLogUploadListener onProgress: ");
                        sb.append(logUploadInfo.bytesUploaded);
                        GriverLogger.d(DiagnosticBridgeExtension.TAG, sb.toString());
                    }
                }

                public void onFinished(boolean z, String str) {
                    StringBuilder sb = new StringBuilder("OnLogUploadListener success:");
                    sb.append(z);
                    sb.append(" taskId:");
                    sb.append(str);
                    GriverLogger.d(DiagnosticBridgeExtension.TAG, sb.toString());
                    JSONObject jSONObject = new JSONObject();
                    if (z) {
                        jSONObject.put("success", (Object) Boolean.TRUE);
                        jSONObject.put("taskId", (Object) str);
                    } else {
                        jSONObject.put("success", (Object) Boolean.FALSE);
                    }
                    bridgeCallback.sendJSONResponse(jSONObject);
                }
            });
            DiagnoseLogService.upload(new Date(l.longValue()));
        }
    }
}
