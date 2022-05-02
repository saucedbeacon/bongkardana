package id.dana.richview.servicescard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import dagger.internal.InjectedFieldSignature;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import id.dana.model.ThirdPartyService;
import id.dana.onboarding.OnboardingParams;
import id.dana.richview.servicescard.ServiceCardView;
import id.dana.service.ServicesActivity;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.BasePrepareController;
import o.GriverManifest;
import o.GriverPageContainer;
import o.Ignore;
import o.JSONReader;
import o.PdfImageSource;
import o.PdfViewerActivity;
import o.PrepareException;
import o.WindowBridgeExtension;
import o.Workflow;
import o.appendExtraSystemInfo;
import o.convertDipToPx;
import o.convertSpToPx;
import o.genTextSelector;
import o.getDuration;
import o.getPerformanceTracker;
import o.getSelectedIndex;
import o.isShowMenu;
import o.onNext;
import o.onOrientationChanged;
import o.projection;
import o.setCancelOnTouchOutside$core;
import o.stopIgnoring;
import o.style;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;

public class ServiceCardView extends BaseRichView {
    @Inject
    public getPerformanceTracker deviceInformationProvider;
    /* access modifiers changed from: private */
    public boolean getMin;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    @Inject
    public GriverManifest.AnonymousClass22.getMin h5EventPresenter;
    /* access modifiers changed from: private */
    public String length;
    @Inject
    public getSelectedIndex.length onBoardingServicePresenter;
    @Inject
    public PdfImageSource.setMin playStoreReviewPresenter;
    @Inject
    public style.length presenter;
    @Inject
    public getDuration.length readLinkPropertiesPresenter;
    @BindView(2131364051)
    RecyclerView rvService;
    private JSONReader setMax;
    /* access modifiers changed from: private */
    public onOrientationChanged setMin;

    public int getLayout() {
        return R.layout.view_service_card;
    }

    public ServiceCardView(@NonNull Context context) {
        super(context);
    }

    public ServiceCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ServiceCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ServiceCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public View getPromotedServiceView() {
        RecyclerView.IsOverlapping layoutManager = this.rvService.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.findViewByPosition(0);
        }
        return null;
    }

    public void injectComponent(PrepareException.AnonymousClass1 r19) {
        if (this.setMax == null) {
            BasePrepareController.setMax setmax = new BasePrepareController.setMax((byte) 0);
            if (r19 != null) {
                setmax.FastBitmap$CoordinateSystem = r19;
                DeepLinkModule.setMin max = DeepLinkModule.getMax();
                max.getMax = getBaseActivity();
                max.length = TrackerKey.SourceType.SERVICES;
                setmax.getMin = new DeepLinkModule(max, (byte) 0);
                ScanQrModule.setMin max2 = ScanQrModule.getMax();
                max2.setMin = getBaseActivity();
                setmax.setMax = new ScanQrModule(max2, (byte) 0);
                RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
                min.getMax = getBaseActivity();
                setmax.IsOverlapping = new RestoreUrlModule(min, (byte) 0);
                FeatureModule.length length2 = FeatureModule.length();
                length2.setMax = getBaseActivity();
                setmax.equals = new FeatureModule(length2, (byte) 0);
                OauthModule.getMax min2 = OauthModule.setMin();
                min2.setMin = getBaseActivity();
                setmax.isInside = new OauthModule(min2, (byte) 0);
                setmax.getMax = new CheckoutH5EventModule(new GriverManifest.AnonymousClass22.length(this) {
                    private final ServiceCardView length;

                    {
                        this.length = r1;
                    }

                    public final void setMin(boolean z) {
                        this.length.getMin = z;
                    }

                    /* renamed from: o.CameraUtils$1$1  reason: invalid class name */
                    public final class AnonymousClass1 implements getBindingAdapter<ServiceCardView> {
                        @InjectedFieldSignature("id.dana.richview.servicescard.ServiceCardView.deviceInformationProvider")
                        public static void getMax(ServiceCardView serviceCardView, getPerformanceTracker getperformancetracker) {
                            serviceCardView.deviceInformationProvider = getperformancetracker;
                        }

                        @InjectedFieldSignature("id.dana.richview.servicescard.ServiceCardView.h5EventPresenter")
                        public static void setMax(ServiceCardView serviceCardView, GriverManifest.AnonymousClass22.getMin getmin) {
                            serviceCardView.h5EventPresenter = getmin;
                        }

                        @InjectedFieldSignature("id.dana.richview.servicescard.ServiceCardView.playStoreReviewPresenter")
                        public static void getMin(ServiceCardView serviceCardView, PdfImageSource.setMin setmin) {
                            serviceCardView.playStoreReviewPresenter = setmin;
                        }

                        @InjectedFieldSignature("id.dana.richview.servicescard.ServiceCardView.presenter")
                        public static void setMax(ServiceCardView serviceCardView, style.length length) {
                            serviceCardView.presenter = length;
                        }

                        @InjectedFieldSignature("id.dana.richview.servicescard.ServiceCardView.readLinkPropertiesPresenter")
                        public static void length(ServiceCardView serviceCardView, getDuration.length length) {
                            serviceCardView.readLinkPropertiesPresenter = length;
                        }

                        @InjectedFieldSignature("id.dana.richview.servicescard.ServiceCardView.onBoardingServicePresenter")
                        public static void setMax(ServiceCardView serviceCardView, getSelectedIndex.length length) {
                            serviceCardView.onBoardingServicePresenter = length;
                        }

                        @InjectedFieldSignature("id.dana.richview.servicescard.ServiceCardView.globalNetworkPresenter")
                        public static void getMin(ServiceCardView serviceCardView, onNext.setMin setmin) {
                            serviceCardView.globalNetworkPresenter = setmin;
                        }
                    }
                });
                setmax.length = new PlayStoreReviewModules(new PdfViewerActivity.PageAdapter(getBaseActivity()));
                setmax.toFloatRange = new ServicesModule((style.getMin) new style.getMin() {
                    public final void dismissProgress() {
                    }

                    @JvmDefault
                    public final void getMax(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    public final void getMin(List<ThirdPartyService> list) {
                    }

                    public final void length() {
                    }

                    public final void setMax(boolean z) {
                    }

                    @JvmDefault
                    public final void setMin(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    public final void showProgress() {
                    }

                    public final void getMax(ThirdPartyService thirdPartyService, String str) {
                        ServiceCardView.access$400(ServiceCardView.this, thirdPartyService, isShowMenu.setMin(thirdPartyService.toIntRange), str, ServiceCardView.this.deviceInformationProvider.getDeviceUUID());
                    }

                    public final void setMin() {
                        ServiceCardView.this.enableClick();
                    }

                    public final void setMax(@NotNull List<ThirdPartyService> list) {
                        ServiceCardView.access$600(ServiceCardView.this, list);
                    }

                    public final void onError(String str) {
                        ServiceCardView.this.enableClick();
                    }

                    public final void setMin(ThirdPartyService thirdPartyService) {
                        if (isShowMenu.length(thirdPartyService.IsOverlapping)) {
                            ServiceCardView.this.readLinkPropertiesPresenter.setMax(thirdPartyService.IsOverlapping);
                        } else {
                            ServiceCardView.access$400(ServiceCardView.this, thirdPartyService, isShowMenu.setMin(thirdPartyService.IsOverlapping), (String) null, (String) null);
                        }
                    }

                    public final void getMax(ThirdPartyService thirdPartyService) {
                        if (thirdPartyService.values == 0) {
                            StringBuilder sb = new StringBuilder("https://m.dana.id");
                            sb.append(String.format("/i/biller-app/maintenance?serviceName=%s", new Object[]{thirdPartyService.isInside}));
                            DanaH5.startContainerFullUrl(sb.toString());
                        }
                    }
                });
                setmax.setMin = new BottomSheetOnBoardingModule(new getSelectedIndex.setMax() {
                    @JvmDefault
                    public final void dismissProgress() {
                    }

                    public final void setMax(boolean z, @org.jetbrains.annotations.Nullable String str) {
                    }

                    @JvmDefault
                    public final void showProgress() {
                    }

                    public final void onGetBottomSheetOnBoardingAvailability(boolean z, String str) {
                        if (z) {
                            str = isShowMenu.getMin(str, OnboardingParams.FIRST_TIME_TOP_UP);
                        }
                        DanaH5.startContainerFullUrlWithSendCredentials(str, ServiceCardView.access$200(ServiceCardView.this));
                        ServiceCardView.access$300(ServiceCardView.this);
                    }

                    public final void onError(String str) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(getClass().getName());
                        sb.append("on Error: ");
                        sb.append(str);
                        updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString());
                    }
                });
                setmax.toIntRange = new GlobalNetworkModule(new Workflow() {
                    public final void getMin(boolean z) {
                        if (!TextUtils.isEmpty(ServiceCardView.this.length)) {
                            ServiceCardView serviceCardView = ServiceCardView.this;
                            ServiceCardView.access$100(serviceCardView, serviceCardView.length, z);
                        }
                    }
                });
                stopIgnoring.setMin(setmax.length, PlayStoreReviewModules.class);
                stopIgnoring.setMin(setmax.getMax, CheckoutH5EventModule.class);
                stopIgnoring.setMin(setmax.setMin, BottomSheetOnBoardingModule.class);
                stopIgnoring.setMin(setmax.getMin, DeepLinkModule.class);
                stopIgnoring.setMin(setmax.setMax, ScanQrModule.class);
                stopIgnoring.setMin(setmax.IsOverlapping, RestoreUrlModule.class);
                stopIgnoring.setMin(setmax.equals, FeatureModule.class);
                stopIgnoring.setMin(setmax.isInside, OauthModule.class);
                if (setmax.toFloatRange == null) {
                    setmax.toFloatRange = new ServicesModule();
                }
                stopIgnoring.setMin(setmax.toIntRange, GlobalNetworkModule.class);
                stopIgnoring.setMin(setmax.FastBitmap$CoordinateSystem, PrepareException.AnonymousClass1.class);
                this.setMax = new BasePrepareController(setmax.length, setmax.getMax, setmax.setMin, setmax.getMin, setmax.setMax, setmax.IsOverlapping, setmax.equals, setmax.isInside, setmax.toFloatRange, setmax.toIntRange, setmax.FastBitmap$CoordinateSystem, (byte) 0);
            } else {
                throw null;
            }
        }
        this.setMax.setMax(this);
        registerPresenter(this.presenter, this.playStoreReviewPresenter, this.readLinkPropertiesPresenter, this.onBoardingServicePresenter, this.globalNetworkPresenter);
    }

    public void setup() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        gridLayoutManager.toIntRange = new GridLayoutManager.length() {
            public final int getMin(int i) {
                return i == 0 ? 4 : 1;
            }
        };
        this.rvService.setLayoutManager(gridLayoutManager);
        if (getBaseActivity().getIntent().getData() == null) {
            style.length length2 = this.presenter;
            getBaseActivity();
            length2.length((Intent) null, false);
        }
    }

    public void onSingleClick(View view) {
        onOrientationChanged onorientationchanged;
        ThirdPartyService thirdPartyService;
        if (view.getId() == R.id.f36792131362131 && (onorientationchanged = this.setMin) != null && (thirdPartyService = (ThirdPartyService) onorientationchanged.setMin(0)) != null) {
            Context context = getContext();
            String str = thirdPartyService.setMax;
            String str2 = thirdPartyService.getMin;
            convertDipToPx.length length2 = new convertDipToPx.length(context);
            length2.getMax = TrackerKey.Event.SERVICE_OPEN;
            convertDipToPx.length max = length2.setMax(TrackerKey.ServiceProperty.SERVICE_NAME, str).setMax(TrackerKey.ServiceProperty.SERVICE_CATEGORY, str2);
            max.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
            List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
            length(thirdPartyService.setMax);
            style.length length4 = this.presenter;
            getBaseActivity();
            length4.getMax(thirdPartyService);
        }
    }

    public void refreshView() {
        this.presenter.getMin();
        this.presenter.getMax();
    }

    /* access modifiers changed from: private */
    public void length(String str) {
        if ("service_goals".equals(str)) {
            convertDipToPx.length length2 = new convertDipToPx.length(getContext());
            length2.getMax = TrackerKey.Event.SAVINGS_GOAL_OPEN;
            convertDipToPx.length max = length2.setMax("Source", TrackerKey.SourceType.SERVICES);
            max.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
            List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        }
    }

    static /* synthetic */ void access$100(ServiceCardView serviceCardView, String str, boolean z) {
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/forex");
            str = sb.toString();
        }
        DanaH5.startContainerFullUrl(str, new setCancelOnTouchOutside$core() {
            public final void onContainerCreated(Bundle bundle) {
            }

            public final void onContainerDestroyed(Bundle bundle) {
                ServiceCardView.this.h5EventPresenter.length();
                DanaH5.dispose();
                if (ServiceCardView.this.getMin) {
                    ServiceCardView.this.playStoreReviewPresenter.length();
                }
            }
        });
        serviceCardView.getMin = false;
        serviceCardView.h5EventPresenter.getMin();
        serviceCardView.globalNetworkPresenter.FastBitmap$CoordinateSystem();
    }

    static /* synthetic */ setCancelOnTouchOutside$core access$200(ServiceCardView serviceCardView) {
        return new setCancelOnTouchOutside$core() {
            public final void onContainerCreated(Bundle bundle) {
            }

            public final void onContainerDestroyed(Bundle bundle) {
                ServiceCardView.this.h5EventPresenter.length();
                DanaH5.dispose();
                if (ServiceCardView.this.getMin) {
                    ServiceCardView.this.playStoreReviewPresenter.length();
                }
            }
        };
    }

    static /* synthetic */ void access$300(ServiceCardView serviceCardView) {
        serviceCardView.getMin = false;
        serviceCardView.h5EventPresenter.getMin();
    }

    static /* synthetic */ void access$400(ServiceCardView serviceCardView, ThirdPartyService thirdPartyService, String str, String str2, String str3) {
        WindowBridgeExtension.AnonymousClass1.length();
        if (!WindowBridgeExtension.AnonymousClass1.getMin()) {
            serviceCardView.length = appendExtraSystemInfo.getMax(str, str2, str3);
            if (thirdPartyService == null) {
                return;
            }
            if ("service_akulaku".equalsIgnoreCase(thirdPartyService.setMax)) {
                Bundle bundle = new Bundle();
                bundle.putString("url", DanaH5.correctedUrl(isShowMenu.getMax(serviceCardView.length, "Home")));
                bundle.putString("adjustResize", "YES");
                DanaH5.startContainerActivity(bundle, new setCancelOnTouchOutside$core() {
                    public final void onContainerCreated(Bundle bundle) {
                    }

                    public final void onContainerDestroyed(Bundle bundle) {
                        ServiceCardView.this.h5EventPresenter.length();
                        DanaH5.dispose();
                        if (ServiceCardView.this.getMin) {
                            ServiceCardView.this.playStoreReviewPresenter.length();
                        }
                    }
                });
                serviceCardView.getMin = false;
                serviceCardView.h5EventPresenter.getMin();
            } else if ("service_danakaget".equalsIgnoreCase(thirdPartyService.setMax)) {
                serviceCardView.onBoardingServicePresenter.setMax(BottomSheetOnBoardingScenario.DANA_KAGET, serviceCardView.length);
            } else if ("service_my_bills".equalsIgnoreCase(thirdPartyService.setMax)) {
                serviceCardView.onBoardingServicePresenter.setMax(BottomSheetOnBoardingScenario.MY_BILLS, serviceCardView.length);
            } else if ("service_gn".equalsIgnoreCase(thirdPartyService.setMax)) {
                serviceCardView.globalNetworkPresenter.toFloatRange();
            } else if ("service_danafood".equalsIgnoreCase(thirdPartyService.setMax)) {
                serviceCardView.onBoardingServicePresenter.setMax(BottomSheetOnBoardingScenario.DANA_FOOD, serviceCardView.length);
            } else {
                DanaH5.startContainerFullUrlWithSendCredentials(serviceCardView.length, new setCancelOnTouchOutside$core() {
                    public final void onContainerCreated(Bundle bundle) {
                    }

                    public final void onContainerDestroyed(Bundle bundle) {
                        ServiceCardView.this.h5EventPresenter.length();
                        DanaH5.dispose();
                        if (ServiceCardView.this.getMin) {
                            ServiceCardView.this.playStoreReviewPresenter.length();
                        }
                    }
                });
                serviceCardView.getMin = false;
                serviceCardView.h5EventPresenter.getMin();
            }
        }
    }

    static /* synthetic */ void access$600(ServiceCardView serviceCardView, List list) {
        if (list == null) {
            list = new ArrayList();
        } else {
            if (list.size() > 8) {
                list = list.subList(0, 8);
            }
            ThirdPartyService.getMin getmin = new ThirdPartyService.getMin();
            getmin.toIntRange = serviceCardView.getContext().getString(R.string.key_view_all);
            getmin.values = 1;
            list.add(getmin.setMin());
        }
        onOrientationChanged onorientationchanged = new onOrientationChanged(serviceCardView.getSingleItemClickListener());
        serviceCardView.setMin = onorientationchanged;
        onorientationchanged.getMin(list);
        serviceCardView.setMin.getMax((Ignore.setMin) new projection(serviceCardView.getBaseActivity()) {
            public final void getMax(int i) {
                if (i >= ServiceCardView.this.setMin.getItemCount() - 1) {
                    ServiceCardView.this.getContext().startActivity(new Intent(ServiceCardView.this.getContext(), ServicesActivity.class));
                    return;
                }
                ThirdPartyService thirdPartyService = (ThirdPartyService) ServiceCardView.this.setMin.setMin(i);
                GriverPageContainer.AnonymousClass1.setMax(ServiceCardView.this.getContext(), thirdPartyService.setMax, thirdPartyService.getMin);
                ServiceCardView.this.length(thirdPartyService.setMax);
                style.length length = ServiceCardView.this.presenter;
                ServiceCardView.this.getBaseActivity();
                length.getMax(thirdPartyService);
            }
        });
        serviceCardView.rvService.setAdapter(serviceCardView.setMin);
        serviceCardView.rvService.smoothScrollToPosition(0);
    }
}
