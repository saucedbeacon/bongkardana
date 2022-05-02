package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class PostNotificationPoint implements getStartupPerformanceStatistics {
    private final showDisclaimer h5ResponseCachePreferencesDataFactory;

    @Inject
    public PostNotificationPoint(showDisclaimer showdisclaimer) {
        this.h5ResponseCachePreferencesDataFactory = showdisclaimer;
    }

    private onSceneParamChange createCardPreferencesData() {
        return this.h5ResponseCachePreferencesDataFactory.createData("local");
    }

    public Boolean saveCache(String str, onEmbedViewDetachedFromWebView onembedviewdetachedfromwebview) {
        return createCardPreferencesData().saveCache(str, onembedviewdetachedfromwebview);
    }

    public onEmbedViewDetachedFromWebView getCache(String str) {
        return createCardPreferencesData().getCache(str);
    }
}
