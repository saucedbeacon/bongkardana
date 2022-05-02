package id.dana.usereducation;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.usereducation.constant.BottomSheetType;
import id.dana.usereducation.model.ContentOnBoardingModel;
import id.dana.usereducation.model.OnBoardingModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.GyroscopeSensorService;
import o.PrepareException;
import o.RawQuery;
import o.UpdateMode;
import o.dispatchOnCancelled;
import o.getNewSignPublicKey;
import o.getSelectedIndex;
import o.onCancelLoad;
import o.onCanceled;
import o.setStatusBar;
import o.startBeaconDiscovery;
import o.stopIgnoring;
import org.jetbrains.annotations.Nullable;

public class BottomSheetOnBoardingActivity extends BaseActivity implements getSelectedIndex.setMax {
    public static final int ON_BOARDING_REQUEST_CODE = 201;
    @BindView(2131362101)
    DanaButtonPrimaryView btnNext;
    @BindView(2131362114)
    DanaButtonSecondaryView btnPrevious;
    /* access modifiers changed from: private */
    public String equals;
    private setStatusBar getMax;
    private UpdateMode.AnonymousClass1 getMin;
    @Inject
    public getSelectedIndex.length presenter;
    private List<GyroscopeSensorService.SensorChangedListener> setMax;
    private String toFloatRange;
    @BindView(2131365620)
    TextView tvTitleOnBoarding;
    @BindView(2131365915)
    ViewPager viewPager;

    public void configToolbar() {
    }

    public void dismissProgress() {
    }

    public int getLayout() {
        return R.layout.activity_on_boarding_bottom_sheet;
    }

    public void onError(String str) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext != null && 404311332 != (max = dispatchOnCancelled.getMax(applicationContext, 404311332))) {
            onCanceled oncanceled = new onCanceled(404311332, max, 512);
            onCancelLoad.setMax(404311332, oncanceled);
            onCancelLoad.getMin(404311332, oncanceled);
        }
    }

    public void onGetBottomSheetOnBoardingAvailability(boolean z, String str) {
    }

    public final void setMax(boolean z, @Nullable String str) {
    }

    public void showProgress() {
    }

    public static Intent createOnBoardingIntent(Context context, OnBoardingModel onBoardingModel) {
        Intent intent = new Intent(context, BottomSheetOnBoardingActivity.class);
        intent.putExtra("data", onBoardingModel);
        return intent;
    }

    public void onStart() {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1141413434, oncanceled);
            onCancelLoad.getMin(1141413434, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1141413434, oncanceled2);
            onCancelLoad.getMin(1141413434, oncanceled2);
        }
        super.onStart();
        overridePendingTransition(R.anim.f782130772050, R.anim.f822130772054);
    }

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(R.anim.f752130772047, R.anim.f792130772051);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362101})
    public void onButtonNextClicked() {
        if (length()) {
            setResult(-1);
            finish();
            this.presenter.getMax(this.toFloatRange);
            return;
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1875899344, oncanceled);
            onCancelLoad.getMin(-1875899344, oncanceled);
        }
        ViewPager viewPager2 = this.viewPager;
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1, true);
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362114})
    public void onButtonPreviousClicked() {
        if (setMax()) {
            setResult(-1);
            finish();
            this.presenter.getMax(this.toFloatRange);
            return;
        }
        ViewPager viewPager2 = this.viewPager;
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1, true);
    }

    public void onBackPressed() {
        setResult(-1);
        super.onBackPressed();
    }

    /* access modifiers changed from: private */
    public boolean length() {
        return this.viewPager.getCurrentItem() == this.setMax.size() - 1;
    }

    /* access modifiers changed from: private */
    public boolean setMax() {
        return this.viewPager.getCurrentItem() == 0;
    }

    public void onDestroy() {
        List<GyroscopeSensorService.SensorChangedListener> list = this.setMax;
        if (list != null && !list.isEmpty()) {
            for (GyroscopeSensorService.SensorChangedListener next : this.setMax) {
                if (next.toIntRange != null) {
                    RawQuery.getMax(next.toIntRange, RawQuery.length.getMin);
                }
            }
        }
        super.onDestroy();
    }

    public void init() {
        int length;
        int min;
        int length2;
        OnBoardingModel onBoardingModel;
        int length3;
        int min2;
        int length4;
        Context context = null;
        if (this.getMin == null) {
            getNewSignPublicKey.getMin getmin = new getNewSignPublicKey.getMin((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                getmin.getMin = applicationComponent;
                getmin.setMin = new BottomSheetOnBoardingModule(this);
                stopIgnoring.setMin(getmin.setMin, BottomSheetOnBoardingModule.class);
                stopIgnoring.setMin(getmin.getMin, PrepareException.AnonymousClass1.class);
                this.getMin = new getNewSignPublicKey(getmin.setMin, getmin.getMin, (byte) 0);
            } else {
                throw null;
            }
        }
        this.getMin.setMax(this);
        registerPresenter(this.presenter);
        Bundle extras = getIntent().getExtras();
        if (!(extras == null || (onBoardingModel = (OnBoardingModel) extras.getParcelable("data")) == null)) {
            this.setMax = new ArrayList();
            int i = 0;
            for (ContentOnBoardingModel simpleBottomSheetOnBoardingView : onBoardingModel.getMax) {
                i++;
                this.setMax.add(new SimpleBottomSheetOnBoardingView(i, simpleBottomSheetOnBoardingView));
            }
            this.tvTitleOnBoarding.setText(onBoardingModel.getMin);
            this.toFloatRange = onBoardingModel.setMin;
            this.equals = onBoardingModel.length;
            Context baseContext = getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length4 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
                onCanceled oncanceled = new onCanceled(0, length4, 4);
                onCancelLoad.setMax(532647201, oncanceled);
                onCancelLoad.getMin(532647201, oncanceled);
            }
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || (length3 = applicationContext2.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext2, length3)))) {
                onCanceled oncanceled2 = new onCanceled(length3, min2, 32);
                onCancelLoad.setMax(532647201, oncanceled2);
                onCancelLoad.getMin(532647201, oncanceled2);
            }
            if (BottomSheetType.SLIDESHOW.equals(this.equals)) {
                this.btnPrevious.setVisibility(0);
            }
        }
        startBeaconDiscovery.length(this);
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || (length2 = dispatchOnCancelled.length(applicationContext3, 0)) == 0)) {
            onCanceled oncanceled3 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1946131820, oncanceled3);
            onCancelLoad.getMin(-1946131820, oncanceled3);
        }
        setStatusBar setstatusbar = new setStatusBar(this);
        this.getMax = setstatusbar;
        setstatusbar.getMin(this.setMax);
        Context baseContext4 = getBaseContext();
        if (baseContext4 != null) {
            context = baseContext4.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled4 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(187104493, oncanceled4);
            onCancelLoad.getMin(187104493, oncanceled4);
        }
        this.viewPager.setAdapter(this.getMax);
        this.viewPager.addOnPageChangeListener(new ViewPager.setMax() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                String str;
                String str2;
                String str3;
                if (BottomSheetType.SLIDESHOW.equals(BottomSheetOnBoardingActivity.this.equals)) {
                    DanaButtonPrimaryView danaButtonPrimaryView = BottomSheetOnBoardingActivity.this.btnNext;
                    if (BottomSheetOnBoardingActivity.this.length()) {
                        str2 = BottomSheetOnBoardingActivity.this.getString(R.string.bottom_on_boarding_button_next_last_item_close);
                    } else {
                        str2 = BottomSheetOnBoardingActivity.this.getString(R.string.bottom_on_boarding_button_next_default);
                    }
                    danaButtonPrimaryView.setActiveButton(str2, (Drawable) null);
                    DanaButtonSecondaryView danaButtonSecondaryView = BottomSheetOnBoardingActivity.this.btnPrevious;
                    if (BottomSheetOnBoardingActivity.this.setMax()) {
                        str3 = BottomSheetOnBoardingActivity.this.getString(R.string.bottom_on_boarding_button_previous_first_item);
                    } else {
                        str3 = BottomSheetOnBoardingActivity.this.getString(R.string.bottom_on_boarding_button_previous_default);
                    }
                    danaButtonSecondaryView.setActiveButton(str3, (Drawable) null);
                } else {
                    DanaButtonPrimaryView danaButtonPrimaryView2 = BottomSheetOnBoardingActivity.this.btnNext;
                    if (BottomSheetOnBoardingActivity.this.length()) {
                        str = BottomSheetOnBoardingActivity.this.getString(R.string.bottom_on_boarding_button_next_last_item);
                    } else {
                        str = BottomSheetOnBoardingActivity.this.getString(R.string.bottom_on_boarding_button_next_default);
                    }
                    danaButtonPrimaryView2.setActiveButton(str, (Drawable) null);
                }
                BottomSheetOnBoardingActivity bottomSheetOnBoardingActivity = BottomSheetOnBoardingActivity.this;
                BottomSheetOnBoardingActivity.access$300(bottomSheetOnBoardingActivity, bottomSheetOnBoardingActivity.length());
            }
        });
    }

    static /* synthetic */ void access$300(BottomSheetOnBoardingActivity bottomSheetOnBoardingActivity, boolean z) {
        String str;
        DanaButtonPrimaryView danaButtonPrimaryView = bottomSheetOnBoardingActivity.btnNext;
        if (z) {
            str = bottomSheetOnBoardingActivity.getString(R.string.btnFinishOnboarding);
        } else {
            str = bottomSheetOnBoardingActivity.getString(R.string.btnNextOnboarding);
        }
        danaButtonPrimaryView.setContentDescription(str);
    }
}
