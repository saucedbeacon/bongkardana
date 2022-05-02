package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0002\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/social/interactor/GetSocialFeatureConfig;", "Lid/dana/domain/UseCase;", "", "", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "socialWidgetRepository", "Lid/dana/domain/social/SocialWidgetRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/social/SocialWidgetRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "void", "(Lkotlin/Unit;)Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class updateMonitoringStatusTime extends parseFailed<Boolean, Unit> {
    private final getException socialWidgetRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/domain/social/model/FeedHomeConfig;", "apply", "(Lid/dana/domain/social/model/FeedHomeConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<getMonitoringStatus, Boolean> {
        public static final length setMax = new length();

        length() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getMonitoringStatus getmonitoringstatus = (getMonitoringStatus) obj;
            Intrinsics.checkNotNullParameter(getmonitoringstatus, "it");
            return Boolean.valueOf(getmonitoringstatus.isFeedEnabled());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public updateMonitoringStatusTime(@Nullable appxLoadFailed appxloadfailed, @Nullable getScheme getscheme, @NotNull getException getexception) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(getexception, "socialWidgetRepository");
        this.socialWidgetRepository = getexception;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(@Nullable Unit unit) {
        TitleBarRightButtonView.AnonymousClass1<R> map = this.socialWidgetRepository.getFeedHomeConfig().map(length.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "socialWidgetRepository.g….map { it.isFeedEnabled }");
        return map;
    }
}
