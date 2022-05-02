package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.bca.BcaOneKlikEventHandler;
import o.b;

public final class getCornerRadius implements getBindingAdapter<BcaOneKlikEventHandler> {
    private final b.C0007b<releaseWebView> getBcaOneKlikInterceptDataConfigProvider;

    public getCornerRadius(b.C0007b<releaseWebView> bVar) {
        this.getBcaOneKlikInterceptDataConfigProvider = bVar;
    }

    public static getBindingAdapter<BcaOneKlikEventHandler> create(b.C0007b<releaseWebView> bVar) {
        return new getCornerRadius(bVar);
    }

    public final void injectMembers(BcaOneKlikEventHandler bcaOneKlikEventHandler) {
        injectGetBcaOneKlikInterceptDataConfig(bcaOneKlikEventHandler, this.getBcaOneKlikInterceptDataConfigProvider.get());
    }

    @InjectedFieldSignature("id.dana.danah5.bca.BcaOneKlikEventHandler.getBcaOneKlikInterceptDataConfig")
    public static void injectGetBcaOneKlikInterceptDataConfig(BcaOneKlikEventHandler bcaOneKlikEventHandler, releaseWebView releasewebview) {
        bcaOneKlikEventHandler.getBcaOneKlikInterceptDataConfig = releasewebview;
    }
}
