package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class addScreenshotListener implements onSceneParamChange {
    private final handlePostNotification h5ResponseCachePreferences;

    @Inject
    public addScreenshotListener(handlePostNotification handlepostnotification) {
        this.h5ResponseCachePreferences = handlepostnotification;
    }

    public Boolean saveCache(String str, onEmbedViewDetachedFromWebView onembedviewdetachedfromwebview) {
        return this.h5ResponseCachePreferences.saveCache(str, onembedviewdetachedfromwebview);
    }

    public onEmbedViewDetachedFromWebView getCache(String str) {
        return this.h5ResponseCachePreferences.getCache(str);
    }
}
