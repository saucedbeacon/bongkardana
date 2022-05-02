package o;

import o.ResourceLoadContext;
import o.b;

public final class sourceNode implements getAdapterPosition<uri> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<assertOneSet> authEntityDataFactoryProvider;
    private final b.C0007b<getWidthAndHeight> authMapperProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<intercepted> oauthConfirmResultMapperProvider;
    private final b.C0007b<ResourceLoadContext.Builder> oauthInitResultMapperProvider;

    public sourceNode(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<ResourceLoadContext.Builder> bVar5, b.C0007b<assertOneSet> bVar6, b.C0007b<intercepted> bVar7, b.C0007b<getWidthAndHeight> bVar8) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.oauthInitResultMapperProvider = bVar5;
        this.authEntityDataFactoryProvider = bVar6;
        this.oauthConfirmResultMapperProvider = bVar7;
        this.authMapperProvider = bVar8;
    }

    public final uri get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.oauthInitResultMapperProvider.get(), this.authEntityDataFactoryProvider.get(), this.oauthConfirmResultMapperProvider.get(), this.authMapperProvider.get());
    }

    public static sourceNode create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<ResourceLoadContext.Builder> bVar5, b.C0007b<assertOneSet> bVar6, b.C0007b<intercepted> bVar7, b.C0007b<getWidthAndHeight> bVar8) {
        return new sourceNode(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public static uri newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r11, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, ResourceLoadContext.Builder builder, assertOneSet assertoneset, intercepted intercepted, getWidthAndHeight getwidthandheight) {
        return new uri(dialogLayout, r11, backKeyDownPoint, getapplaunchparams, builder, assertoneset, intercepted, getwidthandheight);
    }
}
