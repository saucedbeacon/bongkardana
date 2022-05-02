package o;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import id.dana.domain.qrbarcode.DecodeQrBizType;
import id.dana.sendmoney.RecipientActivity;
import id.dana.sendmoney.model.QrTransferModel;
import id.dana.sendmoney_v2.landing.SendMoneyActivity;
import id.dana.tracker.TrackerKey;
import o.DatePickerBridgeExtension;

public final class SystemImageEncoder extends APEncodeOptions {
    public SystemImageEncoder(Context context, fillPageCommonInfo fillpagecommoninfo, String str) {
        super(context, fillpagecommoninfo, str);
    }

    public final void setMin() {
        Intent intent;
        postWebViewMessage bizInfo = length().getBizInfo();
        QrTransferModel.setMax setmax = new QrTransferModel.setMax();
        String str = bizInfo.FastBitmap$CoordinateSystem;
        QrTransferModel.setMax setmax2 = setmax;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        setmax2.getMax = str;
        String avatarUrl = length().getAvatarUrl();
        QrTransferModel.setMax setmax3 = setmax2;
        if (avatarUrl == null) {
            avatarUrl = str2;
        }
        setmax3.getMin = avatarUrl;
        String str3 = bizInfo.values;
        QrTransferModel.setMax setmax4 = setmax3;
        if (str3 == null) {
            str3 = str2;
        }
        setmax4.setMax = str3;
        String mobileNumber = length().getMobileNumber();
        QrTransferModel.setMax setmax5 = setmax4;
        if (mobileNumber == null) {
            mobileNumber = str2;
        }
        setmax5.length = mobileNumber;
        String nickname = length().getNickname();
        QrTransferModel.setMax setmax6 = setmax5;
        if (nickname == null) {
            nickname = str2;
        }
        setmax6.toIntRange = nickname;
        String receiverId = length().getReceiverId();
        QrTransferModel.setMax setmax7 = setmax6;
        if (receiverId == null) {
            receiverId = str2;
        }
        setmax7.toFloatRange = receiverId;
        String bizType = length().getBizType();
        QrTransferModel.setMax setmax8 = setmax7;
        if (bizType != null) {
            str2 = bizType;
        }
        setmax8.setMin = str2;
        QrTransferModel max = setmax8.getMax();
        length().setSource((DecodeQrBizType.TRANSFER_CODE.equals(max.setMax()) || getMin(max.getMin())) ? TrackerKey.SourceType.REQUEST_MONEY_WITH_AMOUNT : length(length().getBizInfo().invoke) ? TrackerKey.SourceType.REQUEST_MONEY_WITHOUT_AMOUNT : "Scan QR");
        if (length().isSendMoneyV2()) {
            SendMoneyActivity.setMax setmax9 = SendMoneyActivity.Companion;
            intent = SendMoneyActivity.setMax.getMin(setMax(), max, "request_money", length().getSource());
        } else {
            intent = RecipientActivity.createTransferIntent(setMax(), max, "request_money", length().getSource());
        }
        getMax(intent);
    }

    private boolean length(String str) {
        return getCacheRootDir.setMax("request_money", str) || "request_money".equals(length().getSource());
    }

    private static boolean getMin(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-956224031, oncanceled);
            onCancelLoad.getMin(-956224031, oncanceled);
        }
        return !TextUtils.isEmpty(str) && DatePickerBridgeExtension.AnonymousClass7.setMax(str, 0) > 0;
    }
}
