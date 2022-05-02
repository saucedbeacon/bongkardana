package com.iap.ac.android.w0;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.mpm.base.model.payment.request.SwapOrderRequest;
import com.iap.ac.android.mpm.base.model.payment.result.SwapOrderResult;
import com.iap.ac.android.mpm.payment.source.SwapOrderFacade;
import com.iap.ac.android.rpccommon.model.facade.MobileEnvInfo;
import java.util.Map;

public class a extends BaseNetwork<SwapOrderFacade> {

    /* renamed from: com.iap.ac.android.w0.a$a  reason: collision with other inner class name */
    public class C0032a implements BaseNetwork.a<SwapOrderFacade, SwapOrderResult> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SwapOrderRequest f9775a;

        public C0032a(a aVar, SwapOrderRequest swapOrderRequest) {
            this.f9775a = swapOrderRequest;
        }

        public Object a(Object obj) {
            return ((SwapOrderFacade) obj).swapOrder(this.f9775a);
        }
    }

    public SwapOrderResult a(@NonNull Map<String, String> map, @NonNull String str, @NonNull String str2, boolean z) throws Exception {
        SwapOrderRequest swapOrderRequest = new SwapOrderRequest();
        if (z) {
            swapOrderRequest.envInfo = new MobileEnvInfo();
            swapOrderRequest.envInfo.orderTerminalType = "MINI_APP";
        }
        swapOrderRequest.acquirerTradeNo = str;
        swapOrderRequest.acquirerId = str2;
        swapOrderRequest.acquirerOrderExtendInfo = map;
        return (SwapOrderResult) wrapper(new C0032a(this, swapOrderRequest));
    }

    public Class<SwapOrderFacade> getFacadeClass() {
        return SwapOrderFacade.class;
    }
}
