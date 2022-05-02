package o;

import o.APWebSettings;
import o.b;

public final class addJavascriptInterface implements getAdapterPosition<APWebSettings.ZoomDensity> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public addJavascriptInterface(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDefaultFontSize> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.featureConfigRepositoryProvider = bVar3;
    }

    public final APWebSettings.ZoomDensity get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.featureConfigRepositoryProvider.get());
    }

    public static addJavascriptInterface create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDefaultFontSize> bVar3) {
        return new addJavascriptInterface(bVar, bVar2, bVar3);
    }

    public static APWebSettings.ZoomDensity newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setDefaultFontSize setdefaultfontsize) {
        return new APWebSettings.ZoomDensity(appxloadfailed, getscheme, setdefaultfontsize);
    }
}
