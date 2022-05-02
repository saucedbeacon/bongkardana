package o;

import java.util.concurrent.Callable;

final class interceptLoad implements Callable {
    private final String getMin;
    private final apiCallIsFull setMin;

    public interceptLoad(apiCallIsFull apicallisfull, String str) {
        this.setMin = apicallisfull;
        this.getMin = str;
    }

    public final Object call() {
        return this.setMin.lambda$saveLastSeenReferralCampaignId$0(this.getMin);
    }
}
