package o;

import java.util.Map;
import o.IPostMessageService;

final class measureChildConstrained implements IPostMessageService.Default {
    private final ensureCollapseButtonView getMin;

    public measureChildConstrained(ensureCollapseButtonView ensurecollapsebuttonview) {
        this.getMin = ensurecollapsebuttonview;
    }

    public final void onActivityResult(Object obj) {
        ensureCollapseButtonView.getMin(this.getMin, (Map) obj);
    }
}
