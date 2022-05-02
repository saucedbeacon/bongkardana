package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/autoroute/interactor/GetAutoRouteInitialSetting;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/autoroute/model/AutoRouteInit;", "", "autoRouteRepository", "Lid/dana/domain/autoroute/repository/AutoRouteRepository;", "(Lid/dana/domain/autoroute/repository/AutoRouteRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "(Lkotlin/Unit;)Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setToolbarMenu extends APWebChromeClient<GriverButtonStyleExtension, Unit> {
    /* access modifiers changed from: private */
    public final onGeolocationPermissionsHidePrompt autoRouteRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/autoroute/model/AutoRouteInit;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T> implements RedDotManager<GriverButtonStyleExtension> {
        final /* synthetic */ setToolbarMenu setMax;

        setMax(setToolbarMenu settoolbarmenu) {
            this.setMax = settoolbarmenu;
        }

        public final /* synthetic */ void accept(Object obj) {
            onGeolocationPermissionsHidePrompt access$getAutoRouteRepository$p = this.setMax.autoRouteRepository;
            Boolean autorouteAssetExist = ((GriverButtonStyleExtension) obj).getAutorouteAssetExist();
            access$getAutoRouteRepository$p.saveAutoRouteAssetState(autorouteAssetExist != null ? autorouteAssetExist.booleanValue() : false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setToolbarMenu(@NotNull onGeolocationPermissionsHidePrompt ongeolocationpermissionshideprompt) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(ongeolocationpermissionshideprompt, "autoRouteRepository");
        this.autoRouteRepository = ongeolocationpermissionshideprompt;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<GriverButtonStyleExtension> buildUseCase(@NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "params");
        TitleBarRightButtonView.AnonymousClass1<GriverButtonStyleExtension> doOnNext = this.autoRouteRepository.getInitialSetting(true).doOnNext(new setMax(this));
        Intrinsics.checkNotNullExpressionValue(doOnNext, "autoRouteRepository.getI…uteAssetExist ?: false) }");
        return doOnNext;
    }
}
