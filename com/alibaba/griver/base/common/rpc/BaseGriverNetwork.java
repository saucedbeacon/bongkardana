package com.alibaba.griver.base.common.rpc;

import com.alibaba.ariver.kernel.common.RVProxy;

public abstract class BaseGriverNetwork<T> {

    public interface FacadeProcessor<F, S> {
        S processFacade(F f);
    }

    /* access modifiers changed from: protected */
    public abstract Class<T> getFacadeClass();

    /* access modifiers changed from: protected */
    public <S extends BaseGriverRpcResult> S wrapper(FacadeProcessor<T, S> facadeProcessor) {
        return (BaseGriverRpcResult) facadeProcessor.processFacade(getFacade());
    }

    public T getFacade() {
        return a(getFacadeClass());
    }

    private <T> T a(Class<T> cls) {
        return ((GriverRpcExtension) RVProxy.get(GriverRpcExtension.class)).getFacade(cls);
    }
}
