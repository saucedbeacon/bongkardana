package o;

import o.b;

public final class createDirectPassChannel implements getAdapterPosition<BigDataChannelManager> {
    private final b.C0007b<decrementRef> referralEngagementPreferenceProvider;

    public createDirectPassChannel(b.C0007b<decrementRef> bVar) {
        this.referralEngagementPreferenceProvider = bVar;
    }

    public final BigDataChannelManager get() {
        return newInstance(this.referralEngagementPreferenceProvider.get());
    }

    public static createDirectPassChannel create(b.C0007b<decrementRef> bVar) {
        return new createDirectPassChannel(bVar);
    }

    public static BigDataChannelManager newInstance(decrementRef decrementref) {
        return new BigDataChannelManager(decrementref);
    }
}
