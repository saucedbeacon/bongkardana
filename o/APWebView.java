package o;

import o.b;

public final class APWebView implements getAdapterPosition<removeJavascriptInterface> {
    private final b.C0007b<onDownloadResult> geofenceConfigFactoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public APWebView(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDownloadResult> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.geofenceConfigFactoryProvider = bVar3;
    }

    public final removeJavascriptInterface get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.geofenceConfigFactoryProvider.get());
    }

    public static APWebView create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDownloadResult> bVar3) {
        return new APWebView(bVar, bVar2, bVar3);
    }

    public static removeJavascriptInterface newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onDownloadResult ondownloadresult) {
        return new removeJavascriptInterface(appxloadfailed, getscheme, ondownloadresult);
    }
}
