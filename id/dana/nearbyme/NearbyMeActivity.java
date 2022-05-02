package id.dana.nearbyme;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnTouch;
import com.airbnb.lottie.LottieAnimationView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.danah5.DanaH5;
import id.dana.data.constant.UrlTag;
import id.dana.di.modules.NearbyMeModule;
import id.dana.nearbyme.OtherStoreListActivity;
import id.dana.nearbyme.enums.SearchType;
import id.dana.nearbyme.merchantdetail.MerchantDetailActivity;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyme.summary.MerchantListView;
import id.dana.richview.PinMapLottieAnimationView;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.mixpanel.TopupSource;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AppCategory;
import o.AppInfo;
import o.AppInfosResult;
import o.BlurProcess;
import o.CategoryInfo;
import o.CornerMarkingDataProvider;
import o.DeployAppInfo;
import o.GriverCommonResourceProxy;
import o.GriverDefaultLoadingView;
import o.GriverLoadingDialog;
import o.GriverMenuExtensionImpl;
import o.GriverProgressBar;
import o.PhotoView;
import o.Popup;
import o.PrepareException;
import o.RedDotDrawable;
import o.SecuritySignature;
import o.TitleBarRightButtonView;
import o.WheelView;
import o.a;
import o.access$1402;
import o.containsFavoriteMenuItem;
import o.convertAppInfo;
import o.convertAppInfos;
import o.customizeWebViewSettings;
import o.dismissBadgeView;
import o.dispatchOnCancelled;
import o.evaluate;
import o.g;
import o.getAppIdList;
import o.getAppInfos;
import o.getAppSlogan;
import o.getCategories;
import o.getCategory;
import o.getCategoryId;
import o.getCategoryInfos;
import o.getCreateDate;
import o.getIntroduction;
import o.getMaxTextureSize;
import o.getReleaseVersion;
import o.getSiteName;
import o.getTotalCount;
import o.getUseAmcsLite;
import o.getUseSecurityGuard;
import o.hasCornerMarking;
import o.hideProgress;
import o.initRect;
import o.isLineVisible;
import o.k;
import o.layoutChildWithAnchor;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.onDrag;
import o.onKey;
import o.onLoadChildren;
import o.onNotInstalled;
import o.parseBehavior;
import o.setAppInfos;
import o.setCategories;
import o.setCategory;
import o.setCategoryId;
import o.setFavoriteBtnVisibility;
import o.setH5OptionMenuTextFlag;
import o.setHeaderViewHeight;
import o.setIdentifier;
import o.setIntroduction;
import o.setOnWheelViewListener;
import o.setRefreshAnimation;
import o.setRefreshOffset;
import o.setReleaseVersion;
import o.setStateOn;
import o.setTextSpacing;
import o.setTotalCount;
import o.setUseAmcsLite;
import o.setUseSecurityGuard;
import o.stopIgnoring;
import o.t;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;

public class NearbyMeActivity extends BaseActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
    public static final String EXTRA_CATEGORY = "EXTRA_CATEGORY";
    public static final String EXTRA_LOCATION_LAT = "EXTRA_LOCATION_LAT";
    public static final String EXTRA_LOCATION_LON = "EXTRA_LOCATION_LON";
    public static final String EXTRA_MERCHANT_ID = "EXTRA_MERCHANT_ID";
    public static final String EXTRA_SEARCH_KEYWORD = "EXTRA_SEARCH_KEYWORD";
    public static final String EXTRA_SHOP_ID = "EXTRA_SHOP_ID";
    public static final String EXTRA_SOURCE = "EXTRA_SOURCE";
    public static final String EXTRA_SOURCE_HOME = "Home";
    public static final String NON_DANA_MERCHANT_ID = "216620000020928274717";
    public static final int RADIUS = 3000;
    private static final int getMax = ((int) (Resources.getSystem().getDisplayMetrics().density * 95.0f));
    private static final int getMin = ((int) (Resources.getSystem().getDisplayMetrics().density * 9.0f));
    private GriverProgressBar.UpdateRunnable FastBitmap$CoordinateSystem;
    private Animation Grayscale$Algorithm;
    private onDetachedFromLayoutParams ICustomTabsCallback;
    private customizeWebViewSettings IsOverlapping = null;
    /* access modifiers changed from: private */
    public boolean Mean$Arithmetic;
    @BindView(2131361903)
    AppBarLayout appBarLayout;
    private Location b;
    @BindView(2131362457)
    CoordinatorLayout clLayoutMerchant;
    @BindView(2131362367)
    ConstraintLayout clLocationContainer;
    /* access modifiers changed from: private */
    public String create;
    @BindView(2131362648)
    CardView cvGoToMyLocation;
    @BindView(2131362650)
    CardView cvInfoLegendary;
    @BindView(2131362210)
    CardView cvMerchant;
    private boolean equals = true;
    @BindView(2131362827)
    EditText etNearbySearch;
    /* access modifiers changed from: private */
    public boolean getCause;
    private boolean hashCode;
    private setStateOn invoke;
    private Marker invokeSuspend;
    /* access modifiers changed from: private */
    public boolean isInside;
    @BindView(2131363385)
    ImageView ivClear;
    @BindView(2131363391)
    ImageView ivClose;
    @BindView(2131363498)
    ImageView ivInfo;
    @BindView(2131363517)
    ImageView ivLoader;
    @BindView(2131363721)
    PinMapLottieAnimationView lavMapCenterPinPoint;
    @Inject
    public GriverDefaultLoadingView mapHelper;
    @BindView(2131365897)
    MerchantListView merchantListView;
    @Inject
    public t nearbyAnalyticTracker;
    @BindView(2131365905)
    NearbyMerchantLocationSearchView nearbyMerchantLocationSearchView;
    /* access modifiers changed from: private */
    public PhotoView.PhotoInter onNavigationEvent;
    @Inject
    public setTextSpacing.setMin presenter;
    private BottomSheetBehavior setMax;
    /* access modifiers changed from: private */
    public boolean toDoubleRange = false;
    private int toFloatRange;
    private Location toIntRange;
    private Pair<Marker, Marker> toString;
    @BindView(2131365139)
    TextView tvChangeLocation;
    @BindView(2131365214)
    TextView tvDistrictLocation;
    @BindView(2131365327)
    TextView tvLocation;
    @BindView(2131365510)
    TextView tvRefreshing;
    @BindView(2131365536)
    TextView tvSearchHere;
    private HashSet<String> valueOf = new HashSet<>();
    private HashMap<String, Marker> values = new HashMap<>();
    @BindView(2131365977)
    View viewTooltipSpotlightContainer;
    @BindView(2131365976)
    View viewTooltipSpotlightPointer;

    @Retention(RetentionPolicy.SOURCE)
    @interface RefreshCondition {
        public static final String ERROR = "ERROR";
        public static final String FETCHED = "FETCHED";
        public static final String REFRESHING = "REFRESHING";
    }

    /* access modifiers changed from: private */
    public static boolean getMin(float f) {
        double d = (double) f;
        return d <= 1.0d && d >= 0.0d;
    }

    public int getLayout() {
        return R.layout.activity_nearby_me;
    }

    static /* synthetic */ void access$1200(NearbyMeActivity nearbyMeActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(504227176, oncanceled);
            onCancelLoad.getMin(504227176, oncanceled);
        }
        SupportMapFragment supportMapFragment = (SupportMapFragment) nearbyMeActivity.getSupportFragmentManager().findFragmentById(R.id.f54312131363989);
        if (supportMapFragment != null) {
            supportMapFragment.getMapAsync(nearbyMeActivity);
        }
        nearbyMeActivity.getMin();
    }

    public static /* synthetic */ void access$1700(NearbyMeActivity nearbyMeActivity, ShopModel shopModel, Drawable drawable, Location location) {
        int length;
        int min;
        Context baseContext = nearbyMeActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1904095101, oncanceled);
            onCancelLoad.getMin(1904095101, oncanceled);
        }
        if (nearbyMeActivity.setMax(shopModel.b)) {
            MarkerOptions min2 = nearbyMeActivity.getMin(shopModel, drawable, location);
            if (nearbyMeActivity.getMin(shopModel)) {
                min2.visible(false);
            }
            Marker min3 = nearbyMeActivity.setMin(min2, shopModel);
            if (nearbyMeActivity.getMin(shopModel) && nearbyMeActivity.toString != null) {
                nearbyMeActivity.toString = new Pair<>(nearbyMeActivity.toString.first, min3);
            }
        }
    }

    public static /* synthetic */ void access$1900(NearbyMeActivity nearbyMeActivity, Drawable drawable, Marker marker) {
        int i;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(416580609, oncanceled);
            onCancelLoad.getMin(416580609, oncanceled);
        }
        ShopModel shopModel = (ShopModel) marker.getTag();
        String str = shopModel.invoke;
        if (nearbyMeActivity.valueOf.contains(shopModel.b)) {
            i = R.drawable.ic_highlight_merchant_popular;
        } else if (shopModel.equals()) {
            i = R.drawable.ic_highlight_merchant_promo;
        } else {
            i = shopModel.toDoubleRange() ? R.drawable.ic_highlight_merchant_qris : R.drawable.ic_highlight_merchant_normal;
        }
        Location location = new Location("");
        location.setLatitude(shopModel.values);
        location.setLongitude(shopModel.toString);
        GriverDefaultLoadingView griverDefaultLoadingView = nearbyMeActivity.mapHelper;
        String str2 = shopModel.b;
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        String min = GriverDefaultLoadingView.getMin(str2, latLng, drawable, str, i);
        MarkerOptions markerOptions = griverDefaultLoadingView.length.get(min);
        Marker marker2 = null;
        if (markerOptions == null) {
            MarkerOptions position = new MarkerOptions().position(latLng);
            View inflate = ((LayoutInflater) griverDefaultLoadingView.isInside.getSystemService("layout_inflater")).inflate(R.layout.view_custom_marker_highlighted, (ViewGroup) null);
            ((ImageView) inflate.findViewById(R.id.f48442131363398)).setBackgroundResource(i);
            ((ImageView) inflate.findViewById(R.id.f48422131363396)).setImageDrawable(drawable);
            ((TextView) inflate.findViewById(R.id.f65402131365165)).setText(str);
            markerOptions = position.icon(GriverDefaultLoadingView.getMax(onKey.setMax(inflate))).zIndex(0.5f);
            griverDefaultLoadingView.length.put(min, markerOptions);
        }
        GriverDefaultLoadingView griverDefaultLoadingView2 = nearbyMeActivity.mapHelper;
        if (griverDefaultLoadingView2.setMax != null) {
            marker2 = griverDefaultLoadingView2.setMax.addMarker(markerOptions);
        }
        customizeWebViewSettings customizewebviewsettings = new customizeWebViewSettings(shopModel);
        nearbyMeActivity.IsOverlapping = customizewebviewsettings;
        marker2.setTag(customizewebviewsettings);
        nearbyMeActivity.toString = new Pair<>(marker2, marker);
        marker.setVisible(false);
    }

    public void configToolbar() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-235112532, oncanceled);
            onCancelLoad.getMin(-235112532, oncanceled);
        }
        setCenterTitle(getString(R.string.nearby_me_title));
    }

    public void onAttachedToWindow() {
        int max;
        int length;
        int min;
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(1321016327, oncanceled);
            onCancelLoad.getMin(1321016327, oncanceled);
        }
        super.onAttachedToWindow();
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1693119074, oncanceled2);
            onCancelLoad.getMin(-1693119074, oncanceled2);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || -531403318 == (max = dispatchOnCancelled.getMax(context, -531403318)))) {
            onCanceled oncanceled3 = new onCanceled(-531403318, max, 512);
            onCancelLoad.setMax(-531403318, oncanceled3);
            onCancelLoad.getMin(-531403318, oncanceled3);
        }
        ViewGroup.LayoutParams layoutParams = this.viewTooltipSpotlightContainer.getLayoutParams();
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = (int) ((float) displayMetrics.heightPixels);
        int i2 = (i - ((int) (Resources.getSystem().getDisplayMetrics().density * 211.0f))) - ((int) (((float) i) * 0.275f));
        layoutParams.height = i2;
        this.viewTooltipSpotlightContainer.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.viewTooltipSpotlightPointer.getLayoutParams();
        layoutParams2.height = i2 + ((int) (Resources.getSystem().getDisplayMetrics().density * 110.0f));
        this.viewTooltipSpotlightPointer.setLayoutParams(layoutParams2);
        this.presenter.setMin();
    }

    private void getMin() {
        this.presenter.getMin((TitleBarRightButtonView.AnonymousClass1<String>) onLoadChildren.textChanges(this.etNearbySearch).doOnNext(new AppInfosResult(this)).debounce(500, TimeUnit.MILLISECONDS).map(setAppInfos.setMin));
    }

    public void showPromoBottomSheet(List<PromoInfoModel> list) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(748244982, oncanceled);
            onCancelLoad.getMin(748244982, oncanceled);
        }
        PromoListDialogFragment promoListDialogFragment = new PromoListDialogFragment(this);
        promoListDialogFragment.getMax = list;
        promoListDialogFragment.show(getSupportFragmentManager(), "Show Nearby Promo List Dialog");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (currentFocus instanceof EditText) {
                Rect rect = new Rect();
                currentFocus.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    currentFocus.clearFocus();
                    ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private void length(final Marker marker) {
        String str;
        int length;
        int min;
        int length2;
        int min2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min2, 32);
            onCancelLoad.setMax(-2094747216, oncanceled);
            onCancelLoad.getMin(-2094747216, oncanceled);
        }
        if (marker.getTag() instanceof ShopModel) {
            setMin();
            Context baseContext2 = getBaseContext();
            if (baseContext2 != null) {
                context = baseContext2.getApplicationContext();
            }
            if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
                onCanceled oncanceled2 = new onCanceled(length, min, 32);
                onCancelLoad.setMax(2123688476, oncanceled2);
                onCancelLoad.getMin(2123688476, oncanceled2);
            }
            ShopModel shopModel = (ShopModel) marker.getTag();
            updateCornerMarking updatecornermarking = (updateCornerMarking) Glide.setMin((FragmentActivity) this);
            if (shopModel == null || shopModel.hashCode == null) {
                str = "";
            } else {
                str = shopModel.hashCode;
            }
            updatecornermarking.setMax(Popup.getMin(this, str, isLineVisible.length(this, getResources().getDimension(R.dimen.f31862131165919)))).setMin(true).getMax(new parseBehavior<Drawable>() {
                public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
                    return setMax((Drawable) obj);
                }

                public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Drawable> layoutchildwithanchor, boolean z) {
                    NearbyMeActivity.access$1600(NearbyMeActivity.this, new getCategoryInfos(this, marker));
                    return false;
                }

                private boolean setMax(Drawable drawable) {
                    NearbyMeActivity.access$1600(NearbyMeActivity.this, new getSiteName(this, drawable, marker));
                    return true;
                }
            }).setMax(evaluate.setMin).setMax();
        }
    }

    /* access modifiers changed from: private */
    public void setMin() {
        Pair<Marker, Marker> pair = this.toString;
        if (pair != null) {
            if (pair.first != null) {
                ((Marker) this.toString.first).remove();
            }
            if (this.toString.second != null) {
                ((Marker) this.toString.second).setVisible(true);
            }
        }
    }

    private boolean getMin(ShopModel shopModel) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 285086545 == (max = dispatchOnCancelled.getMax(applicationContext, 285086545)))) {
            onCanceled oncanceled = new onCanceled(285086545, max, 512);
            onCancelLoad.setMax(285086545, oncanceled);
            onCancelLoad.getMin(285086545, oncanceled);
        }
        customizeWebViewSettings customizewebviewsettings = this.IsOverlapping;
        return customizewebviewsettings != null && customizewebviewsettings.setMin.equals(shopModel);
    }

    private MarkerOptions getMin(ShopModel shopModel, Drawable drawable, Location location) {
        String str;
        int i;
        int i2;
        int i3;
        GriverDefaultLoadingView griverDefaultLoadingView;
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 2091171138 == (max = dispatchOnCancelled.getMax(applicationContext, 2091171138)))) {
            onCanceled oncanceled = new onCanceled(2091171138, max, 512);
            onCancelLoad.setMax(2091171138, oncanceled);
            onCancelLoad.getMin(2091171138, oncanceled);
        }
        if (this.values.get(shopModel.b) != null) {
            this.values.get(shopModel.b).remove();
        }
        if (this.valueOf.contains(shopModel.b)) {
            griverDefaultLoadingView = this.mapHelper;
            str = shopModel.b;
            i3 = R.layout.view_popular_marker;
            i2 = R.id.f50202131363575;
            i = R.drawable.ic_img_merchant_popular;
        } else if (shopModel.equals()) {
            GriverLoadingDialog griverLoadingDialog = new GriverLoadingDialog(shopModel.b, location, drawable);
            GriverDefaultLoadingView griverDefaultLoadingView2 = this.mapHelper;
            String min = GriverDefaultLoadingView.getMin(griverLoadingDialog.getMin, griverLoadingDialog.length(), griverLoadingDialog.length, String.valueOf(griverLoadingDialog.setMin + griverLoadingDialog.setMax), griverLoadingDialog.isInside);
            MarkerOptions markerOptions = griverDefaultLoadingView2.getMax.get(min);
            if (markerOptions != null) {
                return markerOptions;
            }
            MarkerOptions position = new MarkerOptions().position(griverLoadingDialog.length());
            Context context = griverDefaultLoadingView2.isInside;
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            int i4 = griverLoadingDialog.setMax;
            Drawable drawable2 = griverLoadingDialog.length;
            int i5 = griverLoadingDialog.setMin;
            int i6 = griverLoadingDialog.isInside;
            View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i4, (ViewGroup) null);
            ((LottieAnimationView) inflate.findViewById(R.id.f48432131363397)).setBackgroundResource(i6);
            ((ImageView) inflate.findViewById(i5)).setImageDrawable(drawable2);
            Bitmap max2 = onKey.setMax(inflate);
            Intrinsics.checkNotNullExpressionValue(max2, "CustomMarkerUtils\n      …loadedLayout, background)");
            MarkerOptions zIndex = position.icon(BitmapDescriptorFactory.fromBitmap(max2)).zIndex(griverLoadingDialog.getMax);
            griverDefaultLoadingView2.getMax.put(min, zIndex);
            return zIndex;
        } else {
            griverDefaultLoadingView = this.mapHelper;
            String str2 = shopModel.b;
            if ("216620000020928274717".equals(shopModel.Grayscale$Algorithm)) {
                str = str2;
                i3 = R.layout.view_custom_marker;
                i2 = R.id.f48452131363399;
                i = R.drawable.ic_img_merchant_non;
            } else {
                str = str2;
                i3 = R.layout.view_custom_marker;
                i2 = R.id.f48452131363399;
                i = R.drawable.ic_img_merchant_normal;
            }
        }
        LatLng min2 = WheelView.ScrollerTask.setMin(location);
        String min3 = GriverDefaultLoadingView.getMin(str, min2, drawable, String.valueOf(i3 + i2), i);
        MarkerOptions markerOptions2 = griverDefaultLoadingView.getMin.get(min3);
        if (markerOptions2 != null) {
            return markerOptions2;
        }
        MarkerOptions position2 = new MarkerOptions().position(min2);
        View inflate2 = ((LayoutInflater) griverDefaultLoadingView.isInside.getSystemService("layout_inflater")).inflate(i3, (ViewGroup) null);
        ((ImageView) inflate2.findViewById(R.id.f48432131363397)).setBackgroundResource(i);
        ((ImageView) inflate2.findViewById(i2)).setImageDrawable(drawable);
        MarkerOptions zIndex2 = position2.icon(BitmapDescriptorFactory.fromBitmap(onKey.setMax(inflate2))).zIndex(0.1f);
        griverDefaultLoadingView.getMin.put(min3, zIndex2);
        return zIndex2;
    }

    public void onMapReady(GoogleMap googleMap) {
        int length;
        int min;
        int length2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1477162693, oncanceled);
            onCancelLoad.getMin(-1477162693, oncanceled);
        }
        this.mapHelper.setMax(googleMap, (GoogleMap.OnMarkerClickListener) this);
        getMax();
        googleMap.setOnCameraMoveListener(new getReleaseVersion(this));
        googleMap.setOnCameraIdleListener(new setIntroduction(this));
        googleMap.setOnCameraMoveStartedListener(new setTotalCount(this));
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1884614517, oncanceled2);
            onCancelLoad.getMin(1884614517, oncanceled2);
        }
        Location location = new Location("");
        location.setLatitude(-6.17476d);
        location.setLongitude(106.827072d);
        this.toIntRange = location;
        if (WheelView.ScrollerTask.length(this)) {
            if (this.invoke == null) {
                toIntRange();
            }
            this.invoke.setMin();
        }
    }

    private void getMax() {
        if (this.hashCode) {
            this.hashCode = false;
        } else if (this.lavMapCenterPinPoint.getVisibility() == 0) {
            this.lavMapCenterPinPoint.setVisibility(8);
        }
    }

    private void setMax() {
        PinMapLottieAnimationView pinMapLottieAnimationView = this.lavMapCenterPinPoint;
        pinMapLottieAnimationView.setMinFrame(pinMapLottieAnimationView.getPutDownMinFrame());
        PinMapLottieAnimationView pinMapLottieAnimationView2 = this.lavMapCenterPinPoint;
        pinMapLottieAnimationView2.setMaxFrame(pinMapLottieAnimationView2.getPutDownMaxFrame());
        this.lavMapCenterPinPoint.playAnimation();
    }

    private void getMin(BottomSheetBehavior bottomSheetBehavior) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1057638854 == (max = dispatchOnCancelled.getMax(applicationContext, 1057638854)))) {
            onCanceled oncanceled = new onCanceled(1057638854, max, 512);
            onCancelLoad.setMax(1057638854, oncanceled);
            onCancelLoad.getMin(1057638854, oncanceled);
        }
        bottomSheetBehavior.setState(4);
    }

    public void showShimmerNearbyLocation() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-831329645, oncanceled);
            onCancelLoad.getMin(-831329645, oncanceled);
        }
        if (this.setMax.getState() != 3) {
            if (this.ICustomTabsCallback == null) {
                this.ICustomTabsCallback = containsFavoriteMenuItem.getMin(this.clLocationContainer, R.layout.view_skeleton_nearby_location);
            }
            this.ICustomTabsCallback.getMin();
        }
    }

    /* access modifiers changed from: private */
    public void getMin(String str) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Animation animation = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-608869665, oncanceled);
            onCancelLoad.getMin(-608869665, oncanceled);
        }
        this.create = str;
        int i = 0;
        this.tvSearchHere.setVisibility("ERROR".equals(str) && length() ? 0 : 8);
        this.tvRefreshing.setVisibility(RefreshCondition.REFRESHING.equals(str) ? 0 : 8);
        ImageView imageView = this.ivLoader;
        if (!RefreshCondition.REFRESHING.equals(str)) {
            i = 8;
        }
        imageView.setVisibility(i);
        ImageView imageView2 = this.ivLoader;
        if (RefreshCondition.REFRESHING.equals(str)) {
            animation = this.Grayscale$Algorithm;
        }
        imageView2.setAnimation(animation);
    }

    private boolean equals() {
        return (this.lavMapCenterPinPoint.getMaxFrame() == ((float) this.lavMapCenterPinPoint.getPullOutMaxFrame()) || this.lavMapCenterPinPoint.getMinFrame() == ((float) this.lavMapCenterPinPoint.getPullOutMinFrame())) ? false : true;
    }

    private void toFloatRange() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-463824996, oncanceled);
            onCancelLoad.getMin(-463824996, oncanceled);
        }
        GriverProgressBar.UpdateRunnable updateRunnable = this.FastBitmap$CoordinateSystem;
        if (updateRunnable != null) {
            updateRunnable.dispose();
            this.FastBitmap$CoordinateSystem = null;
        }
    }

    private void isInside() {
        LatLng latLng;
        int max;
        if (this.equals) {
            if (this.setMax.getState() != 3) {
                showShimmerNearbyLocation();
            }
            setTextSpacing.setMin setmin = this.presenter;
            Context baseContext = getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || -1343556596 == (max = dispatchOnCancelled.getMax(applicationContext, -1343556596)))) {
                onCanceled oncanceled = new onCanceled(-1343556596, max, 512);
                onCancelLoad.setMax(-1343556596, oncanceled);
                onCancelLoad.getMin(-1343556596, oncanceled);
            }
            Location location = this.b;
            if (location == null) {
                location = this.toIntRange;
            }
            setmin.getMax(location);
            this.equals = false;
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(991387754, oncanceled2);
            onCancelLoad.getMin(991387754, oncanceled2);
        }
        IsOverlapping();
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        Location location2 = this.b;
        if (location2 == null) {
            location2 = this.toIntRange;
        }
        if (location2 != null) {
            latLng = new LatLng(location2.getLatitude(), location2.getLongitude());
        } else {
            latLng = new LatLng(-6.17476d, 106.827072d);
        }
        if (griverDefaultLoadingView.setMax != null) {
            griverDefaultLoadingView.setMax.animateCamera(GriverDefaultLoadingView.setMax(latLng, 15.0f));
        }
        Location location3 = this.b;
        if (location3 == null) {
            Location location4 = this.toIntRange;
            if (location4 != null) {
                this.presenter.setMax(location4, 3000, true);
                return;
            }
            return;
        }
        if (location3 != null) {
            this.presenter.setMax(location3, 3000, false);
        }
        this.b = null;
    }

    private void toIntRange() {
        setStateOn.getMin getmin = new setStateOn.getMin((Activity) this);
        getmin.length.add("android.permission.ACCESS_FINE_LOCATION");
        getmin.getMax = new setStateOn.length() {
            public final void getMin(setStateOn.setMin setmin) {
                BlurProcess.getMin(NearbyMeActivity.this.getApplicationContext(), true);
                NearbyMeActivity.access$2000(NearbyMeActivity.this);
            }

            public final void setMin(setStateOn.setMin setmin) {
                BlurProcess.getMin(NearbyMeActivity.this.getApplicationContext(), false);
                NearbyMeActivity.this.finish();
            }
        };
        this.invoke = new setStateOn(getmin, (byte) 0);
    }

    /* access modifiers changed from: protected */
    @OnClick({2131362648})
    public void onGoToMyLocationClicked() {
        LatLng latLng;
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -105162021 == (max = dispatchOnCancelled.getMax(applicationContext, -105162021)))) {
            onCanceled oncanceled = new onCanceled(-105162021, max, 512);
            onCancelLoad.setMax(-105162021, oncanceled);
            onCancelLoad.getMin(-105162021, oncanceled);
        }
        if (this.toIntRange != null) {
            getMax();
            GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
            Location location = this.toIntRange;
            if (location != null) {
                latLng = new LatLng(location.getLatitude(), location.getLongitude());
            } else {
                latLng = new LatLng(-6.17476d, 106.827072d);
            }
            if (griverDefaultLoadingView.setMax != null) {
                griverDefaultLoadingView.setMax.animateCamera(GriverDefaultLoadingView.setMax(latLng, 15.0f));
            }
        }
        CardView cardView = this.cvGoToMyLocation;
        if (cardView != null) {
            cardView.setVisibility(8);
        }
        ((getCreateDate) getSupportFragmentManager().findFragmentById(R.id.f54312131363989)).setMin = false;
    }

    /* access modifiers changed from: protected */
    @OnClick({2131362650})
    public void onInfoLegendaryClicked() {
        if (this.setMax.getState() == 6) {
            this.setMax.setState(4);
            this.getCause = true;
            return;
        }
        getMax(setMin((View) this.cvInfoLegendary));
    }

    /* access modifiers changed from: private */
    public void getMax(setUseAmcsLite setuseamcslite) {
        onDrag ondrag = new onDrag(this);
        ondrag.toString = setuseamcslite;
        ((initRect) ((initRect) ((initRect) ((initRect) ondrag.setMin((int) R.color.f24892131100460)).length(true)).length(getMax)).setMin((PhotoView.FlingRunnable) new PhotoView.FlingRunnable() {
            public final void onTargetSelected(int i) {
            }

            public final void onStarted() {
                NearbyMeActivity.this.ivInfo.setVisibility(8);
                NearbyMeActivity.this.ivClose.setVisibility(0);
            }

            public final void onFinished(int i) {
                int max = dispatchOnCancelled.setMax(i);
                if (i != max) {
                    onCanceled oncanceled = new onCanceled(i, max, 1);
                    onCancelLoad.setMax(-709706396, oncanceled);
                    onCancelLoad.getMin(-709706396, oncanceled);
                }
                NearbyMeActivity.this.ivInfo.setVisibility(0);
                NearbyMeActivity.this.ivClose.setVisibility(8);
            }
        })).length();
    }

    /* access modifiers changed from: private */
    public setUseAmcsLite setMin(View view) {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1960024873, oncanceled);
            onCancelLoad.getMin(1960024873, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1960024873, oncanceled2);
            onCancelLoad.getMin(1960024873, oncanceled2);
        }
        return ((setUseSecurityGuard) ((setUseSecurityGuard) new setUseSecurityGuard(this).getMax(view)).setMin(new getUseSecurityGuard((float) getMin))).getMin();
    }

    private setUseAmcsLite getMin(View view, int i, int i2, boolean z) {
        int length;
        int min;
        int min2;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1716053256 == (max = dispatchOnCancelled.getMax(applicationContext, 1716053256)))) {
            onCanceled oncanceled = new onCanceled(1716053256, max, 512);
            onCancelLoad.setMax(1716053256, oncanceled);
            onCancelLoad.getMin(1716053256, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || i == (min2 = dispatchOnCancelled.setMin(applicationContext2, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min2, 8);
            onCancelLoad.setMax(-1194750705, oncanceled2);
            onCancelLoad.getMin(-1194750705, oncanceled2);
        }
        setUseSecurityGuard setusesecurityguard = (setUseSecurityGuard) new setUseSecurityGuard(this).getMax(view);
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1544043389, oncanceled3);
            onCancelLoad.getMin(1544043389, oncanceled3);
        }
        if (z) {
            view = this.viewTooltipSpotlightContainer;
        }
        return ((setUseSecurityGuard) ((setUseSecurityGuard) setusesecurityguard.setMin(new getUseAmcsLite(view, 20.0f, 20.0f, 10, 10, 10, 10))).getMin(new access$1402(getString(i), getString(i2), 0))).getMin();
    }

    /* access modifiers changed from: protected */
    @OnClick({2131362179})
    public void onButtonBackClicked() {
        super.onBackPressed();
    }

    public boolean onMarkerClick(Marker marker) {
        if (marker.getTag() instanceof ShopModel) {
            getMax();
            getMin(this.setMax);
            if (marker.getTag() instanceof ShopModel) {
                ShopModel shopModel = (ShopModel) marker.getTag();
                Location location = new Location("");
                location.setLatitude(shopModel.values);
                location.setLongitude(shopModel.toString);
                GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
                LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
                if (griverDefaultLoadingView.setMax != null) {
                    griverDefaultLoadingView.setMax.animateCamera(GriverDefaultLoadingView.setMax(latLng, 17.0f));
                }
            }
            this.toDoubleRange = true;
            length(marker);
        } else if ((marker.getTag() instanceof customizeWebViewSettings) && this.toString != null) {
            customizeWebViewSettings customizewebviewsettings = (customizeWebViewSettings) marker.getTag();
            if (!setMin(((Marker) this.toString.first).getTag(), customizewebviewsettings)) {
                setMin(((Marker) this.toString.second).getTag(), customizewebviewsettings);
            }
        }
        return true;
    }

    private boolean setMin(Object obj, customizeWebViewSettings customizewebviewsettings) {
        ShopModel shopModel;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-2112071864, oncanceled);
            onCancelLoad.getMin(-2112071864, oncanceled);
        }
        if (customizewebviewsettings == null || !(obj instanceof ShopModel) || customizewebviewsettings.setMin != (shopModel = (ShopModel) obj)) {
            return false;
        }
        MerchantDetailActivity.setMin setmin = MerchantDetailActivity.Companion;
        MerchantDetailActivity.setMin.setMax(this, shopModel, TrackerKey.SourceType.NEARBY_MAPS);
        return true;
    }

    /* access modifiers changed from: protected */
    @OnClick({2131365536})
    public void onRefreshMerchantClicked() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-641452664, oncanceled);
            onCancelLoad.getMin(-641452664, oncanceled);
        }
        getMin(RefreshCondition.REFRESHING);
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        if (griverDefaultLoadingView.setMax != null) {
            griverDefaultLoadingView.setMax.clear();
        }
        this.values.clear();
        Location location = null;
        this.toString = null;
        IsOverlapping();
        getMax();
        this.merchantListView.clearPreSelectedCategory();
        GriverDefaultLoadingView griverDefaultLoadingView2 = this.mapHelper;
        if (griverDefaultLoadingView2.setMax != null) {
            LatLng latLng = griverDefaultLoadingView2.setMax.getCameraPosition().target;
            double d = latLng.latitude;
            double d2 = latLng.longitude;
            location = new Location("");
            location.setLatitude(d);
            location.setLongitude(d2);
        }
        if (location != null) {
            this.presenter.setMax(location, 3000, false);
        }
        this.setMax.setState(6);
    }

    private void IsOverlapping() {
        Location location = this.toIntRange;
        if (location != null) {
            Marker marker = null;
            MarkerOptions min = this.mapHelper.setMin(location, (Drawable) null);
            GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
            if (griverDefaultLoadingView.setMax != null) {
                marker = griverDefaultLoadingView.setMax.addMarker(min);
            }
            this.invokeSuspend = marker;
            GriverDefaultLoadingView griverDefaultLoadingView2 = this.mapHelper;
            if (marker != null) {
                float f = griverDefaultLoadingView2.setMax != null ? griverDefaultLoadingView2.setMax.getCameraPosition().zoom / 30.0f : 0.0f;
                marker.setAnchor(f, f);
            }
        }
    }

    /* access modifiers changed from: protected */
    @OnClick({2131363385})
    public void onIvClearClicked() {
        this.etNearbySearch.getText().clear();
        this.setMax.setState(4);
    }

    /* access modifiers changed from: protected */
    @OnClick({2131365138})
    public void onTvChangeClicked() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1467491731, oncanceled);
            onCancelLoad.getMin(1467491731, oncanceled);
        }
        this.setMax.setState(3);
    }

    /* access modifiers changed from: protected */
    @OnClick({2131365619})
    public void onTextSwipeUpClicked() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -97795111 == (max = dispatchOnCancelled.getMax(applicationContext, -97795111)))) {
            onCanceled oncanceled = new onCanceled(-97795111, max, 512);
            onCancelLoad.setMax(-97795111, oncanceled);
            onCancelLoad.getMin(-97795111, oncanceled);
        }
        if (length(this.setMax)) {
            this.setMax.setState(3);
        } else {
            getMin(this.setMax);
        }
    }

    private static boolean length(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.getState() == 4;
    }

    /* access modifiers changed from: protected */
    @OnTouch({2131362827})
    public boolean onTextSearchTouched(View view, MotionEvent motionEvent) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-906969778, oncanceled);
            onCancelLoad.getMin(-906969778, oncanceled);
        }
        if (1 != motionEvent.getAction()) {
            return false;
        }
        hideShimmerNearbyLocation();
        this.Mean$Arithmetic = true;
        this.setMax.setState(3);
        this.merchantListView.displayLocationMerchantSearchView();
        return false;
    }

    public void hideShimmerNearbyLocation() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.ICustomTabsCallback;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    /* access modifiers changed from: private */
    public void values() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1862217252, oncanceled);
            onCancelLoad.getMin(1862217252, oncanceled);
        }
        BottomSheetBehavior from = BottomSheetBehavior.from(this.cvMerchant);
        this.setMax = from;
        from.setPeekHeight(getResources().getDimensionPixelSize(R.dimen.f31882131165922));
        this.setMax.setHideable(false);
        this.setMax.setFitToContents(false);
        this.setMax.setHalfExpandedRatio(0.4f);
        this.setMax.setState(6);
        this.setMax.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            public final void onStateChanged(@NonNull View view, int i) {
                if (i == 1) {
                    NearbyMeActivity.this.tvDistrictLocation.setVisibility(8);
                    NearbyMeActivity.this.tvChangeLocation.setVisibility(8);
                    NearbyMeActivity.this.merchantListView.showSpacer(false);
                } else if (i == 6) {
                    boolean unused = NearbyMeActivity.this.toDoubleRange = false;
                    NearbyMeActivity.this.merchantListView.showSpacer(false);
                    setOnWheelViewListener.getMax((Activity) NearbyMeActivity.this);
                    NearbyMeActivity.access$2400(NearbyMeActivity.this);
                    NearbyMeActivity.this.clLocationContainer.setVisibility(0);
                    NearbyMeActivity.this.tvDistrictLocation.setVisibility(8);
                    NearbyMeActivity.this.tvChangeLocation.setVisibility(8);
                    NearbyMeActivity.this.merchantListView.resetLocationMerchantSearchView();
                    NearbyMeActivity.this.setMin();
                } else if (i == 3) {
                    boolean unused2 = NearbyMeActivity.this.toDoubleRange = false;
                    NearbyMeActivity.this.merchantListView.showSpacer(false);
                    NearbyMeActivity.this.clLocationContainer.setVisibility(8);
                    NearbyMeActivity.this.tvDistrictLocation.setVisibility(0);
                    NearbyMeActivity.this.tvChangeLocation.setVisibility(0);
                    NearbyMeActivity.this.setMax(1.0f);
                    NearbyMeActivity.this.hideShimmerNearbyLocation();
                    NearbyMeActivity.this.setMin();
                } else if (i == 4) {
                    NearbyMeActivity.this.merchantListView.showSpacer(true);
                    setOnWheelViewListener.getMax((Activity) NearbyMeActivity.this);
                    NearbyMeActivity.access$2400(NearbyMeActivity.this);
                    NearbyMeActivity.this.clLocationContainer.setVisibility(0);
                    NearbyMeActivity.this.tvDistrictLocation.setVisibility(8);
                    NearbyMeActivity.this.tvChangeLocation.setVisibility(8);
                    NearbyMeActivity.this.merchantListView.resetLocationMerchantSearchView();
                    boolean unused3 = NearbyMeActivity.this.Mean$Arithmetic = false;
                    if (NearbyMeActivity.this.isInside) {
                        NearbyMeActivity.access$900(NearbyMeActivity.this);
                    }
                    if (NearbyMeActivity.this.getCause) {
                        NearbyMeActivity nearbyMeActivity = NearbyMeActivity.this;
                        nearbyMeActivity.getMax(nearbyMeActivity.setMin((View) nearbyMeActivity.cvInfoLegendary));
                        boolean unused4 = NearbyMeActivity.this.getCause = false;
                    }
                }
            }

            public final void onSlide(@NonNull View view, float f) {
                if (NearbyMeActivity.getMin(f)) {
                    NearbyMeActivity.this.clLocationContainer.setVisibility(8);
                    NearbyMeActivity.this.setMax(f);
                    NearbyMeActivity.this.hideShimmerNearbyLocation();
                }
            }
        });
    }

    private boolean setMax(String str) {
        HashMap<String, Marker> hashMap = this.values;
        return (hashMap == null || hashMap.isEmpty() || this.values.get(str) == null) ? false : true;
    }

    private void length(List<ShopModel> list) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -464420318 == (max = dispatchOnCancelled.getMax(applicationContext, -464420318)))) {
            onCanceled oncanceled = new onCanceled(-464420318, max, 512);
            onCancelLoad.setMax(-464420318, oncanceled);
            onCancelLoad.getMin(-464420318, oncanceled);
        }
        this.merchantListView.setMerchantList(list);
    }

    public void onBackPressed() {
        if (this.setMax.getState() == 3) {
            this.setMax.setState(4);
        } else {
            super.onBackPressed();
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int length;
        int min;
        int min2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min2 = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min2, 8);
            onCancelLoad.setMax(-1009981378, oncanceled);
            onCancelLoad.getMin(-1009981378, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1009981378, oncanceled2);
            onCancelLoad.getMin(-1009981378, oncanceled2);
        }
        setStateOn setstateon = this.invoke;
        if (setstateon != null && setstateon.getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    @OnClick({2131365327, 2131365138, 2131365139})
    public void onLocationSearchClicked() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1253031378, oncanceled);
            onCancelLoad.getMin(1253031378, oncanceled);
        }
        this.Mean$Arithmetic = true;
        this.setMax.setState(3);
        this.merchantListView.displayLocationSearchView();
    }

    public void init() {
        int length;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1667432507, oncanceled);
            onCancelLoad.getMin(-1667432507, oncanceled);
        }
        onNotInstalled.getMin getmin = new onNotInstalled.getMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        Context context = null;
        if (applicationComponent != null) {
            getmin.getMax = applicationComponent;
            getmin.setMin = new NearbyMeModule(new setTextSpacing.getMin() {
                public final void dismissProgress() {
                }

                public final void getMax(boolean z) {
                }

                public final void getMin(List<ShopModel> list) {
                }

                public final void getMin(a.C0056a aVar) {
                }

                public final void getMin(boolean z) {
                }

                public final void setMin(List<ShopModel> list, boolean z) {
                }

                public final void setMin(GriverCommonResourceProxy griverCommonResourceProxy) {
                }

                public final void length(List<ShopModel> list) {
                    NearbyMeActivity.access$000(NearbyMeActivity.this);
                    NearbyMeActivity.access$100(NearbyMeActivity.this, list);
                    if (!"ERROR".equals(NearbyMeActivity.this.create)) {
                        NearbyMeActivity.this.getMin(RefreshCondition.FETCHED);
                    }
                    NearbyMeActivity.this.nearbyMerchantLocationSearchView.setShopModels(list);
                    NearbyMeActivity.access$400(NearbyMeActivity.this, list);
                }

                public final void getMax(List<ShopModel> list) {
                    NearbyMeActivity.this.merchantListView.updateShopModelsWithPromo(list, new DeployAppInfo(NearbyMeActivity.this));
                }

                public final void setMin(boolean z) {
                    if (z) {
                        NearbyMeActivity nearbyMeActivity = NearbyMeActivity.this;
                        NearbyMeActivity.access$600(nearbyMeActivity, NearbyMeActivity.access$500(nearbyMeActivity));
                    }
                }

                public final void getMax(String str) {
                    NearbyMeActivity.this.hideShimmerNearbyLocation();
                    NearbyMeActivity.access$700(NearbyMeActivity.this, str);
                }

                public final void showProgress() {
                    if (!NearbyMeActivity.this.Mean$Arithmetic) {
                        NearbyMeActivity.access$900(NearbyMeActivity.this);
                    } else {
                        NearbyMeActivity.this.merchantListView.hideShimmerMerchantList();
                    }
                    boolean unused = NearbyMeActivity.this.isInside = true;
                }

                public final void onError(String str) {
                    NearbyMeActivity.this.merchantListView.setMerchantList(new ArrayList());
                    NearbyMeActivity.this.getMin("ERROR");
                    NearbyMeActivity.access$000(NearbyMeActivity.this);
                }
            });
            stopIgnoring.setMin(getmin.setMin, NearbyMeModule.class);
            stopIgnoring.setMin(getmin.getMax, PrepareException.AnonymousClass1.class);
            new onNotInstalled(getmin.setMin, getmin.getMax, (byte) 0).setMax(this);
            registerPresenter(this.presenter);
            setMenuLeftButton((int) R.drawable.btn_arrow_left);
            SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.f54312131363989);
            if (supportMapFragment != null) {
                supportMapFragment.getMapAsync(this);
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.f732130772045);
            this.Grayscale$Algorithm = loadAnimation;
            loadAnimation.setInterpolator(new LinearInterpolator());
            this.merchantListView.setOnHomeShoppingClickListener(new convertAppInfos(this, new AppInfo(this)));
            this.merchantListView.setOnCategoryCheckedListener(new getAppIdList() {
                @JvmDefault
                public final void length(@NotNull List<g.AnonymousClass1> list, boolean z) {
                    Intrinsics.checkNotNullParameter(list, "checkedCategories");
                }

                public final void onMulitpleCategorySelected(@NotNull List<g.AnonymousClass1> list) {
                    NearbyMeActivity.this.presenter.getMax(list);
                }

                public final void onCategoryClick(@NotNull g.AnonymousClass1 r2) {
                    NearbyMeActivity.this.nearbyAnalyticTracker.length(r2.getMin);
                }
            });
            this.merchantListView.setOnMerchantClickListener(new CategoryInfo(this, new setIdentifier(this)));
            this.merchantListView.setOnPromoRibbonClickListener(new getIntroduction(this));
            this.merchantListView.setOnTopUpButtonClickListener(new getAppInfos(this));
            this.merchantListView.setOnOtherStoreButtonClickListener(new getCategory(this, new setReleaseVersion(this)));
            values();
            getMin();
            this.nearbyMerchantLocationSearchView.setLocationListener(new AppCategory(this));
            this.nearbyMerchantLocationSearchView.setOnHomeShoppingClickListener(new convertAppInfos(this, new convertAppInfo(this)));
            this.nearbyMerchantLocationSearchView.setMerchantListener(new CategoryInfo(this, new getTotalCount(this)));
            this.nearbyMerchantLocationSearchView.setOnOtherStoreButtonClickListener(new getCategory(this, new getCategories(this)));
            this.nearbyMerchantLocationSearchView.setOnTopUpButtonClickListener(new getAppInfos(this));
            this.nearbyMerchantLocationSearchView.setOnPromoRibbonClickListener(new getIntroduction(this));
            Bundle extras = getIntent().getExtras();
            if (extras != null && TextUtils.isEmpty(extras.getString("EXTRA_SHOP_ID", ""))) {
                String stringExtra = getIntent().getStringExtra(EXTRA_SEARCH_KEYWORD);
                getIntent().removeExtra(EXTRA_SEARCH_KEYWORD);
                Context baseContext = getBaseContext();
                if (baseContext != null) {
                    context = baseContext.getApplicationContext();
                }
                if (!(context == null || (length = dispatchOnCancelled.length(context, 0)) == 0)) {
                    onCanceled oncanceled2 = new onCanceled(0, length, 4);
                    onCancelLoad.setMax(-387021046, oncanceled2);
                    onCancelLoad.getMin(-387021046, oncanceled2);
                }
                if (!TextUtils.isEmpty(stringExtra)) {
                    this.etNearbySearch.setText(stringExtra);
                    this.setMax.setState(3);
                    this.clLocationContainer.setVisibility(8);
                    this.tvDistrictLocation.setVisibility(0);
                    this.tvChangeLocation.setVisibility(0);
                    setMax(1.0f);
                    hideShimmerNearbyLocation();
                }
                setTextSpacing.setMin setmin = this.presenter;
                String stringExtra2 = getIntent().getStringExtra("EXTRA_MERCHANT_ID");
                getIntent().removeExtra("EXTRA_MERCHANT_ID");
                setmin.length(stringExtra2);
                String stringExtra3 = getIntent().getStringExtra(EXTRA_CATEGORY);
                getIntent().removeExtra(EXTRA_CATEGORY);
                if (this.merchantListView != null && !TextUtils.isEmpty(stringExtra3)) {
                    this.merchantListView.setPreSelectedCategoryId(stringExtra3);
                    g.AnonymousClass1 cateoriesById = this.merchantListView.getCateoriesById(stringExtra3);
                    if (cateoriesById != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(cateoriesById);
                        this.presenter.getMax((List<g.AnonymousClass1>) arrayList);
                    }
                    if (MerchantViewType.MERCHANT_CAT_TOP_UP_AGENT.equals(stringExtra3)) {
                        this.merchantListView.forceHideCategory();
                    }
                }
                double d = extras.getDouble(EXTRA_LOCATION_LAT);
                double d2 = extras.getDouble(EXTRA_LOCATION_LON);
                if (!(d == 0.0d || d2 == 0.0d)) {
                    Location location = new Location("");
                    location.setLatitude(d);
                    location.setLongitude(d2);
                    this.b = location;
                }
            }
            int max2 = dispatchOnCancelled.getMax(0);
            if (max2 != 0) {
                onCanceled oncanceled3 = new onCanceled(0, max2, 16);
                onCancelLoad.setMax(1612630651, oncanceled3);
                onCancelLoad.getMin(1612630651, oncanceled3);
            }
            if (getIntent().getExtras() != null) {
                String stringExtra4 = getIntent().getStringExtra("EXTRA_SOURCE");
                getIntent().removeExtra("EXTRA_SOURCE");
                if (stringExtra4 != null) {
                    this.nearbyAnalyticTracker.setMax(stringExtra4);
                }
            }
            this.presenter.setMin(false);
            this.presenter.toIntRange();
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    public void setMax(float f) {
        float f2 = 0.0f;
        if (f < 1.0f && f >= 0.0f) {
            f2 = (1.0f - f) * ((float) ((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f)));
        }
        CardView cardView = this.cvMerchant;
        if (cardView != null) {
            cardView.setRadius(f2);
            this.cvMerchant.requestLayout();
        }
    }

    private void getMax(List<ShopModel> list) {
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        if (griverDefaultLoadingView.setMax != null) {
            griverDefaultLoadingView.setMax.clear();
        }
        this.values.clear();
        this.toString = null;
        IsOverlapping();
        this.valueOf.clear();
        for (int i = 0; i < list.size(); i++) {
            final ShopModel shopModel = list.get(i);
            if (i < 3) {
                this.valueOf.add(shopModel.b);
            }
            double d = shopModel.values;
            double d2 = shopModel.toString;
            final Location location = new Location("");
            location.setLatitude(d);
            location.setLongitude(d2);
            GriverDefaultLoadingView griverDefaultLoadingView2 = this.mapHelper;
            if (griverDefaultLoadingView2.setMin == null) {
                griverDefaultLoadingView2.setMin = BitmapDescriptorFactory.fromBitmap(onKey.setMax(((LayoutInflater) griverDefaultLoadingView2.isInside.getSystemService("layout_inflater")).inflate(R.layout.view_custom_marker, (ViewGroup) null)));
            }
            MarkerOptions zIndex = new MarkerOptions().position(WheelView.ScrollerTask.setMin(location)).icon(griverDefaultLoadingView2.setMin).zIndex(0.1f);
            GriverDefaultLoadingView griverDefaultLoadingView3 = this.mapHelper;
            this.values.put(shopModel.b, griverDefaultLoadingView3.setMax != null ? griverDefaultLoadingView3.setMax.addMarker(zIndex) : null);
            length(shopModel, (parseBehavior<Drawable>) new parseBehavior<Drawable>() {
                public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
                    return setMin((Drawable) obj);
                }

                public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Drawable> layoutchildwithanchor, boolean z) {
                    NearbyMeActivity.access$1600(NearbyMeActivity.this, new setCategoryId(this, shopModel, location));
                    return false;
                }

                private boolean setMin(Drawable drawable) {
                    NearbyMeActivity.access$1600(NearbyMeActivity.this, new setCategory(this, shopModel, drawable, location));
                    return true;
                }
            });
        }
    }

    private void length(ShopModel shopModel, parseBehavior<Drawable> parsebehavior) {
        String str;
        updateCornerMarking updatecornermarking = (updateCornerMarking) Glide.setMin((FragmentActivity) this);
        if (shopModel == null || shopModel.hashCode == null) {
            str = "";
        } else {
            str = shopModel.hashCode;
        }
        updatecornermarking.setMax(Popup.getMin(this, str, isLineVisible.length(this, getResources().getDimension(R.dimen.f31862131165919)))).getMax(parsebehavior).setMax(evaluate.setMin).setMax();
    }

    private Marker setMin(MarkerOptions markerOptions, ShopModel shopModel) {
        GriverDefaultLoadingView griverDefaultLoadingView = this.mapHelper;
        Marker addMarker = griverDefaultLoadingView.setMax != null ? griverDefaultLoadingView.setMax.addMarker(markerOptions) : null;
        addMarker.setTag(shopModel);
        this.values.put(shopModel.b, addMarker);
        return addMarker;
    }

    private boolean length() {
        getCreateDate getcreatedate = (getCreateDate) getSupportFragmentManager().findFragmentById(R.id.f54312131363989);
        return getcreatedate != null && getcreatedate.setMin();
    }

    static /* synthetic */ void access$000(NearbyMeActivity nearbyMeActivity) {
        if (nearbyMeActivity.isInside) {
            nearbyMeActivity.merchantListView.hideShimmerMerchantList();
            nearbyMeActivity.isInside = false;
        }
    }

    static /* synthetic */ void access$100(NearbyMeActivity nearbyMeActivity, List list) {
        if (nearbyMeActivity.presenter.getMax() == null) {
            nearbyMeActivity.presenter.getMin((List<ShopModel>) list);
            nearbyMeActivity.getMax((List<ShopModel>) list);
            nearbyMeActivity.length((List<ShopModel>) list);
            return;
        }
        nearbyMeActivity.presenter.setMax((List<ShopModel>) list);
        nearbyMeActivity.getMax((List<ShopModel>) list);
        setTextSpacing.setMin setmin = nearbyMeActivity.presenter;
        nearbyMeActivity.length(setmin.length(list, setmin.getMax()));
        nearbyMeActivity.presenter.length((String) null);
        nearbyMeActivity.setMax.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            public final void onSlide(@NonNull View view, float f) {
            }

            public final void onStateChanged(@NonNull View view, int i) {
                if (i == 4) {
                    NearbyMeActivity.this.etNearbySearch.getText().clear();
                    NearbyMeActivity.access$1200(NearbyMeActivity.this);
                    NearbyMeActivity.this.values();
                }
            }
        });
    }

    static /* synthetic */ void access$400(NearbyMeActivity nearbyMeActivity, List list) {
        if (!list.isEmpty()) {
            nearbyMeActivity.presenter.setMin((List<ShopModel>) list);
        }
    }

    static /* synthetic */ List access$500(NearbyMeActivity nearbyMeActivity) {
        ArrayList arrayList = new ArrayList();
        TextView textView = nearbyMeActivity.tvLocation;
        if (!(textView == null || nearbyMeActivity.cvInfoLegendary == null || nearbyMeActivity.viewTooltipSpotlightPointer == null || nearbyMeActivity.cvMerchant == null)) {
            arrayList.add(nearbyMeActivity.getMin(textView, R.string.tooltip_onboarding_mapview_title_first, R.string.tooltip_onboarding_mapview_desc_first, false));
            arrayList.add(nearbyMeActivity.getMin(nearbyMeActivity.viewTooltipSpotlightPointer, R.string.tooltip_onboarding_mapview_title_second, R.string.tooltip_onboarding_mapview_desc_second, true));
            arrayList.add(nearbyMeActivity.getMin(nearbyMeActivity.cvInfoLegendary, R.string.tooltip_onboarding_mapview_title_third, R.string.tooltip_onboarding_mapview_desc_third, false));
            arrayList.add(nearbyMeActivity.getMin(nearbyMeActivity.cvMerchant, R.string.tooltip_onboarding_mapview_title_fourth, R.string.tooltip_onboarding_mapview_desc_fourth, false));
        }
        return arrayList;
    }

    static /* synthetic */ void access$600(NearbyMeActivity nearbyMeActivity, List list) {
        if (!list.isEmpty() && nearbyMeActivity.onNavigationEvent == null) {
            PhotoView.GridDetector gridDetector = new PhotoView.GridDetector(nearbyMeActivity);
            gridDetector.values = list;
            nearbyMeActivity.onNavigationEvent = ((PhotoView.GridDetector) ((PhotoView.GridDetector) gridDetector.length(false)).setMin((PhotoView.FlingRunnable) new getMaxTextureSize() {
                public final void onFinished(int i) {
                    PhotoView.PhotoInter unused = NearbyMeActivity.this.onNavigationEvent = null;
                    NearbyMeActivity.this.presenter.length();
                    NearbyMeActivity.access$1500(NearbyMeActivity.this);
                }
            })).setMin();
        }
    }

    static /* synthetic */ void access$700(NearbyMeActivity nearbyMeActivity, String str) {
        nearbyMeActivity.tvDistrictLocation.setText(str);
        nearbyMeActivity.tvLocation.setText(str);
    }

    static /* synthetic */ void access$900(NearbyMeActivity nearbyMeActivity) {
        nearbyMeActivity.merchantListView.showShimmerMerchantList();
        nearbyMeActivity.isInside = true;
    }

    public static /* synthetic */ ShopModel access$1100(NearbyMeActivity nearbyMeActivity, final ShopModel shopModel) {
        double d = shopModel.values;
        double d2 = shopModel.toString;
        final Location location = new Location("");
        location.setLatitude(d);
        location.setLongitude(d2);
        nearbyMeActivity.length(shopModel, (parseBehavior<Drawable>) new parseBehavior<Drawable>() {
            public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
                return setMax((Drawable) obj);
            }

            public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Drawable> layoutchildwithanchor, boolean z) {
                NearbyMeActivity.access$1600(NearbyMeActivity.this, new getAppSlogan(this, shopModel, location));
                return false;
            }

            private boolean setMax(Drawable drawable) {
                NearbyMeActivity.access$1600(NearbyMeActivity.this, new getCategoryId(this, shopModel, drawable, location));
                return true;
            }
        });
        return shopModel;
    }

    static /* synthetic */ void access$1500(NearbyMeActivity nearbyMeActivity) {
        if (!nearbyMeActivity.etNearbySearch.getText().toString().isEmpty()) {
            nearbyMeActivity.setMax.setState(3);
            nearbyMeActivity.setMax(1.0f);
        }
    }

    static /* synthetic */ void access$1600(NearbyMeActivity nearbyMeActivity, Runnable runnable) {
        setFavoriteBtnVisibility min = setFavoriteBtnVisibility.getMin(runnable);
        hasCornerMarking length = hideProgress.length();
        setRefreshAnimation.getMax(length, "scheduler is null");
        dismissBadgeView setheaderviewheight = new setHeaderViewHeight(min, length);
        RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable = SecuritySignature.valueOf;
        if (redDotDrawable != null) {
            setheaderviewheight = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable, setheaderviewheight);
        }
        hasCornerMarking length2 = hideProgress.length();
        setRefreshAnimation.getMax(length2, "scheduler is null");
        setFavoriteBtnVisibility setrefreshoffset = new setRefreshOffset(setheaderviewheight, length2);
        RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable2 = SecuritySignature.valueOf;
        if (redDotDrawable2 != null) {
            setrefreshoffset = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable2, setrefreshoffset);
        }
        nearbyMeActivity.addDisposable(setrefreshoffset.v_());
    }

    public static /* synthetic */ void access$1800(NearbyMeActivity nearbyMeActivity, ShopModel shopModel, Drawable drawable, Location location) {
        if (nearbyMeActivity.setMax(shopModel.b)) {
            MarkerOptions min = nearbyMeActivity.getMin(shopModel, drawable, location);
            if (nearbyMeActivity.getMin(shopModel)) {
                min.visible(false);
            }
            Marker min2 = nearbyMeActivity.setMin(min, shopModel);
            if (!nearbyMeActivity.getMin(shopModel)) {
                return;
            }
            if (nearbyMeActivity.toDoubleRange) {
                nearbyMeActivity.length(min2);
                nearbyMeActivity.toDoubleRange = false;
                return;
            }
            nearbyMeActivity.IsOverlapping = null;
        }
    }

    static /* synthetic */ void access$2000(NearbyMeActivity nearbyMeActivity) {
        if (!CornerMarkingDataProvider.IsOverlapping() || setStateOn.getMin(nearbyMeActivity, "android.permission.ACCESS_FINE_LOCATION")) {
            nearbyMeActivity.toFloatRange();
            nearbyMeActivity.toFloatRange = 0;
            GriverProgressBar.UpdateRunnable subscribe = new WheelView.ScrollerTask.getMax(nearbyMeActivity).getMin().subscribe(new setCategories(nearbyMeActivity));
            nearbyMeActivity.FastBitmap$CoordinateSystem = subscribe;
            nearbyMeActivity.addDisposable(subscribe);
        } else if (WheelView.ScrollerTask.length(nearbyMeActivity)) {
            if (nearbyMeActivity.invoke == null) {
                nearbyMeActivity.toIntRange();
            }
            nearbyMeActivity.invoke.setMin();
        }
    }

    static /* synthetic */ void access$2400(NearbyMeActivity nearbyMeActivity) {
        nearbyMeActivity.setMax(0.0f);
        nearbyMeActivity.appBarLayout.setExpanded(true, false);
    }

    public static /* synthetic */ void setMax(NearbyMeActivity nearbyMeActivity) {
        int length;
        Context baseContext = nearbyMeActivity.getBaseContext();
        Location location = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-110784879, oncanceled);
            onCancelLoad.getMin(-110784879, oncanceled);
        }
        nearbyMeActivity.setMax();
        if (nearbyMeActivity.lavMapCenterPinPoint.getVisibility() == 0) {
            GriverDefaultLoadingView griverDefaultLoadingView = nearbyMeActivity.mapHelper;
            if (griverDefaultLoadingView.setMax != null) {
                LatLng latLng = griverDefaultLoadingView.setMax.getCameraPosition().target;
                double d = latLng.latitude;
                double d2 = latLng.longitude;
                Location location2 = new Location("");
                location2.setLatitude(d);
                location2.setLongitude(d2);
                location = location2;
            }
            nearbyMeActivity.presenter.getMax(location);
            nearbyMeActivity.presenter.setMin(location, 3000);
            nearbyMeActivity.toDoubleRange = true;
        }
    }

    public static /* synthetic */ void length(NearbyMeActivity nearbyMeActivity) {
        int length;
        int min;
        if (nearbyMeActivity.length()) {
            nearbyMeActivity.cvGoToMyLocation.setVisibility(0);
            nearbyMeActivity.setMax.setState(4);
        }
        GriverDefaultLoadingView griverDefaultLoadingView = nearbyMeActivity.mapHelper;
        Marker marker = nearbyMeActivity.invokeSuspend;
        if (marker != null) {
            float f = griverDefaultLoadingView.setMax != null ? griverDefaultLoadingView.setMax.getCameraPosition().zoom / 30.0f : 0.0f;
            marker.setAnchor(f, f);
        }
        if (nearbyMeActivity.hashCode) {
            nearbyMeActivity.lavMapCenterPinPoint.setVisibility(0);
        }
        Context baseContext = nearbyMeActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-56361711, oncanceled);
            onCancelLoad.getMin(-56361711, oncanceled);
        }
        if (nearbyMeActivity.equals()) {
            PinMapLottieAnimationView pinMapLottieAnimationView = nearbyMeActivity.lavMapCenterPinPoint;
            pinMapLottieAnimationView.setMinFrame(pinMapLottieAnimationView.getPullOutMinFrame());
            PinMapLottieAnimationView pinMapLottieAnimationView2 = nearbyMeActivity.lavMapCenterPinPoint;
            pinMapLottieAnimationView2.setMaxFrame(pinMapLottieAnimationView2.getPullOutMaxFrame());
            nearbyMeActivity.lavMapCenterPinPoint.playAnimation();
        }
        nearbyMeActivity.getMin("ERROR");
    }

    public static /* synthetic */ void length(NearbyMeActivity nearbyMeActivity, Location location) {
        if (nearbyMeActivity.toFloatRange >= 5) {
            nearbyMeActivity.toFloatRange = 0;
            Location location2 = new Location("");
            location2.setLatitude(-6.17476d);
            location2.setLongitude(106.827072d);
            nearbyMeActivity.toIntRange = location2;
            nearbyMeActivity.isInside();
            nearbyMeActivity.toFloatRange();
        }
        if (location != null) {
            nearbyMeActivity.toIntRange = location;
            nearbyMeActivity.nearbyMerchantLocationSearchView.setLocation(location);
            nearbyMeActivity.isInside();
            nearbyMeActivity.toFloatRange();
            return;
        }
        nearbyMeActivity.toFloatRange++;
    }

    public static /* synthetic */ void length(String str) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-199945585, oncanceled);
            onCancelLoad.getMin(-199945585, oncanceled);
        }
        DanaH5.startContainerFullUrl(setH5OptionMenuTextFlag.setMin("https://m.dana.id/m/portal/topup?entryPoint={entryPoint}&payMethod=OTC&instId={instId}&fromSKW=true").getMin(UrlTag.INSTID, str).getMin(UrlTag.ENTRY_POINT, TopupSource.NEARBY).getMax());
    }

    public static /* synthetic */ void setMax(NearbyMeActivity nearbyMeActivity, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            String charSequence2 = charSequence.toString();
            int length = charSequence2 != null ? charSequence2.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-693141723, oncanceled);
                onCancelLoad.getMin(-693141723, oncanceled);
            }
            nearbyMeActivity.nearbyAnalyticTracker.length(charSequence2, "");
            nearbyMeActivity.ivClear.setVisibility(0);
            nearbyMeActivity.setMax.setState(3);
            return;
        }
        nearbyMeActivity.ivClear.setVisibility(8);
    }

    public static /* synthetic */ void getMin(NearbyMeActivity nearbyMeActivity, int i) {
        int length;
        Context baseContext = nearbyMeActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (length = dispatchOnCancelled.length(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, length, 4);
            onCancelLoad.setMax(986291673, oncanceled);
            onCancelLoad.getMin(986291673, oncanceled);
        }
        if (i == 1) {
            nearbyMeActivity.showShimmerNearbyLocation();
            nearbyMeActivity.lavMapCenterPinPoint.setVisibility(0);
        }
    }

    public static /* synthetic */ ShopModel getMin(NearbyMeActivity nearbyMeActivity, Integer num) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1620105429, oncanceled);
            onCancelLoad.getMin(-1620105429, oncanceled);
        }
        return nearbyMeActivity.merchantListView.getMerchantItem(num.intValue());
    }

    public static /* synthetic */ void getMax(NearbyMeActivity nearbyMeActivity, Location location) {
        LatLng latLng;
        nearbyMeActivity.hashCode = true;
        nearbyMeActivity.showShimmerNearbyLocation();
        GriverDefaultLoadingView griverDefaultLoadingView = nearbyMeActivity.mapHelper;
        if (location != null) {
            latLng = new LatLng(location.getLatitude(), location.getLongitude());
        } else {
            latLng = new LatLng(-6.17476d, 106.827072d);
        }
        if (griverDefaultLoadingView.setMax != null) {
            griverDefaultLoadingView.setMax.animateCamera(GriverDefaultLoadingView.setMax(latLng, 15.0f));
        }
        GriverDefaultLoadingView griverDefaultLoadingView2 = nearbyMeActivity.mapHelper;
        if (griverDefaultLoadingView2.setMax != null) {
            griverDefaultLoadingView2.setMax.clear();
        }
        nearbyMeActivity.values.clear();
        nearbyMeActivity.toString = null;
        nearbyMeActivity.IsOverlapping();
        nearbyMeActivity.lavMapCenterPinPoint.setVisibility(0);
        nearbyMeActivity.setMax();
        nearbyMeActivity.merchantListView.clearPreSelectedCategory();
        if (location != null) {
            nearbyMeActivity.presenter.setMax(location, 3000, false);
        }
        nearbyMeActivity.setMax.setState(6);
    }

    public static /* synthetic */ void getMax(NearbyMeActivity nearbyMeActivity, Function1 function1, int i) {
        int min;
        Context baseContext = nearbyMeActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1903019781, oncanceled);
            onCancelLoad.getMin(-1903019781, oncanceled);
        }
        MerchantDetailActivity.setMin setmin = MerchantDetailActivity.Companion;
        MerchantDetailActivity.setMin.setMax(nearbyMeActivity, (ShopModel) function1.invoke(Integer.valueOf(i)), TrackerKey.SourceType.NEARBY_ME_LIST);
    }

    public static /* synthetic */ void getMin(NearbyMeActivity nearbyMeActivity, Function1 function1, int i) {
        int max;
        Context baseContext = nearbyMeActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.getMax(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, max, 512);
            onCancelLoad.setMax(1266234516, oncanceled);
            onCancelLoad.getMin(1266234516, oncanceled);
        }
        ShopModel shopModel = (ShopModel) function1.invoke(Integer.valueOf(i));
        nearbyMeActivity.nearbyAnalyticTracker.setMin(shopModel, TrackerKey.SourceType.NEARBY_ME_LIST);
        k.AnonymousClass10.setMin(nearbyMeActivity.getSupportFragmentManager(), new GriverMenuExtensionImpl(shopModel, TrackerKey.SourceType.SHOP_LIST));
    }

    public static /* synthetic */ ShopModel isInside(NearbyMeActivity nearbyMeActivity, Integer num) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(151942357, oncanceled);
            onCancelLoad.getMin(151942357, oncanceled);
        }
        return nearbyMeActivity.merchantListView.getMerchantItem(num.intValue());
    }

    public static /* synthetic */ void setMin(NearbyMeActivity nearbyMeActivity, Function1 function1, int i) {
        int length;
        int min;
        int min2;
        int max;
        Context baseContext = nearbyMeActivity.getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1061775607 == (max = dispatchOnCancelled.getMax(applicationContext, 1061775607)))) {
            onCanceled oncanceled = new onCanceled(1061775607, max, 512);
            onCancelLoad.setMax(1061775607, oncanceled);
            onCancelLoad.getMin(1061775607, oncanceled);
        }
        Context baseContext2 = nearbyMeActivity.getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || i == (min2 = dispatchOnCancelled.setMin(applicationContext2, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min2, 8);
            onCancelLoad.setMax(1061775607, oncanceled2);
            onCancelLoad.getMin(1061775607, oncanceled2);
        }
        Context baseContext3 = nearbyMeActivity.getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1061775607, oncanceled3);
            onCancelLoad.getMin(1061775607, oncanceled3);
        }
        OtherStoreListActivity.length length2 = OtherStoreListActivity.Companion;
        OtherStoreListActivity.length.getMax(nearbyMeActivity, (ShopModel) function1.invoke(Integer.valueOf(i)), nearbyMeActivity.toIntRange.getLatitude(), nearbyMeActivity.toIntRange.getLongitude(), SearchType.MERCHANTID_SORTED_BY_DISTANCE, "", TrackerKey.SourceType.NEARBY_ME_LIST);
    }
}
