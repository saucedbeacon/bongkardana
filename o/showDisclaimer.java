package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class showDisclaimer extends uncheckItems<onSceneParamChange> {
    private final addScreenshotListener localH5ResponseCachePreferencesData;

    @Inject
    public showDisclaimer(addScreenshotListener addscreenshotlistener) {
        this.localH5ResponseCachePreferencesData = addscreenshotlistener;
    }

    public onSceneParamChange createData(String str) {
        return this.localH5ResponseCachePreferencesData;
    }
}
