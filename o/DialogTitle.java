package o;

import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.graphics.Path;
import android.util.Property;
import at.wirecube.additiveanimations.helper.evaluators.PathEvaluator;

public final class DialogTitle<T> {
    boolean FastBitmap$CoordinateSystem = false;
    PathEvaluator.PathMode IsOverlapping;
    TimeInterpolator equals;
    String getMax;
    Property<T, Float> getMin;
    setDecorPadding hashCode;
    TypeEvaluator<Float> isInside;
    float length;
    Path setMax;
    float setMin;
    FitWindowsLinearLayout<T> toDoubleRange;
    PathEvaluator toFloatRange;
    T toIntRange;
    private int toString;
    float values;

    public DialogTitle(T t, Property<T, Float> property, float f, float f2) {
        this.toIntRange = t;
        this.getMin = property;
        this.length = f2;
        this.setMin = f;
        String name = property.getName();
        this.getMax = name;
        this.toString = (name.hashCode() * 262143) + this.toIntRange.hashCode();
    }

    public DialogTitle(T t, String str, float f, float f2) {
        this.toIntRange = t;
        this.setMin = f;
        this.length = f2;
        this.getMax = str;
        this.toString = (str.hashCode() * 262143) + this.toIntRange.hashCode();
    }

    public DialogTitle(T t, String str, float f, Path path, PathEvaluator.PathMode pathMode, PathEvaluator pathEvaluator) {
        this.toIntRange = t;
        this.setMin = f;
        this.setMax = path;
        this.toFloatRange = pathEvaluator;
        this.IsOverlapping = pathMode;
        this.length = setMax(1.0f);
        this.getMax = str;
        this.toString = (str.hashCode() * 262143) + this.toIntRange.hashCode();
    }

    public DialogTitle(T t, Property<T, Float> property, float f, Path path, PathEvaluator.PathMode pathMode, PathEvaluator pathEvaluator) {
        this.toIntRange = t;
        this.getMin = property;
        this.setMin = f;
        this.setMax = path;
        this.toFloatRange = pathEvaluator;
        this.IsOverlapping = pathMode;
        this.length = setMax(1.0f);
        String name = property.getName();
        this.getMax = name;
        this.toString = (name.hashCode() * 262143) + this.toIntRange.hashCode();
    }

    public final boolean setMin() {
        return this.FastBitmap$CoordinateSystem;
    }

    public final float setMax(float f) {
        TimeInterpolator timeInterpolator = this.equals;
        if (timeInterpolator != null) {
            f = timeInterpolator.getInterpolation(f);
        }
        Path path = this.setMax;
        if (path != null) {
            return this.toFloatRange.setMax(f, this.IsOverlapping, path);
        }
        TypeEvaluator<Float> typeEvaluator = this.isInside;
        if (typeEvaluator != null) {
            return typeEvaluator.evaluate(f, Float.valueOf(this.setMin), Float.valueOf(this.length)).floatValue();
        }
        float f2 = this.setMin;
        return f2 + ((this.length - f2) * f);
    }

    public final int hashCode() {
        return this.toString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogTitle)) {
            return false;
        }
        DialogTitle dialogTitle = (DialogTitle) obj;
        return dialogTitle.getMax.hashCode() == this.getMax.hashCode() && dialogTitle.toIntRange == this.toIntRange;
    }
}
