package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.nearbyme.merchantdetail.enums.MerchantMenu;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantAverageRatingView;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantDanaDealsView;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantDetailMenuView;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantInfoView;
import id.dana.nearbyme.merchantreview.model.MerchantReviewDialogDismissState;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import o.GriverBaseFragmentActivity;
import o.OptionMenuRecyclerAdapter;
import o.getInputContent;
import o.onSettingChange;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class UniformOptionMenuPanelExtensionImpl {
    public static final /* synthetic */ int[] getMax;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* renamed from: o.UniformOptionMenuPanelExtensionImpl$6  reason: invalid class name */
    public final /* synthetic */ class AnonymousClass6 {
        public static final /* synthetic */ int[] getMax;

        static {
            int[] iArr = new int[MerchantMenu.values().length];
            getMax = iArr;
            iArr[MerchantMenu.RESERVE.ordinal()] = 1;
            getMax[MerchantMenu.PICK_UP.ordinal()] = 2;
            getMax[MerchantMenu.CONTACT_US.ordinal()] = 3;
            getMax[MerchantMenu.DIRECTION.ordinal()] = 4;
            getMax[MerchantMenu.TOP_UP.ordinal()] = 5;
            getMax[MerchantMenu.HOME_SHOPPING.ordinal()] = 6;
        }
    }

    static {
        int[] iArr = new int[MerchantReviewDialogDismissState.values().length];
        getMax = iArr;
        iArr[MerchantReviewDialogDismissState.DISMISSED_BY_CANCEL.ordinal()] = 1;
        getMax[MerchantReviewDialogDismissState.DISMISSED_BY_SUBMIT.ordinal()] = 2;
    }

    /* renamed from: o.UniformOptionMenuPanelExtensionImpl$3  reason: invalid class name */
    public final class AnonymousClass3 implements getBindingAdapter<MerchantAverageRatingView> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.UniformOptionMenuPanelExtensionImpl$3$1  reason: invalid class name */
        public interface AnonymousClass1 {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onSuccessGetReviewList", "", "merchantReviewsModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewResultModel;", "onSuccessLoadMoreReview", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.UniformOptionMenuPanelExtensionImpl$3$1$length */
            public interface length extends parentColumns.getMax {
                @JvmDefault
                void onSuccessGetReviewList(@NotNull OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass2 r1);

                @JvmDefault
                void onSuccessLoadMoreReview(@NotNull OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass2 r1);
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "pageNumber", "", "getPageNumber", "()I", "setPageNumber", "(I)V", "disposeGetReview", "", "getReview", "merchantId", "", "shopId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.UniformOptionMenuPanelExtensionImpl$3$1$setMin */
            public interface setMin extends parentColumns.setMin {
                boolean getMax();

                int getMin();

                void length(@NotNull String str, @NotNull String str2);

                void setMin();
            }
        }

        @InjectedFieldSignature("id.dana.nearbyme.merchantdetail.viewcomponent.MerchantAverageRatingView.presenter")
        public static void setMax(MerchantAverageRatingView merchantAverageRatingView, onSettingChange.length length) {
            merchantAverageRatingView.presenter = length;
        }
    }

    /* renamed from: o.UniformOptionMenuPanelExtensionImpl$5  reason: invalid class name */
    public final class AnonymousClass5 implements getBindingAdapter<MerchantDanaDealsView> {
        @InjectedFieldSignature("id.dana.nearbyme.merchantdetail.viewcomponent.MerchantDanaDealsView.presenter")
        public static void setMin(MerchantDanaDealsView merchantDanaDealsView, AnonymousClass1.AnonymousClass1.getMin getmin) {
            merchantDanaDealsView.presenter = getmin;
        }
    }

    public final class GoToAboutClickListener implements getBindingAdapter<MerchantInfoView> {
        @InjectedFieldSignature("id.dana.nearbyme.merchantdetail.viewcomponent.MerchantInfoView.merchantInfoPresenter")
        public static void getMax(MerchantInfoView merchantInfoView, getInputContent.setMin setmin) {
            merchantInfoView.merchantInfoPresenter = setmin;
        }
    }

    /* renamed from: o.UniformOptionMenuPanelExtensionImpl$4  reason: invalid class name */
    public final class AnonymousClass4 implements getBindingAdapter<MerchantDetailMenuView> {
        @InjectedFieldSignature("id.dana.nearbyme.merchantdetail.viewcomponent.MerchantDetailMenuView.h5Launcher")
        public static void setMin(MerchantDetailMenuView merchantDetailMenuView, createPayloadsIfNeeded createpayloadsifneeded) {
            merchantDetailMenuView.h5Launcher = createpayloadsifneeded;
        }

        @InjectedFieldSignature("id.dana.nearbyme.merchantdetail.viewcomponent.MerchantDetailMenuView.configPresenter")
        public static void getMax(MerchantDetailMenuView merchantDetailMenuView, GriverBaseFragmentActivity.getMax getmax) {
            merchantDetailMenuView.configPresenter = getmax;
        }
    }
}
