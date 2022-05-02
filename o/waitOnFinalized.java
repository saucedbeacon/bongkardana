package o;

import android.text.TextUtils;
import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity;
import javax.inject.Singleton;

@Singleton
public class waitOnFinalized {
    private DeepLinkPayloadEntity deepLinkPayloadEntity;

    public void saveDeepLinkPayload(DeepLinkPayloadEntity deepLinkPayloadEntity2) {
        this.deepLinkPayloadEntity = deepLinkPayloadEntity2;
    }

    public DeepLinkPayloadEntity getDeepLinkPayloadEntity(boolean z) {
        DeepLinkPayloadEntity deepLinkPayloadEntity2 = this.deepLinkPayloadEntity;
        if (!z || deepLinkPayloadEntity2.isSkipHomePage()) {
            removeDeepLinkPayload();
        }
        return deepLinkPayloadEntity2;
    }

    public void removeDeepLinkPayload() {
        this.deepLinkPayloadEntity = null;
    }

    public String getReferralCode() {
        if (hasReferralCode()) {
            return this.deepLinkPayloadEntity.getReferralCode();
        }
        return null;
    }

    public boolean hasReferralCode() {
        return hasPayload() && !TextUtils.isEmpty(this.deepLinkPayloadEntity.getReferralCode());
    }

    public boolean hasPayload() {
        return this.deepLinkPayloadEntity != null;
    }
}
