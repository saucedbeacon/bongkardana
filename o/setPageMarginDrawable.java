package o;

import kotlin.jvm.functions.Function1;

final class setPageMarginDrawable implements Function1 {
    private final setOffscreenPageLimit setMax;

    public setPageMarginDrawable(setOffscreenPageLimit setoffscreenpagelimit) {
        this.setMax = setoffscreenpagelimit;
    }

    public final Object invoke(Object obj) {
        return this.setMax.invoke.length(((Boolean) obj).booleanValue());
    }
}
