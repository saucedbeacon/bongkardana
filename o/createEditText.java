package o;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import o.createEditText;
import o.createImageView;

public abstract class createEditText<T extends createEditText<T>> implements createImageView.length {
    public static final length FastBitmap$CoordinateSystem = new length("alpha") {
        public final /* synthetic */ float getValue(Object obj) {
            return ((View) obj).getAlpha();
        }

        public final /* synthetic */ void setValue(Object obj, float f) {
            ((View) obj).setAlpha(f);
        }
    };
    public static final length IsOverlapping = new length("x") {
        public final /* synthetic */ float getValue(Object obj) {
            return ((View) obj).getX();
        }

        public final /* synthetic */ void setValue(Object obj, float f) {
            ((View) obj).setX(f);
        }
    };
    public static final length equals = new length("rotation") {
        public final /* synthetic */ float getValue(Object obj) {
            return ((View) obj).getRotation();
        }

        public final /* synthetic */ void setValue(Object obj, float f) {
            ((View) obj).setRotation(f);
        }
    };
    public static final length getMax = new length("translationY") {
        public final /* synthetic */ float getValue(Object obj) {
            return ((View) obj).getTranslationY();
        }

        public final /* synthetic */ void setValue(Object obj, float f) {
            ((View) obj).setTranslationY(f);
        }
    };
    public static final length getMin = new length("scaleY") {
        public final /* synthetic */ float getValue(Object obj) {
            return ((View) obj).getScaleY();
        }

        public final /* synthetic */ void setValue(Object obj, float f) {
            ((View) obj).setScaleY(f);
        }
    };
    public static final length isInside = new length("y") {
        public final /* synthetic */ float getValue(Object obj) {
            return ((View) obj).getY();
        }

        public final /* synthetic */ void setValue(Object obj, float f) {
            ((View) obj).setY(f);
        }
    };
    public static final length length = new length("translationZ") {
        public final /* synthetic */ float getValue(Object obj) {
            return ViewCompat.invoke((View) obj);
        }

        public final /* synthetic */ void setValue(Object obj, float f) {
            ViewCompat.setMax((View) obj, f);
        }
    };
    public static final length setMax = new length("translationX") {
        public final /* synthetic */ float getValue(Object obj) {
            return ((View) obj).getTranslationX();
        }

        public final /* synthetic */ void setValue(Object obj, float f) {
            ((View) obj).setTranslationX(f);
        }
    };
    public static final length setMin = new length("scaleX") {
        public final /* synthetic */ float getValue(Object obj) {
            return ((View) obj).getScaleX();
        }

        public final /* synthetic */ void setValue(Object obj, float f) {
            ((View) obj).setScaleX(f);
        }
    };
    public static final length toDoubleRange = new length("z") {
        public final /* synthetic */ float getValue(Object obj) {
            return ViewCompat.ICustomTabsCallback$Default((View) obj);
        }

        public final /* synthetic */ void setValue(Object obj, float f) {
            ViewCompat.isInside((View) obj, f);
        }
    };
    public static final length toFloatRange = new length("rotationY") {
        public final /* synthetic */ float getValue(Object obj) {
            return ((View) obj).getRotationY();
        }

        public final /* synthetic */ void setValue(Object obj, float f) {
            ((View) obj).setRotationY(f);
        }
    };
    public static final length toIntRange = new length("rotationX") {
        public final /* synthetic */ float getValue(Object obj) {
            return ((View) obj).getRotationX();
        }

        public final /* synthetic */ void setValue(Object obj, float f) {
            ((View) obj).setRotationX(f);
        }
    };
    public static final length toString = new length("scrollX") {
        public final /* synthetic */ float getValue(Object obj) {
            return (float) ((View) obj).getScrollX();
        }

        public final /* synthetic */ void setValue(Object obj, float f) {
            ((View) obj).setScrollX((int) f);
        }
    };
    public static final length values = new length("scrollY") {
        public final /* synthetic */ float getValue(Object obj) {
            return (float) ((View) obj).getScrollY();
        }

        public final /* synthetic */ void setValue(Object obj, float f) {
            ((View) obj).setScrollY((int) f);
        }
    };
    public boolean Grayscale$Algorithm = false;
    private final ArrayList<Object> ICustomTabsCallback = new ArrayList<>();
    public float Mean$Arithmetic = Float.MAX_VALUE;
    private long b = 0;
    float create = (-Float.MAX_VALUE);
    private final ArrayList<Object> extraCallback = new ArrayList<>();
    private float getCause;
    float hashCode = 0.0f;
    final Object invoke;
    final createRadioButton invokeSuspend;
    float onNavigationEvent = Float.MAX_VALUE;
    public boolean valueOf = false;

    /* access modifiers changed from: package-private */
    public abstract boolean getMax(long j);

    /* access modifiers changed from: package-private */
    public abstract boolean length(float f, float f2);

    public static abstract class length extends createRadioButton<View> {
        /* synthetic */ length(String str, byte b) {
            this(str);
        }

        private length(String str) {
            super(str);
        }
    }

    static class setMin {
        float getMin;
        float setMax;

        setMin() {
        }
    }

    <K> createEditText(K k, createRadioButton<K> createradiobutton) {
        this.invoke = k;
        this.invokeSuspend = createradiobutton;
        if (createradiobutton == equals || createradiobutton == toIntRange || createradiobutton == toFloatRange) {
            this.getCause = 0.1f;
        } else if (createradiobutton == FastBitmap$CoordinateSystem) {
            this.getCause = 0.00390625f;
        } else if (createradiobutton == setMin || createradiobutton == getMin) {
            this.getCause = 0.00390625f;
        } else {
            this.getCause = 1.0f;
        }
    }

    public void getMax() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            boolean z = this.Grayscale$Algorithm;
            if (!z && !z) {
                this.Grayscale$Algorithm = true;
                if (!this.valueOf) {
                    this.Mean$Arithmetic = this.invokeSuspend.getValue(this.invoke);
                }
                float f = this.Mean$Arithmetic;
                if (f > this.onNavigationEvent || f < this.create) {
                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                }
                createImageView min = createImageView.setMin();
                if (min.setMin.size() == 0) {
                    min.length().setMin();
                }
                if (!min.setMin.contains(this)) {
                    min.setMin.add(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    public final boolean setMin() {
        return this.Grayscale$Algorithm;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean getMin(long j) {
        long j2 = this.b;
        if (j2 == 0) {
            this.b = j;
            getMax(this.Mean$Arithmetic);
            return false;
        }
        this.b = j;
        boolean max = getMax(j - j2);
        float min = Math.min(this.Mean$Arithmetic, this.onNavigationEvent);
        this.Mean$Arithmetic = min;
        float max2 = Math.max(min, this.create);
        this.Mean$Arithmetic = max2;
        getMax(max2);
        if (max) {
            length();
        }
        return max;
    }

    public final void length() {
        this.Grayscale$Algorithm = false;
        createImageView.setMin().getMin(this);
        this.b = 0;
        this.valueOf = false;
        for (int i = 0; i < this.ICustomTabsCallback.size(); i++) {
            if (this.ICustomTabsCallback.get(i) != null) {
                this.ICustomTabsCallback.get(i);
            }
        }
        ArrayList<Object> arrayList = this.ICustomTabsCallback;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void getMax(float f) {
        this.invokeSuspend.setValue(this.invoke, f);
        for (int i = 0; i < this.extraCallback.size(); i++) {
            if (this.extraCallback.get(i) != null) {
                this.extraCallback.get(i);
            }
        }
        ArrayList<Object> arrayList = this.extraCallback;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final float setMax() {
        return this.getCause * 0.75f;
    }
}
