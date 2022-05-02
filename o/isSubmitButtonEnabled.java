package o;

import androidx.annotation.Nullable;
import java.util.Collections;

public final class isSubmitButtonEnabled<K, A> extends setInputType<K, A> {
    private final onRtlPropertiesChanged<A> getMax;
    private final A isInside;

    /* access modifiers changed from: package-private */
    public final float getMin() {
        return 1.0f;
    }

    public isSubmitButtonEnabled(setTitleMarginBottom<A> settitlemarginbottom) {
        this(settitlemarginbottom, (Object) null);
    }

    public isSubmitButtonEnabled(setTitleMarginBottom<A> settitlemarginbottom, @Nullable A a2) {
        super(Collections.emptyList());
        this.getMax = new onRtlPropertiesChanged<>();
        getMin(settitlemarginbottom);
        this.isInside = a2;
    }

    public final void setMax(float f) {
        this.setMax = f;
    }

    public final void setMax() {
        if (this.length != null) {
            super.setMax();
        }
    }

    public final A equals() {
        setTitleMarginBottom settitlemarginbottom = this.length;
        A a2 = this.isInside;
        settitlemarginbottom.setMax.length(0.0f, 0.0f, a2, a2, IsOverlapping(), IsOverlapping(), IsOverlapping());
        return settitlemarginbottom.getMax();
    }

    /* access modifiers changed from: package-private */
    public final A getMax(setTitleMarginTop<K> settitlemargintop, float f) {
        return equals();
    }
}
