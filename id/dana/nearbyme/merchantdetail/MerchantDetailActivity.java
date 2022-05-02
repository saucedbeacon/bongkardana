package id.dana.nearbyme.merchantdetail;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.di.modules.MerchantDetailModule;
import id.dana.nearbyme.PromoListDialogFragment;
import id.dana.nearbyme.di.module.NearbyTrackerModule;
import id.dana.nearbyme.merchantdetail.adapter.MerchantLabelType;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotosView;
import id.dana.nearbyme.merchantdetail.merchantreviewdetail.MerchantReviewDetailActivity;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantAverageRatingView;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantDanaDealsView;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantDetailMenuView;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantInfoView;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantLatestReviewView;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantPromoView;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CornerMarkingDataProvider;
import o.GriverAboutUrlExtensionImpl;
import o.GriverBaseFragment;
import o.GriverMenuExtensionImpl;
import o.GriverProgressBar;
import o.GriverTransActivity;
import o.OptionMenuRecyclerAdapter;
import o.PrepareException;
import o.RewriteQueriesToDropUnusedColumns;
import o.ShareMenu;
import o.WheelView;
import o.containsFavoriteMenuItem;
import o.dispatchOnCancelled;
import o.evaluate;
import o.f;
import o.getInputContent;
import o.k;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.onMeasure;
import o.putStaticPluginModel;
import o.resetInternal;
import o.setClientId;
import o.setPublishStatus;
import o.setStateOn;
import o.startBeaconDiscovery;
import o.stopIgnoring;
import o.t;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\u0018\u0000 j2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001jB\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u000202H\u0002J\b\u00104\u001a\u000205H\u0016J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0002J\b\u0010:\u001a\u000202H\u0002J\b\u0010;\u001a\u000202H\u0016J\b\u0010<\u001a\u000202H\u0002J\b\u0010=\u001a\u000202H\u0002J\b\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u0002022\u0006\u0010A\u001a\u00020\"H\u0002J\b\u0010B\u001a\u000202H\u0002J\u0016\u0010C\u001a\u0002022\f\u0010D\u001a\b\u0012\u0004\u0012\u00020E0/H\u0016J\u0012\u0010F\u001a\u0002022\b\u0010G\u001a\u0004\u0018\u000107H\u0002J\u0016\u0010H\u001a\u0002022\f\u0010I\u001a\b\u0012\u0004\u0012\u00020J0/H\u0016J\b\u0010K\u001a\u00020\u0006H\u0016J\b\u0010L\u001a\u000202H\u0002J\u0010\u0010M\u001a\u0002022\u0006\u0010N\u001a\u00020\"H\u0002J\b\u0010O\u001a\u000202H\u0002J\b\u0010P\u001a\u000202H\u0002J\b\u0010Q\u001a\u000202H\u0002J\b\u0010R\u001a\u000202H\u0002J\u000f\u0010S\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u000202H\u0002J\b\u0010V\u001a\u000202H\u0002J\b\u0010W\u001a\u000202H\u0002J\b\u0010X\u001a\u000202H\u0002J\b\u0010Y\u001a\u000202H\u0002J\b\u0010Z\u001a\u000202H\u0002J\b\u0010[\u001a\u000202H\u0002J\u000f\u0010\\\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0002\u0010TJ\b\u0010]\u001a\u000202H\u0002J\b\u0010^\u001a\u000202H\u0002J\b\u0010_\u001a\u000202H\u0002J\b\u0010`\u001a\u000202H\u0002J\u0010\u0010a\u001a\u0002022\u0006\u0010A\u001a\u00020\"H\u0002J\b\u0010b\u001a\u000202H\u0002J\b\u0010c\u001a\u000202H\u0002J\b\u0010d\u001a\u000202H\u0016J\b\u0010e\u001a\u000202H\u0002J\r\u0010f\u001a\u000202H\u0000¢\u0006\u0002\bgJ\b\u0010h\u001a\u000202H\u0002J\b\u0010i\u001a\u000202H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b#\u0010$R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X.¢\u0006\u0002\n\u0000¨\u0006k"}, d2 = {"Lid/dana/nearbyme/merchantdetail/MerchantDetailActivity;", "Lid/dana/base/BaseActivity;", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantDetailInteraction;", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantPromoView$PromoViewInteraction;", "()V", "currentShopModel", "Lid/dana/nearbyme/model/ShopModel;", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "getDanaLoadingDialog", "()Lid/dana/dialog/DanaLoadingDialog;", "danaLoadingDialog$delegate", "Lkotlin/Lazy;", "lat", "", "locationUpdateObserver", "Lio/reactivex/disposables/Disposable;", "long", "merchantDetailPresenter", "Lid/dana/nearbyme/merchantdetail/MerchantDetailContract$Presenter;", "getMerchantDetailPresenter", "()Lid/dana/nearbyme/merchantdetail/MerchantDetailContract$Presenter;", "setMerchantDetailPresenter", "(Lid/dana/nearbyme/merchantdetail/MerchantDetailContract$Presenter;)V", "merchantHeaderImageSkeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "merchantInfoViewSkeleton", "nearbyAnalyticTracker", "Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "getNearbyAnalyticTracker", "()Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "setNearbyAnalyticTracker", "(Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;)V", "pageSource", "", "getPageSource", "()Ljava/lang/String;", "pageSource$delegate", "tracker", "Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;", "getTracker", "()Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;", "setTracker", "(Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;)V", "viewState", "Lid/dana/nearbyme/merchantdetail/model/MerchantDetailViewState;", "createMerchantLabels", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantLabelModel;", "dismissLoadingDialog", "", "disposeLocationUpdateObserver", "getLayout", "", "getLocation", "Landroid/location/Location;", "latitude", "longitude", "getShopDetail", "init", "initInjector", "initLocationUpdateRequest", "isNotHavePermissionLocation", "", "launchMessage", "phone", "observeMerchantInfo", "onImageLoaded", "images", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "onLocationUpdate", "location", "onSeeAllPromoClick", "promoInfos", "Lid/dana/nearbyme/model/PromoInfoModel;", "provideShopModel", "setDefaultImageToHeader", "setImageToPhotoViewAndHeader", "imageUrl", "setupDefaultLocation", "setupHeader", "setupMerchantAverageRating", "setupMerchantDanaDeals", "setupMerchantDetailMenu", "()Lkotlin/Unit;", "setupMerchantHeaderImageSkeleton", "setupMerchantInfo", "setupMerchantInfoViewSkeleton", "setupMerchantLabelRecyclerView", "setupMerchantLatestReview", "setupMerchantPhotos", "setupMerchantPromo", "setupShareClickEvent", "setupToolbar", "setupTryAgainButton", "setupUi", "setupViewState", "showContactUsDialog", "showEmptyState", "showExistState", "showLoadingDialog", "trackHomeShoppingOpen", "trackHomeShoppingOrder", "trackHomeShoppingOrder$app_productionRelease", "trackOpenActivity", "updateLocation", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantDetailActivity extends BaseActivity implements GriverBaseFragment, MerchantPromoView.getMin {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    @NotNull
    public static final String EXTRA_SHOP_MODEL = "EXTRA_SHOP_MODEL";
    @NotNull
    public static final String EXTRA_SOURCE = "EXTRA_SOURCE";
    private final Lazy FastBitmap$CoordinateSystem = LazyKt.lazy(new length(this));
    private GriverProgressBar.UpdateRunnable IsOverlapping;
    /* access modifiers changed from: private */
    public onDetachedFromLayoutParams equals;
    /* access modifiers changed from: private */
    public double getMax;
    private final Lazy getMin = LazyKt.lazy(new getMax(this));
    /* access modifiers changed from: private */
    public onDetachedFromLayoutParams isInside;
    @Inject
    public GriverTransActivity.Lite1.setMax merchantDetailPresenter;
    @Inject
    public t nearbyAnalyticTracker;
    /* access modifiers changed from: private */
    public double setMax;
    /* access modifiers changed from: private */
    public ShopModel toFloatRange;
    /* access modifiers changed from: private */
    public GriverMenuExtensionImpl toIntRange;
    private HashMap toString;
    @Inject
    public ShareMenu.AnonymousClass1 tracker;

    public final void _$_clearFindViewByIdCache() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1200065696, oncanceled);
            onCancelLoad.getMin(-1200065696, oncanceled);
        }
        HashMap hashMap = this.toString;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 57226764 == (max = dispatchOnCancelled.getMax(applicationContext, 57226764)))) {
            onCanceled oncanceled = new onCanceled(57226764, max, 512);
            onCancelLoad.setMax(57226764, oncanceled);
            onCancelLoad.getMin(57226764, oncanceled);
        }
        if (this.toString == null) {
            this.toString = new HashMap();
        }
        View view = (View) this.toString.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toString.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_merchant_detail;
    }

    @JvmDefault
    public final void updatePromoBadge(@NotNull ShopModel shopModel) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/nearbyme/merchantdetail/model/MerchantInfoModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMin extends FunctionReferenceImpl implements Function1<OptionMenuRecyclerAdapter, Unit> {
        getMin(MerchantDetailMenuView merchantDetailMenuView) {
            super(1, merchantDetailMenuView, MerchantDetailMenuView.class, "renderMenu", "renderMenu(Lid/dana/nearbyme/merchantdetail/model/MerchantInfoModel;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OptionMenuRecyclerAdapter) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull OptionMenuRecyclerAdapter optionMenuRecyclerAdapter) {
            Intrinsics.checkNotNullParameter(optionMenuRecyclerAdapter, "p1");
            ((MerchantDetailMenuView) this.receiver).renderMenu(optionMenuRecyclerAdapter);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Landroid/location/Location;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class hashCode extends FunctionReferenceImpl implements Function1<Location, Unit> {
        hashCode(MerchantDetailActivity merchantDetailActivity) {
            super(1, merchantDetailActivity, MerchantDetailActivity.class, "onLocationUpdate", "onLocationUpdate(Landroid/location/Location;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Location) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Location location) {
            MerchantDetailActivity.access$onLocationUpdate((MerchantDetailActivity) this.receiver, location);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class toDoubleRange extends FunctionReferenceImpl implements Function1<String, Unit> {
        toDoubleRange(MerchantDetailActivity merchantDetailActivity) {
            super(1, merchantDetailActivity, MerchantDetailActivity.class, "launchMessage", "launchMessage(Ljava/lang/String;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "p1");
            MerchantDetailActivity.access$launchMessage((MerchantDetailActivity) this.receiver, str);
        }
    }

    public static final /* synthetic */ ShopModel access$getCurrentShopModel$p(MerchantDetailActivity merchantDetailActivity) {
        ShopModel shopModel = merchantDetailActivity.toFloatRange;
        if (shopModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
        }
        return shopModel;
    }

    public static final /* synthetic */ GriverMenuExtensionImpl access$getViewState$p(MerchantDetailActivity merchantDetailActivity) {
        GriverMenuExtensionImpl griverMenuExtensionImpl = merchantDetailActivity.toIntRange;
        if (griverMenuExtensionImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        return griverMenuExtensionImpl;
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
    public final t getNearbyAnalyticTracker() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1815384352 == (max = dispatchOnCancelled.getMax(applicationContext, 1815384352)))) {
            onCanceled oncanceled = new onCanceled(1815384352, max, 512);
            onCancelLoad.setMax(1815384352, oncanceled);
            onCancelLoad.getMin(1815384352, oncanceled);
        }
        t tVar = this.nearbyAnalyticTracker;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
        }
        return tVar;
    }

    public final void setNearbyAnalyticTracker(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.nearbyAnalyticTracker = tVar;
    }

    @NotNull
    public final GriverTransActivity.Lite1.setMax getMerchantDetailPresenter() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1258389943, oncanceled);
            onCancelLoad.getMin(-1258389943, oncanceled);
        }
        GriverTransActivity.Lite1.setMax setmax = this.merchantDetailPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPresenter");
        }
        return setmax;
    }

    public final void setMerchantDetailPresenter(@NotNull GriverTransActivity.Lite1.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.merchantDetailPresenter = setmax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/dialog/DanaLoadingDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<setPublishStatus> {
        final /* synthetic */ MerchantDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(MerchantDetailActivity merchantDetailActivity) {
            super(0);
            this.this$0 = merchantDetailActivity;
        }

        @NotNull
        public final setPublishStatus invoke() {
            return new setPublishStatus(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<String> {
        final /* synthetic */ MerchantDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(MerchantDetailActivity merchantDetailActivity) {
            super(0);
            this.this$0 = merchantDetailActivity;
        }

        @NotNull
        public final String invoke() {
            String str;
            Bundle extras;
            Intent intent = this.this$0.getIntent();
            if (intent == null || (extras = intent.getExtras()) == null || (str = extras.getString("EXTRA_SOURCE")) == null) {
                str = "";
            }
            Intrinsics.checkNotNullExpressionValue(str, "intent?.extras?.getString(EXTRA_SOURCE) ?: \"\"");
            return str;
        }
    }

    @NotNull
    public final ShopModel provideShopModel() {
        ShopModel shopModel = this.toFloatRange;
        if (shopModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
        }
        return shopModel;
    }

    public final void onImageLoaded(@NotNull List<MerchantImageModel> list) {
        Intrinsics.checkNotNullParameter(list, "images");
        MerchantImageModel merchantImageModel = (MerchantImageModel) CollectionsKt.firstOrNull(list);
        if (merchantImageModel == null) {
            ((updateCornerMarking) Glide.setMin((FragmentActivity) this)).length(Integer.valueOf(R.drawable.ic_header_null)).setMax(evaluate.setMin).length((ImageView) (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.getMinimumWidth));
        } else {
            String str = merchantImageModel.length;
            if (RewriteQueriesToDropUnusedColumns.setMax(str)) {
                RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(this, (byte) 0);
                getmax.getMin = str;
                getmax.setMin = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.getMinimumWidth);
                new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
            } else {
                ((updateCornerMarking) Glide.setMin((FragmentActivity) this)).setMax(str).setMax(evaluate.setMin).setMin((int) R.drawable.ic_header_null).length((ImageView) (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.getMinimumWidth));
            }
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.isInside;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    public final void trackHomeShoppingOrder$app_productionRelease() {
        GriverMenuExtensionImpl griverMenuExtensionImpl = this.toIntRange;
        if (griverMenuExtensionImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        ShopModel shopModel = griverMenuExtensionImpl.setMax;
        t tVar = this.nearbyAnalyticTracker;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
        }
        String str = shopModel.asInterface;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = shopModel.invoke;
        if (str3 != null) {
            str2 = str3;
        }
        GriverMenuExtensionImpl griverMenuExtensionImpl2 = this.toIntRange;
        if (griverMenuExtensionImpl2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        tVar.getMax(str, str2, griverMenuExtensionImpl2.getMax);
    }

    public final void init() {
        int length2;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1955003523, oncanceled);
            onCancelLoad.getMin(1955003523, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(690912431, oncanceled2);
            onCancelLoad.getMin(690912431, oncanceled2);
        }
        putStaticPluginModel.length length3 = new putStaticPluginModel.length((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            length3.getMin = applicationComponent;
            length3.setMax = new NearbyTrackerModule();
            length3.getMax = new MerchantDetailModule(new setMax(this));
            stopIgnoring.setMin(length3.getMax, MerchantDetailModule.class);
            if (length3.setMax == null) {
                length3.setMax = new NearbyTrackerModule();
            }
            stopIgnoring.setMin(length3.getMin, PrepareException.AnonymousClass1.class);
            new putStaticPluginModel(length3.getMax, length3.setMax, length3.getMin, (byte) 0).getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            GriverTransActivity.Lite1.setMax setmax = this.merchantDetailPresenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantDetailPresenter");
            }
            getminArr[0] = setmax;
            registerPresenter(getminArr);
            this.isInside = containsFavoriteMenuItem.getMin((AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.getMinimumWidth), R.layout.view_skeleton_merchant_header_image);
            this.equals = containsFavoriteMenuItem.getMin((MerchantInfoView) _$_findCachedViewById(resetInternal.setMax.setPivotY), R.layout.view_merchant_info_skeleton);
            if (length() || !WheelView.ScrollerTask.length(this)) {
                getMax();
                IsOverlapping();
            } else {
                setMin();
            }
            DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.MediaBrowserCompat$MediaItem);
            if (danaButtonPrimaryView != null) {
                danaButtonPrimaryView.setOnClickListener(new values(this));
                return;
            }
            return;
        }
        throw null;
    }

    private final void setMin() {
        setMax();
        GriverProgressBar.UpdateRunnable subscribe = new WheelView.ScrollerTask.getMax(this).getMin().subscribe(new GriverTransActivity(new hashCode(this)));
        this.IsOverlapping = subscribe;
        addDisposable(subscribe);
    }

    private final void setMax() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(651082102, oncanceled);
            onCancelLoad.getMin(651082102, oncanceled);
        }
        GriverProgressBar.UpdateRunnable updateRunnable = this.IsOverlapping;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        this.IsOverlapping = null;
    }

    private final boolean length() {
        return CornerMarkingDataProvider.IsOverlapping() && !setStateOn.getMin(this, "android.permission.ACCESS_FINE_LOCATION");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ MerchantDetailActivity getMax;

        equals(MerchantDetailActivity merchantDetailActivity) {
            this.getMax = merchantDetailActivity;
        }

        public final void onClick(View view) {
            GriverMenuExtensionImpl access$getViewState$p = MerchantDetailActivity.access$getViewState$p(this.getMax);
            ShareMenu.AnonymousClass1 tracker = this.getMax.getTracker();
            String str = access$getViewState$p.setMax.asInterface;
            Intrinsics.checkNotNullExpressionValue(str, "shopModel.merchantName");
            String str2 = access$getViewState$p.setMax.invoke;
            Intrinsics.checkNotNullExpressionValue(str2, "shopModel.mainName");
            tracker.setMax(str, str2);
            MerchantDetailActivity merchantDetailActivity = this.getMax;
            Object[] objArr = new Object[2];
            String str3 = access$getViewState$p.setMax.invoke;
            if (str3 == null) {
                str3 = "";
            }
            objArr[0] = str3;
            ShopModel shopModel = access$getViewState$p.setMax;
            Intrinsics.checkNotNullParameter(shopModel, "$this$getDeeplinkUrl");
            StringBuilder sb = new StringBuilder("https://link.dana.id/merchant-detail?params=[s=");
            String str4 = shopModel.b;
            Intrinsics.checkNotNullExpressionValue(str4, FeatureParams.SHOP_ID);
            sb.append(f.AnonymousClass5.length(str4));
            sb.append(",m=");
            String str5 = shopModel.Grayscale$Algorithm;
            Intrinsics.checkNotNullExpressionValue(str5, "merchantId");
            sb.append(f.AnonymousClass5.length(str5));
            sb.append(']');
            objArr[1] = sb.toString();
            String string = merchantDetailActivity.getString(R.string.merchant_detail_deeplink_share, objArr);
            Intrinsics.checkNotNullExpressionValue(string, "getString(\n             …nkUrl()\n                )");
            startBeaconDiscovery.length(merchantDetailActivity, string);
        }
    }

    private final Unit getMin() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.needsDividerBefore);
        if (appCompatImageView == null) {
            return null;
        }
        appCompatImageView.setOnClickListener(new equals(this));
        return Unit.INSTANCE;
    }

    private final void equals() {
        String str;
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(687545939, oncanceled);
            onCancelLoad.getMin(687545939, oncanceled);
        }
        ShareMenu.AnonymousClass1 r0 = this.tracker;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tracker");
        }
        String str2 = (String) this.FastBitmap$CoordinateSystem.getValue();
        ShopModel shopModel = this.toFloatRange;
        if (shopModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
        }
        String str3 = shopModel.asInterface;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        ShopModel shopModel2 = this.toFloatRange;
        if (shopModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
        }
        String str5 = shopModel2.invoke;
        if (str5 == null) {
            str5 = str4;
        }
        ShopModel shopModel3 = this.toFloatRange;
        if (shopModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
        }
        if (shopModel3.extraCallbackWithResult == null || shopModel3.extraCallbackWithResult.isEmpty()) {
            str = str4;
        } else {
            str = shopModel3.getMin(false, ",");
        }
        if (str != null) {
            str4 = str;
        }
        r0.length(str2, str3, str5, str4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void IsOverlapping() {
        /*
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0016
            java.lang.String r2 = "EXTRA_SHOP_MODEL"
            android.os.Parcelable r0 = r0.getParcelable(r2)
            id.dana.nearbyme.model.ShopModel r0 = (id.dana.nearbyme.model.ShopModel) r0
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            boolean r2 = r0 instanceof id.dana.nearbyme.model.ShopModel
            if (r2 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x002c
            r3.toFloatRange = r1
            o.GriverMenuExtensionImpl r0 = new o.GriverMenuExtensionImpl
            r0.<init>(r1)
            r3.toIntRange = r0
            r3.Grayscale$Algorithm()
            return
        L_0x002c:
            r3.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyme.merchantdetail.MerchantDetailActivity.IsOverlapping():void");
    }

    private final void isInside() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1710923901, oncanceled);
            onCancelLoad.getMin(1710923901, oncanceled);
        }
        ShopModel shopModel = this.toFloatRange;
        if (shopModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
        }
        MerchantPhotosView merchantPhotosView = (MerchantPhotosView) _$_findCachedViewById(resetInternal.setMax.setScaleY);
        if (merchantPhotosView != null) {
            merchantPhotosView.setShopModel(shopModel);
        }
        MerchantPhotosView merchantPhotosView2 = (MerchantPhotosView) _$_findCachedViewById(resetInternal.setMax.setScaleY);
        if (merchantPhotosView2 != null) {
            merchantPhotosView2.loadImages();
        }
    }

    private final void toFloatRange() {
        ShopModel shopModel = this.toFloatRange;
        if (shopModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
        }
        MerchantDanaDealsView merchantDanaDealsView = (MerchantDanaDealsView) _$_findCachedViewById(resetInternal.setMax.setTranslationX);
        if (merchantDanaDealsView != null) {
            String str = shopModel.Grayscale$Algorithm;
            Intrinsics.checkNotNullExpressionValue(str, "merchantId");
            String str2 = shopModel.b;
            Intrinsics.checkNotNullExpressionValue(str2, FeatureParams.SHOP_ID);
            merchantDanaDealsView.getMerchantDanaDealsVoucher(str, str2);
        }
    }

    private final void toIntRange() {
        String str;
        ShopModel shopModel = this.toFloatRange;
        if (shopModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
        }
        MerchantInfoView merchantInfoView = (MerchantInfoView) _$_findCachedViewById(resetInternal.setMax.setPivotY);
        GriverMenuExtensionImpl griverMenuExtensionImpl = this.toIntRange;
        if (griverMenuExtensionImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        merchantInfoView.bindViewState(griverMenuExtensionImpl);
        getInputContent.setMin merchantInfoPresenter = ((MerchantInfoView) _$_findCachedViewById(resetInternal.setMax.setPivotY)).getMerchantInfoPresenter();
        String str2 = shopModel.b;
        if (str2 != null && (str = shopModel.Grayscale$Algorithm) != null) {
            String displayName = Calendar.getInstance().getDisplayName(7, 2, Locale.US);
            Intrinsics.checkNotNullExpressionValue(displayName, "Calendar.getInstance()\n …Calendar.LONG, Locale.US)");
            merchantInfoPresenter.setMax(str2, str, displayName);
            getInputContent.setMin merchantInfoPresenter2 = ((MerchantInfoView) _$_findCachedViewById(resetInternal.setMax.setPivotY)).getMerchantInfoPresenter();
            ShopModel shopModel2 = this.toFloatRange;
            if (shopModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
            }
            merchantInfoPresenter2.getMax(shopModel2);
        }
    }

    private final void values() {
        ((MerchantAverageRatingView) _$_findCachedViewById(resetInternal.setMax.setPaddingBottom)).setPageSource((String) this.FastBitmap$CoordinateSystem.getValue());
        MerchantAverageRatingView merchantAverageRatingView = (MerchantAverageRatingView) _$_findCachedViewById(resetInternal.setMax.setPaddingBottom);
        if (merchantAverageRatingView != null) {
            merchantAverageRatingView.setOnSeeAllClickListener(new toIntRange(this));
        }
        MerchantAverageRatingView merchantAverageRatingView2 = (MerchantAverageRatingView) _$_findCachedViewById(resetInternal.setMax.setPaddingBottom);
        if (merchantAverageRatingView2 != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            ShopModel shopModel = this.toFloatRange;
            if (shopModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
            }
            merchantAverageRatingView2.loadAverageRating(supportFragmentManager, shopModel, true, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ MerchantDetailActivity length;

        toIntRange(MerchantDetailActivity merchantDetailActivity) {
            this.length = merchantDetailActivity;
        }

        public final void onClick(View view) {
            MerchantReviewDetailActivity.length length2 = MerchantReviewDetailActivity.Companion;
            MerchantDetailActivity merchantDetailActivity = this.length;
            MerchantReviewDetailActivity.length.length(merchantDetailActivity, MerchantDetailActivity.access$getPageSource$p(merchantDetailActivity), MerchantDetailActivity.access$getCurrentShopModel$p(this.length));
        }
    }

    private final void FastBitmap$CoordinateSystem() {
        if (this.toFloatRange == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
        }
        MerchantLatestReviewView merchantLatestReviewView = (MerchantLatestReviewView) _$_findCachedViewById(resetInternal.setMax.setVerticalGap);
        if (merchantLatestReviewView != null) {
            merchantLatestReviewView.setPageSource((String) this.FastBitmap$CoordinateSystem.getValue());
        }
        MerchantLatestReviewView merchantLatestReviewView2 = (MerchantLatestReviewView) _$_findCachedViewById(resetInternal.setMax.setVerticalGap);
        if (merchantLatestReviewView2 != null) {
            ShopModel shopModel = this.toFloatRange;
            if (shopModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
            }
            merchantLatestReviewView2.loadLatestReview(shopModel);
        }
    }

    private final void toDoubleRange() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1021224590, oncanceled);
            onCancelLoad.getMin(1021224590, oncanceled);
        }
        Context context = this;
        GriverTransActivity.Lite3 lite3 = new GriverTransActivity.Lite3(context);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.VisibleForTesting);
        if (recyclerView != null) {
            recyclerView.setAdapter(lite3);
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.VisibleForTesting);
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(context, 0, false));
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1139541433, oncanceled2);
            onCancelLoad.getMin(1139541433, oncanceled2);
        }
        ArrayList arrayList = new ArrayList();
        ShopModel shopModel = this.toFloatRange;
        if (shopModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
        }
        if (shopModel.toIntRange()) {
            arrayList.add(new GriverAboutUrlExtensionImpl(MerchantLabelType.ORDER_ONLINE.getValue(), ""));
        }
        if (shopModel.toDoubleRange()) {
            arrayList.add(new GriverAboutUrlExtensionImpl(MerchantLabelType.QRIS.getValue(), ""));
        }
        if (shopModel.getMin()) {
            arrayList.add(new GriverAboutUrlExtensionImpl(MerchantLabelType.TOP_UP.getValue(), ""));
        }
        if (shopModel.FastBitmap$CoordinateSystem()) {
            arrayList.add(new GriverAboutUrlExtensionImpl(MerchantLabelType.BISNIS.getValue(), ""));
        }
        lite3.getMin(arrayList);
    }

    private final Unit valueOf() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -257747161 == (max = dispatchOnCancelled.getMax(applicationContext, -257747161)))) {
            onCanceled oncanceled = new onCanceled(-257747161, max, 512);
            onCancelLoad.setMax(-257747161, oncanceled);
            onCancelLoad.getMin(-257747161, oncanceled);
        }
        MerchantDetailMenuView merchantDetailMenuView = (MerchantDetailMenuView) _$_findCachedViewById(resetInternal.setMax.setScaleX);
        if (merchantDetailMenuView == null) {
            return null;
        }
        GriverMenuExtensionImpl griverMenuExtensionImpl = this.toIntRange;
        if (griverMenuExtensionImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        merchantDetailMenuView.bindViewState(griverMenuExtensionImpl);
        merchantDetailMenuView.setActionListener(new isInside(this));
        return Unit.INSTANCE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"id/dana/nearbyme/merchantdetail/MerchantDetailActivity$setupMerchantDetailMenu$1$1", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailMenuView$ActionListener;", "onContactUsAction", "", "phone", "", "onGetActionConfig", "onHomeShoppingAction", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements MerchantDetailMenuView.setMax {
        final /* synthetic */ MerchantDetailActivity getMax;

        isInside(MerchantDetailActivity merchantDetailActivity) {
            this.getMax = merchantDetailActivity;
        }

        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "phone");
            MerchantDetailActivity.access$showContactUsDialog(this.getMax, str);
        }

        public final void length() {
            MerchantDetailActivity.access$observeMerchantInfo(this.getMax);
        }

        public final void getMin() {
            MerchantDetailActivity.access$trackHomeShoppingOpen(this.getMax);
            k.AnonymousClass10.getMin getmin = k.AnonymousClass10.length;
            FragmentManager supportFragmentManager = this.getMax.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            k.AnonymousClass10.getMin.length(supportFragmentManager, MerchantDetailActivity.access$getViewState$p(this.getMax));
        }
    }

    /* access modifiers changed from: private */
    public final void invokeSuspend() {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) _$_findCachedViewById(resetInternal.setMax.access$001);
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setVisibility(8);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.PostMessageService);
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(0);
        }
        NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(resetInternal.setMax.setCustomView);
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(8);
        }
        MerchantDetailMenuView merchantDetailMenuView = (MerchantDetailMenuView) _$_findCachedViewById(resetInternal.setMax.setScaleX);
        if (merchantDetailMenuView != null) {
            merchantDetailMenuView.setVisibility(8);
        }
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.MediaSessionCompat$Token);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class values implements View.OnClickListener {
        final /* synthetic */ MerchantDetailActivity setMin;

        values(MerchantDetailActivity merchantDetailActivity) {
            this.setMin = merchantDetailActivity;
        }

        public final void onClick(View view) {
            MerchantDetailActivity.access$showExistState(this.setMin);
            MerchantDetailActivity.access$initLocationUpdateRequest(this.setMin);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void invoke() {
        /*
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0016
            java.lang.String r2 = "EXTRA_SHOP_MODEL"
            android.os.Parcelable r0 = r0.getParcelable(r2)
            id.dana.nearbyme.model.ShopModel r0 = (id.dana.nearbyme.model.ShopModel) r0
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            boolean r2 = r0 instanceof id.dana.nearbyme.model.ShopModel
            if (r2 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            java.lang.String r0 = ""
            if (r1 == 0) goto L_0x002d
            java.lang.String r2 = r1.Grayscale$Algorithm
            if (r2 != 0) goto L_0x0026
            r2 = r0
        L_0x0026:
            java.lang.String r1 = r1.b
            if (r1 != 0) goto L_0x002b
            goto L_0x0054
        L_0x002b:
            r0 = r1
            goto L_0x0054
        L_0x002d:
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x0053
            java.lang.String r2 = "EXTRA_MERCHANT_ID"
            java.lang.String r2 = r1.getString(r2, r0)
            java.lang.String r3 = "getString(EXTRA_MERCHANT_ID, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = "EXTRA_SHOP_ID"
            java.lang.String r0 = r1.getString(r3, r0)
            java.lang.String r1 = "getString(EXTRA_SHOP_ID, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L_0x0054
        L_0x0053:
            r2 = r0
        L_0x0054:
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x005f
            r1 = 1
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            if (r1 == 0) goto L_0x006f
            o.GriverTransActivity$Lite1$setMax r1 = r4.merchantDetailPresenter
            if (r1 != 0) goto L_0x006b
            java.lang.String r3 = "merchantDetailPresenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x006b:
            r1.setMax(r2, r0)
            return
        L_0x006f:
            o.onDetachedFromLayoutParams r0 = r4.isInside
            if (r0 == 0) goto L_0x0076
            r0.length()
        L_0x0076:
            o.onDetachedFromLayoutParams r0 = r4.equals
            if (r0 == 0) goto L_0x007d
            r0.length()
        L_0x007d:
            r4.invokeSuspend()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyme.merchantdetail.MerchantDetailActivity.invoke():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ MerchantDetailActivity setMax;

        IsOverlapping(MerchantDetailActivity merchantDetailActivity) {
            this.setMax = merchantDetailActivity;
        }

        public final void onClick(View view) {
            this.setMax.onBackPressed();
        }
    }

    private final void Mean$Arithmetic() {
        ((Toolbar) _$_findCachedViewById(resetInternal.setMax.isFocused)).setNavigationOnClickListener(new IsOverlapping(this));
        ((NestedScrollView) _$_findCachedViewById(resetInternal.setMax.setCustomView)).setOnScrollChangeListener(new toFloatRange(this));
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.PostMessageService);
        if (appCompatTextView != null) {
            ShopModel shopModel = this.toFloatRange;
            if (shopModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
            }
            String str = shopModel.invoke;
            if (str == null) {
                str = "";
            }
            appCompatTextView.setText(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/core/widget/NestedScrollView;", "<anonymous parameter 1>", "", "scrollY", "<anonymous parameter 3>", "<anonymous parameter 4>", "onScrollChange"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements NestedScrollView.setMax {
        final /* synthetic */ MerchantDetailActivity length;

        toFloatRange(MerchantDetailActivity merchantDetailActivity) {
            this.length = merchantDetailActivity;
        }

        public final void setMax(@Nullable NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.length._$_findCachedViewById(resetInternal.setMax.access$001);
            if (collapsingToolbarLayout != null && collapsingToolbarLayout.getMeasuredHeight() > 0) {
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.length._$_findCachedViewById(resetInternal.setMax.PostMessageService);
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "tv_toolbar_title");
                float f = (float) i2;
                CollapsingToolbarLayout collapsingToolbarLayout2 = (CollapsingToolbarLayout) this.length._$_findCachedViewById(resetInternal.setMax.access$001);
                Intrinsics.checkNotNullExpressionValue(collapsingToolbarLayout2, "collapsing_toolbar");
                appCompatTextView.setAlpha(f / ((float) collapsingToolbarLayout2.getMeasuredHeight()));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"id/dana/nearbyme/merchantdetail/MerchantDetailActivity$initInjector$1", "Lid/dana/nearbyme/merchantdetail/MerchantDetailContract$View;", "onFailedFetch", "", "onSuccessFetch", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements GriverTransActivity.Lite1.setMin {
        final /* synthetic */ MerchantDetailActivity length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(1823724663, oncanceled);
                onCancelLoad.getMin(1823724663, oncanceled);
            }
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMax(MerchantDetailActivity merchantDetailActivity) {
            this.length = merchantDetailActivity;
        }

        public final void getMin(@NotNull ShopModel shopModel) {
            Intrinsics.checkNotNullParameter(shopModel, "shopModel");
            Location access$getLocation = MerchantDetailActivity.access$getLocation(this.length, shopModel.values, shopModel.toString);
            MerchantDetailActivity merchantDetailActivity = this.length;
            double distanceTo = (double) MerchantDetailActivity.access$getLocation(merchantDetailActivity, merchantDetailActivity.setMax, this.length.getMax).distanceTo(access$getLocation);
            Double.isNaN(distanceTo);
            shopModel.toFloatRange = distanceTo / 1000.0d;
            this.length.toFloatRange = shopModel;
            this.length.toIntRange = new GriverMenuExtensionImpl(shopModel);
            this.length.Grayscale$Algorithm();
        }

        public final void length() {
            onDetachedFromLayoutParams access$getMerchantHeaderImageSkeleton$p = this.length.isInside;
            if (access$getMerchantHeaderImageSkeleton$p != null) {
                access$getMerchantHeaderImageSkeleton$p.length();
            }
            onDetachedFromLayoutParams access$getMerchantInfoViewSkeleton$p = this.length.equals;
            if (access$getMerchantInfoViewSkeleton$p != null) {
                access$getMerchantInfoViewSkeleton$p.length();
            }
            this.length.invokeSuspend();
        }
    }

    /* access modifiers changed from: private */
    public final void Grayscale$Algorithm() {
        toIntRange();
        create();
        isInside();
        values();
        FastBitmap$CoordinateSystem();
        toFloatRange();
        valueOf();
        Mean$Arithmetic();
        toDoubleRange();
        getMin();
        equals();
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.isInside;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams2 = this.equals;
        if (ondetachedfromlayoutparams2 != null) {
            ondetachedfromlayoutparams2.length();
        }
    }

    private final void create() {
        MerchantPromoView merchantPromoView;
        MerchantInfoView merchantInfoView = (MerchantInfoView) _$_findCachedViewById(resetInternal.setMax.setPivotY);
        if (merchantInfoView != null && (merchantPromoView = (MerchantPromoView) merchantInfoView._$_findCachedViewById(resetInternal.setMax.ActionBarContainer)) != null) {
            merchantPromoView.setListener(this);
        }
    }

    public final void onSeeAllPromoClick(@NotNull List<? extends PromoInfoModel> list) {
        Intrinsics.checkNotNullParameter(list, "promoInfos");
        PromoListDialogFragment promoListDialogFragment = new PromoListDialogFragment(getBaseContext());
        promoListDialogFragment.getMax = list;
        promoListDialogFragment.show(getSupportFragmentManager(), "Show Nearby Promo List Dialog");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/nearbyme/merchantdetail/MerchantDetailActivity$Companion;", "", "()V", "EXTRA_MERCHANT_ID", "", "EXTRA_SHOP_ID", "EXTRA_SHOP_MODEL", "EXTRA_SOURCE", "open", "", "context", "Landroid/content/Context;", "merchantId", "shopId", "source", "openMerchantDetailActivity", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }

        public static void setMax(@NotNull Context context, @NotNull ShopModel shopModel, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(shopModel, "shopModel");
            Intrinsics.checkNotNullParameter(str, "source");
            Intent putExtra = new Intent(context, MerchantDetailActivity.class).putExtra("EXTRA_SHOP_MODEL", shopModel).putExtra("EXTRA_SOURCE", str);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, Merchant…tra(EXTRA_SOURCE, source)");
            context.startActivity(putExtra);
        }

        public static void setMax(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            Intrinsics.checkNotNullParameter(str3, "source");
            Intent putExtra = new Intent(context, MerchantDetailActivity.class).putExtra("EXTRA_SHOP_ID", str2).putExtra("EXTRA_MERCHANT_ID", str).putExtra("EXTRA_SOURCE", str3);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, Merchant…tra(EXTRA_SOURCE, source)");
            context.startActivity(putExtra);
        }
    }

    public final void showLoadingDialog() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-477031236, oncanceled);
            onCancelLoad.getMin(-477031236, oncanceled);
        }
        setPublishStatus setpublishstatus = (setPublishStatus) this.getMin.getValue();
        if (!setpublishstatus.length.isShowing()) {
            setpublishstatus.length.show();
            setpublishstatus.getMax.startRefresh();
        }
    }

    public final void dismissLoadingDialog() {
        ((setPublishStatus) this.getMin.getValue()).getMax();
    }

    private final void getMax() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(750914206, oncanceled);
            onCancelLoad.getMin(750914206, oncanceled);
        }
        Location location = new Location("");
        location.setLatitude(-6.17476d);
        location.setLongitude(106.827072d);
        this.setMax = location.getLatitude();
        this.getMax = location.getLongitude();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        if (r3 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void access$onLocationUpdate(id.dana.nearbyme.merchantdetail.MerchantDetailActivity r2, android.location.Location r3) {
        /*
            if (r3 == 0) goto L_0x0010
            double r0 = r3.getLatitude()
            r2.setMax = r0
            double r0 = r3.getLongitude()
            r2.getMax = r0
            if (r3 != 0) goto L_0x0018
        L_0x0010:
            r3 = r2
            id.dana.nearbyme.merchantdetail.MerchantDetailActivity r3 = (id.dana.nearbyme.merchantdetail.MerchantDetailActivity) r3
            r3.getMax()
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
        L_0x0018:
            r2.setMax()
            r2.IsOverlapping()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyme.merchantdetail.MerchantDetailActivity.access$onLocationUpdate(id.dana.nearbyme.merchantdetail.MerchantDetailActivity, android.location.Location):void");
    }

    public static final /* synthetic */ String access$getPageSource$p(MerchantDetailActivity merchantDetailActivity) {
        return (String) merchantDetailActivity.FastBitmap$CoordinateSystem.getValue();
    }

    public static final /* synthetic */ void access$showContactUsDialog(MerchantDetailActivity merchantDetailActivity, String str) {
        setClientId.setMin setmin = new setClientId.setMin((byte) 0);
        Intrinsics.checkNotNullParameter(str, "callNumber");
        setClientId.setMin setmin2 = setmin;
        setmin2.getMin = str;
        Intrinsics.checkNotNullParameter(str, "messageNumber");
        setClientId.setMin setmin3 = setmin2;
        setmin3.length = str;
        MerchantDetailActivity merchantDetailActivity2 = merchantDetailActivity;
        Function1<? super String, Unit> merchantDetailActivity$FastBitmap$CoordinateSystem = new MerchantDetailActivity$FastBitmap$CoordinateSystem(merchantDetailActivity2);
        Intrinsics.checkNotNullParameter(merchantDetailActivity$FastBitmap$CoordinateSystem, "onCallClick");
        setClientId.setMin setmin4 = setmin3;
        setmin4.getMax = merchantDetailActivity$FastBitmap$CoordinateSystem;
        Function1<? super String, Unit> todoublerange = new toDoubleRange(merchantDetailActivity2);
        Intrinsics.checkNotNullParameter(todoublerange, "onMessageClick");
        setClientId.setMin setmin5 = setmin4;
        setmin5.setMax = todoublerange;
        new setClientId(new setClientId.setMin(setmin5.getMin, setmin5.length, setmin5.getMax, setmin5.setMax)).show(merchantDetailActivity.getSupportFragmentManager(), "DialogContactUs");
    }

    public static final /* synthetic */ void access$observeMerchantInfo(MerchantDetailActivity merchantDetailActivity) {
        MerchantDetailMenuView merchantDetailMenuView = (MerchantDetailMenuView) merchantDetailActivity._$_findCachedViewById(resetInternal.setMax.setScaleX);
        if (merchantDetailMenuView != null) {
            GriverMenuExtensionImpl griverMenuExtensionImpl = merchantDetailActivity.toIntRange;
            if (griverMenuExtensionImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewState");
            }
            griverMenuExtensionImpl.getMin.getMax(merchantDetailActivity, new onMeasure() {
                public final /* synthetic */ void onChanged(Object obj) {
                    Intrinsics.checkNotNullExpressionValue(Function1.this.invoke(obj), "invoke(...)");
                }
            });
        }
    }

    public static final /* synthetic */ void access$trackHomeShoppingOpen(MerchantDetailActivity merchantDetailActivity) {
        GriverMenuExtensionImpl griverMenuExtensionImpl = merchantDetailActivity.toIntRange;
        if (griverMenuExtensionImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        t tVar = merchantDetailActivity.nearbyAnalyticTracker;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
        }
        tVar.setMin(griverMenuExtensionImpl.setMax, griverMenuExtensionImpl.getMax);
    }

    public static final /* synthetic */ void access$launchMessage(MerchantDetailActivity merchantDetailActivity, String str) {
        Object[] objArr = new Object[1];
        GriverMenuExtensionImpl griverMenuExtensionImpl = merchantDetailActivity.toIntRange;
        if (griverMenuExtensionImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        String str2 = griverMenuExtensionImpl.setMax.invoke;
        if (str2 == null) {
            str2 = "";
        }
        objArr[0] = str2;
        String string = merchantDetailActivity.getString(R.string.customer_service_wa_template, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(\n            R…nName.orEmpty()\n        )");
        startBeaconDiscovery.getMin(merchantDetailActivity, str, string);
    }

    public static final /* synthetic */ void access$showExistState(MerchantDetailActivity merchantDetailActivity) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) merchantDetailActivity._$_findCachedViewById(resetInternal.setMax.access$001);
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setVisibility(0);
        }
        NestedScrollView nestedScrollView = (NestedScrollView) merchantDetailActivity._$_findCachedViewById(resetInternal.setMax.setCustomView);
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(0);
        }
        MerchantDetailMenuView merchantDetailMenuView = (MerchantDetailMenuView) merchantDetailActivity._$_findCachedViewById(resetInternal.setMax.setScaleX);
        if (merchantDetailMenuView != null) {
            merchantDetailMenuView.setVisibility(0);
        }
        View _$_findCachedViewById = merchantDetailActivity._$_findCachedViewById(resetInternal.setMax.MediaSessionCompat$Token);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(8);
        }
    }

    public static final /* synthetic */ void access$initLocationUpdateRequest(MerchantDetailActivity merchantDetailActivity) {
        if (merchantDetailActivity.length() || !WheelView.ScrollerTask.length(merchantDetailActivity)) {
            merchantDetailActivity.getMax();
            merchantDetailActivity.IsOverlapping();
            return;
        }
        merchantDetailActivity.setMin();
    }

    public static final /* synthetic */ Location access$getLocation(MerchantDetailActivity merchantDetailActivity, double d, double d2) {
        Location location = new Location("");
        location.setLatitude(d);
        location.setLongitude(d2);
        return location;
    }
}
