package o;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import id.dana.ocr.model.OCRResultModel;

final class getIndex {
    private static final String TAG = access$setDEFAULT_BEHAVIOR$cp.class.getSimpleName();

    private getIndex() {
    }

    static JSONObject mapResult(OCRResultModel oCRResultModel) {
        String str = oCRResultModel.getMin;
        boolean max = oCRResultModel.getMax();
        String max2 = setContentViewAfter.getMax(oCRResultModel.equals);
        if ((max || str.equals("004")) && TextUtils.isEmpty(max2)) {
            updateActionSheetContent.e(TAG, String.format("File not found or base64 encoding failed. Path : %1$s", new Object[]{oCRResultModel.equals}));
            str = "009";
            max = false;
        }
        WhichButton whichButton = new WhichButton();
        whichButton.setOrderId(oCRResultModel.getMax);
        whichButton.setMerchantName(oCRResultModel.setMin);
        whichButton.setOrderAmount(oCRResultModel.length);
        whichButton.setTimestamp(oCRResultModel.setMax);
        whichButton.setReceipt(max2);
        whichButton.setRawText(oCRResultModel.toIntRange);
        return inferThemeIsLight.getSuccessResult(max, str, whichButton);
    }
}
