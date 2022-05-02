package o;

import o.BridgeResponse;
import o.b;

public final class sendJSONResponse implements getAdapterPosition<BridgeCallback> {
    private final b.C0007b<BridgeResponse> amcsMerchantConfigEntityDataProvider;
    private final b.C0007b<BridgeResponse.Error> defaultMerchantConfigEntityDataProvider;
    private final b.C0007b<getCallMode> splitMerchantConfigEntityProvider;

    public sendJSONResponse(b.C0007b<BridgeResponse> bVar, b.C0007b<getCallMode> bVar2, b.C0007b<BridgeResponse.Error> bVar3) {
        this.amcsMerchantConfigEntityDataProvider = bVar;
        this.splitMerchantConfigEntityProvider = bVar2;
        this.defaultMerchantConfigEntityDataProvider = bVar3;
    }

    public final BridgeCallback get() {
        return newInstance(this.amcsMerchantConfigEntityDataProvider.get(), this.splitMerchantConfigEntityProvider.get(), this.defaultMerchantConfigEntityDataProvider.get());
    }

    public static sendJSONResponse create(b.C0007b<BridgeResponse> bVar, b.C0007b<getCallMode> bVar2, b.C0007b<BridgeResponse.Error> bVar3) {
        return new sendJSONResponse(bVar, bVar2, bVar3);
    }

    public static BridgeCallback newInstance(BridgeResponse bridgeResponse, getCallMode getcallmode, BridgeResponse.Error error) {
        return new BridgeCallback(bridgeResponse, getcallmode, error);
    }
}
