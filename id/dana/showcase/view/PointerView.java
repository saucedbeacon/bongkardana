package id.dana.showcase.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.R;
import o.IAPConfig;
import o.PhotoView;
import o.setOnLongClickListener;
import o.setUseAmcsLite;

public class PointerView extends FrameLayout {
    public static final long DEFAULT_ANIMATION_DURATION = 300;
    public static final float DEFAULT_CONTAINER_PADDING = ((float) ((int) (Resources.getSystem().getDisplayMetrics().density * 8.0f)));
    /* access modifiers changed from: private */
    public ImageView getMax;
    private RoundedView getMin;
    private float length = DEFAULT_CONTAINER_PADDING;
    private PhotoView.State setMax;
    private setUseAmcsLite setMin;

    public PointerView(@NonNull Context context, setUseAmcsLite setuseamcslite) {
        super(context);
        init(context, setuseamcslite);
    }

    public PointerView(@NonNull Context context, @Nullable AttributeSet attributeSet, setUseAmcsLite setuseamcslite) {
        super(context, attributeSet);
        init(context, setuseamcslite);
    }

    public PointerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, setUseAmcsLite setuseamcslite) {
        super(context, attributeSet, i);
        init(context, setuseamcslite);
    }

    public float getContainerPadding() {
        return this.length;
    }

    public void setContainerPadding(float f) {
        this.length = f;
    }

    /* access modifiers changed from: protected */
    public void init(Context context, setUseAmcsLite setuseamcslite) {
        PhotoView.State state;
        this.setMin = setuseamcslite;
        View inflate = View.inflate(context, R.layout.view_tooltip_pointer, this);
        this.getMax = (ImageView) inflate.findViewById(R.id.f50172131363572);
        if (setuseamcslite.setMax()) {
            this.getMax.setImageResource(R.drawable.ic_pointer_half);
        }
        this.getMin = (RoundedView) inflate.findViewById(R.id.f58712131364453);
        ImageView imageView = this.getMax;
        setUseAmcsLite setuseamcslite2 = this.setMin;
        if (setuseamcslite2.getMax()) {
            state = new PhotoView.ScaleRunnable(imageView, this, setuseamcslite2);
        } else {
            state = new IAPConfig(imageView, this, setuseamcslite2);
        }
        this.setMax = state;
        moveContainerToTarget();
    }

    public void addContentView(View view) {
        this.getMin.addView(view);
    }

    public boolean hasActiveTarget() {
        return this.setMin != null;
    }

    public void showPointer(setUseAmcsLite setuseamcslite, Animator.AnimatorListener animatorListener) {
        PhotoView.State state;
        this.setMin = setuseamcslite;
        ImageView imageView = this.getMax;
        if (setuseamcslite.getMax()) {
            state = new PhotoView.ScaleRunnable(imageView, this, setuseamcslite);
        } else {
            state = new IAPConfig(imageView, this, setuseamcslite);
        }
        this.setMax = state;
        ImageView imageView2 = state.setMin;
        float x = (state.getMax.setMin.x - state.setMax.getX()) - state.length;
        if (x < 0.0f) {
            x = -state.length;
        } else if (x > ((float) state.setMax.getWidth()) - state.length) {
            x = ((float) state.setMax.getWidth()) - state.length;
        }
        imageView2.setX(x);
        state.setMin.setY(state.length());
        long abs = (long) Math.abs(getY() - this.setMax.getMax());
        if (abs > 300) {
            abs = 300;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "y", new float[]{this.setMax.getMax()});
        ofFloat.setInterpolator(this.setMin.getMax);
        ofFloat.setDuration(abs);
        ofFloat.addListener(animatorListener);
        ofFloat.addListener(new setOnLongClickListener() {
            public final void onAnimationEnd(Animator animator) {
                PointerView.access$000(PointerView.this);
            }
        });
        ofFloat.start();
    }

    public void hidePointer() {
        if (hasActiveTarget()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.getMax, "y", new float[]{this.setMax.length()});
            ofFloat.setDuration(this.setMin.length);
            ofFloat.setInterpolator(this.setMin.getMax);
            ofFloat.addListener(new setOnLongClickListener() {
                public final void onAnimationEnd(Animator animator) {
                    PointerView.this.getMax.setVisibility(4);
                }
            });
            ofFloat.start();
        }
    }

    public void moveContainerToTarget() {
        setY(this.setMax.getMax());
    }

    static /* synthetic */ void access$000(PointerView pointerView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pointerView.getMax, "y", new float[]{pointerView.setMax.getMin()});
        ofFloat.setInterpolator(pointerView.setMin.getMax);
        ofFloat.setDuration(pointerView.setMin.length);
        ofFloat.addListener(new setOnLongClickListener() {
            public final void onAnimationStart(Animator animator) {
                PointerView.this.getMax.setVisibility(0);
            }
        });
        ofFloat.start();
    }
}
