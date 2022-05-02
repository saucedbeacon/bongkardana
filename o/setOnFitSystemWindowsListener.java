package o;

import android.animation.TypeEvaluator;
import android.util.Property;
import java.util.List;

public interface setOnFitSystemWindowsListener<T> {
    List<setMax<T>> setMax();

    public static class setMax<T> {
        public final float getMax;
        public final Property<T, Float> length;
        public TypeEvaluator<Float> setMin = null;

        public setMax(Property<T, Float> property, float f) {
            this.length = property;
            this.getMax = f;
        }
    }
}
