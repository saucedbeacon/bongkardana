package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.APExpansion;
import o.RunningAverageRssiFilter;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/social/interactor/AddActivityComment;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/social/model/AddActivityCommentInfo;", "Lid/dana/domain/social/interactor/AddActivityComment$Params;", "socialMediaRepository", "Lid/dana/domain/social/SocialMediaRepository;", "(Lid/dana/domain/social/SocialMediaRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class ModelSpecificDistanceUpdater extends APWebChromeClient<RunningAverageRssiFilter.AnonymousClass1, length> {
    private final DistanceConfigFetcher socialMediaRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\u0005¢\u0006\u0002\u0010\u0005J:\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u00002%\u0010\u000f\u001a!\u0012\u0017\u0012\u00150\u0011j\u0002`\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\u0010\u0016R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078T@TX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lid/dana/domain/social/core/CompletableUseCase;", "T", "", "Lid/dana/domain/social/core/BaseUseCase;", "", "()V", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "onErrorDispatcher", "getOnErrorDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "setOnErrorDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "params", "onError", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/ParameterName;", "name", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "domain_release"}, k = 1, mv = {1, 4, 2})
    public abstract class CompletionHandler<T> extends ModelSpecificDistanceCalculator<T, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "", "it", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 4, 2})
        static final class setMax extends Lambda implements Function1<Unit, Unit> {
            public static final setMax INSTANCE = new setMax();

            setMax() {
                super(1);
            }

            public final void invoke(@NotNull Unit unit) {
                Intrinsics.checkNotNullParameter(unit, "it");
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Unit) obj);
                return Unit.INSTANCE;
            }
        }

        public CompletionHandler() {
            super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: protected */
        @NotNull
        public APExpansion.AnonymousClass1 getOnErrorDispatcher() {
            return DeviceTokenClient.setMax();
        }

        /* access modifiers changed from: protected */
        public void setOnErrorDispatcher(@NotNull APExpansion.AnonymousClass1 r2) {
            Intrinsics.checkNotNullParameter(r2, "dispatcher");
            setOnErrorDispatcher(r2);
        }

        public final void execute(@NotNull T t, @NotNull Function1<? super Exception, Unit> function1) {
            Intrinsics.checkNotNullParameter(t, "params");
            Intrinsics.checkNotNullParameter(function1, "onError");
            invoke(t, setMax.INSTANCE, function1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ModelSpecificDistanceUpdater(@NotNull DistanceConfigFetcher distanceConfigFetcher) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(distanceConfigFetcher, "socialMediaRepository");
        this.socialMediaRepository = distanceConfigFetcher;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<RunningAverageRssiFilter.AnonymousClass1> buildUseCase(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "params");
        return this.socialMediaRepository.addActivityComment(length2.getUserId(), length2.getActivityId(), length2.getContent());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/domain/social/interactor/AddActivityComment$Params;", "", "userId", "", "activityId", "content", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getContent", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @NotNull
        private final String activityId;
        @NotNull
        private final String content;
        @NotNull
        private final String userId;

        public static /* synthetic */ length copy$default(length length, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = length.userId;
            }
            if ((i & 2) != 0) {
                str2 = length.activityId;
            }
            if ((i & 4) != 0) {
                str3 = length.content;
            }
            return length.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.userId;
        }

        @NotNull
        public final String component2() {
            return this.activityId;
        }

        @NotNull
        public final String component3() {
            return this.content;
        }

        @NotNull
        public final length copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "userId");
            Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            Intrinsics.checkNotNullParameter(str3, "content");
            return new length(str, str2, str3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof length)) {
                return false;
            }
            length length = (length) obj;
            return Intrinsics.areEqual((Object) this.userId, (Object) length.userId) && Intrinsics.areEqual((Object) this.activityId, (Object) length.activityId) && Intrinsics.areEqual((Object) this.content, (Object) length.content);
        }

        public final int hashCode() {
            String str = this.userId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.activityId;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.content;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(userId=");
            sb.append(this.userId);
            sb.append(", activityId=");
            sb.append(this.activityId);
            sb.append(", content=");
            sb.append(this.content);
            sb.append(")");
            return sb.toString();
        }

        public length(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "userId");
            Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            Intrinsics.checkNotNullParameter(str3, "content");
            this.userId = str;
            this.activityId = str2;
            this.content = str3;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getActivityId() {
            return this.activityId;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }
    }
}
