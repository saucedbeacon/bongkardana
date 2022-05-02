package o;

import id.dana.social.di.module.ReactionsModule;
import o.b;
import o.setLeftButtonFont;

public final class getTextDpSize implements getAdapterPosition<setLeftButtonFont.getMin> {
    private final ReactionsModule getMax;
    private final b.C0007b<setColorWhiteStyle> setMin;

    private getTextDpSize(ReactionsModule reactionsModule, b.C0007b<setColorWhiteStyle> bVar) {
        this.getMax = reactionsModule;
        this.setMin = bVar;
    }

    public static getTextDpSize setMin(ReactionsModule reactionsModule, b.C0007b<setColorWhiteStyle> bVar) {
        return new getTextDpSize(reactionsModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setLeftButtonFont.getMin min = this.getMax.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
