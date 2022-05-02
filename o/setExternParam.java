package o;

import id.dana.sendmoney.remarks.NoteView;
import id.dana.splitbill.view.SplitBillPayersView;

public final class setExternParam implements NoteView.length {
    private final SplitBillPayersView length;

    public setExternParam(SplitBillPayersView splitBillPayersView) {
        this.length = splitBillPayersView;
    }

    public final void length() {
        this.length.clearCurrentFocus();
    }
}
