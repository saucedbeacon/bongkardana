package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import com.rd.PageIndicatorView;
import id.dana.base.BaseRichView;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.AnnouncementModule;
import id.dana.di.modules.OauthModule;
import id.dana.home.banner.SimplePromotionView;
import id.dana.model.CdpContentModel;
import id.dana.model.ThirdPartyService;
import id.dana.richview.CircularViewPager;
import id.dana.tracker.TrackerKey;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.BindView;
import o.GriverCaptureActivity;
import o.GriverManifest;
import o.GyroscopeSensorService;
import o.IntRange;
import o.LoadingBridgeExtension;
import o.OnConflictStrategy;
import o.PrepareException;
import o.R;
import o.RVResourceEnviromentProxy;
import o.RawQuery;
import o.StepInterceptor;
import o.WheelView;
import o.convertDipToPx;
import o.convertSpToPx;
import o.genTextSelector;
import o.getDuration;
import o.getInsetDodgeRect;
import o.getRunningAnimators;
import o.isShowMenu;
import o.onDetachedFromLayoutParams;
import o.onLeftHiddenState;
import o.resetInternal;
import o.setCancelOnTouchOutside$core;
import o.stopIgnoring;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BannerView extends BaseRichView implements onLeftHiddenState.getMin {
    private int FastBitmap$CoordinateSystem = 0;
    /* access modifiers changed from: private */
    public String IsOverlapping;
    @Inject
    public onLeftHiddenState.setMin announcementPresenter;
    @BindView(2131362579)
    ConstraintLayout container;
    private onDetachedFromLayoutParams equals;
    @Inject
    public getRunningAnimators.setMax featurePresenter;
    private boolean getMax;
    private boolean getMin = false;
    /* access modifiers changed from: private */
    public getMax hashCode;
    @BindView(2131363203)
    PageIndicatorView indicator;
    private int isInside;
    private StepInterceptor length;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    @Inject
    public BindView.setMin restorePresenter;
    @Inject
    public R.id.getMax scanQrPresenter;
    private int setMax = -1;
    private int setMin;
    private boolean toDoubleRange = false;
    private List<CdpContentModel> toFloatRange = new ArrayList();
    private LoadingBridgeExtension toIntRange;
    /* access modifiers changed from: private */
    public GriverManifest.AnonymousClass50 toString;
    @butterknife.BindView(2131361926)
    CircularViewPager vpBanner;

    public interface getMax {
        void getMax();
    }

    @JvmDefault
    public void dismissProgress() {
    }

    public int getLayout() {
        return id.dana.R.layout.view_banner;
    }

    @JvmDefault
    public void onError(@Nullable String str) {
    }

    @JvmDefault
    public void showProgress() {
    }

    public BannerView(@NonNull Context context) {
        super(context);
    }

    public BannerView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BannerView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BannerView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void onDetachedFromWindow() {
        if (!this.toDoubleRange) {
            this.vpBanner.pauseAutoScroll();
        }
        this.toDoubleRange = false;
        super.onDetachedFromWindow();
    }

    public void injectComponent(PrepareException.AnonymousClass1 r14) {
        if (this.length == null) {
            RVResourceEnviromentProxy.getMax getmax = new RVResourceEnviromentProxy.getMax((byte) 0);
            if (r14 != null) {
                getmax.toFloatRange = r14;
                getmax.isInside = new ServicesModule((style.getMin) new style.getMin() {
                    @JvmDefault
                    public final void dismissProgress() {
                    }

                    @JvmDefault
                    public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                    }

                    @JvmDefault
                    public final void getMax(@NotNull ThirdPartyService thirdPartyService, @NotNull String str) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                        Intrinsics.checkNotNullParameter(str, "authCode");
                    }

                    @JvmDefault
                    public final void getMax(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void getMin(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void length() {
                    }

                    @JvmDefault
                    public final void onError(@Nullable String str) {
                    }

                    @JvmDefault
                    public final void setMax(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void setMax(boolean z) {
                    }

                    @JvmDefault
                    public final void setMin() {
                    }

                    @JvmDefault
                    public final void setMin(@NotNull ThirdPartyService thirdPartyService) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                    }

                    @JvmDefault
                    public final void setMin(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void showProgress() {
                    }
                });
                DeepLinkModule.setMin max = DeepLinkModule.getMax();
                max.getMax = getBaseActivity();
                max.length = TrackerKey.SourceType.BANNER;
                getmax.length = new DeepLinkModule(max, (byte) 0);
                ScanQrModule.setMin max2 = ScanQrModule.getMax();
                max2.setMin = getBaseActivity();
                getmax.setMax = new ScanQrModule(max2, (byte) 0);
                RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
                min.getMax = getBaseActivity();
                getmax.getMin = new RestoreUrlModule(min, (byte) 0);
                FeatureModule.length length2 = FeatureModule.length();
                length2.setMax = getBaseActivity();
                getmax.getMax = new FeatureModule(length2, (byte) 0);
                OauthModule.getMax min2 = OauthModule.setMin();
                min2.setMin = getBaseActivity();
                getmax.setMin = new OauthModule(min2, (byte) 0);
                getmax.IsOverlapping = new AnnouncementModule(this);
                stopIgnoring.setMin(getmax.length, DeepLinkModule.class);
                stopIgnoring.setMin(getmax.setMax, ScanQrModule.class);
                stopIgnoring.setMin(getmax.getMin, RestoreUrlModule.class);
                stopIgnoring.setMin(getmax.getMax, FeatureModule.class);
                stopIgnoring.setMin(getmax.setMin, OauthModule.class);
                if (getmax.isInside == null) {
                    getmax.isInside = new ServicesModule();
                }
                stopIgnoring.setMin(getmax.IsOverlapping, AnnouncementModule.class);
                stopIgnoring.setMin(getmax.toFloatRange, PrepareException.AnonymousClass1.class);
                this.length = new RVResourceEnviromentProxy(getmax.length, getmax.setMax, getmax.getMin, getmax.getMax, getmax.setMin, getmax.isInside, getmax.IsOverlapping, getmax.toFloatRange, (byte) 0);
            } else {
                throw null;
            }
        }
        this.length.getMax(this);
        registerPresenter(this.readDeepLinkPropertiesPresenter, this.scanQrPresenter, this.restorePresenter, this.featurePresenter);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.onNavigationEvent);
        try {
            this.getMax = obtainStyledAttributes.getBoolean(3, true);
            this.setMin = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.isInside = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.IsOverlapping = obtainStyledAttributes.getString(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setPromotionBannerSliderItemMode(boolean z) {
        if (z) {
            if (this.FastBitmap$CoordinateSystem != 1) {
                this.FastBitmap$CoordinateSystem = 1;
                getMax();
            }
        } else if (this.FastBitmap$CoordinateSystem != 0) {
            this.FastBitmap$CoordinateSystem = 0;
            getMax();
        }
    }

    public void setPromotionModel(LoadingBridgeExtension loadingBridgeExtension) {
        this.toIntRange = loadingBridgeExtension;
    }

    public void setContents(List<CdpContentModel> list) {
        if (this.toFloatRange == null) {
            this.toFloatRange = new ArrayList();
        }
        this.toFloatRange.clear();
        if (list != null) {
            this.toFloatRange.addAll(list);
        }
        if (this.toFloatRange.size() > 1) {
            CircularViewPager circularViewPager = this.vpBanner;
            int i = this.setMin;
            circularViewPager.setPadding(i, 0, i, 0);
        } else {
            CircularViewPager circularViewPager2 = this.vpBanner;
            int i2 = this.isInside;
            circularViewPager2.setPadding(i2, 0, i2, 0);
        }
        getMax();
    }

    public void setCustomBannerHeight(int i) {
        this.setMax = i;
    }

    public void setTopRoundedCornerBanner() {
        this.getMin = true;
    }

    public void skipPauseAutoScrollAfterDisplay() {
        this.toDoubleRange = true;
    }

    public void display() {
        List<CdpContentModel> list = this.toFloatRange;
        if (list == null || list.isEmpty()) {
            hideSkeleton();
            this.container.setVisibility(8);
            return;
        }
        hideSkeleton();
        this.container.setVisibility(0);
        this.indicator.setCount(this.vpBanner.getIndicatorCount());
        if (this.getMax) {
            this.indicator.setVisibility(8);
        }
        this.vpBanner.resumeAutoScroll();
    }

    public void setSelectedColor(int i) {
        this.indicator.setSelectedColor(i);
        invalidate();
    }

    private void getMax() {
        this.toString = new GriverCaptureActivity.AnonymousClass1<CdpContentModel>(getContext(), this.getMax, this.getMin, this.setMax, this.FastBitmap$CoordinateSystem) {
            private boolean IsOverlapping;
            private boolean isInside;
            private List<GyroscopeSensorService.SensorChangedListener> setMin = new ArrayList();
            private int toIntRange;
            private final int values;

            {
                this.isInside = r2;
                this.IsOverlapping = r3;
                this.toIntRange = r4;
                this.values = r5;
            }

            public final void setMin(List<CdpContentModel> list) {
                if (list != null) {
                    this.setMin.clear();
                    String obj = UUID.randomUUID().toString();
                    for (CdpContentModel next : list) {
                        if (next.setMin.equalsIgnoreCase("PRE") || next.setMin.equalsIgnoreCase("POST") || next.setMin.equalsIgnoreCase("shimmerReminder")) {
                            this.setMin.add(new shouldLog(next.getMax, next.setMax, next.setMin));
                        } else {
                            this.setMin.add(new SimplePromotionView(next, this.isInside, this.IsOverlapping, this.toIntRange, this.values, obj));
                        }
                    }
                    super.setMin(list);
                }
            }

            public final View setMin(int i, ViewGroup viewGroup, int i2) {
                this.setMin.get(i2).length(this.setMax, viewGroup);
                View view = this.setMin.get(i2).toFloatRange;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                }
                return view;
            }

            public final boolean setMin(int i) {
                return getMax() == null || getMax().isEmpty() || i >= getMax().size() || getMax().get(i) == null;
            }

            public final void setMax() {
                List<GyroscopeSensorService.SensorChangedListener> list = this.setMin;
                if (list != null && !list.isEmpty()) {
                    for (GyroscopeSensorService.SensorChangedListener next : this.setMin) {
                        if (next.toIntRange != null) {
                            RawQuery.getMax(next.toIntRange, RawQuery.length.getMin);
                        }
                    }
                }
            }
        };
        this.vpBanner.pauseAutoScroll();
        this.toString.toFloatRange = new OnConflictStrategy(getBaseActivity()) {
            public final void setMax(int i) {
                CdpContentModel cdpContentModel;
                GriverManifest.AnonymousClass50 access$000 = BannerView.this.toString;
                String str = null;
                if (access$000.setMin(i)) {
                    cdpContentModel = null;
                } else {
                    cdpContentModel = (CdpContentModel) access$000.getMax().get(i);
                }
                if (cdpContentModel != null) {
                    String str2 = cdpContentModel.setMin;
                    BannerView.access$100(BannerView.this, cdpContentModel);
                    if (str2.equalsIgnoreCase("PRE") || str2.equalsIgnoreCase("POST")) {
                        BannerView.access$200(BannerView.this, cdpContentModel);
                    } else if (!str2.equalsIgnoreCase("shimmerReminder")) {
                        BannerView bannerView = BannerView.this;
                        GriverManifest.AnonymousClass50 access$0002 = bannerView.toString;
                        String access$300 = BannerView.this.IsOverlapping;
                        if (!access$0002.setMin(i)) {
                            str = isShowMenu.length(((CdpContentModel) access$0002.getMin(i)).toDoubleRange, access$300);
                        }
                        BannerView.access$400(bannerView, str);
                    }
                }
            }
        };
        this.toString.setMin(this.toFloatRange);
        CircularViewPager circularViewPager = this.vpBanner;
        int i = 2;
        if (this.toFloatRange.size() <= 2) {
            i = 1;
        }
        circularViewPager.setOffscreenPageLimit(i);
        this.vpBanner.setAdapter(this.toString);
        this.vpBanner.resumeAutoScroll();
    }

    public void hideSkeleton() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.equals;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    public void showSkeleton() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.equals;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.container);
            setmax.getMax = id.dana.R.layout.view_banner_skeleton;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), id.dana.R.color.f24782131100433);
            setmax.isInside = 0;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.equals = getinsetdodgerect;
            return;
        }
        ondetachedfromlayoutparams.getMin();
    }

    public void setEntryPoint(String str) {
        this.IsOverlapping = str;
    }

    public void unbindAdapter() {
        if (this.vpBanner.getAdapter() instanceof GriverManifest.AnonymousClass50) {
            ((GriverManifest.AnonymousClass50) this.vpBanner.getAdapter()).setMax();
        }
    }

    public void setGnNotificationCloseContainerCallback(getMax getmax) {
        this.hashCode = getmax;
    }

    public boolean isContentsEmpty() {
        return this.toFloatRange.isEmpty();
    }

    public void setup() {
        this.vpBanner.setIndicatorPageChangeListener(new CircularViewPager.setMin() {
            public final void getMax(int i) {
                if (BannerView.this.indicator != null) {
                    BannerView.this.indicator.setSelection(i);
                }
            }
        });
        this.vpBanner.setPageMargin(this.isInside);
    }

    static /* synthetic */ void access$100(BannerView bannerView, CdpContentModel cdpContentModel) {
        LoadingBridgeExtension loadingBridgeExtension = bannerView.toIntRange;
        String str = null;
        String str2 = loadingBridgeExtension == null ? null : loadingBridgeExtension.hashCode;
        convertDipToPx.length max = new convertDipToPx.length(bannerView.getContext()).setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_ID, cdpContentModel.getMin).setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_TYPE, cdpContentModel.setMin).setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_NAME, cdpContentModel.getMax);
        Date date = cdpContentModel.isInside;
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        Locale locale = WheelView.OnWheelViewListener.getMax;
        if (date != null) {
            str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale).format(date);
        }
        convertDipToPx.length max2 = max.setMax(TrackerKey.PromotionProperty.PROMOTION_EXPIRY_DATE, str).setMax(TrackerKey.PromotionProperty.PROMOTION_SPACE_CODE, str2);
        max2.getMax = TrackerKey.Event.PROMOTION_BANNER_OPEN;
        max2.setMin();
        genTextSelector.getMax(new convertDipToPx(max2, (byte) 0));
    }

    static /* synthetic */ void access$200(BannerView bannerView, final CdpContentModel cdpContentModel) {
        convertDipToPx.length length2 = new convertDipToPx.length(bannerView.getContext());
        length2.getMax = TrackerKey.Event.ANNOUNCEMENT_WIDGET_OPEN;
        convertDipToPx.length max = length2.setMax(TrackerKey.Property.MERCHANT_ID, cdpContentModel.Mean$Arithmetic).setMax(TrackerKey.Property.ANNOUNCEMENT_TITLE, cdpContentModel.Grayscale$Algorithm).setMax(TrackerKey.Property.ANNOUNCEMENT_SUBTITLE, cdpContentModel.valueOf).setMax(TrackerKey.Property.ANNOUNCEMENT_TYPE, cdpContentModel.setMin);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        DanaH5.startContainerFullUrl("https://m.dana.id/i/dana-my-bills/lifestyle-subscription-list?openSection=gn_strategy", new setCancelOnTouchOutside$core() {
            public final void onContainerDestroyed(@androidx.annotation.Nullable Bundle bundle) {
            }

            public final void onContainerCreated(@Nullable Bundle bundle) {
                BannerView.this.announcementPresenter.setMax(cdpContentModel.getMin);
                if (BannerView.this.hashCode != null) {
                    BannerView.this.hashCode.getMax();
                }
            }
        });
    }

    static /* synthetic */ void access$400(BannerView bannerView, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.trim().contains("https://link.dana.id/")) {
            bannerView.readDeepLinkPropertiesPresenter.setMax(str);
        } else {
            DanaH5.startContainerFullUrl(str);
        }
    }
}
