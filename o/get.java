package o;

import java.nio.charset.Charset;

public abstract class get {
    public long setMax() {
        return -1;
    }

    public abstract getMaxCardElevation setMin();

    public abstract void setMin(resize resize);

    public static get getMin(getMaxCardElevation getmaxcardelevation, String str) {
        Charset charset = CustomTabsIntent$ShareState.length;
        if (getmaxcardelevation != null) {
            charset = getmaxcardelevation.setMax != null ? Charset.forName(getmaxcardelevation.setMax) : null;
            if (charset == null) {
                charset = CustomTabsIntent$ShareState.length;
                StringBuilder sb = new StringBuilder();
                sb.append(getmaxcardelevation);
                sb.append("; charset=utf-8");
                getmaxcardelevation = getMaxCardElevation.length(sb.toString());
            }
        }
        byte[] bytes = str.getBytes(charset);
        return setMax(getmaxcardelevation, bytes, bytes.length);
    }

    private static get setMax(final getMaxCardElevation getmaxcardelevation, final byte[] bArr, final int i) {
        if (bArr != null) {
            CustomTabsIntent$ShareState.getMax((long) bArr.length, (long) i);
            return new get() {
                final /* synthetic */ int getMin = 0;

                public final getMaxCardElevation setMin() {
                    return getmaxcardelevation;
                }

                public final long setMax() {
                    return (long) i;
                }

                public final void setMin(resize resize) {
                    resize.setMin(bArr, this.getMin, i);
                }
            };
        }
        throw new NullPointerException("content == null");
    }
}
