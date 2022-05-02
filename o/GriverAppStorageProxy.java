package o;

import id.dana.dialog.LoginInfoDialog;

public final class GriverAppStorageProxy implements Runnable {
    private final LoginInfoDialog setMin;

    public GriverAppStorageProxy(LoginInfoDialog loginInfoDialog) {
        this.setMin = loginInfoDialog;
    }

    public final void run() {
        this.setMin.setMax();
    }
}
