package id.dana.data.qrbarcode.repository.source.network;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import id.dana.data.base.NetworkException;

public class QrBarcodeException extends NetworkException {
    private String errorMessage;

    public QrBarcodeException(BaseRpcResult baseRpcResult) {
        super(baseRpcResult);
        this.errorMessage = baseRpcResult.errorMessage;
    }

    public String errorMessage() {
        return this.errorMessage;
    }
}
