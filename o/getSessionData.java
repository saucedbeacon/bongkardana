package o;

import android.view.animation.Animation;
import id.dana.promoquest.views.QuestView;

public final class getSessionData implements RedDotManager {
    private final QuestView.AnonymousClass4 length;
    private final Animation setMax;

    public getSessionData(QuestView.AnonymousClass4 r1, Animation animation) {
        this.length = r1;
        this.setMax = animation;
    }

    public final void accept(Object obj) {
        QuestView.AnonymousClass4 r2 = this.length;
        QuestView.access$600(QuestView.this, this.setMax);
    }
}
