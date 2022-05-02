package o;

import com.iap.ac.android.biz.common.callback.InquireQuoteCallback;
import com.iap.ac.android.biz.common.model.ForeignExchangeQuote;
import java.util.List;
import o.TitleBarRightButtonView;

final class releaseViews implements InquireQuoteCallback {
    private final List getMax;
    private final int length;
    private final TitleBarRightButtonView.AnonymousClass2 setMax;

    public releaseViews(List list, int i, TitleBarRightButtonView.AnonymousClass2 r3) {
        this.getMax = list;
        this.length = i;
        this.setMax = r3;
    }

    public final void onResult(String str, ForeignExchangeQuote foreignExchangeQuote) {
        DefaultEmbedViewManager.lambda$getListRealTimeForexRate$2(this.getMax, this.length, this.setMax, str, foreignExchangeQuote);
    }
}
