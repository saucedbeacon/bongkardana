package o;

import android.util.FloatProperty;
import androidx.annotation.RequiresApi;

public abstract class createRadioButton<T> {
    final String mPropertyName;

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f);

    public createRadioButton(String str) {
        this.mPropertyName = str;
    }

    @RequiresApi(24)
    public static <T> createRadioButton<T> createFloatPropertyCompat(final FloatProperty<T> floatProperty) {
        return new createRadioButton<T>(floatProperty.getName()) {
            public final float getValue(T t) {
                return ((Float) floatProperty.get(t)).floatValue();
            }

            public final void setValue(T t, float f) {
                floatProperty.setValue(t, f);
            }
        };
    }
}
