package o;

import o.BridgeResponse;
import o.b;

public final class loadPlugin implements getAdapterPosition<setWorkerId> {
    private final b.C0007b<BridgeResponse.NamedValue> merchantReviewEntityDataProvider;
    private final b.C0007b<getFrameMarginVertical$core> preferenceAccountEntityDataProvider;

    public loadPlugin(b.C0007b<BridgeResponse.NamedValue> bVar, b.C0007b<getFrameMarginVertical$core> bVar2) {
        this.merchantReviewEntityDataProvider = bVar;
        this.preferenceAccountEntityDataProvider = bVar2;
    }

    public final setWorkerId get() {
        return newInstance(this.merchantReviewEntityDataProvider.get(), this.preferenceAccountEntityDataProvider.get());
    }

    public static loadPlugin create(b.C0007b<BridgeResponse.NamedValue> bVar, b.C0007b<getFrameMarginVertical$core> bVar2) {
        return new loadPlugin(bVar, bVar2);
    }

    public static setWorkerId newInstance(BridgeResponse.NamedValue namedValue, getFrameMarginVertical$core getframemarginvertical_core) {
        return new setWorkerId(namedValue, getframemarginvertical_core);
    }
}
