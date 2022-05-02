package com.iap.ac.android.h0;

import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.mpm.base.model.decode.request.DecodeRequest;
import com.iap.ac.android.mpm.base.model.decode.result.DecodeResult;
import com.iap.ac.android.mpm.decode.source.DecodeFacade;
import com.iap.ac.android.rpccommon.model.facade.MobileEnvInfo;

public class a extends BaseNetwork<DecodeFacade> {

    /* renamed from: com.iap.ac.android.h0.a$a  reason: collision with other inner class name */
    public class C0029a implements BaseNetwork.a<DecodeFacade, DecodeResult> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DecodeRequest f9716a;

        public C0029a(DecodeRequest decodeRequest) {
            this.f9716a = decodeRequest;
        }

        public Object a(Object obj) {
            return ((DecodeFacade) a.this.getFacade()).decode(this.f9716a);
        }
    }

    public DecodeResult a(String str, boolean z) throws Exception {
        DecodeRequest decodeRequest = new DecodeRequest();
        if (z) {
            decodeRequest.envInfo = new MobileEnvInfo();
            decodeRequest.envInfo.orderTerminalType = "MINI_APP";
        }
        decodeRequest.code = str;
        return (DecodeResult) wrapper(new C0029a(decodeRequest));
    }

    public Class<DecodeFacade> getFacadeClass() {
        return DecodeFacade.class;
    }
}
