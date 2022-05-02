package o;

import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;

public final class performIdentifierAction {
    public int IsOverlapping = 0;
    public int equals = 0;
    public int getMax;
    public int getMin;
    public boolean isInside;
    public boolean length = true;
    public int setMax;
    public int setMin;
    public boolean toIntRange;

    public final boolean length(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2 = this.setMax;
        if (i2 < 0) {
            return false;
        }
        if (recyclerView$Mean$Arithmetic.equals) {
            i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i = recyclerView$Mean$Arithmetic.setMin;
        }
        return i2 < i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
        sb.append(this.getMin);
        sb.append(", mCurrentPosition=");
        sb.append(this.setMax);
        sb.append(", mItemDirection=");
        sb.append(this.setMin);
        sb.append(", mLayoutDirection=");
        sb.append(this.getMax);
        sb.append(", mStartLine=");
        sb.append(this.IsOverlapping);
        sb.append(", mEndLine=");
        sb.append(this.equals);
        sb.append('}');
        return sb.toString();
    }
}
