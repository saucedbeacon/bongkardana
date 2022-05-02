package id.dana.contract.globalsearch;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import id.dana.sendmoney.summary.SummaryActivity;
import id.dana.tracker.TrackerKey;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.FtsOptions$Order;
import o.GriverManifest;
import o.PdfImageSource;
import o.PdfViewerActivity;
import o.PrepareException;
import o.R;
import o.WindowBridgeExtension;
import o.appendExtraSystemInfo;
import o.closeAppMonitor;
import o.getAlpha;
import o.getDuration;
import o.getPerformanceTracker;
import o.getSelectedIndex;
import o.isShowMenu;
import o.isSnapshotEnabled;
import o.setCancelOnTouchOutside$core;
import o.stopIgnoring;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000204H&J\b\u00105\u001a\u000206H\u0004J,\u00107\u001a\u0002022\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010;2\b\u0010=\u001a\u0004\u0018\u00010;H\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0004@\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0004@\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0004@\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0004@\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0004@\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0004@\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0004@\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006>"}, d2 = {"Lid/dana/contract/globalsearch/AbstractGlobalSearchView;", "Lid/dana/base/BaseFragment;", "()V", "checkoutH5EventSuccess", "", "deviceInformationProvider", "Lid/dana/data/config/DeviceInformationProvider;", "getDeviceInformationProvider", "()Lid/dana/data/config/DeviceInformationProvider;", "setDeviceInformationProvider", "(Lid/dana/data/config/DeviceInformationProvider;)V", "h5EventPresenter", "Lid/dana/h5event/CheckoutH5EventContract$Presenter;", "getH5EventPresenter", "()Lid/dana/h5event/CheckoutH5EventContract$Presenter;", "setH5EventPresenter", "(Lid/dana/h5event/CheckoutH5EventContract$Presenter;)V", "onBoardingServicePresenter", "Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "getOnBoardingServicePresenter", "()Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "setOnBoardingServicePresenter", "(Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;)V", "playStoreReviewPresenter", "Lid/dana/playstorereview/PlayStoreReviewContract$Presenter;", "getPlayStoreReviewPresenter", "()Lid/dana/playstorereview/PlayStoreReviewContract$Presenter;", "setPlayStoreReviewPresenter", "(Lid/dana/playstorereview/PlayStoreReviewContract$Presenter;)V", "presenter", "Lid/dana/contract/globalsearch/GlobalSearchContract$Presenter;", "getPresenter", "()Lid/dana/contract/globalsearch/GlobalSearchContract$Presenter;", "setPresenter", "(Lid/dana/contract/globalsearch/GlobalSearchContract$Presenter;)V", "qrPresenter", "Lid/dana/contract/staticqr/ScanQrContract$Presenter;", "getQrPresenter", "()Lid/dana/contract/staticqr/ScanQrContract$Presenter;", "setQrPresenter", "(Lid/dana/contract/staticqr/ScanQrContract$Presenter;)V", "readLinkPropertiesPresenter", "Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "getReadLinkPropertiesPresenter", "()Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "setReadLinkPropertiesPresenter", "(Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;)V", "createH5AppListener", "Lid/dana/danah5/DanaH5Listener;", "doOnOpenH5", "", "getGlobalSearchView", "Lid/dana/contract/globalsearch/GlobalSearchContract$View;", "initInject", "Lid/dana/di/component/GlobalSearchComponent;", "openH5", "thirdPartyService", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "url", "", "authCode", "requestId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class AbstractGlobalSearchView extends FtsOptions$Order {
    @Inject
    public getPerformanceTracker deviceInformationProvider;
    @Inject
    public GriverManifest.AnonymousClass22.getMin h5EventPresenter;
    @Inject
    public getSelectedIndex.length onBoardingServicePresenter;
    @Inject
    public PdfImageSource.setMin playStoreReviewPresenter;
    @Inject
    public getAlpha.length presenter;
    @Inject
    public R.id.getMax qrPresenter;
    @Inject
    public getDuration.length readLinkPropertiesPresenter;
    private HashMap setMax;
    /* access modifiers changed from: private */
    public boolean setMin;

    public void Grayscale$Algorithm() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View getMax(int i) {
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @NotNull
    public abstract getAlpha.setMax invoke();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Grayscale$Algorithm();
    }

    @NotNull
    public final getAlpha.length m_() {
        getAlpha.length length = this.presenter;
        if (length == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return length;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final R.id.getMax equals() {
        R.id.getMax getmax = this.qrPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrPresenter");
        }
        return getmax;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final GriverManifest.AnonymousClass22.getMin FastBitmap$CoordinateSystem() {
        GriverManifest.AnonymousClass22.getMin getmin = this.h5EventPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("h5EventPresenter");
        }
        return getmin;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final PdfImageSource.setMin values() {
        PdfImageSource.setMin setmin = this.playStoreReviewPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playStoreReviewPresenter");
        }
        return setmin;
    }

    @NotNull
    public final getDuration.length toDoubleRange() {
        getDuration.length length = this.readLinkPropertiesPresenter;
        if (length == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readLinkPropertiesPresenter");
        }
        return length;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final getSelectedIndex.length Mean$Arithmetic() {
        getSelectedIndex.length length = this.onBoardingServicePresenter;
        if (length == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onBoardingServicePresenter");
        }
        return length;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final getPerformanceTracker valueOf() {
        getPerformanceTracker getperformancetracker = this.deviceInformationProvider;
        if (getperformancetracker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceInformationProvider");
        }
        return getperformancetracker;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onGetCheckoutH5EventSuccess"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements GriverManifest.AnonymousClass22.length {
        final /* synthetic */ AbstractGlobalSearchView setMin;

        getMax(AbstractGlobalSearchView abstractGlobalSearchView) {
            this.setMin = abstractGlobalSearchView;
        }

        public final void setMin(boolean z) {
            this.setMin.setMin = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/contract/globalsearch/AbstractGlobalSearchView$initInject$2", "Lid/dana/usereducation/BottomSheetOnBoardingContract$View;", "onError", "", "errorMessage", "", "onGetBottomSheetOnBoardingAvailability", "show", "", "url", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements getSelectedIndex.setMax {
        final /* synthetic */ AbstractGlobalSearchView getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void setMax(boolean z, @Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMax(AbstractGlobalSearchView abstractGlobalSearchView) {
            this.getMax = abstractGlobalSearchView;
        }

        public final void onGetBottomSheetOnBoardingAvailability(boolean z, @Nullable String str) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            if (z) {
                buildUpon.appendQueryParameter(SummaryActivity.FIRST_STATE_SHARE_FEED, SummaryActivity.CHECKED);
            }
            DanaH5.startContainerFullUrlWithSendCredentials$default(buildUpon.build().toString(), AbstractGlobalSearchView.setMin(this.getMax), (Bundle) null, 4, (Object) null);
            AbstractGlobalSearchView.setMax(this.getMax);
        }

        public final void onError(@Nullable String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append("on Error: ");
            sb.append(str);
            updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/contract/globalsearch/AbstractGlobalSearchView$createH5AppListener$1", "Lid/dana/danah5/DanaH5Listener;", "onContainerDestroyed", "", "bundle", "Landroid/os/Bundle;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements setCancelOnTouchOutside$core {
        final /* synthetic */ AbstractGlobalSearchView getMax;

        @JvmDefault
        public final void onContainerCreated(@Nullable Bundle bundle) {
        }

        setMin(AbstractGlobalSearchView abstractGlobalSearchView) {
            this.getMax = abstractGlobalSearchView;
        }

        public final void onContainerDestroyed(@Nullable Bundle bundle) {
            this.getMax.FastBitmap$CoordinateSystem().length();
            DanaH5.dispose();
            if (this.getMax.setMin) {
                this.getMax.values().length();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setMin(@NotNull ThirdPartyServiceResponse thirdPartyServiceResponse, @NotNull String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(thirdPartyServiceResponse, "thirdPartyService");
        Intrinsics.checkNotNullParameter(str, "url");
        if (!WindowBridgeExtension.AnonymousClass1.getMin()) {
            String max = appendExtraSystemInfo.getMax(str, str2, str3);
            if (Intrinsics.areEqual((Object) thirdPartyServiceResponse.getKey(), (Object) "service_akulaku")) {
                Bundle bundle = new Bundle();
                String max2 = isShowMenu.getMax(max, TrackerKey.SourceType.GLOBAL_SEARCH);
                Intrinsics.checkNotNullExpressionValue(max2, "UrlUtil.addEntryPoint(\n …_SEARCH\n                )");
                bundle.putString("url", DanaH5.correctedUrl(max2));
                bundle.putString("adjustResize", "YES");
                DanaH5.startContainerActivity(bundle, new setMin(this));
                this.setMin = false;
                GriverManifest.AnonymousClass22.getMin getmin = this.h5EventPresenter;
                if (getmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("h5EventPresenter");
                }
                getmin.getMin();
                return;
            }
            String key = thirdPartyServiceResponse.getKey();
            int hashCode = key.hashCode();
            if (hashCode != -799331944) {
                if (hashCode != 994706502) {
                    if (hashCode == 1397883715 && key.equals("service_my_bills")) {
                        getSelectedIndex.length length = this.onBoardingServicePresenter;
                        if (length == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("onBoardingServicePresenter");
                        }
                        length.setMax(BottomSheetOnBoardingScenario.MY_BILLS, max);
                        return;
                    }
                } else if (key.equals("service_danakaget")) {
                    getSelectedIndex.length length2 = this.onBoardingServicePresenter;
                    if (length2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("onBoardingServicePresenter");
                    }
                    length2.setMax(BottomSheetOnBoardingScenario.DANA_KAGET, max);
                    return;
                }
            } else if (key.equals("service_danafood")) {
                getSelectedIndex.length length3 = this.onBoardingServicePresenter;
                if (length3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("onBoardingServicePresenter");
                }
                length3.setMax(BottomSheetOnBoardingScenario.DANA_FOOD, max);
                return;
            }
            DanaH5.startContainerFullUrlWithSendCredentials$default(max, new setMin(this), (Bundle) null, 4, (Object) null);
            this.setMin = false;
            GriverManifest.AnonymousClass22.getMin getmin2 = this.h5EventPresenter;
            if (getmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("h5EventPresenter");
            }
            getmin2.getMin();
        }
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final closeAppMonitor invokeSuspend() {
        PrepareException.AnonymousClass1 r3;
        isSnapshotEnabled.setMin setmin = new isSnapshotEnabled.setMin((byte) 0);
        if (this.getMax != null) {
            r3 = this.getMax.getApplicationComponent();
        } else {
            r3 = null;
        }
        if (r3 != null) {
            setmin.toString = r3;
            setmin.length = new DeepLinkModule(DeepLinkModule.getMax(), (byte) 0);
            ScanQrModule.setMin max = ScanQrModule.getMax();
            max.setMin = getActivity();
            setmin.IsOverlapping = new ScanQrModule(max, (byte) 0);
            RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
            min.getMax = getActivity();
            setmin.toIntRange = new RestoreUrlModule(min, (byte) 0);
            FeatureModule.length length = FeatureModule.length();
            length.setMax = getActivity();
            setmin.toFloatRange = new FeatureModule(length, (byte) 0);
            OauthModule.getMax min2 = OauthModule.setMin();
            min2.setMin = getActivity();
            setmin.isInside = new OauthModule(min2, (byte) 0);
            setmin.getMin = new GlobalSearchModule(invoke());
            DeepLinkModule.setMin max2 = DeepLinkModule.getMax();
            max2.getMax = getActivity();
            setmin.length = new DeepLinkModule(max2, (byte) 0);
            ScanQrModule.setMin max3 = ScanQrModule.getMax();
            max3.setMin = getActivity();
            setmin.IsOverlapping = new ScanQrModule(max3, (byte) 0);
            RestoreUrlModule.setMin min3 = RestoreUrlModule.setMin();
            min3.getMax = getActivity();
            setmin.toIntRange = new RestoreUrlModule(min3, (byte) 0);
            FeatureModule.length length2 = FeatureModule.length();
            length2.setMax = getActivity();
            setmin.toFloatRange = new FeatureModule(length2, (byte) 0);
            OauthModule.getMax min4 = OauthModule.setMin();
            min4.setMin = getActivity();
            setmin.isInside = new OauthModule(min4, (byte) 0);
            setmin.getMax = new CheckoutH5EventModule(new getMax(this));
            setmin.setMax = new PlayStoreReviewModules(new PdfViewerActivity.PageAdapter(getActivity()));
            setmin.setMin = new BottomSheetOnBoardingModule(new setMax(this));
            stopIgnoring.setMin(setmin.getMin, GlobalSearchModule.class);
            stopIgnoring.setMin(setmin.setMax, PlayStoreReviewModules.class);
            stopIgnoring.setMin(setmin.getMax, CheckoutH5EventModule.class);
            stopIgnoring.setMin(setmin.setMin, BottomSheetOnBoardingModule.class);
            stopIgnoring.setMin(setmin.length, DeepLinkModule.class);
            stopIgnoring.setMin(setmin.IsOverlapping, ScanQrModule.class);
            stopIgnoring.setMin(setmin.toIntRange, RestoreUrlModule.class);
            stopIgnoring.setMin(setmin.toFloatRange, FeatureModule.class);
            stopIgnoring.setMin(setmin.isInside, OauthModule.class);
            if (setmin.equals == null) {
                setmin.equals = new ServicesModule();
            }
            stopIgnoring.setMin(setmin.toString, PrepareException.AnonymousClass1.class);
            isSnapshotEnabled issnapshotenabled = new isSnapshotEnabled(setmin.getMin, setmin.setMax, setmin.getMax, setmin.setMin, setmin.length, setmin.IsOverlapping, setmin.toIntRange, setmin.toFloatRange, setmin.isInside, setmin.equals, setmin.toString, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(issnapshotenabled, "DaggerGlobalSearchCompon… }))\n            .build()");
            return issnapshotenabled;
        }
        throw null;
    }

    public static final /* synthetic */ setCancelOnTouchOutside$core setMin(AbstractGlobalSearchView abstractGlobalSearchView) {
        return new setMin(abstractGlobalSearchView);
    }

    public static final /* synthetic */ void setMax(AbstractGlobalSearchView abstractGlobalSearchView) {
        abstractGlobalSearchView.setMin = false;
        GriverManifest.AnonymousClass22.getMin getmin = abstractGlobalSearchView.h5EventPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("h5EventPresenter");
        }
        getmin.getMin();
    }
}
