package o;

import android.graphics.drawable.Drawable;

public abstract class dispatchOnDrawerSlide {
    public Drawable equals;
    public Object getMax;
    private float setMin;

    public dispatchOnDrawerSlide() {
        this.setMin = 0.0f;
        this.getMax = null;
        this.equals = null;
    }

    public dispatchOnDrawerSlide(float f) {
        this.setMin = 0.0f;
        this.getMax = null;
        this.equals = null;
        this.setMin = f;
    }

    public dispatchOnDrawerSlide(float f, Object obj) {
        this(f);
        this.getMax = obj;
    }

    public float getMin() {
        return this.setMin;
    }

    public final void length(float f) {
        this.setMin = f;
    }
}
