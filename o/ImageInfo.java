package o;

import id.dana.sendmoney.bank.savedcard.AddOtherCardDialogFragment;

public final class ImageInfo implements Runnable {
    private final AddOtherCardDialogFragment.AnonymousClass5 setMax;

    public ImageInfo(AddOtherCardDialogFragment.AnonymousClass5 r1) {
        this.setMax = r1;
    }

    public final void run() {
        AddOtherCardDialogFragment.this.length.setState(3);
    }
}
