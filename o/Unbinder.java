package o;

import o.R;

final class Unbinder implements R.styleable.setMin {
    private final fillPageCommonInfo getMin;
    private final R.styleable setMax;

    public Unbinder(R.styleable styleable, fillPageCommonInfo fillpagecommoninfo) {
        this.setMax = styleable;
        this.getMin = fillpagecommoninfo;
    }

    public final void getMax() {
        this.setMax.setMin(this.getMin);
    }
}
