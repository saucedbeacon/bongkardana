package o;

import android.view.View;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.KeyBaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.onboarding.OnboardingActivity;
import id.dana.onboarding.referral.VerifyReferralCodeErrorKey;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/onboarding/referral/VerifyReferralCodeErrorFragment;", "Lid/dana/base/KeyBaseFragment;", "Lid/dana/onboarding/OnboardingActivity;", "Lid/dana/onboarding/referral/VerifyReferralCodeErrorKey;", "()V", "onboardingNavigationManager", "Lid/dana/onboarding/OnboardingNavigationManager;", "getLayout", "", "init", "", "setupTryAgainButtonOnClick", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onTrimMemory extends MultiInstanceInvalidationService<OnboardingActivity, VerifyReferralCodeErrorKey> {
    @NotNull
    public static final getMin setMin = new getMin((byte) 0);
    private SensorBridgeExtension getMin;
    private HashMap setMax;

    public final View getMax(int i) {
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

    public final void getMax() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final int setMin() {
        return R.layout.activity_referral_location_error_page;
    }

    public static final /* synthetic */ SensorBridgeExtension getMax(onTrimMemory ontrimmemory) {
        SensorBridgeExtension sensorBridgeExtension = ontrimmemory.getMin;
        if (sensorBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
        }
        return sensorBridgeExtension;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ onTrimMemory setMax;

        length(onTrimMemory ontrimmemory) {
            this.setMax = ontrimmemory;
        }

        public final void onClick(View view) {
            onTrimMemory.getMax(this.setMax).getMin.getBackstack().goBack();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lid/dana/onboarding/referral/VerifyReferralCodeErrorFragment$Companion;", "", "()V", "newInstance", "Lid/dana/onboarding/referral/VerifyReferralCodeErrorFragment;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public final void setMax() {
        BaseActivity baseActivity = this.getMax;
        if (baseActivity != null) {
            SensorBridgeExtension sensorBridgeExtension = (SensorBridgeExtension) ((OnboardingActivity) ((KeyBaseActivity) baseActivity)).getNavigationManager();
            this.getMin = sensorBridgeExtension;
            if (sensorBridgeExtension == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
            }
            BaseActivity baseActivity2 = this.getMax;
            if (baseActivity2 != null) {
                ((OnboardingActivity) ((KeyBaseActivity) baseActivity2)).getNavigationManager();
                sensorBridgeExtension.length.setMenuLeftButton((int) R.drawable.btn_arrow_left);
                sensorBridgeExtension.length.setMenuRightButtonEnabled(false);
                sensorBridgeExtension.length.setMenuRightButton(getString(R.string.hide_right_btn));
                ((DanaButtonPrimaryView) getMax(resetInternal.setMax.MediaBrowserCompat$SearchResultReceiver)).setOnClickListener(new length(this));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type T");
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
