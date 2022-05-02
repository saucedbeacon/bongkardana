package o;

import java.text.DecimalFormat;

public final class isDrawerView extends closeDrawers {
    protected int length;
    protected DecimalFormat setMax;

    public isDrawerView(int i) {
        this.length = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        StringBuilder sb = new StringBuilder("###,###,###,##0");
        sb.append(stringBuffer.toString());
        this.setMax = new DecimalFormat(sb.toString());
    }

    public final String getMin(float f) {
        return this.setMax.format((double) f);
    }

    public final int setMax() {
        return this.length;
    }
}
