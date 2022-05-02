package o;

import java.util.concurrent.Callable;

final class customListAdapter implements Callable {
    private final String equals;
    private final String getMax;
    private final String getMin;
    private final String length;
    private final getFrameMarginVertical$core setMax;
    private final String setMin;
    private final String toFloatRange;

    /* renamed from: o.customListAdapter$default  reason: invalid class name */
    final class Cdefault implements RedDotDrawable {
        public static final Cdefault length = new Cdefault();

        public final Object apply(Object obj) {
            return getFrameMarginVertical$core.lambda$getAvatarUrl$4((attach) obj);
        }
    }

    public customListAdapter(getFrameMarginVertical$core getframemarginvertical_core, String str, String str2, String str3, String str4, String str5, String str6) {
        this.setMax = getframemarginvertical_core;
        this.getMax = str;
        this.length = str2;
        this.getMin = str3;
        this.setMin = str4;
        this.equals = str5;
        this.toFloatRange = str6;
    }

    public final Object call() {
        return this.setMax.lambda$saveAccount$3(this.getMax, this.length, this.getMin, this.setMin, this.equals, this.toFloatRange);
    }
}
