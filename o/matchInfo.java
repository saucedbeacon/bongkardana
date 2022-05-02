package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.base.BaseActivity;

public final class matchInfo implements getBindingAdapter<BaseActivity> {
    @InjectedFieldSignature("id.dana.base.BaseActivity.appLifeCycleObserver")
    public static void setMin(BaseActivity baseActivity, AppLifeCycleObserver appLifeCycleObserver) {
        baseActivity.appLifeCycleObserver = appLifeCycleObserver;
    }

    @InjectedFieldSignature("id.dana.base.BaseActivity.connectionStatusReceiver")
    public static void length(BaseActivity baseActivity, ConnectionStatusReceiver connectionStatusReceiver) {
        baseActivity.connectionStatusReceiver = connectionStatusReceiver;
    }
}
