package o;

import id.dana.di.modules.MissionSummaryModule;
import id.dana.promoquest.views.MissionSummaryView;
import o.GriverAMCSAppUpdater;
import o.PrepareException;
import o.SubPackageDownloader;
import o.b;
import o.getBackgroundExecutor;

public final class AppxNgResourcePackage implements SubPackageDownloader.AnonymousClass1 {
    private b.C0007b<setDefaultFontSize> getMax;
    private b.C0007b<getUserAgentString> getMin;
    private b.C0007b<getBackgroundExecutor.length> length;
    private b.C0007b<saveAppInfo> setMax;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> setMin;
    private b.C0007b<isRunInForeground> toFloatRange;
    private b.C0007b<getBackgroundExecutor.setMin> toIntRange;

    public /* synthetic */ AppxNgResourcePackage(MissionSummaryModule missionSummaryModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(missionSummaryModule, r2);
    }

    private AppxNgResourcePackage(MissionSummaryModule missionSummaryModule, PrepareException.AnonymousClass1 r5) {
        setMin setmin = new setMin(r5);
        this.getMax = setmin;
        this.getMin = setUserAgentString.create(setmin);
        getMin getmin = new getMin(r5);
        this.setMin = getmin;
        this.setMax = queryLastInstall.create(getmin);
        this.length = isScrap.getMin(getClassFromMapping.getMin(missionSummaryModule));
        setUsed max = setUsed.getMax(this.getMin, this.setMax, OpenInBrowserBridgeExtension.setMax(), this.length);
        this.toFloatRange = max;
        this.toIntRange = isScrap.getMin(castToEnum.getMin(missionSummaryModule, max));
    }

    public static final class length {
        public PrepareException.AnonymousClass1 length;
        public MissionSummaryModule setMin;

        public /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }

    static class setMin implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 setMin;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.setMin.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 length;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            GriverAMCSAppUpdater.AnonymousClass1 requestPostMessageChannel = this.length.requestPostMessageChannel();
            if (requestPostMessageChannel != null) {
                return requestPostMessageChannel;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMax(MissionSummaryView missionSummaryView) {
        exitSession.getMin(missionSummaryView, this.toIntRange.get());
    }
}
