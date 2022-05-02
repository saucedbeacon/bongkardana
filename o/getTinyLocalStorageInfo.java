package o;

import id.dana.data.constant.BranchLinkConstant;
import id.dana.domain.qrbarcode.DecodeQrBizType;
import java.util.Map;
import javax.inject.Inject;
import o.GriverPrepareInterceptor;

public final class getTinyLocalStorageInfo {
    private broadcastInvalidation getMin;

    @Inject
    public getTinyLocalStorageInfo(broadcastInvalidation broadcastinvalidation) {
        this.getMin = broadcastinvalidation;
    }

    public static fillPageCommonInfo getMax(GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1 r3) {
        fillPageCommonInfo fillpagecommoninfo = new fillPageCommonInfo();
        if (r3 != null) {
            if (r3 != null) {
                fillpagecommoninfo.setSuccess(r3.isSuccess());
                fillpagecommoninfo.setErrorCode(r3.getErrorCode());
                fillpagecommoninfo.setErrorMessage(r3.getErrorMessage());
            }
            fillpagecommoninfo.setMobileNumber(r3.getMobileNumber());
            fillpagecommoninfo.setBizType(r3.getBizType());
            fillpagecommoninfo.setBizNo(r3.getBizNo());
            fillpagecommoninfo.setReceiverId(r3.getReceiverId());
            fillpagecommoninfo.setNickname(r3.getNickname());
            fillpagecommoninfo.setLoginId(r3.getLoginId());
            fillpagecommoninfo.setBizInfo(length(r3.getBizInfo(), r3.getBizType()));
            fillpagecommoninfo.setAvatarUrl(r3.getAvatarUrl());
            fillpagecommoninfo.setRedirectUrl(r3.getRedirectUrl());
            fillpagecommoninfo.setAcDecodeConfig(r3.getAcDecodeConfig());
        }
        return fillpagecommoninfo;
    }

    private static postWebViewMessage length(Map<String, String> map, String str) {
        postWebViewMessage postwebviewmessage = new postWebViewMessage(str);
        if (map == null) {
            return postwebviewmessage;
        }
        postwebviewmessage.invokeSuspend = map.get("merchantId");
        postwebviewmessage.Grayscale$Algorithm = map.get(BranchLinkConstant.OauthParams.MERCHANT_NAME);
        postwebviewmessage.hashCode = map.get("bussinessType");
        postwebviewmessage.toDoubleRange = map.get("logoUrl");
        postwebviewmessage.FastBitmap$CoordinateSystem = map.get("amount");
        postwebviewmessage.values = map.get("comment");
        postwebviewmessage.valueOf = map.get("url");
        postwebviewmessage.Mean$Arithmetic = map.get("PAYERS");
        postwebviewmessage.b = map.get("payeeIndex");
        postwebviewmessage.ICustomTabsCallback = map.get("payerIndex");
        postwebviewmessage.create = map.get("splitBillId");
        postwebviewmessage.onNavigationEvent = map.get("status");
        return length(str) ? measureText.setMin(postwebviewmessage, map) : postwebviewmessage;
    }

    private static boolean length(String str) {
        return DecodeQrBizType.USER_BANK_ACCOUNT_CODE.equals(str) || DecodeQrBizType.TRANSFER_BANK_ACCOUNT_CODE.equals(str);
    }
}
