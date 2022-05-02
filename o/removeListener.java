package o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.sendmoney.RecipientActivity;
import id.dana.sendmoney.model.QrTransferModel;
import id.dana.sendmoney_v2.landing.SendMoneyActivity;
import java.util.Map;
import o.AnimationUtil;

public final class removeListener extends captureEndValues {
    public removeListener(Activity activity, Map<String, String> map, String str, boolean z) {
        Class cls;
        if (activity instanceof RecipientActivity) {
            BaseActivity baseActivity = (BaseActivity) activity;
            Bundle bundle = new Bundle();
            bundle.putString("recipientType", str);
            bundle.putParcelable("scanner_data", length(map, str));
            String max = getMax(map, baseActivity);
            if (!TextUtils.isEmpty(max)) {
                bundle.putString("source", max);
            }
            AnimationUtil.OnAnimationStartListener.setMax setmax = AnimationUtil.OnAnimationStartListener.setMax;
            AnimationUtil.OnAnimationStartListener.setMax.getMax(baseActivity, z).setMax(bundle);
            return;
        }
        if (z) {
            cls = SendMoneyActivity.class;
        } else {
            cls = RecipientActivity.class;
        }
        Intent min = setMin(activity, map, cls);
        min.putExtra("recipientType", str);
        if (!map.isEmpty()) {
            min.putExtra("scanner_data", length(map, str));
        }
        activity.startActivity(min);
    }

    private static QrTransferModel length(Map<String, String> map, String str) {
        QrTransferModel qrTransferModel = new QrTransferModel();
        qrTransferModel.setMin(map.get("amount"));
        if (BranchLinkConstant.ActionTarget.SEND_MONEY_BANK.equals(str)) {
            qrTransferModel.setMax(map.get(FeatureParams.ACCOUNT_NUMBER));
            qrTransferModel.getMax(map.get(FeatureParams.BANK_ID));
        } else {
            qrTransferModel.setMax(map.get(FeatureParams.MOBILE_NUMBER));
        }
        return qrTransferModel;
    }
}
