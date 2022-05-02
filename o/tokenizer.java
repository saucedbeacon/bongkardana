package o;

import id.dana.base.BaseActivity;

public final class tokenizer implements RedDotManager {
    private final BaseActivity setMax;

    public tokenizer(BaseActivity baseActivity) {
        this.setMax = baseActivity;
    }

    public final void accept(Object obj) {
        this.setMax.lambda$initComponents$2((Boolean) obj);
    }
}
