package o;

import java.text.DecimalFormat;

public class openDrawer extends closeDrawers {
    protected DecimalFormat setMax;
    protected int setMin;

    public openDrawer(int i) {
        setMax(i);
    }

    public final void setMax(int i) {
        this.setMin = i;
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
}
