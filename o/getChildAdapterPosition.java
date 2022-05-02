package o;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import androidx.annotation.NonNull;
import o.offsetPositionRecordsForInsert;

public final class getChildAdapterPosition extends getChildViewHolderInt {
    public getChildAdapterPosition(@NonNull offsetPositionRecordsForInsert.setMax setmax) {
        super(setmax);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final PropertyValuesHolder getMin(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = (int) (((float) this.toFloatRange) * this.isInside);
            i2 = this.toFloatRange;
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i = this.toFloatRange;
            i2 = (int) (((float) this.toFloatRange) * this.isInside);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }
}
