package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000fB\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/domain/recentrecipient/interactor/MaskingRecentRecipient;", "Lid/dana/domain/UseCase;", "", "Lid/dana/domain/recentrecipient/model/RecentRecipient;", "Lid/dana/domain/recentrecipient/interactor/MaskingRecentRecipient$Params;", "recentRecipientRepository", "Lid/dana/domain/recentrecipient/repository/RecentRecipientRepository;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "(Lid/dana/domain/recentrecipient/repository/RecentRecipientRepository;Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class transitToError extends parseFailed<List<getMonitorToken>, setMax> {
    /* access modifiers changed from: private */
    public final GriverWhiteScreenStageMonitor recentRecipientRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/recentrecipient/model/RecentRecipient;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<getMonitorToken, TitleBarRightButtonView.AnonymousClass4<? extends getMonitorToken>> {
        final /* synthetic */ transitToError setMax;

        getMin(transitToError transittoerror) {
            this.setMax = transittoerror;
        }

        public final /* synthetic */ Object apply(Object obj) {
            getMonitorToken getmonitortoken = (getMonitorToken) obj;
            Intrinsics.checkNotNullParameter(getmonitortoken, "it");
            return this.setMax.recentRecipientRepository.convertCardIndexNo(getmonitortoken);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public transitToError(@NotNull GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor, @NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(griverWhiteScreenStageMonitor, "recentRecipientRepository");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        this.recentRecipientRepository = griverWhiteScreenStageMonitor;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<getMonitorToken>> buildUseCaseObservable(@Nullable setMax setmax) {
        TitleBarRightButtonView.AnonymousClass1<List<getMonitorToken>> r2;
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 list = TitleBarRightButtonView.AnonymousClass1.fromIterable(setmax != null ? setmax.getRecentRecipients() : null).flatMap(new getMin(this)).toList();
        if (list instanceof getSecondFloorView) {
            r2 = ((getSecondFloorView) list).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(list);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r2 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        Intrinsics.checkNotNullExpressionValue(r2, "Observable.fromIterable(…          .toObservable()");
        return r2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lid/dana/domain/recentrecipient/interactor/MaskingRecentRecipient$Params;", "", "recentRecipients", "", "Lid/dana/domain/recentrecipient/model/RecentRecipient;", "(Ljava/util/List;)V", "getRecentRecipients", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @NotNull
        private final List<getMonitorToken> recentRecipients;

        public static /* synthetic */ setMax copy$default(setMax setmax, List<getMonitorToken> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = setmax.recentRecipients;
            }
            return setmax.copy(list);
        }

        @NotNull
        public final List<getMonitorToken> component1() {
            return this.recentRecipients;
        }

        @NotNull
        public final setMax copy(@NotNull List<? extends getMonitorToken> list) {
            Intrinsics.checkNotNullParameter(list, "recentRecipients");
            return new setMax(list);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof setMax) && Intrinsics.areEqual((Object) this.recentRecipients, (Object) ((setMax) obj).recentRecipients);
            }
            return true;
        }

        public final int hashCode() {
            List<getMonitorToken> list = this.recentRecipients;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(recentRecipients=");
            sb.append(this.recentRecipients);
            sb.append(")");
            return sb.toString();
        }

        public setMax(@NotNull List<? extends getMonitorToken> list) {
            Intrinsics.checkNotNullParameter(list, "recentRecipients");
            this.recentRecipients = list;
        }

        @NotNull
        public final List<getMonitorToken> getRecentRecipients() {
            return this.recentRecipients;
        }
    }
}
