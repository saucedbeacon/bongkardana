package id.dana.data.qrbarcode.repository.source.network;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lid/dana/data/qrbarcode/repository/source/network/QrBarcodeExpiredException;", "Lid/dana/data/qrbarcode/repository/source/network/QrBarcodeException;", "result", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "(Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;)V", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class QrBarcodeExpiredException extends QrBarcodeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QrBarcodeExpiredException(@NotNull BaseRpcResult baseRpcResult) {
        super(baseRpcResult);
        Intrinsics.checkNotNullParameter(baseRpcResult, "result");
    }
}
