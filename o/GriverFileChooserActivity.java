package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.nearbyme.merchantdetail.MerchantDetailActivity;
import o.GriverBaseFragmentActivity;
import o.GriverTransActivity;
import o.ShareMenu;
import o.b;

public final class GriverFileChooserActivity implements getAdapterPosition<showDeniedForCamera> {
    private final b.C0007b<isQAndAbove> getMin;
    private final b.C0007b<GriverBaseFragmentActivity.getMin> length;

    private GriverFileChooserActivity(b.C0007b<GriverBaseFragmentActivity.getMin> bVar, b.C0007b<isQAndAbove> bVar2) {
        this.length = bVar;
        this.getMin = bVar2;
    }

    public static GriverFileChooserActivity length(b.C0007b<GriverBaseFragmentActivity.getMin> bVar, b.C0007b<isQAndAbove> bVar2) {
        return new GriverFileChooserActivity(bVar, bVar2);
    }

    /* renamed from: o.GriverFileChooserActivity$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<MerchantDetailActivity> {
        @InjectedFieldSignature("id.dana.nearbyme.merchantdetail.MerchantDetailActivity.tracker")
        public static void setMax(MerchantDetailActivity merchantDetailActivity, ShareMenu.AnonymousClass1 r1) {
            merchantDetailActivity.tracker = r1;
        }

        @InjectedFieldSignature("id.dana.nearbyme.merchantdetail.MerchantDetailActivity.nearbyAnalyticTracker")
        public static void setMin(MerchantDetailActivity merchantDetailActivity, t tVar) {
            merchantDetailActivity.nearbyAnalyticTracker = tVar;
        }

        @InjectedFieldSignature("id.dana.nearbyme.merchantdetail.MerchantDetailActivity.merchantDetailPresenter")
        public static void length(MerchantDetailActivity merchantDetailActivity, GriverTransActivity.Lite1.setMax setmax) {
            merchantDetailActivity.merchantDetailPresenter = setmax;
        }
    }

    public final /* synthetic */ Object get() {
        return new showDeniedForCamera(this.length.get(), this.getMin.get());
    }
}
