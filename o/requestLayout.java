package o;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.SolverVariable$Type;

public final class requestLayout<Transcode> {
    public boolean FastBitmap$CoordinateSystem;
    DecodeJob.getMin IsOverlapping;
    public Class<?> equals;
    int getMax;
    public Object getMin;
    public setPivotY hashCode;
    public evaluate invoke;
    boolean invokeSuspend;
    public MotionHelper isInside;
    public final List<SolverVariable$Type.setMax<?>> length = new ArrayList();
    public setFirstHorizontalStyle setMax;
    public final List<setPivotY> setMin = new ArrayList();
    public boolean toDoubleRange;
    int toFloatRange;
    public Map<Class<?>, updatePostLayout<?>> toIntRange;
    public Priority toString;
    boolean valueOf;
    public Class<Transcode> values;

    public final boolean length() {
        return this.invokeSuspend;
    }

    public final <Z> updatePostLayout<Z> getMin(Class<Z> cls) {
        updatePostLayout<Z> updatepostlayout = this.toIntRange.get(cls);
        if (updatepostlayout == null) {
            Iterator<Map.Entry<Class<?>, updatePostLayout<?>>> it = this.toIntRange.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    updatepostlayout = (updatePostLayout) next.getValue();
                    break;
                }
            }
        }
        if (updatepostlayout != null) {
            return updatepostlayout;
        }
        if (!this.toIntRange.isEmpty() || !this.valueOf) {
            return getBrightness.setMin();
        }
        StringBuilder sb = new StringBuilder("Missing transformation for ");
        sb.append(cls);
        sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean getMin(fireTrigger<?> firetrigger) {
        return this.setMax.length.getMin(firetrigger);
    }

    public final boolean setMax(setPivotY setpivoty) {
        List<SolverVariable$Type.setMax<?>> min = setMin();
        int size = min.size();
        for (int i = 0; i < size; i++) {
            if (min.get(i).setMax.equals(setpivoty)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final List<SolverVariable$Type.setMax<?>> setMin() {
        if (!this.FastBitmap$CoordinateSystem) {
            this.FastBitmap$CoordinateSystem = true;
            this.length.clear();
            List max = this.setMax.length.getMax(this.getMin);
            int size = max.size();
            for (int i = 0; i < size; i++) {
                SolverVariable$Type.setMax min = ((SolverVariable$Type) max.get(i)).setMin(this.getMin, this.getMax, this.toFloatRange, this.isInside);
                if (min != null) {
                    this.length.add(min);
                }
            }
        }
        return this.length;
    }

    /* access modifiers changed from: package-private */
    public final List<setPivotY> setMax() {
        if (!this.toDoubleRange) {
            this.toDoubleRange = true;
            this.setMin.clear();
            List<SolverVariable$Type.setMax<?>> min = setMin();
            int size = min.size();
            for (int i = 0; i < size; i++) {
                SolverVariable$Type.setMax setmax = min.get(i);
                if (!this.setMin.contains(setmax.setMax)) {
                    this.setMin.add(setmax.setMax);
                }
                for (int i2 = 0; i2 < setmax.getMin.size(); i2++) {
                    if (!this.setMin.contains(setmax.getMin.get(i2))) {
                        this.setMin.add(setmax.getMin.get(i2));
                    }
                }
            }
        }
        return this.setMin;
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax(Class<?> cls) {
        return this.setMax.length.setMax(cls, this.equals, this.values) != null;
    }
}
