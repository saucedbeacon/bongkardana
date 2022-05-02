package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class pauseAnimation extends uncheckItems<getFrame> {
    private final setFrame cardPreferences;

    @Inject
    public pauseAnimation(setFrame setframe) {
        this.cardPreferences = setframe;
    }

    public getFrame createData(String str) {
        return new buildDrawingCache(this.cardPreferences);
    }
}
