package o;

import id.dana.sendmoney.recipient.recent.RecentRecipientView;
import java.util.List;

public final class setLeftText implements RedDotManager {
    private final RecentRecipientView setMax;

    public setLeftText(RecentRecipientView recentRecipientView) {
        this.setMax = recentRecipientView;
    }

    public final void accept(Object obj) {
        this.setMax.recentRecipientAdapter.getMax = (List) obj;
    }
}
