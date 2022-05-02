package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.ap.zoloz.hummer.biz.HummerConstants;
import dagger.internal.InjectedFieldSignature;
import id.dana.R;
import id.dana.globalsearch.model.PaySearchInfoModel;
import id.dana.globalsearch.offlinemerchant.model.OfflineOnlineMerchantInfoModel;
import id.dana.globalsearch.tracker.model.SearchResultOpenTrackerModel;
import id.dana.globalsearch.view.GlobalSearchBottomSheetDialog;
import id.dana.globalsearch.view.GlobalSearchFragment;
import id.dana.globalsearch.view.sku.model.SKUModel;
import id.dana.home.HomeFragment;
import id.dana.home.HomeTabActivity;
import id.dana.home.KycAmlEddActivity;
import id.dana.home.NewHomeFragment;
import id.dana.home.model.EddInfoModel;
import id.dana.home.news.NewsFeedsView;
import id.dana.richview.imageview.ImageWithHorizontalDescriptionView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.BLEBridgeExtension;
import o.BindView;
import o.FileMangerBridgeExtension;
import o.MemoryWarningBridgeExtension;
import o.MultilevelSelectActivity;
import o.MultilevelSelectCallBack;
import o.PdfImageSource;
import o.R;
import o.TitleBarExtension;
import o.ToolUtils;
import o.VersionedParcelize;
import o.ViewPager2;
import o.fakeDragBy;
import o.getAlpha;
import o.getDuration;
import o.getRunningAnimators;
import o.getSelectedIndex;
import o.getTranslateY;
import o.inTransaction;
import o.moveToStart;
import o.onDelete;
import o.onFailure;
import o.onNext;
import o.parameters;
import o.parentColumns;
import o.remover;
import o.resetInternal;
import o.restoreState;
import o.setTrimPathOffset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0002¨\u0006\u000b"}, d2 = {"Lid/dana/globalsearch/offlinemerchant/adapter/OfflineMerchantItemViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/globalsearch/model/PaySearchInfoModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "setDataToView", "merchant", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverManifest extends Ignore<PaySearchInfoModel> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lid/dana/home/OnboardingEvent;", "", "onEddStep", "", "onFaceLoginStep", "onGnOnboardingStep", "onInterstitialStep", "onKycRenewalStep", "onNormalTooltipStep", "onPaymentSettingStep", "onQcbOnboardingStep", "onReferralEngagementDialogStep", "onTnCStep", "onTwilioStep", "onUgcStep", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.GriverManifest$46  reason: invalid class name */
    public interface AnonymousClass46 {
        void IsOverlapping();

        void equals();

        void getMax();

        void getMin();

        void isInside();

        void length();

        void setMax();

        void setMin();

        void toDoubleRange();

        void toFloatRange();

        void toIntRange();

        void values();
    }

    /* renamed from: o.GriverManifest$53  reason: invalid class name */
    public interface AnonymousClass53 {
        void getMax(String str);

        void getMax(String str, boolean z);

        void getMin();

        void getMin(String str);

        void length();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/globalsearch/tracker/GlobalSearchAnalyticTracker;", "", "trackExploreDanaOpen", "", "trackGlobalSearchOpen", "trackPopUpEnableLocationOpen", "trackSearchResultBottomSheetDetailOpen", "trackSearchResultPageActionButton", "paySearchInfoModel", "Lid/dana/globalsearch/model/PaySearchInfoModel;", "trackSearchResultPageOpen", "searchResultOpenTrackerModel", "Lid/dana/globalsearch/tracker/model/SearchResultOpenTrackerModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.GriverManifest$11  reason: invalid class name */
    public interface AnonymousClass11 {
        void getMax();

        void getMax(@NotNull PaySearchInfoModel paySearchInfoModel);

        void getMin();

        void setMax();

        void setMax(@NotNull SearchResultOpenTrackerModel searchResultOpenTrackerModel);

        void setMin();
    }

    /* renamed from: o.GriverManifest$16  reason: invalid class name */
    public interface AnonymousClass16 {

        /* renamed from: o.GriverManifest$16$getMin */
        public interface getMin {
            void setMax(boolean z);
        }

        /* renamed from: o.GriverManifest$16$setMax */
        public interface setMax extends onDelete.getMin {
            void length();

            void setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* renamed from: o.GriverManifest$18  reason: invalid class name */
    public final /* synthetic */ class AnonymousClass18 {
        public static final /* synthetic */ int[] getMax;

        static {
            int[] iArr = new int[SKUModel.MerchantState.values().length];
            getMax = iArr;
            iArr[SKUModel.MerchantState.CLOSED.ordinal()] = 1;
            getMax[SKUModel.MerchantState.OUT_OF_STOCK.ordinal()] = 2;
        }
    }

    /* renamed from: o.GriverManifest$22  reason: invalid class name */
    public interface AnonymousClass22 {

        /* renamed from: o.GriverManifest$22$getMin */
        public interface getMin extends onDelete.getMin {
            void getMin();

            void length();
        }

        /* renamed from: o.GriverManifest$22$length */
        public interface length {
            void setMin(boolean z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/home/promobanner/NewPromoBannerContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.GriverManifest$8  reason: invalid class name */
    public interface AnonymousClass8 {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lid/dana/home/promobanner/NewPromoBannerContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onFinishGetPromoCenterConfig", "", "promoCenterConfig", "Lid/dana/domain/featureconfig/model/PromoCenterConfig;", "onGetPromoCenterBannerSuccess", "promotionModel", "Lid/dana/model/PromotionModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.GriverManifest$8$length */
        public interface length extends parentColumns.getMax {
            void onFinishGetPromoCenterConfig(@NotNull getPageUrl getpageurl);

            void onGetPromoCenterBannerSuccess(@NotNull LoadingBridgeExtension loadingBridgeExtension);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lid/dana/home/promobanner/NewPromoBannerContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "getPromoCenterBanner", "", "getPromoCenterConfig", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.GriverManifest$8$setMax */
        public interface setMax extends parentColumns.setMin {
            void getMax();

            void length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lid/dana/home/model/EddConsultModel;", "", "eddStatus", "", "eddInfo", "Lid/dana/home/model/EddInfoModel;", "eddMandatory", "(ZLid/dana/home/model/EddInfoModel;Z)V", "getEddInfo", "()Lid/dana/home/model/EddInfoModel;", "getEddMandatory", "()Z", "getEddStatus", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.GriverManifest$6  reason: invalid class name */
    public final class AnonymousClass6 {
        @Nullable
        public final EddInfoModel getMin;
        private final boolean length;
        private final boolean setMin;

        public AnonymousClass6() {
            this((byte) 0);
        }

        public AnonymousClass6(boolean z, @Nullable EddInfoModel eddInfoModel, boolean z2) {
            this.length = z;
            this.getMin = eddInfoModel;
            this.setMin = z2;
        }

        public final boolean setMin() {
            return this.length;
        }

        public /* synthetic */ AnonymousClass6(byte b) {
            this(false, new EddInfoModel((byte) 0), false);
        }

        public final boolean getMin() {
            return this.setMin;
        }
    }

    public final /* synthetic */ void setMax(Object obj) {
        ImageWithHorizontalDescriptionView imageWithHorizontalDescriptionView;
        PaySearchInfoModel paySearchInfoModel = (PaySearchInfoModel) obj;
        if (paySearchInfoModel != null && (imageWithHorizontalDescriptionView = (ImageWithHorizontalDescriptionView) this.itemView.findViewById(resetInternal.setMax.dispatchSubMenuSelected)) != null) {
            String displayedShopLogo = paySearchInfoModel.getDisplayedShopLogo();
            if (displayedShopLogo == null) {
                displayedShopLogo = "";
            }
            imageWithHorizontalDescriptionView.showImage(displayedShopLogo, R.drawable.ic_merchant_logo_placeholder);
            imageWithHorizontalDescriptionView.setTitleText(paySearchInfoModel.getName());
            OfflineOnlineMerchantInfoModel offlineOnlineMerchantInfoModel = (OfflineOnlineMerchantInfoModel) setBridgeManifests.length(paySearchInfoModel.getInfo(), OfflineOnlineMerchantInfoModel.class);
            if (offlineOnlineMerchantInfoModel.isVerified()) {
                Context context = imageWithHorizontalDescriptionView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                Drawable max = startBeaconDiscovery.getMax(context, R.drawable.ic_verify_blue);
                Intrinsics.checkNotNull(max);
                imageWithHorizontalDescriptionView.setTitleBadge(max);
            } else if (offlineOnlineMerchantInfoModel.isKyb()) {
                Context context2 = imageWithHorizontalDescriptionView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
                Drawable max2 = startBeaconDiscovery.getMax(context2, R.drawable.ic_dana_bisnis_blue);
                Intrinsics.checkNotNull(max2);
                imageWithHorizontalDescriptionView.setTitleBadgeWithVector(max2);
            } else {
                imageWithHorizontalDescriptionView.setFirstLineBadgeGone();
            }
            imageWithHorizontalDescriptionView.setBottomLineFirstText(paySearchInfoModel.getMccName());
            imageWithHorizontalDescriptionView.setDistanceText(paySearchInfoModel.getDistance());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GriverManifest(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_search_result, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    /* renamed from: o.GriverManifest$10  reason: invalid class name */
    public final class AnonymousClass10 implements getBindingAdapter<GlobalSearchBottomSheetDialog> {
        @InjectedFieldSignature("id.dana.globalsearch.view.GlobalSearchBottomSheetDialog.presenter")
        public static void getMin(GlobalSearchBottomSheetDialog globalSearchBottomSheetDialog, getTranslateY.setMax setmax) {
            globalSearchBottomSheetDialog.presenter = setmax;
        }

        @InjectedFieldSignature("id.dana.globalsearch.view.GlobalSearchBottomSheetDialog.readDeepLinkPropertiesPresenter")
        public static void getMax(GlobalSearchBottomSheetDialog globalSearchBottomSheetDialog, getDuration.length length) {
            globalSearchBottomSheetDialog.readDeepLinkPropertiesPresenter = length;
        }

        @InjectedFieldSignature("id.dana.globalsearch.view.GlobalSearchBottomSheetDialog.qrPresenter")
        public static void getMin(GlobalSearchBottomSheetDialog globalSearchBottomSheetDialog, R.id.getMax getmax) {
            globalSearchBottomSheetDialog.qrPresenter = getmax;
        }
    }

    /* renamed from: o.GriverManifest$34  reason: invalid class name */
    public final class AnonymousClass34 implements getBindingAdapter<KycAmlEddActivity> {
        @InjectedFieldSignature("id.dana.home.KycAmlEddActivity.kycAmlEddPresenter")
        public static void length(KycAmlEddActivity kycAmlEddActivity, JSAPIMonitorExtension jSAPIMonitorExtension) {
            kycAmlEddActivity.kycAmlEddPresenter = jSAPIMonitorExtension;
        }
    }

    /* renamed from: o.GriverManifest$55  reason: invalid class name */
    public final class AnonymousClass55 implements getBindingAdapter<NewsFeedsView> {
        @InjectedFieldSignature("id.dana.home.news.NewsFeedsView.featurePresenter")
        public static void getMax(NewsFeedsView newsFeedsView, getRunningAnimators.setMax setmax) {
            newsFeedsView.featurePresenter = setmax;
        }

        @InjectedFieldSignature("id.dana.home.news.NewsFeedsView.presenter")
        public static void getMin(NewsFeedsView newsFeedsView, setTrimPathOffset.setMax setmax) {
            newsFeedsView.presenter = setmax;
        }

        @InjectedFieldSignature("id.dana.home.news.NewsFeedsView.readDeepLinkPropertiesPresenter")
        public static void length(NewsFeedsView newsFeedsView, getDuration.length length) {
            newsFeedsView.readDeepLinkPropertiesPresenter = length;
        }

        @InjectedFieldSignature("id.dana.home.news.NewsFeedsView.restoreUrlPresenter")
        public static void getMax(NewsFeedsView newsFeedsView, BindView.setMin setmin) {
            newsFeedsView.restoreUrlPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.home.news.NewsFeedsView.scanQrPresenter")
        public static void setMin(NewsFeedsView newsFeedsView, R.id.getMax getmax) {
            newsFeedsView.scanQrPresenter = getmax;
        }
    }

    /* renamed from: o.GriverManifest$12  reason: invalid class name */
    public final class AnonymousClass12 implements getBindingAdapter<GlobalSearchFragment> {
        @InjectedFieldSignature("id.dana.globalsearch.view.GlobalSearchFragment.globalSearchAnalyticTracker")
        public static void getMax(GlobalSearchFragment globalSearchFragment, AnonymousClass11 r1) {
            globalSearchFragment.globalSearchAnalyticTracker = r1;
        }
    }

    /* renamed from: o.GriverManifest$31  reason: invalid class name */
    public final class AnonymousClass31 implements getBindingAdapter<HomeFragment> {
        @InjectedFieldSignature("id.dana.home.HomeFragment.dynamicUrlWrapper")
        public static void getMin(HomeFragment homeFragment, getShortName getshortname) {
            homeFragment.dynamicUrlWrapper = getshortname;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.getBalancePresenter")
        public static void getMax(HomeFragment homeFragment, parameters.setMax setmax) {
            homeFragment.getBalancePresenter = setmax;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.homeInfoContractPresenter")
        public static void setMax(HomeFragment homeFragment, VersionedParcelize.getMax getmax) {
            homeFragment.homeInfoContractPresenter = getmax;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.globalNetworkPresenter")
        public static void getMin(HomeFragment homeFragment, onNext.setMin setmin) {
            homeFragment.globalNetworkPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.locationPermissionSubject")
        public static void setMin(HomeFragment homeFragment, isAlipayApp isalipayapp) {
            homeFragment.locationPermissionSubject = isalipayapp;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.permissionStatePresenter")
        public static void setMax(HomeFragment homeFragment, ViewPager2.OffscreenPageLimit.length length) {
            homeFragment.permissionStatePresenter = length;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.queryPayMethodPresenter")
        public static void setMax(HomeFragment homeFragment, fakeDragBy.length length) {
            homeFragment.queryPayMethodPresenter = length;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.sessionExpiredManager")
        public static void getMin(HomeFragment homeFragment, CustomPopMenuExtension customPopMenuExtension) {
            homeFragment.sessionExpiredManager = customPopMenuExtension;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.unreadInboxPresenter")
        public static void getMin(HomeFragment homeFragment, restoreState.length length) {
            homeFragment.unreadInboxPresenter = length;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.onBoardingPresenter")
        public static void length(HomeFragment homeFragment, getSelectedIndex.length length) {
            homeFragment.onBoardingPresenter = length;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.sendMoneyV2Presenter")
        public static void setMax(HomeFragment homeFragment, onFailure.getMin getmin) {
            homeFragment.sendMoneyV2Presenter = getmin;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.geofencePresenter")
        public static void length(HomeFragment homeFragment, BLEBridgeExtension.AnonymousClass6 r1) {
            homeFragment.geofencePresenter = r1;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.geoFenceManager")
        public static void getMax(HomeFragment homeFragment, BLEBridgeExtension.AnonymousClass9 r1) {
            homeFragment.geoFenceManager = r1;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.logoutPresenter")
        public static void length(HomeFragment homeFragment, inTransaction.getMax getmax) {
            homeFragment.logoutPresenter = getmax;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.ottVerifyPresenter")
        public static void setMax(HomeFragment homeFragment, resetTouch resettouch) {
            homeFragment.ottVerifyPresenter = resettouch;
        }

        @InjectedFieldSignature("id.dana.home.HomeFragment.globalSearchPresenter")
        public static void setMin(HomeFragment homeFragment, getAlpha.length length) {
            homeFragment.globalSearchPresenter = length;
        }
    }

    /* renamed from: o.GriverManifest$49  reason: invalid class name */
    public final class AnonymousClass49 implements getBindingAdapter<NewHomeFragment> {
        @InjectedFieldSignature("id.dana.home.NewHomeFragment.dynamicUrlWrapper")
        public static void getMax(NewHomeFragment newHomeFragment, getShortName getshortname) {
            newHomeFragment.dynamicUrlWrapper = getshortname;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.geoFenceManager")
        public static void setMin(NewHomeFragment newHomeFragment, BLEBridgeExtension.AnonymousClass9 r1) {
            newHomeFragment.geoFenceManager = r1;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.geofencePresenter")
        public static void setMin(NewHomeFragment newHomeFragment, BLEBridgeExtension.AnonymousClass6 r1) {
            newHomeFragment.geofencePresenter = r1;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.getBalancePresenter")
        public static void getMax(NewHomeFragment newHomeFragment, parameters.setMax setmax) {
            newHomeFragment.getBalancePresenter = setmax;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.globalNetworkPresenter")
        public static void setMax(NewHomeFragment newHomeFragment, onNext.setMin setmin) {
            newHomeFragment.globalNetworkPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.homeInfoContractPresenter")
        public static void getMax(NewHomeFragment newHomeFragment, VersionedParcelize.getMax getmax) {
            newHomeFragment.homeInfoContractPresenter = getmax;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.locationPermissionSubject")
        public static void getMax(NewHomeFragment newHomeFragment, isAlipayApp isalipayapp) {
            newHomeFragment.locationPermissionSubject = isalipayapp;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.logoutPresenter")
        public static void setMax(NewHomeFragment newHomeFragment, inTransaction.getMax getmax) {
            newHomeFragment.logoutPresenter = getmax;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.onBoardingPresenter")
        public static void getMin(NewHomeFragment newHomeFragment, getSelectedIndex.length length) {
            newHomeFragment.onBoardingPresenter = length;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.ottVerifyPresenter")
        public static void getMax(NewHomeFragment newHomeFragment, resetTouch resettouch) {
            newHomeFragment.ottVerifyPresenter = resettouch;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.permissionStatePresenter")
        public static void setMin(NewHomeFragment newHomeFragment, ViewPager2.OffscreenPageLimit.length length) {
            newHomeFragment.permissionStatePresenter = length;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.sendMoneyV2Presenter")
        public static void getMin(NewHomeFragment newHomeFragment, onFailure.getMin getmin) {
            newHomeFragment.sendMoneyV2Presenter = getmin;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.globalSearchPresenter")
        public static void setMin(NewHomeFragment newHomeFragment, getAlpha.length length) {
            newHomeFragment.globalSearchPresenter = length;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.queryPayMethodPresenter")
        public static void length(NewHomeFragment newHomeFragment, fakeDragBy.length length) {
            newHomeFragment.queryPayMethodPresenter = length;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.sessionExpiredManager")
        public static void getMax(NewHomeFragment newHomeFragment, CustomPopMenuExtension customPopMenuExtension) {
            newHomeFragment.sessionExpiredManager = customPopMenuExtension;
        }

        @InjectedFieldSignature("id.dana.home.NewHomeFragment.unreadInboxPresenter")
        public static void length(NewHomeFragment newHomeFragment, restoreState.length length) {
            newHomeFragment.unreadInboxPresenter = length;
        }
    }

    /* renamed from: o.GriverManifest$29  reason: invalid class name */
    public final class AnonymousClass29 implements getBindingAdapter<HomeTabActivity> {
        @InjectedFieldSignature("id.dana.home.HomeTabActivity.playStoreReviewPresenter")
        public static void getMin(HomeTabActivity homeTabActivity, PdfImageSource.setMin setmin) {
            homeTabActivity.playStoreReviewPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.home.HomeTabActivity.danaContactPresenter")
        public static void length(HomeTabActivity homeTabActivity, moveToStart.setMin setmin) {
            homeTabActivity.danaContactPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.home.HomeTabActivity.tncSummaryPresenter")
        public static void setMin(HomeTabActivity homeTabActivity, ToolUtils.setMin setmin) {
            homeTabActivity.tncSummaryPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.home.HomeTabActivity.paymentSettingPresenter")
        public static void setMin(HomeTabActivity homeTabActivity, FileMangerBridgeExtension.AnonymousClass1.getMax getmax) {
            homeTabActivity.paymentSettingPresenter = getmax;
        }

        @InjectedFieldSignature("id.dana.home.HomeTabActivity.faceAuthPopUpConsultationPresenter")
        public static void setMin(HomeTabActivity homeTabActivity, remover.getMin getmin) {
            homeTabActivity.faceAuthPopUpConsultationPresenter = getmin;
        }

        @InjectedFieldSignature("id.dana.home.HomeTabActivity.kycRenewalPresenter")
        public static void setMin(HomeTabActivity homeTabActivity, AboutInfoBridgeExtension aboutInfoBridgeExtension) {
            homeTabActivity.kycRenewalPresenter = aboutInfoBridgeExtension;
        }

        @InjectedFieldSignature("id.dana.home.HomeTabActivity.twilioDialogPresenter")
        public static void getMin(HomeTabActivity homeTabActivity, MultilevelSelectActivity.AnonymousClass1.length length) {
            homeTabActivity.twilioDialogPresenter = length;
        }

        @InjectedFieldSignature("id.dana.home.HomeTabActivity.twilioIntroductionPresenter")
        public static void getMax(HomeTabActivity homeTabActivity, TitleBarExtension.AnonymousClass1.getMin getmin) {
            homeTabActivity.twilioIntroductionPresenter = getmin;
        }

        @InjectedFieldSignature("id.dana.home.HomeTabActivity.kycAmlEddPresenter")
        public static void setMin(HomeTabActivity homeTabActivity, JSAPIMonitorExtension jSAPIMonitorExtension) {
            homeTabActivity.kycAmlEddPresenter = jSAPIMonitorExtension;
        }

        @InjectedFieldSignature("id.dana.home.HomeTabActivity.globalNetworkPresenter")
        public static void getMax(HomeTabActivity homeTabActivity, onNext.setMin setmin) {
            homeTabActivity.globalNetworkPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.home.HomeTabActivity.miniProgramPresenter")
        public static void getMax(HomeTabActivity homeTabActivity, EmbedViewBridgeExtension embedViewBridgeExtension) {
            homeTabActivity.miniProgramPresenter = embedViewBridgeExtension;
        }

        @InjectedFieldSignature("id.dana.home.HomeTabActivity.userConfigPresenter")
        public static void setMin(HomeTabActivity homeTabActivity, MultilevelSelectCallBack.getMin getmin) {
            homeTabActivity.userConfigPresenter = getmin;
        }

        @InjectedFieldSignature("id.dana.home.HomeTabActivity.feedsContentAction")
        public static void length(HomeTabActivity homeTabActivity, AUIconDrawable aUIconDrawable) {
            homeTabActivity.feedsContentAction = aUIconDrawable;
        }

        @InjectedFieldSignature("id.dana.home.HomeTabActivity.referralDialogPresenter")
        public static void setMax(HomeTabActivity homeTabActivity, MemoryWarningBridgeExtension.AnonymousClass1.setMax setmax) {
            homeTabActivity.referralDialogPresenter = setmax;
        }
    }
}
