package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.iap.android.f2fpay.client.pay.F2FPayResult;
import com.alipay.iap.android.f2fpay.client.pay.F2FPayResultStatus;
import com.alipay.iap.android.f2fpay.client.pay.F2fPayOrderInfo;
import com.alipay.iap.android.f2fpay.paymentcode.F2FPaymentCodeInfo;
import id.dana.domain.model.f2fpay.F2FPaymentResultStatus;
import javax.inject.Singleton;

@Singleton
public class RVJsStatTrackService {
    public GriverRpcExtension transform(@NonNull F2FPaymentCodeInfo f2FPaymentCodeInfo) {
        GriverRpcExtension griverRpcExtension = new GriverRpcExtension();
        griverRpcExtension.setPaymentCode(f2FPaymentCodeInfo.paymentCode);
        griverRpcExtension.setTotp(f2FPaymentCodeInfo.totp);
        return griverRpcExtension;
    }

    public BaseGriverRpcResult transform(@NonNull F2FPayResult f2FPayResult) {
        BaseGriverRpcResult baseGriverRpcResult = new BaseGriverRpcResult();
        if (f2FPayResult.status != null) {
            if (f2FPayResult.status == F2FPayResultStatus.Success) {
                baseGriverRpcResult.setStatus(F2FPaymentResultStatus.SUCCESS);
            } else if (f2FPayResult.status == F2FPayResultStatus.Pending) {
                baseGriverRpcResult.setStatus(F2FPaymentResultStatus.PENDING);
            } else if (f2FPayResult.status == F2FPayResultStatus.Failure) {
                baseGriverRpcResult.setStatus(F2FPaymentResultStatus.FAILURE);
            }
        }
        if (f2FPayResult.orderInfo != null) {
            onResultFailed onresultfailed = new onResultFailed();
            F2fPayOrderInfo f2fPayOrderInfo = f2FPayResult.orderInfo;
            onresultfailed.setTradeNo(f2fPayOrderInfo.tradeNo);
            onresultfailed.setBuyerPhoneNo(f2fPayOrderInfo.buyerPhoneNo);
            onresultfailed.setBuyerUserId(f2fPayOrderInfo.buyerUserId);
            onresultfailed.setPaymentCode(f2fPayOrderInfo.paymentCode);
            onresultfailed.setSellerUserId(f2fPayOrderInfo.sellerUserId);
            onresultfailed.setSellerName(f2fPayOrderInfo.sellerName);
            onresultfailed.setProductCode(f2fPayOrderInfo.productCode);
            onresultfailed.setState(f2fPayOrderInfo.state);
            onresultfailed.setAmount(f2fPayOrderInfo.amount);
            onresultfailed.setPayAmount(parseAmountByDivision(f2FPayResult.orderInfo.payAmount));
            onresultfailed.setPayAmountCurrency(f2fPayOrderInfo.payAmountCurrency);
            onresultfailed.setTradeAmount(f2fPayOrderInfo.tradeAmount);
            onresultfailed.setTradeAmountCurrency(f2fPayOrderInfo.tradeAmountCurrency);
            onresultfailed.setCashierUrl(getAlign.getUrlWithCtoken(f2fPayOrderInfo.cashierUrl));
            onresultfailed.setExtendInfo(f2fPayOrderInfo.extendInfo);
            onresultfailed.setPayMethod(f2fPayOrderInfo.payMethod);
            onresultfailed.setStateReasonCode(f2fPayOrderInfo.stateReasonCode);
            onresultfailed.setStateReasonDesc(f2fPayOrderInfo.stateReasonDesc);
            baseGriverRpcResult.setOrderInfo(onresultfailed);
        }
        return baseGriverRpcResult;
    }

    private String parseAmountByDivision(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return String.valueOf(Long.valueOf(Long.parseLong(str) / 100));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
