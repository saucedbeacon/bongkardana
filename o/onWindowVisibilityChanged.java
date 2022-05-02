package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

public class onWindowVisibilityChanged extends ImageView {
    private Animation.AnimationListener getMin;
    int setMin;

    public onWindowVisibilityChanged(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.setMin = (int) (3.5f * f);
        if (length()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.getMax((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new length(this.setMin));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.setMin, (float) i2, (float) i, 503316480);
            int i3 = this.setMin;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(-328966);
        ViewCompat.getMin((View) this, (Drawable) shapeDrawable);
    }

    private static boolean length() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!length()) {
            setMeasuredDimension(getMeasuredWidth() + (this.setMin * 2), getMeasuredHeight() + (this.setMin * 2));
        }
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.getMin = animationListener;
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.getMin;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.getMin;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void setBackgroundColorRes(int i) {
        setBackgroundColor(IntRange.setMax(getContext(), i));
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    class length extends OvalShape {
        private RadialGradient getMax;
        private Paint getMin = new Paint();

        length(int i) {
            onWindowVisibilityChanged.this.setMin = i;
            length((int) rect().width());
        }

        /* access modifiers changed from: protected */
        public final void onResize(float f, float f2) {
            super.onResize(f, f2);
            length((int) f);
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = onWindowVisibilityChanged.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (onWindowVisibilityChanged.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.getMin);
            canvas.drawCircle(f, height, (float) (width - onWindowVisibilityChanged.this.setMin), paint);
        }

        private void length(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) onWindowVisibilityChanged.this.setMin, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.getMax = radialGradient;
            this.getMin.setShader(radialGradient);
        }
    }
}
