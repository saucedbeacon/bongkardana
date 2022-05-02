package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
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
import id.dana.home.banner.NewSimplePromotionView;
import id.dana.model.CdpContentModel;
import id.dana.model.ThirdPartyService;
import id.dana.richview.BannerView;
import id.dana.richview.CircularViewPager;
import id.dana.richview.NewBannerView;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.BindView;
import o.BlurProcess;
import o.DefaultWebSocketProxyImpl;
import o.GriverCaptureActivity;
import o.GriverManifest;
import o.GyroscopeSensorService;
import o.IntRange;
import o.LoadingBridgeExtension;
import o.OnConflictStrategy;
import o.PrepareException;
import o.R;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getDuration;
import o.getInsetDodgeRect;
import o.getRunningAnimators;
import o.hitPresetResource;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.onLeftHiddenState;
import o.onPictureProcessError;
import o.onPictureProcessFinish;
import o.onPictureProcessStart;
import o.resetInternal;
import o.setCancelOnTouchOutside$core;
import o.stopIgnoring;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NewBannerView extends BaseRichView implements onLeftHiddenState.getMin {
    /* access modifiers changed from: private */
    public BannerView.getMax FastBitmap$CoordinateSystem;
    private LoadingBridgeExtension IsOverlapping;
    @Inject
    public onLeftHiddenState.setMin announcementPresenter;
    Long bannerClickTimer;
    @BindView(2131362579)
    ConstraintLayout container;
    /* access modifiers changed from: private */
    public GriverManifest.AnonymousClass54 equals;
    @Inject
    public getRunningAnimators.setMax featurePresenter;
    private final Handler getMax = new Handler();
    private DefaultWebSocketProxyImpl getMin;
    private onDetachedFromLayoutParams hashCode;
    @BindView(2131363203)
    PageIndicatorView indicator;
    private int isInside;
    private final Handler length = new Handler(Looper.getMainLooper());
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    @Inject
    public BindView.setMin restorePresenter;
    @Inject
    public R.id.getMax scanQrPresenter;
    /* access modifiers changed from: private */
    public String setMax;
    private List<CdpContentModel> setMin = new ArrayList();
    private boolean toDoubleRange = false;
    private int toFloatRange;
    private boolean toIntRange;
    private boolean toString = false;
    /* access modifiers changed from: private */
    public boolean values;
    @butterknife.BindView(2131361926)
    CircularViewPager vpBanner;

    @JvmDefault
    public void dismissProgress() {
    }

    public int getLayout() {
        return id.dana.R.layout.new_view_banner;
    }

    @JvmDefault
    public void onError(@Nullable String str) {
    }

    @JvmDefault
    public void showProgress() {
    }

    public NewBannerView(@NonNull Context context) {
        super(context);
    }

    public NewBannerView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewBannerView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NewBannerView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r14) {
        if (this.getMin == null) {
            hitPresetResource.getMax getmax = new hitPresetResource.getMax((byte) 0);
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
                getmax.getMax = new DeepLinkModule(max, (byte) 0);
                ScanQrModule.setMin max2 = ScanQrModule.getMax();
                max2.setMin = getBaseActivity();
                getmax.setMax = new ScanQrModule(max2, (byte) 0);
                RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
                min.getMax = getBaseActivity();
                getmax.setMin = new RestoreUrlModule(min, (byte) 0);
                FeatureModule.length length2 = FeatureModule.length();
                length2.setMax = getBaseActivity();
                getmax.length = new FeatureModule(length2, (byte) 0);
                OauthModule.getMax min2 = OauthModule.setMin();
                min2.setMin = getBaseActivity();
                getmax.getMin = new OauthModule(min2, (byte) 0);
                getmax.toIntRange = new AnnouncementModule(this);
                stopIgnoring.setMin(getmax.getMax, DeepLinkModule.class);
                stopIgnoring.setMin(getmax.setMax, ScanQrModule.class);
                stopIgnoring.setMin(getmax.setMin, RestoreUrlModule.class);
                stopIgnoring.setMin(getmax.length, FeatureModule.class);
                stopIgnoring.setMin(getmax.getMin, OauthModule.class);
                if (getmax.isInside == null) {
                    getmax.isInside = new ServicesModule();
                }
                stopIgnoring.setMin(getmax.toIntRange, AnnouncementModule.class);
                stopIgnoring.setMin(getmax.toFloatRange, PrepareException.AnonymousClass1.class);
                this.getMin = new hitPresetResource(getmax.getMax, getmax.setMax, getmax.setMin, getmax.length, getmax.getMin, getmax.isInside, getmax.toIntRange, getmax.toFloatRange, (byte) 0);
            } else {
                throw null;
            }
        }
        this.getMin.setMin(this);
        registerPresenter(this.readDeepLinkPropertiesPresenter, this.scanQrPresenter, this.restorePresenter, this.featurePresenter);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.onNavigationEvent);
        try {
            this.toIntRange = obtainStyledAttributes.getBoolean(3, true);
            this.isInside = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.toFloatRange = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.setMax = obtainStyledAttributes.getString(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void onDetachedFromWindow() {
        if (!this.toDoubleRange) {
            this.vpBanner.pauseAutoScroll();
        }
        this.toDoubleRange = false;
        super.onDetachedFromWindow();
    }

    public void setGnNotificationCloseContainerCallback(BannerView.getMax getmax) {
        this.FastBitmap$CoordinateSystem = getmax;
    }

    /* access modifiers changed from: private */
    public boolean setMin() {
        return this.vpBanner.getGlobalVisibleRect(new Rect());
    }

    public void pauseAutoScroll() {
        this.vpBanner.pauseAutoScroll();
    }

    public void resumeAutoScroll() {
        CircularViewPager circularViewPager = this.vpBanner;
        if (circularViewPager != null) {
            circularViewPager.resumeAutoScroll();
        }
    }

    public void setPromotionModel(LoadingBridgeExtension loadingBridgeExtension) {
        this.IsOverlapping = loadingBridgeExtension;
    }

    public void setContents(List<CdpContentModel> list) {
        if (this.setMin == null) {
            this.setMin = new ArrayList();
        }
        this.setMin.clear();
        if (list != null) {
            this.setMin.addAll(list);
        }
        if (this.vpBanner != null) {
            int i = 1;
            if (this.setMin.size() > 1) {
                CircularViewPager circularViewPager = this.vpBanner;
                int i2 = this.isInside;
                circularViewPager.setPadding(i2, 0, i2, 0);
            } else {
                CircularViewPager circularViewPager2 = this.vpBanner;
                int i3 = this.toFloatRange;
                circularViewPager2.setPadding(i3, 0, i3, 0);
            }
            if (this.equals == null) {
                this.equals = new GriverCaptureActivity.AnonymousClass1<CdpContentModel>(getContext(), new onPictureProcessStart(this), this.toIntRange, this.toString) {
                    private final boolean IsOverlapping;
                    private final View.OnTouchListener isInside;
                    public getMin setMin;
                    private final boolean toIntRange;
                    private final List<GyroscopeSensorService.SensorChangedListener> values = new ArrayList();

                    /* renamed from: o.GriverManifest$54$getMin */
                    public interface getMin {
                        void getMax(CdpContentModel cdpContentModel);
                    }

                    {
                        this.toIntRange = r3;
                        this.IsOverlapping = r4;
                        this.isInside = r2;
                    }

                    public final void setMin(List<CdpContentModel> list) {
                        if (list != null) {
                            String obj = UUID.randomUUID().toString();
                            this.values.clear();
                            for (CdpContentModel next : list) {
                                if (next.setMin.equalsIgnoreCase("SUBSCRIPTION")) {
                                    this.values.add(new GriverMonitorAnalyticsConfigExtensionImpl(next.create, this.setMin));
                                } else {
                                    this.values.add(new NewSimplePromotionView(this.isInside, next, this.toIntRange, this.IsOverlapping, obj));
                                }
                            }
                            super.setMin(list);
                        }
                    }

                    public final View setMin(int i, ViewGroup viewGroup, int i2) {
                        int max = dispatchOnCancelled.setMax(i);
                        if (i != max) {
                            onCanceled oncanceled = new onCanceled(i, max, 1);
                            onCancelLoad.setMax(-1816086153, oncanceled);
                            onCancelLoad.getMin(-1816086153, oncanceled);
                        }
                        this.values.get(i2).length(this.setMax, viewGroup);
                        View view = this.values.get(i2).toFloatRange;
                        if (view == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("view");
                        }
                        return view;
                    }

                    public final boolean getMax(int i) {
                        return getMax() == null || getMax().isEmpty() || i >= getMax().size() || getMax().get(i) == null;
                    }
                };
            }
            this.equals.toFloatRange = new OnConflictStrategy(getBaseActivity()) {
                public final void setMax(int i) {
                    CdpContentModel cdpContentModel;
                    GriverManifest.AnonymousClass54 access$100 = NewBannerView.this.equals;
                    String str = null;
                    if (access$100.getMax(i)) {
                        cdpContentModel = null;
                    } else {
                        cdpContentModel = (CdpContentModel) access$100.getMax().get(i);
                    }
                    if (cdpContentModel != null) {
                        String str2 = cdpContentModel.setMin;
                        NewBannerView.this.setMax(cdpContentModel, TrackerKey.Event.PROMOTION_BANNER_OPEN);
                        char c = 65535;
                        int hashCode = str2.hashCode();
                        if (hashCode != -1636482787) {
                            if (hashCode != 79491) {
                                if (hashCode == 2461856 && str2.equals("POST")) {
                                    c = 1;
                                }
                            } else if (str2.equals("PRE")) {
                                c = 0;
                            }
                        } else if (str2.equals("SUBSCRIPTION")) {
                            c = 2;
                        }
                        if (c == 0) {
                            NewBannerView.access$500(NewBannerView.this, cdpContentModel);
                        } else if (c == 1) {
                            NewBannerView.this.getMin(cdpContentModel);
                        } else if (c != 2) {
                            NewBannerView newBannerView = NewBannerView.this;
                            GriverManifest.AnonymousClass54 access$1002 = newBannerView.equals;
                            String access$700 = NewBannerView.this.setMax;
                            int max = dispatchOnCancelled.setMax(i);
                            if (i != max) {
                                onCanceled oncanceled = new onCanceled(i, max, 1);
                                onCancelLoad.setMax(842679395, oncanceled);
                                onCancelLoad.getMin(842679395, oncanceled);
                            }
                            if (!access$1002.getMax(i)) {
                                str = isShowMenu.length(((CdpContentModel) access$1002.getMin(i)).toDoubleRange, access$700);
                            }
                            newBannerView.length(str);
                        }
                    }
                }
            };
            this.equals.setMin = new onPictureProcessFinish(this);
            this.equals.setMin(this.setMin);
            this.vpBanner.setCircularViewPagerListener(new CircularViewPager.getMax() {
                public final void getMax() {
                    if (!NewBannerView.this.values) {
                        NewBannerView.this.resumeAutoScroll();
                    }
                }

                public final void getMax(boolean z) {
                    if (z) {
                        NewBannerView.this.vpBanner.pauseAutoScroll();
                    } else if (NewBannerView.this.values) {
                        NewBannerView.access$1000(NewBannerView.this);
                    } else {
                        NewBannerView.this.resumeAutoScroll();
                    }
                }
            });
            CircularViewPager circularViewPager3 = this.vpBanner;
            if (this.setMin.size() > 2) {
                i = 2;
            }
            circularViewPager3.setOffscreenPageLimit(i);
            this.vpBanner.setAdapter(this.equals);
            resumeAutoScroll();
        }
    }

    /* access modifiers changed from: private */
    public boolean getMax(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.values = true;
            this.bannerClickTimer = Long.valueOf(Calendar.getInstance().getTimeInMillis());
            this.vpBanner.pauseAutoScroll();
        } else if (motionEvent.getAction() == 1) {
            this.length.removeCallbacksAndMessages((Object) null);
            this.length.postDelayed(new Runnable(this) {
                private final NewBannerView getMax;

                {
                    this.getMax = r1;
                }

                public final void run() {
                    NewBannerView.setMax(this.getMax);
                }
            }, 5000);
            if (Calendar.getInstance().getTimeInMillis() - this.bannerClickTimer.longValue() < 500) {
                view.performClick();
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void getMin(CdpContentModel cdpContentModel) {
        setMin(cdpContentModel);
        this.readDeepLinkPropertiesPresenter.setMax("https://link.dana.id/setting-more?params=[settings=setting_autoroute]");
        this.announcementPresenter.setMax(cdpContentModel.getMin);
        BannerView.getMax getmax = this.FastBitmap$CoordinateSystem;
        if (getmax != null) {
            getmax.getMax();
        }
    }

    /* access modifiers changed from: private */
    public void length(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.trim().contains("https://link.dana.id/")) {
                this.readDeepLinkPropertiesPresenter.setMax(str);
            } else {
                DanaH5.startContainerFullUrl(str);
            }
        }
    }

    public void setTopRoundedCornerBanner() {
        this.toString = true;
    }

    public void skipPauseAutoScrollAfterDisplay() {
        this.toDoubleRange = true;
    }

    public void hideSkeleton() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.hashCode;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    public void display() {
        List<CdpContentModel> list = this.setMin;
        if (list != null && !list.isEmpty()) {
            hideSkeleton();
            this.indicator.setCount(this.vpBanner.getIndicatorCount());
            if (this.toIntRange) {
                this.indicator.setVisibility(8);
            }
            resumeAutoScroll();
        }
    }

    public void setSelectedColor(int i) {
        this.indicator.setSelectedColor(i);
        invalidate();
    }

    public void showSkeleton() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.hashCode;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.container);
            setmax.getMax = id.dana.R.layout.new_view_banner_skeleton;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), id.dana.R.color.f24782131100433);
            setmax.isInside = 0;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.hashCode = getinsetdodgerect;
            return;
        }
        ondetachedfromlayoutparams.getMin();
    }

    private void setMin(CdpContentModel cdpContentModel) {
        convertDipToPx.length length2 = new convertDipToPx.length(getContext());
        length2.getMax = TrackerKey.Event.ANNOUNCEMENT_WIDGET_OPEN;
        convertDipToPx.length max = length2.setMax(TrackerKey.Property.MERCHANT_ID, cdpContentModel.Mean$Arithmetic).setMax(TrackerKey.Property.ANNOUNCEMENT_TITLE, cdpContentModel.Grayscale$Algorithm).setMax(TrackerKey.Property.ANNOUNCEMENT_SUBTITLE, cdpContentModel.valueOf).setMax(TrackerKey.Property.ANNOUNCEMENT_TYPE, cdpContentModel.setMin);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    /* access modifiers changed from: private */
    public void setMax(CdpContentModel cdpContentModel, String str) {
        if (cdpContentModel != null) {
            Context context = getContext();
            LoadingBridgeExtension loadingBridgeExtension = this.IsOverlapping;
            BlurProcess.getMin(context, cdpContentModel, str, loadingBridgeExtension == null ? null : loadingBridgeExtension.hashCode);
        }
    }

    public void setEntryPoint(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-77067394, oncanceled);
            onCancelLoad.getMin(-77067394, oncanceled);
        }
        this.setMax = str;
    }

    public void unbindAdapter() {
        CircularViewPager circularViewPager = this.vpBanner;
        if (circularViewPager != null && (circularViewPager.getAdapter() instanceof GriverManifest.AnonymousClass50)) {
            ((GriverManifest.AnonymousClass50) this.vpBanner.getAdapter()).setMax();
        }
    }

    public void setup() {
        this.vpBanner.setIndicatorPageChangeListener(new CircularViewPager.setMin() {
            public final void getMax(int i) {
                CdpContentModel cdpContentModel;
                NewBannerView.this.indicator.setSelection(i);
                if (NewBannerView.this.setMin() && NewBannerView.this.isShown()) {
                    GriverManifest.AnonymousClass54 access$100 = NewBannerView.this.equals;
                    if (access$100.getMax(i)) {
                        cdpContentModel = null;
                    } else {
                        cdpContentModel = (CdpContentModel) access$100.getMax().get(i);
                    }
                    if (NewBannerView.this.values && cdpContentModel != null) {
                        NewBannerView.access$300(NewBannerView.this, cdpContentModel);
                    }
                }
            }
        });
        this.vpBanner.setPageMargin(this.toFloatRange);
    }

    static /* synthetic */ void access$300(NewBannerView newBannerView, CdpContentModel cdpContentModel) {
        newBannerView.getMax.removeCallbacksAndMessages((Object) null);
        newBannerView.getMax.postDelayed(new onPictureProcessError(newBannerView, cdpContentModel), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    static /* synthetic */ void access$500(NewBannerView newBannerView, final CdpContentModel cdpContentModel) {
        newBannerView.setMin(cdpContentModel);
        DanaH5.startContainerFullUrl("https://m.dana.id/i/dana-my-bills/lifestyle-subscription-list?openSection=gn_strategy", new setCancelOnTouchOutside$core() {
            public final void onContainerDestroyed(@androidx.annotation.Nullable Bundle bundle) {
            }

            public final void onContainerCreated(@Nullable Bundle bundle) {
                NewBannerView.this.announcementPresenter.setMax(r6.getMin);
                if (NewBannerView.this.FastBitmap$CoordinateSystem != null) {
                    NewBannerView.this.FastBitmap$CoordinateSystem.getMax();
                }
            }
        });
    }

    static /* synthetic */ void access$1000(NewBannerView newBannerView) {
        newBannerView.length.removeCallbacksAndMessages((Object) null);
        newBannerView.length.postDelayed(new Runnable(newBannerView) {
            private final NewBannerView getMax;

            {
                this.getMax = r1;
            }

            public final void run() {
                NewBannerView.setMax(this.getMax);
            }
        }, 5000);
    }

    public static /* synthetic */ void setMax(NewBannerView newBannerView) {
        newBannerView.values = false;
        newBannerView.resumeAutoScroll();
    }

    public static /* synthetic */ void getMin(NewBannerView newBannerView, final CdpContentModel cdpContentModel) {
        if (cdpContentModel != null) {
            String str = cdpContentModel.setMin;
            newBannerView.setMax(cdpContentModel, TrackerKey.Event.PROMOTION_BANNER_OPEN);
            char c = 65535;
            int hashCode2 = str.hashCode();
            if (hashCode2 != -1093463061) {
                if (hashCode2 == -838422940 && str.equals("SUBSCRIPTION_SUMMARY")) {
                    c = 0;
                }
            } else if (str.equals("SUBSCRIPTION_PAY_STATUS")) {
                c = 1;
            }
            if (c == 0) {
                newBannerView.setMin(cdpContentModel);
                DanaH5.startContainerFullUrl("https://m.dana.id/i/dana-my-bills/lifestyle-subscription-list?openSection=gn_strategy", new setCancelOnTouchOutside$core() {
                    public final void onContainerDestroyed(@androidx.annotation.Nullable Bundle bundle) {
                    }

                    public final void onContainerCreated(@Nullable Bundle bundle) {
                        NewBannerView.this.announcementPresenter.setMax(cdpContentModel.getMin);
                        if (NewBannerView.this.FastBitmap$CoordinateSystem != null) {
                            NewBannerView.this.FastBitmap$CoordinateSystem.getMax();
                        }
                    }
                });
            } else if (c != 1) {
                newBannerView.length(cdpContentModel.toDoubleRange);
            } else {
                newBannerView.getMin(cdpContentModel);
            }
        }
    }
}
