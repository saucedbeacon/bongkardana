package androidx.recyclerview.widget;

import android.util.SparseArray;

public class RecyclerView$Mean$Arithmetic {
    int FastBitmap$CoordinateSystem;
    boolean IsOverlapping = false;
    int Mean$Arithmetic;
    public boolean equals = false;
    public int getMax = 0;
    int getMin = -1;
    long hashCode;
    private SparseArray<Object> invoke;
    boolean isInside = false;
    public int length = 1;
    public int setMax = 0;
    public int setMin = 0;
    int toDoubleRange;
    public boolean toFloatRange = false;
    public boolean toIntRange = false;
    boolean toString = false;
    int values;

    /* access modifiers changed from: package-private */
    public final void length(int i) {
        if ((this.length & i) == 0) {
            StringBuilder sb = new StringBuilder("Layout state should be one of ");
            sb.append(Integer.toBinaryString(i));
            sb.append(" but it is ");
            sb.append(Integer.toBinaryString(this.length));
            throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean length() {
        return this.toFloatRange;
    }

    public final boolean setMax() {
        return this.equals;
    }

    public final boolean getMax() {
        return this.toString;
    }

    public final boolean getMin() {
        return this.getMin != -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=");
        sb.append(this.getMin);
        sb.append(", mData=");
        sb.append(this.invoke);
        sb.append(", mItemCount=");
        sb.append(this.setMin);
        sb.append(", mIsMeasuring=");
        sb.append(this.toFloatRange);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.setMax);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.getMax);
        sb.append(", mStructureChanged=");
        sb.append(this.isInside);
        sb.append(", mInPreLayout=");
        sb.append(this.equals);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.IsOverlapping);
        sb.append(", mRunPredictiveAnimations=");
        sb.append(this.toString);
        sb.append('}');
        return sb.toString();
    }
}
