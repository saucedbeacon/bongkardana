package o;

import id.dana.di.modules.MerchantDetailModule;
import o.GriverTransActivity;
import o.b;

public final class getActualTypeArguments implements getAdapterPosition<GriverTransActivity.Lite1.setMax> {
    private final MerchantDetailModule getMin;
    private final b.C0007b<GriverTransActivity.Main> setMin;

    private getActualTypeArguments(MerchantDetailModule merchantDetailModule, b.C0007b<GriverTransActivity.Main> bVar) {
        this.getMin = merchantDetailModule;
        this.setMin = bVar;
    }

    public static getActualTypeArguments getMin(MerchantDetailModule merchantDetailModule, b.C0007b<GriverTransActivity.Main> bVar) {
        return new getActualTypeArguments(merchantDetailModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverTransActivity.Lite1.setMax min = this.getMin.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
