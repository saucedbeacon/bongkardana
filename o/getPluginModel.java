package o;

import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.modules.PromoQuestModule;
import id.dana.promoquest.activity.MissionListActivity;
import o.GriverAMCSAppUpdater;
import o.PrepareException;

public final class getPluginModel implements writeJSONStringTo {
    private final PromoQuestModule length;
    private final PrepareException.AnonymousClass1 setMin;

    public /* synthetic */ getPluginModel(PromoQuestModule promoQuestModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(promoQuestModule, r2);
    }

    private getPluginModel(PromoQuestModule promoQuestModule, PrepareException.AnonymousClass1 r2) {
        this.setMin = r2;
        this.length = promoQuestModule;
    }

    private queryHighestAppInfo getMin() {
        GriverAMCSAppUpdater.AnonymousClass1 requestPostMessageChannel = this.setMin.requestPostMessageChannel();
        if (requestPostMessageChannel != null) {
            return new queryHighestAppInfo(requestPostMessageChannel);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static final class setMin {
        public PromoQuestModule getMax;
        public PrepareException.AnonymousClass1 getMin;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }

    public final void setMax(MissionListActivity missionListActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.setMin.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(missionListActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.setMin.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length2 = this.setMin.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.setMin.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.setMin.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(missionListActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            setPortrait.getMax(missionListActivity, GriverVerifyPublicKeyProxy.setMin(this.length, new getRunAttemptCount(getMin(), getMin(), GriverLoggerProxy.getMin(this.length), new openInBrowser())));
                            return;
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
