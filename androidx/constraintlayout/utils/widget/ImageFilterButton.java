package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import o.to;

public class ImageFilterButton extends AppCompatImageButton {
    private boolean IsOverlapping = true;
    /* access modifiers changed from: private */
    public float getMax = 0.0f;
    private float getMin = 0.0f;
    private ImageFilterView.length length = new ImageFilterView.length();
    LayerDrawable mLayer;
    Drawable[] mLayers;
    RectF mRect;
    ViewOutlineProvider mViewOutlineProvider;
    private Path setMax;
    /* access modifiers changed from: private */
    public float setMin = Float.NaN;

    public ImageFilterButton(Context context) {
        super(context);
        getMin((AttributeSet) null);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getMin(attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getMin(attributeSet);
    }

    private void getMin(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, to.length.IntentSenderRequest);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(to.length.ActivityResultRegistry$1);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == to.length.AnimatorRes) {
                    this.getMin = obtainStyledAttributes.getFloat(index, 0.0f);
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
                    this.IsOverlapping = obtainStyledAttributes.getBoolean(index, this.IsOverlapping);
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
                layerDrawable.getDrawable(1).setAlpha((int) (this.getMin * 255.0f));
                super.setImageDrawable(this.mLayer);
            }
        }
    }

    public void setSaturation(float f) {
        this.length.setMin = f;
        this.length.setMin((ImageView) this);
    }

    public float getSaturation() {
        return this.length.setMin;
    }

    public void setContrast(float f) {
        this.length.IsOverlapping = f;
        this.length.setMin((ImageView) this);
    }

    public float getContrast() {
        return this.length.IsOverlapping;
    }

    public void setWarmth(float f) {
        this.length.equals = f;
        this.length.setMin((ImageView) this);
    }

    public float getWarmth() {
        return this.length.equals;
    }

    public void setCrossfade(float f) {
        this.getMin = f;
        if (this.mLayers != null) {
            if (!this.IsOverlapping) {
                this.mLayer.getDrawable(0).setAlpha((int) ((1.0f - this.getMin) * 255.0f));
            }
            this.mLayer.getDrawable(1).setAlpha((int) (this.getMin * 255.0f));
            super.setImageDrawable(this.mLayer);
        }
    }

    public float getCrossfade() {
        return this.getMin;
    }

    public void setBrightness(float f) {
        this.length.length = f;
        this.length.setMin((ImageView) this);
    }

    @RequiresApi(21)
    public void setRoundPercent(float f) {
        boolean z = this.getMax != f;
        this.getMax = f;
        if (f != 0.0f) {
            if (this.setMax == null) {
                this.setMax = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.mViewOutlineProvider == null) {
                    AnonymousClass2 r7 = new ViewOutlineProvider() {
                        public final void getOutline(View view, Outline outline) {
                            int width = ImageFilterButton.this.getWidth();
                            int height = ImageFilterButton.this.getHeight();
                            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterButton.this.getMax) / 2.0f);
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
            this.setMax.reset();
            this.setMax.addRoundRect(this.mRect, min, min, Path.Direction.CW);
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
            this.setMin = f;
            float f2 = this.getMax;
            this.getMax = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.setMin != f;
        this.setMin = f;
        if (f != 0.0f) {
            if (this.setMax == null) {
                this.setMax = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.mViewOutlineProvider == null) {
                    AnonymousClass1 r6 = new ViewOutlineProvider() {
                        public final void getOutline(View view, Outline outline) {
                            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.setMin);
                        }
                    };
                    this.mViewOutlineProvider = r6;
                    setOutlineProvider(r6);
                }
                setClipToOutline(true);
            }
            this.mRect.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.setMax.reset();
            Path path = this.setMax;
            RectF rectF = this.mRect;
            float f3 = this.setMin;
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
        return this.setMin;
    }

    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.setMin == 0.0f || this.setMax == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.setMax);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }
}
