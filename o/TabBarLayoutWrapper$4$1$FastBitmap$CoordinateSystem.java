package o;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import o.TitleBarRightButtonView;

public final class TabBarLayoutWrapper$4$1$FastBitmap$CoordinateSystem<T> implements Callable<SecurityCipher<T>> {
    private final long getMax;
    private final TitleBarRightButtonView.AnonymousClass1<T> getMin;
    private final hasCornerMarking length;
    private final TimeUnit setMin;

    public TabBarLayoutWrapper$4$1$FastBitmap$CoordinateSystem(TitleBarRightButtonView.AnonymousClass1<T> r1, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking) {
        this.getMin = r1;
        this.getMax = j;
        this.setMin = timeUnit;
        this.length = hascornermarking;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.getMin.replay(this.getMax, this.setMin, this.length);
    }
}
