package o;

import android.content.Context;
import id.dana.nearbyme.di.module.NearbyTrackerModule;
import id.dana.nearbyme.homeshopping.tutorial.HomeShoppingTutorialFragment;
import id.dana.nearbyrevamp.search.searchresult.MerchantSearchResultFragment;
import o.AddPhoneContactBridgeExtension;
import o.GriverDefaultWebViewReceivedErrorExtension;
import o.GriverWebEngineImpl;
import o.PrepareException;
import o.b;
import o.d;
import o.k;

public final class GriverUcServiceProxy implements GriverWebEngineImpl.AnonymousClass1 {
    private b.C0007b<s> getMax;
    private b.C0007b<Context> length;
    private b.C0007b<t> setMin;

    /* synthetic */ GriverUcServiceProxy(NearbyTrackerModule nearbyTrackerModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(nearbyTrackerModule, r2);
    }

    private GriverUcServiceProxy(NearbyTrackerModule nearbyTrackerModule, PrepareException.AnonymousClass1 r3) {
        setMin setmin = new setMin(r3);
        this.length = setmin;
        d.AnonymousClass3.AnonymousClass1 length2 = d.AnonymousClass3.AnonymousClass1.length(setmin);
        this.getMax = length2;
        this.setMin = isScrap.getMin(GriverDefaultWebViewReceivedErrorExtension.AnonymousClass1.setMin(nearbyTrackerModule, length2));
    }

    public static final class getMin {
        public PrepareException.AnonymousClass1 getMin;
        public NearbyTrackerModule length;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }

        public final GriverWebEngineImpl.AnonymousClass1 getMin() {
            if (this.length == null) {
                this.length = new NearbyTrackerModule();
            }
            stopIgnoring.setMin(this.getMin, PrepareException.AnonymousClass1.class);
            return new GriverUcServiceProxy(this.length, this.getMin, (byte) 0);
        }
    }

    static class setMin implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 getMax;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.getMax.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void length(HomeShoppingTutorialFragment homeShoppingTutorialFragment) {
        k.AnonymousClass6.length(homeShoppingTutorialFragment, this.setMin.get());
    }

    public final void getMax(MerchantSearchResultFragment merchantSearchResultFragment) {
        AddPhoneContactBridgeExtension.AnonymousClass1.setMax(merchantSearchResultFragment, this.setMin.get());
    }
}
