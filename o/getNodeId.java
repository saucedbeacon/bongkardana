package o;

import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity;
import java.util.List;

final class getNodeId implements RedDotDrawable {
    private final peekChild getMax;
    private final DeepLinkPayloadEntity setMin;

    public getNodeId(peekChild peekchild, DeepLinkPayloadEntity deepLinkPayloadEntity) {
        this.getMax = peekchild;
        this.setMin = deepLinkPayloadEntity;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$checkAuthEnable$1(this.setMin, (List) obj);
    }
}
