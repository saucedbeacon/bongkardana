package o;

import id.dana.sendmoney.bank.all.BankActivity;

public final class getPriority implements RedDotManager {
    private final BankActivity.AnonymousClass1 getMin;
    private final PhotoSelectListener setMin;

    public getPriority(BankActivity.AnonymousClass1 r1, PhotoSelectListener photoSelectListener) {
        this.getMin = r1;
        this.setMin = photoSelectListener;
    }

    public final void accept(Object obj) {
        this.getMin.setMax(this.setMin);
    }
}
