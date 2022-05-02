package o;

import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity;

final class removeChild implements RedDotDrawable {
    private final peekChild setMin;

    public removeChild(peekChild peekchild) {
        this.setMin = peekchild;
    }

    public final Object apply(Object obj) {
        return this.setMin.checkAuthEnable((DeepLinkPayloadEntity) obj);
    }
}
