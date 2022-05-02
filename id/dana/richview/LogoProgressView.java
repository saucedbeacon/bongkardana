package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.resetInternal;

public class LogoProgressView extends BaseRichView {
    private int getMax;
    private int getMin;
    @BindView(2131363152)
    AppCompatImageView loadingImage;
    @BindView(2131363151)
    AppCompatImageView outerLoadingImage;
    private Animation setMin;

    public int getLayout() {
        return R.layout.view_logo_progress;
    }

    public LogoProgressView(@NonNull Context context) {
        super(context);
    }

    public LogoProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LogoProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LogoProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.getRatingType);
            try {
                float dimension = obtainStyledAttributes.getDimension(1, 0.0f);
                float dimension2 = obtainStyledAttributes.getDimension(0, 0.0f);
                this.getMin = Math.round(dimension);
                this.getMax = Math.round(dimension2);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setup() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int i = this.getMin;
        if (i > 0 && (layoutParams2 = this.outerLoadingImage.getLayoutParams()) != null) {
            layoutParams2.width = i;
            layoutParams2.height = i;
        }
        int i2 = this.getMax;
        if (i2 > 0 && (layoutParams = this.loadingImage.getLayoutParams()) != null) {
            layoutParams.width = i2;
            layoutParams.height = i2;
        }
    }

    public void startRefresh() {
        if (this.loadingImage == null) {
            onAttachedToWindow();
        }
        stopRefresh();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f732130772045);
        this.setMin = loadAnimation;
        loadAnimation.setInterpolator(new LinearInterpolator());
        AppCompatImageView appCompatImageView = this.loadingImage;
        if (appCompatImageView != null) {
            appCompatImageView.startAnimation(this.setMin);
        }
    }

    public void stopRefresh() {
        Animation animation = this.setMin;
        if (animation != null) {
            animation.cancel();
            this.setMin = null;
        }
    }
}
