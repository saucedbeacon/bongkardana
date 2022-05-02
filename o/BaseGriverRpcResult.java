package o;

import id.dana.domain.model.f2fpay.F2FPaymentResultStatus;

public class BaseGriverRpcResult {
    private onResultFailed orderInfo;
    private F2FPaymentResultStatus status;

    public F2FPaymentResultStatus getStatus() {
        return this.status;
    }

    public void setStatus(F2FPaymentResultStatus f2FPaymentResultStatus) {
        this.status = f2FPaymentResultStatus;
    }

    public onResultFailed getOrderInfo() {
        return this.orderInfo;
    }

    public void setOrderInfo(onResultFailed onresultfailed) {
        this.orderInfo = onresultfailed;
    }
}
