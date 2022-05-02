package o;

import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.social.PrivacySettingActivity;
import id.dana.social.di.module.PrivacySettingModule;
import o.APExpansion;
import o.AUBadgeView;
import o.AUHorizontalListView;
import o.PrepareException;
import o.b;
import o.getTitleBarRelative;

public final class getSegment implements getPopActivity {
    private b.C0007b<getRequestedModel> IsOverlapping;
    private b.C0007b<DistanceCalculator> equals;
    private b.C0007b<getResponseString> getMax;
    private b.C0007b<MonitoringStatus> getMin;
    private b.C0007b<getTitleBarRelative.setMin> hashCode;
    private b.C0007b<getTitleBarRelative.getMin> isInside;
    private final PrepareException.AnonymousClass1 length;
    private b.C0007b<APExpansion.AnonymousClass1> setMax;
    private b.C0007b<APExpansion.AnonymousClass1> setMin;
    private b.C0007b<AUHorizontalListView.SelectionNotifier> toDoubleRange;
    private b.C0007b<getBeacons> toFloatRange;
    private b.C0007b<getRightButton> toIntRange;
    private b.C0007b<Context> values;

    public /* synthetic */ getSegment(PrivacySettingModule privacySettingModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(privacySettingModule, r2);
    }

    private getSegment(PrivacySettingModule privacySettingModule, PrepareException.AnonymousClass1 r6) {
        this.length = r6;
        getMin getmin = new getMin(r6);
        this.getMax = getmin;
        this.getMin = addRegion.create(getmin);
        this.setMin = new setMin(r6);
        this.setMax = new setMax(r6);
        toIntRange tointrange = new toIntRange(r6);
        this.IsOverlapping = tointrange;
        this.equals = CurveFittedDistanceCalculator.create(this.setMin, this.setMax, tointrange);
        this.toFloatRange = getFilter.create(this.getMax);
        b.C0007b<getTitleBarRelative.getMin> min = isScrap.getMin(AUBadgeView.AnonymousClass1.length(privacySettingModule));
        this.isInside = min;
        getTitleContainer max = getTitleContainer.getMax(this.getMin, this.equals, this.toFloatRange, min);
        this.toIntRange = max;
        this.hashCode = isScrap.getMin(getMsgCount.length(privacySettingModule, max));
        getMax getmax = new getMax(r6);
        this.values = getmax;
        this.toDoubleRange = isScrap.getMin(setMsgCount.setMax(privacySettingModule, getmax));
    }

    public static final class length {
        public PrepareException.AnonymousClass1 getMin;
        public PrivacySettingModule setMin;

        public /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }

    static class getMin implements b.C0007b<getResponseString> {
        private final PrepareException.AnonymousClass1 setMax;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            getResponseString IMediaControllerCallback = this.setMax.IMediaControllerCallback();
            if (IMediaControllerCallback != null) {
                return IMediaControllerCallback;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<APExpansion.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 length;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            APExpansion.AnonymousClass1 equals = this.length.equals();
            if (equals != null) {
                return equals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<APExpansion.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 length;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            APExpansion.AnonymousClass1 isInside = this.length.isInside();
            if (isInside != null) {
                return isInside;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toIntRange implements b.C0007b<getRequestedModel> {
        private final PrepareException.AnonymousClass1 setMax;

        toIntRange(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            getRequestedModel IconCompatParcelizer = this.setMax.IconCompatParcelizer();
            if (IconCompatParcelizer != null) {
                return IconCompatParcelizer;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 setMax;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.setMax.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void length(PrivacySettingActivity privacySettingActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.length.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(privacySettingActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.length.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length2 = this.length.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.length.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.length.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(privacySettingActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            setBizCode.getMin(privacySettingActivity, this.hashCode.get());
                            setBizCode.getMin(privacySettingActivity, this.toDoubleRange.get());
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
