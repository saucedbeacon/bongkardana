package o;

import id.dana.contract.deeplink.path.FeatureParams;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NullBeaconDataFactory;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/domain/exploredana/interactor/GetCategoryExploreDana;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "Lid/dana/domain/core/usecase/NoParams;", "featureConfigRepository", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "servicesRepository", "Lid/dana/domain/services/ServicesRepository;", "(Lid/dana/domain/featureconfig/FeatureConfigRepository;Lid/dana/domain/services/ServicesRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setStandardFontFamily extends APWebChromeClient<List<? extends NullBeaconDataFactory.AnonymousClass1>, onReceivedIcon> {
    private final setDefaultFontSize featureConfigRepository;
    /* access modifiers changed from: private */
    public final toUuidString servicesRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012(\u0010\u0005\u001a$\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004*\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u00070\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "kotlin.jvm.PlatformType", "service", "", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<List<String>, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends NullBeaconDataFactory.AnonymousClass1>>> {
        final /* synthetic */ setStandardFontFamily setMin;

        length(setStandardFontFamily setstandardfontfamily) {
            this.setMin = setstandardfontfamily;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, FeatureParams.OPEN_SERVICE);
            return this.setMin.servicesRepository.getExploreServices(list);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setStandardFontFamily(@NotNull setDefaultFontSize setdefaultfontsize, @NotNull toUuidString touuidstring) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setdefaultfontsize, "featureConfigRepository");
        Intrinsics.checkNotNullParameter(touuidstring, "servicesRepository");
        this.featureConfigRepository = setdefaultfontsize;
        this.servicesRepository = touuidstring;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<NullBeaconDataFactory.AnonymousClass1>> buildUseCase(@NotNull onReceivedIcon onreceivedicon) {
        Intrinsics.checkNotNullParameter(onreceivedicon, "params");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.featureConfigRepository.getCategoryExplore().flatMap(new length(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "featureConfigRepository.…rvices(service)\n        }");
        return flatMap;
    }
}
