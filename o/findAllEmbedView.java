package o;

import java.util.List;
import o.TitleBarRightButtonView;

final class findAllEmbedView implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1 {
    private final List getMax;
    private final List length;

    public findAllEmbedView(List list, List list2) {
        this.length = list;
        this.getMax = list2;
    }

    public final void subscribe(TitleBarRightButtonView.AnonymousClass2 r3) {
        DefaultEmbedViewManager.lambda$getListRealTimeForexRate$3(this.length, this.getMax, r3);
    }
}
