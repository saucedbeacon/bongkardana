package o;

import o.TitleBarRightButtonView;

@Deprecated
public abstract class getItemAtIndex<T, P> {
    private final getScheme postExecutionThread;
    private final appxLoadFailed threadExecutor;

    /* access modifiers changed from: protected */
    public abstract TitleBarRightButtonView.AnonymousClass1<T> buildUseCaseObservable(P p);

    public getItemAtIndex(appxLoadFailed appxloadfailed, getScheme getscheme) {
        this.threadExecutor = appxloadfailed;
        this.postExecutionThread = getscheme;
    }

    public TitleBarRightButtonView.AnonymousClass1<T> execute(P p) {
        return buildUseCaseObservable(p).subscribeOn(getSecureSignatureComp.setMin(this.threadExecutor)).observeOn(this.postExecutionThread.getScheduler());
    }

    public TitleBarRightButtonView.AnonymousClass1<T> execute() {
        return execute((Object) null);
    }
}
