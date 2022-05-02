package id.dana.onboarding.referral;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseKey;
import id.dana.base.KeyBaseActivity;
import id.dana.di.modules.ReferralModule;
import id.dana.dialog.CommonDialog;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import id.dana.onboarding.OnboardingActivity;
import id.dana.utils.permission.ManifestPermission;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CornerMarkingDataProvider;
import o.GriverProgressBar;
import o.LogContextImpl;
import o.MemoryWarningBridgeExtension;
import o.MultiInstanceInvalidationClient$1;
import o.MultiInstanceInvalidationService;
import o.PrepareException;
import o.RedDotDrawable;
import o.RedDotManager;
import o.SensorBridgeExtension;
import o.TitleBarRightButtonView;
import o.WheelView;
import o.appendAppLog;
import o.downloadAndInstallApp;
import o.ensureCollapseButtonView;
import o.ensureNavButtonView;
import o.getChildren;
import o.getProgressViewStartOffset;
import o.getSecureSignatureComp;
import o.hideProgress;
import o.isBaselineAligned;
import o.isOriginHasAppInfo;
import o.layoutChildLeft;
import o.layoutChildRight;
import o.measureChildCollapseMargins;
import o.onDelete;
import o.onLoadChildren;
import o.resetInternal;
import o.setLanguages;
import o.setOnWheelViewListener;
import o.stopIgnoring;
import o.subList;
import o.takeAndSync;
import o.uploadCoreByStartService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001=B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001cH\u0002J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\"H\u0002J\b\u0010'\u001a\u00020\u001cH\u0014J\b\u0010(\u001a\u00020\u001cH\u0002J\b\u0010)\u001a\u00020\u001cH\u0002J\b\u0010*\u001a\u00020\u001cH\u0002J\"\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u001cH\u0016J\b\u00100\u001a\u00020\u001cH\u0016J\u0012\u00101\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u00103\u001a\u00020\u001cH\u0016J\b\u00104\u001a\u00020\u001cH\u0016J\b\u00105\u001a\u00020\u001cH\u0002J\u0012\u00106\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u00107\u001a\u00020\u001cH\u0016J\b\u00108\u001a\u00020\u001cH\u0002J\u0018\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020\u001eH\u0002J\b\u0010<\u001a\u00020\u001cH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006>"}, d2 = {"Lid/dana/onboarding/referral/VerifyReferralCodeFragment;", "Lid/dana/base/KeyBaseFragment;", "Lid/dana/onboarding/OnboardingActivity;", "Lid/dana/onboarding/referral/VerifyReferralCodeKey;", "Lid/dana/onboarding/referral/ReferralContract$View;", "()V", "getLocationDisposable", "Lio/reactivex/disposables/Disposable;", "gpsPermission", "Lcom/anggrayudi/storage/permission/FragmentPermissionRequest;", "gpsServiceRequestDisposable", "inputBoxListenerDisposable", "loadingDialog", "Lid/dana/dialog/CommonDialog;", "locationPermissionDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "onboardingNavigationManager", "Lid/dana/onboarding/OnboardingNavigationManager;", "referralComponent", "Lid/dana/di/component/ReferralComponent;", "verifyReferralCodePresenter", "Lid/dana/onboarding/referral/ReferralContract$Presenter;", "getVerifyReferralCodePresenter$annotations", "getVerifyReferralCodePresenter", "()Lid/dana/onboarding/referral/ReferralContract$Presenter;", "setVerifyReferralCodePresenter", "(Lid/dana/onboarding/referral/ReferralContract$Presenter;)V", "checkLocationPermissionAndSendReferralCode", "", "referralCode", "", "checkLocationService", "dismissProgress", "getLayout", "", "getUserCurrentLocationAndSendReferralCode", "handleOnGPSPermissionResult", "handleOnGPSServiceResult", "resultCode", "init", "initInjector", "initLoading", "initializePermissionDialog", "onActivityResult", "requestCode", "data", "Landroid/content/Intent;", "onCityRequiredError", "onDestroy", "onError", "errorMessage", "onMockGpsDetected", "onNext", "onSkip", "onVerifyReferralCodeFail", "onVerifyReferralCodeSuccess", "requestGPSService", "showMessageDialog", "status", "message", "showProgress", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class VerifyReferralCodeFragment extends MultiInstanceInvalidationService<OnboardingActivity, VerifyReferralCodeKey> implements MemoryWarningBridgeExtension.getMax {
    @NotNull
    public static final setMin getMin = new setMin((byte) 0);
    private static final int hashCode = CornerMarkingDataProvider.AnonymousClass2.setMax();
    private CommonDialog IsOverlapping;
    private SensorBridgeExtension equals;
    /* access modifiers changed from: private */
    public final ensureCollapseButtonView isInside;
    private GriverProgressBar.UpdateRunnable setMax;
    private GriverProgressBar.UpdateRunnable setMin;
    private HashMap toDoubleRange;
    private GriverProgressBar.UpdateRunnable toFloatRange;
    private subList toIntRange;
    private isBaselineAligned values;
    @Inject
    public MemoryWarningBridgeExtension.length verifyReferralCodePresenter;

    public final View getMax(int i) {
        if (this.toDoubleRange == null) {
            this.toDoubleRange = new HashMap();
        }
        View view = (View) this.toDoubleRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toDoubleRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void getMax() {
        HashMap hashMap = this.toDoubleRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final void onError(@Nullable String str) {
    }

    public final int setMin() {
        return R.layout.fragment_verify_referral_code;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ VerifyReferralCodeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(VerifyReferralCodeFragment verifyReferralCodeFragment) {
            super(1);
            this.this$0 = verifyReferralCodeFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            this.this$0.isInside.setMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T> implements RedDotManager<Location> {
        final /* synthetic */ VerifyReferralCodeFragment getMax;
        final /* synthetic */ String setMax;

        getMin(VerifyReferralCodeFragment verifyReferralCodeFragment, String str) {
            this.getMax = verifyReferralCodeFragment;
            this.setMax = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            Location location = (Location) obj;
            MemoryWarningBridgeExtension.length length = this.getMax.verifyReferralCodePresenter;
            if (length == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verifyReferralCodePresenter");
            }
            String str = this.setMax;
            Intrinsics.checkNotNullExpressionValue(location, "it");
            length.length(str, location);
            VerifyReferralCodeFragment.getMin(this.getMax).dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ VerifyReferralCodeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(VerifyReferralCodeFragment verifyReferralCodeFragment) {
            super(1);
            this.this$0 = verifyReferralCodeFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            this.this$0.dismissProgress();
            VerifyReferralCodeFragment verifyReferralCodeFragment = this.this$0;
            String string = verifyReferralCodeFragment.getString(R.string.referral_invalid_code);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.referral_invalid_code)");
            verifyReferralCodeFragment.setMax(string);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "charSequence", "", "test"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T> implements getChildren<CharSequence> {
        public static final setMax setMin = new setMax();

        setMax() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            return setMax((CharSequence) obj);
        }

        private static boolean setMax(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            return charSequence.length() == 6;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "referralCode", "", "accept"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T> implements RedDotManager<CharSequence> {
        final /* synthetic */ VerifyReferralCodeFragment getMin;

        toFloatRange(VerifyReferralCodeFragment verifyReferralCodeFragment) {
            this.getMin = verifyReferralCodeFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            Intrinsics.checkNotNullParameter(charSequence, "referralCode");
            this.getMin.showProgress();
            MemoryWarningBridgeExtension.length length = this.getMin.verifyReferralCodePresenter;
            if (length == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verifyReferralCodePresenter");
            }
            length.setMax(charSequence.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "locationSettingsResult", "Lcom/google/android/gms/location/LocationSettingsResult;", "accept"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T> implements RedDotManager<LocationSettingsResult> {
        final /* synthetic */ VerifyReferralCodeFragment getMin;

        toIntRange(VerifyReferralCodeFragment verifyReferralCodeFragment) {
            this.getMin = verifyReferralCodeFragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001f, code lost:
            r0 = r0.getResolution();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r11) {
            /*
                r10 = this;
                com.google.android.gms.location.LocationSettingsResult r11 = (com.google.android.gms.location.LocationSettingsResult) r11
                java.lang.String r0 = "locationSettingsResult"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                com.google.android.gms.common.api.Status r0 = r11.getStatus()
                java.lang.String r1 = "locationSettingsResult.status"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r0 = r0.getStatusCode()
                r1 = 6
                if (r0 == r1) goto L_0x0018
                goto L_0x004d
            L_0x0018:
                com.google.android.gms.common.api.Status r0 = r11.getStatus()
                r1 = 0
                if (r0 == 0) goto L_0x002a
                android.app.PendingIntent r0 = r0.getResolution()
                if (r0 == 0) goto L_0x002a
                android.content.IntentSender r0 = r0.getIntentSender()
                goto L_0x002b
            L_0x002a:
                r0 = r1
            L_0x002b:
                if (r0 == 0) goto L_0x004d
                id.dana.onboarding.referral.VerifyReferralCodeFragment r0 = r10.getMin
                r2 = r0
                androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
                com.google.android.gms.common.api.Status r11 = r11.getStatus()
                if (r11 == 0) goto L_0x0042
                android.app.PendingIntent r11 = r11.getResolution()
                if (r11 == 0) goto L_0x0042
                android.content.IntentSender r1 = r11.getIntentSender()
            L_0x0042:
                r3 = r1
                r4 = 100
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r2.startIntentSenderForResult(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SendIntentException -> 0x004d }
            L_0x004d:
                id.dana.onboarding.referral.VerifyReferralCodeFragment r11 = r10.getMin
                o.GriverProgressBar$UpdateRunnable r11 = id.dana.onboarding.referral.VerifyReferralCodeFragment.length((id.dana.onboarding.referral.VerifyReferralCodeFragment) r11)
                r11.dispose()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.onboarding.referral.VerifyReferralCodeFragment.toIntRange.accept(java.lang.Object):void");
        }
    }

    public VerifyReferralCodeFragment() {
        ensureCollapseButtonView.getMax getmax = new ensureCollapseButtonView.getMax(this);
        String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", ManifestPermission.ACCESS_COARSE_LOCATION};
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        ensureCollapseButtonView.getMax getmax2 = getmax;
        getmax2.setMax = ArraysKt.toSet((T[]) strArr);
        measureChildCollapseMargins getmax3 = new getMax(this);
        Intrinsics.checkNotNullParameter(getmax3, "callback");
        ensureCollapseButtonView.getMax getmax4 = getmax2;
        getmax4.getMax = getmax3;
        this.isInside = getmax4.setMin();
    }

    public static final /* synthetic */ GriverProgressBar.UpdateRunnable getMin(VerifyReferralCodeFragment verifyReferralCodeFragment) {
        GriverProgressBar.UpdateRunnable updateRunnable = verifyReferralCodeFragment.setMax;
        if (updateRunnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getLocationDisposable");
        }
        return updateRunnable;
    }

    public static final /* synthetic */ GriverProgressBar.UpdateRunnable length(VerifyReferralCodeFragment verifyReferralCodeFragment) {
        GriverProgressBar.UpdateRunnable updateRunnable = verifyReferralCodeFragment.setMin;
        if (updateRunnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gpsServiceRequestDisposable");
        }
        return updateRunnable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"id/dana/onboarding/referral/VerifyReferralCodeFragment$gpsPermission$1", "Lcom/anggrayudi/storage/permission/PermissionCallback;", "onPermissionsChecked", "", "result", "Lcom/anggrayudi/storage/permission/PermissionResult;", "fromSystemDialog", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements measureChildCollapseMargins {
        final /* synthetic */ VerifyReferralCodeFragment setMin;

        public final void onShouldRedirectToSystemSettings(@NotNull List<ensureNavButtonView> list) {
            Intrinsics.checkNotNullParameter(list, "blockedPermissions");
        }

        getMax(VerifyReferralCodeFragment verifyReferralCodeFragment) {
            this.setMin = verifyReferralCodeFragment;
        }

        public final void onPermissionsChecked(@NotNull layoutChildRight layoutchildright, boolean z) {
            Intrinsics.checkNotNullParameter(layoutchildright, "result");
            if (layoutchildright.getMax()) {
                VerifyReferralCodeFragment.setMin(this.setMin);
                return;
            }
            this.setMin.dismissProgress();
            VerifyReferralCodeFragment verifyReferralCodeFragment = this.setMin;
            String string = verifyReferralCodeFragment.getString(R.string.referral_invalid_code);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.referral_invalid_code)");
            verifyReferralCodeFragment.setMax(string);
        }

        public final void onDisplayConsentDialog(@NotNull layoutChildLeft layoutchildleft) {
            Intrinsics.checkNotNullParameter(layoutchildleft, RequestPermissionsEvent.REQUEST);
            layoutchildleft.length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements MultiInstanceInvalidationClient$1 {
        final /* synthetic */ VerifyReferralCodeFragment length;

        length(VerifyReferralCodeFragment verifyReferralCodeFragment) {
            this.length = verifyReferralCodeFragment;
        }

        public final void getMax() {
            VerifyReferralCodeFragment.setMax(this.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements DialogInterface.OnDismissListener {
        final /* synthetic */ VerifyReferralCodeFragment getMax;

        IsOverlapping(VerifyReferralCodeFragment verifyReferralCodeFragment) {
            this.getMax = verifyReferralCodeFragment;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (((EditText) this.getMax.getMax(resetInternal.setMax.setPositiveButton)) != null) {
                MemoryWarningBridgeExtension.length length = this.getMax.verifyReferralCodePresenter;
                if (length == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("verifyReferralCodePresenter");
                }
                EditText editText = (EditText) this.getMax.getMax(resetInternal.setMax.setPositiveButton);
                length.setMin(String.valueOf(editText != null ? editText.getText() : null));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        r7 = r7.getText();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r7, int r8, @org.jetbrains.annotations.Nullable android.content.Intent r9) {
        /*
            r6 = this;
            super.onActivityResult(r7, r8, r9)
            r9 = 100
            if (r7 == r9) goto L_0x0008
            goto L_0x005b
        L_0x0008:
            r7 = -1
            if (r8 != r7) goto L_0x0029
            int r7 = o.resetInternal.setMax.setPositiveButton
            android.view.View r7 = r6.getMax(r7)
            android.widget.EditText r7 = (android.widget.EditText) r7
            if (r7 == 0) goto L_0x0020
            android.text.Editable r7 = r7.getText()
            if (r7 == 0) goto L_0x0020
            java.lang.String r7 = r7.toString()
            goto L_0x0021
        L_0x0020:
            r7 = 0
        L_0x0021:
            if (r7 != 0) goto L_0x0025
            java.lang.String r7 = ""
        L_0x0025:
            r6.getMax((java.lang.String) r7)
            return
        L_0x0029:
            r6.dismissProgress()
            r7 = 2131888498(0x7f120972, float:1.9411633E38)
            java.lang.String r7 = r6.getString(r7)
            java.lang.String r8 = "getString(R.string.referral_invalid_code)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            id.dana.dialog.CommonDialog$getMax r4 = new id.dana.dialog.CommonDialog$getMax
            android.content.Context r8 = r6.getContext()
            r4.<init>(r8)
            r8 = 1
            r4.length = r8
            r8 = 2131232392(0x7f080688, float:1.8080892E38)
            r4.FastBitmap$CoordinateSystem = r8
            r4.toFloatRange = r7
            id.dana.dialog.CommonDialog r7 = new id.dana.dialog.CommonDialog
            android.content.Context r1 = r4.getMax
            android.content.DialogInterface$OnDismissListener r2 = r4.setMin
            int r3 = r4.setMax
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r7.setMin()
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.onboarding.referral.VerifyReferralCodeFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    private final void getMin(String str) {
        showProgress();
        WheelView.ScrollerTask.getMax getmax = new WheelView.ScrollerTask.getMax(getContext());
        uploadCoreByStartService uploadcorebystartservice = getmax.getMax;
        TitleBarRightButtonView.AnonymousClass1<Location> max = LogContextImpl.AnonymousClass1.setMax(uploadcorebystartservice.setMin, uploadcorebystartservice.setMax);
        uploadCoreByStartService uploadcorebystartservice2 = getmax.getMax;
        LocationRequest create = LocationRequest.create();
        create.setPriority(100);
        create.setInterval(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        create.setFastestInterval(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        GriverProgressBar.UpdateRunnable subscribe = max.switchIfEmpty(takeAndSync.getMin(uploadcorebystartservice2.setMin, uploadcorebystartservice2.setMax, create)).subscribe(new getMin(this, str));
        Intrinsics.checkNotNullExpressionValue(subscribe, "LocationRequestBuilder(c…e.dispose()\n            }");
        this.setMax = subscribe;
    }

    private final void equals() {
        WheelView.ScrollerTask.getMax getmax = new WheelView.ScrollerTask.getMax(getContext());
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
        }).subscribe(new toIntRange(this));
        Intrinsics.checkNotNullExpressionValue(subscribe, "LocationRequestBuilder(c…e.dispose()\n            }");
        this.setMin = subscribe;
    }

    private final void getMax(String str) {
        if (getContext() == null) {
            return;
        }
        if (!WheelView.ScrollerTask.getMax(getContext())) {
            isBaselineAligned isbaselinealigned = this.values;
            if (isbaselinealigned == null) {
                Intrinsics.throwUninitializedPropertyAccessException("locationPermissionDialog");
            }
            isbaselinealigned.show();
        } else if (WheelView.ScrollerTask.length(getContext())) {
            getMin(str);
        } else {
            equals();
        }
    }

    public final void onDestroy() {
        GriverProgressBar.UpdateRunnable updateRunnable = this.toFloatRange;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        super.onDestroy();
    }

    public final void getMin() {
        dismissProgress();
        String string = getString(R.string.referral_valid_code);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.referral_valid_code)");
        CommonDialog.getMax getmax = new CommonDialog.getMax(getContext());
        getmax.length = true;
        getmax.FastBitmap$CoordinateSystem = R.drawable.ic_success;
        getmax.toFloatRange = string;
        new CommonDialog(getmax.getMax, getmax.setMin, getmax.setMax, getmax, (byte) 0).setMin();
    }

    /* access modifiers changed from: private */
    public final void setMax(String str) {
        CommonDialog.getMax getmax = new CommonDialog.getMax(getContext());
        getmax.length = true;
        getmax.FastBitmap$CoordinateSystem = R.drawable.ic_warning_14;
        getmax.toFloatRange = str;
        new CommonDialog(getmax.getMax, getmax.setMin, getmax.setMax, getmax, (byte) 0).setMin();
    }

    public final void length(@Nullable String str) {
        dismissProgress();
        if (str == null) {
            str = getString(R.string.referral_invalid_code);
            Intrinsics.checkNotNullExpressionValue(str, "getString(R.string.referral_invalid_code)");
        }
        setMax(str);
    }

    public final void length() {
        EditText editText = (EditText) getMax(resetInternal.setMax.setPositiveButton);
        getMax(String.valueOf(editText != null ? editText.getText() : null));
    }

    public final void toIntRange() {
        dismissProgress();
        EditText editText = (EditText) getMax(resetInternal.setMax.setPositiveButton);
        if (editText != null) {
            editText.setText("");
        }
        SensorBridgeExtension sensorBridgeExtension = this.equals;
        if (sensorBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
        }
        BaseKey verifyReferralCodeErrorKey = new VerifyReferralCodeErrorKey();
        Intrinsics.checkNotNullParameter(verifyReferralCodeErrorKey, "key");
        sensorBridgeExtension.getMin.getBackstack().goTo(verifyReferralCodeErrorKey);
    }

    public final void toFloatRange() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("phoneNumber") : null;
        SensorBridgeExtension sensorBridgeExtension = this.equals;
        if (sensorBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
        }
        String str = string == null ? "" : string;
        String prependZeroToPhoneNumber = isOriginHasAppInfo.prependZeroToPhoneNumber(string);
        Intrinsics.checkNotNullExpressionValue(prependZeroToPhoneNumber, "NumberUtils.prependZeroToPhoneNumber(phoneNumber)");
        EditText editText = (EditText) getMax(resetInternal.setMax.setPositiveButton);
        sensorBridgeExtension.setMax(str, prependZeroToPhoneNumber, (String) null, String.valueOf(editText != null ? editText.getText() : null));
    }

    public final void dismissProgress() {
        CommonDialog commonDialog = this.IsOverlapping;
        if (commonDialog != null) {
            new Handler().postDelayed(new setLanguages(commonDialog), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/onboarding/referral/VerifyReferralCodeFragment$Companion;", "", "()V", "DELAY", "", "MAX_CODE_LENGTH", "PERMISSION_REQUEST_CODE", "newInstance", "Lid/dana/onboarding/referral/VerifyReferralCodeFragment;", "phoneNumber", "", "prizeName", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r2;
        if (this.toIntRange == null) {
            downloadAndInstallApp.setMin setmin = new downloadAndInstallApp.setMin((byte) 0);
            if (this.getMax != null) {
                r2 = this.getMax.getApplicationComponent();
            } else {
                r2 = null;
            }
            if (r2 != null) {
                setmin.setMin = r2;
                setmin.getMin = new ReferralModule(this);
                stopIgnoring.setMin(setmin.getMin, ReferralModule.class);
                stopIgnoring.setMin(setmin.setMin, PrepareException.AnonymousClass1.class);
                downloadAndInstallApp downloadandinstallapp = new downloadAndInstallApp(setmin.getMin, setmin.setMin, (byte) 0);
                Intrinsics.checkNotNullExpressionValue(downloadandinstallapp, "DaggerReferralComponent.…\n                .build()");
                this.toIntRange = downloadandinstallapp;
            } else {
                throw null;
            }
        }
        subList sublist = this.toIntRange;
        if (sublist == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralComponent");
        }
        sublist.setMin(this);
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        MemoryWarningBridgeExtension.length length2 = this.verifyReferralCodePresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("verifyReferralCodePresenter");
        }
        getminArr[0] = length2;
        getMin(getminArr);
        CommonDialog.getMax getmax = new CommonDialog.getMax(getContext());
        getmax.length = false;
        getmax.FastBitmap$CoordinateSystem = R.drawable.ic_loading_bg;
        getmax.toFloatRange = getString(R.string.checking);
        getmax.setMin = new IsOverlapping(this);
        CommonDialog.getMax min = getmax.getMin();
        this.IsOverlapping = new CommonDialog(min.getMax, min.setMin, min.setMax, min, (byte) 0);
        BaseActivity baseActivity = this.getMax;
        if (baseActivity != null) {
            SensorBridgeExtension sensorBridgeExtension = (SensorBridgeExtension) ((OnboardingActivity) ((KeyBaseActivity) baseActivity)).getNavigationManager();
            this.equals = sensorBridgeExtension;
            if (sensorBridgeExtension == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
            }
            sensorBridgeExtension.length.setMenuLeftButton((int) R.drawable.btn_arrow_left);
            SensorBridgeExtension sensorBridgeExtension2 = this.equals;
            if (sensorBridgeExtension2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
            }
            sensorBridgeExtension2.length.setMenuRightButton(getString(R.string.menu_skip));
            SensorBridgeExtension sensorBridgeExtension3 = this.equals;
            if (sensorBridgeExtension3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
            }
            sensorBridgeExtension3.length.setMenuRightButtonEnabled(true);
            SensorBridgeExtension sensorBridgeExtension4 = this.equals;
            if (sensorBridgeExtension4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
            }
            sensorBridgeExtension4.setMax = new length(this);
            GriverProgressBar.UpdateRunnable updateRunnable = this.toFloatRange;
            if (updateRunnable != null) {
                updateRunnable.dispose();
            }
            this.toFloatRange = onLoadChildren.textChanges((EditText) getMax(resetInternal.setMax.setPositiveButton)).debounce(300, TimeUnit.MILLISECONDS).filter(setMax.setMin).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).subscribe(new toFloatRange(this));
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            getProgressViewStartOffset.getMax getmax2 = new getProgressViewStartOffset.getMax(requireContext);
            getmax2.toFloatRange = getString(R.string.referral_location_permission_dialog_title);
            getProgressViewStartOffset.getMax getmax3 = getmax2;
            getmax3.isInside = getString(R.string.referral_location_permission_dialog_description);
            getProgressViewStartOffset.getMax getmax4 = getmax3;
            getmax4.setMax = R.drawable.ic_location_permission_icon;
            getProgressViewStartOffset.getMax getmax5 = getmax4;
            getmax5.toIntRange = 0;
            getmax5.IsOverlapping().setMax(false);
            Unit unit = Unit.INSTANCE;
            getProgressViewStartOffset.getMax max = getmax5.setMin(getString(R.string.referral_location_permission_dialog_allow), new equals(this)).getMax(getString(R.string.referral_location_permission_dialog_cancel), new isInside(this));
            this.values = new getProgressViewStartOffset(max.invoke, max.length, max, max.equals, (byte) 0).getMin();
            BaseActivity baseActivity2 = this.getMax;
            Intrinsics.checkNotNullExpressionValue(baseActivity2, "baseActivity");
            setOnWheelViewListener.setMin(baseActivity2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }

    public final void showProgress() {
        setOnWheelViewListener.getMax((Activity) this.getMax);
        CommonDialog commonDialog = this.IsOverlapping;
        if (commonDialog != null) {
            commonDialog.setMin();
        }
    }

    public static final /* synthetic */ void setMax(VerifyReferralCodeFragment verifyReferralCodeFragment) {
        Bundle arguments = verifyReferralCodeFragment.getArguments();
        String string = arguments != null ? arguments.getString("phoneNumber") : null;
        SensorBridgeExtension sensorBridgeExtension = verifyReferralCodeFragment.equals;
        if (sensorBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
        }
        String str = string == null ? "" : string;
        String prependZeroToPhoneNumber = isOriginHasAppInfo.prependZeroToPhoneNumber(string);
        Intrinsics.checkNotNullExpressionValue(prependZeroToPhoneNumber, "NumberUtils.prependZeroToPhoneNumber(phoneNumber)");
        sensorBridgeExtension.setMax(str, prependZeroToPhoneNumber, (String) null, (String) null);
    }

    public static final /* synthetic */ void setMin(VerifyReferralCodeFragment verifyReferralCodeFragment) {
        Editable text;
        EditText editText = (EditText) verifyReferralCodeFragment.getMax(resetInternal.setMax.setPositiveButton);
        if (editText != null && (text = editText.getText()) != null) {
            if (text.length() > 0) {
                EditText editText2 = (EditText) verifyReferralCodeFragment.getMax(resetInternal.setMax.setPositiveButton);
                String valueOf = String.valueOf(editText2 != null ? editText2.getText() : null);
                if (WheelView.ScrollerTask.length(verifyReferralCodeFragment.getContext())) {
                    verifyReferralCodeFragment.getMin(valueOf);
                } else {
                    verifyReferralCodeFragment.equals();
                }
            }
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toDoubleRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
