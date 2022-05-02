package o;

import com.github.mikephil.charting.components.YAxis;

public class addFocusables {
    public float IsOverlapping;
    public int equals;
    public float getMax;
    public float getMin;
    public float isInside;
    public int length;
    public float setMax;
    public float setMin;
    public YAxis.AxisDependency toFloatRange;
    public int toIntRange;

    public addFocusables(float f, float f2, int i) {
        this.setMax = Float.NaN;
        this.getMin = Float.NaN;
        this.length = -1;
        this.toIntRange = -1;
        this.setMax = f;
        this.getMin = f2;
        this.equals = i;
    }

    public addFocusables(float f, int i, int i2) {
        this(f, Float.NaN, i);
        this.toIntRange = i2;
    }

    public addFocusables(float f, float f2, float f3, float f4, int i, YAxis.AxisDependency axisDependency) {
        this.setMax = Float.NaN;
        this.getMin = Float.NaN;
        this.length = -1;
        this.toIntRange = -1;
        this.setMax = f;
        this.getMin = f2;
        this.getMax = f3;
        this.setMin = f4;
        this.equals = i;
        this.toFloatRange = axisDependency;
    }

    public addFocusables(float f, float f2, float f3, float f4, int i, int i2, YAxis.AxisDependency axisDependency) {
        this(f, f2, f3, f4, i, axisDependency);
        this.toIntRange = i2;
    }

    public final boolean length(addFocusables addfocusables) {
        return addfocusables != null && this.equals == addfocusables.equals && this.setMax == addfocusables.setMax && this.toIntRange == addfocusables.toIntRange && this.length == addfocusables.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Highlight, x: ");
        sb.append(this.setMax);
        sb.append(", y: ");
        sb.append(this.getMin);
        sb.append(", dataSetIndex: ");
        sb.append(this.equals);
        sb.append(", stackIndex (only stacked barentry): ");
        sb.append(this.toIntRange);
        return sb.toString();
    }
}
