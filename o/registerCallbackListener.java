package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class registerCallbackListener {
    private static final int[] getMin = {16843067, 16843068};
    private Bitmap getMax;
    private final ProgressBar length;

    public registerCallbackListener(ProgressBar progressBar) {
        this.length = progressBar;
    }

    public void getMax(AttributeSet attributeSet, int i) {
        prepareFromUri min = prepareFromUri.getMin(this.length.getContext(), attributeSet, getMin, i, 0);
        Drawable max = min.getMax(0);
        if (max != null) {
            this.length.setIndeterminateDrawable(setMin(max));
        }
        Drawable max2 = min.getMax(1);
        if (max2 != null) {
            this.length.setProgressDrawable(setMin(max2, false));
        }
        min.setMin.recycle();
    }

    private Drawable setMin(Drawable drawable, boolean z) {
        if (drawable instanceof RequiresPermission) {
            RequiresPermission requiresPermission = (RequiresPermission) drawable;
            Drawable min = requiresPermission.setMin();
            if (min != null) {
                requiresPermission.getMin(setMin(min, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id2 = layerDrawable.getId(i);
                drawableArr[i] = setMin(layerDrawable.getDrawable(i), id2 == 16908301 || id2 == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.getMax == null) {
                this.getMax = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(getMin());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    private Drawable setMin(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable min = setMin(animationDrawable.getFrame(i), true);
            min.setLevel(10000);
            animationDrawable2.addFrame(min, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    private Shape getMin() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    public Bitmap getMax() {
        return this.getMax;
    }
}
