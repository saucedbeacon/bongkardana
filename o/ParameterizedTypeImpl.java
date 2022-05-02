package o;

import id.dana.di.modules.MerchantDetailReviewModule;
import o.UniformOptionMenuPanelExtensionImpl;

public final class ParameterizedTypeImpl implements getAdapterPosition<UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.length> {
    private final MerchantDetailReviewModule length;

    private ParameterizedTypeImpl(MerchantDetailReviewModule merchantDetailReviewModule) {
        this.length = merchantDetailReviewModule;
    }

    public static ParameterizedTypeImpl setMin(MerchantDetailReviewModule merchantDetailReviewModule) {
        return new ParameterizedTypeImpl(merchantDetailReviewModule);
    }

    public final /* synthetic */ Object get() {
        UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.length length2 = this.length.length();
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
