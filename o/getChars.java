package o;

import id.dana.di.modules.LatestNewsModule;
import o.AddPhoneContactBridgeExtension;

public final class getChars implements getAdapterPosition<AddPhoneContactBridgeExtension.AnonymousClass3.length> {
    private final LatestNewsModule setMin;

    private getChars(LatestNewsModule latestNewsModule) {
        this.setMin = latestNewsModule;
    }

    public static getChars setMin(LatestNewsModule latestNewsModule) {
        return new getChars(latestNewsModule);
    }

    public final /* synthetic */ Object get() {
        AddPhoneContactBridgeExtension.AnonymousClass3.length length = this.setMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
