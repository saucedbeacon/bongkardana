package id.dana.twilio.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.messaging.FirebaseMessaging;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.challenge.ChallengeControl;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.danah5.bioutility.BioUtilityBridge;
import id.dana.dialog.DialogWithImage;
import id.dana.domain.foundation.logger.PerformanceConstant;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import id.dana.richview.LogoProgressView;
import id.dana.twilio.trusteddevice.TrustedDeviceActivity;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BLEBridgeExtension;
import o.GriverPageContainer;
import o.PickerBridgeExtension;
import o.PrepareException;
import o.TitleBarExtension;
import o.click;
import o.closeBluetoothAdapter;
import o.dispatchOnCancelled;
import o.getDetectedCrashCount;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.setCancelText;
import o.setStateOn;
import o.showBackHome;
import o.showSingleWheelDialog;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0002J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\"\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u0010H\u0002J\b\u0010\"\u001a\u00020\u0010H\u0002J\u000f\u0010#\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0010H\u0002J\n\u0010&\u001a\u0004\u0018\u00010'H\u0002J\b\u0010(\u001a\u00020\u0010H\u0002J\b\u0010)\u001a\u00020\u0010H\u0002J\b\u0010*\u001a\u00020\u0010H\u0002J\b\u0010+\u001a\u00020\u0010H\u0002J\u0018\u0010,\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002J\u0018\u0010-\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010.\u001a\u00020\u0010H\u0002J\u0012\u0010/\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u00062"}, d2 = {"Lid/dana/twilio/onboarding/TwilioIntroductionActivity;", "Lid/dana/base/BaseActivity;", "()V", "challengeControl", "Lid/dana/challenge/ChallengeControl;", "phonePermission", "Lid/dana/utils/permission/Permission;", "pushToken", "", "twilioIntroductionPresenter", "Lid/dana/twilio/onboarding/TwilioIntroductionPresenter;", "getTwilioIntroductionPresenter", "()Lid/dana/twilio/onboarding/TwilioIntroductionPresenter;", "setTwilioIntroductionPresenter", "(Lid/dana/twilio/onboarding/TwilioIntroductionPresenter;)V", "consult", "", "source", "enroll", "securityId", "getLayout", "", "getPinLockedListener", "Landroid/content/DialogInterface$OnClickListener;", "getPushToken", "init", "initInjector", "initPhonePermission", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "openTrustedDevicePage", "prepareBundleData", "setupTabLayout", "()Lkotlin/Unit;", "setupToolbar", "setupViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "showFailedToast", "showPinLockedDialog", "showSuccessToast", "startLoading", "startOtpChallenge", "startPinChallenge", "stopLoading", "warning", "message", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TwilioIntroductionActivity extends BaseActivity {
    @NotNull
    public static final String CHALLENGE_OTP = "OTP_SMS";
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    @NotNull
    public static final String HOME_PAGE = "HOME_PAGE";
    @NotNull
    public static final String SETTING_PAGE = "SETTING_PAGE";
    @NotNull
    public static final String TRUSTED_DEVICE_PAGE = "TRUSTED_DEVICE_PAGE";
    /* access modifiers changed from: private */
    public setStateOn getMax;
    /* access modifiers changed from: private */
    public ChallengeControl getMin;
    private HashMap isInside;
    /* access modifiers changed from: private */
    public String setMax;
    @Inject
    public showBackHome twilioIntroductionPresenter;

    public final void _$_clearFindViewByIdCache() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(161430828, oncanceled);
            onCancelLoad.getMin(161430828, oncanceled);
        }
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -408904152 == (max = dispatchOnCancelled.getMax(applicationContext, -408904152)))) {
            onCanceled oncanceled = new onCanceled(-408904152, max, 512);
            onCancelLoad.setMax(-408904152, oncanceled);
            onCancelLoad.getMin(-408904152, oncanceled);
        }
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2))) {
            return R.layout.activity_twillio_introduction;
        }
        onCanceled oncanceled = new onCanceled(length2, min, 32);
        onCancelLoad.setMax(-1252506038, oncanceled);
        onCancelLoad.getMin(-1252506038, oncanceled);
        return R.layout.activity_twillio_introduction;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class IsOverlapping extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        IsOverlapping(ViewPager2 viewPager2) {
            super(1, viewPager2, ViewPager2.class, "setCurrentItem", "setCurrentItem(I)V", 0);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((ViewPager2) this.receiver).setCurrentItem(i);
        }
    }

    public static final /* synthetic */ void access$consult(TwilioIntroductionActivity twilioIntroductionActivity, String str) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(2029618153, oncanceled);
            onCancelLoad.getMin(2029618153, oncanceled);
        }
        twilioIntroductionActivity.setMin();
        showBackHome showbackhome = twilioIntroductionActivity.twilioIntroductionPresenter;
        if (showbackhome == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioIntroductionPresenter");
        }
        Intrinsics.checkNotNullParameter(str, "source");
        getDetectedCrashCount getdetectedcrashcount = showbackhome.setMax;
        PickerBridgeExtension max2 = showBackHome.getMax(str);
        Intrinsics.checkNotNullParameter(max2, "$this$toTwilioConsult");
        getdetectedcrashcount.execute(new getDetectedCrashCount.setMin(new closeBluetoothAdapter(max2.setMax)), new showBackHome.length(showbackhome, str), new showBackHome.setMax(showbackhome));
    }

    public static final /* synthetic */ void access$enroll(TwilioIntroductionActivity twilioIntroductionActivity, String str, String str2) {
        int i;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1649557221, oncanceled);
            onCancelLoad.getMin(1649557221, oncanceled);
        }
        twilioIntroductionActivity.setMin();
        if (twilioIntroductionActivity.setMax != null) {
            showBackHome showbackhome = twilioIntroductionActivity.twilioIntroductionPresenter;
            if (showbackhome == null) {
                Intrinsics.throwUninitializedPropertyAccessException("twilioIntroductionPresenter");
            }
            String str3 = twilioIntroductionActivity.setMax;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pushToken");
            }
            showbackhome.getMax(str, str2, str3);
            return;
        }
        showBackHome showbackhome2 = twilioIntroductionActivity.twilioIntroductionPresenter;
        if (showbackhome2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioIntroductionPresenter");
        }
        showbackhome2.getMax("Push notification token null", str2);
        twilioIntroductionActivity.getMin();
        setCancelText.length(twilioIntroductionActivity, R.drawable.failed, R.drawable.bg_rounded_toast_failed, twilioIntroductionActivity.getString(R.string.twilio_enroll_failed_message), 48, 60, false, (String) null, 384);
    }

    public static final /* synthetic */ ChallengeControl access$getChallengeControl$p(TwilioIntroductionActivity twilioIntroductionActivity) {
        ChallengeControl challengeControl = twilioIntroductionActivity.getMin;
        if (challengeControl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("challengeControl");
        }
        return challengeControl;
    }

    public static final /* synthetic */ setStateOn access$getPhonePermission$p(TwilioIntroductionActivity twilioIntroductionActivity) {
        setStateOn setstateon = twilioIntroductionActivity.getMax;
        if (setstateon == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phonePermission");
        }
        return setstateon;
    }

    public static final /* synthetic */ String access$getPushToken$p(TwilioIntroductionActivity twilioIntroductionActivity) {
        String str = twilioIntroductionActivity.setMax;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pushToken");
        }
        return str;
    }

    public static final /* synthetic */ void access$warning(TwilioIntroductionActivity twilioIntroductionActivity, String str) {
        int length2;
        int min;
        Context baseContext = twilioIntroductionActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1748057379, oncanceled);
            onCancelLoad.getMin(-1748057379, oncanceled);
        }
        twilioIntroductionActivity.showWarningDialog(str);
    }

    @NotNull
    public final showBackHome getTwilioIntroductionPresenter() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 733718254 == (max = dispatchOnCancelled.getMax(applicationContext, 733718254)))) {
            onCanceled oncanceled = new onCanceled(733718254, max, 512);
            onCancelLoad.setMax(733718254, oncanceled);
            onCancelLoad.getMin(733718254, oncanceled);
        }
        showBackHome showbackhome = this.twilioIntroductionPresenter;
        if (showbackhome == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioIntroductionPresenter");
        }
        return showbackhome;
    }

    public final void setTwilioIntroductionPresenter(@NotNull showBackHome showbackhome) {
        Intrinsics.checkNotNullParameter(showbackhome, "<set-?>");
        this.twilioIntroductionPresenter = showbackhome;
    }

    public final void init() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1254290021, oncanceled);
            onCancelLoad.getMin(-1254290021, oncanceled);
        }
        boolean z = false;
        GriverPageContainer.PullFreshCallback.length length3 = new GriverPageContainer.PullFreshCallback.length((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            length3.getMin = applicationComponent;
            length3.setMin = new TwilioIntroductionModule(new getMin(this));
            stopIgnoring.setMin(length3.setMin, TwilioIntroductionModule.class);
            stopIgnoring.setMin(length3.getMin, PrepareException.AnonymousClass1.class);
            new GriverPageContainer.PullFreshCallback(length3.setMin, length3.getMin, (byte) 0).getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            showBackHome showbackhome = this.twilioIntroductionPresenter;
            if (showbackhome == null) {
                Intrinsics.throwUninitializedPropertyAccessException("twilioIntroductionPresenter");
            }
            getminArr[0] = showbackhome;
            registerPresenter(getminArr);
            int max = dispatchOnCancelled.getMax(0);
            if (max != 0) {
                onCanceled oncanceled2 = new onCanceled(0, max, 16);
                onCancelLoad.setMax(1927839330, oncanceled2);
                onCancelLoad.getMin(1927839330, oncanceled2);
            }
            Activity activity = this;
            setStateOn.getMin getmin = new setStateOn.getMin(activity);
            getmin.length.add("android.permission.CALL_PHONE");
            getmin.getMax = new setMax(this);
            setStateOn setstateon = new setStateOn(getmin, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(setstateon, "Permission.Builder(this)…  })\n            .build()");
            this.getMax = setstateon;
            FirebaseMessaging instance = FirebaseMessaging.getInstance();
            Intrinsics.checkNotNullExpressionValue(instance, "FirebaseMessaging.getInstance()");
            instance.getToken().addOnCompleteListener(new getMax(this));
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("source", "");
                String string2 = extras.getString(BioUtilityBridge.SECURITY_ID, "");
                if (Intrinsics.areEqual((Object) string, (Object) HOME_PAGE)) {
                    Intrinsics.checkNotNullExpressionValue(string2, BioUtilityBridge.SECURITY_ID);
                    if (string2.length() > 0) {
                        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.getSmallIconBitmap);
                        if (danaButtonPrimaryView != null) {
                            danaButtonPrimaryView.setOnClickListener(new isInside(string2, string, this));
                        }
                    }
                }
                if (Intrinsics.areEqual((Object) string, (Object) SETTING_PAGE)) {
                    Intrinsics.checkNotNullExpressionValue(string2, BioUtilityBridge.SECURITY_ID);
                    if (string2.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        DanaButtonPrimaryView danaButtonPrimaryView2 = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.getSmallIconBitmap);
                        if (danaButtonPrimaryView2 != null) {
                            danaButtonPrimaryView2.setOnClickListener(new equals(string, this));
                        }
                    }
                }
                if (Intrinsics.areEqual((Object) string, (Object) TRUSTED_DEVICE_PAGE)) {
                    setCancelText.length(activity, R.drawable.success, R.drawable.bg_rounded_toast_success, getString(R.string.twilio_remove_device_success_message), 48, 60, false, (String) null, 384);
                    DanaButtonPrimaryView danaButtonPrimaryView3 = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.getSmallIconBitmap);
                    if (danaButtonPrimaryView3 != null) {
                        danaButtonPrimaryView3.setOnClickListener(new toFloatRange(this));
                    }
                }
            }
            setTitle(getString(R.string.twilio_introduction_activity_toolbar));
            setMenuLeftButton((int) R.drawable.arrow_left_white);
            ViewPager2 viewPager2 = (ViewPager2) _$_findCachedViewById(resetInternal.setMax.animateTo);
            if (viewPager2 != null) {
                Context context = viewPager2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                viewPager2.setAdapter(new showSingleWheelDialog(context, new IsOverlapping(viewPager2)));
            }
            TabLayout tabLayout = (TabLayout) _$_findCachedViewById(resetInternal.setMax.getFixedWidthMajor);
            if (tabLayout != null) {
                ViewPager2 viewPager22 = (ViewPager2) _$_findCachedViewById(resetInternal.setMax.animateTo);
                Intrinsics.checkNotNullExpressionValue(viewPager22, "vp_content");
                BLEBridgeExtension.setMax(tabLayout, viewPager22, BLEBridgeExtension.length.INSTANCE);
                Unit unit = Unit.INSTANCE;
                return;
            }
            return;
        }
        throw null;
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (this.getMin != null) {
            ChallengeControl challengeControl = this.getMin;
            if (challengeControl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("challengeControl");
            }
            if (challengeControl.setMax(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, d2 = {"id/dana/twilio/onboarding/TwilioIntroductionActivity$initInjector$1", "Lid/dana/twilio/onboarding/TwilioIntroductionContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onFailedEnroll", "onShowChallenge", "securityId", "source", "challenge", "onSubmitEnroll", "onSuccessEnroll", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements TitleBarExtension.AnonymousClass1.length {
        final /* synthetic */ TwilioIntroductionActivity getMin;

        getMin(TwilioIntroductionActivity twilioIntroductionActivity) {
            this.getMin = twilioIntroductionActivity;
        }

        public final void showProgress() {
            this.getMin.setMin();
        }

        public final void dismissProgress() {
            this.getMin.getMin();
        }

        public final void getMax() {
            this.getMin.getMin();
            TwilioIntroductionActivity.access$openTrustedDevicePage(this.getMin);
        }

        public final void getMin() {
            this.getMin.getMin();
            setCancelText.length(this.getMin, R.drawable.failed, R.drawable.bg_rounded_toast_failed, this.getMin.getString(R.string.twilio_enroll_failed_message), 48, 60, false, (String) null, 384);
        }

        public final void getMax(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
            Intrinsics.checkNotNullParameter(str2, "source");
            TwilioIntroductionActivity.access$enroll(this.getMin, str, str2);
        }

        public final void getMax(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
            Intrinsics.checkNotNullParameter(str2, "source");
            Intrinsics.checkNotNullParameter(str3, PerformanceConstant.PAGE_CHALLENGE);
            this.getMin.getMin();
            if (StringsKt.equals(str3, "OTP_SMS", true)) {
                TwilioIntroductionActivity.access$startOtpChallenge(this.getMin, str, str2);
            } else {
                TwilioIntroductionActivity.access$startPinChallenge(this.getMin, str, str2);
            }
        }

        public final void onError(@Nullable String str) {
            this.getMin.getMin();
            setCancelText.length(this.getMin, R.drawable.failed, R.drawable.bg_rounded_toast_failed, this.getMin.getString(R.string.twilio_enroll_failed_message), 48, 60, false, (String) null, 384);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/twilio/onboarding/TwilioIntroductionActivity$initPhonePermission$1", "Lid/dana/utils/permission/Permission$PermissionListener;", "onPermissionDenied", "", "report", "Lid/dana/utils/permission/Permission$PermissionReport;", "onPermissionGranted", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements setStateOn.length {
        final /* synthetic */ TwilioIntroductionActivity getMax;

        public final void setMin(@NotNull setStateOn.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "report");
        }

        setMax(TwilioIntroductionActivity twilioIntroductionActivity) {
            this.getMax = twilioIntroductionActivity;
        }

        public final void getMin(@NotNull setStateOn.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "report");
            click.getMin(this.getMax, "1500445", setmin.setMax());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/twilio/onboarding/TwilioIntroductionActivity$prepareBundleData$1$1"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements View.OnClickListener {
        final /* synthetic */ TwilioIntroductionActivity getMax;
        final /* synthetic */ String length;
        final /* synthetic */ String setMax;

        isInside(String str, String str2, TwilioIntroductionActivity twilioIntroductionActivity) {
            this.length = str;
            this.setMax = str2;
            this.getMax = twilioIntroductionActivity;
        }

        public final void onClick(View view) {
            TwilioIntroductionActivity twilioIntroductionActivity = this.getMax;
            String str = this.length;
            Intrinsics.checkNotNullExpressionValue(str, BioUtilityBridge.SECURITY_ID);
            TwilioIntroductionActivity.access$enroll(twilioIntroductionActivity, str, this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/twilio/onboarding/TwilioIntroductionActivity$prepareBundleData$1$2"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ TwilioIntroductionActivity getMax;
        final /* synthetic */ String setMin;

        equals(String str, TwilioIntroductionActivity twilioIntroductionActivity) {
            this.setMin = str;
            this.getMax = twilioIntroductionActivity;
        }

        public final void onClick(View view) {
            TwilioIntroductionActivity.access$consult(this.getMax, this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/twilio/onboarding/TwilioIntroductionActivity$prepareBundleData$1$3"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnClickListener {
        final /* synthetic */ TwilioIntroductionActivity getMax;

        toFloatRange(TwilioIntroductionActivity twilioIntroductionActivity) {
            this.getMax = twilioIntroductionActivity;
        }

        public final void onClick(View view) {
            TwilioIntroductionActivity.access$consult(this.getMax, TwilioIntroductionActivity.SETTING_PAGE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/twilio/onboarding/TwilioIntroductionActivity$startOtpChallenge$1", "Lid/dana/challenge/ChallengeControl$Listener;", "onChallengeCanceled", "", "challengeScenario", "", "cancelReason", "data", "Landroid/os/Bundle;", "onChallengeCompleted", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements ChallengeControl.getMin {
        final /* synthetic */ String getMin;
        final /* synthetic */ String length;
        final /* synthetic */ TwilioIntroductionActivity setMin;

        toIntRange(TwilioIntroductionActivity twilioIntroductionActivity, String str, String str2) {
            this.setMin = twilioIntroductionActivity;
            this.getMin = str;
            this.length = str2;
        }

        public final void getMax() {
            TwilioIntroductionActivity.access$enroll(this.setMin, this.getMin, this.length);
        }

        public final void getMin(@Nullable String str, @Nullable String str2, @Nullable Bundle bundle) {
            this.setMin.getMin();
            if ((bundle != null ? bundle.getString("message") : null) != null) {
                String string = bundle.getString("message");
                if (string == null) {
                    string = "";
                }
                TwilioIntroductionActivity.access$warning(this.setMin, string);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/twilio/onboarding/TwilioIntroductionActivity$startPinChallenge$1", "Lid/dana/challenge/ChallengeControl$Listener;", "onChallengeCanceled", "", "challengeScenario", "", "cancelReason", "data", "Landroid/os/Bundle;", "onChallengeCompleted", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toDoubleRange implements ChallengeControl.getMin {
        final /* synthetic */ TwilioIntroductionActivity getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ String setMin;

        toDoubleRange(TwilioIntroductionActivity twilioIntroductionActivity, String str, String str2) {
            this.getMax = twilioIntroductionActivity;
            this.getMin = str;
            this.setMin = str2;
        }

        public final void getMax() {
            TwilioIntroductionActivity.access$enroll(this.getMax, this.getMin, this.setMin);
        }

        public final void getMin(@Nullable String str, @Nullable String str2, @Nullable Bundle bundle) {
            this.getMax.getMin();
            if (str2 != null) {
                int hashCode = str2.hashCode();
                if (hashCode != -305104263) {
                    if (hashCode != -109866462) {
                        if (hashCode == 462997423 && str2.equals(ChallengeControl.CancelReason.SESSION_EXPIRED)) {
                            TwilioIntroductionActivity twilioIntroductionActivity = this.getMax;
                            TwilioIntroductionActivity.access$warning(twilioIntroductionActivity, twilioIntroductionActivity.getString(R.string.session_expired));
                        }
                    } else if (str2.equals(ChallengeControl.CancelReason.PIN_TEMPORARY_LOCKED)) {
                        DialogWithImage.length(this.getMax, new length(this.getMax)).setMin();
                    }
                } else if (str2.equals("forgot_pin")) {
                    TwilioIntroductionActivity.access$getPhonePermission$p(this.getMax).setMin();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements DialogInterface.OnClickListener {
        final /* synthetic */ TwilioIntroductionActivity getMax;

        length(TwilioIntroductionActivity twilioIntroductionActivity) {
            this.getMax = twilioIntroductionActivity;
        }

        public final void onClick(@NotNull DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(dialogInterface, ImagePickerEvent.DIALOG);
            if (i == -2) {
                dialogInterface.dismiss();
            } else if (i == -1) {
                TwilioIntroductionActivity.access$getPhonePermission$p(this.getMax).setMin();
                dialogInterface.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lcom/google/android/gms/tasks/Task;", "", "kotlin.jvm.PlatformType", "onComplete"}, k = 3, mv = {1, 4, 2})
    static final class getMax<TResult> implements OnCompleteListener<String> {
        final /* synthetic */ TwilioIntroductionActivity setMin;

        getMax(TwilioIntroductionActivity twilioIntroductionActivity) {
            this.setMin = twilioIntroductionActivity;
        }

        public final void onComplete(@NotNull Task<String> task) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (task.isSuccessful()) {
                TwilioIntroductionActivity twilioIntroductionActivity = this.setMin;
                String result = task.getResult();
                Intrinsics.checkNotNullExpressionValue(result, "task.result");
                twilioIntroductionActivity.setMax = result;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setMin() {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$Actions);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        LogoProgressView logoProgressView = (LogoProgressView) _$_findCachedViewById(resetInternal.setMax.setHeaderTitle);
        if (logoProgressView != null) {
            logoProgressView.startRefresh();
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.getSmallIconBitmap);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    public final void getMin() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 72886885 == (max = dispatchOnCancelled.getMax(applicationContext, 72886885)))) {
            onCanceled oncanceled = new onCanceled(72886885, max, 512);
            onCancelLoad.setMax(72886885, oncanceled);
            onCancelLoad.getMin(72886885, oncanceled);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$Actions);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        LogoProgressView logoProgressView = (LogoProgressView) _$_findCachedViewById(resetInternal.setMax.setHeaderTitle);
        if (logoProgressView != null) {
            logoProgressView.stopRefresh();
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.getSmallIconBitmap);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/twilio/onboarding/TwilioIntroductionActivity$Companion;", "", "()V", "BUNDLE_SECURITYID", "", "BUNDLE_SOURCE", "CHALLENGE_OTP", "HOME_PAGE", "SETTING_PAGE", "TRUSTED_DEVICE_PAGE", "createTwilioIntroductionIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "source", "securityId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }

        @NotNull
        public static Intent setMin(@NotNull Context context, @NotNull String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(str, "source");
            Intent intent = new Intent(context, TwilioIntroductionActivity.class);
            intent.putExtra("source", str);
            intent.putExtra(BioUtilityBridge.SECURITY_ID, str2);
            return intent;
        }
    }

    public static final /* synthetic */ void access$openTrustedDevicePage(TwilioIntroductionActivity twilioIntroductionActivity) {
        TrustedDeviceActivity.setMin setmin = TrustedDeviceActivity.Companion;
        twilioIntroductionActivity.startActivity(TrustedDeviceActivity.setMin.getMin(twilioIntroductionActivity));
        twilioIntroductionActivity.finish();
    }

    public static final /* synthetic */ void access$startOtpChallenge(TwilioIntroductionActivity twilioIntroductionActivity, String str, String str2) {
        ChallengeControl.length length2 = new ChallengeControl.length((BaseActivity) twilioIntroductionActivity);
        length2.getMin = "twilio_otp";
        ChallengeControl.length length3 = length2;
        length3.IsOverlapping = str == null ? "" : str;
        ChallengeControl.length length4 = length3;
        length4.setMax = "twilio_otp";
        ChallengeControl.length length5 = length4;
        length5.toString = new toIntRange(twilioIntroductionActivity, str, str2);
        ChallengeControl challengeControl = new ChallengeControl(length5, (byte) 0);
        twilioIntroductionActivity.getMin = challengeControl;
        if (challengeControl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("challengeControl");
        }
        challengeControl.getMin();
    }

    public static final /* synthetic */ void access$startPinChallenge(TwilioIntroductionActivity twilioIntroductionActivity, String str, String str2) {
        ChallengeControl.length length2 = new ChallengeControl.length((BaseActivity) twilioIntroductionActivity);
        length2.getMin = "twilio_pin";
        ChallengeControl.length length3 = length2;
        length3.IsOverlapping = str == null ? "" : str;
        ChallengeControl.length length4 = length3;
        length4.setMax = "twilio_pin";
        ChallengeControl.length length5 = length4;
        length5.toString = new toDoubleRange(twilioIntroductionActivity, str, str2);
        ChallengeControl challengeControl = new ChallengeControl(length5, (byte) 0);
        twilioIntroductionActivity.getMin = challengeControl;
        if (challengeControl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("challengeControl");
        }
        challengeControl.getMin();
    }
}
