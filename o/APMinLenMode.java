package o;

import id.dana.sendmoney.bank.savedcard.AddOtherCardDialogFragment;

public final class APMinLenMode implements Runnable {
    private final AddOtherCardDialogFragment.AnonymousClass5 setMin;

    public APMinLenMode(AddOtherCardDialogFragment.AnonymousClass5 r1) {
        this.setMin = r1;
    }

    public final void run() {
        AddOtherCardDialogFragment.AnonymousClass5 r0 = this.setMin;
        AddOtherCardDialogFragment.this.length.setState(4);
        AddOtherCardDialogFragment.this.nsContent.scrollTo(0, 0);
    }
}
