package o;

import id.dana.sendmoney.paymethod.ChangePayMethodView;
import kotlin.jvm.functions.Function1;

public final class setGridCheckStatus implements Function1 {
    private final int getMin;
    private final ChangePayMethodView setMax;

    public setGridCheckStatus(ChangePayMethodView changePayMethodView, int i) {
        this.setMax = changePayMethodView;
        this.getMin = i;
    }

    public final Object invoke(Object obj) {
        return this.setMax.getMin(this.getMin);
    }
}
