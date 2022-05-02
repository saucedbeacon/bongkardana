package o;

import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity;

final class setParentNode implements RedDotManager {
    private final waitOnFinalized length;

    public setParentNode(waitOnFinalized waitonfinalized) {
        this.length = waitonfinalized;
    }

    public final void accept(Object obj) {
        this.length.saveDeepLinkPayload((DeepLinkPayloadEntity) obj);
    }
}
