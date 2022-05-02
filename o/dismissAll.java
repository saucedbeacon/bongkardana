package o;

import javax.inject.Inject;
import o.PopManager;

public final class dismissAll implements PopManager.PopBean.getMax {
    private final canGoBackOrForward getMin;
    /* access modifiers changed from: private */
    public final PopManager.PopBean.setMin length;

    @Inject
    dismissAll(PopManager.PopBean.setMin setmin, canGoBackOrForward cangobackorforward) {
        this.length = setmin;
        this.getMin = cangobackorforward;
    }

    public final void getMax() {
        this.getMin.execute(new GriverAppVirtualHostProxy<onTooManyRedirects>() {
            public final /* synthetic */ void onNext(Object obj) {
                dismissAll.this.length.onFinishGetSplitBillConfig((onTooManyRedirects) obj);
            }
        });
    }

    public final void setMax() {
        this.getMin.dispose();
    }
}
