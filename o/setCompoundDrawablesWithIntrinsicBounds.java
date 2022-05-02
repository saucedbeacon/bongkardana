package o;

import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class setCompoundDrawablesWithIntrinsicBounds implements Runnable {
    private setSupportCompoundDrawablesTintList getMax;
    private String getMin;
    private WorkerParameters.getMax setMax;

    public setCompoundDrawablesWithIntrinsicBounds(setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist, String str, WorkerParameters.getMax getmax) {
        this.getMax = setsupportcompounddrawablestintlist;
        this.getMin = str;
        this.setMax = getmax;
    }

    public final void run() {
        this.getMax.toIntRange.setMin(this.getMin, this.setMax);
    }
}
