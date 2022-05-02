package o;

import o.R;

final class targetType implements R.styleable.setMin {
    private final String getMin;
    private final String length;
    private final R.styleable setMax;
    private final String setMin;

    public targetType(R.styleable styleable, String str, String str2, String str3) {
        this.setMax = styleable;
        this.getMin = str;
        this.setMin = str2;
        this.length = str3;
    }

    public final void getMax() {
        this.setMax.setMin(this.getMin, this.setMin, this.length);
    }
}
