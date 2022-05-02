package o;

import id.dana.di.PerActivity;
import id.dana.domain.authcode.interactor.GetAuthCode;
import javax.inject.Inject;
import o.getRunningAnimators;

@PerActivity
public final class setEpicenterCallback {
    final parseBatteryPercentage getMax;
    final getRunningAnimators.getMin getMin;
    final getPerformanceTracker length;
    final GetAuthCode setMax;
    final getUniqueId setMin;

    @Inject
    public setEpicenterCallback(getRunningAnimators.getMin getmin, getUniqueId getuniqueid, parseBatteryPercentage parsebatterypercentage, GetAuthCode getAuthCode, getPerformanceTracker getperformancetracker) {
        this.getMin = getmin;
        this.setMin = getuniqueid;
        this.getMax = parsebatterypercentage;
        this.setMax = getAuthCode;
        this.length = getperformancetracker;
    }
}
