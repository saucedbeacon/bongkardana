package id.dana.richview.servicescard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
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
import id.dana.service.ServicesActivity;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.CameraUtils;
import o.GriverManifest;
import o.GriverPageContainer;
import o.Ignore;
import o.IntRange;
import o.PdfImageSource;
import o.PdfViewerActivity;
import o.PrepareException;
import o.WindowBridgeExtension;
import o.Workflow;
import o.appendExtraSystemInfo;
import o.beforeParsePackage;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getDuration;
import o.getInsetDodgeRect;
import o.getPerformanceTracker;
import o.getSelectedIndex;
import o.getSocketSession;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.onNext;
import o.projection;
import o.setCancelOnTouchOutside$core;
import o.stopIgnoring;
import o.style;
import o.switchCameraFacing;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;

public class NewServiceCardView extends BaseRichView {
    @Inject
    public getPerformanceTracker deviceInformationProvider;
    /* access modifiers changed from: private */
    public String getMax;
    private getSocketSession getMin;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    @Inject
    public GriverManifest.AnonymousClass22.getMin h5EventPresenter;
    /* access modifiers changed from: private */
    public boolean length;
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
    private onDetachedFromLayoutParams setMax;
    /* access modifiers changed from: private */
    public CameraUtils.CameraSizeComparator setMin;
    @BindView(2131364670)
    FrameLayout skeletonView;

    public int getLayout() {
        return R.layout.new_view_service_card;
    }

    public NewServiceCardView(@NonNull Context context) {
        super(context);
    }

    public NewServiceCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewServiceCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NewServiceCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
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
        if (this.getMin == null) {
            beforeParsePackage.setMin setmin = new beforeParsePackage.setMin((byte) 0);
            if (r19 != null) {
                setmin.values = r19;
                DeepLinkModule.setMin max = DeepLinkModule.getMax();
                max.getMax = getBaseActivity();
                max.length = TrackerKey.SourceType.SERVICES;
                setmin.length = new DeepLinkModule(max, (byte) 0);
                ScanQrModule.setMin max2 = ScanQrModule.getMax();
                max2.setMin = getBaseActivity();
                setmin.setMin = new ScanQrModule(max2, (byte) 0);
                RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
                min.getMax = getBaseActivity();
                setmin.IsOverlapping = new RestoreUrlModule(min, (byte) 0);
                FeatureModule.length length2 = FeatureModule.length();
                length2.setMax = getBaseActivity();
                setmin.toIntRange = new FeatureModule(length2, (byte) 0);
                OauthModule.getMax min2 = OauthModule.setMin();
                min2.setMin = getBaseActivity();
                setmin.toFloatRange = new OauthModule(min2, (byte) 0);
                setmin.setMax = new CheckoutH5EventModule(new switchCameraFacing(this));
                setmin.getMin = new PlayStoreReviewModules(new PdfViewerActivity.PageAdapter(getBaseActivity()));
                setmin.isInside = new ServicesModule((style.getMin) new style.getMin() {
                    @JvmDefault
                    public final void dismissProgress() {
                    }

                    @JvmDefault
                    public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
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
                    public final void setMax(boolean z) {
                    }

                    @JvmDefault
                    public final void setMin(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void showProgress() {
                    }

                    public final void getMax(ThirdPartyService thirdPartyService, String str) {
                        NewServiceCardView.access$400(NewServiceCardView.this, thirdPartyService, isShowMenu.setMin(thirdPartyService.toIntRange), str, NewServiceCardView.this.deviceInformationProvider.getDeviceUUID());
                    }

                    public final void setMin() {
                        NewServiceCardView.this.enableClick();
                    }

                    public final void setMax(@NotNull List<ThirdPartyService> list) {
                        NewServiceCardView.access$600(NewServiceCardView.this, list);
                        NewServiceCardView.access$700(NewServiceCardView.this);
                    }

                    public final void onError(String str) {
                        NewServiceCardView.this.enableClick();
                    }

                    public final void setMin(ThirdPartyService thirdPartyService) {
                        if (isShowMenu.length(thirdPartyService.IsOverlapping)) {
                            NewServiceCardView.this.readLinkPropertiesPresenter.setMax(thirdPartyService.IsOverlapping);
                        } else {
                            NewServiceCardView.access$400(NewServiceCardView.this, thirdPartyService, isShowMenu.setMin(thirdPartyService.IsOverlapping), (String) null, (String) null);
                        }
                    }
                });
                setmin.getMax = new BottomSheetOnBoardingModule(new getSelectedIndex.setMax() {
                    public final void dismissProgress() {
                    }

                    public final void setMax(boolean z, @org.jetbrains.annotations.Nullable String str) {
                    }

                    public final void showProgress() {
                    }

                    public final void onGetBottomSheetOnBoardingAvailability(boolean z, String str) {
                        if (z) {
                            str = isShowMenu.getMin(str, OnboardingParams.FIRST_TIME_TOP_UP);
                        }
                        DanaH5.startContainerFullUrlWithSendCredentials(str, NewServiceCardView.access$200(NewServiceCardView.this));
                        NewServiceCardView.access$300(NewServiceCardView.this);
                    }

                    public final void onError(String str) {
                        int length = str != null ? str.length() : 0;
                        int max = dispatchOnCancelled.setMax(length);
                        if (length != max) {
                            onCanceled oncanceled = new onCanceled(length, max, 1);
                            onCancelLoad.setMax(1014060985, oncanceled);
                            onCancelLoad.getMin(1014060985, oncanceled);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(getClass().getName());
                        sb.append("on Error: ");
                        sb.append(str);
                        updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString());
                    }
                });
                setmin.equals = new GlobalNetworkModule(new Workflow() {
                    public final void getMin(boolean z) {
                        if (!TextUtils.isEmpty(NewServiceCardView.this.getMax)) {
                            NewServiceCardView newServiceCardView = NewServiceCardView.this;
                            NewServiceCardView.access$100(newServiceCardView, newServiceCardView.getMax, z);
                        }
                    }
                });
                stopIgnoring.setMin(setmin.getMin, PlayStoreReviewModules.class);
                stopIgnoring.setMin(setmin.setMax, CheckoutH5EventModule.class);
                stopIgnoring.setMin(setmin.getMax, BottomSheetOnBoardingModule.class);
                stopIgnoring.setMin(setmin.length, DeepLinkModule.class);
                stopIgnoring.setMin(setmin.setMin, ScanQrModule.class);
                stopIgnoring.setMin(setmin.IsOverlapping, RestoreUrlModule.class);
                stopIgnoring.setMin(setmin.toIntRange, FeatureModule.class);
                stopIgnoring.setMin(setmin.toFloatRange, OauthModule.class);
                if (setmin.isInside == null) {
                    setmin.isInside = new ServicesModule();
                }
                stopIgnoring.setMin(setmin.equals, GlobalNetworkModule.class);
                stopIgnoring.setMin(setmin.values, PrepareException.AnonymousClass1.class);
                this.getMin = new beforeParsePackage(setmin.getMin, setmin.setMax, setmin.getMax, setmin.length, setmin.setMin, setmin.IsOverlapping, setmin.toIntRange, setmin.toFloatRange, setmin.isInside, setmin.equals, setmin.values, (byte) 0);
            } else {
                throw null;
            }
        }
        this.getMin.getMax(this);
        registerPresenter(this.presenter, this.playStoreReviewPresenter, this.readLinkPropertiesPresenter, this.onBoardingServicePresenter, this.globalNetworkPresenter);
    }

    public void onSingleClick(View view) {
        CameraUtils.CameraSizeComparator cameraSizeComparator;
        ThirdPartyService thirdPartyService;
        if (view.getId() == R.id.f36792131362131 && (cameraSizeComparator = this.setMin) != null && (thirdPartyService = (ThirdPartyService) cameraSizeComparator.setMin(0)) != null) {
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
            getMin(thirdPartyService.setMax);
            style.length length4 = this.presenter;
            getBaseActivity();
            length4.getMax(thirdPartyService);
        }
    }

    /* access modifiers changed from: private */
    public void getMin(String str) {
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

    public void refreshView() {
        this.presenter.getMin();
        this.presenter.getMax();
    }

    public void setup() {
        this.skeletonView.setVisibility(0);
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.skeletonView);
            setmax.getMax = R.layout.service_card_skeleton;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.setMax = getinsetdodgerect;
        } else {
            ondetachedfromlayoutparams.getMin();
        }
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

    static /* synthetic */ void access$100(NewServiceCardView newServiceCardView, String str, boolean z) {
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
                NewServiceCardView.this.h5EventPresenter.length();
                DanaH5.dispose();
                if (NewServiceCardView.this.length) {
                    NewServiceCardView.this.playStoreReviewPresenter.length();
                }
            }
        });
        newServiceCardView.length = false;
        newServiceCardView.h5EventPresenter.getMin();
        newServiceCardView.globalNetworkPresenter.FastBitmap$CoordinateSystem();
    }

    static /* synthetic */ setCancelOnTouchOutside$core access$200(NewServiceCardView newServiceCardView) {
        return new setCancelOnTouchOutside$core() {
            public final void onContainerCreated(Bundle bundle) {
            }

            public final void onContainerDestroyed(Bundle bundle) {
                NewServiceCardView.this.h5EventPresenter.length();
                DanaH5.dispose();
                if (NewServiceCardView.this.length) {
                    NewServiceCardView.this.playStoreReviewPresenter.length();
                }
            }
        };
    }

    static /* synthetic */ void access$300(NewServiceCardView newServiceCardView) {
        newServiceCardView.length = false;
        newServiceCardView.h5EventPresenter.getMin();
    }

    static /* synthetic */ void access$400(NewServiceCardView newServiceCardView, ThirdPartyService thirdPartyService, String str, String str2, String str3) {
        WindowBridgeExtension.AnonymousClass1.length();
        if (!WindowBridgeExtension.AnonymousClass1.getMin()) {
            newServiceCardView.getMax = appendExtraSystemInfo.getMax(str, str2, str3);
            if (thirdPartyService == null) {
                return;
            }
            if ("service_akulaku".equalsIgnoreCase(thirdPartyService.setMax)) {
                Bundle bundle = new Bundle();
                bundle.putString("url", DanaH5.correctedUrl(isShowMenu.getMax(newServiceCardView.getMax, "Home")));
                bundle.putString("adjustResize", "YES");
                DanaH5.startContainerActivity(bundle, new setCancelOnTouchOutside$core() {
                    public final void onContainerCreated(Bundle bundle) {
                    }

                    public final void onContainerDestroyed(Bundle bundle) {
                        NewServiceCardView.this.h5EventPresenter.length();
                        DanaH5.dispose();
                        if (NewServiceCardView.this.length) {
                            NewServiceCardView.this.playStoreReviewPresenter.length();
                        }
                    }
                });
                newServiceCardView.length = false;
                newServiceCardView.h5EventPresenter.getMin();
            } else if ("service_danakaget".equalsIgnoreCase(thirdPartyService.setMax)) {
                newServiceCardView.onBoardingServicePresenter.setMax(BottomSheetOnBoardingScenario.DANA_KAGET, newServiceCardView.getMax);
            } else if ("service_my_bills".equalsIgnoreCase(thirdPartyService.setMax)) {
                newServiceCardView.onBoardingServicePresenter.setMax(BottomSheetOnBoardingScenario.MY_BILLS, newServiceCardView.getMax);
            } else if ("service_gn".equalsIgnoreCase(thirdPartyService.setMax)) {
                newServiceCardView.globalNetworkPresenter.toFloatRange();
            } else if ("service_danafood".equalsIgnoreCase(thirdPartyService.setMax)) {
                newServiceCardView.onBoardingServicePresenter.setMax(BottomSheetOnBoardingScenario.DANA_FOOD, newServiceCardView.getMax);
            } else {
                DanaH5.startContainerFullUrlWithSendCredentials(newServiceCardView.getMax, new setCancelOnTouchOutside$core() {
                    public final void onContainerCreated(Bundle bundle) {
                    }

                    public final void onContainerDestroyed(Bundle bundle) {
                        NewServiceCardView.this.h5EventPresenter.length();
                        DanaH5.dispose();
                        if (NewServiceCardView.this.length) {
                            NewServiceCardView.this.playStoreReviewPresenter.length();
                        }
                    }
                });
                newServiceCardView.length = false;
                newServiceCardView.h5EventPresenter.getMin();
            }
        }
    }

    static /* synthetic */ void access$600(NewServiceCardView newServiceCardView, List list) {
        if (list == null) {
            list = new ArrayList();
        } else {
            if (list.size() > 8) {
                list = list.subList(0, 8);
            }
            ThirdPartyService.getMin getmin = new ThirdPartyService.getMin();
            getmin.toIntRange = newServiceCardView.getContext().getString(R.string.key_view_all);
            getmin.values = 1;
            list.add(getmin.setMin());
        }
        CameraUtils.CameraSizeComparator cameraSizeComparator = new CameraUtils.CameraSizeComparator(newServiceCardView.getSingleItemClickListener());
        newServiceCardView.setMin = cameraSizeComparator;
        cameraSizeComparator.getMin(list);
        newServiceCardView.setMin.getMax((Ignore.setMin) new projection(newServiceCardView.getBaseActivity()) {
            public final void getMax(int i) {
                if (i >= NewServiceCardView.this.setMin.getItemCount() - 1) {
                    NewServiceCardView.this.getContext().startActivity(new Intent(NewServiceCardView.this.getContext(), ServicesActivity.class));
                    return;
                }
                ThirdPartyService thirdPartyService = (ThirdPartyService) NewServiceCardView.this.setMin.setMin(i);
                GriverPageContainer.AnonymousClass1.setMax(NewServiceCardView.this.getContext(), thirdPartyService.setMax, thirdPartyService.getMin);
                NewServiceCardView.this.getMin(thirdPartyService.setMax);
                style.length length = NewServiceCardView.this.presenter;
                NewServiceCardView.this.getBaseActivity();
                length.getMax(thirdPartyService);
            }
        });
        newServiceCardView.rvService.setAdapter(newServiceCardView.setMin);
        newServiceCardView.rvService.smoothScrollToPosition(0);
    }

    static /* synthetic */ void access$700(NewServiceCardView newServiceCardView) {
        newServiceCardView.skeletonView.setVisibility(8);
        onDetachedFromLayoutParams ondetachedfromlayoutparams = newServiceCardView.setMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }
}
