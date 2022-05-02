package o;

import id.dana.contract.payqr.AddNewCardModule;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.pay.screen.AddNewCardFragment;
import o.PrepareException;
import o.ViewPager;
import o.b;
import o.enableLayers;
import o.getPageSize;

public final class requestPluginModel implements createStep {
    private b.C0007b<enableLayers.setMin> IsOverlapping;
    private b.C0007b<getPageSize.getMin> equals;
    private b.C0007b<enableLayers.getMin> getMax;
    private b.C0007b<setDefaultFontSize> getMin;
    private b.C0007b<requestTransform> isInside;
    private b.C0007b<appxLoadFailed> length;
    private b.C0007b<getScheme> setMax;
    private b.C0007b<getJavaScriptEnabled> setMin;
    private b.C0007b<getPageSize.setMin> toDoubleRange;
    private b.C0007b<infoForCurrentScrollPosition> toFloatRange;
    private b.C0007b<copyBackForwardList> toIntRange;

    public /* synthetic */ requestPluginModel(AddNewCardModule addNewCardModule, OfflinePayModule offlinePayModule, PrepareException.AnonymousClass1 r3, byte b) {
        this(addNewCardModule, offlinePayModule, r3);
    }

    private requestPluginModel(AddNewCardModule addNewCardModule, OfflinePayModule offlinePayModule, PrepareException.AnonymousClass1 r5) {
        this.getMax = isScrap.getMin(ViewPager.LayoutParams.getMax(addNewCardModule));
        this.length = new getMin(r5);
        this.setMax = new getMax(r5);
        length length2 = new length(r5);
        this.getMin = length2;
        setGeolocationDatabasePath create = setGeolocationDatabasePath.create(this.length, this.setMax, length2);
        this.setMin = create;
        b.C0007b<infoForCurrentScrollPosition> min = isScrap.getMin(determineTargetPage.length(this.getMax, create));
        this.toFloatRange = min;
        this.IsOverlapping = isScrap.getMin(addTouchables.length(addNewCardModule, min));
        this.toIntRange = clearHistory.create(this.length, this.setMax, this.getMin);
        b.C0007b<getPageSize.getMin> min2 = isScrap.getMin(FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.getMin(offlinePayModule));
        this.equals = min2;
        registerOnPageChangeCallback max = registerOnPageChangeCallback.setMax(this.toIntRange, min2);
        this.isInside = max;
        this.toDoubleRange = isScrap.getMin(updateCurrentItem.length(offlinePayModule, max));
    }

    public static final class setMin {
        public PrepareException.AnonymousClass1 getMin;
        public AddNewCardModule setMax;
        public OfflinePayModule setMin;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }

    static class getMin implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMax;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length = this.getMax.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 getMax;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            getScheme min = this.getMax.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class length implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 setMax;

        length(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.setMax.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void length(AddNewCardFragment addNewCardFragment) {
        getSavedFileList.getMin(addNewCardFragment, this.IsOverlapping.get());
        getSavedFileList.length(addNewCardFragment, this.toDoubleRange.get());
    }
}
