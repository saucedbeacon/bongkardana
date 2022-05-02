package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/domain/profilecompletion/interactor/GetProfileCompletionVisibility;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/profilecompletion/model/ProfileCompletionVisibility;", "Lid/dana/domain/core/usecase/NoParams;", "featureConfigEntityRepo", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "(Lid/dana/domain/featureconfig/FeatureConfigRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class H5ResourceCORSUtil extends APWebChromeClient<H5MemData, onReceivedIcon> {
    private final setDefaultFontSize featureConfigEntityRepo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lid/dana/domain/profilecompletion/model/ProfileCompletionVisibility;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Boolean;)Lid/dana/domain/profilecompletion/model/ProfileCompletionVisibility;"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<Boolean, H5MemData> {
        public static final setMin getMin = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            Intrinsics.checkNotNullParameter(bool, "it");
            return new H5MemData(bool.booleanValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public H5ResourceCORSUtil(@NotNull setDefaultFontSize setdefaultfontsize) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setdefaultfontsize, "featureConfigEntityRepo");
        this.featureConfigEntityRepo = setdefaultfontsize;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<H5MemData> buildUseCase(@NotNull onReceivedIcon onreceivedicon) {
        Intrinsics.checkNotNullParameter(onreceivedicon, "params");
        TitleBarRightButtonView.AnonymousClass1<R> map = this.featureConfigEntityRepo.isProfileCompletionWidgetEnable().map(setMin.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "featureConfigEntityRepo.…nVisibility(it)\n        }");
        return map;
    }
}
