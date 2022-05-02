package o;

import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity;

final class usePermissions implements RedDotDrawable {
    private final DeepLinkPayloadEntity getMax;

    public usePermissions(DeepLinkPayloadEntity deepLinkPayloadEntity) {
        this.getMax = deepLinkPayloadEntity;
    }

    public final Object apply(Object obj) {
        return this.getMax.setAuthCode((String) obj);
    }
}
