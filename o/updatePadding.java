package o;

import o.TitleBarRightButtonView;
import o.b;

public interface updatePadding {
    TitleBarRightButtonView.AnonymousClass1<maybeSetTextColor> getAuthCode(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2);

    TitleBarRightButtonView.AnonymousClass1<maybeSetTextColor> getAuthCode(String str, String str2, String str3, boolean z, String str4, boolean z2, String str5);

    TitleBarRightButtonView.AnonymousClass1<maybeSetTextColor> getGnAuthCode(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9);

    /* renamed from: o.updatePadding$default  reason: invalid class name */
    public final class Cdefault implements getAdapterPosition<createColorSelector> {
        private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
        private final b.C0007b<assertOneSet> authEntityDataFactoryProvider;
        private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
        private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
        private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
        private final b.C0007b<getWidthAndHeight> mapperProvider;

        public Cdefault(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<assertOneSet> bVar4, b.C0007b<getWidthAndHeight> bVar5, b.C0007b<getAppLaunchParams> bVar6) {
            this.accountEntityDataFactoryProvider = bVar;
            this.loginEntityDataFactoryProvider = bVar2;
            this.guardFacadeProvider = bVar3;
            this.authEntityDataFactoryProvider = bVar4;
            this.mapperProvider = bVar5;
            this.errorConfigFactoryProvider = bVar6;
        }

        public final createColorSelector get() {
            return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.authEntityDataFactoryProvider.get(), this.mapperProvider.get(), this.errorConfigFactoryProvider.get());
        }

        public static Cdefault create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<assertOneSet> bVar4, b.C0007b<getWidthAndHeight> bVar5, b.C0007b<getAppLaunchParams> bVar6) {
            return new Cdefault(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
        }

        public static createColorSelector newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r9, BackKeyDownPoint backKeyDownPoint, assertOneSet assertoneset, getWidthAndHeight getwidthandheight, getAppLaunchParams getapplaunchparams) {
            return new createColorSelector(dialogLayout, r9, backKeyDownPoint, assertoneset, getwidthandheight, getapplaunchparams);
        }
    }
}
