package o;

import id.dana.richview.boundcard.BoundCardView;
import kotlin.jvm.functions.Function1;

public final class onScanStep implements Function1 {
    private final BoundCardView setMax;

    public onScanStep(BoundCardView boundCardView) {
        this.setMax = boundCardView;
    }

    public final Object invoke(Object obj) {
        return this.setMax.presenter.length();
    }
}
