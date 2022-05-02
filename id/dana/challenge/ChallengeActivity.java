package id.dana.challenge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import androidx.fragment.app.FragmentManager;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import id.dana.R;
import id.dana.base.ViewPagerBaseActivity;
import id.dana.challenge.ChallengeControl;
import id.dana.popup.LockableViewPager;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.RedDotManager;
import o.TitleBarRightButtonView;
import o.assertNotMainThread;
import o.beginTransaction;
import o.compileStatement;
import o.dispatchOnCancelled;
import o.getSecureSignatureComp;
import o.hideProgress;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.setOnWheelViewListener;
import o.smoothSlideOpen;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0002J\b\u0010\u0011\u001a\u00020\tH\u0002J\u0018\u0010\u0012\u001a\u00020\t2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0014J\b\u0010\u0016\u001a\u00020\tH\u0014J\b\u0010\u0017\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/challenge/ChallengeActivity;", "Lid/dana/base/ViewPagerBaseActivity;", "Lid/dana/challenge/ChallengeScenarioListener;", "()V", "challengeScenario", "Lid/dana/challenge/scenario/ScenarioFacade;", "scenario", "", "closeChallengeSession", "", "configToolbar", "getLayout", "", "hideClose", "init", "onBackPressed", "onClose", "onComplete", "onNext", "challengeMethod", "", "onPause", "onStart", "showClose", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ChallengeActivity extends ViewPagerBaseActivity implements beginTransaction {
    private smoothSlideOpen getMax;
    private HashMap getMin;
    private String setMax = "";

    public final void _$_clearFindViewByIdCache() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1483081630 == (max = dispatchOnCancelled.getMax(applicationContext, -1483081630)))) {
            onCanceled oncanceled = new onCanceled(-1483081630, max, 512);
            onCancelLoad.setMax(-1483081630, oncanceled);
            onCancelLoad.getMin(-1483081630, oncanceled);
        }
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(1131411702, oncanceled);
            onCancelLoad.getMin(1131411702, oncanceled);
        }
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void configToolbar() {
    }

    public final int getLayout() {
        return R.layout.activity_challenge;
    }

    public final void onStart() {
        super.onStart();
        overridePendingTransition(R.anim.f782130772050, R.anim.f822130772054);
    }

    public final void init() {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString(ChallengeControl.Key.SCENARIO, ChallengeScenario.RELOGIN);
            Intrinsics.checkNotNullExpressionValue(string, "data\n                .ge…hallengeScenario.RELOGIN)");
            this.setMax = string;
            this.getMax = assertNotMainThread.setMax(string, extras);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            smoothSlideOpen smoothslideopen = this.getMax;
            if (smoothslideopen == null) {
                Intrinsics.throwUninitializedPropertyAccessException("challengeScenario");
            }
            registerViewPager((LockableViewPager) _$_findCachedViewById(resetInternal.setMax.isInOverlayMode), new compileStatement(supportFragmentManager, smoothslideopen.length()));
            LockableViewPager lockableViewPager = (LockableViewPager) _$_findCachedViewById(resetInternal.setMax.isInOverlayMode);
            if (lockableViewPager != null) {
                lockableViewPager.setSwipeable(false);
            }
        }
        ImageButton imageButton = (ImageButton) _$_findCachedViewById(resetInternal.setMax.reportFullyDrawn);
        if (imageButton != null) {
            imageButton.setOnClickListener(new getMin(this));
        }
    }

    public final void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(R.anim.f752130772047, R.anim.f792130772051);
        }
    }

    public final void showClose() {
        ImageButton imageButton = (ImageButton) _$_findCachedViewById(resetInternal.setMax.reportFullyDrawn);
        if (imageButton != null) {
            imageButton.setVisibility(0);
        }
    }

    public final void hideClose() {
        ImageButton imageButton = (ImageButton) _$_findCachedViewById(resetInternal.setMax.reportFullyDrawn);
        if (imageButton != null) {
            imageButton.setVisibility(4);
        }
    }

    public final void onNext(@Nullable List<String> list) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1690611276, oncanceled);
            onCancelLoad.getMin(-1690611276, oncanceled);
        }
        if (TextUtils.isEmpty(list != null ? list.get(0) : null)) {
            addDisposable(TitleBarRightButtonView.AnonymousClass1.timer(1, TimeUnit.SECONDS).subscribeOn(getSecureSignatureComp.length()).observeOn(hideProgress.length()).subscribe(new getMax(this)));
        }
    }

    public final void closeChallengeSession() {
        setOnWheelViewListener.getMax((Activity) this);
        finish();
    }

    public final void onBackPressed() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1347251751, oncanceled);
            onCancelLoad.getMin(1347251751, oncanceled);
        }
        setOnWheelViewListener.getMax((Activity) this);
        Intent intent = new Intent();
        intent.putExtra(ChallengeControl.Key.CANCEL_REASON, "back");
        setResult(0, intent);
        super.onBackPressed();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ ChallengeActivity getMax;

        getMin(ChallengeActivity challengeActivity) {
            this.getMax = challengeActivity;
        }

        public final void onClick(View view) {
            setOnWheelViewListener.length(new View(this.getMax));
            this.getMax.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T> implements RedDotManager<Long> {
        final /* synthetic */ ChallengeActivity getMin;

        getMax(ChallengeActivity challengeActivity) {
            this.getMin = challengeActivity;
        }

        public final /* synthetic */ void accept(Object obj) {
            ChallengeActivity.access$onComplete(this.getMin);
        }
    }

    public static final /* synthetic */ void access$onComplete(ChallengeActivity challengeActivity) {
        LockableViewPager lockableViewPager = (LockableViewPager) challengeActivity._$_findCachedViewById(resetInternal.setMax.isInOverlayMode);
        if (lockableViewPager != null) {
            lockableViewPager.requestFocus();
        }
        if (challengeActivity.getMax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("challengeScenario");
        }
        setOnWheelViewListener.length((View) (LockableViewPager) challengeActivity._$_findCachedViewById(resetInternal.setMax.isInOverlayMode));
        challengeActivity.setResult(-1);
        challengeActivity.finish();
    }
}
