package o;

import o.GriverWebviewSetting;
import o.b;

public final class WebViewSettingExtension implements getAdapterPosition<GriverWebviewSetting> {
    private final b.C0007b<GriverWebviewSetting.AnonymousClass1> permissionRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public WebViewSettingExtension(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverWebviewSetting.AnonymousClass1> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.permissionRepositoryProvider = bVar3;
    }

    public final GriverWebviewSetting get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.permissionRepositoryProvider.get());
    }

    public static WebViewSettingExtension create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverWebviewSetting.AnonymousClass1> bVar3) {
        return new WebViewSettingExtension(bVar, bVar2, bVar3);
    }

    public static GriverWebviewSetting newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverWebviewSetting.AnonymousClass1 r3) {
        return new GriverWebviewSetting(appxloadfailed, getscheme, r3);
    }
}
