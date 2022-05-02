package o;

import id.dana.pay.BasePayFragment;

public final class chooseFileFromDisk implements RedDotManager {
    private final BasePayFragment setMax;

    public chooseFileFromDisk(BasePayFragment basePayFragment) {
        this.setMax = basePayFragment;
    }

    public final void accept(Object obj) {
        this.setMax.equals();
    }
}
