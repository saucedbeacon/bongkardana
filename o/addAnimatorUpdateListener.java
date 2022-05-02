package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import o.TitleBarRightButtonView;

public abstract class addAnimatorUpdateListener<T> {
    private final setIsUrgentResource rpcConnector;
    private final appxLoadFailed threadExecutor;

    public interface getMax<F, S> {
        S processFacade(F f);
    }

    /* access modifiers changed from: protected */
    public abstract Class<T> getFacadeClass();

    public abstract Context passContext();

    public addAnimatorUpdateListener(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed) {
        this.rpcConnector = setisurgentresource;
        this.threadExecutor = appxloadfailed;
    }

    public <S extends BaseRpcResult> TitleBarRightButtonView.AnonymousClass1<S> wrapper(getMax<T, S> getmax) {
        return wrapper(getmax, new removeAllAnimatorListeners());
    }

    /* access modifiers changed from: protected */
    public <S extends BaseRpcResult> TitleBarRightButtonView.AnonymousClass1<S> wrapper(getMax<T, S> getmax, removeAllAnimatorListeners removeallanimatorlisteners) {
        if (removeallanimatorlisteners == null) {
            removeallanimatorlisteners = new removeAllAnimatorListeners();
        }
        removeallanimatorlisteners.setContext(passContext());
        removeallanimatorlisteners.setOperationType(setTimeout.getOperationType(getFacadeClass()));
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new setMinAndMaxProgress(this, getmax)).subscribeOn(getSecureSignatureComp.setMin(this.threadExecutor)).flatMap(removeallanimatorlisteners);
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ BaseRpcResult lambda$wrapper$0(getMax getmax) throws Exception {
        return (BaseRpcResult) getmax.processFacade(getCastedFacade());
    }

    /* access modifiers changed from: protected */
    public <S extends BaseRpcResult> S wrapperMainThread(getMax<T, S> getmax) {
        return (BaseRpcResult) getmax.processFacade(getCastedFacade());
    }

    /* access modifiers changed from: protected */
    public T getCastedFacade() {
        return this.rpcConnector.getFacade(getFacadeClass());
    }
}
