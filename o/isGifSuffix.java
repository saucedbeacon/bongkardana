package o;

import id.dana.sendmoney.view.RecipientView;

public final class isGifSuffix implements RedDotManager {
    private final RecipientView getMax;

    public isGifSuffix(RecipientView recipientView) {
        this.getMax = recipientView;
    }

    public final void accept(Object obj) {
        RecipientView.length(this.getMax, (String) obj);
    }
}
