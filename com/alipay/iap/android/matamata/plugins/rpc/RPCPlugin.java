package com.alipay.iap.android.matamata.plugins.rpc;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.fastjson.JSON;
import com.alipay.iap.android.matamata.plugins.rpc.model.RPCRequest;
import com.alipay.iap.android.matamata.plugins.rpc.model.RPCResponse;
import com.alipay.imobile.network.quake.IQuake;
import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperObject;
import com.google.firebase.analytics.FirebaseAnalytics;
import o.DANAJobIntentService;

public class RPCPlugin extends DANAJobIntentService {
    public String getId() {
        return "RPC";
    }

    public RPCPlugin(IQuake iQuake) {
        iQuake.addRequestInterceptor(new RpcRequestInterceptor(this));
    }

    public void reportRequest(RPCRequest rPCRequest) {
        send("newRequest", new FlipperObject(new FlipperObject.setMax().getMax("id", rPCRequest.requestId).length(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP, Long.valueOf(rPCRequest.timeStamp)).getMax(FirebaseAnalytics.Param.METHOD, rPCRequest.method).getMax("url", rPCRequest.url).setMax("headers", convertToFlipperObjectOrEmpty(rPCRequest.headers)).getMin("arguments", convertToFlipperArrayOrEmpty(rPCRequest.arguments)).getMax));
    }

    public void reportResponse(RPCResponse rPCResponse) {
        send("newResponse", new FlipperObject(new FlipperObject.setMax().getMax("id", rPCResponse.requestId).length(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP, Long.valueOf(rPCResponse.timeStamp)).setMax("headers", convertToFlipperObjectOrEmpty(rPCResponse.headers)).getMax("result", rPCResponse.result != null ? rPCResponse.result : "").getMax));
    }

    private FlipperObject convertToFlipperObjectOrEmpty(Object obj) {
        return obj == null ? new FlipperObject(new FlipperObject.setMax().getMax) : new FlipperObject(JSON.toJSONString(obj));
    }

    private FlipperArray convertToFlipperArrayOrEmpty(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return new FlipperArray(new FlipperArray.getMax().getMax);
        }
        FlipperArray.getMax getmax = new FlipperArray.getMax();
        for (Object convertToFlipperObjectOrEmpty : objArr) {
            FlipperObject convertToFlipperObjectOrEmpty2 = convertToFlipperObjectOrEmpty(convertToFlipperObjectOrEmpty);
            getmax.getMax.put(convertToFlipperObjectOrEmpty2 == null ? null : convertToFlipperObjectOrEmpty2.setMax);
        }
        return new FlipperArray(getmax.getMax);
    }
}
