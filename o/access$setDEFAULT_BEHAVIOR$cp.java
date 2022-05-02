package o;

import android.app.Activity;
import android.content.Intent;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import id.dana.ocr.model.OCRRequestModel;
import id.dana.ocr.model.OCRResultModel;
import id.dana.ocr.views.OCRCameraActivity;
import id.dana.ocr.views.OCRPreviewImageActivity;

public class access$setDEFAULT_BEHAVIOR$cp {
    private static final String TAG = access$setDEFAULT_BEHAVIOR$cp.class.getSimpleName();
    private BridgeCallback bridgeCallback;
    private OCRRequestModel ocrRequestModel;

    public void onGetResult(int i, Intent intent) {
        JSONObject jSONObject = null;
        if (i == 4103) {
            try {
                OCRResultModel oCRResultModel = (OCRResultModel) intent.getParcelableExtra(OCRPreviewImageActivity.KEY_OCR_RESULT_MODEL);
                if (oCRResultModel != null) {
                    if (this.ocrRequestModel == null || !this.ocrRequestModel.setMin() || !oCRResultModel.getMax() || this.bridgeCallback == null) {
                        jSONObject = getIndex.mapResult(oCRResultModel);
                    } else {
                        this.bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                        BridgeCallback bridgeCallback2 = this.bridgeCallback;
                        if (bridgeCallback2 != null) {
                            bridgeCallback2.sendJSONResponse((JSONObject) null);
                            return;
                        }
                        return;
                    }
                }
            } catch (JSONException e) {
                updateActionSheetContent.e(TAG, e.getMessage());
                JSONObject failedResult = inferThemeIsLight.getFailedResult("001");
                BridgeCallback bridgeCallback3 = this.bridgeCallback;
                if (bridgeCallback3 != null) {
                    bridgeCallback3.sendJSONResponse(failedResult);
                    return;
                }
                return;
            } catch (Throwable th) {
                BridgeCallback bridgeCallback4 = this.bridgeCallback;
                if (bridgeCallback4 != null) {
                    bridgeCallback4.sendJSONResponse((JSONObject) null);
                }
                throw th;
            }
        }
        if (jSONObject == null) {
            jSONObject = inferThemeIsLight.getFailedResult("010");
        }
        BridgeCallback bridgeCallback5 = this.bridgeCallback;
        if (bridgeCallback5 != null) {
            bridgeCallback5.sendJSONResponse(jSONObject);
        }
    }

    public void setBridgeCallback(BridgeCallback bridgeCallback2) {
        this.bridgeCallback = bridgeCallback2;
    }

    public void execute(Activity activity, OCRRequestModel oCRRequestModel) {
        this.ocrRequestModel = oCRRequestModel;
        OCRCameraActivity.openOCRCamera(activity, oCRRequestModel);
    }
}
