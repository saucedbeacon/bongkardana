package id.dana.sendmoney.premium;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseActivity;
import o.CornerMarkingDataProvider;
import o.IntRange;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.onTitleChanged;
import o.setHalfScreen;

public class PremiumNoticeActivity extends BaseActivity implements setHalfScreen.length {
    public static final String KEY_IS_SELECTED_UPGRADE_BUTTON = "is_selected_upgrade_button";
    public static final int PREMIUM_NOTICE_REQUEST_CODE = CornerMarkingDataProvider.AnonymousClass2.setMax();
    @BindView(2131362398)
    ConstraintLayout clContainer;
    private boolean getMin;

    private static boolean getMin(ConstraintLayout constraintLayout) {
        return constraintLayout != null;
    }

    public void configToolbar() {
    }

    public int getLayout() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || -554283963 == (max = dispatchOnCancelled.getMax(applicationContext, -554283963))) {
            return R.layout.activity_premium_notice;
        }
        onCanceled oncanceled = new onCanceled(-554283963, max, 512);
        onCancelLoad.setMax(-554283963, oncanceled);
        onCancelLoad.getMin(-554283963, oncanceled);
        return R.layout.activity_premium_notice;
    }

    public void onBackPressed() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext != null && (length = applicationContext.fileList().length) != (min = dispatchOnCancelled.getMin(applicationContext, length))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-18955874, oncanceled);
            onCancelLoad.getMin(-18955874, oncanceled);
        }
    }

    public void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
    }

    @OnClick({2131362151})
    public void goToUpgradeProcess() {
        this.getMin = true;
        if (CornerMarkingDataProvider.IsOverlapping()) {
            getWindow().setStatusBarColor(IntRange.setMax(this, R.color.f19032131099798));
        }
        ConstraintLayout constraintLayout = this.clContainer;
        if (CornerMarkingDataProvider.length()) {
            Animator min = setHalfScreen.getMin(constraintLayout, getResources().getInteger(17694722), false);
            min.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    length.this.onUnRevealAnimationEnd();
                }
            });
            min.start();
            return;
        }
        ViewCompat.Grayscale$Algorithm(constraintLayout).getMin(0.0f).getMin((long) getResources().getInteger(17694722)).length(new onTitleChanged() {
            public final void length(View view) {
                super.length(view);
                length.this.onUnRevealAnimationEnd();
            }
        });
    }

    @OnClick({2131362152})
    public void applyUseCardPayMethod() {
        this.getMin = false;
        if (CornerMarkingDataProvider.IsOverlapping()) {
            getWindow().setStatusBarColor(IntRange.setMax(this, R.color.f19032131099798));
        }
        ConstraintLayout constraintLayout = this.clContainer;
        if (CornerMarkingDataProvider.length()) {
            Animator min = setHalfScreen.getMin(constraintLayout, getResources().getInteger(17694722), false);
            min.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    length.this.onUnRevealAnimationEnd();
                }
            });
            min.start();
            return;
        }
        ViewCompat.Grayscale$Algorithm(constraintLayout).getMin(0.0f).getMin((long) getResources().getInteger(17694722)).length(new onTitleChanged() {
            public final void length(View view) {
                super.length(view);
                length.this.onUnRevealAnimationEnd();
            }
        });
    }

    public void onRevealAnimationStart() {
        if (CornerMarkingDataProvider.IsOverlapping()) {
            getWindow().setStatusBarColor(IntRange.setMax(this, R.color.f18652131099750));
        }
    }

    public void onUnRevealAnimationEnd() {
        Intent intent = new Intent();
        intent.putExtra(KEY_IS_SELECTED_UPGRADE_BUTTON, this.getMin);
        setResult(-1, intent);
        if (getMin(this.clContainer)) {
            this.clContainer.setVisibility(8);
        }
        finish();
    }

    public void init() {
        ConstraintLayout constraintLayout = this.clContainer;
        if (CornerMarkingDataProvider.length()) {
            constraintLayout.setVisibility(4);
            ViewTreeObserver viewTreeObserver = constraintLayout.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this, constraintLayout, this) {
                    final /* synthetic */ length length;
                    final /* synthetic */ View setMax;
                    final /* synthetic */ Context setMin;

                    {
                        this.setMin = r1;
                        this.setMax = r2;
                        this.length = r3;
                    }

                    public final void onGlobalLayout() {
                        Context context = this.setMin;
                        View view = this.setMax;
                        length length2 = this.length;
                        Animator min = setHalfScreen.getMin(view, context.getResources().getInteger(17694722), true);
                        view.setVisibility(0);
                        min.addListener(new AnimatorListenerAdapter() {
                            public final void onAnimationStart(Animator animator) {
                                super.onAnimationStart(animator);
                                length.this.onRevealAnimationStart();
                            }
                        });
                        min.start();
                        this.setMax.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                });
                return;
            }
            return;
        }
        constraintLayout.setVisibility(0);
        constraintLayout.setAlpha(0.0f);
        ViewCompat.Grayscale$Algorithm(constraintLayout).getMin(1.0f).getMin((long) getResources().getInteger(17694722));
    }
}
