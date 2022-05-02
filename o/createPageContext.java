package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BaseTabBar;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00152\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00152\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lid/dana/data/ipg/IpgEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/ipg/IpgRepository;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "guardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "userConfigEntityRepository", "Lid/dana/data/userconfig/repository/UserConfigEntityRepository;", "ipgRegistrationUrlEntityDataFactory", "Lid/dana/data/ipg/repository/source/IpgRegistrationUrlEntityDataFactory;", "ipgRegistrationUrlMapper", "Lid/dana/data/ipg/mapper/IpgRegistrationUrlMapper;", "(Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;Lid/dana/data/userconfig/repository/UserConfigEntityRepository;Lid/dana/data/ipg/repository/source/IpgRegistrationUrlEntityDataFactory;Lid/dana/data/ipg/mapper/IpgRegistrationUrlMapper;)V", "createIpgEntityData", "Lid/dana/data/ipg/repository/source/IpgRegistrationUrlEntityData;", "getIpgRegistrationUrl", "Lio/reactivex/Observable;", "Lid/dana/domain/ipg/IpgRegistrationUrl;", "deviceId", "", "bizType", "isClickedAgree", "", "userConsentConfigKey", "saveClickedAgree", "userConsentSyncKey", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class createPageContext extends setMinProgress implements setEnvironment {
    private final BaseTabBar ipgRegistrationUrlEntityDataFactory;
    /* access modifiers changed from: private */
    public final RVScreenOrientationProxy ipgRegistrationUrlMapper;
    private final getOrigin userConfigEntityRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "userConfig", "Lid/dana/data/ipg/model/UserConfigContentIPG;", "apply", "(Lid/dana/data/ipg/model/UserConfigContentIPG;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<onThemeChanged, Boolean> {
        public static final getMin setMax = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            onThemeChanged onthemechanged = (onThemeChanged) obj;
            Intrinsics.checkNotNullParameter(onthemechanged, "userConfig");
            return Boolean.valueOf(onthemechanged.getUserConsent());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/ipg/IpgRegistrationUrl;", "kotlin.jvm.PlatformType", "data", "Lid/dana/data/ipg/repository/source/network/response/IpgRegistrationUrlResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<BaseTabBar.TabBarManageExtension, setWorkSpaceId> {
        final /* synthetic */ createPageContext length;

        length(createPageContext createpagecontext) {
            this.length = createpagecontext;
        }

        public final /* synthetic */ Object apply(Object obj) {
            BaseTabBar.TabBarManageExtension tabBarManageExtension = (BaseTabBar.TabBarManageExtension) obj;
            Intrinsics.checkNotNullParameter(tabBarManageExtension, "data");
            return this.length.ipgRegistrationUrlMapper.transform(tabBarManageExtension);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public createPageContext(@NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r3, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams, @NotNull getOrigin getorigin, @NotNull BaseTabBar baseTabBar, @NotNull RVScreenOrientationProxy rVScreenOrientationProxy) {
        super(dialogLayout, r3, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(r3, "loginEntityDataFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "guardFacade");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        Intrinsics.checkNotNullParameter(getorigin, "userConfigEntityRepository");
        Intrinsics.checkNotNullParameter(baseTabBar, "ipgRegistrationUrlEntityDataFactory");
        Intrinsics.checkNotNullParameter(rVScreenOrientationProxy, "ipgRegistrationUrlMapper");
        this.userConfigEntityRepository = getorigin;
        this.ipgRegistrationUrlEntityDataFactory = baseTabBar;
        this.ipgRegistrationUrlMapper = rVScreenOrientationProxy;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isClickedAgree(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userConsentConfigKey");
        TitleBarRightButtonView.AnonymousClass1<Boolean> map = this.userConfigEntityRepository.getUserSpecificConfig(new onFirstScanTime(str, onThemeChanged.class)).map(getMin.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "userConfigEntityReposito…userConsent\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveClickedAgree(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "userConsentConfigKey");
        Intrinsics.checkNotNullParameter(str2, "userConsentSyncKey");
        onThemeChanged onthemechanged = new onThemeChanged(false, 1, (DefaultConstructorMarker) null);
        onthemechanged.setUserConsent(true);
        TitleBarRightButtonView.AnonymousClass1<Boolean> saveUserSpecificConfigBackendFirst = this.userConfigEntityRepository.saveUserSpecificConfigBackendFirst(new onConnectedSuccessful(str, str2, onthemechanged));
        Intrinsics.checkNotNullExpressionValue(saveUserSpecificConfigBackendFirst, "userConfigEntityReposito…y, userConfigContentIpg))");
        return saveUserSpecificConfigBackendFirst;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setWorkSpaceId> getIpgRegistrationUrl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, "bizType");
        TitleBarRightButtonView.AnonymousClass1<R> map = authenticatedRequest(createIpgEntityData().getIpgRegistrationUrl(str, str2)).map(new length(this));
        Intrinsics.checkNotNullExpressionValue(map, "authenticatedRequest<Ipg…sform(data)\n            }");
        return map;
    }

    private final isAlphaBackground createIpgEntityData() {
        return this.ipgRegistrationUrlEntityDataFactory.createData("network");
    }
}
