package o;

import android.view.View;
import id.dana.news.viewholders.NewsViewHolderNews;

public final class NFCUtils implements View.OnClickListener {
    private final onProcess getMax;
    private final NewsViewHolderNews setMin;

    public NFCUtils(NewsViewHolderNews newsViewHolderNews, onProcess onprocess) {
        this.setMin = newsViewHolderNews;
        this.getMax = onprocess;
    }

    public final void onClick(View view) {
        NewsViewHolderNews.setMin(this.setMin, this.getMax);
    }
}
