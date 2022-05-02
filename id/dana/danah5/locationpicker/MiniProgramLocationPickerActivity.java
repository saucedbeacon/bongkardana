package id.dana.danah5.locationpicker;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Marker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.di.modules.NearbyMerchantLocationSearchModule;
import id.dana.domain.globalsearch.model.LatLng;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import id.dana.nearbyme.model.ShopModel;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.PinMapLottieAnimationView;
import id.dana.richview.SearchView;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.android.parcel.Parcelize;
import o.BaseResourcePackage;
import o.BlurProcess;
import o.GriverAppLanguageExtension;
import o.GriverDefaultLoadingView;
import o.GriverProgressBar;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.IntRange;
import o.PrepareException;
import o.RedDotDrawable;
import o.RedDotManager;
import o.TinyAppActionStateManager;
import o.TitleBarRightButtonView;
import o.WheelView;
import o.appendAppLog;
import o.dispatchOnCancelled;
import o.ensureNavButtonView;
import o.getCreateDate;
import o.getCreateTime;
import o.getCurrentContentInsetEnd;
import o.getHandlerClassName;
import o.getInsetDodgeRect;
import o.getProgressViewStartOffset;
import o.getScrimColor;
import o.getSecureSignatureComp;
import o.hideProgress;
import o.layoutChildLeft;
import o.layoutChildRight;
import o.measureChildCollapseMargins;
import o.onActionButtonClicked$core;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.processFacade;
import o.resetInternal;
import o.setColorFilter;
import o.setMyBeaconListener;
import o.setSlingshotDistance;
import o.setTextColor;
import o.startBeaconDiscovery;
import o.updateText;
import o.uploadCoreByStartService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Z2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004YZ[\\B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0002J\b\u00103\u001a\u000200H\u0014J\b\u00104\u001a\u000200H\u0002J\b\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000200H\u0016J\b\u00108\u001a\u000200H\u0002J\b\u00109\u001a\u000200H\u0014J\u0010\u0010:\u001a\u0002002\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020!H\u0016J\b\u0010?\u001a\u000200H\u0002J\b\u0010@\u001a\u000200H\u0002J\b\u0010A\u001a\u000200H\u0002J\u0010\u0010B\u001a\u0002002\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u0002002\u0006\u0010C\u001a\u00020FH\u0002J\b\u0010G\u001a\u000200H\u0002J\u0010\u0010H\u001a\u0002002\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010I\u001a\u000200H\u0002J\b\u0010J\u001a\u000200H\u0002J\b\u0010K\u001a\u000200H\u0002J\b\u0010L\u001a\u000200H\u0002J\u0010\u0010M\u001a\u0002002\u0006\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u000200H\u0002J\b\u0010Q\u001a\u000200H\u0002J\u0016\u0010R\u001a\u0002002\f\u0010S\u001a\b\u0012\u0004\u0012\u00020U0TH\u0002J\u0010\u0010V\u001a\u0002002\u0006\u0010W\u001a\u00020\rH\u0002J\b\u0010X\u001a\u000200H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000¨\u0006]"}, d2 = {"Lid/dana/danah5/locationpicker/MiniProgramLocationPickerActivity;", "Lid/dana/base/BaseActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "adapter", "Lid/dana/nearbyme/adapter/NearbyLocationResultAdapter;", "bottomSheetSelectedLocation", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "currentLocation", "Lid/dana/domain/globalsearch/model/LatLng;", "flagFromPullOutPinMap", "", "Ljava/lang/Boolean;", "isPutDownPinMap", "()Z", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "kotlin.jvm.PlatformType", "locationRequestDisposable", "Lio/reactivex/disposables/Disposable;", "locationWatcherDisposable", "mapFragment", "Lid/dana/nearbyme/DanaMapFragment;", "mapHelper", "Lid/dana/utils/MapHelper;", "getMapHelper", "()Lid/dana/utils/MapHelper;", "setMapHelper", "(Lid/dana/utils/MapHelper;)V", "myLocationMarker", "Lcom/google/android/gms/maps/model/Marker;", "permissionRequest", "Lcom/anggrayudi/storage/permission/ActivityPermissionRequest;", "presenter", "Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchPresenter;", "getPresenter", "()Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchPresenter;", "setPresenter", "(Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchPresenter;)V", "selectedPlace", "Lid/dana/danah5/locationpicker/MiniProgramLocationPickerActivity$Place;", "skeletonBottomSheet", "Lcom/ethanhua/skeleton/SkeletonScreen;", "skeletonLocationList", "assembleReverseGeocodeOnBottomSheet", "", "geocode", "Lid/dana/domain/miniprogram/model/Address;", "configToolbar", "dismissSkeletonBottomSheet", "getLayout", "", "init", "injectComponent", "onDestroy", "onMapReady", "maps", "Lcom/google/android/gms/maps/GoogleMap;", "onMarkerClick", "marker", "pullOutPinMap", "putDownPinMap", "requestLocationService", "setBottomSheetSelectedLocationState", "state", "Lid/dana/danah5/locationpicker/MiniProgramLocationPickerActivity$BottomSheetSelectedLocationState;", "setSearchLocationState", "Lid/dana/danah5/locationpicker/MiniProgramLocationPickerActivity$SearchLocationState;", "setupBottomSheet", "setupCameraListener", "setupMaps", "setupMotionLayout", "setupRecyclerView", "setupSearchView", "showDialogPermission", "request", "Lcom/anggrayudi/storage/permission/PermissionRequest;", "showSkeletonBottomSheet", "showSkeletonLocationList", "updateLocationData", "nearbyLocations", "", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "updateMyCurrentLocationMarker", "centerToMyLocation", "watchMyLocation", "BottomSheetSelectedLocationState", "Companion", "Place", "SearchLocationState", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MiniProgramLocationPickerActivity extends BaseActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    @NotNull
    public static final String EXTRA_APP_NAME = "appName";
    @NotNull
    public static final String EXTRA_INITIAL_LOCATION = "initialLocation";
    @NotNull
    public static final String EXTRA_LOCATION_RESULT = "result";
    private static final int REQUEST_CODE_PERMISSION_REQUEST = 1;
    private static final String TAG_MAP_FRAGMENT = "mapFragment";
    private HashMap _$_findViewCache;
    private getHandlerClassName adapter;
    private BottomSheetBehavior<FrameLayout> bottomSheetSelectedLocation;
    /* access modifiers changed from: private */
    public LatLng currentLocation = LatLng.Companion.monas();
    /* access modifiers changed from: private */
    public Boolean flagFromPullOutPinMap;
    /* access modifiers changed from: private */
    public final ITrustedWebActivityCallback<IntentSenderRequest> launcher;
    private GriverProgressBar.UpdateRunnable locationRequestDisposable;
    private GriverProgressBar.UpdateRunnable locationWatcherDisposable;
    private getCreateDate mapFragment;
    @Inject
    public GriverDefaultLoadingView mapHelper;
    private Marker myLocationMarker;
    /* access modifiers changed from: private */
    public final getCurrentContentInsetEnd permissionRequest;
    @Inject
    public updateText presenter;
    /* access modifiers changed from: private */
    public Place selectedPlace;
    private onDetachedFromLayoutParams skeletonBottomSheet;
    private onDetachedFromLayoutParams skeletonLocationList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/danah5/locationpicker/MiniProgramLocationPickerActivity$BottomSheetSelectedLocationState;", "", "(Ljava/lang/String;I)V", "LOADING", "ERROR", "SUCCESS", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum BottomSheetSelectedLocationState {
        LOADING,
        ERROR,
        SUCCESS
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lid/dana/danah5/locationpicker/MiniProgramLocationPickerActivity$SearchLocationState;", "", "(Ljava/lang/String;I)V", "EMPTY_KEYWORD", "SEARCHING", "SEARCH_ERROR", "SEARCH_EMPTY_RESULT", "SEARCH_RESULT_FOUND", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum SearchLocationState {
        EMPTY_KEYWORD,
        SEARCHING,
        SEARCH_ERROR,
        SEARCH_EMPTY_RESULT,
        SEARCH_RESULT_FOUND
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class isInside<T> implements RedDotManager<Throwable> {
        public static final isInside INSTANCE = new isInside();

        isInside() {
        }

        public final void accept(Throwable th) {
        }
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0) {
            return R.layout.activity_mini_program_location_picker;
        }
        onCanceled oncanceled = new onCanceled(0, length2, 4);
        onCancelLoad.setMax(-403495297, oncanceled);
        onCancelLoad.getMin(-403495297, oncanceled);
        return R.layout.activity_mini_program_location_picker;
    }

    public final boolean onMarkerClick(@NotNull Marker marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class valueOf extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ layoutChildLeft $request;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        valueOf(layoutChildLeft layoutchildleft) {
            super(1);
            this.$request = layoutchildleft;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            this.$request.length();
        }
    }

    public MiniProgramLocationPickerActivity() {
        getCurrentContentInsetEnd.setMax setmax = new getCurrentContentInsetEnd.setMax(this);
        String[] strArr = {"android.permission.ACCESS_FINE_LOCATION"};
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        getCurrentContentInsetEnd.setMax setmax2 = setmax;
        setmax2.getMin = ArraysKt.toSet((T[]) strArr);
        measureChildCollapseMargins getmin = new getMin(this);
        Intrinsics.checkNotNullParameter(getmin, "callback");
        getCurrentContentInsetEnd.setMax setmax3 = setmax2;
        setmax3.setMin = getmin;
        this.permissionRequest = setmax3.setMin();
        ITrustedWebActivityCallback<IntentSenderRequest> registerForActivityResult = registerForActivityResult(new ITrustedWebActivityCallback.Stub.Proxy.getMax(), new setMax(this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…tchMyLocation()\n        }");
        this.launcher = registerForActivityResult;
    }

    @NotNull
    public final updateText getPresenter() {
        updateText updatetext = this.presenter;
        if (updatetext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return updatetext;
    }

    public final void setPresenter(@NotNull updateText updatetext) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 938284083 == (max = dispatchOnCancelled.getMax(applicationContext, 938284083)))) {
            onCanceled oncanceled = new onCanceled(938284083, max, 512);
            onCancelLoad.setMax(938284083, oncanceled);
            onCancelLoad.getMin(938284083, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(938284083, oncanceled2);
            onCancelLoad.getMin(938284083, oncanceled2);
        }
        Intrinsics.checkNotNullParameter(updatetext, "<set-?>");
        this.presenter = updatetext;
    }

    @NotNull
    public final GriverDefaultLoadingView getMapHelper() {
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        if (griverDefaultLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        return griverDefaultLoadingView;
    }

    public final void setMapHelper(@NotNull GriverDefaultLoadingView griverDefaultLoadingView) {
        Intrinsics.checkNotNullParameter(griverDefaultLoadingView, "<set-?>");
        this.mapHelper = griverDefaultLoadingView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¨\u0006\u000f"}, d2 = {"id/dana/danah5/locationpicker/MiniProgramLocationPickerActivity$permissionRequest$1", "Lcom/anggrayudi/storage/permission/PermissionCallback;", "onDisplayConsentDialog", "", "request", "Lcom/anggrayudi/storage/permission/PermissionRequest;", "onPermissionsChecked", "result", "Lcom/anggrayudi/storage/permission/PermissionResult;", "fromSystemDialog", "", "onShouldRedirectToSystemSettings", "blockedPermissions", "", "Lcom/anggrayudi/storage/permission/PermissionReport;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements measureChildCollapseMargins {
        final /* synthetic */ MiniProgramLocationPickerActivity this$0;

        getMin(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity) {
            this.this$0 = miniProgramLocationPickerActivity;
        }

        public final void onPermissionsChecked(@NotNull layoutChildRight layoutchildright, boolean z) {
            Intrinsics.checkNotNullParameter(layoutchildright, "result");
            boolean max = layoutchildright.getMax();
            if (max) {
                if (WheelView.ScrollerTask.length(this.this$0.getBaseContext())) {
                    this.this$0.watchMyLocation();
                } else {
                    this.this$0.requestLocationService();
                }
            }
            if (z) {
                BlurProcess.getMin(this.this$0.getApplicationContext(), max);
            }
        }

        public final void onShouldRedirectToSystemSettings(@NotNull List<ensureNavButtonView> list) {
            Intrinsics.checkNotNullParameter(list, "blockedPermissions");
            TinyAppActionStateManager.setMax(this.this$0);
        }

        public final void onDisplayConsentDialog(@NotNull layoutChildLeft layoutchildleft) {
            Intrinsics.checkNotNullParameter(layoutchildleft, RequestPermissionsEvent.REQUEST);
            this.this$0.showDialogPermission(layoutchildleft);
        }
    }

    public final void init() {
        injectComponent();
        setupSearchView();
        setupMotionLayout();
        setupRecyclerView();
        setupBottomSheet();
        setupMaps();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J(\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u0012"}, d2 = {"id/dana/danah5/locationpicker/MiniProgramLocationPickerActivity$setupMotionLayout$1", "Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionListener;", "onTransitionChange", "", "motionLayout", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "startId", "", "endId", "progress", "", "onTransitionCompleted", "currentId", "onTransitionStarted", "onTransitionTrigger", "triggerId", "positive", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toDoubleRange implements MotionLayout.equals {
        final /* synthetic */ MiniProgramLocationPickerActivity this$0;

        public final void onTransitionChange(@NotNull MotionLayout motionLayout, int i, int i2, float f) {
            Intrinsics.checkNotNullParameter(motionLayout, "motionLayout");
        }

        public final void onTransitionCompleted(@NotNull MotionLayout motionLayout, int i) {
            Intrinsics.checkNotNullParameter(motionLayout, "motionLayout");
        }

        public final void onTransitionTrigger(@NotNull MotionLayout motionLayout, int i, boolean z, float f) {
            Intrinsics.checkNotNullParameter(motionLayout, "motionLayout");
        }

        toDoubleRange(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity) {
            this.this$0 = miniProgramLocationPickerActivity;
        }

        public final void onTransitionStarted(@NotNull MotionLayout motionLayout, int i, int i2) {
            Intrinsics.checkNotNullParameter(motionLayout, "motionLayout");
            if (i2 == R.id.f51702131363726) {
                ((SearchView) this.this$0._$_findCachedViewById(resetInternal.setMax.setPopupBackgroundResource)).clearFocus();
                MiniProgramLocationPickerActivity miniProgramLocationPickerActivity = this.this$0;
                setMyBeaconListener.setMin(miniProgramLocationPickerActivity, (SearchView) miniProgramLocationPickerActivity._$_findCachedViewById(resetInternal.setMax.setPopupBackgroundResource));
            } else if (i2 == R.id.f51722131363728) {
                updateText presenter = this.this$0.getPresenter();
                String deviceUUID = presenter.getMin.getDeviceUUID();
                Intrinsics.checkNotNullExpressionValue(deviceUUID, "deviceInformationProvider.deviceUUID");
                presenter.length = deviceUUID;
            }
        }
    }

    private final void setupMotionLayout() {
        ((MotionLayout) _$_findCachedViewById(resetInternal.setMax.jumpDrawablesToCurrentState)).setTransitionListener(new toDoubleRange(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"id/dana/danah5/locationpicker/MiniProgramLocationPickerActivity$setupRecyclerView$1", "Lid/dana/nearbyme/adapter/NearbyLocationResultAdapter$OnClickListener;", "onLocationClicked", "", "placeId", "", "name", "address", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class values implements getHandlerClassName.setMin {
        final /* synthetic */ MiniProgramLocationPickerActivity this$0;

        values(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity) {
            this.this$0 = miniProgramLocationPickerActivity;
        }

        public final void onLocationClicked(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "placeId");
            Intrinsics.checkNotNullParameter(str2, "name");
            Intrinsics.checkNotNullParameter(str3, "address");
            this.this$0.setBottomSheetSelectedLocationState(BottomSheetSelectedLocationState.LOADING);
            ((TextView) this.this$0._$_findCachedViewById(resetInternal.setMax.Mean$Arithmetic)).performClick();
            this.this$0.selectedPlace = new Place(str, str2, str3, (LatLng) null, 8, (DefaultConstructorMarker) null);
            this.this$0.getPresenter().setMin(str, str2);
        }
    }

    private final void setupRecyclerView() {
        this.adapter = new getHandlerClassName(new values(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setMenuPrepared);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "it");
        Context context = this;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.addItemDecoration(new RecyclerView.getMax(context, false) {
            private final boolean getMax;
            private Paint length;
            private final Context setMax;

            public final void onDraw(
/*
Method generation error in method: o.BaseOutShareItem.2.onDraw(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic):void, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.BaseOutShareItem.2.onDraw(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final void getItemOffsets(
/*
Method generation error in method: o.BaseOutShareItem.2.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic):void, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.BaseOutShareItem.2.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        });
        getHandlerClassName gethandlerclassname = this.adapter;
        if (gethandlerclassname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView.setAdapter(gethandlerclassname);
    }

    private final void setupBottomSheet() {
        BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from((FrameLayout) _$_findCachedViewById(resetInternal.setMax.toFloatRange));
        from.setHideable(false);
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        from.setPeekHeight((int) TypedValue.applyDimension(1, 30.0f, system.getDisplayMetrics()));
        from.setState(3);
        Unit unit = Unit.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(from, "BottomSheetBehavior.from….STATE_EXPANDED\n        }");
        this.bottomSheetSelectedLocation = from;
        ((DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.getDefaultImpl)).setOnClickListener(new equals(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ MiniProgramLocationPickerActivity this$0;

        equals(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity) {
            this.this$0 = miniProgramLocationPickerActivity;
        }

        public final void onClick(View view) {
            MiniProgramLocationPickerActivity miniProgramLocationPickerActivity = this.this$0;
            Intent intent = new Intent();
            Place access$getSelectedPlace$p = this.this$0.selectedPlace;
            if (access$getSelectedPlace$p != null) {
                miniProgramLocationPickerActivity.setResult(-1, intent.putExtra("result", access$getSelectedPlace$p));
                this.this$0.finish();
            }
        }
    }

    private final void setupMaps() {
        setBottomSheetSelectedLocationState(BottomSheetSelectedLocationState.LOADING);
        LatLng latLng = (LatLng) getIntent().getParcelableExtra(EXTRA_INITIAL_LOCATION);
        if (latLng == null || latLng.isUndefined()) {
            latLng = LatLng.Companion.monas();
        }
        CameraPosition build = new CameraPosition.Builder().target(latLng.toGoogleLatLng()).zoom(17.0f).build();
        getCreateDate.getMax getmax = getCreateDate.getMin;
        GoogleMapOptions camera = new GoogleMapOptions().camera(build);
        Intrinsics.checkNotNullExpressionValue(camera, "GoogleMapOptions().camera(cameraPosition)");
        Intrinsics.checkNotNullParameter(camera, SecurityConstants.KEY_OPTIONS);
        getCreateDate getcreatedate = new getCreateDate();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", camera);
        Unit unit = Unit.INSTANCE;
        getcreatedate.setArguments(bundle);
        this.mapFragment = getcreatedate;
        if (getcreatedate == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TAG_MAP_FRAGMENT);
        }
        getcreatedate.getMapAsync(this);
        setColorFilter setcolorfilter = new setColorFilter(getSupportFragmentManager());
        getCreateDate getcreatedate2 = this.mapFragment;
        if (getcreatedate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TAG_MAP_FRAGMENT);
        }
        setcolorfilter.length(R.id.f54322131363990, getcreatedate2, TAG_MAP_FRAGMENT, 2);
        setcolorfilter.setMin();
        updateText updatetext = this.presenter;
        if (updatetext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        updatetext.getMin(GriverAppLanguageExtension.toLocation(latLng));
        ((FloatingActionButton) _$_findCachedViewById(resetInternal.setMax.onPostMessage)).setOnClickListener(new MiniProgramLocationPickerActivity$FastBitmap$CoordinateSystem(this));
    }

    /* access modifiers changed from: private */
    public final void showDialogPermission(layoutChildLeft layoutchildleft) {
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(this);
        getmax.toFloatRange = getString(R.string.allow_location_access);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.isInside = getString(R.string.allow_location_for_experience);
        getProgressViewStartOffset.getMax getmax3 = getmax2;
        getmax3.setMax = R.drawable.ic_location_permission_icon;
        getProgressViewStartOffset.getMax getmax4 = getmax3;
        getmax4.toIntRange = 0;
        getmax4.IsOverlapping().setMax(false).setMin(getString(R.string.allow_access), new valueOf(layoutchildleft)).getMax(getString(17039360), MiniProgramLocationPickerActivity$Mean$Arithmetic.INSTANCE).equals();
    }

    public final void onMapReady(@NotNull GoogleMap googleMap) {
        Intrinsics.checkNotNullParameter(googleMap, "maps");
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        if (griverDefaultLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
        }
        griverDefaultLoadingView.setMax(googleMap, (GoogleMap.OnMarkerClickListener) this);
        setupCameraListener(googleMap);
        this.permissionRequest.setMax();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onCameraMove"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements GoogleMap.OnCameraMoveListener {
        final /* synthetic */ MiniProgramLocationPickerActivity this$0;

        toFloatRange(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity) {
            this.this$0 = miniProgramLocationPickerActivity;
        }

        public final void onCameraMove() {
            this.this$0.pullOutPinMap();
        }
    }

    private final void setupCameraListener(GoogleMap googleMap) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(312090892, oncanceled);
            onCancelLoad.getMin(312090892, oncanceled);
        }
        googleMap.setOnCameraMoveListener(new toFloatRange(this));
        googleMap.setOnCameraIdleListener(new toIntRange(this));
        googleMap.setOnCameraMoveStartedListener(new toString(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onCameraIdle"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements GoogleMap.OnCameraIdleListener {
        final /* synthetic */ MiniProgramLocationPickerActivity this$0;

        toIntRange(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity) {
            this.this$0 = miniProgramLocationPickerActivity;
        }

        public final void onCameraIdle() {
            Location location;
            this.this$0.putDownPinMap();
            GriverDefaultLoadingView mapHelper = this.this$0.getMapHelper();
            if (mapHelper.setMax != null) {
                com.google.android.gms.maps.model.LatLng latLng = mapHelper.setMax.getCameraPosition().target;
                double d = latLng.latitude;
                double d2 = latLng.longitude;
                location = new Location("");
                location.setLatitude(d);
                location.setLongitude(d2);
            } else {
                location = null;
            }
            if (location != null && Intrinsics.areEqual((Object) this.this$0.flagFromPullOutPinMap, (Object) Boolean.TRUE)) {
                this.this$0.getPresenter().getMin(location);
                this.this$0.flagFromPullOutPinMap = Boolean.FALSE;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "reason", "", "onCameraMoveStarted"}, k = 3, mv = {1, 4, 2})
    static final class toString implements GoogleMap.OnCameraMoveStartedListener {
        final /* synthetic */ MiniProgramLocationPickerActivity this$0;

        toString(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity) {
            this.this$0 = miniProgramLocationPickerActivity;
        }

        public final void onCameraMoveStarted(int i) {
            if (i == 1) {
                this.this$0.showSkeletonBottomSheet();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void assembleReverseGeocodeOnBottomSheet(processFacade processfacade) {
        String latitude;
        int max;
        Context baseContext = getBaseContext();
        Place place = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 695747018 == (max = dispatchOnCancelled.getMax(applicationContext, 695747018)))) {
            onCanceled oncanceled = new onCanceled(695747018, max, 512);
            onCancelLoad.setMax(695747018, oncanceled);
            onCancelLoad.getMin(695747018, oncanceled);
        }
        if (!(processfacade == null || (latitude = processfacade.getLatitude()) == null)) {
            place = new Place("", processfacade.getLabel(), processfacade.getAddressLine(), new LatLng(latitude, processfacade.getLongitude()));
        }
        this.selectedPlace = place;
        setBottomSheetSelectedLocationState(BottomSheetSelectedLocationState.SUCCESS);
    }

    public final void configToolbar() {
        Toolbar toolbar = (Toolbar) _$_findCachedViewById(resetInternal.setMax.getFixedHeightMajor);
        setSupportActionBar(toolbar);
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.hasWindowFocus);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar_title");
        textView.setText(getIntent().getStringExtra("appName"));
        toolbar.setNavigationIcon(startBeaconDiscovery.getMax(this, R.drawable.arrow_left_white));
        toolbar.setNavigationOnClickListener(new getMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/danah5/locationpicker/MiniProgramLocationPickerActivity$configToolbar$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ MiniProgramLocationPickerActivity this$0;

        getMax(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity) {
            this.this$0 = miniProgramLocationPickerActivity;
        }

        public final void onClick(View view) {
            this.this$0.setResult(0);
            this.this$0.finish();
        }
    }

    private final void setupSearchView() {
        SearchView searchView = (SearchView) _$_findCachedViewById(resetInternal.setMax.setPopupBackgroundResource);
        Intrinsics.checkNotNullExpressionValue(searchView, "searchBoxLocation");
        addDisposable(searchView.getKeyword().debounce(500, TimeUnit.MILLISECONDS).observeOn(hideProgress.length()).subscribeOn(getSecureSignatureComp.setMin()).subscribe(new hashCode(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class hashCode<T> implements RedDotManager<String> {
        final /* synthetic */ MiniProgramLocationPickerActivity this$0;

        hashCode(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity) {
            this.this$0 = miniProgramLocationPickerActivity;
        }

        public final void accept(String str) {
            Intrinsics.checkNotNullExpressionValue(str, "it");
            if (str != null) {
                String obj = StringsKt.trim((CharSequence) str).toString();
                if (obj.length() == 0) {
                    this.this$0.setSearchLocationState(SearchLocationState.EMPTY_KEYWORD);
                    return;
                }
                this.this$0.setSearchLocationState(SearchLocationState.SEARCHING);
                LatLng access$getCurrentLocation$p = this.this$0.currentLocation;
                if (access$getCurrentLocation$p == null) {
                    access$getCurrentLocation$p = LatLng.Companion.monas();
                }
                this.this$0.getPresenter().length(obj, GriverAppLanguageExtension.toLocation(access$getCurrentLocation$p));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"id/dana/danah5/locationpicker/MiniProgramLocationPickerActivity$injectComponent$1", "Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$View;", "onErrorGetDetailLocation", "", "onErrorGetListLocations", "onSuccessGetDetailLocation", "location", "Landroid/location/Location;", "onSuccessGetListLocations", "nearbyLocations", "", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "onSuccessGetReverseGeocodeByLocation", "address", "Lid/dana/domain/miniprogram/model/Address;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements setTextColor.getMin {
        final /* synthetic */ MiniProgramLocationPickerActivity this$0;

        @JvmDefault
        public final void getMin(@NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shops");
        }

        @JvmDefault
        public final void getMin(boolean z, @NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shops");
        }

        @JvmDefault
        public final void setMax() {
        }

        @JvmDefault
        public final void setMin(@NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shopsWithPromo");
        }

        @JvmDefault
        public final void setMin(boolean z, @NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shops");
        }

        length(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity) {
            this.this$0 = miniProgramLocationPickerActivity;
        }

        public final void onSuccessGetListLocations(@NotNull List<getCreateTime> list) {
            Intrinsics.checkNotNullParameter(list, "nearbyLocations");
            this.this$0.updateLocationData(list);
        }

        public final void onErrorGetListLocations() {
            this.this$0.setSearchLocationState(SearchLocationState.SEARCH_ERROR);
        }

        public final void onSuccessGetDetailLocation(@NotNull Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            Place access$getSelectedPlace$p = this.this$0.selectedPlace;
            if (access$getSelectedPlace$p != null) {
                access$getSelectedPlace$p.setLocation(GriverAppLanguageExtension.toLatLng(location));
            }
            this.this$0.setBottomSheetSelectedLocationState(BottomSheetSelectedLocationState.SUCCESS);
        }

        public final void onSuccessGetReverseGeocodeByLocation(@NotNull processFacade processfacade) {
            Intrinsics.checkNotNullParameter(processfacade, "address");
            this.this$0.assembleReverseGeocodeOnBottomSheet(processfacade);
        }

        public final void onErrorGetDetailLocation() {
            this.this$0.selectedPlace = null;
            this.this$0.setBottomSheetSelectedLocationState(BottomSheetSelectedLocationState.ERROR);
        }
    }

    /* access modifiers changed from: private */
    public final void updateLocationData(List<getCreateTime> list) {
        if (list.isEmpty()) {
            setSearchLocationState(SearchLocationState.SEARCH_EMPTY_RESULT);
            return;
        }
        getHandlerClassName gethandlerclassname = this.adapter;
        if (gethandlerclassname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        gethandlerclassname.getMin(list);
        setSearchLocationState(SearchLocationState.SEARCH_RESULT_FOUND);
    }

    /* access modifiers changed from: private */
    public final void setBottomSheetSelectedLocationState(BottomSheetSelectedLocationState bottomSheetSelectedLocationState) {
        int i = onActionButtonClicked$core.$EnumSwitchMapping$0[bottomSheetSelectedLocationState.ordinal()];
        if (i == 1 || i == 2) {
            showSkeletonBottomSheet();
        } else if (i == 3) {
            dismissSkeletonBottomSheet();
            Place place = this.selectedPlace;
            if (place != null) {
                TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.updateTab);
                if (textView != null) {
                    textView.setText(place.getName());
                }
                TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.addTab);
                if (textView2 != null) {
                    textView2.setText(place.getAddress());
                }
                GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
                if (griverDefaultLoadingView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapHelper");
                }
                com.google.android.gms.maps.model.LatLng googleLatLng = place.getLocation().toGoogleLatLng();
                if (griverDefaultLoadingView.setMax != null) {
                    griverDefaultLoadingView.setMax.animateCamera(GriverDefaultLoadingView.setMax(googleLatLng, 15.0f));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setSearchLocationState(SearchLocationState searchLocationState) {
        int length2;
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -586455589 == (max = dispatchOnCancelled.getMax(applicationContext, -586455589)))) {
            onCanceled oncanceled = new onCanceled(-586455589, max, 512);
            onCancelLoad.setMax(-586455589, oncanceled);
            onCancelLoad.getMin(-586455589, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-586455589, oncanceled2);
            onCancelLoad.getMin(-586455589, oncanceled2);
        }
        int i = onActionButtonClicked$core.$EnumSwitchMapping$1[searchLocationState.ordinal()];
        if (i == 1) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.savePresenterStates);
            if (linearLayout != null) {
                linearLayout.setVisibility(4);
            }
            showSkeletonLocationList();
        } else if (i == 2) {
            getHandlerClassName gethandlerclassname = this.adapter;
            if (gethandlerclassname == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            gethandlerclassname.getMin(CollectionsKt.emptyList());
            onDetachedFromLayoutParams ondetachedfromlayoutparams = this.skeletonLocationList;
            if (ondetachedfromlayoutparams != null) {
                ondetachedfromlayoutparams.length();
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onMenuItemSelected);
            if (appCompatImageView != null) {
                setSlingshotDistance.getMax(appCompatImageView, R.drawable.ic_general_search);
            }
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setGravity);
            if (textView != null) {
                textView.setText(R.string.lets_find_ur_location);
            }
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.getGravity);
            if (textView2 != null) {
                textView2.setText(R.string.start_typing_for_suggestions);
            }
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.savePresenterStates);
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
        } else if (i == 3 || i == 4) {
            getHandlerClassName gethandlerclassname2 = this.adapter;
            if (gethandlerclassname2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            gethandlerclassname2.getMin(CollectionsKt.emptyList());
            onDetachedFromLayoutParams ondetachedfromlayoutparams2 = this.skeletonLocationList;
            if (ondetachedfromlayoutparams2 != null) {
                ondetachedfromlayoutparams2.length();
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onMenuItemSelected);
            if (appCompatImageView2 != null) {
                setSlingshotDistance.getMax(appCompatImageView2, R.drawable.img_search_result_not_found);
            }
            TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.setGravity);
            if (textView3 != null) {
                textView3.setText(R.string.no_location_found);
            }
            TextView textView4 = (TextView) _$_findCachedViewById(resetInternal.setMax.getGravity);
            if (textView4 != null) {
                textView4.setText(R.string.no_location_found_desc);
            }
            LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.savePresenterStates);
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
        } else if (i == 5) {
            onDetachedFromLayoutParams ondetachedfromlayoutparams3 = this.skeletonLocationList;
            if (ondetachedfromlayoutparams3 != null) {
                ondetachedfromlayoutparams3.length();
            }
            LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.savePresenterStates);
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(4);
            }
        }
    }

    private final void showSkeletonLocationList() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.skeletonLocationList;
        if (ondetachedfromlayoutparams == null) {
            getScrimColor.getMax getmax = new getScrimColor.getMax((RecyclerView) _$_findCachedViewById(resetInternal.setMax.setMenuPrepared));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setMenuPrepared);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            getmax.length = recyclerView.getAdapter();
            getmax.getMax = R.layout.skeleton_search_location;
            getmax.IsOverlapping = 1500;
            getmax.setMin = 4;
            getmax.getMin = true;
            getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
            getmax.toIntRange = 0;
            getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
            getscrimcolor.getMin();
            this.skeletonLocationList = getscrimcolor;
        } else if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
        }
    }

    /* access modifiers changed from: private */
    public final void showSkeletonBottomSheet() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.bottomSheetSelectedLocation;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetSelectedLocation");
        }
        bottomSheetBehavior.setState(3);
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.skeletonBottomSheet;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax((LinearLayout) _$_findCachedViewById(resetInternal.setMax.getActionViewStatesKey));
            setmax.getMax = R.layout.skeleton_3_small_rows;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 0;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.skeletonBottomSheet = getinsetdodgerect;
        } else if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.getDefaultImpl);
        Intrinsics.checkNotNullExpressionValue(danaButtonPrimaryView, "btnSelectThisLocation");
        danaButtonPrimaryView.setEnabled(false);
    }

    private final void dismissSkeletonBottomSheet() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.skeletonBottomSheet;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.getDefaultImpl);
        Intrinsics.checkNotNullExpressionValue(danaButtonPrimaryView, "btnSelectThisLocation");
        danaButtonPrimaryView.setEnabled(true);
    }

    private final boolean isPutDownPinMap() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1380555370 == (max = dispatchOnCancelled.getMax(applicationContext, 1380555370)))) {
            onCanceled oncanceled = new onCanceled(1380555370, max, 512);
            onCancelLoad.setMax(1380555370, oncanceled);
            onCancelLoad.getMin(1380555370, oncanceled);
        }
        PinMapLottieAnimationView pinMapLottieAnimationView = (PinMapLottieAnimationView) _$_findCachedViewById(resetInternal.setMax.collapseItemActionView);
        return (pinMapLottieAnimationView.getMaxFrame() == ((float) pinMapLottieAnimationView.getPullOutMaxFrame()) || pinMapLottieAnimationView.getMinFrame() == ((float) pinMapLottieAnimationView.getPullOutMinFrame())) ? false : true;
    }

    /* access modifiers changed from: private */
    public final void pullOutPinMap() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1576349386 == (max = dispatchOnCancelled.getMax(applicationContext, 1576349386)))) {
            onCanceled oncanceled = new onCanceled(1576349386, max, 512);
            onCancelLoad.setMax(1576349386, oncanceled);
            onCancelLoad.getMin(1576349386, oncanceled);
        }
        if (isPutDownPinMap()) {
            PinMapLottieAnimationView pinMapLottieAnimationView = (PinMapLottieAnimationView) _$_findCachedViewById(resetInternal.setMax.collapseItemActionView);
            pinMapLottieAnimationView.setMinFrame(pinMapLottieAnimationView.getPullOutMinFrame());
            pinMapLottieAnimationView.setMaxFrame(pinMapLottieAnimationView.getPullOutMaxFrame());
            pinMapLottieAnimationView.playAnimation();
            this.flagFromPullOutPinMap = Boolean.TRUE;
        }
    }

    /* access modifiers changed from: private */
    public final void putDownPinMap() {
        PinMapLottieAnimationView pinMapLottieAnimationView = (PinMapLottieAnimationView) _$_findCachedViewById(resetInternal.setMax.collapseItemActionView);
        pinMapLottieAnimationView.setMinFrame(pinMapLottieAnimationView.getPutDownMinFrame());
        pinMapLottieAnimationView.setMaxFrame(pinMapLottieAnimationView.getPutDownMaxFrame());
        pinMapLottieAnimationView.playAnimation();
    }

    /* access modifiers changed from: private */
    public final void requestLocationService() {
        LocationRequest create = LocationRequest.create();
        create.setPriority(102);
        create.setNumUpdates(1);
        LocationSettingsRequest build = new LocationSettingsRequest.Builder().addLocationRequest(create).setAlwaysShow(true).build();
        GriverProgressBar.UpdateRunnable updateRunnable = this.locationRequestDisposable;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        uploadCoreByStartService uploadcorebystartservice = new uploadCoreByStartService(this);
        this.locationRequestDisposable = appendAppLog.setMax(uploadcorebystartservice.setMin, uploadcorebystartservice.setMax, LocationServices.API).flatMap(new RedDotDrawable<GoogleApiClient, TitleBarRightButtonView.AnonymousClass1<LocationSettingsResult>>(build) {
            final /* synthetic */ LocationSettingsRequest getMin;

            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                */
            /*  JADX ERROR: Method generation error: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                */
            public final /* synthetic */ java.lang.Object apply(
/*
Method generation error in method: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        }).subscribe(new IsOverlapping(this), isInside.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/google/android/gms/location/LocationSettingsResult;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T> implements RedDotManager<LocationSettingsResult> {
        final /* synthetic */ MiniProgramLocationPickerActivity this$0;

        IsOverlapping(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity) {
            this.this$0 = miniProgramLocationPickerActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
            r0 = r0.getResolution();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void accept(com.google.android.gms.location.LocationSettingsResult r7) {
            /*
                r6 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
                com.google.android.gms.common.api.Status r0 = r7.getStatus()
                r1 = 0
                if (r0 == 0) goto L_0x0017
                android.app.PendingIntent r0 = r0.getResolution()
                if (r0 == 0) goto L_0x0017
                android.content.IntentSender r0 = r0.getIntentSender()
                goto L_0x0018
            L_0x0017:
                r0 = r1
            L_0x0018:
                if (r0 == 0) goto L_0x0042
                com.google.android.gms.common.api.Status r7 = r7.getStatus()
                if (r7 == 0) goto L_0x0042
                int r7 = r7.getStatusCode()
                r2 = 6
                if (r7 != r2) goto L_0x0042
                id.dana.danah5.locationpicker.MiniProgramLocationPickerActivity r7 = r6.this$0     // Catch:{ SendIntentException -> 0x0042 }
                o.ITrustedWebActivityCallback r7 = r7.launcher     // Catch:{ SendIntentException -> 0x0042 }
                androidx.activity.result.IntentSenderRequest$setMin r2 = new androidx.activity.result.IntentSenderRequest$setMin     // Catch:{ SendIntentException -> 0x0042 }
                r2.<init>(r0)     // Catch:{ SendIntentException -> 0x0042 }
                androidx.activity.result.IntentSenderRequest r0 = new androidx.activity.result.IntentSenderRequest     // Catch:{ SendIntentException -> 0x0042 }
                android.content.IntentSender r3 = r2.getMin     // Catch:{ SendIntentException -> 0x0042 }
                android.content.Intent r4 = r2.length     // Catch:{ SendIntentException -> 0x0042 }
                int r5 = r2.getMax     // Catch:{ SendIntentException -> 0x0042 }
                int r2 = r2.setMin     // Catch:{ SendIntentException -> 0x0042 }
                r0.<init>(r3, r4, r5, r2)     // Catch:{ SendIntentException -> 0x0042 }
                r7.getMin(r0, r1)     // Catch:{ SendIntentException -> 0x0042 }
            L_0x0042:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.danah5.locationpicker.MiniProgramLocationPickerActivity.IsOverlapping.accept(com.google.android.gms.location.LocationSettingsResult):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/activity/result/ActivityResult;", "kotlin.jvm.PlatformType", "onActivityResult"}, k = 3, mv = {1, 4, 2})
    static final class setMax<O> implements IPostMessageService.Default<ActivityResult> {
        final /* synthetic */ MiniProgramLocationPickerActivity this$0;

        setMax(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity) {
            this.this$0 = miniProgramLocationPickerActivity;
        }

        public final void onActivityResult(ActivityResult activityResult) {
            Intrinsics.checkNotNullExpressionValue(activityResult, "it");
            if (activityResult.getMax == -1) {
                this.this$0.watchMyLocation();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void watchMyLocation() {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        GriverProgressBar.UpdateRunnable updateRunnable = this.locationWatcherDisposable;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        this.locationWatcherDisposable = new WheelView.ScrollerTask.getMax(this).getMin().subscribe(new invokeSuspend(this, booleanRef));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend<T> implements RedDotManager<Location> {
        final /* synthetic */ Ref.BooleanRef $shouldCenterToMyLocation;
        final /* synthetic */ MiniProgramLocationPickerActivity this$0;

        invokeSuspend(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity, Ref.BooleanRef booleanRef) {
            this.this$0 = miniProgramLocationPickerActivity;
            this.$shouldCenterToMyLocation = booleanRef;
        }

        public final void accept(Location location) {
            MiniProgramLocationPickerActivity miniProgramLocationPickerActivity = this.this$0;
            Intrinsics.checkNotNullExpressionValue(location, "it");
            miniProgramLocationPickerActivity.currentLocation = GriverAppLanguageExtension.toLatLng(location);
            this.this$0.updateMyCurrentLocationMarker(this.$shouldCenterToMyLocation.element);
            this.$shouldCenterToMyLocation.element = false;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1 == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateMyCurrentLocationMarker(boolean r7) {
        /*
            r6 = this;
            id.dana.domain.globalsearch.model.LatLng r0 = r6.currentLocation
            if (r0 == 0) goto L_0x005b
            com.google.android.gms.maps.model.Marker r1 = r6.myLocationMarker
            java.lang.String r2 = "mapHelper"
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.maps.model.LatLng r3 = r0.toGoogleLatLng()
            r1.setPosition(r3)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            if (r1 != 0) goto L_0x0038
        L_0x0015:
            o.GriverDefaultLoadingView r1 = r6.mapHelper
            if (r1 != 0) goto L_0x001c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x001c:
            o.GriverDefaultLoadingView r3 = r6.mapHelper
            if (r3 != 0) goto L_0x0023
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0023:
            android.location.Location r4 = o.GriverAppLanguageExtension.toLocation(r0)
            r5 = 0
            com.google.android.gms.maps.model.MarkerOptions r3 = r3.setMin(r4, r5)
            com.google.android.gms.maps.GoogleMap r4 = r1.setMax
            if (r4 == 0) goto L_0x0037
            com.google.android.gms.maps.GoogleMap r1 = r1.setMax
            com.google.android.gms.maps.model.Marker r1 = r1.addMarker(r3)
            goto L_0x0038
        L_0x0037:
            r1 = r5
        L_0x0038:
            r6.myLocationMarker = r1
            if (r7 == 0) goto L_0x005b
            o.GriverDefaultLoadingView r7 = r6.mapHelper
            if (r7 != 0) goto L_0x0043
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0043:
            com.google.android.gms.maps.model.LatLng r0 = r0.toGoogleLatLng()
            com.google.android.gms.maps.GoogleMap r1 = r7.setMax
            if (r1 == 0) goto L_0x0056
            com.google.android.gms.maps.GoogleMap r7 = r7.setMax
            r1 = 1097859072(0x41700000, float:15.0)
            com.google.android.gms.maps.CameraUpdate r0 = o.GriverDefaultLoadingView.setMax((com.google.android.gms.maps.model.LatLng) r0, (float) r1)
            r7.animateCamera(r0)
        L_0x0056:
            id.dana.danah5.locationpicker.MiniProgramLocationPickerActivity$BottomSheetSelectedLocationState r7 = id.dana.danah5.locationpicker.MiniProgramLocationPickerActivity.BottomSheetSelectedLocationState.LOADING
            r6.setBottomSheetSelectedLocationState(r7)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.danah5.locationpicker.MiniProgramLocationPickerActivity.updateMyCurrentLocationMarker(boolean):void");
    }

    public final void onDestroy() {
        GriverProgressBar.UpdateRunnable updateRunnable = this.locationWatcherDisposable;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        GriverProgressBar.UpdateRunnable updateRunnable2 = this.locationRequestDisposable;
        if (updateRunnable2 != null) {
            updateRunnable2.dispose();
        }
        super.onDestroy();
    }

    @Parcelize
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006&"}, d2 = {"Lid/dana/danah5/locationpicker/MiniProgramLocationPickerActivity$Place;", "Landroid/os/Parcelable;", "id", "", "name", "address", "location", "Lid/dana/domain/globalsearch/model/LatLng;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/globalsearch/model/LatLng;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getId", "getLocation", "()Lid/dana/domain/globalsearch/model/LatLng;", "setLocation", "(Lid/dana/domain/globalsearch/model/LatLng;)V", "getName", "setName", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class Place implements Parcelable {
        public static final Parcelable.Creator<Place> CREATOR = new length();
        @NotNull
        private String address;
        @NotNull

        /* renamed from: id  reason: collision with root package name */
        private final String f9121id;
        @NotNull
        private LatLng location;
        @NotNull
        private String name;

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
        public static class length implements Parcelable.Creator<Place> {
            @NotNull
            public final Place createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
                return new Place(parcel.readString(), parcel.readString(), parcel.readString(), (LatLng) parcel.readParcelable(Place.class.getClassLoader()));
            }

            @NotNull
            public final Place[] newArray(int i) {
                return new Place[i];
            }
        }

        public static /* synthetic */ Place copy$default(Place place, String str, String str2, String str3, LatLng latLng, int i, Object obj) {
            if ((i & 1) != 0) {
                str = place.f9121id;
            }
            if ((i & 2) != 0) {
                str2 = place.name;
            }
            if ((i & 4) != 0) {
                str3 = place.address;
            }
            if ((i & 8) != 0) {
                latLng = place.location;
            }
            return place.copy(str, str2, str3, latLng);
        }

        @NotNull
        public final String component1() {
            return this.f9121id;
        }

        @NotNull
        public final String component2() {
            return this.name;
        }

        @NotNull
        public final String component3() {
            return this.address;
        }

        @NotNull
        public final LatLng component4() {
            return this.location;
        }

        @NotNull
        public final Place copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull LatLng latLng) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(str2, "name");
            Intrinsics.checkNotNullParameter(str3, "address");
            Intrinsics.checkNotNullParameter(latLng, "location");
            return new Place(str, str2, str3, latLng);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Place)) {
                return false;
            }
            Place place = (Place) obj;
            return Intrinsics.areEqual((Object) this.f9121id, (Object) place.f9121id) && Intrinsics.areEqual((Object) this.name, (Object) place.name) && Intrinsics.areEqual((Object) this.address, (Object) place.address) && Intrinsics.areEqual((Object) this.location, (Object) place.location);
        }

        public final int hashCode() {
            String str = this.f9121id;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.address;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            LatLng latLng = this.location;
            if (latLng != null) {
                i = latLng.hashCode();
            }
            return hashCode3 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Place(id=");
            sb.append(this.f9121id);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", address=");
            sb.append(this.address);
            sb.append(", location=");
            sb.append(this.location);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.f9121id);
            parcel.writeString(this.name);
            parcel.writeString(this.address);
            parcel.writeParcelable(this.location, i);
        }

        public Place(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull LatLng latLng) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(str2, "name");
            Intrinsics.checkNotNullParameter(str3, "address");
            Intrinsics.checkNotNullParameter(latLng, "location");
            this.f9121id = str;
            this.name = str2;
            this.address = str3;
            this.location = latLng;
        }

        @NotNull
        public final String getId() {
            return this.f9121id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final void setName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.name = str;
        }

        @NotNull
        public final String getAddress() {
            return this.address;
        }

        public final void setAddress(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.address = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Place(String str, String str2, String str3, LatLng latLng, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? new LatLng(0.0d, 0.0d, 3, (DefaultConstructorMarker) null) : latLng);
        }

        @NotNull
        public final LatLng getLocation() {
            return this.location;
        }

        public final void setLocation(@NotNull LatLng latLng) {
            Intrinsics.checkNotNullParameter(latLng, "<set-?>");
            this.location = latLng;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/danah5/locationpicker/MiniProgramLocationPickerActivity$Companion;", "", "()V", "EXTRA_APP_NAME", "", "EXTRA_INITIAL_LOCATION", "EXTRA_LOCATION_RESULT", "REQUEST_CODE_PERMISSION_REQUEST", "", "TAG_MAP_FRAGMENT", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void injectComponent() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-2056838164, oncanceled);
            onCancelLoad.getMin(-2056838164, oncanceled);
        }
        BaseResourcePackage.getMin getmin = new BaseResourcePackage.getMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmin.getMin = applicationComponent;
            getmin.setMax = new NearbyMerchantLocationSearchModule(new length(this));
            getmin.getMax().getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            updateText updatetext = this.presenter;
            if (updatetext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = updatetext;
            registerPresenter(getminArr);
            updateText updatetext2 = this.presenter;
            if (updatetext2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            updatetext2.getMax.getMin(updatetext2.setMax.subscribe(new updateText.values(updatetext2)));
            return;
        }
        throw null;
    }
}
