package o;

import o.TitleBarRightButtonView;

final class destroyView implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1 {
    private final boolean getMax;
    private final String getMin;
    private final String length;
    private final DefaultEmbedViewManager setMin;

    public destroyView(DefaultEmbedViewManager defaultEmbedViewManager, String str, String str2, boolean z) {
        this.setMin = defaultEmbedViewManager;
        this.getMin = str;
        this.length = str2;
        this.getMax = z;
    }

    public final void subscribe(TitleBarRightButtonView.AnonymousClass2 r5) {
        this.setMin.lambda$decodeGnQr$6(this.getMin, this.length, this.getMax, r5);
    }
}
