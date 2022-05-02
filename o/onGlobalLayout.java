package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\t\u001a\u00020\n*\u00020\u000b\u001a\n\u0010\f\u001a\u00020\r*\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0011¨\u0006\u0012"}, d2 = {"toAuthenticationTypeOption", "Lid/dana/domain/autoroute/model/AuthenticationTypeOption;", "Lid/dana/data/autoroute/model/AuthenticationTypeOptionResult;", "toAutoRouteInit", "Lid/dana/domain/autoroute/model/AutoRouteInit;", "Lid/dana/data/autoroute/model/AutoRouteInitResult;", "toRisk", "Lid/dana/domain/autoroute/model/Risk;", "Lid/dana/data/autoroute/model/RiskResult;", "toSecurityContext", "Lid/dana/domain/autoroute/model/SecurityContext;", "Lid/dana/data/autoroute/model/SecurityContextResult;", "toUserAutoRouteConfigRequest", "Lid/dana/data/autoroute/model/UserAutoRouteConfigStoreRequest;", "Lid/dana/domain/autoroute/model/UserAutoRouteConfigStore;", "toUserAutoRouteSwitch", "Lid/dana/domain/autoroute/model/UserAutoRouteConfigSwitch;", "Lid/dana/data/autoroute/model/UserAutoRouteConfigSwitchResult;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class onGlobalLayout {
    @NotNull
    public static final GriverButtonStyleExtension toAutoRouteInit(@NotNull setGravityStartCompat setgravitystartcompat) {
        List list;
        Intrinsics.checkNotNullParameter(setgravitystartcompat, "$this$toAutoRouteInit");
        Boolean autorouteFeatureEnable = setgravitystartcompat.getAutorouteFeatureEnable();
        Boolean autorouteConfigEnable = setgravitystartcompat.getAutorouteConfigEnable();
        String authenticationType = setgravitystartcompat.getAuthenticationType();
        List<setLastWidth> authenticationSettingOptions = setgravitystartcompat.getAuthenticationSettingOptions();
        if (authenticationSettingOptions != null) {
            Iterable<setLastWidth> iterable = authenticationSettingOptions;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (setLastWidth authenticationTypeOption : iterable) {
                arrayList.add(toAuthenticationTypeOption(authenticationTypeOption));
            }
            list = CollectionsKt.toMutableList((List) arrayList);
        } else {
            list = null;
        }
        return new GriverButtonStyleExtension(autorouteFeatureEnable, autorouteConfigEnable, authenticationType, list, setgravitystartcompat.getAutorouteAssetExist());
    }

    @NotNull
    public static final GriverCloseButtonStyleExtension toAuthenticationTypeOption(@NotNull setLastWidth setlastwidth) {
        Intrinsics.checkNotNullParameter(setlastwidth, "$this$toAuthenticationTypeOption");
        return new GriverCloseButtonStyleExtension(setlastwidth.getAuthenticationType());
    }

    @NotNull
    public static final GriverBackHomeButtonStyleExtension toRisk(@NotNull setGravityEndCompat setgravityendcompat) {
        Intrinsics.checkNotNullParameter(setgravityendcompat, "$this$toRisk");
        return new GriverBackHomeButtonStyleExtension(setgravityendcompat.getResult(), setgravityendcompat.getVerificationMethod(), setgravityendcompat.getSecurityId());
    }

    @NotNull
    public static final onGeolocationPermissionsShowPrompt toSecurityContext(@NotNull getLastWidth getlastwidth) {
        Intrinsics.checkNotNullParameter(getlastwidth, "$this$toSecurityContext");
        return new onGeolocationPermissionsShowPrompt(getlastwidth.getPubKey());
    }

    @NotNull
    public static final GriverGeoLocationExtension toUserAutoRouteSwitch(@NotNull setIgnoreDisabledSystemAnimations setignoredisabledsystemanimations) {
        Intrinsics.checkNotNullParameter(setignoredisabledsystemanimations, "$this$toUserAutoRouteSwitch");
        setGravityEndCompat riskResult = setignoredisabledsystemanimations.getRiskResult();
        onGeolocationPermissionsShowPrompt ongeolocationpermissionsshowprompt = null;
        GriverBackHomeButtonStyleExtension risk = riskResult != null ? toRisk(riskResult) : null;
        getLastWidth securityContext = setignoredisabledsystemanimations.getSecurityContext();
        if (securityContext != null) {
            ongeolocationpermissionsshowprompt = toSecurityContext(securityContext);
        }
        return new GriverGeoLocationExtension(risk, ongeolocationpermissionsshowprompt);
    }

    @NotNull
    public static final isNotVisible toUserAutoRouteConfigRequest(@NotNull GriverTitleBarCreatedEvent griverTitleBarCreatedEvent) {
        Intrinsics.checkNotNullParameter(griverTitleBarCreatedEvent, "$this$toUserAutoRouteConfigRequest");
        return new isNotVisible(griverTitleBarCreatedEvent.getAutoroute(), griverTitleBarCreatedEvent.getAuthenticationType(), griverTitleBarCreatedEvent.getSecurityId(), griverTitleBarCreatedEvent.getValidateData());
    }
}
