package o;

import o.b;
import o.font;
import o.resolveDimen;

public final class resolveString implements getAdapterPosition<font.Cdefault> {
    private final b.C0007b<resolveDimen.Cdefault> faceAuthSuggestionPreferenceProvider;

    public resolveString(b.C0007b<resolveDimen.Cdefault> bVar) {
        this.faceAuthSuggestionPreferenceProvider = bVar;
    }

    public final font.Cdefault get() {
        return newInstance(this.faceAuthSuggestionPreferenceProvider.get());
    }

    public static resolveString create(b.C0007b<resolveDimen.Cdefault> bVar) {
        return new resolveString(bVar);
    }

    public static font.Cdefault newInstance(resolveDimen.Cdefault defaultR) {
        return new font.Cdefault(defaultR);
    }

    /* renamed from: o.resolveString$default  reason: invalid class name */
    public final class Cdefault implements getAdapterPosition<resolveDrawable> {
        private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
        private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
        private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
        private final b.C0007b<font.Cdefault> faceAuthSuggestionDataFactoryProvider;
        private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
        private final b.C0007b<BackKeyDownPoint> securityGuardFacadeProvider;
        private final b.C0007b<getAlias> userInfoEntityDataFactoryProvider;
        private final b.C0007b<PackageQueryPoint> userInfoMapperProvider;

        public Cdefault(b.C0007b<onCallBack> bVar, b.C0007b<getAlias> bVar2, b.C0007b<font.Cdefault> bVar3, b.C0007b<PackageQueryPoint> bVar4, b.C0007b<DialogLayout> bVar5, b.C0007b<b.AnonymousClass3> bVar6, b.C0007b<BackKeyDownPoint> bVar7, b.C0007b<getAppLaunchParams> bVar8) {
            this.configEntityDataFactoryProvider = bVar;
            this.userInfoEntityDataFactoryProvider = bVar2;
            this.faceAuthSuggestionDataFactoryProvider = bVar3;
            this.userInfoMapperProvider = bVar4;
            this.accountEntityDataFactoryProvider = bVar5;
            this.loginEntityDataFactoryProvider = bVar6;
            this.securityGuardFacadeProvider = bVar7;
            this.errorConfigFactoryProvider = bVar8;
        }

        public final resolveDrawable get() {
            return newInstance(this.configEntityDataFactoryProvider.get(), this.userInfoEntityDataFactoryProvider.get(), this.faceAuthSuggestionDataFactoryProvider.get(), this.userInfoMapperProvider.get(), this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.securityGuardFacadeProvider.get(), this.errorConfigFactoryProvider.get());
        }

        public static Cdefault create(b.C0007b<onCallBack> bVar, b.C0007b<getAlias> bVar2, b.C0007b<font.Cdefault> bVar3, b.C0007b<PackageQueryPoint> bVar4, b.C0007b<DialogLayout> bVar5, b.C0007b<b.AnonymousClass3> bVar6, b.C0007b<BackKeyDownPoint> bVar7, b.C0007b<getAppLaunchParams> bVar8) {
            return new Cdefault(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
        }

        public static resolveDrawable newInstance(onCallBack oncallback, getAlias getalias, font.Cdefault defaultR, PackageQueryPoint packageQueryPoint, DialogLayout dialogLayout, b.AnonymousClass3 r15, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams) {
            return new resolveDrawable(oncallback, getalias, defaultR, packageQueryPoint, dialogLayout, r15, backKeyDownPoint, getapplaunchparams);
        }
    }
}
