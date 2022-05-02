package id.dana.nearbyme;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Slide;
import androidx.transition.Transition;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.nearbyme.di.module.OtherStoreListModule;
import id.dana.nearbyme.enums.SearchType;
import id.dana.nearbyme.merchantdetail.MerchantDetailActivity;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.ShopModel;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.ActionBar$LayoutParams;
import o.BlurProcess;
import o.CornerMarkingDataProvider;
import o.GriverMenuExtensionImpl;
import o.GriverProgressBar;
import o.GriverStartPageFailedExtensionImpl;
import o.H5Worker;
import o.InternalApiBridgeExtension;
import o.PrepareException;
import o.RedDotDrawable;
import o.TitleBarRightButtonView;
import o.WheelView;
import o.appendAppLog;
import o.dispatchOnCancelled;
import o.distanceInfluenceForSnapDuration;
import o.isHideOnContentScrollEnabled;
import o.k;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.setEventClassNames;
import o.setHandlerClassName;
import o.setScope;
import o.setStateOn;
import o.stopIgnoring;
import o.t;
import o.uploadCoreByStartService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ^2\u00020\u0001:\u0001^B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0002J\u0016\u0010&\u001a\u00020%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\b\u0010*\u001a\u00020%H\u0002J\b\u0010+\u001a\u00020%H\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020%H\u0002J\b\u0010/\u001a\u00020%H\u0002J\u0010\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020)H\u0002J\b\u00102\u001a\u00020%H\u0002J\b\u00103\u001a\u00020%H\u0016J\b\u00104\u001a\u00020%H\u0002J\b\u00105\u001a\u00020%H\u0002J\b\u00106\u001a\u00020%H\u0002J\b\u00107\u001a\u00020%H\u0002J\b\u00108\u001a\u00020%H\u0002J\u000f\u00109\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0002\u0010:J\b\u0010;\u001a\u00020%H\u0002J\u0012\u0010<\u001a\u00020%2\b\b\u0002\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020>H\u0002J\"\u0010@\u001a\u00020%2\u0006\u0010A\u001a\u00020-2\u0006\u0010B\u001a\u00020-2\b\u0010C\u001a\u0004\u0018\u00010DH\u0014J\u0012\u0010E\u001a\u00020%2\b\u0010F\u001a\u0004\u0018\u00010GH\u0002J\u0012\u0010H\u001a\u00020%2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J-\u0010K\u001a\u00020%2\u0006\u0010A\u001a\u00020-2\u000e\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040M2\u0006\u0010N\u001a\u00020OH\u0016¢\u0006\u0002\u0010PJ\u0016\u0010Q\u001a\u00020%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\b\u0010R\u001a\u00020%H\u0002J\b\u0010S\u001a\u00020%H\u0002J\u0016\u0010T\u001a\u00020%2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020V0(H\u0002J\u0010\u0010W\u001a\u00020%2\u0006\u0010X\u001a\u00020>H\u0002J\b\u0010Y\u001a\u00020%H\u0002J\u0010\u0010Z\u001a\u00020%2\u0006\u0010[\u001a\u00020>H\u0002J\b\u0010\\\u001a\u00020%H\u0002J\b\u0010]\u001a\u00020%H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lid/dana/nearbyme/OtherStoreListActivity;", "Lid/dana/base/BaseActivity;", "()V", "activitySource", "", "animateSwipeDown", "Landroid/view/animation/LayoutAnimationController;", "animateSwipeUp", "lat", "", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "locationSettingsObserver", "Lio/reactivex/disposables/Disposable;", "locationUpdateObserver", "long", "merchantId", "merchantName", "nearbyAnalyticTracker", "Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "getNearbyAnalyticTracker", "()Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "setNearbyAnalyticTracker", "(Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;)V", "permission", "Lid/dana/utils/permission/Permission;", "presenter", "Lid/dana/contract/nearbyme/OtherStoreListContract$Presenter;", "getPresenter", "()Lid/dana/contract/nearbyme/OtherStoreListContract$Presenter;", "setPresenter", "(Lid/dana/contract/nearbyme/OtherStoreListContract$Presenter;)V", "recyclerViewAdapter", "Lid/dana/nearbyme/adapter/OtherStoreListAdapter;", "searchKeyword", "searchType", "buildPermission", "", "checkToolbarTitle", "shops", "", "Lid/dana/nearbyme/model/ShopModel;", "disposeLocationSettingsObserver", "disposeLocationUpdateObserver", "getLayout", "", "getLocationPermission", "getStoreList", "goToMerchantDetailActivity", "model", "hideError", "init", "initAdapter", "initErrorView", "initGetBundleData", "initInjection", "initLocationUpdateRequest", "initOnScrollShowBackToTop", "()Lkotlin/Unit;", "initRecyclerView", "initToolbar", "errorIcon", "", "isNotHavePermissionLocation", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onLocationSettingUpdated", "locationSettingsResult", "Lcom/google/android/gms/location/LocationSettingsResult;", "onLocationUpdate", "location", "Landroid/location/Location;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "populateShopItem", "showError", "showLocationServiceRequest", "showPromoBottomSheet", "promoInfoModels", "Lid/dana/nearbyme/model/PromoInfoModel;", "showSeeMoreButtonIfHasMore", "hasMore", "showSettingLocationPermission", "toggleShowSeeMoreButton", "show", "trackOpenSource", "updateLocation", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OtherStoreListActivity extends BaseActivity {
    @NotNull
    public static final length Companion = new length((byte) 0);
    private GriverProgressBar.UpdateRunnable FastBitmap$CoordinateSystem;
    private double IsOverlapping;
    private String equals = "";
    private String getMax = "";
    private String getMin = "";
    private LinearLayoutManager hashCode = new LinearLayoutManager(this, 1, false);
    private GriverProgressBar.UpdateRunnable invoke;
    private HashMap invokeSuspend;
    private String isInside = "";
    @Inject
    public t nearbyAnalyticTracker;
    @Inject
    public distanceInfluenceForSnapDuration.getMax presenter;
    private String setMax = "";
    private LayoutAnimationController toDoubleRange;
    private double toFloatRange;
    /* access modifiers changed from: private */
    public setHandlerClassName toIntRange;
    private setStateOn toString;
    private LayoutAnimationController values;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.invokeSuspend;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.invokeSuspend == null) {
            this.invokeSuspend = new HashMap();
        }
        View view = (View) this.invokeSuspend.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.invokeSuspend.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_other_store_list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lcom/google/android/gms/location/LocationSettingsResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class equals extends FunctionReferenceImpl implements Function1<LocationSettingsResult, Unit> {
        equals(OtherStoreListActivity otherStoreListActivity) {
            super(1, otherStoreListActivity, OtherStoreListActivity.class, "onLocationSettingUpdated", "onLocationSettingUpdated(Lcom/google/android/gms/location/LocationSettingsResult;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LocationSettingsResult) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable LocationSettingsResult locationSettingsResult) {
            OtherStoreListActivity.access$onLocationSettingUpdated((OtherStoreListActivity) this.receiver, locationSettingsResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Landroid/location/Location;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class isInside extends FunctionReferenceImpl implements Function1<Location, Unit> {
        isInside(OtherStoreListActivity otherStoreListActivity) {
            super(1, otherStoreListActivity, OtherStoreListActivity.class, "onLocationUpdate", "onLocationUpdate(Landroid/location/Location;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Location) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Location location) {
            OtherStoreListActivity.access$onLocationUpdate((OtherStoreListActivity) this.receiver, location);
        }
    }

    public static final /* synthetic */ setHandlerClassName access$getRecyclerViewAdapter$p(OtherStoreListActivity otherStoreListActivity) {
        setHandlerClassName sethandlerclassname = otherStoreListActivity.toIntRange;
        if (sethandlerclassname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerViewAdapter");
        }
        return sethandlerclassname;
    }

    public static final /* synthetic */ void access$goToMerchantDetailActivity(OtherStoreListActivity otherStoreListActivity, ShopModel shopModel) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-117804975, oncanceled);
            onCancelLoad.getMin(-117804975, oncanceled);
        }
        shopModel.length(otherStoreListActivity.getMax);
        MerchantDetailActivity.setMin setmin = MerchantDetailActivity.Companion;
        MerchantDetailActivity.setMin.setMax(otherStoreListActivity, shopModel, TrackerKey.SourceType.NEARBY_SHOP_LIST);
    }

    public static final /* synthetic */ void access$showPromoBottomSheet(OtherStoreListActivity otherStoreListActivity, List list) {
        int length2;
        int min;
        Context baseContext = otherStoreListActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1840739868, oncanceled);
            onCancelLoad.getMin(-1840739868, oncanceled);
        }
        PromoListDialogFragment promoListDialogFragment = new PromoListDialogFragment(otherStoreListActivity);
        promoListDialogFragment.getMax = list;
        promoListDialogFragment.show(otherStoreListActivity.getSupportFragmentManager(), "Show Nearby Promo List Dialog");
    }

    @NotNull
    public final distanceInfluenceForSnapDuration.getMax getPresenter() {
        distanceInfluenceForSnapDuration.getMax getmax = this.presenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return getmax;
    }

    public final void setPresenter(@NotNull distanceInfluenceForSnapDuration.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.presenter = getmax;
    }

    @NotNull
    public final t getNearbyAnalyticTracker() {
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

    public final void init() {
        int length2;
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -860298001 == (max = dispatchOnCancelled.getMax(applicationContext, -860298001)))) {
            onCanceled oncanceled = new onCanceled(-860298001, max, 512);
            onCancelLoad.setMax(-860298001, oncanceled);
            onCancelLoad.getMin(-860298001, oncanceled);
        }
        LayoutAnimationController loadLayoutAnimation = AnimationUtils.loadLayoutAnimation(this, R.anim.f292130771996);
        Intrinsics.checkNotNullExpressionValue(loadLayoutAnimation, "AnimationUtils.loadLayou…m.card_climb_up\n        )");
        this.values = loadLayoutAnimation;
        LayoutAnimationController loadLayoutAnimation2 = AnimationUtils.loadLayoutAnimation(getApplicationContext(), R.anim.f302130771997);
        Intrinsics.checkNotNullExpressionValue(loadLayoutAnimation2, "AnimationUtils.loadLayou….card_fall_down\n        )");
        this.toDoubleRange = loadLayoutAnimation2;
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = applicationContext2.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext2, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1026885068, oncanceled2);
            onCancelLoad.getMin(-1026885068, oncanceled2);
        }
        GriverStartPageFailedExtensionImpl.setMin setmin = new GriverStartPageFailedExtensionImpl.setMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            setmin.setMin = applicationComponent;
            setmin.getMax = new OtherStoreListModule(new setMax(this));
            stopIgnoring.setMin(setmin.getMax, OtherStoreListModule.class);
            stopIgnoring.setMin(setmin.setMin, PrepareException.AnonymousClass1.class);
            new GriverStartPageFailedExtensionImpl(setmin.getMax, setmin.setMin, (byte) 0).length(this);
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras = intent.getExtras();
            String string = extras != null ? extras.getString("bundle_merchant_id") : null;
            String str = "";
            if (string == null) {
                string = str;
            }
            this.setMax = string;
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras2 = intent2.getExtras();
            String string2 = extras2 != null ? extras2.getString("bundle_merchant_name") : null;
            if (string2 == null) {
                string2 = str;
            }
            this.getMax = string2;
            Intent intent3 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent3, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras3 = intent3.getExtras();
            double d = 0.0d;
            this.toFloatRange = extras3 != null ? extras3.getDouble("bundle_lat") : 0.0d;
            Intent intent4 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent4, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras4 = intent4.getExtras();
            if (extras4 != null) {
                d = extras4.getDouble("bundle_long");
            }
            this.IsOverlapping = d;
            Intent intent5 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent5, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras5 = intent5.getExtras();
            String string3 = extras5 != null ? extras5.getString("bundle_search_type") : null;
            if (string3 == null) {
                string3 = str;
            }
            this.isInside = string3;
            Intent intent6 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent6, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras6 = intent6.getExtras();
            String string4 = extras6 != null ? extras6.getString("bundle_search_keyword") : null;
            if (string4 == null) {
                string4 = str;
            }
            this.equals = string4;
            Intent intent7 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent7, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras7 = intent7.getExtras();
            String string5 = extras7 != null ? extras7.getString("bundle_source") : null;
            if (string5 != null) {
                str = string5;
            }
            this.getMin = str;
            initToolbar$default(this, false, 1, (Object) null);
            setHandlerClassName sethandlerclassname = new setHandlerClassName(new getMin(this));
            this.toIntRange = sethandlerclassname;
            if (sethandlerclassname == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerViewAdapter");
            }
            sethandlerclassname.getMin(CollectionsKt.arrayListOf(new H5Worker(2, new ShopModel())));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getSupportButtonTintMode);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "this");
            setHandlerClassName sethandlerclassname2 = this.toIntRange;
            if (sethandlerclassname2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerViewAdapter");
            }
            recyclerView.setAdapter(sethandlerclassname2);
            recyclerView.setLayoutManager(this.hashCode);
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getSupportButtonTintMode);
            if (recyclerView2 != null) {
                recyclerView2.setNestedScrollingEnabled(true);
                recyclerView2.addOnScrollListener(new toIntRange(this));
                CardView cardView = (CardView) _$_findCachedViewById(resetInternal.setMax.CallSuper);
                if (cardView != null) {
                    cardView.setOnClickListener(new toFloatRange(recyclerView2));
                    Unit unit = Unit.INSTANCE;
                }
            }
            ((DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.MediaBrowserCompat$MediaItem$Flags)).setOnClickListener(new setMin(this));
            setHandlerClassName sethandlerclassname3 = this.toIntRange;
            if (sethandlerclassname3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerViewAdapter");
            }
            sethandlerclassname3.getMax().add(new H5Worker(3, new ShopModel()));
            sethandlerclassname3.notifyDataSetChanged();
            length();
            t tVar = this.nearbyAnalyticTracker;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
            }
            tVar.setMin(this.getMin, this.getMax);
            return;
        }
        throw null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ OtherStoreListActivity setMax;

        setMin(OtherStoreListActivity otherStoreListActivity) {
            this.setMax = otherStoreListActivity;
        }

        public final void onClick(View view) {
            OtherStoreListActivity.access$hideError(this.setMax);
        }
    }

    /* access modifiers changed from: private */
    public final void setMin() {
        int length2;
        int min;
        if (setMax()) {
            length();
            return;
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1046858351, oncanceled);
            onCancelLoad.getMin(1046858351, oncanceled);
        }
        GriverProgressBar.UpdateRunnable updateRunnable = this.FastBitmap$CoordinateSystem;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        this.FastBitmap$CoordinateSystem = null;
        GriverProgressBar.UpdateRunnable subscribe = new WheelView.ScrollerTask.getMax(this).getMin().subscribe(new setScope(new isInside(this)));
        this.FastBitmap$CoordinateSystem = subscribe;
        addDisposable(subscribe);
    }

    private final boolean setMax() {
        return CornerMarkingDataProvider.IsOverlapping() && !setStateOn.getMin(this, "android.permission.ACCESS_FINE_LOCATION");
    }

    /* access modifiers changed from: private */
    public final void length() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1964328357 == (max = dispatchOnCancelled.getMax(applicationContext, 1964328357)))) {
            onCanceled oncanceled = new onCanceled(1964328357, max, 512);
            onCancelLoad.setMax(1964328357, oncanceled);
            onCancelLoad.getMin(1964328357, oncanceled);
        }
        if (WheelView.ScrollerTask.length(this)) {
            if (this.toString == null) {
                getMax();
            }
            setStateOn setstateon = this.toString;
            if (setstateon != null) {
                setstateon.setMin();
                return;
            }
            return;
        }
        getMin();
    }

    private final void getMax() {
        setStateOn.getMin getmin = new setStateOn.getMin((Activity) this);
        getmin.length.add("android.permission.ACCESS_FINE_LOCATION");
        getmin.getMax = new getMax(this);
        this.toString = new setStateOn(getmin, (byte) 0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/nearbyme/OtherStoreListActivity$buildPermission$1", "Lid/dana/utils/permission/Permission$PermissionListener;", "onPermissionDenied", "", "report", "Lid/dana/utils/permission/Permission$PermissionReport;", "onPermissionGranted", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements setStateOn.length {
        final /* synthetic */ OtherStoreListActivity getMin;

        getMax(OtherStoreListActivity otherStoreListActivity) {
            this.getMin = otherStoreListActivity;
        }

        public final void getMin(@NotNull setStateOn.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "report");
            BlurProcess.getMin(this.getMin.getApplicationContext(), true);
            this.getMin.setMin();
            OtherStoreListActivity.initToolbar$default(this.getMin, false, 1, (Object) null);
        }

        public final void setMin(@NotNull setStateOn.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "report");
            BlurProcess.getMin(this.getMin.getApplicationContext(), false);
            OtherStoreListActivity.access$showError(this.getMin);
            this.getMin.getMin(true);
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.getMax(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, max, 512);
            onCancelLoad.setMax(778993089, oncanceled);
            onCancelLoad.getMin(778993089, oncanceled);
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            finish();
        } else {
            setMin();
        }
    }

    public final void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        setStateOn setstateon = this.toString;
        if (setstateon != null && setstateon.getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"id/dana/nearbyme/OtherStoreListActivity$initOnScrollShowBackToTop$1$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange extends RecyclerView.toIntRange {
        final /* synthetic */ OtherStoreListActivity setMax;

        toIntRange(OtherStoreListActivity otherStoreListActivity) {
            this.setMax = otherStoreListActivity;
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            RecyclerView recyclerView2 = (RecyclerView) this.setMax._$_findCachedViewById(resetInternal.setMax.getSupportButtonTintMode);
            RecyclerView.IsOverlapping layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
            if (layoutManager != null) {
                if (((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() == 0) {
                    OtherStoreListActivity.access$toggleShowSeeMoreButton(this.setMax, false);
                } else {
                    OtherStoreListActivity.access$toggleShowSeeMoreButton(this.setMax, true);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnClickListener {
        final /* synthetic */ RecyclerView setMin;

        toFloatRange(RecyclerView recyclerView) {
            this.setMin = recyclerView;
        }

        public final void onClick(View view) {
            this.setMin.scrollToPosition(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"id/dana/nearbyme/OtherStoreListActivity$initInjection$1", "Lid/dana/contract/nearbyme/OtherStoreListContract$View;", "dismissProgress", "", "onGetShopListFail", "onGetShopListSuccess", "result", "Lid/dana/model/OtherStoreListResultModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements distanceInfluenceForSnapDuration.setMin {
        final /* synthetic */ OtherStoreListActivity setMin;

        @JvmDefault
        public final void getMin(@NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shopModels");
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void setMin(@NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shopModelsWithPromo");
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMax(OtherStoreListActivity otherStoreListActivity) {
            this.setMin = otherStoreListActivity;
        }

        public final void dismissProgress() {
            setHandlerClassName access$getRecyclerViewAdapter$p = OtherStoreListActivity.access$getRecyclerViewAdapter$p(this.setMin);
            List max = access$getRecyclerViewAdapter$p.getMax();
            Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
            CollectionsKt.removeAll(max, setHandlerClassName.length.INSTANCE);
            access$getRecyclerViewAdapter$p.notifyDataSetChanged();
        }

        public final void setMax(@NotNull InternalApiBridgeExtension internalApiBridgeExtension) {
            Intrinsics.checkNotNullParameter(internalApiBridgeExtension, "result");
            OtherStoreListActivity.access$checkToolbarTitle(this.setMin, internalApiBridgeExtension.getMin);
            OtherStoreListActivity.access$populateShopItem(this.setMin, internalApiBridgeExtension.getMin);
            OtherStoreListActivity.access$showSeeMoreButtonIfHasMore(this.setMin, internalApiBridgeExtension.setMax());
        }

        public final void length() {
            setHandlerClassName access$getRecyclerViewAdapter$p = OtherStoreListActivity.access$getRecyclerViewAdapter$p(this.setMin);
            List max = access$getRecyclerViewAdapter$p.getMax();
            Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
            CollectionsKt.removeAll(max, setHandlerClassName.length.INSTANCE);
            access$getRecyclerViewAdapter$p.notifyDataSetChanged();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, d2 = {"id/dana/nearbyme/OtherStoreListActivity$initAdapter$1", "Lid/dana/nearbyme/adapter/OtherStoreListListener;", "onHomeShoppingClick", "", "viewState", "Lid/dana/nearbyme/merchantdetail/model/MerchantDetailViewState;", "onMerchantListClick", "shop", "Lid/dana/nearbyme/model/ShopModel;", "onPromoRibbonClick", "promoInfos", "", "Lid/dana/nearbyme/model/PromoInfoModel;", "onSeeMoreClick", "onTryAgainClick", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements setEventClassNames {
        final /* synthetic */ OtherStoreListActivity setMin;

        getMin(OtherStoreListActivity otherStoreListActivity) {
            this.setMin = otherStoreListActivity;
        }

        public final void length() {
            setHandlerClassName access$getRecyclerViewAdapter$p = OtherStoreListActivity.access$getRecyclerViewAdapter$p(this.setMin);
            List max = access$getRecyclerViewAdapter$p.getMax();
            Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
            CollectionsKt.removeAll(max, setHandlerClassName.setMax.INSTANCE);
            access$getRecyclerViewAdapter$p.notifyDataSetChanged();
            setHandlerClassName access$getRecyclerViewAdapter$p2 = OtherStoreListActivity.access$getRecyclerViewAdapter$p(this.setMin);
            access$getRecyclerViewAdapter$p2.getMax().add(new H5Worker(3, new ShopModel()));
            access$getRecyclerViewAdapter$p2.notifyDataSetChanged();
            this.setMin.toFloatRange();
        }

        public final void length(@NotNull ShopModel shopModel) {
            Intrinsics.checkNotNullParameter(shopModel, "shop");
            OtherStoreListActivity.access$goToMerchantDetailActivity(this.setMin, shopModel);
        }

        public final void setMax(@NotNull List<? extends PromoInfoModel> list) {
            Intrinsics.checkNotNullParameter(list, "promoInfos");
            OtherStoreListActivity.access$showPromoBottomSheet(this.setMin, list);
        }

        public final void length(@NotNull GriverMenuExtensionImpl griverMenuExtensionImpl) {
            Intrinsics.checkNotNullParameter(griverMenuExtensionImpl, "viewState");
            this.setMin.getNearbyAnalyticTracker().setMin(griverMenuExtensionImpl.setMax, TrackerKey.SourceType.SHOP_LIST);
            Intrinsics.checkNotNullParameter(TrackerKey.SourceType.SHOP_LIST, "<set-?>");
            griverMenuExtensionImpl.getMax = TrackerKey.SourceType.SHOP_LIST;
            k.AnonymousClass10.getMin getmin = k.AnonymousClass10.length;
            FragmentManager supportFragmentManager = this.setMin.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            k.AnonymousClass10.getMin.length(supportFragmentManager, griverMenuExtensionImpl);
        }
    }

    /* access modifiers changed from: private */
    public final void toFloatRange() {
        distanceInfluenceForSnapDuration.getMax getmax = this.presenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmax.setMin(this.setMax, this.toFloatRange, this.IsOverlapping, this.equals, this.isInside);
    }

    static /* synthetic */ void initToolbar$default(OtherStoreListActivity otherStoreListActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        otherStoreListActivity.getMin(z);
    }

    /* access modifiers changed from: private */
    public final void getMin(boolean z) {
        setMenuLeftButton(z ? R.drawable.ic_close : R.drawable.btn_arrow_left);
        setCenterTitle(ActionBar$LayoutParams.length(this.getMax, 0).toString());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J6\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lid/dana/nearbyme/OtherStoreListActivity$Companion;", "", "()V", "BUNDLE_LAT", "", "BUNDLE_LONG", "BUNDLE_MERCHANT_ID", "BUNDLE_MERCHANT_NAME", "BUNDLE_SEARCH_KEYWORD", "BUNDLE_SEARCH_TYPE", "BUNDLE_SOURCE", "DEFAULT_NUMBER_OF_ITEM", "", "open", "", "context", "Landroid/content/Context;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "lat", "", "long", "searchType", "Lid/dana/nearbyme/enums/SearchType;", "searchKeyword", "source", "merchantId", "merchantName", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        public static void getMax(@NotNull Context context, @NotNull ShopModel shopModel, double d, double d2, @NotNull SearchType searchType, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(shopModel, "shopModel");
            Intrinsics.checkNotNullParameter(searchType, "searchType");
            Intrinsics.checkNotNullParameter(str, "searchKeyword");
            Intrinsics.checkNotNullParameter(str2, "source");
            Intent intent = new Intent(context, OtherStoreListActivity.class);
            intent.putExtra("bundle_lat", d);
            intent.putExtra("bundle_long", d2);
            intent.putExtra("bundle_merchant_id", shopModel.Grayscale$Algorithm);
            intent.putExtra("bundle_merchant_name", shopModel.asInterface);
            intent.putExtra("bundle_search_type", searchType.getValue());
            intent.putExtra("bundle_search_keyword", str);
            intent.putExtra("bundle_source", str2);
            context.startActivity(intent);
        }

        public static void getMin(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull SearchType searchType, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
            Intrinsics.checkNotNullParameter(searchType, "searchType");
            Intrinsics.checkNotNullParameter(str3, "searchKeyword");
            Intrinsics.checkNotNullParameter(str4, "source");
            Intent intent = new Intent(context, OtherStoreListActivity.class);
            intent.putExtra("bundle_merchant_id", str);
            intent.putExtra("bundle_merchant_name", str2);
            intent.putExtra("bundle_search_type", searchType.getValue());
            intent.putExtra("bundle_search_keyword", str3);
            intent.putExtra("bundle_source", str4);
            context.startActivity(intent);
        }
    }

    private final void getMin() {
        GriverProgressBar.UpdateRunnable updateRunnable = this.invoke;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        this.invoke = null;
        WheelView.ScrollerTask.getMax getmax = new WheelView.ScrollerTask.getMax(this);
        getmax.setMin.setAlwaysShow(true);
        LocationSettingsRequest.Builder builder = getmax.setMin;
        LocationRequest create = LocationRequest.create();
        create.setPriority(100);
        create.setInterval(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        create.setFastestInterval(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        builder.addLocationRequest(create);
        uploadCoreByStartService uploadcorebystartservice = getmax.getMax;
        LocationSettingsRequest build = getmax.setMin.build();
        GriverProgressBar.UpdateRunnable subscribe = appendAppLog.setMax(uploadcorebystartservice.setMin, uploadcorebystartservice.setMax, LocationServices.API).flatMap(new RedDotDrawable<GoogleApiClient, TitleBarRightButtonView.AnonymousClass1<LocationSettingsResult>>(build) {
            final /* synthetic */ LocationSettingsRequest getMin;

            {
                this.getMin = r2;
            }

            public final /* synthetic */ Object apply(Object obj) throws Exception {
                return TitleBarRightButtonView.AnonymousClass1.create(new appendMonitorLog(LocationServices.SettingsApi.checkLocationSettings((GoogleApiClient) obj, this.getMin)));
            }
        }).subscribe(new setScope(new equals(this)));
        this.invoke = subscribe;
        addDisposable(subscribe);
    }

    public static final /* synthetic */ void access$hideError(OtherStoreListActivity otherStoreListActivity) {
        RecyclerView recyclerView = (RecyclerView) otherStoreListActivity._$_findCachedViewById(resetInternal.setMax.getSupportButtonTintMode);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_other_store_list");
        recyclerView.setVisibility(0);
        View _$_findCachedViewById = otherStoreListActivity._$_findCachedViewById(resetInternal.setMax.setHorizontalGap);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view_error");
        _$_findCachedViewById.setVisibility(8);
        otherStoreListActivity.length();
        setHandlerClassName sethandlerclassname = otherStoreListActivity.toIntRange;
        if (sethandlerclassname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerViewAdapter");
        }
        List max = sethandlerclassname.getMax();
        Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
        CollectionsKt.removeAll(max, setHandlerClassName.getMin.INSTANCE);
        sethandlerclassname.getMax().add(new H5Worker(2, new ShopModel()));
        sethandlerclassname.notifyDataSetChanged();
        setHandlerClassName sethandlerclassname2 = otherStoreListActivity.toIntRange;
        if (sethandlerclassname2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerViewAdapter");
        }
        sethandlerclassname2.getMax().add(new H5Worker(3, new ShopModel()));
        sethandlerclassname2.notifyDataSetChanged();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        if (r4 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void access$onLocationUpdate(id.dana.nearbyme.OtherStoreListActivity r3, android.location.Location r4) {
        /*
            if (r4 == 0) goto L_0x0010
            double r0 = r4.getLatitude()
            r3.toFloatRange = r0
            double r0 = r4.getLongitude()
            r3.IsOverlapping = r0
            if (r4 != 0) goto L_0x0036
        L_0x0010:
            r4 = r3
            id.dana.nearbyme.OtherStoreListActivity r4 = (id.dana.nearbyme.OtherStoreListActivity) r4
            android.location.Location r0 = new android.location.Location
            java.lang.String r1 = ""
            r0.<init>(r1)
            r1 = -4604733856718612343(0xc018b2f449129889, double:-6.17476)
            r0.setLatitude(r1)
            r1 = 4637217703837686781(0x405ab4eebf65dbfd, double:106.827072)
            r0.setLongitude(r1)
            double r1 = r0.getLatitude()
            r4.toFloatRange = r1
            double r0 = r0.getLongitude()
            r4.IsOverlapping = r0
        L_0x0036:
            r3.toFloatRange()
            o.GriverProgressBar$UpdateRunnable r4 = r3.FastBitmap$CoordinateSystem
            if (r4 == 0) goto L_0x0040
            r4.dispose()
        L_0x0040:
            r4 = 0
            r3.FastBitmap$CoordinateSystem = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyme.OtherStoreListActivity.access$onLocationUpdate(id.dana.nearbyme.OtherStoreListActivity, android.location.Location):void");
    }

    public static final /* synthetic */ void access$onLocationSettingUpdated(OtherStoreListActivity otherStoreListActivity, LocationSettingsResult locationSettingsResult) {
        Status status;
        IntentSender intentSender;
        if (locationSettingsResult == null || (status = locationSettingsResult.getStatus()) == null) {
            otherStoreListActivity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            return;
        }
        int statusCode = status.getStatusCode();
        if (statusCode == 6) {
            PendingIntent resolution = status.getResolution();
            if (resolution == null || (intentSender = resolution.getIntentSender()) == null) {
                otherStoreListActivity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                return;
            }
            try {
                otherStoreListActivity.startIntentSenderForResult(intentSender, 100, (Intent) null, 0, 0, 0, (Bundle) null);
            } catch (IntentSender.SendIntentException unused) {
            }
        } else if (statusCode != 8502) {
            otherStoreListActivity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
    }

    public static final /* synthetic */ void access$showError(OtherStoreListActivity otherStoreListActivity) {
        setHandlerClassName sethandlerclassname = otherStoreListActivity.toIntRange;
        if (sethandlerclassname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerViewAdapter");
        }
        List max = sethandlerclassname.getMax();
        Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
        CollectionsKt.removeAll(max, setHandlerClassName.length.INSTANCE);
        sethandlerclassname.notifyDataSetChanged();
        setHandlerClassName sethandlerclassname2 = otherStoreListActivity.toIntRange;
        if (sethandlerclassname2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerViewAdapter");
        }
        List max2 = sethandlerclassname2.getMax();
        Intrinsics.checkNotNullExpressionValue(max2, FirebaseAnalytics.Param.ITEMS);
        CollectionsKt.removeAll(max2, setHandlerClassName.getMax.INSTANCE);
        sethandlerclassname2.notifyDataSetChanged();
        View _$_findCachedViewById = otherStoreListActivity._$_findCachedViewById(resetInternal.setMax.setHorizontalGap);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view_error");
        _$_findCachedViewById.setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) otherStoreListActivity._$_findCachedViewById(resetInternal.setMax.getSupportButtonTintMode);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_other_store_list");
        recyclerView.setVisibility(8);
    }

    public static final /* synthetic */ void access$toggleShowSeeMoreButton(OtherStoreListActivity otherStoreListActivity, boolean z) {
        Transition slide = new Slide(80);
        slide.setDuration(600);
        slide.addTarget((View) (CardView) otherStoreListActivity._$_findCachedViewById(resetInternal.setMax.CallSuper));
        isHideOnContentScrollEnabled.getMin((ConstraintLayout) otherStoreListActivity._$_findCachedViewById(resetInternal.setMax.setContentView), slide);
        CardView cardView = (CardView) otherStoreListActivity._$_findCachedViewById(resetInternal.setMax.CallSuper);
        Intrinsics.checkNotNullExpressionValue(cardView, "cv_back_to_top");
        cardView.setVisibility(z ? 0 : 8);
    }

    public static final /* synthetic */ void access$checkToolbarTitle(OtherStoreListActivity otherStoreListActivity, List list) {
        Object obj;
        String str;
        boolean z;
        if (otherStoreListActivity.getMax.length() == 0) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ShopModel) obj).asInterface != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            ShopModel shopModel = (ShopModel) obj;
            if (shopModel != null) {
                str = shopModel.asInterface;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            otherStoreListActivity.getMax = str;
            initToolbar$default(otherStoreListActivity, false, 1, (Object) null);
        }
    }

    public static final /* synthetic */ void access$populateShopItem(OtherStoreListActivity otherStoreListActivity, List list) {
        setHandlerClassName sethandlerclassname = otherStoreListActivity.toIntRange;
        if (sethandlerclassname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerViewAdapter");
        }
        Iterable<ShopModel> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ShopModel h5Worker : iterable) {
            arrayList.add(new H5Worker(0, h5Worker));
        }
        sethandlerclassname.length((List) arrayList);
    }

    public static final /* synthetic */ void access$showSeeMoreButtonIfHasMore(OtherStoreListActivity otherStoreListActivity, boolean z) {
        if (z) {
            setHandlerClassName sethandlerclassname = otherStoreListActivity.toIntRange;
            if (sethandlerclassname == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerViewAdapter");
            }
            sethandlerclassname.getMax().add(new H5Worker(1, new ShopModel()));
            sethandlerclassname.notifyDataSetChanged();
            return;
        }
        setHandlerClassName sethandlerclassname2 = otherStoreListActivity.toIntRange;
        if (sethandlerclassname2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerViewAdapter");
        }
        List max = sethandlerclassname2.getMax();
        Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
        CollectionsKt.removeAll(max, setHandlerClassName.setMax.INSTANCE);
        sethandlerclassname2.notifyDataSetChanged();
    }
}
