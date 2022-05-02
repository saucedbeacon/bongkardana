package o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

public final class pullChildren<T> extends Property<T, Float> {
    private float equals;
    private final float[] getMax = new float[2];
    private final Property<T, PointF> getMin;
    private final float length;
    private final PointF setMax = new PointF();
    private final PathMeasure setMin;

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Float f = (Float) obj2;
        this.equals = f.floatValue();
        this.setMin.getPosTan(this.length * f.floatValue(), this.getMax, (float[]) null);
        this.setMax.x = this.getMax[0];
        this.setMax.y = this.getMax[1];
        this.getMin.set(obj, this.setMax);
    }

    public pullChildren(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.getMin = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.setMin = pathMeasure;
        this.length = pathMeasure.getLength();
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(this.equals);
    }
}
