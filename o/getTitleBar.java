package o;

import o.Page;
import o.b;

public final class getTitleBar implements getAdapterPosition<PageContext> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<Page.RenderReadyListener> donationCampaignDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;

    public getTitleBar(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<Page.RenderReadyListener> bVar5) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.donationCampaignDataFactoryProvider = bVar5;
    }

    public final PageContext get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.donationCampaignDataFactoryProvider.get());
    }

    public static getTitleBar create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<Page.RenderReadyListener> bVar5) {
        return new getTitleBar(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static PageContext newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r8, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, Page.RenderReadyListener renderReadyListener) {
        return new PageContext(dialogLayout, r8, backKeyDownPoint, getapplaunchparams, renderReadyListener);
    }
}
