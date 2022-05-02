package id.dana.nearbyrevamp.merchantdetail;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Slide;
import androidx.transition.Transition;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.MerchantAverageRatingModule;
import id.dana.di.modules.MerchantDanaDealsModule;
import id.dana.di.modules.MerchantDetailConfigModule;
import id.dana.di.modules.MerchantDetailReviewModule;
import id.dana.nearbyme.merchantreview.MerchantReviewDialogFragment;
import id.dana.nearbyme.merchantreview.ViewRatingStarBar;
import id.dana.nearbyme.merchantreview.model.MerchantConsultReviewModel;
import id.dana.nearbyme.merchantreview.model.MerchantReviewDialogDismissState;
import id.dana.nearbyme.model.ContactAddressModel;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.merchantbanner.MerchantBannerView;
import id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView;
import id.dana.nearbyrevamp.model.MerchantBannerItemModel;
import id.dana.nearbyrevamp.view.MerchantActionListView;
import id.dana.nearbyrevamp.view.NewMerchantAddressInfoView;
import id.dana.nearbyrevamp.view.RatingStarView;
import id.dana.nearbyrevamp.view.UserReviewView;
import id.dana.scanner.ScannerActivity;
import id.dana.tracker.TrackerKey;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.GriverBaseFragment;
import o.GriverBaseFragmentActivity;
import o.GriverCommonAbilityProxyImpl;
import o.GriverCommonResourceProxy;
import o.GriverOpenSettingListAdapter;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.LifeCycle;
import o.OptionMenuRecyclerAdapter;
import o.PrepareException;
import o.SettingMenu;
import o.ShareMenu;
import o.SimpleListAdapter;
import o.TabBarDataStorage;
import o.UniformOptionMenuPanelExtensionImpl;
import o.f;
import o.getBluetoothAdapterState;
import o.getDevicePerformance;
import o.getSerialNumberEncrypt;
import o.hasRootStatusPermission;
import o.isHideOnContentScrollEnabled;
import o.onDelete;
import o.onSettingChange;
import o.onStateChange;
import o.resetInternal;
import o.setActionOn;
import o.setOnSettingChangeListener;
import o.stopIgnoring;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 §\u00012\u00020\u0001:\u0006§\u0001¨\u0001©\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0012\u0010X\u001a\u00020:2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0002J\b\u0010[\u001a\u00020:H\u0002J\b\u0010\\\u001a\u00020:H\u0002J+\u0010]\u001a\u00020:2!\u0010^\u001a\u001d\u0012\u0013\u0012\u00110_¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(`\u0012\u0004\u0012\u00020:05H\u0002J\u0006\u0010a\u001a\u00020\u0007J\b\u0010b\u001a\u00020\u0007H\u0016J\b\u0010c\u001a\u00020:H\u0002J\b\u0010d\u001a\u00020eH\u0002J\b\u0010f\u001a\u00020gH\u0002J\b\u0010h\u001a\u00020iH\u0002J\b\u0010j\u001a\u00020\u001dH\u0002J\b\u0010k\u001a\u00020,H\u0002J\b\u0010l\u001a\u00020:H\u0002J\b\u0010m\u001a\u00020nH\u0002J\b\u0010o\u001a\u00020:H\u0002J\b\u0010p\u001a\u000204H\u0002J\u0010\u0010q\u001a\u00020:2\u0006\u0010r\u001a\u00020sH\u0002J\u0012\u0010t\u001a\u00020:2\b\u0010u\u001a\u0004\u0018\u00010vH\u0016J\u0010\u0010w\u001a\u00020:2\u0006\u0010x\u001a\u00020\u0010H\u0014J\b\u0010y\u001a\u00020\u0010H\u0002J\b\u0010z\u001a\u00020\u0010H\u0002J\u0010\u0010{\u001a\u00020\u00102\u0006\u0010|\u001a\u00020\u0007H\u0002J\u000e\u0010}\u001a\u00020:2\u0006\u00109\u001a\u000206J\b\u0010~\u001a\u00020:H\u0002J\u0006\u0010\u001a\u00020:J\t\u0010\u0001\u001a\u00020:H\u0002J\u001c\u0010\u0001\u001a\u00020:2\u0007\u0010\u0001\u001a\u00020\u00072\b\u0010\u0001\u001a\u00030\u0001H\u0002J\t\u0010\u0001\u001a\u00020:H\u0002J\u0007\u0010\u0001\u001a\u00020:J\t\u0010\u0001\u001a\u00020:H\u0002J\u0012\u0010\u0001\u001a\u00020:2\u0007\u0010\u0001\u001a\u00020\u0010H\u0002J\u0011\u0010\u0001\u001a\u00020:2\b\u0010\u0001\u001a\u00030\u0001J\u0007\u0010\u0001\u001a\u00020:J\u0007\u0010\u0001\u001a\u00020:J\t\u0010\u0001\u001a\u00020:H\u0002J\u0011\u0010\u0001\u001a\u00020:2\u0006\u00109\u001a\u000206H\u0002J\u0017\u0010\u0001\u001a\u00020:2\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020:0\u0001J\t\u0010\u0001\u001a\u00020:H\u0016J\t\u0010\u0001\u001a\u00020:H\u0002J\t\u0010\u0001\u001a\u00020:H\u0002J*\u0010\u0001\u001a\u00020:2\u0006\u00109\u001a\u0002062\u0007\u0010\u0001\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020:0\u0001J\u0010\u0010\u0001\u001a\u00020:2\u0007\u0010\u0001\u001a\u00020\u0010J\u0010\u0010\u0001\u001a\u00020:2\u0007\u0010\u0001\u001a\u00020\u0010J\u0018\u0010\u0001\u001a\u00020:2\u0006\u00109\u001a\u0002062\u0007\u0010\u0001\u001a\u00020\u000fJ\u0007\u0010\u0001\u001a\u00020:J\u0012\u0010\u0001\u001a\u00020:2\u0007\u0010\u0001\u001a\u00020\u000fH\u0002J\u000f\u0010 \u0001\u001a\u00020:2\u0006\u00109\u001a\u000206J+\u0010¡\u0001\u001a\u00020:2\u000f\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030¤\u00010£\u00012\u000f\u0010¥\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010£\u0001H\u0002R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010$\u001a\u0004\u0018\u00010%@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X.¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X.¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X.¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X.¢\u0006\u0002\n\u0000R^\u0010;\u001a\u001f\u0012\u0013\u0012\u001106¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020:\u0018\u0001052#\u0010$\u001a\u001f\u0012\u0013\u0012\u001106¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020:\u0018\u000105@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010@\u001a\u00020A8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001e\u0010F\u001a\u00020G8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001e\u0010L\u001a\u00020M8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0010\u00109\u001a\u0004\u0018\u000106X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010R\u001a\u00020S8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006ª\u0001"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "concatAdapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "currentShopLoaded", "Lkotlin/Pair;", "", "", "isFetchingReviews", "merchantActionInfoAdapter", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantActionInfoAdapter;", "merchantContactInfoAdapter", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantContactInfoAdapter;", "merchantDetailConfigPresenter", "Lid/dana/nearbyme/merchantdetail/MerchantDetailConfigContract$Presenter;", "getMerchantDetailConfigPresenter", "()Lid/dana/nearbyme/merchantdetail/MerchantDetailConfigContract$Presenter;", "setMerchantDetailConfigPresenter", "(Lid/dana/nearbyme/merchantdetail/MerchantDetailConfigContract$Presenter;)V", "merchantDetailPhotoAdapter", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantDetailPhotoAdapter;", "merchantDetailState", "Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailState;", "getMerchantDetailState", "()Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailState;", "setMerchantDetailState", "(Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailState;)V", "value", "Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailViewListener;", "merchantDetailViewListener", "getMerchantDetailViewListener", "()Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailViewListener;", "setMerchantDetailViewListener", "(Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailViewListener;)V", "merchantHeaderInfoAdapter", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantHeaderInfoAdapter;", "merchantPromoDealsInfoAdapter", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantPromoDealsInfoAdapter;", "merchantQrisInfoAdapter", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantQrisInfoAdapter;", "merchantReviewsAdapter", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantReviewsInfoAdapter;", "merchantUserReviewAdapter", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter;", "Lkotlin/Function1;", "Lid/dana/nearbyme/model/ShopModel;", "Lkotlin/ParameterName;", "name", "shopModel", "", "onOtherStoreClicked", "getOnOtherStoreClicked", "()Lkotlin/jvm/functions/Function1;", "setOnOtherStoreClicked", "(Lkotlin/jvm/functions/Function1;)V", "promoDealsPresenter", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsContract$Presenter;", "getPromoDealsPresenter", "()Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsContract$Presenter;", "setPromoDealsPresenter", "(Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsContract$Presenter;)V", "ratingPresenter", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingContract$Presenter;", "getRatingPresenter", "()Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingContract$Presenter;", "setRatingPresenter", "(Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingContract$Presenter;)V", "reviewPresenter", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$Presenter;", "getReviewPresenter", "()Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$Presenter;", "setReviewPresenter", "(Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$Presenter;)V", "tracker", "Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;", "getTracker", "()Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;", "setTracker", "(Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;)V", "checkIsMerchantPhotoShown", "topViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "displayShimmerState", "disposeMerchantDetailPresenter", "doOnMerchantDetailInteractionImplemented", "action", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantDetailInteraction;", "merchantDetailInteraction", "getHeaderInfoViewBottom", "getLayout", "getMerchantAverageRating", "getMerchantAverageRatingModule", "Lid/dana/di/modules/MerchantAverageRatingModule;", "getMerchantDanaDealsModule", "Lid/dana/di/modules/MerchantDanaDealsModule;", "getMerchantDetailConfigModule", "Lid/dana/di/modules/MerchantDetailConfigModule;", "getMerchantDetailPhotoAdapter", "getMerchantHeaderInfoAdapter", "getMerchantPromoDeals", "getMerchantReviewDetailModule", "Lid/dana/di/modules/MerchantDetailReviewModule;", "getMerchantReviews", "getMerchantUserReviewAdapter", "handleOnReviewDialogDismiss", "dismissState", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewDialogDismissState;", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "injected", "isInjected", "isLastItemReviewItem", "isPhotoEmpty", "isUserReviewSectionVisible", "visibleItemPos", "loadCompleteMerchantDetailInfo", "onLoadMoreReviewClicked", "onMerchantDetailReset", "onTouchBottom", "openMerchantFormDialog", "rating", "reviewForm", "Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "openScannerPage", "scrollToTop", "setBackToTopListener", "setCvBackToTopVisibility", "show", "setOnBottomsheetDragged", "slideOffset", "", "setOnCollapsed", "setOnFull", "setRatingStateOnError", "setShopModel", "setTryAgainListener", "onTryAgainClicked", "Lkotlin/Function0;", "setup", "setupAdapter", "setupRecyclerView", "showCompleteShopDataWithPreviewFirst", "source", "onPreviewDataShown", "showComponentWhenFullState", "fullState", "showErrorState", "showPreviewShopData", "smoothScrollToTop", "trackMerchantDetailOpen", "updateImages", "updatePromoAndDealsInfo", "dealsInfoModel", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "promoInfoModel", "Lid/dana/nearbyme/model/PromoInfoModel;", "Companion", "MerchantDetailState", "MerchantDetailViewListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantDetailView extends BaseRichView {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    public static final double MIN_SLIDE_OFFSE_ANIMATION = 0.1d;
    public static final int SEE_MORE_BUTTON_POSITION = 1;
    private Pair<String, Boolean> FastBitmap$CoordinateSystem;
    private GriverCommonAbilityProxyImpl.AnonymousClass1.AnonymousClass2 IsOverlapping;
    private HashMap Mean$Arithmetic;
    /* access modifiers changed from: private */
    public GriverOpenSettingListAdapter.OnSettingChangeListener equals;
    private hasRootStatusPermission getMax;
    @Nullable
    private Function1<? super ShopModel, Unit> getMin;
    /* access modifiers changed from: private */
    public ShopModel hashCode;
    /* access modifiers changed from: private */
    public GriverCommonAbilityProxyImpl.AnonymousClass1 isInside;
    @Nullable
    private setMin length;
    @Inject
    public GriverBaseFragmentActivity.getMax merchantDetailConfigPresenter;
    @Inject
    public UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin promoDealsPresenter;
    @Inject
    public onSettingChange.length ratingPresenter;
    @Inject
    public UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin reviewPresenter;
    private GriverOpenSettingListAdapter.OpenSettingViewHolder setMax;
    @NotNull
    private MerchantDetailState setMin;
    /* access modifiers changed from: private */
    public boolean toDoubleRange;
    private setOnSettingChangeListener toFloatRange;
    /* access modifiers changed from: private */
    public GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1 toIntRange;
    private ConcatAdapter toString;
    @Inject
    public ShareMenu.AnonymousClass1 tracker;
    private GriverOpenSettingListAdapter values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailState;", "", "(Ljava/lang/String;I)V", "DEFAULT", "ERROR", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum MerchantDetailState {
        DEFAULT,
        ERROR
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailViewListener;", "", "onBackToTop", "", "onCloseBanner", "onHeaderInfoClicked", "onInfoUpdated", "onMerchantImagesUpdated", "onScroll", "merchantBannerOutOfScreen", "", "onSeeMoreClicked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin {
        void getMin();

        void getMin(boolean z);

        void length();

        void setMax();

        void setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function0<Unit> {
        public static final toDoubleRange INSTANCE = new toDoubleRange();

        toDoubleRange() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @JvmOverloads
    public MerchantDetailView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantDetailView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.Mean$Arithmetic;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.Mean$Arithmetic == null) {
            this.Mean$Arithmetic = new HashMap();
        }
        View view = (View) this.Mean$Arithmetic.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.Mean$Arithmetic.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_detail;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "result", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewDialogDismissState;", "invoke", "id/dana/nearbyrevamp/merchantdetail/MerchantDetailView$openMerchantFormDialog$1$2"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<MerchantReviewDialogDismissState, Unit> {
        final /* synthetic */ int $rating$inlined;
        final /* synthetic */ MerchantConsultReviewModel $reviewForm$inlined;
        final /* synthetic */ MerchantDetailView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(MerchantDetailView merchantDetailView, MerchantConsultReviewModel merchantConsultReviewModel, int i) {
            super(1);
            this.this$0 = merchantDetailView;
            this.$reviewForm$inlined = merchantConsultReviewModel;
            this.$rating$inlined = i;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((MerchantReviewDialogDismissState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull MerchantReviewDialogDismissState merchantReviewDialogDismissState) {
            Intrinsics.checkNotNullParameter(merchantReviewDialogDismissState, "result");
            MerchantDetailView.access$handleOnReviewDialogDismiss(this.this$0, merchantReviewDialogDismissState);
        }
    }

    public static final /* synthetic */ GriverCommonAbilityProxyImpl.AnonymousClass1 access$getMerchantActionInfoAdapter$p(MerchantDetailView merchantDetailView) {
        GriverCommonAbilityProxyImpl.AnonymousClass1 r1 = merchantDetailView.isInside;
        if (r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantActionInfoAdapter");
        }
        return r1;
    }

    public static final /* synthetic */ GriverOpenSettingListAdapter.OnSettingChangeListener access$getMerchantReviewsAdapter$p(MerchantDetailView merchantDetailView) {
        GriverOpenSettingListAdapter.OnSettingChangeListener onSettingChangeListener = merchantDetailView.equals;
        if (onSettingChangeListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantReviewsAdapter");
        }
        return onSettingChangeListener;
    }

    public static final /* synthetic */ GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1 access$getMerchantUserReviewAdapter$p(MerchantDetailView merchantDetailView) {
        GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1 r1 = merchantDetailView.toIntRange;
        if (r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantUserReviewAdapter");
        }
        return r1;
    }

    @NotNull
    public final GriverBaseFragmentActivity.getMax getMerchantDetailConfigPresenter() {
        GriverBaseFragmentActivity.getMax getmax = this.merchantDetailConfigPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailConfigPresenter");
        }
        return getmax;
    }

    public final void setMerchantDetailConfigPresenter(@NotNull GriverBaseFragmentActivity.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.merchantDetailConfigPresenter = getmax;
    }

    @NotNull
    public final onSettingChange.length getRatingPresenter() {
        onSettingChange.length length2 = this.ratingPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ratingPresenter");
        }
        return length2;
    }

    public final void setRatingPresenter(@NotNull onSettingChange.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.ratingPresenter = length2;
    }

    @NotNull
    public final UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin getPromoDealsPresenter() {
        UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin getmin = this.promoDealsPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("promoDealsPresenter");
        }
        return getmin;
    }

    public final void setPromoDealsPresenter(@NotNull UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.promoDealsPresenter = getmin;
    }

    @NotNull
    public final UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin getReviewPresenter() {
        UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin setmin = this.reviewPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewPresenter");
        }
        return setmin;
    }

    public final void setReviewPresenter(@NotNull UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.reviewPresenter = setmin;
    }

    @NotNull
    public final ShareMenu.AnonymousClass1 getTracker() {
        ShareMenu.AnonymousClass1 r0 = this.tracker;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tracker");
        }
        return r0;
    }

    public final void setTracker(@NotNull ShareMenu.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.tracker = r2;
    }

    @NotNull
    public final MerchantDetailState getMerchantDetailState() {
        return this.setMin;
    }

    public final void setMerchantDetailState(@NotNull MerchantDetailState merchantDetailState) {
        Intrinsics.checkNotNullParameter(merchantDetailState, "<set-?>");
        this.setMin = merchantDetailState;
    }

    @Nullable
    public final setMin getMerchantDetailViewListener() {
        return this.length;
    }

    public final void setMerchantDetailViewListener(@Nullable setMin setmin) {
        this.length = setmin;
        GriverOpenSettingListAdapter.OpenSettingViewHolder openSettingViewHolder = this.setMax;
        if (openSettingViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantHeaderInfoAdapter");
        }
        openSettingViewHolder.length = this.length;
    }

    @Nullable
    public final Function1<ShopModel, Unit> getOnOtherStoreClicked() {
        return this.getMin;
    }

    public final void setOnOtherStoreClicked(@Nullable Function1<? super ShopModel, Unit> function1) {
        this.getMin = function1;
        GriverCommonAbilityProxyImpl.AnonymousClass1.AnonymousClass2 r0 = this.IsOverlapping;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantContactInfoAdapter");
        }
        r0.getMax = function1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantDetailView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantDetailView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = MerchantDetailState.DEFAULT;
        this.FastBitmap$CoordinateSystem = new Pair<>("", Boolean.FALSE);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MerchantDetailView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = MerchantDetailState.DEFAULT;
        this.FastBitmap$CoordinateSystem = new Pair<>("", Boolean.FALSE);
    }

    private final void setMin(String str) {
        String str2;
        String str3;
        ShareMenu.AnonymousClass1 r0 = this.tracker;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tracker");
        }
        ShopModel shopModel = this.hashCode;
        String str4 = null;
        if (shopModel != null) {
            str2 = shopModel.asInterface;
        } else {
            str2 = null;
        }
        String str5 = "";
        if (str2 == null) {
            str2 = str5;
        }
        ShopModel shopModel2 = this.hashCode;
        if (shopModel2 != null) {
            str3 = shopModel2.invoke;
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = str5;
        }
        ShopModel shopModel3 = this.hashCode;
        if (shopModel3 != null) {
            str4 = shopModel3.getMin(",");
        }
        if (str4 != null) {
            str5 = str4;
        }
        r0.length(str, str2, str3, str5);
    }

    public final void injected(boolean z) {
        if (z) {
            GriverBaseFragmentActivity.getMax getmax = this.merchantDetailConfigPresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantDetailConfigPresenter");
            }
            getmax.getMax(true);
            onSettingChange.length length2 = this.ratingPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ratingPresenter");
            }
            length2.getMax();
            onSettingChange.length length3 = this.ratingPresenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ratingPresenter");
            }
            length3.getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/nearbyrevamp/merchantdetail/MerchantDetailView$getMerchantDetailConfigModule$1", "Lid/dana/nearbyme/merchantdetail/MerchantDetailConfigContract$View;", "onGetActionConfig", "", "merchantDetailConfig", "Lid/dana/domain/nearbyme/model/MerchantDetailConfig;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements GriverBaseFragmentActivity.getMin {
        final /* synthetic */ MerchantDetailView setMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        length(MerchantDetailView merchantDetailView) {
            this.setMin = merchantDetailView;
        }

        public final void onGetActionConfig(@NotNull getSerialNumberEncrypt getserialnumberencrypt) {
            Intrinsics.checkNotNullParameter(getserialnumberencrypt, "merchantDetailConfig");
            GriverCommonAbilityProxyImpl.AnonymousClass1 access$getMerchantActionInfoAdapter$p = MerchantDetailView.access$getMerchantActionInfoAdapter$p(this.setMin);
            ((LifeCycle) access$getMerchantActionInfoAdapter$p.getMax().get(0)).setMax = getserialnumberencrypt;
            access$getMerchantActionInfoAdapter$p.notifyItemChanged(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class hashCode extends FunctionReferenceImpl implements Function0<Unit> {
        hashCode(MerchantDetailView merchantDetailView) {
            super(0, merchantDetailView, MerchantDetailView.class, "onLoadMoreReviewClicked", "onLoadMoreReviewClicked()V", 0);
        }

        public final void invoke() {
            MerchantDetailView.access$onLoadMoreReviewClicked((MerchantDetailView) this.receiver);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class values implements Ignore.setMin {
        final /* synthetic */ MerchantDetailView getMin;

        values(MerchantDetailView merchantDetailView) {
            this.getMin = merchantDetailView;
        }

        public final void length(int i) {
            this.getMin.getBaseActivity().startActivity(new Intent(this.getMin.getBaseActivity(), ScannerActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"id/dana/nearbyrevamp/merchantdetail/MerchantDetailView$getMerchantAverageRatingModule$1", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingContract$View;", "getMerchantReviewFormFail", "", "getMerchantReviewFormSuccess", "reviewForm", "Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "onGetUserAccount", "userAccount", "Lid/dana/domain/account/Account;", "onGetUserReviewCoachmarkVisibility", "shouldVisible", "", "onLoadingMerchantAverageRatingFail", "onLoadingMerchantAverageRatingSuccess", "merchantReviewSummaryModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewSummaryModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements onSettingChange.setMax {
        final /* synthetic */ MerchantDetailView length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMax(MerchantDetailView merchantDetailView) {
            this.length = merchantDetailView;
        }

        public final void getMin(@NotNull onStateChange onstatechange) {
            Intrinsics.checkNotNullParameter(onstatechange, "merchantReviewSummaryModel");
            ShopModel access$getShopModel$p = this.length.hashCode;
            if (access$getShopModel$p == null) {
                return;
            }
            if (onstatechange.setMin()) {
                GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1 access$getMerchantUserReviewAdapter$p = MerchantDetailView.access$getMerchantUserReviewAdapter$p(this.length);
                OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 r4 = onstatechange.getMin;
                Intrinsics.checkNotNull(r4);
                Intrinsics.checkNotNullParameter(access$getShopModel$p, "shopModel");
                Intrinsics.checkNotNullParameter(r4, "userReview");
                List<SimpleListAdapter.SimpleViewHolder.AnonymousClass1> max = access$getMerchantUserReviewAdapter$p.setMax(access$getShopModel$p);
                SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMin getmin = SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMax;
                Intrinsics.checkNotNullParameter(r4, "merchantReviewModel");
                max.add(new SimpleListAdapter.SimpleViewHolder.AnonymousClass1(2, r4, (MerchantConsultReviewModel) null, (ShopModel) null, 12));
                Unit unit = Unit.INSTANCE;
                access$getMerchantUserReviewAdapter$p.getMin(max);
                return;
            }
            onSettingChange.length ratingPresenter = this.length.getRatingPresenter();
            String str = access$getShopModel$p.b;
            Intrinsics.checkNotNullExpressionValue(str, FeatureParams.SHOP_ID);
            ratingPresenter.length(str);
        }

        public final void length() {
            MerchantDetailView.access$setRatingStateOnError(this.length);
        }

        public final void getMin(@NotNull MerchantConsultReviewModel merchantConsultReviewModel) {
            Intrinsics.checkNotNullParameter(merchantConsultReviewModel, "reviewForm");
            ShopModel access$getShopModel$p = this.length.hashCode;
            if (access$getShopModel$p != null) {
                GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1 access$getMerchantUserReviewAdapter$p = MerchantDetailView.access$getMerchantUserReviewAdapter$p(this.length);
                Intrinsics.checkNotNullParameter(access$getShopModel$p, "shopModel");
                Intrinsics.checkNotNullParameter(merchantConsultReviewModel, "reviewForm");
                List<SimpleListAdapter.SimpleViewHolder.AnonymousClass1> max = access$getMerchantUserReviewAdapter$p.setMax(access$getShopModel$p);
                SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMin getmin = SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMax;
                Intrinsics.checkNotNullParameter(merchantConsultReviewModel, "reviewForm");
                max.add(new SimpleListAdapter.SimpleViewHolder.AnonymousClass1(4, (OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1) null, merchantConsultReviewModel, (ShopModel) null, 10));
                Unit unit = Unit.INSTANCE;
                access$getMerchantUserReviewAdapter$p.getMin(max);
            }
        }

        public final void setMax() {
            MerchantDetailView.access$setRatingStateOnError(this.length);
        }

        public final void setMin(boolean z) {
            MerchantDetailView.access$getMerchantUserReviewAdapter$p(this.length).length = z;
        }

        public final void length(@Nullable GriverCommonResourceProxy griverCommonResourceProxy) {
            MerchantDetailView.access$getMerchantUserReviewAdapter$p(this.length).getMax = griverCommonResourceProxy;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"id/dana/nearbyrevamp/merchantdetail/MerchantDetailView$getMerchantReviewDetailModule$1", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$View;", "onError", "", "errorMessage", "", "onSuccessGetReviewList", "merchantReviewsModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewResultModel;", "onSuccessLoadMoreReview", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange implements UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.length {
        final /* synthetic */ MerchantDetailView getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void showProgress() {
        }

        toFloatRange(MerchantDetailView merchantDetailView) {
            this.getMax = merchantDetailView;
        }

        public final void onSuccessGetReviewList(@NotNull OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass2 r3) {
            Intrinsics.checkNotNullParameter(r3, "merchantReviewsModel");
            this.getMax.toDoubleRange = false;
            MerchantDetailView.access$getMerchantReviewsAdapter$p(this.getMax).getMin(f.AnonymousClass5.setMax(r3));
        }

        public final void onSuccessLoadMoreReview(@NotNull OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass2 r3) {
            Intrinsics.checkNotNullParameter(r3, "merchantReviewsModel");
            this.getMax.toDoubleRange = false;
            MerchantDetailView.access$getMerchantReviewsAdapter$p(this.getMax).setMax();
            MerchantDetailView.access$getMerchantReviewsAdapter$p(this.getMax).length(f.AnonymousClass5.setMax(r3));
        }

        public final void onError(@Nullable String str) {
            this.getMax.toDoubleRange = false;
            if (this.getMax.getReviewPresenter().getMin() == 1) {
                MerchantDetailView.access$getMerchantReviewsAdapter$p(this.getMax).getMin(CollectionsKt.emptyList());
                return;
            }
            MerchantDetailView.access$getMerchantReviewsAdapter$p(this.getMax).setMax();
            GriverOpenSettingListAdapter.OnSettingChangeListener access$getMerchantReviewsAdapter$p = MerchantDetailView.access$getMerchantReviewsAdapter$p(this.getMax);
            List max = access$getMerchantReviewsAdapter$p.getMax();
            OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1.length length = OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1.equals;
            max.add(new OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3(3));
            access$getMerchantReviewsAdapter$p.notifyItemInserted(access$getMerchantReviewsAdapter$p.getMax().size() - 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J$\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\r"}, d2 = {"id/dana/nearbyrevamp/merchantdetail/MerchantDetailView$getMerchantDanaDealsModule$1", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsContract$View;", "onFailedGetMerchantPromoAndDeals", "", "onLoadingMerchantDanaDealFail", "onLoadingMerchantDanaDealSuccess", "listOfProductInfo", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "onSuccessGetMerchantPromoAndDeals", "promoInfoModels", "Lid/dana/nearbyme/model/PromoInfoModel;", "productInfoModels", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.length {
        final /* synthetic */ MerchantDetailView length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void getMax(@NotNull SettingMenu.AnonymousClass1 r2) {
            Intrinsics.checkNotNullParameter(r2, "productOrder");
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void setMax() {
        }

        @JvmDefault
        public final void showProgress() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantDetailInteraction;", "invoke"}, k = 3, mv = {1, 4, 2})
        /* renamed from: id.dana.nearbyrevamp.merchantdetail.MerchantDetailView$getMin$getMin  reason: collision with other inner class name */
        static final class C0045getMin extends Lambda implements Function1<GriverBaseFragment, Unit> {
            final /* synthetic */ ShopModel $this_run;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0045getMin(ShopModel shopModel) {
                super(1);
                this.$this_run = shopModel;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GriverBaseFragment) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull GriverBaseFragment griverBaseFragment) {
                Intrinsics.checkNotNullParameter(griverBaseFragment, "it");
                griverBaseFragment.updatePromoBadge(this.$this_run);
            }
        }

        getMin(MerchantDetailView merchantDetailView) {
            this.length = merchantDetailView;
        }

        public final void setMax(@NotNull List<OptionMenuRecyclerAdapter.OptionMenuViewHolder> list) {
            Intrinsics.checkNotNullParameter(list, "listOfProductInfo");
            ShopModel access$getShopModel$p = this.length.hashCode;
            if (access$getShopModel$p != null) {
                MerchantDetailView merchantDetailView = this.length;
                List<PromoInfoModel> list2 = access$getShopModel$p.Mean$Arithmetic;
                if (list2 == null) {
                    list2 = CollectionsKt.emptyList();
                }
                MerchantDetailView.access$updatePromoAndDealsInfo(merchantDetailView, list, list2);
            }
        }

        public final void getMax() {
            ShopModel access$getShopModel$p = this.length.hashCode;
            if (access$getShopModel$p != null) {
                MerchantDetailView merchantDetailView = this.length;
                List emptyList = CollectionsKt.emptyList();
                List<PromoInfoModel> list = access$getShopModel$p.Mean$Arithmetic;
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                MerchantDetailView.access$updatePromoAndDealsInfo(merchantDetailView, emptyList, list);
            }
        }

        public final void setMin() {
            MerchantDetailView.access$updatePromoAndDealsInfo(this.length, CollectionsKt.emptyList(), CollectionsKt.emptyList());
        }

        public final void getMin(@NotNull List<? extends PromoInfoModel> list, @NotNull List<OptionMenuRecyclerAdapter.OptionMenuViewHolder> list2) {
            Intrinsics.checkNotNullParameter(list, "promoInfoModels");
            Intrinsics.checkNotNullParameter(list2, "productInfoModels");
            ShopModel access$getShopModel$p = this.length.hashCode;
            if (access$getShopModel$p != null) {
                access$getShopModel$p.length((List<PromoInfoModel>) list);
                MerchantDetailView.access$doOnMerchantDetailInteractionImplemented(this.length, new C0045getMin(access$getShopModel$p));
                MerchantDetailView.access$updatePromoAndDealsInfo(this.length, list2, list);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"id/dana/nearbyrevamp/merchantdetail/MerchantDetailView$setupRecyclerView$1$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toString extends RecyclerView.toIntRange {
        final /* synthetic */ MerchantDetailView getMin;
        final /* synthetic */ RecyclerView setMin;

        toString(RecyclerView recyclerView, MerchantDetailView merchantDetailView) {
            this.setMin = recyclerView;
            this.getMin = merchantDetailView;
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            RecyclerView recyclerView2 = (RecyclerView) this.setMin.findViewById(resetInternal.setMax.showPopup);
            RecyclerView.valueOf valueof = null;
            RecyclerView.IsOverlapping layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
            if (layoutManager != null) {
                int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                RecyclerView recyclerView3 = (RecyclerView) this.setMin.findViewById(resetInternal.setMax.showPopup);
                if (recyclerView3 != null) {
                    valueof = recyclerView3.findViewHolderForLayoutPosition(findFirstVisibleItemPosition);
                }
                MerchantDetailView merchantDetailView = this.getMin;
                MerchantDetailView.access$setCvBackToTopVisibility(merchantDetailView, merchantDetailView.setMax(findFirstVisibleItemPosition));
                MerchantDetailView.access$checkIsMerchantPhotoShown(this.getMin, valueof);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }

        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (!recyclerView.canScrollVertically(TsExtractor.TS_STREAM_TYPE_HDMV_DTS)) {
                this.getMin.getMax();
            }
        }
    }

    private final boolean getMin() {
        ShopModel shopModel = this.hashCode;
        if (shopModel != null) {
            Intrinsics.checkNotNull(shopModel);
            Collection collection = shopModel.getDefaultImpl;
            if (collection == null || collection.isEmpty()) {
                hasRootStatusPermission hasrootstatuspermission = this.getMax;
                if (hasrootstatuspermission == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPhotoAdapter");
                }
                if (((MerchantBannerItemModel) hasrootstatuspermission.getMax().get(0)).getMax == MerchantBannerItemModel.State.LOADED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean setMax(int i) {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.showPopup);
        RecyclerView.valueOf findViewHolderForLayoutPosition = recyclerView != null ? recyclerView.findViewHolderForLayoutPosition(i) : null;
        if (findViewHolderForLayoutPosition != null) {
            return (findViewHolderForLayoutPosition.getBindingAdapter() instanceof GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1) || (findViewHolderForLayoutPosition.getBindingAdapter() instanceof GriverOpenSettingListAdapter.OnSettingChangeListener);
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void getMax() {
        GriverOpenSettingListAdapter.OnSettingChangeListener onSettingChangeListener = this.equals;
        if (onSettingChangeListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantReviewsAdapter");
        }
        List max = onSettingChangeListener.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "merchantReviewsAdapter.items");
        if ((!max.isEmpty()) && !this.toDoubleRange) {
            UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin setmin = this.reviewPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reviewPresenter");
            }
            if (setmin.getMax() && setMax()) {
                GriverOpenSettingListAdapter.OnSettingChangeListener onSettingChangeListener2 = this.equals;
                if (onSettingChangeListener2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantReviewsAdapter");
                }
                List max2 = onSettingChangeListener2.getMax();
                OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1.length length2 = OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1.equals;
                max2.add(new OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3(4));
                onSettingChangeListener2.notifyItemInserted(onSettingChangeListener2.getMax().size() - 1);
                setMin();
            }
        }
    }

    private final void setMin() {
        ShopModel shopModel = this.hashCode;
        if (shopModel != null) {
            this.toDoubleRange = true;
            UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin setmin = this.reviewPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reviewPresenter");
            }
            String str = shopModel.Grayscale$Algorithm;
            Intrinsics.checkNotNullExpressionValue(str, "merchantId");
            String str2 = shopModel.b;
            Intrinsics.checkNotNullExpressionValue(str2, FeatureParams.SHOP_ID);
            setmin.length(str, str2);
        }
    }

    private final boolean setMax() {
        GriverOpenSettingListAdapter.OnSettingChangeListener onSettingChangeListener = this.equals;
        if (onSettingChangeListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantReviewsAdapter");
        }
        GriverOpenSettingListAdapter.OnSettingChangeListener onSettingChangeListener2 = this.equals;
        if (onSettingChangeListener2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantReviewsAdapter");
        }
        return ((OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3) onSettingChangeListener.setMin(onSettingChangeListener2.getItemCount() - 1)).setMax == 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ MerchantDetailView setMin;

        toIntRange(MerchantDetailView merchantDetailView) {
            this.setMin = merchantDetailView;
        }

        public final void onClick(View view) {
            this.setMin.smoothScrollToTop();
            setMin merchantDetailViewListener = this.setMin.getMerchantDetailViewListener();
            if (merchantDetailViewListener != null) {
                merchantDetailViewListener.length();
            }
        }
    }

    public final void smoothScrollToTop() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.showPopup);
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
    }

    public final void scrollToTop() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.showPopup);
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"id/dana/nearbyrevamp/merchantdetail/MerchantDetailView$getMerchantDetailPhotoAdapter$1$1", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantDetailPhotoAdapter$Listener;", "onCloseBanner", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping implements hasRootStatusPermission.setMax {
        final /* synthetic */ MerchantDetailView getMax;

        IsOverlapping(MerchantDetailView merchantDetailView) {
            this.getMax = merchantDetailView;
        }

        public final void setMin() {
            setMin merchantDetailViewListener = this.getMax.getMerchantDetailViewListener();
            if (merchantDetailViewListener != null) {
                merchantDetailViewListener.setMin();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"id/dana/nearbyrevamp/merchantdetail/MerchantDetailView$getMerchantUserReviewAdapter$1$1", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter$RatingSectionListener;", "onCoachmarkDismissed", "", "onStarClicked", "rating", "", "reviewForm", "Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1.IsOverlapping {
        final /* synthetic */ MerchantDetailView getMax;

        isInside(MerchantDetailView merchantDetailView) {
            this.getMax = merchantDetailView;
        }

        public final void setMax(int i, @NotNull MerchantConsultReviewModel merchantConsultReviewModel) {
            Intrinsics.checkNotNullParameter(merchantConsultReviewModel, "reviewForm");
            MerchantDetailView.access$openMerchantFormDialog(this.getMax, i, merchantConsultReviewModel);
        }

        public final void getMax() {
            this.getMax.getRatingPresenter().length();
            GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1 access$getMerchantUserReviewAdapter$p = MerchantDetailView.access$getMerchantUserReviewAdapter$p(this.getMax);
            List max = access$getMerchantUserReviewAdapter$p.getMax();
            Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
            if (!max.isEmpty()) {
                List max2 = access$getMerchantUserReviewAdapter$p.getMax();
                Intrinsics.checkNotNullExpressionValue(max2, FirebaseAnalytics.Param.ITEMS);
                Iterator it = max2.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((SimpleListAdapter.SimpleViewHolder.AnonymousClass1) it.next()).setMin == 3) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    access$getMerchantUserReviewAdapter$p.getMax(i);
                    access$getMerchantUserReviewAdapter$p.length = false;
                }
            }
        }
    }

    public static /* synthetic */ void showCompleteShopDataWithPreviewFirst$default(MerchantDetailView merchantDetailView, ShopModel shopModel, String str, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = toDoubleRange.INSTANCE;
        }
        merchantDetailView.showCompleteShopDataWithPreviewFirst(shopModel, str, function0);
    }

    public final void showCompleteShopDataWithPreviewFirst(@NotNull ShopModel shopModel, @NotNull String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        Intrinsics.checkNotNullParameter(str, "source");
        Intrinsics.checkNotNullParameter(function0, "onPreviewDataShown");
        hasRootStatusPermission hasrootstatuspermission = this.getMax;
        if (hasrootstatuspermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPhotoAdapter");
        }
        if (hasrootstatuspermission.setMax) {
            hasrootstatuspermission.setMax = false;
            if (!hasrootstatuspermission.setMax) {
                hasrootstatuspermission.setMin = 0;
            }
            hasrootstatuspermission.notifyItemChanged(0);
        }
        getMax(shopModel);
        function0.invoke();
        loadCompleteMerchantDetailInfo(shopModel);
        setMin(str);
    }

    public final void showPreviewShopData(@NotNull ShopModel shopModel, @NotNull String str) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        Intrinsics.checkNotNullParameter(str, "source");
        hasRootStatusPermission hasrootstatuspermission = this.getMax;
        if (hasrootstatuspermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPhotoAdapter");
        }
        if (!hasrootstatuspermission.setMax) {
            hasrootstatuspermission.setMax = true;
            if (!hasrootstatuspermission.setMax) {
                hasrootstatuspermission.setMin = 0;
            }
            hasrootstatuspermission.notifyItemChanged(0);
        }
        getMax(shopModel);
        setMin(str);
    }

    private final void getMax(ShopModel shopModel) {
        this.hashCode = shopModel;
        this.FastBitmap$CoordinateSystem = new Pair<>(shopModel.b, Boolean.FALSE);
        showErrorState(false);
        GriverOpenSettingListAdapter.OpenSettingViewHolder openSettingViewHolder = this.setMax;
        if (openSettingViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantHeaderInfoAdapter");
        }
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        List max = openSettingViewHolder.getMax();
        LifeCycle.setMax setmax = LifeCycle.length;
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        max.set(0, new LifeCycle(0, shopModel, 4));
        openSettingViewHolder.notifyItemChanged(0);
        GriverCommonAbilityProxyImpl.AnonymousClass1 r1 = this.isInside;
        if (r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantActionInfoAdapter");
        }
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        ((LifeCycle) r1.getMax().get(0)).setMin = shopModel;
        r1.notifyItemChanged(0);
        GriverCommonAbilityProxyImpl.AnonymousClass1.AnonymousClass2 r12 = this.IsOverlapping;
        if (r12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantContactInfoAdapter");
        }
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        LifeCycle.setMax setmax2 = LifeCycle.length;
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        r12.getMin(CollectionsKt.mutableListOf(new LifeCycle(0, shopModel, 4)));
        GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1 r0 = this.toIntRange;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantUserReviewAdapter");
        }
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        r0.getMin = shopModel;
        GriverOpenSettingListAdapter.OnSettingChangeListener onSettingChangeListener = this.equals;
        if (onSettingChangeListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantReviewsAdapter");
        }
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        onSettingChangeListener.getMax = shopModel;
    }

    public final void updateImages(@NotNull ShopModel shopModel) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        hasRootStatusPermission hasrootstatuspermission = this.getMax;
        if (hasrootstatuspermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPhotoAdapter");
        }
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        hasrootstatuspermission.getMin = shopModel;
        MerchantBannerItemModel.State state = MerchantBannerItemModel.State.LOADED;
        Intrinsics.checkNotNullParameter(state, "<set-?>");
        ((MerchantBannerItemModel) hasrootstatuspermission.getMax().get(0)).getMax = state;
        hasrootstatuspermission.notifyItemChanged(0);
        setMin setmin = this.length;
        if (setmin != null) {
            setmin.setMax();
        }
    }

    public final void loadCompleteMerchantDetailInfo(@NotNull ShopModel shopModel) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        showComponentWhenFullState(true);
        if (Intrinsics.areEqual((Object) this.hashCode, (Object) shopModel) && Intrinsics.areEqual((Object) this.FastBitmap$CoordinateSystem.getFirst(), (Object) shopModel.b) && !this.FastBitmap$CoordinateSystem.getSecond().booleanValue()) {
            this.FastBitmap$CoordinateSystem = Pair.copy$default(this.FastBitmap$CoordinateSystem, (Object) null, Boolean.TRUE, 1, (Object) null);
            ShopModel shopModel2 = this.hashCode;
            if (shopModel2 != null) {
                if (!shopModel2.valueOf()) {
                    UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin getmin = this.promoDealsPresenter;
                    if (getmin == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("promoDealsPresenter");
                    }
                    String str = shopModel2.Grayscale$Algorithm;
                    Intrinsics.checkNotNullExpressionValue(str, "merchantId");
                    String str2 = shopModel2.b;
                    Intrinsics.checkNotNullExpressionValue(str2, FeatureParams.SHOP_ID);
                    getmin.length(str, str2);
                } else {
                    UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin getmin2 = this.promoDealsPresenter;
                    if (getmin2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("promoDealsPresenter");
                    }
                    String str3 = shopModel2.Grayscale$Algorithm;
                    Intrinsics.checkNotNullExpressionValue(str3, "merchantId");
                    String str4 = shopModel2.b;
                    Intrinsics.checkNotNullExpressionValue(str4, FeatureParams.SHOP_ID);
                    getmin2.getMin(str3, str4);
                }
            }
            ShopModel shopModel3 = this.hashCode;
            if (shopModel3 != null) {
                onSettingChange.length length2 = this.ratingPresenter;
                if (length2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ratingPresenter");
                }
                String str5 = shopModel3.Grayscale$Algorithm;
                Intrinsics.checkNotNullExpressionValue(str5, "merchantId");
                String str6 = shopModel3.b;
                Intrinsics.checkNotNullExpressionValue(str6, FeatureParams.SHOP_ID);
                length2.getMin(str5, str6);
            }
            setMin();
        }
    }

    public final int getHeaderInfoViewBottom() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.showPopup);
        RecyclerView.valueOf findViewHolderForLayoutPosition = recyclerView != null ? recyclerView.findViewHolderForLayoutPosition(1) : null;
        if (findViewHolderForLayoutPosition == null || !(findViewHolderForLayoutPosition instanceof GriverOpenSettingListAdapter.OpenSettingViewHolder.length)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.playFromSearch);
            if (constraintLayout != null) {
                return constraintLayout.getBottom();
            }
            return 0;
        }
        View view = findViewHolderForLayoutPosition.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "viewHolder.itemView");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(resetInternal.setMax.playFromSearch);
        if (constraintLayout2 != null) {
            return constraintLayout2.getBottom();
        }
        return 0;
    }

    public final void setTryAgainListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "onTryAgainClicked");
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.mayLaunchUrl);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new MerchantDetailView$FastBitmap$CoordinateSystem(this, function0));
        }
    }

    public final void onMerchantDetailReset() {
        this.hashCode = null;
        this.FastBitmap$CoordinateSystem = new Pair<>("", Boolean.FALSE);
        onSettingChange.length length2 = this.ratingPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ratingPresenter");
        }
        length2.setMin();
        UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin setmin = this.reviewPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewPresenter");
        }
        setmin.setMin();
        UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin getmin = this.promoDealsPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("promoDealsPresenter");
        }
        getmin.length();
        hasRootStatusPermission hasrootstatuspermission = this.getMax;
        if (hasrootstatuspermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPhotoAdapter");
        }
        hasrootstatuspermission.getMin = new ShopModel();
        hasrootstatuspermission.setMin = 0;
        if (!hasrootstatuspermission.setMax) {
            hasrootstatuspermission.setMax = true;
            if (!hasrootstatuspermission.setMax) {
                hasrootstatuspermission.setMin = 0;
            }
            hasrootstatuspermission.notifyItemChanged(0);
        }
        hasrootstatuspermission.getMin(CollectionsKt.mutableListOf(new MerchantBannerItemModel((byte) 0)));
        hasrootstatuspermission.notifyItemChanged(0);
        GriverOpenSettingListAdapter.OpenSettingViewHolder openSettingViewHolder = this.setMax;
        if (openSettingViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantHeaderInfoAdapter");
        }
        LifeCycle.setMax setmax = LifeCycle.length;
        LifeCycle.setMax setmax2 = LifeCycle.length;
        openSettingViewHolder.getMin(CollectionsKt.mutableListOf(new LifeCycle(1, (ShopModel) null, 6), new LifeCycle(3, (ShopModel) null, 6)));
        setOnSettingChangeListener setonsettingchangelistener = this.toFloatRange;
        if (setonsettingchangelistener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantPromoDealsInfoAdapter");
        }
        SimpleListAdapter.getMax getmax = SimpleListAdapter.getMin;
        setonsettingchangelistener.getMin(CollectionsKt.mutableListOf(new SimpleListAdapter()));
        GriverCommonAbilityProxyImpl.AnonymousClass1.AnonymousClass2 r0 = this.IsOverlapping;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantContactInfoAdapter");
        }
        r0.getMin(CollectionsKt.mutableListOf(new LifeCycle(1, new ShopModel(), 4)));
        GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1 r02 = this.toIntRange;
        if (r02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantUserReviewAdapter");
        }
        r02.setMin();
        GriverOpenSettingListAdapter.OnSettingChangeListener onSettingChangeListener = this.equals;
        if (onSettingChangeListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantReviewsAdapter");
        }
        onSettingChangeListener.setMin();
        showComponentWhenFullState(false);
    }

    public final void showErrorState(boolean z) {
        this.setMin = z ? MerchantDetailState.ERROR : MerchantDetailState.DEFAULT;
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.prepareFromSearch);
        int i = 0;
        if (_$_findCachedViewById != null) {
            Intrinsics.checkNotNullParameter(_$_findCachedViewById, "<this>");
            _$_findCachedViewById.setVisibility(z ? 0 : 8);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.showPopup);
        if (recyclerView != null) {
            View view = recyclerView;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (!z2) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final void showComponentWhenFullState(boolean z) {
        GriverOpenSettingListAdapter.OpenSettingViewHolder openSettingViewHolder = this.setMax;
        if (openSettingViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantHeaderInfoAdapter");
        }
        openSettingViewHolder.getMin = !z;
        openSettingViewHolder.notifyItemChanged(1);
        GriverOpenSettingListAdapter.OpenSettingViewHolder openSettingViewHolder2 = this.setMax;
        if (openSettingViewHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantHeaderInfoAdapter");
        }
        openSettingViewHolder2.getMax = z;
        openSettingViewHolder2.notifyItemChanged(0);
    }

    public final void setOnCollapsed() {
        hasRootStatusPermission hasrootstatuspermission = this.getMax;
        if (hasrootstatuspermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPhotoAdapter");
        }
        if (!hasrootstatuspermission.setMax) {
            hasrootstatuspermission.setMax = true;
            if (!hasrootstatuspermission.setMax) {
                hasrootstatuspermission.setMin = 0;
            }
            hasrootstatuspermission.notifyItemChanged(0);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.showPopup);
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.showPopup);
        if (recyclerView2 != null) {
            recyclerView2.setNestedScrollingEnabled(false);
        }
    }

    public final void setOnFull() {
        hasRootStatusPermission hasrootstatuspermission = this.getMax;
        if (hasrootstatuspermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPhotoAdapter");
        }
        if (hasrootstatuspermission.setMax) {
            hasrootstatuspermission.setMax = false;
            if (!hasrootstatuspermission.setMax) {
                hasrootstatuspermission.setMin = 0;
            }
            hasrootstatuspermission.notifyItemChanged(0);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.showPopup);
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(true);
        }
    }

    public final void setOnBottomsheetDragged(float f) {
        View view;
        MerchantBannerView merchantBannerView;
        ConstraintLayout constraintLayout;
        View view2;
        MerchantPhotoGridView merchantPhotoGridView;
        ConstraintLayout constraintLayout2;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.showPopup);
        if (recyclerView != null) {
            RecyclerView.valueOf findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(0);
            if (!(findViewHolderForLayoutPosition == null || (view2 = findViewHolderForLayoutPosition.itemView) == null || (merchantPhotoGridView = (MerchantPhotoGridView) view2.findViewById(resetInternal.setMax.setTabContainer)) == null || (constraintLayout2 = (ConstraintLayout) merchantPhotoGridView._$_findCachedViewById(resetInternal.setMax.play)) == null || getMin())) {
                constraintLayout2.setVisibility(0);
                constraintLayout2.setAlpha(1.0f - f);
            }
            if (findViewHolderForLayoutPosition != null && (view = findViewHolderForLayoutPosition.itemView) != null && (merchantBannerView = (MerchantBannerView) view.findViewById(resetInternal.setMax.postShowOverflowMenu)) != null && (constraintLayout = (ConstraintLayout) merchantBannerView._$_findCachedViewById(resetInternal.setMax.play)) != null) {
                if (((double) f) < 0.1d) {
                    constraintLayout.setVisibility(8);
                    constraintLayout.setAlpha(1.0f);
                    return;
                }
                constraintLayout.setVisibility(0);
                constraintLayout.setAlpha(f);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$Companion;", "", "()V", "MIN_SLIDE_OFFSE_ANIMATION", "", "SEE_MORE_BUTTON_POSITION", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final void setup() {
        GriverOpenSettingListAdapter.OpenSettingViewHolder openSettingViewHolder = new GriverOpenSettingListAdapter.OpenSettingViewHolder(setActionOn.length(getContext()));
        openSettingViewHolder.length = this.length;
        this.setMax = openSettingViewHolder;
        hasRootStatusPermission hasrootstatuspermission = new hasRootStatusPermission();
        hasrootstatuspermission.getMax = new IsOverlapping(this);
        this.getMax = hasrootstatuspermission;
        this.isInside = new IMultiInstanceInvalidationCallback.Stub<GriverCommonAbilityProxyImpl.AnonymousClass1.length, LifeCycle>() {
            public final int getItemCount() {
                return 1;
            }

            public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                return new length(viewGroup);
            }

            {
                LifeCycle.setMax setmax = LifeCycle.length;
                ShopModel shopModel = new ShopModel();
                getSerialNumberEncrypt getserialnumberencrypt = new getSerialNumberEncrypt(false, false, false, false, false, false, false, 127, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(shopModel, "shopModel");
                Intrinsics.checkNotNullParameter(getserialnumberencrypt, "merchantDetailConfig");
                getMin(CollectionsKt.mutableListOf(new LifeCycle(2, shopModel, getserialnumberencrypt)));
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantActionInfoAdapter$MerchantActionInfoViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/MerchantDetailInfoModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.GriverCommonAbilityProxyImpl$1$length */
            public static final class length extends Ignore<LifeCycle> {
                public final /* synthetic */ void setMax(Object obj) {
                    ShopModel shopModel;
                    LifeCycle lifeCycle = (LifeCycle) obj;
                    if (lifeCycle != null && (shopModel = lifeCycle.setMin) != null) {
                        View view = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view, "itemView");
                        MerchantActionListView merchantActionListView = (MerchantActionListView) view.findViewById(resetInternal.setMax.prepareFromMediaId);
                        if (merchantActionListView != null) {
                            merchantActionListView.showActionMenu(shopModel, lifeCycle.setMax);
                        }
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public length(@NotNull ViewGroup viewGroup) {
                    super(viewGroup.getContext(), R.layout.item_merchant_actions, viewGroup);
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                }
            }
        };
        this.IsOverlapping = new IMultiInstanceInvalidationCallback.Stub<Ignore<LifeCycle>, LifeCycle>() {
            public Function1<? super ShopModel, Unit> getMax;

            public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                Ignore ignore;
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                if (i != 1) {
                    ignore = new setMin(viewGroup, this.getMax);
                } else {
                    ignore = new getMax(viewGroup);
                }
                return ignore;
            }

            {
                getMin(CollectionsKt.mutableListOf(new LifeCycle(1, new ShopModel(), 4)));
            }

            public final int getItemCount() {
                if (getMax().isEmpty()) {
                    return 0;
                }
                List max = getMax();
                Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
                if (((LifeCycle) CollectionsKt.first(max)).getMax == 1) {
                    return 1;
                }
                ShopModel shopModel = ((LifeCycle) setMin(0)).setMin;
                if (shopModel == null || !setMax(shopModel)) {
                    return 0;
                }
                return 1;
            }

            private static boolean setMax(ShopModel shopModel) {
                String str;
                ContactAddressModel max = shopModel.setMax();
                if (max != null) {
                    str = max.setMin;
                } else {
                    str = null;
                }
                CharSequence charSequence = str;
                return !(charSequence == null || charSequence.length() == 0) || shopModel.setMin();
            }

            public final int getItemViewType(int i) {
                return ((LifeCycle) getMax().get(i)).getMax;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B4\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R+\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantContactInfoAdapter$MerchantDetailContactInfoViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/MerchantDetailInfoModel;", "parent", "Landroid/view/ViewGroup;", "onOtherStoreClickListener", "Lkotlin/Function1;", "Lid/dana/nearbyme/model/ShopModel;", "Lkotlin/ParameterName;", "name", "shopModel", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "bindData", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.GriverCommonAbilityProxyImpl$1$2$setMin */
            public static final class setMin extends Ignore<LifeCycle> {
                /* access modifiers changed from: private */
                public final Function1<ShopModel, Unit> getMin;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/model/ShopModel;", "invoke"}, k = 3, mv = {1, 4, 2})
                /* renamed from: o.GriverCommonAbilityProxyImpl$1$2$setMin$setMax */
                static final class setMax extends Lambda implements Function1<ShopModel, Unit> {
                    final /* synthetic */ setMin this$0;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    setMax(setMin setmin) {
                        super(1);
                        this.this$0 = setmin;
                    }

                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((ShopModel) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull ShopModel shopModel) {
                        Intrinsics.checkNotNullParameter(shopModel, "it");
                        Function1 min = this.this$0.getMin;
                        if (min != null) {
                            min.invoke(shopModel);
                        }
                    }
                }

                public final /* synthetic */ void setMax(Object obj) {
                    LifeCycle lifeCycle = (LifeCycle) obj;
                    if (lifeCycle != null) {
                        ShopModel shopModel = lifeCycle.setMin;
                        if (shopModel != null) {
                            View view = this.itemView;
                            Intrinsics.checkNotNullExpressionValue(view, "itemView");
                            NewMerchantAddressInfoView newMerchantAddressInfoView = (NewMerchantAddressInfoView) view.findViewById(resetInternal.setMax.prepareFromUri);
                            if (newMerchantAddressInfoView != null) {
                                newMerchantAddressInfoView.showAddress(shopModel);
                            }
                        }
                        View view2 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                        NewMerchantAddressInfoView newMerchantAddressInfoView2 = (NewMerchantAddressInfoView) view2.findViewById(resetInternal.setMax.prepareFromUri);
                        if (newMerchantAddressInfoView2 != null) {
                            newMerchantAddressInfoView2.setOtherLocationsListener(new setMax(this));
                        }
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public setMin(@NotNull ViewGroup viewGroup, @Nullable Function1<? super ShopModel, Unit> function1) {
                    super(viewGroup.getContext(), R.layout.item_merchant_contact_info, viewGroup);
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                    this.getMin = function1;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantContactInfoAdapter$MerchantDetailContactInfoShimmerViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/MerchantDetailInfoModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.GriverCommonAbilityProxyImpl$1$2$getMax */
            public static final class getMax extends Ignore<LifeCycle> {
                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public getMax(@NotNull ViewGroup viewGroup) {
                    super(viewGroup.getContext(), R.layout.item_merchant_contact_shimmer, viewGroup);
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                }

                public final /* synthetic */ void setMax(Object obj) {
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    containsFavoriteMenuItem.getMin(view.findViewById(resetInternal.setMax.MotionLayout), R.layout.view_merchant_address_info_skeleton);
                }
            }
        };
        this.toFloatRange = new setOnSettingChangeListener();
        GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1 r0 = new IMultiInstanceInvalidationCallback.Stub<Ignore<SimpleListAdapter.SimpleViewHolder.AnonymousClass1>, SimpleListAdapter.SimpleViewHolder.AnonymousClass1>() {
            @Nullable
            public GriverCommonResourceProxy getMax;
            public ShopModel getMin;
            public boolean length;
            @Nullable
            public IsOverlapping setMax;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter$RatingSectionListener;", "", "onCoachmarkDismissed", "", "onStarClicked", "rating", "", "reviewForm", "Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.GriverOpenSettingListAdapter$OpenSettingViewHolder$1$IsOverlapping */
            public interface IsOverlapping {
                void getMax();

                void setMax(int i, @NotNull MerchantConsultReviewModel merchantConsultReviewModel);
            }

            public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
                onBindViewHolder((Ignore) valueof, i);
            }

            public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                Ignore ignore;
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                if (i != 0) {
                    switch (i) {
                        case 2:
                            ignore = new getMax(viewGroup);
                            break;
                        case 3:
                            ignore = new equals(viewGroup, this.setMax);
                            break;
                        case 4:
                            ignore = new getMin(viewGroup, this.setMax, this.getMax);
                            break;
                        case 5:
                            ignore = new setMax(viewGroup);
                            break;
                        case 6:
                            ignore = new isInside(viewGroup);
                            break;
                        case 7:
                            ignore = new setMin(viewGroup);
                            break;
                        default:
                            ignore = new setMax(viewGroup);
                            break;
                    }
                } else {
                    ignore = new length(viewGroup);
                }
                return ignore;
            }

            {
                setMin();
            }

            public final void setMin() {
                List arrayList = new ArrayList();
                SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMin getmin = SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMax;
                arrayList.add(new SimpleListAdapter.SimpleViewHolder.AnonymousClass1(7, (OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1) null, (MerchantConsultReviewModel) null, (ShopModel) null, 14));
                SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMin getmin2 = SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMax;
                arrayList.add(new SimpleListAdapter.SimpleViewHolder.AnonymousClass1(6, (OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1) null, (MerchantConsultReviewModel) null, (ShopModel) null, 14));
                Unit unit = Unit.INSTANCE;
                getMin(arrayList);
            }

            public final void getMax(@NotNull Ignore<SimpleListAdapter.SimpleViewHolder.AnonymousClass1> ignore, int i) {
                Intrinsics.checkNotNullParameter(ignore, "holder");
                if (ignore instanceof getMax) {
                    ((getMax) ignore).setMin = this.getMin;
                }
                super.onBindViewHolder(ignore, i);
            }

            public final int getItemViewType(int i) {
                return ((SimpleListAdapter.SimpleViewHolder.AnonymousClass1) getMax().get(i)).setMin;
            }

            public final List<SimpleListAdapter.SimpleViewHolder.AnonymousClass1> setMax(ShopModel shopModel) {
                List<SimpleListAdapter.SimpleViewHolder.AnonymousClass1> arrayList = new ArrayList<>();
                SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMin getmin = SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMax;
                arrayList.add(new SimpleListAdapter.SimpleViewHolder.AnonymousClass1(7, (OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1) null, (MerchantConsultReviewModel) null, (ShopModel) null, 14));
                if (f.AnonymousClass5.setMin(shopModel)) {
                    SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMin getmin2 = SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMax;
                    Intrinsics.checkNotNullParameter(shopModel, "shopModel");
                    arrayList.add(new SimpleListAdapter.SimpleViewHolder.AnonymousClass1(0, (OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1) null, (MerchantConsultReviewModel) null, shopModel, 6));
                }
                if (this.length) {
                    SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMin getmin3 = SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMax;
                    arrayList.add(new SimpleListAdapter.SimpleViewHolder.AnonymousClass1(3, (OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1) null, (MerchantConsultReviewModel) null, (ShopModel) null, 14));
                }
                return arrayList;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter$ReviewCoachmarkViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/RatingViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "listener", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter$RatingSectionListener;", "(Landroid/view/ViewGroup;Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter$RatingSectionListener;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.GriverOpenSettingListAdapter$OpenSettingViewHolder$1$equals */
            public static final class equals extends Ignore<SimpleListAdapter.SimpleViewHolder.AnonymousClass1> {
                /* access modifiers changed from: private */
                public final IsOverlapping getMin;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public equals(@NotNull ViewGroup viewGroup, @Nullable IsOverlapping isOverlapping) {
                    super(viewGroup.getContext(), R.layout.view_review_coachmark, viewGroup);
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                    this.getMin = isOverlapping;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
                /* renamed from: o.GriverOpenSettingListAdapter$OpenSettingViewHolder$1$equals$getMin */
                static final class getMin implements View.OnClickListener {
                    final /* synthetic */ equals setMin;

                    getMin(equals equals) {
                        this.setMin = equals;
                    }

                    public final void onClick(View view) {
                        IsOverlapping max = this.setMin.getMin;
                        if (max != null) {
                            max.getMax();
                        }
                    }
                }

                public final /* synthetic */ void setMax(Object obj) {
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.show);
                    if (appCompatImageView != null) {
                        appCompatImageView.setOnClickListener(new getMin(this));
                    }
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter$MerchantOwnReviewItem;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/RatingViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "getShopModel", "()Lid/dana/nearbyme/model/ShopModel;", "setShopModel", "(Lid/dana/nearbyme/model/ShopModel;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.GriverOpenSettingListAdapter$OpenSettingViewHolder$1$getMax */
            public static final class getMax extends Ignore<SimpleListAdapter.SimpleViewHolder.AnonymousClass1> {
                @Nullable
                ShopModel setMin;

                public final /* synthetic */ void setMax(Object obj) {
                    SimpleListAdapter.SimpleViewHolder.AnonymousClass1 r4 = (SimpleListAdapter.SimpleViewHolder.AnonymousClass1) obj;
                    if (r4 != null && r4.getMin != null) {
                        View view = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view, "itemView");
                        UserReviewView userReviewView = (UserReviewView) view.findViewById(resetInternal.setMax.rateWithExtras);
                        if (userReviewView != null) {
                            userReviewView.setShopModel(this.setMin);
                        }
                        View view2 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                        UserReviewView userReviewView2 = (UserReviewView) view2.findViewById(resetInternal.setMax.rateWithExtras);
                        if (userReviewView2 != null) {
                            userReviewView2.setData(r4.getMin);
                        }
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public getMax(@NotNull ViewGroup viewGroup) {
                    super(viewGroup.getContext(), R.layout.item_user_review, viewGroup);
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter$MerchantInputReviewItem;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/RatingViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "ratingSectionListener", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter$RatingSectionListener;", "userAccount", "Lid/dana/domain/account/Account;", "(Landroid/view/ViewGroup;Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter$RatingSectionListener;Lid/dana/domain/account/Account;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.GriverOpenSettingListAdapter$OpenSettingViewHolder$1$getMin */
            public static final class getMin extends Ignore<SimpleListAdapter.SimpleViewHolder.AnonymousClass1> {
                /* access modifiers changed from: private */
                public final IsOverlapping getMax;
                private final GriverCommonResourceProxy setMin;

                public final /* synthetic */ void setMax(Object obj) {
                    SimpleListAdapter.SimpleViewHolder.AnonymousClass1 r5 = (SimpleListAdapter.SimpleViewHolder.AnonymousClass1) obj;
                    if (r5 != null && r5.length != null) {
                        View view = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view, "itemView");
                        ViewRatingStarBar viewRatingStarBar = (ViewRatingStarBar) view.findViewById(resetInternal.setMax.getContentPaddingBottom);
                        if (viewRatingStarBar != null) {
                            viewRatingStarBar.setOnStarClickListener(new setMin(this, r5));
                        }
                        GriverCommonResourceProxy griverCommonResourceProxy = this.setMin;
                        if (griverCommonResourceProxy != null) {
                            View view2 = this.itemView;
                            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                            AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(resetInternal.setMax.ivUserAvatar);
                            if (appCompatImageView != null) {
                                ((updateCornerMarking) Glide.getMax(appCompatImageView.getContext())).equals().length(this.setMin.getAvatarUrl()).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMin((int) R.drawable.avatar_placeholder).length((ImageView) (AppCompatImageView) appCompatImageView.findViewById(resetInternal.setMax.ivUserAvatar));
                            }
                            View view3 = this.itemView;
                            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                            TextView textView = (TextView) view3.findViewById(resetInternal.setMax.onFocusChanged);
                            if (textView != null) {
                                textView.setText(griverCommonResourceProxy.getNickname());
                            }
                        }
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public getMin(@NotNull ViewGroup viewGroup, @Nullable IsOverlapping isOverlapping, @Nullable GriverCommonResourceProxy griverCommonResourceProxy) {
                    super(viewGroup.getContext(), R.layout.item_user_input_review, viewGroup);
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                    this.getMax = isOverlapping;
                    this.setMin = griverCommonResourceProxy;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter$MerchantInputReviewItem$bindData$1", "Lid/dana/nearbyme/merchantreview/ViewRatingStarBar$ClickListener;", "onStarClick", "", "rating", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                /* renamed from: o.GriverOpenSettingListAdapter$OpenSettingViewHolder$1$getMin$setMin */
                public static final class setMin implements ViewRatingStarBar.setMax {
                    final /* synthetic */ SimpleListAdapter.SimpleViewHolder.AnonymousClass1 getMax;
                    final /* synthetic */ getMin getMin;

                    setMin(getMin getmin, SimpleListAdapter.SimpleViewHolder.AnonymousClass1 r2) {
                        this.getMin = getmin;
                        this.getMax = r2;
                    }

                    public final void setMin(int i) {
                        IsOverlapping max = this.getMin.getMax;
                        if (max != null) {
                            max.setMax(i, this.getMax.length);
                        }
                    }
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter$MerchantRatingItem;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/RatingViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.GriverOpenSettingListAdapter$OpenSettingViewHolder$1$length */
            public static final class length extends Ignore<SimpleListAdapter.SimpleViewHolder.AnonymousClass1> {
                public final /* synthetic */ void setMax(Object obj) {
                    SimpleListAdapter.SimpleViewHolder.AnonymousClass1 r12 = (SimpleListAdapter.SimpleViewHolder.AnonymousClass1) obj;
                    if (r12 != null && r12.setMax != null) {
                        View view = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view, "itemView");
                        TextView textView = (TextView) view.findViewById(resetInternal.setMax.getQuery);
                        if (textView != null) {
                            String format = new DecimalFormat("##.0").format(r12.setMax.create);
                            Intrinsics.checkNotNullExpressionValue(format, "DecimalFormat(\"##.0\").fo…at(data.shopModel.rating)");
                            textView.setText(StringsKt.replace$default(format, ",", ".", false, 4, (Object) null));
                        }
                        View view2 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                        RatingStarView ratingStarView = (RatingStarView) view2.findViewById(resetInternal.setMax.getContentPaddingTop);
                        if (ratingStarView != null) {
                            ratingStarView.setRating((float) r12.setMax.create);
                        }
                        View view3 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                        TextView textView2 = (TextView) view3.findViewById(resetInternal.setMax.getSuggestionsAdapter);
                        if (textView2 != null) {
                            Context context = this.length;
                            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                            textView2.setText(context.getResources().getString(R.string.number_of_review_label, new Object[]{Integer.valueOf((int) r12.setMax.onNavigationEvent)}));
                        }
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public length(@NotNull ViewGroup viewGroup) {
                    super(viewGroup.getContext(), R.layout.item_average_rating, viewGroup);
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter$MerchantRatingReviewEmptyState;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/RatingViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.GriverOpenSettingListAdapter$OpenSettingViewHolder$1$setMax */
            public static final class setMax extends Ignore<SimpleListAdapter.SimpleViewHolder.AnonymousClass1> {
                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public setMax(@NotNull ViewGroup viewGroup) {
                    super(viewGroup.getContext(), R.layout.view_review_empty_state, viewGroup);
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter$MerchantRatingReviewShimmer;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/RatingViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.GriverOpenSettingListAdapter$OpenSettingViewHolder$1$isInside */
            public static final class isInside extends Ignore<SimpleListAdapter.SimpleViewHolder.AnonymousClass1> {
                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public isInside(@NotNull ViewGroup viewGroup) {
                    super(viewGroup.getContext(), R.layout.item_user_review_skeleton, viewGroup);
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                }

                public final /* synthetic */ void setMax(Object obj) {
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    containsFavoriteMenuItem.getMin(view.findViewById(resetInternal.setMax.MotionLayout), R.layout.view_user_review_skeleton);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantUserReviewAdapter$MerchantRatingReviewHeader;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/RatingViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.GriverOpenSettingListAdapter$OpenSettingViewHolder$1$setMin */
            public static final class setMin extends Ignore<SimpleListAdapter.SimpleViewHolder.AnonymousClass1> {
                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public setMin(@NotNull ViewGroup viewGroup) {
                    super(viewGroup.getContext(), R.layout.item_rating_review_header, viewGroup);
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                }
            }
        };
        r0.setMax = new isInside(this);
        this.toIntRange = r0;
        this.equals = new GriverOpenSettingListAdapter.OnSettingChangeListener(new hashCode(this));
        this.values = new GriverOpenSettingListAdapter(new values(this));
        RecyclerView.Adapter[] adapterArr = new RecyclerView.Adapter[8];
        hasRootStatusPermission hasrootstatuspermission2 = this.getMax;
        if (hasrootstatuspermission2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPhotoAdapter");
        }
        adapterArr[0] = hasrootstatuspermission2;
        GriverOpenSettingListAdapter.OpenSettingViewHolder openSettingViewHolder2 = this.setMax;
        if (openSettingViewHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantHeaderInfoAdapter");
        }
        adapterArr[1] = openSettingViewHolder2;
        GriverCommonAbilityProxyImpl.AnonymousClass1 r5 = this.isInside;
        if (r5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantActionInfoAdapter");
        }
        adapterArr[2] = r5;
        setOnSettingChangeListener setonsettingchangelistener = this.toFloatRange;
        if (setonsettingchangelistener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantPromoDealsInfoAdapter");
        }
        adapterArr[3] = setonsettingchangelistener;
        GriverCommonAbilityProxyImpl.AnonymousClass1.AnonymousClass2 r52 = this.IsOverlapping;
        if (r52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantContactInfoAdapter");
        }
        adapterArr[4] = r52;
        GriverOpenSettingListAdapter griverOpenSettingListAdapter = this.values;
        if (griverOpenSettingListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantQrisInfoAdapter");
        }
        adapterArr[5] = griverOpenSettingListAdapter;
        GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1 r53 = this.toIntRange;
        if (r53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantUserReviewAdapter");
        }
        adapterArr[6] = r53;
        GriverOpenSettingListAdapter.OnSettingChangeListener onSettingChangeListener = this.equals;
        if (onSettingChangeListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantReviewsAdapter");
        }
        adapterArr[7] = onSettingChangeListener;
        this.toString = new ConcatAdapter(adapterArr);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.showPopup);
        if (recyclerView != null) {
            recyclerView.setItemAnimator((RecyclerView.ItemAnimator) null);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.addOnScrollListener(new toString(recyclerView, this));
            ConcatAdapter concatAdapter = this.toString;
            if (concatAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("concatAdapter");
            }
            recyclerView.setAdapter(concatAdapter);
        }
        CardView cardView = (CardView) _$_findCachedViewById(resetInternal.setMax.CallSuper);
        if (cardView != null) {
            cardView.setOnClickListener(new toIntRange(this));
        }
        CardView cardView2 = (CardView) _$_findCachedViewById(resetInternal.setMax.CallSuper);
        if (cardView2 != null) {
            getBluetoothAdapterState.setMin(cardView2, (Integer) null, (Integer) null, Integer.valueOf(setActionOn.length(getContext())), 7);
        }
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r11) {
        TabBarDataStorage.Listener.getMin getmin = new TabBarDataStorage.Listener.getMin((byte) 0);
        if (r11 != null) {
            getmin.getMin = r11;
            getmin.length = new MerchantDetailConfigModule(new length(this));
            getmin.getMax = new MerchantAverageRatingModule(new setMax(this));
            getmin.setMin = new MerchantDetailReviewModule(new toFloatRange(this));
            getmin.setMax = new MerchantDanaDealsModule(new getMin(this));
            stopIgnoring.setMin(getmin.setMax, MerchantDanaDealsModule.class);
            stopIgnoring.setMin(getmin.getMax, MerchantAverageRatingModule.class);
            stopIgnoring.setMin(getmin.length, MerchantDetailConfigModule.class);
            stopIgnoring.setMin(getmin.setMin, MerchantDetailReviewModule.class);
            stopIgnoring.setMin(getmin.getMin, PrepareException.AnonymousClass1.class);
            new TabBarDataStorage.Listener(getmin.setMax, getmin.getMax, getmin.length, getmin.setMin, getmin.getMin, (byte) 0).setMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[4];
            GriverBaseFragmentActivity.getMax getmax = this.merchantDetailConfigPresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantDetailConfigPresenter");
            }
            getminArr[0] = getmax;
            UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin getmin2 = this.promoDealsPresenter;
            if (getmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("promoDealsPresenter");
            }
            getminArr[1] = getmin2;
            onSettingChange.length length2 = this.ratingPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ratingPresenter");
            }
            getminArr[2] = length2;
            UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin setmin = this.reviewPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reviewPresenter");
            }
            getminArr[3] = setmin;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$onLoadMoreReviewClicked(MerchantDetailView merchantDetailView) {
        GriverOpenSettingListAdapter.OnSettingChangeListener onSettingChangeListener = merchantDetailView.equals;
        if (onSettingChangeListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantReviewsAdapter");
        }
        Collection max = onSettingChangeListener.getMax();
        if (!(max == null || max.isEmpty())) {
            List max2 = onSettingChangeListener.getMax();
            Intrinsics.checkNotNullExpressionValue(max2, FirebaseAnalytics.Param.ITEMS);
            if (((OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3) CollectionsKt.last(max2)).setMax == 3) {
                List max3 = onSettingChangeListener.getMax();
                Intrinsics.checkNotNullExpressionValue(max3, FirebaseAnalytics.Param.ITEMS);
                onSettingChangeListener.getMax(CollectionsKt.getLastIndex(max3));
            }
        }
        merchantDetailView.getMax();
    }

    public static final /* synthetic */ void access$setRatingStateOnError(MerchantDetailView merchantDetailView) {
        ShopModel shopModel = merchantDetailView.hashCode;
        if (shopModel == null) {
            return;
        }
        if (!f.AnonymousClass5.setMin(shopModel)) {
            GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1 r8 = merchantDetailView.toIntRange;
            if (r8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantUserReviewAdapter");
            }
            List arrayList = new ArrayList();
            SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMin getmin = SimpleListAdapter.SimpleViewHolder.AnonymousClass1.getMax;
            arrayList.add(new SimpleListAdapter.SimpleViewHolder.AnonymousClass1(5, (OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1) null, (MerchantConsultReviewModel) null, (ShopModel) null, 14));
            Unit unit = Unit.INSTANCE;
            r8.getMin(arrayList);
            return;
        }
        GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1 r82 = merchantDetailView.toIntRange;
        if (r82 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantUserReviewAdapter");
        }
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        r82.getMin(r82.setMax(shopModel));
    }

    public static final /* synthetic */ void access$updatePromoAndDealsInfo(MerchantDetailView merchantDetailView, List list, List list2) {
        ShopModel shopModel = merchantDetailView.hashCode;
        if (shopModel != null) {
            setOnSettingChangeListener setonsettingchangelistener = merchantDetailView.toFloatRange;
            if (setonsettingchangelistener == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantPromoDealsInfoAdapter");
            }
            Intrinsics.checkNotNullParameter(list2, "promoModels");
            Intrinsics.checkNotNullParameter(list, "dealsModels");
            Intrinsics.checkNotNullParameter(shopModel, "shopModel");
            List arrayList = new ArrayList();
            SimpleListAdapter.getMax getmax = SimpleListAdapter.getMin;
            Intrinsics.checkNotNullParameter(list2, "promoInfoModels");
            Intrinsics.checkNotNullParameter(list, "dealsInfoModels");
            Intrinsics.checkNotNullParameter(shopModel, "shopModel");
            arrayList.add(new SimpleListAdapter(0, list2, list, shopModel));
            Unit unit = Unit.INSTANCE;
            setonsettingchangelistener.getMin(arrayList);
        }
    }

    public static final /* synthetic */ void access$doOnMerchantDetailInteractionImplemented(MerchantDetailView merchantDetailView, Function1 function1) {
        for (Context context = merchantDetailView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof GriverBaseFragment) {
                function1.invoke(context);
            }
        }
        updateActionSheetContent.e(DanaLogConstants.ExceptionType.NEARBY_EXCEPTION, "Parent must implement MerchantDetailInteraction");
    }

    public static final /* synthetic */ void access$setCvBackToTopVisibility(MerchantDetailView merchantDetailView, boolean z) {
        Transition addTarget = new Slide(80).setDuration(600).addTarget((View) (CardView) merchantDetailView._$_findCachedViewById(resetInternal.setMax.CallSuper));
        Intrinsics.checkNotNullExpressionValue(addTarget, "Slide(Gravity.BOTTOM)\n  …addTarget(cv_back_to_top)");
        isHideOnContentScrollEnabled.getMin(merchantDetailView, addTarget);
        CardView cardView = (CardView) merchantDetailView._$_findCachedViewById(resetInternal.setMax.CallSuper);
        if (cardView != null) {
            View view = cardView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
    }

    public static final /* synthetic */ void access$checkIsMerchantPhotoShown(MerchantDetailView merchantDetailView, RecyclerView.valueOf valueof) {
        if (valueof == null || !(valueof instanceof hasRootStatusPermission.setMin)) {
            if (merchantDetailView.getMin()) {
                hasRootStatusPermission hasrootstatuspermission = merchantDetailView.getMax;
                if (hasrootstatuspermission == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPhotoAdapter");
                }
                if (hasrootstatuspermission.setMax()) {
                    setMin setmin = merchantDetailView.length;
                    if (setmin != null) {
                        setmin.getMin(false);
                        return;
                    }
                    return;
                }
            }
            setMin setmin2 = merchantDetailView.length;
            if (setmin2 != null) {
                setmin2.getMin(true);
                return;
            }
            return;
        }
        setMin setmin3 = merchantDetailView.length;
        if (setmin3 != null) {
            setmin3.getMin(false);
        }
    }

    public static final /* synthetic */ void access$openMerchantFormDialog(MerchantDetailView merchantDetailView, int i, MerchantConsultReviewModel merchantConsultReviewModel) {
        FragmentManager supportFragmentManager;
        BaseActivity baseActivity = merchantDetailView.getBaseActivity();
        if (baseActivity != null && (supportFragmentManager = baseActivity.getSupportFragmentManager()) != null) {
            MerchantReviewDialogFragment.getMin getmin = MerchantReviewDialogFragment.length;
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "this");
            merchantConsultReviewModel.setMin = i;
            Intrinsics.checkNotNullParameter(TrackerKey.SourceType.MERCHANT_DETAIL, "<set-?>");
            merchantConsultReviewModel.getMax = TrackerKey.SourceType.MERCHANT_DETAIL;
            Unit unit = Unit.INSTANCE;
            MerchantReviewDialogFragment.getMin.setMin(supportFragmentManager, merchantConsultReviewModel, true, new equals(merchantDetailView, merchantConsultReviewModel, i));
        }
    }

    public static final /* synthetic */ void access$handleOnReviewDialogDismiss(MerchantDetailView merchantDetailView, MerchantReviewDialogDismissState merchantReviewDialogDismissState) {
        int i = getDevicePerformance.getMin[merchantReviewDialogDismissState.ordinal()];
        if (i == 1) {
            ViewRatingStarBar viewRatingStarBar = (ViewRatingStarBar) merchantDetailView._$_findCachedViewById(resetInternal.setMax.getContentPaddingBottom);
            if (viewRatingStarBar != null) {
                viewRatingStarBar.setStarSelected(0);
            }
        } else if (i == 2) {
            GriverOpenSettingListAdapter.OpenSettingViewHolder.AnonymousClass1 r5 = merchantDetailView.toIntRange;
            if (r5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantUserReviewAdapter");
            }
            List max = r5.getMax();
            Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
            Iterator it = max.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (((SimpleListAdapter.SimpleViewHolder.AnonymousClass1) it.next()).setMin == 4) {
                    break;
                }
                i2++;
            }
            r5.getMax().remove(i2);
            r5.notifyItemRemoved(i2);
        }
    }
}
