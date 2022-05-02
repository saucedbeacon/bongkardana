package o;

import kotlin.jvm.functions.Function1;

final class setPageMargin implements Function1 {
    private final setOffscreenPageLimit getMax;

    public setPageMargin(setOffscreenPageLimit setoffscreenpagelimit) {
        this.getMax = setoffscreenpagelimit;
    }

    public final Object invoke(Object obj) {
        return setOffscreenPageLimit.setMax(this.getMax, (clearExpired) obj);
    }
}
