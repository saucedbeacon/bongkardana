package o;

import com.iap.ac.android.biz.common.callback.InquireQuoteCallback;
import com.iap.ac.android.biz.common.model.ForeignExchangeQuote;
import o.TitleBarRightButtonView;

final class dispatchSendMessage implements InquireQuoteCallback {
    private final TitleBarRightButtonView.AnonymousClass2 getMax;

    public dispatchSendMessage(TitleBarRightButtonView.AnonymousClass2 r1) {
        this.getMax = r1;
    }

    public final void onResult(String str, ForeignExchangeQuote foreignExchangeQuote) {
        DefaultEmbedViewManager.lambda$getForexRate$0(this.getMax, str, foreignExchangeQuote);
    }
}
