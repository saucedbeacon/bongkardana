package o;

import android.view.View;
import dagger.internal.InjectedFieldSignature;
import id.dana.richview.SearchView;
import id.dana.richview.bank.AutoCompleteBankView;
import id.dana.richview.boundcard.BoundCardView;
import id.dana.richview.boundcard.DanaBalanceCardView;
import o.fakeDragBy;
import o.onNext;
import o.setAutoDismissEnabled$core;
import o.setColorSchemeColors;
import o.updateScreenRotation;
import o.y;

public final class GriverPhotoSelectActivity implements View.OnClickListener {
    private final SearchView setMax;

    public GriverPhotoSelectActivity(SearchView searchView) {
        this.setMax = searchView;
    }

    public final void onClick(View view) {
        this.setMax.getMax.onNext(Boolean.TRUE);
    }

    /* renamed from: o.GriverPhotoSelectActivity$6  reason: invalid class name */
    public final class AnonymousClass6 implements getBindingAdapter<AutoCompleteBankView> {
        @InjectedFieldSignature("id.dana.richview.bank.AutoCompleteBankView.presenter")
        public static void getMin(AutoCompleteBankView autoCompleteBankView, y.setMin setmin) {
            autoCompleteBankView.presenter = setmin;
        }
    }

    /* renamed from: o.GriverPhotoSelectActivity$8  reason: invalid class name */
    public final class AnonymousClass8 implements getBindingAdapter<DanaBalanceCardView> {
        @InjectedFieldSignature("id.dana.richview.boundcard.DanaBalanceCardView.dynamicUrlWrapper")
        public static void getMax(DanaBalanceCardView danaBalanceCardView, getShortName getshortname) {
            danaBalanceCardView.dynamicUrlWrapper = getshortname;
        }

        @InjectedFieldSignature("id.dana.richview.boundcard.DanaBalanceCardView.globalNetworkPresenter")
        public static void setMin(DanaBalanceCardView danaBalanceCardView, onNext.setMin setmin) {
            danaBalanceCardView.globalNetworkPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.richview.boundcard.DanaBalanceCardView.goalsPresenter")
        public static void setMax(DanaBalanceCardView danaBalanceCardView, updateScreenRotation.setMin setmin) {
            danaBalanceCardView.goalsPresenter = setmin;
        }
    }

    /* renamed from: o.GriverPhotoSelectActivity$9  reason: invalid class name */
    public final class AnonymousClass9 implements getBindingAdapter<BoundCardView> {
        @InjectedFieldSignature("id.dana.richview.boundcard.BoundCardView.presenter")
        public static void getMax(BoundCardView boundCardView, setColorSchemeColors.length length) {
            boundCardView.presenter = length;
        }

        @InjectedFieldSignature("id.dana.richview.boundcard.BoundCardView.queryPayMethodPresenter")
        public static void getMax(BoundCardView boundCardView, fakeDragBy.length length) {
            boundCardView.queryPayMethodPresenter = length;
        }

        @InjectedFieldSignature("id.dana.richview.boundcard.BoundCardView.userInfoPresenter")
        public static void setMin(BoundCardView boundCardView, setAutoDismissEnabled$core.setMin setmin) {
            boundCardView.userInfoPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.richview.boundcard.BoundCardView.globalNetworkPresenter")
        public static void getMin(BoundCardView boundCardView, onNext.setMin setmin) {
            boundCardView.globalNetworkPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.richview.boundcard.BoundCardView.boundCardMapper")
        public static void getMax(BoundCardView boundCardView, CaptureServiceImpl captureServiceImpl) {
            boundCardView.boundCardMapper = captureServiceImpl;
        }
    }
}
