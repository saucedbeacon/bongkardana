package o;

final class addAttr implements RedDotDrawable {
    private final apiCallIsFull length;

    public addAttr(apiCallIsFull apicallisfull) {
        this.length = apicallisfull;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$getLatestReferralCampaign$1((doInitialize) obj);
    }
}
