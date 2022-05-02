package o;

import id.dana.data.account.repository.AccountEntityRepository;
import o.b;
import o.getItems;

public final class getDividerColor implements getAdapterPosition<AccountEntityRepository> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getItems.core> accountMapperProvider;
    private final b.C0007b<positiveButtonClicked> avatarEntityDataFactoryProvider;
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<getExtObj> userProfileInfoEntityDataFactoryProvider;

    public getDividerColor(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<onCallBack> bVar4, b.C0007b<positiveButtonClicked> bVar5, b.C0007b<getExtObj> bVar6, b.C0007b<getItems.core> bVar7, b.C0007b<getAppLaunchParams> bVar8) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.configEntityDataFactoryProvider = bVar4;
        this.avatarEntityDataFactoryProvider = bVar5;
        this.userProfileInfoEntityDataFactoryProvider = bVar6;
        this.accountMapperProvider = bVar7;
        this.errorConfigFactoryProvider = bVar8;
    }

    public final AccountEntityRepository get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.configEntityDataFactoryProvider.get(), this.avatarEntityDataFactoryProvider.get(), this.userProfileInfoEntityDataFactoryProvider.get(), this.accountMapperProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static getDividerColor create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<onCallBack> bVar4, b.C0007b<positiveButtonClicked> bVar5, b.C0007b<getExtObj> bVar6, b.C0007b<getItems.core> bVar7, b.C0007b<getAppLaunchParams> bVar8) {
        return new getDividerColor(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public static AccountEntityRepository newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r11, BackKeyDownPoint backKeyDownPoint, onCallBack oncallback, positiveButtonClicked positivebuttonclicked, getExtObj getextobj, getItems.core core, getAppLaunchParams getapplaunchparams) {
        return new AccountEntityRepository(dialogLayout, r11, backKeyDownPoint, oncallback, positivebuttonclicked, getextobj, core, getapplaunchparams);
    }
}
