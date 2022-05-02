package o;

import kotlin.jvm.functions.Function1;
import o.R;

final class ViewCollections implements Function1 {
    private final R.styleable getMax;
    private final fillPageCommonInfo setMin;

    public ViewCollections(R.styleable styleable, fillPageCommonInfo fillpagecommoninfo) {
        this.getMax = styleable;
        this.setMin = fillpagecommoninfo;
    }

    public final Object invoke(Object obj) {
        return R.styleable.setMin(this.getMax, this.setMin, (Boolean) obj);
    }
}
