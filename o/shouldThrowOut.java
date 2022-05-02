package o;

import id.dana.domain.qrbarcode.DecodeQrBizType;
import java.util.List;
import o.ExtensionPoint;
import o.TitleBarRightButtonView;

public final class shouldThrowOut implements setupMethodInvokeOptimizerForBridge {
    public final TitleBarRightButtonView.AnonymousClass1<description> requestTransferBankCode(ExtensionType extensionType) {
        return null;
    }

    public final TitleBarRightButtonView.AnonymousClass1<description> userBankCode(SimpleSortable simpleSortable) {
        return null;
    }

    public final TitleBarRightButtonView.AnonymousClass1<toJSONString> decode(String str, String str2, Long l) {
        toJSONString tojsonstring = new toJSONString();
        tojsonstring.bizType = DecodeQrBizType.GN_AC_CODE;
        tojsonstring.acDecodeConfig = "decodeConfigGn";
        return TitleBarRightButtonView.AnonymousClass1.just(tojsonstring);
    }

    public final TitleBarRightButtonView.AnonymousClass1<ActionMeta> userCode(boolean z, String str, int i) {
        ActionMeta actionMeta = new ActionMeta();
        actionMeta.qrCode = "https://test.onepay.finance/gateway/oneQ/OS035697214894/20200413161613271FYr";
        return TitleBarRightButtonView.AnonymousClass1.just(actionMeta);
    }

    public final TitleBarRightButtonView.AnonymousClass1<ActionMeta> requestTransferCode(ExtensionPoint.ProxyGenerator proxyGenerator) {
        ActionMeta actionMeta = new ActionMeta();
        actionMeta.qrCode = "https://test.onepay.finance/gateway/oneQ/OS035697214894/20200413161613271FYr";
        return TitleBarRightButtonView.AnonymousClass1.just(actionMeta);
    }

    public final TitleBarRightButtonView.AnonymousClass1<BridgeDSL> requestSplitBillCode(List<ExtensionPoint.AnonymousClass2> list, String str) {
        BridgeDSL bridgeDSL = new BridgeDSL();
        bridgeDSL.qrCode = "https://qr.dana.id/v1/1234567";
        return TitleBarRightButtonView.AnonymousClass1.just(bridgeDSL);
    }
}
