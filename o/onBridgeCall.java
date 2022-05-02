package o;

import id.dana.di.modules.OauthGrantModule;
import o.dispatchOnPageScrolled;

public final class onBridgeCall implements getAdapterPosition<dispatchOnPageScrolled.getMax> {
    private final OauthGrantModule setMax;

    private onBridgeCall(OauthGrantModule oauthGrantModule) {
        this.setMax = oauthGrantModule;
    }

    public static onBridgeCall setMin(OauthGrantModule oauthGrantModule) {
        return new onBridgeCall(oauthGrantModule);
    }

    public final /* synthetic */ Object get() {
        dispatchOnPageScrolled.getMax length = this.setMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
