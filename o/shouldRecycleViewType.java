package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.social.model.RelationshipItemModel;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.setOnBackListener;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\b\t*\u0001\u0015\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\r\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u000f*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lid/dana/social/presenter/MutedFragmentPresenter;", "Lid/dana/social/contract/MutedFragmentContract$Presenter;", "view", "Lid/dana/social/contract/MutedFragmentContract$View;", "getMutedFollowing", "Lid/dana/domain/social/interactor/GetMutedFollowing;", "modifyFollowingRelationship", "Lid/dana/domain/social/interactor/ModifyFollowingRelationship;", "startFollowingFullSync", "Lid/dana/domain/social/interactor/StartFollowingFullSync;", "(Lid/dana/social/contract/MutedFragmentContract$View;Lid/dana/domain/social/interactor/GetMutedFollowing;Lid/dana/domain/social/interactor/ModifyFollowingRelationship;Lid/dana/domain/social/interactor/StartFollowingFullSync;)V", "mutedFollowingPublishSubject", "Lio/reactivex/subjects/PublishSubject;", "", "Lid/dana/social/model/RelationshipItemModel;", "kotlin.jvm.PlatformType", "getView", "()Lid/dana/social/contract/MutedFragmentContract$View;", "getMutedFollowingList", "", "getMutedFollowingObserver", "id/dana/social/presenter/MutedFragmentPresenter$getMutedFollowingObserver$1", "()Lid/dana/social/presenter/MutedFragmentPresenter$getMutedFollowingObserver$1;", "observeMutedFollowingData", "onDestroy", "startFetchingFollowing", "unmuteFollowing", "relationshipItemModel", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class shouldRecycleViewType implements setOnBackListener.setMax {
    @NotNull
    public static final setMin length = new setMin((byte) 0);
    private final recordDetection getMax;
    private final setSampleExpirationMilliseconds getMin;
    /* access modifiers changed from: private */
    public final IComponent<List<RelationshipItemModel>> setMax;
    @NotNull
    final setOnBackListener.length setMin;
    private final markOutside toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ shouldRecycleViewType this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(shouldRecycleViewType shouldrecycleviewtype) {
            super(1);
            this.this$0 = shouldrecycleviewtype;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMin.getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Exception, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, exc.getMessage(), exc);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ RelationshipItemModel $relationshipItemModel;
        final /* synthetic */ shouldRecycleViewType this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(shouldRecycleViewType shouldrecycleviewtype, RelationshipItemModel relationshipItemModel) {
            super(1);
            this.this$0 = shouldrecycleviewtype;
            this.$relationshipItemModel = relationshipItemModel;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMin.setMax(this.$relationshipItemModel);
        }
    }

    @Inject
    public shouldRecycleViewType(@NotNull setOnBackListener.length length2, @NotNull recordDetection recorddetection, @NotNull setSampleExpirationMilliseconds setsampleexpirationmilliseconds, @NotNull markOutside markoutside) {
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(recorddetection, "getMutedFollowing");
        Intrinsics.checkNotNullParameter(setsampleexpirationmilliseconds, "modifyFollowingRelationship");
        Intrinsics.checkNotNullParameter(markoutside, "startFollowingFullSync");
        this.setMin = length2;
        this.getMax = recorddetection;
        this.getMin = setsampleexpirationmilliseconds;
        this.toIntRange = markoutside;
        IComponent<List<RelationshipItemModel>> max = IComponent.setMax();
        Intrinsics.checkNotNullExpressionValue(max, "PublishSubject.create<Li…RelationshipItemModel>>()");
        this.setMax = max;
        max.observeOn(hideProgress.length()).subscribeOn(hideProgress.length()).throttleLatest(1000, TimeUnit.MILLISECONDS).subscribe(new length(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"id/dana/social/presenter/MutedFragmentPresenter$getMutedFollowingObserver$1", "Lid/dana/domain/DefaultObserver;", "", "Lid/dana/social/model/RelationshipItemModel;", "onNext", "", "mutedFollowing", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends GriverAppVirtualHostProxy<List<? extends RelationshipItemModel>> {
        final /* synthetic */ shouldRecycleViewType getMin;

        length(shouldRecycleViewType shouldrecycleviewtype) {
            this.getMin = shouldrecycleviewtype;
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "mutedFollowing");
            this.getMin.setMin.setMin(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/MutedFragmentPresenter$getMutedFollowingList$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/Following;", "onError", "", "e", "", "onNext", "result", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<ScanHelper> {
        final /* synthetic */ shouldRecycleViewType setMin;

        getMax(shouldRecycleViewType shouldrecycleviewtype) {
            this.setMin = shouldrecycleviewtype;
        }

        public final /* synthetic */ void onNext(Object obj) {
            ScanHelper scanHelper = (ScanHelper) obj;
            Intrinsics.checkNotNullParameter(scanHelper, "result");
            this.setMin.setMax.onNext(setSelectionFromOffset.setMax(scanHelper.getFollowingItemList()));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.setMin.setMin.length();
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, sb.toString(), th);
        }
    }

    public final void getMax() {
        this.getMax.execute(new getMax(this));
    }

    public final void length(@NotNull RelationshipItemModel relationshipItemModel) {
        Intrinsics.checkNotNullParameter(relationshipItemModel, "relationshipItemModel");
        this.getMin.execute(MapsKt.mapOf(new Pair(relationshipItemModel.length, ModifyRelationOperationType.UNMUTE)), new setMax(this, relationshipItemModel), new equals(this));
    }

    public final void length() {
        this.toIntRange.execute(Unit.INSTANCE, getMin.INSTANCE);
    }

    public final void setMax() {
        this.getMax.dispose();
        this.getMin.dispose();
        this.toIntRange.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/social/presenter/MutedFragmentPresenter$Companion;", "", "()V", "DEFAULT_THROTTLE_TIME", "", "ON_ERROR", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
