package id.dana.home.tab;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.LiveData;
import butterknife.BindView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.tabs.TabLayout;
import id.dana.DanaApplication;
import id.dana.appshortcut.DanaAppShortcut;
import id.dana.contract.account.FirstTimeModule;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.homeinfo.HomeInfoModule;
import id.dana.contract.homeinfo.HomeRevampModule;
import id.dana.contract.notification.PushNotificationModule;
import id.dana.contract.promotion.InterstitialPromotionBannerModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.contract.user.GetPocketInfoModule;
import id.dana.danah5.DanaH5;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.di.modules.QrisCrossBorderModule;
import id.dana.explore.model.TrackerExploreDanaOpen;
import id.dana.explore.view.ExploreDanaFragment;
import id.dana.home.HomeFragment;
import id.dana.home.HomeTabActivity;
import id.dana.home.NewHomeFragment;
import id.dana.home.view.MainNavigationTabView;
import id.dana.home.view.NavigationTabView;
import id.dana.home.view.PocketNavigationView;
import id.dana.home.view.ProfileNavigationTabView;
import id.dana.interstitial.InterstitialBannerActivity;
import id.dana.model.CdpContentModel;
import id.dana.model.QrisCrossBorderContentModel;
import id.dana.model.ThirdPartyService;
import id.dana.nearbyme.merchantreview.model.MerchantConsultReviewModel;
import id.dana.pay.PayActivity;
import id.dana.popup.LockableViewPager;
import id.dana.qriscrossborder.view.OnboardingQrisCrossBorderSheetActivity;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.exploredana.ExploreDanaView;
import id.dana.scanner.handler.ScannerViewType;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.mixpanel.TopupSource;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.AutoTransition;
import o.BindView;
import o.BridgeAccessExtension;
import o.CascadingMenuPopup$HorizPosition;
import o.CornerMarkingDataProvider;
import o.FtsOptions$Order;
import o.GriverManifest;
import o.GriverMonitorAnalyticsConfigExtensionImpl;
import o.IH5TinyPopMenu;
import o.InputBridgeExtension;
import o.IntRange;
import o.ListMenuItemView;
import o.LoadingBridgeExtension;
import o.NXEmbedAppExtension;
import o.NXEmbedPageExtension;
import o.NXEmbedViewFactory;
import o.PdfImageSource;
import o.PdfViewerActivity;
import o.PhotoView;
import o.PrepareException;
import o.R;
import o.VersionedParcelize;
import o.WheelView;
import o.WindowBridgeExtension;
import o.WorkerParameters;
import o.Workflow;
import o.convertDipToPx;
import o.convertSpToPx;
import o.destroyItem;
import o.f;
import o.genTextSelector;
import o.getContentInsetEnd;
import o.getDialogLayout;
import o.getDuration;
import o.getMaxTextureSize;
import o.getRef;
import o.getRunningAnimators;
import o.getShortName;
import o.getUseSecurityGuard;
import o.handleSnapshotEvent;
import o.interceptBack;
import o.isShowMenu;
import o.onFinishInflate;
import o.onGridClick;
import o.onMeasure;
import o.onNext;
import o.onRestoreInstanceState;
import o.setCancelOnTouchOutside$core;
import o.setProgressBackgroundColorSchemeColor;
import o.setProgressBackgroundColorSchemeResource;
import o.setUseAmcsLite;
import o.sortChildDrawingOrder;
import o.startScaleDownAnimation;
import o.startUCMIntentLoadUrl;
import o.stopIgnoring;
import o.style;
import o.toggleSoftInput;
import o.updateFavoriteMenuItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HomeTabFragment extends FtsOptions$Order {
    private static final int IsOverlapping = CornerMarkingDataProvider.AnonymousClass2.setMax();
    public static final int setMin = CornerMarkingDataProvider.AnonymousClass2.setMax();
    private static final int toIntRange = CornerMarkingDataProvider.AnonymousClass2.setMax();
    private boolean FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public int Grayscale$Algorithm;
    /* access modifiers changed from: private */
    public PhotoView.PhotoInter ICustomTabsCallback;
    /* access modifiers changed from: private */
    public NavigationTabView Mean$Arithmetic;
    private GriverMonitorAnalyticsConfigExtensionImpl.AnonymousClass1 b;
    @BindView(2131362085)
    ImageButton btnHomeTabPay;
    @BindView(2131362398)
    CoordinatorLayout clContainer;
    /* access modifiers changed from: private */
    public IH5TinyPopMenu create;
    @Inject
    public AutoTransition.length deepLinkPresenter;
    @Inject
    public getShortName dynamicUrlWrapper;
    /* access modifiers changed from: private */
    public final HomeFragment.length equals;
    /* access modifiers changed from: private */
    public boolean extraCallback;
    @Inject
    public getRunningAnimators.setMax featurePresenter;
    @Inject
    public setProgressBackgroundColorSchemeResource.setMax firstTimePresenter;
    /* access modifiers changed from: private */
    public boolean getCause;
    public f.AnonymousClass1 getMin;
    @Inject
    public getDialogLayout.length getPocketPresenter;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    @Inject
    public GriverManifest.AnonymousClass22.getMin h5EventPresenter;
    private boolean hashCode;
    @Inject
    public VersionedParcelize.getMax homePresenter;
    @Inject
    public destroyItem.getMin homeRevampPresenter;
    @Inject
    public WorkerParameters.getMax interstitialPresenter;
    /* access modifiers changed from: private */
    public ProfileNavigationTabView invoke;
    /* access modifiers changed from: private */
    public String invokeSuspend;
    LoadingBridgeExtension isInside;
    private startScaleDownAnimation onNavigationEvent;
    private GriverManifest.AnonymousClass36 onPostMessage;
    /* access modifiers changed from: private */
    public boolean onRelationshipValidationResult;
    @Inject
    public PdfImageSource.setMin playStoreReviewPresenter;
    @Inject
    public sortChildDrawingOrder.getMin pushNotificationPresenter;
    @Inject
    public startUCMIntentLoadUrl.getMin qrisCrossBorderPresenter;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    @Inject
    public BindView.setMin restoreUrlPresenter;
    @Inject
    public R.id.getMax scanQrPresenter;
    public GriverManifest.AnonymousClass53 setMax;
    @butterknife.BindView(2131361963)
    TabLayout tabLayout;
    private getRef toDoubleRange;
    public InputBridgeExtension toFloatRange;
    private BroadcastReceiver toString;
    /* access modifiers changed from: private */
    public PocketNavigationView valueOf;
    /* access modifiers changed from: private */
    public boolean values;
    @butterknife.BindView(2131364645)
    View viewBottomNavSeparator;
    @butterknife.BindView(2131365915)
    LockableViewPager viewPager;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HomeTabVariant {
        public static final String POCKET = "POCKET";
        public static final String TRANSACTION_HISTORY = "TRANSACTION_HISTORY";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocationMode {
        public static final String GLOBAL_NETWORK = "GLOBAL_NETWORK";
        public static final String QRIS_CROSS_BORDER = "QRIS_CROSS_BORDER";
    }

    public final int setMin() {
        return id.dana.R.layout.fragment_home_tab;
    }

    public HomeTabFragment() {
        this((HomeFragment.length) null);
    }

    private HomeTabFragment(HomeFragment.length length) {
        this.valueOf = null;
        this.Mean$Arithmetic = null;
        this.invoke = null;
        this.onRelationshipValidationResult = true;
        this.extraCallback = false;
        this.equals = length;
    }

    public static HomeTabFragment getMin(HomeFragment.length length) {
        return new HomeTabFragment(length);
    }

    public final boolean n_() {
        if (this.viewPager != null) {
            return this.create.getMax();
        }
        return super.n_();
    }

    public final void setMax() {
        Boolean bool;
        PrepareException.AnonymousClass1 r3;
        if (getActivity() != null) {
            this.onPostMessage = (GriverManifest.AnonymousClass36) new onFinishInflate((ListMenuItemView) getActivity(), (onFinishInflate.setMax) new onFinishInflate.setMin()).setMax(GriverManifest.AnonymousClass36.class);
            this.setMax = ((HomeTabActivity) getActivity()).getSwipeDelegateListener();
            if (this.toDoubleRange == null) {
                handleSnapshotEvent.getMin getmin = new handleSnapshotEvent.getMin((byte) 0);
                if (this.getMax != null) {
                    r3 = this.getMax.getApplicationComponent();
                } else {
                    r3 = null;
                }
                if (r3 != null) {
                    getmin.invoke = r3;
                    getmin.getMin = new FirstTimeModule(new setProgressBackgroundColorSchemeResource.setMin() {
                        public final void dismissProgress() {
                        }

                        public final void onError(String str) {
                        }

                        public final void showProgress() {
                        }

                        public final void setMax(boolean z) {
                            boolean unused = HomeTabFragment.this.getCause = z;
                            HomeTabFragment.setMin(HomeTabFragment.this, z);
                            HomeTabFragment.this.firstTimePresenter.getMax();
                        }
                    });
                    getmin.getMax = new HomeInfoModule(new VersionedParcelize.setMin() {
                        public final void dismissProgress() {
                        }

                        public final void onError(String str) {
                        }

                        public final void onGetHomeData(toggleSoftInput togglesoftinput) {
                        }

                        public final void onShouldShowMerchant(MerchantConsultReviewModel merchantConsultReviewModel) {
                        }

                        public final void onShowMerchantReviewCheckingError() {
                        }

                        public final void showProgress() {
                        }

                        public final void onGetHomeInfo(InputBridgeExtension inputBridgeExtension) {
                            String str;
                            InputBridgeExtension unused = HomeTabFragment.this.toFloatRange = inputBridgeExtension;
                            HomeTabFragment.this.Mean$Arithmetic.setUnreadNotif(inputBridgeExtension.length.setMin, inputBridgeExtension.length.getMax());
                            if (HomeTabFragment.this.invoke != null) {
                                ProfileNavigationTabView IsOverlapping = HomeTabFragment.this.invoke;
                                String str2 = HomeTabFragment.this.toFloatRange.getMin;
                                HomeTabFragment homeTabFragment = HomeTabFragment.this;
                                if (homeTabFragment.toFloatRange == null) {
                                    str = "";
                                } else {
                                    str = homeTabFragment.toFloatRange.toIntRange.getMax;
                                }
                                IsOverlapping.setupUserTabIcon(str2, "KYC2".equals(str));
                            }
                        }

                        public final void onShowTooltip(boolean z) {
                            HomeTabFragment.getMin(HomeTabFragment.this, z);
                        }
                    });
                    getmin.setMin = new HomeRevampModule(new destroyItem.setMin() {
                        @JvmDefault
                        public final void dismissProgress() {
                        }

                        @JvmDefault
                        public final void onError(@Nullable String str) {
                        }

                        @JvmDefault
                        public final void showProgress() {
                        }

                        public final void length(boolean z) {
                            boolean unused = HomeTabFragment.this.onRelationshipValidationResult = z;
                            HomeTabFragment.this.homeRevampPresenter.getMin();
                        }

                        public final void getMin(boolean z) {
                            if (HomeTabFragment.this.getMin.getMax(0) != null) {
                                HomeTabFragment.this.getMin.length.add(2, ExploreDanaFragment.setMin(false));
                                HomeTabFragment.this.getMin.notifyDataSetChanged();
                            }
                            if (!z) {
                                HomeTabFragment.this.equals.setMax();
                            }
                            boolean unused = HomeTabFragment.this.extraCallback = z;
                            HomeTabFragment.this.tabLayout.removeAllTabs();
                            HomeTabFragment.this.toDoubleRange();
                        }
                    });
                    getmin.length = new GetPocketInfoModule(new getDialogLayout.getMax() {
                        public final void dismissProgress() {
                        }

                        public final void getMax() {
                        }

                        public final void onError(String str) {
                        }

                        public final void showProgress() {
                        }

                        public final void getMin(int i, String str) {
                            String unused = HomeTabFragment.this.invokeSuspend = str;
                            HomeTabFragment.this.valueOf.setBadge(i > 0);
                        }
                    });
                    getmin.setMax = new InterstitialPromotionBannerModule(new WorkerParameters.length() {
                        public final void dismissProgress() {
                        }

                        public final void showProgress() {
                        }

                        public final void getMin(LoadingBridgeExtension loadingBridgeExtension) {
                            HomeTabFragment.getMax(HomeTabFragment.this, loadingBridgeExtension);
                        }

                        public final void setMin() {
                            HomeTabFragment.getMax(HomeTabFragment.this);
                        }

                        public final void onError(String str) {
                            HomeTabFragment.getMax(HomeTabFragment.this);
                        }
                    });
                    getmin.values = new PushNotificationModule(new sortChildDrawingOrder.length() {
                        public final void dismissProgress() {
                        }

                        public final void onCheckPushNotifDiagnosticFeatureeSuccess(boolean z) {
                        }

                        public final void onError(String str) {
                        }

                        public final void onReportDeviceFailed() {
                        }

                        public final void onReportDeviceSuccess() {
                        }

                        public final void showProgress() {
                        }
                    });
                    getmin.toString = new GlobalNetworkModule(new Workflow() {
                        public final void setMin(boolean z, String str) {
                            HomeTabFragment.getMin(HomeTabFragment.this, z, str);
                        }
                    });
                    getmin.invokeSuspend = new QrisCrossBorderModule(new startUCMIntentLoadUrl.setMin() {
                        @JvmDefault
                        public final void dismissProgress() {
                        }

                        @JvmDefault
                        public final void showProgress() {
                        }

                        public final void getMin(@NotNull QrisCrossBorderContentModel qrisCrossBorderContentModel, @NotNull String str) {
                            HomeTabFragment.setMax(HomeTabFragment.this, qrisCrossBorderContentModel, str);
                        }

                        public final void setMax() {
                            HomeTabFragment.getMax(HomeTabFragment.this);
                        }

                        public final void onError(String str) {
                            HomeTabFragment.getMax(HomeTabFragment.this);
                        }
                    });
                    getmin.hashCode = new PlayStoreReviewModules(new PdfViewerActivity.PageAdapter(getActivity()));
                    getmin.toDoubleRange = new CheckoutH5EventModule(new interceptBack(this));
                    getmin.toIntRange = new DeepLinkModule(DeepLinkModule.getMax(), (byte) 0);
                    getmin.FastBitmap$CoordinateSystem = new ServicesModule((style.getMin) new style.getMin() {
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
                    ScanQrModule.setMin max = ScanQrModule.getMax();
                    max.setMin = getActivity();
                    max.length = ScannerViewType.FRAGMENT;
                    getmin.toFloatRange = new ScanQrModule(max, (byte) 0);
                    getmin.IsOverlapping = new RestoreUrlModule(RestoreUrlModule.setMin(), (byte) 0);
                    FeatureModule.length length = FeatureModule.length();
                    length.setMax = getActivity();
                    getmin.isInside = new FeatureModule(length, (byte) 0);
                    OauthModule.getMax min = OauthModule.setMin();
                    min.setMin = getActivity();
                    getmin.equals = new OauthModule(min, (byte) 0);
                    stopIgnoring.setMin(getmin.setMin, HomeRevampModule.class);
                    stopIgnoring.setMin(getmin.getMin, FirstTimeModule.class);
                    stopIgnoring.setMin(getmin.getMax, HomeInfoModule.class);
                    stopIgnoring.setMin(getmin.length, GetPocketInfoModule.class);
                    stopIgnoring.setMin(getmin.setMax, InterstitialPromotionBannerModule.class);
                    stopIgnoring.setMin(getmin.toIntRange, DeepLinkModule.class);
                    stopIgnoring.setMin(getmin.toFloatRange, ScanQrModule.class);
                    stopIgnoring.setMin(getmin.IsOverlapping, RestoreUrlModule.class);
                    stopIgnoring.setMin(getmin.isInside, FeatureModule.class);
                    stopIgnoring.setMin(getmin.equals, OauthModule.class);
                    if (getmin.FastBitmap$CoordinateSystem == null) {
                        getmin.FastBitmap$CoordinateSystem = new ServicesModule();
                    }
                    stopIgnoring.setMin(getmin.values, PushNotificationModule.class);
                    stopIgnoring.setMin(getmin.hashCode, PlayStoreReviewModules.class);
                    stopIgnoring.setMin(getmin.toDoubleRange, CheckoutH5EventModule.class);
                    stopIgnoring.setMin(getmin.toString, GlobalNetworkModule.class);
                    stopIgnoring.setMin(getmin.invokeSuspend, QrisCrossBorderModule.class);
                    stopIgnoring.setMin(getmin.invoke, PrepareException.AnonymousClass1.class);
                    this.toDoubleRange = new handleSnapshotEvent(getmin.setMin, getmin.getMin, getmin.getMax, getmin.length, getmin.setMax, getmin.toIntRange, getmin.toFloatRange, getmin.IsOverlapping, getmin.isInside, getmin.equals, getmin.FastBitmap$CoordinateSystem, getmin.values, getmin.hashCode, getmin.toDoubleRange, getmin.toString, getmin.invokeSuspend, getmin.invoke, (byte) 0);
                } else {
                    throw null;
                }
            }
            this.toDoubleRange.length(this);
            getMin(this.firstTimePresenter, this.homePresenter, this.interstitialPresenter, this.scanQrPresenter, this.restoreUrlPresenter, this.pushNotificationPresenter, this.deepLinkPresenter, this.readDeepLinkPropertiesPresenter, this.h5EventPresenter, this.playStoreReviewPresenter, this.featurePresenter, this.globalNetworkPresenter, this.homeRevampPresenter);
            DanaApplication danaApplication = (DanaApplication) ((Activity) getContext()).getApplication();
            if (danaApplication != null) {
                bool = danaApplication.getHomeRevamp();
            } else {
                bool = Boolean.FALSE;
            }
            boolean booleanValue = bool.booleanValue();
            this.onRelationshipValidationResult = booleanValue;
            if (booleanValue) {
                this.homeRevampPresenter.getMin();
            }
            if (this.onRelationshipValidationResult) {
                this.homeRevampPresenter.getMin();
            }
            this.homeRevampPresenter.length();
            this.getMin = f.AnonymousClass1.getMax(getChildFragmentManager(), this.equals, this.onRelationshipValidationResult);
            this.viewPager.setSwipeable(false);
            this.create = IH5TinyPopMenu.setMin(this.viewPager, this.getMin);
            this.btnHomeTabPay.setOnTouchListener(new onGridClick(new NXEmbedPageExtension(this), true));
            toDoubleRange();
            this.toString = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    HomeTabFragment.this.readDeepLinkPropertiesPresenter.setMax(intent.getStringExtra("urlDeepLinkH5"));
                }
            };
            if (getContext() != null) {
                getContext().registerReceiver(this.toString, new IntentFilter("deepLinkH5_broadcast_filter"));
            }
            this.deepLinkPresenter.setMin(false);
            if (updateFavoriteMenuItem.setMax()) {
                DanaH5.startContainerFullUrl("https://m.dana.id/m/withdraw");
            }
            if (updateFavoriteMenuItem.getMax()) {
                DanaH5.startContainerFullUrl("https://m.dana.id/m/luckywheel");
            }
            if (updateFavoriteMenuItem.setMin()) {
                String str = updateFavoriteMenuItem.getMin;
                StringBuilder sb = new StringBuilder("https://m.dana.id");
                sb.append(String.format("/m/luckymoney/claim?orderId=%s&isClosable=true", new Object[]{str}));
                DanaH5.startContainerFullUrl(sb.toString());
            }
            if (updateFavoriteMenuItem.getMin()) {
                updateFavoriteMenuItem.getMax = false;
                String readEMoney = this.dynamicUrlWrapper.getReadEMoney();
                Intent intent = (Intent) getActivity().getIntent().getParcelableExtra("android.nfc.extra.TAG");
                if (isShowMenu.length(readEMoney)) {
                    this.readDeepLinkPropertiesPresenter.setMin(readEMoney, intent);
                } else {
                    DanaH5.startContainerFullUrl(readEMoney);
                }
            }
            this.getPocketPresenter.setMin();
            this.pushNotificationPresenter.setMin();
            this.onNavigationEvent = new startScaleDownAnimation(this.getMax);
            CascadingMenuPopup$HorizPosition<Boolean> cascadingMenuPopup$HorizPosition = this.onPostMessage.length;
            if (!cascadingMenuPopup$HorizPosition.setMax()) {
                cascadingMenuPopup$HorizPosition.getMax(getViewLifecycleOwner(), new NXEmbedViewFactory(this));
            }
            if ((getActivity() instanceof HomeTabActivity) && getActivity().getIntent() != null && DanaAppShortcut.getMax(getActivity().getIntent().getExtras()) == 1) {
                startActivityForResult(PayActivity.createPayActivityIntent(this.getMax, TrackerKey.SourceType.HOME_PAY_BUTTON), setMin);
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.homePresenter.length();
        this.FastBitmap$CoordinateSystem = true;
        if ((!values() && equals()) || updateFavoriteMenuItem.length()) {
            setMin(this.isInside);
        }
        startScaleDownAnimation startscaledownanimation = this.onNavigationEvent;
        Intrinsics.checkNotNullParameter(startscaledownanimation, "$this$debounce");
        onRestoreInstanceState onrestoreinstancestate = new onRestoreInstanceState();
        onrestoreinstancestate.setMax(startscaledownanimation, new setProgressBackgroundColorSchemeColor.setMin(new Handler(Looper.getMainLooper()), new setProgressBackgroundColorSchemeColor.getMin(onrestoreinstancestate, startscaledownanimation), startscaledownanimation));
        onrestoreinstancestate.getMax(this, new NXEmbedAppExtension(this));
    }

    public void onPause() {
        super.onPause();
        this.FastBitmap$CoordinateSystem = false;
        startScaleDownAnimation startscaledownanimation = this.onNavigationEvent;
        LiveData.getMin("removeObservers");
        Iterator<Map.Entry<onMeasure<? super T>, LiveData<T>.setMin>> it = startscaledownanimation.getMin.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((LiveData.setMin) next.getValue()).getMin(this)) {
                startscaledownanimation.length((onMeasure) next.getKey());
            }
        }
    }

    public void onDestroy() {
        getContentInsetEnd.getMax(requireContext(), this.toString);
        super.onDestroy();
    }

    public final void o_() {
        IH5TinyPopMenu iH5TinyPopMenu = this.create;
        if (!(iH5TinyPopMenu == null || iH5TinyPopMenu.getMax.getMax(iH5TinyPopMenu.setMin.getCurrentItem()) == null)) {
            IH5TinyPopMenu iH5TinyPopMenu2 = this.create;
            iH5TinyPopMenu2.getMax.getMax(iH5TinyPopMenu2.setMin.getCurrentItem()).o_();
        }
        super.o_();
    }

    private boolean FastBitmap$CoordinateSystem() {
        TabLayout tabLayout2 = this.tabLayout;
        return tabLayout2 != null && tabLayout2.getSelectedTabPosition() == 0;
    }

    private void setMin(List<setUseAmcsLite> list) {
        if (!list.isEmpty() && this.ICustomTabsCallback == null) {
            PhotoView.GridDetector gridDetector = new PhotoView.GridDetector(this.getMax);
            gridDetector.values = list;
            this.ICustomTabsCallback = ((PhotoView.GridDetector) ((PhotoView.GridDetector) ((PhotoView.GridDetector) gridDetector.length(false)).setMin((float) ((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f)))).setMin((PhotoView.FlingRunnable) new getMaxTextureSize() {
                public final void onFinished(int i) {
                    boolean unused = HomeTabFragment.this.getCause = false;
                    PhotoView.PhotoInter unused2 = HomeTabFragment.this.ICustomTabsCallback = null;
                    HomeTabFragment.this.homePresenter.getMin("home_page");
                    HomeTabFragment.this.firstTimePresenter.getMax();
                    HomeTabFragment.getMax(HomeTabFragment.this);
                }
            })).setMin();
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMin(LoadingBridgeExtension loadingBridgeExtension) {
        if (loadingBridgeExtension == null || !loadingBridgeExtension.setMin()) {
            HomeTabActivity homeTabActivity = (HomeTabActivity) this.getMax;
            if (homeTabActivity != null) {
                homeTabActivity.nextOnboardingStep();
                return;
            }
            return;
        }
        this.hashCode = false;
        CdpContentModel cdpContentModel = loadingBridgeExtension.setMin() ? loadingBridgeExtension.setMin.get(0) : new CdpContentModel();
        if (TextUtils.isEmpty(cdpContentModel.setMax)) {
            HomeTabActivity homeTabActivity2 = (HomeTabActivity) this.getMax;
            if (homeTabActivity2 != null) {
                homeTabActivity2.nextOnboardingStep();
                return;
            }
            return;
        }
        startActivityForResult(InterstitialBannerActivity.createIntent(this.getMax, cdpContentModel, loadingBridgeExtension.hashCode), toIntRange);
    }

    /* access modifiers changed from: private */
    public void toDoubleRange() {
        setMin(this.onRelationshipValidationResult, this.extraCallback);
        this.btnHomeTabPay.setVisibility(this.onRelationshipValidationResult ? 0 : 8);
        this.tabLayout.clearOnTabSelectedListeners();
        TabLayout tabLayout2 = this.tabLayout;
        final boolean z = this.extraCallback;
        tabLayout2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {
            public final void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (HomeTabFragment.this.getMax(position)) {
                    HomeTabFragment.this.tabLayout.getTabAt(HomeTabFragment.this.Grayscale$Algorithm).getCustomView().setSelected(false);
                }
                tab.getCustomView().setSelected(HomeTabFragment.this.getMin(position));
                HomeTabFragment.getMax(HomeTabFragment.this, position, z);
                int currentItem = HomeTabFragment.this.create.setMin.getCurrentItem();
                int i = currentItem == 1 ? 4 : currentItem;
                if (HomeTabFragment.this.extraCallback && currentItem == 2) {
                    i = 3;
                }
                HomeTabFragment.this.tabLayout.getTabAt(i).getCustomView().setSelected(true);
                if (position == 0) {
                    HomeTabFragment homeTabFragment = HomeTabFragment.this;
                    if ((!homeTabFragment.values() && homeTabFragment.equals()) || updateFavoriteMenuItem.length()) {
                        homeTabFragment.setMin(homeTabFragment.isInside);
                    }
                }
            }

            public final void onTabUnselected(TabLayout.Tab tab) {
                int unused = HomeTabFragment.this.Grayscale$Algorithm = tab.getPosition();
                View customView = tab.getCustomView();
                HomeTabFragment homeTabFragment = HomeTabFragment.this;
                customView.setSelected(homeTabFragment.getMin(homeTabFragment.Grayscale$Algorithm));
            }

            public final void onTabReselected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                HomeTabFragment homeTabFragment = HomeTabFragment.this;
                HomeTabFragment.getMax(homeTabFragment, position, homeTabFragment.extraCallback);
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean getMax(int i) {
        if (this.Grayscale$Algorithm == 0 && i == 4) {
            return true;
        }
        if (this.Grayscale$Algorithm == 4 && i == 0) {
            return true;
        }
        if (this.Grayscale$Algorithm == 0 && i == 3) {
            return true;
        }
        if (this.Grayscale$Algorithm == 3 && i == 0) {
            return true;
        }
        if (this.Grayscale$Algorithm == 4 && i == 3) {
            return true;
        }
        return this.Grayscale$Algorithm == 3 && i == 4;
    }

    /* access modifiers changed from: private */
    public boolean getMin(int i) {
        if (i != 0) {
            return (this.extraCallback && i == 3) || i == 4;
        }
        return true;
    }

    private void setMin(boolean z, boolean z2) {
        this.tabLayout.removeAllTabs();
        NavigationTabView navigationTabView = new NavigationTabView(getContext(), (int) id.dana.R.drawable.ic_nav_history, getString(id.dana.R.string.nav_history_title));
        this.Mean$Arithmetic = navigationTabView;
        navigationTabView.setContentDescription(getResources().getString(id.dana.R.string.btnHistory));
        this.valueOf = new PocketNavigationView(getContext(), (int) id.dana.R.drawable.ic_nav_pocket, getString(id.dana.R.string.nav_pocket_title));
        ProfileNavigationTabView profileNavigationTabView = new ProfileNavigationTabView(getContext());
        this.invoke = profileNavigationTabView;
        profileNavigationTabView.setContentDescription(getResources().getString(id.dana.R.string.btnMePage));
        TabLayout tabLayout2 = this.tabLayout;
        tabLayout2.addTab(tabLayout2.newTab().setCustomView((View) new NavigationTabView(getContext(), (int) id.dana.R.drawable.ic_nav_home, getString(id.dana.R.string.nav_home_title))));
        TabLayout tabLayout3 = this.tabLayout;
        tabLayout3.addTab(tabLayout3.newTab().setCustomView((View) this.Mean$Arithmetic));
        TabLayout tabLayout4 = this.tabLayout;
        tabLayout4.addTab(tabLayout4.newTab().setCustomView((View) MainNavigationTabView.generate(getContext(), z)));
        if (z2) {
            TabLayout tabLayout5 = this.tabLayout;
            tabLayout5.addTab(tabLayout5.newTab().setCustomView((View) new NavigationTabView(getContext(), (int) id.dana.R.drawable.ic_nav_explore, getString(id.dana.R.string.nav_explore_title))));
        } else {
            TabLayout tabLayout6 = this.tabLayout;
            tabLayout6.addTab(tabLayout6.newTab().setCustomView((View) this.valueOf));
        }
        if (z) {
            TabLayout tabLayout7 = this.tabLayout;
            tabLayout7.addTab(tabLayout7.newTab().setCustomView((View) this.invoke));
            return;
        }
        TabLayout tabLayout8 = this.tabLayout;
        tabLayout8.addTab(tabLayout8.newTab().setCustomView((View) new NavigationTabView(getContext(), (int) id.dana.R.drawable.ic_nav_me, getString(id.dana.R.string.nav_me_title))).setContentDescription((CharSequence) getString(id.dana.R.string.btn_me_page)));
    }

    private void getMax(String str, String str2) {
        convertDipToPx.length length = new convertDipToPx.length(getContext().getApplicationContext());
        length.getMax = str;
        if (str2 != null) {
            length.setMax("Source", str2);
        }
        length.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    private void setMax(String str, final String str2) {
        if (!WindowBridgeExtension.AnonymousClass1.getMin()) {
            DanaH5.startContainerFullUrl(str, new setCancelOnTouchOutside$core() {
                public final void onContainerCreated(Bundle bundle) {
                }

                public final void onContainerDestroyed(Bundle bundle) {
                    HomeTabFragment.this.homePresenter.length();
                    HomeTabFragment.this.h5EventPresenter.length();
                    if (HomeTabVariant.POCKET.equals(str2)) {
                        HomeTabFragment.this.valueOf.setBadge(false);
                    } else if (HomeTabVariant.TRANSACTION_HISTORY.equals(str2)) {
                        HomeTabFragment.this.Mean$Arithmetic.setUnreadNotif(0, false);
                        if (HomeTabFragment.this.values) {
                            HomeTabFragment.this.playStoreReviewPresenter.length();
                        }
                    }
                }
            });
        }
        this.values = false;
        this.h5EventPresenter.getMin();
    }

    public final void getMax() {
        HomeFragment homeFragment;
        if (!this.onRelationshipValidationResult && (this.getMin.getMax(0) instanceof HomeFragment) && (homeFragment = (HomeFragment) this.getMin.getMax(0)) != null) {
            homeFragment.globalSearchHintView.setHintVisibility(false);
            homeFragment.globalSearchPresenter.setMax(false);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        HomeTabActivity homeTabActivity;
        String str;
        GriverManifest.AnonymousClass53 r0;
        if (setMin == i && i2 == 0 && intent != null) {
            if (intent.getBooleanExtra(PayActivity.CANCEL_TO_SCAN, false) && (r0 = this.setMax) != null) {
                r0.getMin();
                return;
            }
        } else if (toIntRange == i) {
            if (-1 == i2 && intent != null) {
                this.interstitialPresenter.getMax();
                this.interstitialPresenter.length();
                CdpContentModel cdpContentModel = (CdpContentModel) intent.getParcelableExtra(InterstitialBannerActivity.KEY_CDPCONTENTMODEL);
                String stringExtra = intent.getStringExtra(InterstitialBannerActivity.KEY_SPACECODE);
                boolean booleanExtra = intent.getBooleanExtra(InterstitialBannerActivity.KEY_BANNERREAD, false);
                if (cdpContentModel != null) {
                    if (!TextUtils.isEmpty(cdpContentModel.getMin)) {
                        this.interstitialPresenter.length(cdpContentModel.getMin);
                    }
                    String length = isShowMenu.length(cdpContentModel.toDoubleRange, TopupSource.PROMOTION_BANNER);
                    if (booleanExtra && !TextUtils.isEmpty(length)) {
                        convertDipToPx.length max = new convertDipToPx.length(getContext()).setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_ID, cdpContentModel.getMin).setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_TYPE, cdpContentModel.setMin).setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_NAME, cdpContentModel.getMax);
                        Date date = cdpContentModel.isInside;
                        if (WheelView.OnWheelViewListener.getMax == null) {
                            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
                        }
                        Locale locale = WheelView.OnWheelViewListener.getMax;
                        if (date == null) {
                            str = null;
                        } else {
                            str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale).format(date);
                        }
                        convertDipToPx.length max2 = max.setMax(TrackerKey.PromotionProperty.PROMOTION_EXPIRY_DATE, str).setMax(TrackerKey.PromotionProperty.PROMOTION_SPACE_CODE, stringExtra);
                        max2.getMax = TrackerKey.Event.PROMOTION_BANNER_OPEN;
                        max2.setMin();
                        genTextSelector.getMax(new convertDipToPx(max2, (byte) 0));
                        if (isShowMenu.length(length)) {
                            this.readDeepLinkPropertiesPresenter.setMin(length, (Intent) null);
                        } else {
                            DanaH5.startContainerFullUrl(length);
                        }
                    }
                }
            }
            HomeTabActivity homeTabActivity2 = (HomeTabActivity) this.getMax;
            if (homeTabActivity2 != null) {
                homeTabActivity2.nextOnboardingStep();
                return;
            }
            return;
        } else if (ExploreDanaView.EXPLORE_DANA_REQUEST_CODE == i) {
            f.AnonymousClass1 r02 = this.getMin;
            if (r02 != null && r02.getMax(0) != null) {
                this.getMin.getMax(0).onActivityResult(i, i2, intent);
                return;
            }
            return;
        } else if (IsOverlapping == i && (homeTabActivity = (HomeTabActivity) this.getMax) != null) {
            homeTabActivity.nextOnboardingStep();
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void setMax(String str) {
        startUCMIntentLoadUrl.getMin getmin;
        onNext.setMin setmin;
        if (LocationMode.GLOBAL_NETWORK.equals(str) && (setmin = this.globalNetworkPresenter) != null) {
            setmin.getMin();
        } else if (!LocationMode.QRIS_CROSS_BORDER.equals(str) || (getmin = this.qrisCrossBorderPresenter) == null) {
            HomeTabActivity homeTabActivity = (HomeTabActivity) this.getMax;
            if (homeTabActivity != null) {
                homeTabActivity.nextOnboardingStep();
            }
        } else {
            getmin.setMin();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean equals() {
        return FastBitmap$CoordinateSystem() && this.hashCode;
    }

    /* access modifiers changed from: package-private */
    public final boolean values() {
        VersionedParcelize.getMax getmax;
        if (!this.getCause || (getmax = this.homePresenter) == null) {
            return false;
        }
        getmax.getMax("home_page");
        return true;
    }

    static /* synthetic */ void setMax(HomeTabFragment homeTabFragment, QrisCrossBorderContentModel qrisCrossBorderContentModel, String str) {
        Intent intent = new Intent(homeTabFragment.getContext(), OnboardingQrisCrossBorderSheetActivity.class);
        intent.putExtra(OnboardingQrisCrossBorderSheetActivity.EXTRA_QCB_CONTENT, qrisCrossBorderContentModel);
        intent.putExtra(OnboardingQrisCrossBorderSheetActivity.EXTRA_QCB_COUNTRY_CODE, str);
        homeTabFragment.startActivityForResult(intent, IsOverlapping);
    }

    static /* synthetic */ void getMax(HomeTabFragment homeTabFragment) {
        HomeTabActivity homeTabActivity = (HomeTabActivity) homeTabFragment.getMax;
        if (homeTabActivity != null) {
            homeTabActivity.nextOnboardingStep();
        }
    }

    static /* synthetic */ void getMin(HomeTabFragment homeTabFragment, boolean z, String str) {
        if (z) {
            homeTabFragment.onPostMessage.getMin.getMax(str);
            homeTabFragment.onPostMessage.getMax.getMax(Boolean.TRUE);
            return;
        }
        HomeTabActivity homeTabActivity = (HomeTabActivity) homeTabFragment.getMax;
        if (homeTabActivity != null) {
            homeTabActivity.nextOnboardingStep();
        }
    }

    static /* synthetic */ void getMax(HomeTabFragment homeTabFragment, LoadingBridgeExtension loadingBridgeExtension) {
        if (!homeTabFragment.FastBitmap$CoordinateSystem() || !homeTabFragment.FastBitmap$CoordinateSystem) {
            homeTabFragment.hashCode = true;
            homeTabFragment.isInside = loadingBridgeExtension;
            HomeTabActivity homeTabActivity = (HomeTabActivity) homeTabFragment.getMax;
            if (homeTabActivity != null) {
                homeTabActivity.nextOnboardingStep();
                return;
            }
            return;
        }
        homeTabFragment.setMin(loadingBridgeExtension);
    }

    static /* synthetic */ void getMin(HomeTabFragment homeTabFragment, boolean z) {
        if (!z || !homeTabFragment.FastBitmap$CoordinateSystem() || !homeTabFragment.FastBitmap$CoordinateSystem) {
            HomeTabActivity homeTabActivity = (HomeTabActivity) homeTabFragment.getMax;
            if (homeTabActivity != null) {
                homeTabActivity.nextOnboardingStep();
                return;
            }
            return;
        }
        FtsOptions$Order length = homeTabFragment.getMin.getMax(0);
        if (length instanceof HomeFragment) {
            HomeFragment homeFragment = (HomeFragment) homeTabFragment.getMin.getMax(0);
            if (homeFragment != null && homeFragment.k_()) {
                ArrayList arrayList = new ArrayList();
                if (!(homeFragment.gmvScan == null || homeFragment.gmvTopup == null || homeFragment.gmvSend == null || homeFragment.gmvRequest == null)) {
                    arrayList.add(homeFragment.getMin(homeFragment.gmvScan, new getUseSecurityGuard((float) HomeFragment.getMin), id.dana.R.string.tooltip_home_scan_title, id.dana.R.string.tooltip_home_scan_desc, id.dana.R.drawable.ic_tooltip_home_scan));
                    arrayList.add(homeFragment.getMin(homeFragment.gmvTopup, new getUseSecurityGuard((float) HomeFragment.getMin), id.dana.R.string.tooltip_home_topup_title, id.dana.R.string.tooltip_home_topup_desc, id.dana.R.drawable.ic_tooltip_home_top_up));
                    arrayList.add(homeFragment.getMin(homeFragment.gmvSend, new getUseSecurityGuard((float) HomeFragment.getMin), id.dana.R.string.tooltip_home_send_title, id.dana.R.string.tooltip_home_send_desc, id.dana.R.drawable.ic_tooltip_home_send));
                    arrayList.add(homeFragment.getMin(homeFragment.gmvRequest, new getUseSecurityGuard((float) HomeFragment.getMin), id.dana.R.string.tooltip_home_request_title, id.dana.R.string.tooltip_home_request_desc, id.dana.R.drawable.ic_tooltip_home_request));
                }
                homeTabFragment.setMin((List<setUseAmcsLite>) arrayList);
            }
        } else if (length instanceof NewHomeFragment) {
            NewHomeFragment newHomeFragment = (NewHomeFragment) homeTabFragment.getMin.getMax(0);
            if (newHomeFragment != null && newHomeFragment.k_()) {
                ArrayList arrayList2 = new ArrayList();
                if (!(newHomeFragment.gmvScan == null || newHomeFragment.gmvTopup == null || newHomeFragment.gmvSend == null || newHomeFragment.gmvRequest == null)) {
                    arrayList2.add(newHomeFragment.getMin(newHomeFragment.gmvScan, new getUseSecurityGuard((float) NewHomeFragment.getMin), id.dana.R.string.tooltip_home_scan_title, id.dana.R.string.tooltip_home_scan_desc, id.dana.R.drawable.ic_tooltip_home_scan));
                    arrayList2.add(newHomeFragment.getMin(newHomeFragment.gmvTopup, new getUseSecurityGuard((float) NewHomeFragment.getMin), id.dana.R.string.tooltip_home_topup_title, id.dana.R.string.tooltip_home_topup_desc, id.dana.R.drawable.ic_tooltip_home_top_up));
                    arrayList2.add(newHomeFragment.getMin(newHomeFragment.gmvSend, new getUseSecurityGuard((float) NewHomeFragment.getMin), id.dana.R.string.tooltip_home_send_title, id.dana.R.string.tooltip_home_send_desc, id.dana.R.drawable.ic_tooltip_home_send));
                    arrayList2.add(newHomeFragment.getMin(newHomeFragment.gmvRequest, new getUseSecurityGuard((float) NewHomeFragment.getMin), id.dana.R.string.tooltip_home_request_title, id.dana.R.string.tooltip_home_request_desc, id.dana.R.drawable.ic_tooltip_home_request));
                }
                homeTabFragment.setMin((List<setUseAmcsLite>) arrayList2);
            }
        } else {
            HomeTabActivity homeTabActivity2 = (HomeTabActivity) homeTabFragment.getMax;
            if (homeTabActivity2 != null) {
                homeTabActivity2.nextOnboardingStep();
            }
        }
    }

    static /* synthetic */ void setMin(HomeTabFragment homeTabFragment, boolean z) {
        if (!z) {
            HomeTabActivity homeTabActivity = (HomeTabActivity) homeTabFragment.getMax;
            if (homeTabActivity != null) {
                homeTabActivity.nextOnboardingStep();
            }
        } else if ((!homeTabFragment.values() && homeTabFragment.equals()) || updateFavoriteMenuItem.length()) {
            homeTabFragment.setMin(homeTabFragment.isInside);
        }
    }

    static /* synthetic */ void getMax(HomeTabFragment homeTabFragment, int i, boolean z) {
        if (i == 0) {
            homeTabFragment.create.setMin.setCurrentItem(0);
        } else if (i == 1) {
            homeTabFragment.getMax(TrackerKey.Event.TRANSACTION_HISTORY_OPEN, (String) null);
            if (homeTabFragment.Mean$Arithmetic.hasUnreadNotif()) {
                homeTabFragment.setMax(homeTabFragment.dynamicUrlWrapper.getTransactionProgressingUrl(), HomeTabVariant.TRANSACTION_HISTORY);
            } else {
                homeTabFragment.setMax(homeTabFragment.dynamicUrlWrapper.getTransactionCompletedUrl(), HomeTabVariant.TRANSACTION_HISTORY);
            }
        } else if (i == 2) {
            homeTabFragment.startActivityForResult(PayActivity.createPayActivityIntent(homeTabFragment.getMax, TrackerKey.SourceType.HOME_PAY_BUTTON), setMin);
        } else if (i != 3) {
            if (i == 4) {
                homeTabFragment.getMax(TrackerKey.Event.PROFILE_PAGE_OPEN, TrackerKey.SourceType.CLICK);
                homeTabFragment.create.setMin.setCurrentItem(1);
            }
        } else if (z) {
            homeTabFragment.create.setMin.setCurrentItem(2);
            TrackerExploreDanaOpen.setExploreDanaOpen("Home");
            if (((ExploreDanaFragment) homeTabFragment.create.getMax.getMax(2)) != null) {
                GriverManifest.AnonymousClass11 r4 = ((ExploreDanaFragment) homeTabFragment.create.getMax.getMax(2)).globalSearchAnalyticTracker;
                if (r4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("globalSearchAnalyticTracker");
                }
                r4.getMax();
            }
        } else {
            homeTabFragment.getMax(TrackerKey.Event.POCKET_OPEN, (String) null);
            if (homeTabFragment.invokeSuspend == null) {
                homeTabFragment.invokeSuspend = homeTabFragment.dynamicUrlWrapper.getPocketUrl();
            }
            homeTabFragment.setMax(homeTabFragment.invokeSuspend, HomeTabVariant.POCKET);
        }
    }

    public static /* synthetic */ void getMin(HomeTabFragment homeTabFragment, Boolean bool) {
        if (homeTabFragment.b == null) {
            homeTabFragment.b = new Object(homeTabFragment.getMax, homeTabFragment.clContainer) {
                public final Activity getMax;
                final int getMin;
                public BridgeAccessExtension length;
                public final ViewGroup setMin;

                {
                    int i;
                    Intrinsics.checkNotNullParameter(r2, AkuEventParamsKey.KEY_ACTIVITY);
                    Intrinsics.checkNotNullParameter(r3, "viewGroup");
                    this.getMax = r2;
                    this.setMin = r3;
                    if (CornerMarkingDataProvider.length()) {
                        Window window = this.getMax.getWindow();
                        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
                        i = window.getNavigationBarColor();
                    } else {
                        i = 0;
                    }
                    this.getMin = i;
                    BridgeAccessExtension.length length2 = BridgeAccessExtension.getMin;
                    this.length = BridgeAccessExtension.length.length(this.setMin, true);
                }

                public final void length(int i) {
                    if (CornerMarkingDataProvider.length() && this.getMax.getWindow() != null) {
                        Window window = this.getMax.getWindow();
                        Window window2 = this.getMax.getWindow();
                        Intrinsics.checkNotNullExpressionValue(window2, "activity.window");
                        ObjectAnimator.ofArgb(window, "navigationBarColor", new int[]{window2.getNavigationBarColor(), i}).start();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"id/dana/home/tab/ConnectivitySnackbarManager$getSnackbarCallback$1", "Lcom/google/android/material/snackbar/BaseTransientBottomBar$BaseCallback;", "Lid/dana/home/tab/InternetConnectivitySnackbar;", "onDismissed", "", "transientBottomBar", "event", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                /* renamed from: o.GriverMonitorAnalyticsConfigExtensionImpl$1$length */
                public static final class length extends BaseTransientBottomBar.BaseCallback<BridgeAccessExtension> {
                    final /* synthetic */ AnonymousClass1 getMax;

                    public length(AnonymousClass1 r1) {
                        this.getMax = r1;
                    }

                    public final /* synthetic */ void onDismissed(Object obj, int i) {
                        int max = dispatchOnCancelled.setMax(i);
                        if (i != max) {
                            onCanceled oncanceled = new onCanceled(i, max, 1);
                            onCancelLoad.setMax(1542108450, oncanceled);
                            onCancelLoad.getMin(1542108450, oncanceled);
                        }
                        Intrinsics.checkNotNullParameter((BridgeAccessExtension) obj, "transientBottomBar");
                        AnonymousClass1 r4 = this.getMax;
                        r4.length(r4.getMin);
                    }
                }
            };
        }
        GriverMonitorAnalyticsConfigExtensionImpl.AnonymousClass1 r4 = homeTabFragment.b;
        boolean booleanValue = bool.booleanValue();
        boolean isShown = r4.length.isShown();
        int i = id.dana.R.color.f20292131099937;
        if (isShown) {
            if (!r4.length.getMin() && booleanValue) {
                BridgeAccessExtension bridgeAccessExtension = r4.length;
                bridgeAccessExtension.getMax(booleanValue);
                Context context = r4.getMax;
                if (!booleanValue) {
                    i = id.dana.R.color.f23802131100313;
                }
                r4.length(IntRange.setMax(context, i));
                bridgeAccessExtension.show();
            }
        } else if (!booleanValue) {
            BridgeAccessExtension.length length = BridgeAccessExtension.getMin;
            BridgeAccessExtension length2 = BridgeAccessExtension.length.length(r4.setMin, booleanValue);
            length2.addCallback(new GriverMonitorAnalyticsConfigExtensionImpl.AnonymousClass1.length(r4));
            Context context2 = r4.getMax;
            if (!booleanValue) {
                i = id.dana.R.color.f23802131100313;
            }
            r4.length(IntRange.setMax(context2, i));
            length2.show();
            Unit unit = Unit.INSTANCE;
            r4.length = length2;
        }
    }

    public static /* synthetic */ void getMax(HomeTabFragment homeTabFragment, Boolean bool) {
        HomeTabActivity homeTabActivity;
        if (Boolean.TRUE.equals(bool) && (homeTabActivity = (HomeTabActivity) homeTabFragment.getMax) != null) {
            homeTabActivity.nextOnboardingStep();
        }
    }
}
