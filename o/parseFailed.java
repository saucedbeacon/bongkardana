package o;

import o.GriverProgressBar;
import o.TitleBarRightButtonView;

@Deprecated
public abstract class parseFailed<T, P> {
    private final IRedDotManager disposables = new IRedDotManager();
    private final getScheme postExecutionThread;
    private final appxLoadFailed threadExecutor;

    /* access modifiers changed from: protected */
    public abstract TitleBarRightButtonView.AnonymousClass1<T> buildUseCaseObservable(P p);

    public parseFailed(appxLoadFailed appxloadfailed, getScheme getscheme) {
        this.threadExecutor = appxloadfailed;
        this.postExecutionThread = getscheme;
    }

    public void execute(setGlobalUserData<T> setglobaluserdata) {
        execute(setglobaluserdata, (Object) null);
    }

    public void execute(setGlobalUserData<T> setglobaluserdata, P p) {
        if (setglobaluserdata != null) {
            addDisposable((GriverProgressBar.UpdateRunnable) buildUseCaseObservable(p).subscribeOn(getSecureSignatureComp.setMin(this.threadExecutor)).observeOn(this.postExecutionThread.getScheduler()).subscribeWith(setglobaluserdata));
            return;
        }
        throw null;
    }

    public void executeInBackground(setGlobalUserData<T> setglobaluserdata) {
        executeInBackground(setglobaluserdata, (Object) null);
    }

    public void executeInBackground(setGlobalUserData<T> setglobaluserdata, P p) {
        if (setglobaluserdata != null) {
            addDisposable((GriverProgressBar.UpdateRunnable) buildUseCaseObservable(p).subscribeOn(getSecureSignatureComp.setMin(this.threadExecutor)).subscribeWith(setglobaluserdata));
            return;
        }
        throw null;
    }

    public void dispose() {
        this.disposables.getMax();
    }

    private void addDisposable(GriverProgressBar.UpdateRunnable updateRunnable) {
        if (updateRunnable != null) {
            IRedDotManager iRedDotManager = this.disposables;
            if (iRedDotManager != null) {
                iRedDotManager.getMin(updateRunnable);
                return;
            }
            throw null;
        }
        throw null;
    }
}
