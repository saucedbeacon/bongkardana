package o;

public class IpcServerUtils {
    private loadApp feedsResult;
    private ResourceResponsePoint hasNewResult;
    private flushMessages homeInfoResult;
    private GriverAMCSLiteAppUpdater space;

    public flushMessages getHomeInfoResult() {
        return this.homeInfoResult;
    }

    public void setHomeInfoResult(flushMessages flushmessages) {
        this.homeInfoResult = flushmessages;
    }

    public loadApp getFeedsResult() {
        return this.feedsResult;
    }

    public void setFeedsResult(loadApp loadapp) {
        this.feedsResult = loadapp;
    }

    public GriverAMCSLiteAppUpdater getSpace() {
        return this.space;
    }

    public void setSpace(GriverAMCSLiteAppUpdater griverAMCSLiteAppUpdater) {
        this.space = griverAMCSLiteAppUpdater;
    }

    public ResourceResponsePoint getHasNewResult() {
        return this.hasNewResult;
    }

    public void setHasNewResult(ResourceResponsePoint resourceResponsePoint) {
        this.hasNewResult = resourceResponsePoint;
    }
}
