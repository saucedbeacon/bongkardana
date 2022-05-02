package o;

import id.dana.dialog.CommonDialog;

public final class setLanguages implements Runnable {
    private final CommonDialog getMax;

    public setLanguages(CommonDialog commonDialog) {
        this.getMax = commonDialog;
    }

    public final void run() {
        this.getMax.setMax();
    }
}
