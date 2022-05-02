package com.alibaba.griver.core.rpc;

import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.rpc.BaseGriverNetwork;
import com.alibaba.griver.base.common.rpc.OnRpcResultListener;
import com.alibaba.griver.core.model.share.ShareShortUrlRequest;
import com.alibaba.griver.core.model.share.ShareShortUrlResult;
import com.alipay.mobile.common.rpc.RpcException;

public class b extends BaseGriverNetwork<MiniProgramFacade> {
    public Class<MiniProgramFacade> getFacadeClass() {
        return MiniProgramFacade.class;
    }

    public void a(final ShareShortUrlRequest shareShortUrlRequest, final OnRpcResultListener<ShareShortUrlResult> onRpcResultListener) {
        GriverExecutors.getExecutor(ExecutorType.NETWORK).execute(new Runnable() {
            public void run() {
                try {
                    onRpcResultListener.onResultSuccess(((MiniProgramFacade) b.this.getFacade()).getShareShortUrl(shareShortUrlRequest));
                } catch (RpcException e) {
                    onRpcResultListener.onResultFailed(e.getCode(), e.getMessage());
                }
            }
        });
    }
}
