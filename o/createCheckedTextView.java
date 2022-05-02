package o;

import o.createEditText;

public final class createCheckedTextView extends createEditText<createCheckedTextView> {
    private boolean ICustomTabsCallback = false;
    public float b = Float.MAX_VALUE;
    public createImageButton getCause = null;

    public <K> createCheckedTextView(K k, createRadioButton<K> createradiobutton) {
        super(k, createradiobutton);
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax(long j) {
        if (this.ICustomTabsCallback) {
            float f = this.b;
            if (f != Float.MAX_VALUE) {
                this.getCause.toFloatRange = (double) f;
                this.b = Float.MAX_VALUE;
            }
            this.Mean$Arithmetic = (float) this.getCause.toFloatRange;
            this.hashCode = 0.0f;
            this.ICustomTabsCallback = false;
            return true;
        }
        if (this.b != Float.MAX_VALUE) {
            long j2 = j / 2;
            createEditText.setMin min = this.getCause.getMin((double) this.Mean$Arithmetic, (double) this.hashCode, j2);
            this.getCause.toFloatRange = (double) this.b;
            this.b = Float.MAX_VALUE;
            createEditText.setMin min2 = this.getCause.getMin((double) min.setMax, (double) min.getMin, j2);
            this.Mean$Arithmetic = min2.setMax;
            this.hashCode = min2.getMin;
        } else {
            createEditText.setMin min3 = this.getCause.getMin((double) this.Mean$Arithmetic, (double) this.hashCode, j);
            this.Mean$Arithmetic = min3.setMax;
            this.hashCode = min3.getMin;
        }
        this.Mean$Arithmetic = Math.max(this.Mean$Arithmetic, this.create);
        this.Mean$Arithmetic = Math.min(this.Mean$Arithmetic, this.onNavigationEvent);
        if (!length(this.Mean$Arithmetic, this.hashCode)) {
            return false;
        }
        this.Mean$Arithmetic = (float) this.getCause.toFloatRange;
        this.hashCode = 0.0f;
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean length(float f, float f2) {
        return this.getCause.setMax(f, f2);
    }

    public final void getMax() {
        createImageButton createimagebutton = this.getCause;
        if (createimagebutton != null) {
            double d = (double) ((float) createimagebutton.toFloatRange);
            if (d > ((double) this.onNavigationEvent)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d >= ((double) this.create)) {
                createImageButton createimagebutton2 = this.getCause;
                createimagebutton2.setMin = Math.abs((double) setMax());
                createimagebutton2.getMax = createimagebutton2.setMin * 62.5d;
                super.getMax();
            } else {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }
}
