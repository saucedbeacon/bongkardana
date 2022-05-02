package o;

import androidx.sqlite.db.SupportSQLiteQuery;

final class canShowOverflowMenu implements Runnable {
    private final SupportSQLiteQuery getMax;
    private final getContentHeight getMin;
    private final measureChildView setMax;

    public canShowOverflowMenu(getContentHeight getcontentheight, SupportSQLiteQuery supportSQLiteQuery, measureChildView measurechildview) {
        this.getMin = getcontentheight;
        this.getMax = supportSQLiteQuery;
        this.setMax = measurechildview;
    }

    public final void run() {
        this.getMax.setMin();
    }
}
