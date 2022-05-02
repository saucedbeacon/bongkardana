package o;

import id.dana.sendmoney.view.RecipientView;

public final class getSelected implements RedDotManager {
    private final RecipientView length;

    public getSelected(RecipientView recipientView) {
        this.length = recipientView;
    }

    public final void accept(Object obj) {
        RecipientView.setMax(this.length, (Boolean) obj);
    }
}
