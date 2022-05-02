package com.iap.ac.android.acs.plugin.interceptor;

import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.biz.common.model.ScanCallback;
import com.iap.ac.android.biz.common.model.ScanErrorCode;
import com.iap.ac.android.biz.common.model.ScanType;
import com.iap.ac.android.biz.common.model.ScannerOption;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONException;
import org.json.JSONObject;

public class Interceptor4scan extends BaseInterceptor {
    private static final String ERROR_CODE_OPERATION_FAIL = "11";
    private static final String ERROR_CODE_USER_CANCEL = "10";
    private static final String PARAM_HIDE_ALBUM = "hideAlbum";
    private static final String PARAM_TYPE = "type";
    private static final String TAG = "IAPConnectPlugin";
    private static final String TYPE_BAR = "bar";
    private static final String TYPE_QR = "qr";

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        JSONObject jSONObject = iAPConnectPluginContext.jsParameters;
        if (jSONObject == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4scan#handle, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError("scan", "parameter is null"));
            return;
        }
        ScannerOption scannerOption = new ScannerOption();
        scannerOption.hideAlbum = jSONObject.optBoolean(PARAM_HIDE_ALBUM);
        String optString = jSONObject.optString("type");
        if (TYPE_QR.equals(optString) || !TYPE_BAR.equals(optString)) {
            scannerOption.type = ScanType.QR;
        } else {
            scannerOption.type = ScanType.BAR;
        }
        scan(scannerOption, optString, iAPConnectPluginCallback);
    }

    private void scan(ScannerOption scannerOption, final String str, final IAPConnectPluginCallback iAPConnectPluginCallback) {
        StringBuilder sb = new StringBuilder("Interceptor4scan#scan, hideAlbum: ");
        sb.append(scannerOption.hideAlbum);
        sb.append(", type: ");
        sb.append(str);
        ACLog.d("IAPConnectPlugin", sb.toString());
        SPIManager.getInstance().scan(scannerOption, new ScanCallback() {
            public void onSuccess(String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", str);
                    if (Interceptor4scan.TYPE_QR.equals(str)) {
                        jSONObject.put("qrCode", str);
                    } else if (Interceptor4scan.TYPE_BAR.equals(str)) {
                        jSONObject.put("barCode", str);
                    }
                    iAPConnectPluginCallback.onResult(jSONObject);
                } catch (JSONException e) {
                    ACLog.e("IAPConnectPlugin", "Interceptor4scan#scan, convert result to JSON error");
                    MonitorUtil.monitorJSONError("scan", e);
                }
            }

            public void onFailure(ScanErrorCode scanErrorCode, String str) {
                String str2;
                StringBuilder sb = new StringBuilder("Interceptor4scan#scan, errorCode: ");
                sb.append(scanErrorCode);
                sb.append(", errorMessage: ");
                sb.append(str);
                ACLog.e("IAPConnectPlugin", sb.toString());
                if (scanErrorCode == ScanErrorCode.USER_CANCEL) {
                    str2 = "10";
                } else {
                    ScanErrorCode scanErrorCode2 = ScanErrorCode.OPERATION_FAIL;
                    str2 = "11";
                }
                iAPConnectPluginCallback.onResult(CallbackUtil.getError("scan", str2, str));
            }
        });
    }
}
