package o;

import o.b;

public final class maybeWrapHtml implements getAdapterPosition<updateListItems> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getMessageTextView> announcementEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;

    public maybeWrapHtml(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getMessageTextView> bVar5) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.announcementEntityDataFactoryProvider = bVar5;
    }

    public final updateListItems get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.announcementEntityDataFactoryProvider.get());
    }

    public static maybeWrapHtml create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getMessageTextView> bVar5) {
        return new maybeWrapHtml(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static updateListItems newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r8, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, getMessageTextView getmessagetextview) {
        return new updateListItems(dialogLayout, r8, backKeyDownPoint, getapplaunchparams, getmessagetextview);
    }
}
