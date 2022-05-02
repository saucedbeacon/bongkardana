package com.alipay.iap.android.aplog.core.uploader.rpc;

import android.os.Bundle;

public interface RpcClient {
    LogRpcResult uploadLog(RpcLogRequestParam rpcLogRequestParam, String str, Bundle bundle);
}
