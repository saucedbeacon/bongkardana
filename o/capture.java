package o;

import id.dana.richview.boundcard.BoundCardView;
import kotlin.jvm.functions.Function1;

public final class capture implements Function1 {
    private final BoundCardView getMin;

    public capture(BoundCardView boundCardView) {
        this.getMin = boundCardView;
    }

    public final Object invoke(Object obj) {
        return BoundCardView.setMax(this.getMin, (isBaselineAligned) obj);
    }
}
