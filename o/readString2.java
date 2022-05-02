package o;

import o.b;

public final class readString2 implements getAdapterPosition<writeShort> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<readBoolean2> missionDetailEntityMapperProvider;
    private final b.C0007b<writeString2> promoQuestEntityDataFactoryProvider;
    private final b.C0007b<readShort> promoQuestEntityMapperProvider;
    private final b.C0007b<readInt> promoQuestMapperProvider;
    private final b.C0007b<readBytes> redeemQuestEntityMapperProvider;

    public readString2(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<writeString2> bVar4, b.C0007b<readShort> bVar5, b.C0007b<readBoolean2> bVar6, b.C0007b<readInt> bVar7, b.C0007b<readBytes> bVar8, b.C0007b<getAppLaunchParams> bVar9) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.promoQuestEntityDataFactoryProvider = bVar4;
        this.promoQuestEntityMapperProvider = bVar5;
        this.missionDetailEntityMapperProvider = bVar6;
        this.promoQuestMapperProvider = bVar7;
        this.redeemQuestEntityMapperProvider = bVar8;
        this.errorConfigFactoryProvider = bVar9;
    }

    public final writeShort get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.promoQuestEntityDataFactoryProvider.get(), this.promoQuestEntityMapperProvider.get(), this.missionDetailEntityMapperProvider.get(), this.promoQuestMapperProvider.get(), this.redeemQuestEntityMapperProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static readString2 create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<writeString2> bVar4, b.C0007b<readShort> bVar5, b.C0007b<readBoolean2> bVar6, b.C0007b<readInt> bVar7, b.C0007b<readBytes> bVar8, b.C0007b<getAppLaunchParams> bVar9) {
        return new readString2(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9);
    }

    public static writeShort newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r12, BackKeyDownPoint backKeyDownPoint, writeString2 writestring2, readShort readshort, readBoolean2 readboolean2, readInt readint, readBytes readbytes, getAppLaunchParams getapplaunchparams) {
        return new writeShort(dialogLayout, r12, backKeyDownPoint, writestring2, readshort, readboolean2, readint, readbytes, getapplaunchparams);
    }
}
