package id.dana.onboarding;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.di.modules.MixpanelEnableModule;
import id.dana.domain.foundation.logger.PerformanceConstant;
import id.dana.onboarding.OnboardingActivity;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BlurProcess;
import o.GyroscopeSensorService;
import o.PrepareException;
import o.RawQuery;
import o.SensorService;
import o.StackBlurManager;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getPerformanceTracker;
import o.isValidSnapshot;
import o.onCancelLoad;
import o.onCanceled;
import o.removeInvalidParams;
import o.resetInternal;
import o.setStatusBar;
import o.stopIgnoring;
import o.stopMonitorMemoryWarning;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0014J\b\u0010!\u001a\u00020\u0019H\u0002J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lid/dana/onboarding/IntroductionActivity;", "Lid/dana/base/BaseActivity;", "()V", "deviceInformationProvider", "Lid/dana/data/config/DeviceInformationProvider;", "getDeviceInformationProvider", "()Lid/dana/data/config/DeviceInformationProvider;", "setDeviceInformationProvider", "(Lid/dana/data/config/DeviceInformationProvider;)V", "introPagePosition", "", "introductionComponent", "Lid/dana/di/component/IntroductionComponent;", "mixpanelEnablePresenter", "Lid/dana/onboarding/mixpanel/MixpanelEnableContract$Presenter;", "getMixpanelEnablePresenter", "()Lid/dana/onboarding/mixpanel/MixpanelEnableContract$Presenter;", "setMixpanelEnablePresenter", "(Lid/dana/onboarding/mixpanel/MixpanelEnableContract$Presenter;)V", "simplePagerAdapter", "Lid/dana/onboarding/view/SimplePagerAdapter;", "viewList", "", "Lid/dana/onboarding/view/BaseSimpleView;", "configToolbar", "", "getLayout", "init", "initAdapter", "initEnterPhoneNumberTextStyling", "initInjector", "initViewPager", "onDestroy", "onSkip", "onWindowFocusChanged", "hasFocus", "", "trackEvent", "unbind", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class IntroductionActivity extends BaseActivity {
    @Inject
    public getPerformanceTracker deviceInformationProvider;
    private HashMap equals;
    private setStatusBar getMax;
    private final List<GyroscopeSensorService.SensorChangedListener> getMin = new ArrayList();
    @Inject
    public stopMonitorMemoryWarning.getMin mixpanelEnablePresenter;
    private removeInvalidParams setMax;
    /* access modifiers changed from: private */
    public int toIntRange;

    public final void _$_clearFindViewByIdCache() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-11323777, oncanceled);
            onCancelLoad.getMin(-11323777, oncanceled);
        }
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 16);
            onCancelLoad.setMax(-1069720547, oncanceled);
            onCancelLoad.getMin(-1069720547, oncanceled);
        }
        if (this.equals == null) {
            this.equals = new HashMap();
        }
        View view = (View) this.equals.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.equals.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_introduction;
    }

    public static final /* synthetic */ void access$trackEvent(IntroductionActivity introductionActivity) {
        int length;
        int min;
        Context baseContext = introductionActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1375032837, oncanceled);
            onCancelLoad.getMin(-1375032837, oncanceled);
        }
        convertDipToPx.length length2 = new convertDipToPx.length(introductionActivity);
        length2.getMax = TrackerKey.Event.ONBOARDING_EXIT;
        convertDipToPx.length max = length2.getMax(TrackerKey.OnboardingProperty.LAST_VIEWED_ONBOARDING_PAGE, introductionActivity.toIntRange + 1);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    @NotNull
    public final getPerformanceTracker getDeviceInformationProvider() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(170260438, oncanceled);
            onCancelLoad.getMin(170260438, oncanceled);
        }
        getPerformanceTracker getperformancetracker = this.deviceInformationProvider;
        if (getperformancetracker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceInformationProvider");
        }
        return getperformancetracker;
    }

    public final void setDeviceInformationProvider(@NotNull getPerformanceTracker getperformancetracker) {
        Intrinsics.checkNotNullParameter(getperformancetracker, "<set-?>");
        this.deviceInformationProvider = getperformancetracker;
    }

    @NotNull
    public final stopMonitorMemoryWarning.getMin getMixpanelEnablePresenter() {
        stopMonitorMemoryWarning.getMin getmin = this.mixpanelEnablePresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mixpanelEnablePresenter");
        }
        return getmin;
    }

    public final void setMixpanelEnablePresenter(@NotNull stopMonitorMemoryWarning.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.mixpanelEnablePresenter = getmin;
    }

    public final void configToolbar() {
        setToolbarImage(R.drawable.ic_dana_logo_icon_text);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"id/dana/onboarding/IntroductionActivity$initViewPager$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements ViewPager.setMax {
        final /* synthetic */ IntroductionActivity getMax;

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        setMin(IntroductionActivity introductionActivity) {
            this.getMax = introductionActivity;
        }

        public final void onPageSelected(int i) {
            this.getMax.toIntRange = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ IntroductionActivity setMin;

        setMax(IntroductionActivity introductionActivity) {
            this.setMin = introductionActivity;
        }

        public final void onClick(View view) {
            IntroductionActivity.access$trackEvent(this.setMin);
            OnboardingActivity.setMax setmax = OnboardingActivity.Companion;
            IntroductionActivity introductionActivity = this.setMin;
            Intent intent = introductionActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
            OnboardingActivity.setMax.setMin(introductionActivity, intent.getData());
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-399875275, oncanceled);
            onCancelLoad.getMin(-399875275, oncanceled);
        }
        super.onWindowFocusChanged(z);
        if (z) {
            StackBlurManager.IsOverlapping();
            StackBlurManager.setMin(PerformanceConstant.SPLASH_TO_INTRODUCE_TIME);
        }
    }

    public final void init() {
        int length;
        Context context = null;
        if (this.setMax == null) {
            isValidSnapshot.getMin getmin = new isValidSnapshot.getMin((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                getmin.setMax = applicationComponent;
                getmin.getMax = new MixpanelEnableModule();
                if (getmin.getMax == null) {
                    getmin.getMax = new MixpanelEnableModule();
                }
                stopIgnoring.setMin(getmin.setMax, PrepareException.AnonymousClass1.class);
                this.setMax = new isValidSnapshot(getmin.getMax, getmin.setMax, (byte) 0);
            } else {
                throw null;
            }
        }
        removeInvalidParams removeinvalidparams = this.setMax;
        if (removeinvalidparams != null) {
            removeinvalidparams.length(this);
        }
        Context baseContext = getBaseContext();
        if (baseContext != null) {
            context = baseContext.getApplicationContext();
        }
        if (!(context == null || (length = dispatchOnCancelled.length(context, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-1080606899, oncanceled);
            onCancelLoad.getMin(-1080606899, oncanceled);
        }
        List<GyroscopeSensorService.SensorChangedListener> list = this.getMin;
        String string = getString(R.string.intro_1_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.intro_1_title)");
        String string2 = getString(R.string.intro_1_onboarding_animation_path);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.intro…nboarding_animation_path)");
        String string3 = getString(R.string.intro_1_description);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.intro_1_description)");
        list.add(new SensorService(string, string2, string3));
        List<GyroscopeSensorService.SensorChangedListener> list2 = this.getMin;
        String string4 = getString(R.string.intro_2_title);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.intro_2_title)");
        String string5 = getString(R.string.intro_2_onboarding_animation_path);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.intro…nboarding_animation_path)");
        String string6 = getString(R.string.intro_2_description);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.intro_2_description)");
        list2.add(new SensorService(string4, string5, string6));
        List<GyroscopeSensorService.SensorChangedListener> list3 = this.getMin;
        String string7 = getString(R.string.intro_3_title);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.intro_3_title)");
        String string8 = getString(R.string.intro_3_onboarding_animation_path);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.intro…nboarding_animation_path)");
        String string9 = getString(R.string.intro_3_description);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(R.string.intro_3_description)");
        list3.add(new SensorService(string7, string8, string9));
        setStatusBar setstatusbar = new setStatusBar(this);
        this.getMax = setstatusbar;
        if (setstatusbar != null) {
            setstatusbar.getMin(this.getMin);
        }
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(resetInternal.setMax.enableTransition);
        if (viewPager != null) {
            viewPager.setAdapter(this.getMax);
        }
        ViewPager viewPager2 = (ViewPager) _$_findCachedViewById(resetInternal.setMax.enableTransition);
        if (viewPager2 != null) {
            viewPager2.addOnPageChangeListener(new setMin(this));
        }
        String string10 = getString(R.string.lbl_enter_phone_number_intro);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(R.string.lbl_enter_phone_number_intro)");
        String string11 = getString(R.string.lbl_intro_phone_number_highlight);
        Intrinsics.checkNotNullExpressionValue(string11, "getString(R.string.lbl_i…o_phone_number_highlight)");
        CharSequence charSequence = string10;
        int indexOf$default = StringsKt.indexOf$default(charSequence, string11, 0, false, 6, (Object) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new StyleSpan(1), indexOf$default, string11.length() + indexOf$default, 33);
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.onRtlPropertiesChanged);
        if (textView != null) {
            textView.setText(spannableStringBuilder);
        }
        stopMonitorMemoryWarning.getMin getmin2 = this.mixpanelEnablePresenter;
        if (getmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mixpanelEnablePresenter");
        }
        getmin2.length();
        BlurProcess.getMin(TrackerKey.Event.ONBOARDING_EXIT);
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(resetInternal.setMax.get);
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new setMax(this));
        }
    }

    public final void onDestroy() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(2046926809, oncanceled);
            onCancelLoad.getMin(2046926809, oncanceled);
        }
        if (!this.getMin.isEmpty()) {
            for (GyroscopeSensorService.SensorChangedListener next : this.getMin) {
                if (next.toIntRange != null) {
                    RawQuery.getMax(next.toIntRange, RawQuery.length.getMin);
                }
            }
        }
        super.onDestroy();
    }
}
