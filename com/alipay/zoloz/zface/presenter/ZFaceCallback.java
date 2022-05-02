package com.alipay.zoloz.zface.presenter;

import android.graphics.Bitmap;
import com.alipay.zoloz.toyger.face.ToygerFaceAttr;
import com.alipay.zoloz.zface.beans.AlertData;
import com.alipay.zoloz.zface.beans.FrameStateData;
import com.alipay.zoloz.zface.beans.PreviewData;
import com.alipay.zoloz.zface.beans.UploadData;
import java.util.Map;

public interface ZFaceCallback {
    String getCurrentActionName();

    int getRetryTimes();

    void handleFinish(boolean z);

    void onErrorEvent(AlertData alertData);

    void onEvent(int i, Map<String, Object> map);

    void onFrameComplete();

    void onFrameQualify(Bitmap bitmap, ToygerFaceAttr toygerFaceAttr);

    void onFrameStateUpdate(FrameStateData frameStateData);

    void onPreviewFrame(PreviewData previewData);

    void onSurfaceviewInit(double d, double d2);

    void onUploadSuccess(UploadData uploadData);
}
