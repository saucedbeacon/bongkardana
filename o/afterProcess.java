package o;

import o.TitleBarRightButtonView;

final class afterProcess implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1 {
    private final addRenderReadyListener getMax;
    private final String getMin;

    public afterProcess(addRenderReadyListener addrenderreadylistener, String str) {
        this.getMax = addrenderreadylistener;
        this.getMin = str;
    }

    public final void subscribe(TitleBarRightButtonView.AnonymousClass2 r3) {
        this.getMax.lambda$login$6(this.getMin, r3);
    }
}
