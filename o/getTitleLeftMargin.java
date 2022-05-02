package o;

import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class getTitleLeftMargin<T> extends onLoadMoreStateChanged<T, T> {
    private final removeStateDidChangeHandler getMax;
    private final RedDotManager<? super GriverProgressBar.UpdateRunnable> length;

    public getTitleLeftMargin(TitleBarRightButtonView.AnonymousClass1<T> r1, RedDotManager<? super GriverProgressBar.UpdateRunnable> redDotManager, removeStateDidChangeHandler removestatedidchangehandler) {
        super(r1);
        this.length = redDotManager;
        this.getMax = removestatedidchangehandler;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new updateHeaderPosition(griverProgressBar, this.length, this.getMax));
    }
}
