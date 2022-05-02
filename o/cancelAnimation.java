package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class cancelAnimation implements confirm {
    private final pauseAnimation cardPreferencesDataFactory;

    @Inject
    public cancelAnimation(pauseAnimation pauseanimation) {
        this.cardPreferencesDataFactory = pauseanimation;
    }

    private getFrame createCardPreferencesData() {
        return this.cardPreferencesDataFactory.createData("local");
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveLastCardUsed(String str) {
        return createCardPreferencesData().saveLastCardUsed(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getDefaultCard() {
        return createCardPreferencesData().getDefaultCard();
    }
}
