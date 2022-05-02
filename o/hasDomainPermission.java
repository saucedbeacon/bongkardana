package o;

import id.dana.di.modules.TwilioIdentityVerificationModule;
import o.GriverPageContainer;

public final class hasDomainPermission implements getAdapterPosition<GriverPageContainer.H5CloseHandler.setMin> {
    private final TwilioIdentityVerificationModule getMax;

    private hasDomainPermission(TwilioIdentityVerificationModule twilioIdentityVerificationModule) {
        this.getMax = twilioIdentityVerificationModule;
    }

    public static hasDomainPermission length(TwilioIdentityVerificationModule twilioIdentityVerificationModule) {
        return new hasDomainPermission(twilioIdentityVerificationModule);
    }

    public final /* synthetic */ Object get() {
        GriverPageContainer.H5CloseHandler.setMin length = this.getMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
