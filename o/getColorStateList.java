package o;

import android.content.Context;
import o.b;

public final class getColorStateList implements getAdapterPosition<preload> {
    private final b.C0007b<onAppResume> apSecurityFacadeProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;
    private final b.C0007b<BackPressedPoint> geocoderProvider;
    private final b.C0007b<getWidthSpec> globalNetworkPreferenceProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getColorStateList(b.C0007b<Context> bVar, b.C0007b<getWidthSpec> bVar2, b.C0007b<BackPressedPoint> bVar3, b.C0007b<setDefaultFontSize> bVar4, b.C0007b<setIsUrgentResource> bVar5, b.C0007b<appxLoadFailed> bVar6, b.C0007b<onAppResume> bVar7) {
        this.contextProvider = bVar;
        this.globalNetworkPreferenceProvider = bVar2;
        this.geocoderProvider = bVar3;
        this.featureConfigRepositoryProvider = bVar4;
        this.rpcConnectorProvider = bVar5;
        this.threadExecutorProvider = bVar6;
        this.apSecurityFacadeProvider = bVar7;
    }

    public final preload get() {
        return newInstance(this.contextProvider.get(), this.globalNetworkPreferenceProvider.get(), this.geocoderProvider.get(), this.featureConfigRepositoryProvider.get(), this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.apSecurityFacadeProvider.get());
    }

    public static getColorStateList create(b.C0007b<Context> bVar, b.C0007b<getWidthSpec> bVar2, b.C0007b<BackPressedPoint> bVar3, b.C0007b<setDefaultFontSize> bVar4, b.C0007b<setIsUrgentResource> bVar5, b.C0007b<appxLoadFailed> bVar6, b.C0007b<onAppResume> bVar7) {
        return new getColorStateList(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public static preload newInstance(Context context, getWidthSpec getwidthspec, BackPressedPoint backPressedPoint, setDefaultFontSize setdefaultfontsize, setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume) {
        return new preload(context, getwidthspec, backPressedPoint, setdefaultfontsize, setisurgentresource, appxloadfailed, onappresume);
    }
}
