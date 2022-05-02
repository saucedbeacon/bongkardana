package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.base.BaseActivity;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.sendmoney.voucher.SummaryVoucherView;
import id.dana.sendmoney.voucher.VoucherDetailActivity;
import id.dana.sendmoney_v2.landing.SendMoneyActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.BindBitmap;
import o.IWorkManagerImplCallback;
import o.Ignore;
import o.enqueueWorkRequests;
import o.getDuration;
import o.getSelectedIndex;
import o.getTitleIcon_White;
import org.jetbrains.annotations.NotNull;

public final class AnimationUtil implements Ignore.setMin {
    private final VoucherDetailActivity length;
    private final setFillAfter setMax;

    public AnimationUtil(VoucherDetailActivity voucherDetailActivity, setFillAfter setfillafter) {
        this.length = voucherDetailActivity;
        this.setMax = setfillafter;
    }

    public final void length(int i) {
        VoucherDetailActivity.setMax(this.length, this.setMax, i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/director/SendMoneyScenarioDirectorFactory;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface OnAnimationStartListener {
        @NotNull
        public static final setMax setMax = setMax.getMin;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lid/dana/sendmoney_v2/director/SendMoneyScenarioDirectorFactory$Companion;", "", "()V", "create", "Lid/dana/sendmoney/SendMoneyScenarioDirector;", "activity", "Lid/dana/base/BaseActivity;", "isV2", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMax {
            static final /* synthetic */ setMax getMin = new setMax();

            private setMax() {
            }

            @JvmStatic
            @NotNull
            public static getCacheId getMax(@NotNull BaseActivity baseActivity, boolean z) {
                Intrinsics.checkNotNullParameter(baseActivity, AkuEventParamsKey.KEY_ACTIVITY);
                if (z) {
                    return new setTitleBarBackDrawable(baseActivity);
                }
                return new getCacheId(baseActivity);
            }
        }
    }

    public final class OnAnimationEndListener implements getBindingAdapter<SummaryVoucherView> {
        @InjectedFieldSignature("id.dana.sendmoney.voucher.SummaryVoucherView.voucherPresenter")
        public static void length(SummaryVoucherView summaryVoucherView, BindBitmap.getMin getmin) {
            summaryVoucherView.voucherPresenter = getmin;
        }
    }

    public final class OnAnimationRepeatListener implements getBindingAdapter<SendMoneyActivity> {
        @InjectedFieldSignature("id.dana.sendmoney_v2.landing.SendMoneyActivity.recipientPresenter")
        public static void setMin(SendMoneyActivity sendMoneyActivity, enqueueWorkRequests.length length) {
            sendMoneyActivity.recipientPresenter = length;
        }

        @InjectedFieldSignature("id.dana.sendmoney_v2.landing.SendMoneyActivity.billerX2BPresenter")
        public static void getMax(SendMoneyActivity sendMoneyActivity, IWorkManagerImplCallback.Stub.Proxy.getMin getmin) {
            sendMoneyActivity.billerX2BPresenter = getmin;
        }

        @InjectedFieldSignature("id.dana.sendmoney_v2.landing.SendMoneyActivity.bottomSheetOnBoardingPresenter")
        public static void length(SendMoneyActivity sendMoneyActivity, getSelectedIndex.length length) {
            sendMoneyActivity.bottomSheetOnBoardingPresenter = length;
        }

        @InjectedFieldSignature("id.dana.sendmoney_v2.landing.SendMoneyActivity.readDeepLinkPropertiesPresenter")
        public static void setMin(SendMoneyActivity sendMoneyActivity, getDuration.length length) {
            sendMoneyActivity.readDeepLinkPropertiesPresenter = length;
        }

        @InjectedFieldSignature("id.dana.sendmoney_v2.landing.SendMoneyActivity.kycAndDebitPayOptionPresenter")
        public static void setMin(SendMoneyActivity sendMoneyActivity, getTitleIcon_White.getMax getmax) {
            sendMoneyActivity.kycAndDebitPayOptionPresenter = getmax;
        }
    }
}
