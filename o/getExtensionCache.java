package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import o.ExtensionPoint;
import o.SimpleSortable;

public interface getExtensionCache {
    @OperationType("alipayplus.mobilewallet.qr.decode")
    @SignCheck
    toJSONString decode(clearProxyGenerator clearproxygenerator);

    @OperationType("alipayplus.mobilewallet.qr.splitbill")
    @SignCheck
    BridgeDSL getSplitBillQr(ExtensionPoint.AnonymousClass1 r1);

    @OperationType("alipayplus.mobilewallet.qr.transfer.bank")
    @SignCheck
    description getTransferBankQr(SimpleSortable.Priority priority);

    @OperationType("alipayplus.mobilewallet.qr.transfer")
    @SignCheck
    ActionMeta getTransferQr(ExtensionPoint.ProxyGenerator proxyGenerator);

    @OperationType("alipayplus.mobilewallet.qr.user.bank")
    @SignCheck
    description getUserBankQr(priority priority);

    @OperationType("alipayplus.mobilewallet.qr.user")
    @SignCheck
    ActionMeta getUserQr(BridgeExtension bridgeExtension);
}
