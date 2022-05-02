package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatImageView;
import o.to;

public class ImageFilterView extends AppCompatImageView {
    private Path equals;
    /* access modifiers changed from: private */
    public float getMax = 0.0f;
    /* access modifiers changed from: private */
    public float getMin = Float.NaN;
    private float length = 0.0f;
    LayerDrawable mLayer;
    Drawable[] mLayers;
    RectF mRect;
    ViewOutlineProvider mViewOutlineProvider;
    private length setMax = new length();
    private boolean setMin = true;

    static class length {
        float IsOverlapping = 1.0f;
        float equals = 1.0f;
        ColorMatrix getMax = new ColorMatrix();
        ColorMatrix getMin = new ColorMatrix();
        float length = 1.0f;
        float[] setMax = new float[20];
        float setMin = 1.0f;

        length() {
        }

        private void setMin(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.setMax;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void getMin(float f) {
            float f2;
            float f3;
            if (f <= 0.0f) {
                f = 0.01f;
            }
            float f4 = (5000.0f / f) / 100.0f;
            if (f4 > 66.0f) {
                double d = (double) (f4 - 60.0f);
                f3 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                f2 = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                f2 = (((float) Math.log((double) f4)) * 99.4708f) - 161.11957f;
                f3 = 255.0f;
            }
            float log = f4 < 66.0f ? f4 > 19.0f ? (((float) Math.log((double) (f4 - 10.0f))) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float min = Math.min(255.0f, Math.max(f3, 0.0f));
            float min2 = Math.min(255.0f, Math.max(f2, 0.0f));
            float min3 = Math.min(255.0f, Math.max(log, 0.0f));
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log(50.0d)) * 99.4708f) - 161.11957f, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log(40.0d)) * 138.51773f) - 305.0448f, 0.0f));
            float[] fArr = this.setMax;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void getMax(float f) {
            float[] fArr = this.setMax;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* access modifiers changed from: package-private */
        public final void setMin(ImageView imageView) {
            boolean z;
            this.getMin.reset();
            float f = this.setMin;
            boolean z2 = true;
            if (f != 1.0f) {
                setMin(f);
                this.getMin.set(this.setMax);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.IsOverlapping;
            if (f2 != 1.0f) {
                this.getMax.setScale(f2, f2, f2, 1.0f);
                this.getMin.postConcat(this.getMax);
                z = true;
            }
            float f3 = this.equals;
            if (f3 != 1.0f) {
                getMin(f3);
                this.getMax.set(this.setMax);
                this.getMin.postConcat(this.getMax);
                z = true;
            }
            float f4 = this.length;
            if (f4 != 1.0f) {
                getMax(f4);
                this.getMax.set(this.setMax);
                this.getMin.postConcat(this.getMax);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.getMin));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        length((AttributeSet) null);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        length(attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        length(attributeSet);
    }

    private void length(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, to.length.IntentSenderRequest);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(to.length.ActivityResultRegistry$1);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == to.length.AnimatorRes) {
                    this.length = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == to.length.BinderThread) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == to.length.AnyThread) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == to.length.AnimRes) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == to.length.AttrRes) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                    }
                } else if (index == to.length.BoolRes) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                    }
                } else if (index == to.length.ArrayRes) {
                    this.setMin = obtainStyledAttributes.getBoolean(index, this.setMin);
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.mLayers = drawableArr;
                drawableArr[0] = getDrawable();
                this.mLayers[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.mLayers);
                this.mLayer = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.length * 255.0f));
                super.setImageDrawable(this.mLayer);
            }
        }
    }

    public void setSaturation(float f) {
        this.setMax.setMin = f;
        this.setMax.setMin((ImageView) this);
    }

    public float getSaturation() {
        return this.setMax.setMin;
    }

    public void setContrast(float f) {
        this.setMax.IsOverlapping = f;
        this.setMax.setMin((ImageView) this);
    }

    public float getContrast() {
        return this.setMax.IsOverlapping;
    }

    public void setWarmth(float f) {
        this.setMax.equals = f;
        this.setMax.setMin((ImageView) this);
    }

    public float getWarmth() {
        return this.setMax.equals;
    }

    public void setCrossfade(float f) {
        this.length = f;
        if (this.mLayers != null) {
            if (!this.setMin) {
                this.mLayer.getDrawable(0).setAlpha((int) ((1.0f - this.length) * 255.0f));
            }
            this.mLayer.getDrawable(1).setAlpha((int) (this.length * 255.0f));
            super.setImageDrawable(this.mLayer);
        }
    }

    public float getCrossfade() {
        return this.length;
    }

    public void setBrightness(float f) {
        this.setMax.length = f;
        this.setMax.setMin((ImageView) this);
    }

    public float getBrightness() {
        return this.setMax.length;
    }

    @RequiresApi(21)
    public void setRoundPercent(float f) {
        boolean z = this.getMax != f;
        this.getMax = f;
        if (f != 0.0f) {
            if (this.equals == null) {
                this.equals = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.mViewOutlineProvider == null) {
                    AnonymousClass5 r7 = new ViewOutlineProvider() {
                        public final void getOutline(View view, Outline outline) {
                            int width = ImageFilterView.this.getWidth();
                            int height = ImageFilterView.this.getHeight();
                            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterView.this.getMax) / 2.0f);
                        }
                    };
                    this.mViewOutlineProvider = r7;
                    setOutlineProvider(r7);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.getMax) / 2.0f;
            this.mRect.set(0.0f, 0.0f, (float) width, (float) height);
            this.equals.reset();
            this.equals.addRoundRect(this.mRect, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.getMin = f;
            float f2 = this.getMax;
            this.getMax = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.getMin != f;
        this.getMin = f;
        if (f != 0.0f) {
            if (this.equals == null) {
                this.equals = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.mViewOutlineProvider == null) {
                    AnonymousClass1 r6 = new ViewOutlineProvider() {
                        public final void getOutline(View view, Outline outline) {
                            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.getMin);
                        }
                    };
                    this.mViewOutlineProvider = r6;
                    setOutlineProvider(r6);
                }
                setClipToOutline(true);
            }
            this.mRect.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.equals.reset();
            Path path = this.equals;
            RectF rectF = this.mRect;
            float f3 = this.getMin;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public float getRoundPercent() {
        return this.getMax;
    }

    public float getRound() {
        return this.getMin;
    }

    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.getMax == 0.0f || this.equals == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.equals);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }
}
