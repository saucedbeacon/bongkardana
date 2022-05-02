package o;

import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.iap.ac.android.biz.common.model.ForeignExchangeQuote;
import id.dana.domain.globalnetwork.model.Pay;
import id.dana.domain.model.f2fpay.F2FPaymentResultStatus;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class isTransparentTitle {
    private isTransparentTitle() {
    }

    public static ErrorView map(ForeignExchangeQuote foreignExchangeQuote) {
        ErrorView errorView = new ErrorView();
        if (foreignExchangeQuote != null) {
            errorView.setId(foreignExchangeQuote.quoteId);
            errorView.setPrice(foreignExchangeQuote.quotePrice);
            errorView.setCurrencyPair(foreignExchangeQuote.quoteCurrencyPair);
        }
        return errorView;
    }

    public static BaseGriverRpcResult map(String str) {
        return toF2FPayResultResponse(setColorSchemeDecider.parseToF2FPayResultResponses(str));
    }

    private static BaseGriverRpcResult toF2FPayResultResponse(List<onResultFailed> list) {
        BaseGriverRpcResult baseGriverRpcResult = new BaseGriverRpcResult();
        if (list != null && !list.isEmpty()) {
            baseGriverRpcResult.setOrderInfo(new onResultFailed());
            for (onResultFailed next : list) {
                String state = next.getState();
                if ("success".equals(state)) {
                    baseGriverRpcResult.setStatus(F2FPaymentResultStatus.SUCCESS);
                } else if (F2FPayConstants.OrderStatus.PENDING.equals(state)) {
                    baseGriverRpcResult.setStatus(F2FPaymentResultStatus.PENDING);
                } else if (F2FPayConstants.OrderStatus.FAILED.equals(state)) {
                    baseGriverRpcResult.setStatus(F2FPaymentResultStatus.FAILURE);
                }
                baseGriverRpcResult.setOrderInfo(next);
            }
        }
        return baseGriverRpcResult;
    }

    public static Pay transform(showErrorView showerrorview) {
        String str;
        String str2;
        Map hashMap = new HashMap();
        if (showerrorview.getPaymentRequest().paymentAmount != null) {
            String str3 = showerrorview.getPaymentRequest().paymentAmount.value;
            str = showerrorview.getPaymentRequest().paymentAmount.currency;
            str2 = str3;
        } else {
            str2 = "";
            str = str2;
        }
        if (showerrorview.getPaymentRequest().extendedInfo != null) {
            hashMap = showerrorview.getPaymentRequest().extendedInfo;
        }
        return new Pay(str2, str, hashMap, showerrorview.getPaymentRequest().type, showerrorview.getPaymentRequest().paymentString, showerrorview.isFromMiniProgram());
    }
}
