package o;

import o.APExpansion;
import o.b;

public final class setFromSystem implements getAdapterPosition<RVGroupInit> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<handleMessage> amcsConfigProvider;
    private final b.C0007b<getAuthContentResult> contactProvider;
    private final b.C0007b<APExpansion.AnonymousClass1> ioDispatcherProvider;
    private final b.C0007b<getLink> socialPreferencesDataFactoryProvider;
    private final b.C0007b<getCurrentLongitudeAndLatitude> socialPreferencesProvider;
    private final b.C0007b<setAuthRequestContext> socialSyncFactoryProvider;
    private final b.C0007b<getExtInfo> socialSyncProcessFactoryProvider;

    public setFromSystem(b.C0007b<getAuthContentResult> bVar, b.C0007b<handleMessage> bVar2, b.C0007b<DialogLayout> bVar3, b.C0007b<setAuthRequestContext> bVar4, b.C0007b<getExtInfo> bVar5, b.C0007b<getCurrentLongitudeAndLatitude> bVar6, b.C0007b<getLink> bVar7, b.C0007b<APExpansion.AnonymousClass1> bVar8) {
        this.contactProvider = bVar;
        this.amcsConfigProvider = bVar2;
        this.accountEntityDataFactoryProvider = bVar3;
        this.socialSyncFactoryProvider = bVar4;
        this.socialSyncProcessFactoryProvider = bVar5;
        this.socialPreferencesProvider = bVar6;
        this.socialPreferencesDataFactoryProvider = bVar7;
        this.ioDispatcherProvider = bVar8;
    }

    public final RVGroupInit get() {
        return newInstance(this.contactProvider.get(), this.amcsConfigProvider.get(), this.accountEntityDataFactoryProvider.get(), this.socialSyncFactoryProvider.get(), this.socialSyncProcessFactoryProvider.get(), this.socialPreferencesProvider.get(), this.socialPreferencesDataFactoryProvider.get(), this.ioDispatcherProvider.get());
    }

    public static setFromSystem create(b.C0007b<getAuthContentResult> bVar, b.C0007b<handleMessage> bVar2, b.C0007b<DialogLayout> bVar3, b.C0007b<setAuthRequestContext> bVar4, b.C0007b<getExtInfo> bVar5, b.C0007b<getCurrentLongitudeAndLatitude> bVar6, b.C0007b<getLink> bVar7, b.C0007b<APExpansion.AnonymousClass1> bVar8) {
        return new setFromSystem(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public static RVGroupInit newInstance(getAuthContentResult getauthcontentresult, handleMessage handlemessage, DialogLayout dialogLayout, setAuthRequestContext setauthrequestcontext, getExtInfo getextinfo, getCurrentLongitudeAndLatitude getcurrentlongitudeandlatitude, getLink getlink, APExpansion.AnonymousClass1 r17) {
        return new RVGroupInit(getauthcontentresult, handlemessage, dialogLayout, setauthrequestcontext, getextinfo, getcurrentlongitudeandlatitude, getlink, r17);
    }
}
