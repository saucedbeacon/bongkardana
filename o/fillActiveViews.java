package o;

import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.social.model.RelationshipItemModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.GriverProgressBar;
import o.getLeftButton;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\r\u0018\u0000 B2\u00020\u0001:\u0001BB_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002J\u0016\u0010+\u001a\u00020)2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016J\b\u0010-\u001a\u00020)H\u0002J\b\u0010\f\u001a\u00020)H\u0016J\b\u0010\u000e\u001a\u00020)H\u0016J\u0014\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0/H\u0002J\b\u00100\u001a\u00020)H\u0002J\b\u00101\u001a\u00020)H\u0002J<\u00102\u001a\u00020)2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\u001e\u00104\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0605H\u0002J\b\u00107\u001a\u00020)H\u0002J\b\u00108\u001a\u00020)H\u0002J\b\u00109\u001a\u00020)H\u0002J\b\u0010:\u001a\u00020)H\u0002J\b\u0010;\u001a\u00020)H\u0016J\u0018\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u001cH\u0016J\u0018\u0010?\u001a\u00020)2\u0006\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u001cH\u0016J\b\u0010@\u001a\u00020)H\u0016J\b\u0010A\u001a\u00020)H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u000e¢\u0006\u0002\n\u0000R(\u0010%\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$ !*\n\u0012\u0004\u0012\u00020$\u0018\u00010#0#0\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lid/dana/social/presenter/FriendshipPresenter;", "Lid/dana/social/contract/FriendshipContract$Presenter;", "view", "Lid/dana/social/contract/FriendshipContract$View;", "observeFollowerFullSyncStatus", "Lid/dana/domain/social/interactor/ObserveFollowerFullSyncStatus;", "startFollowerFullSync", "Lid/dana/domain/social/interactor/StartFollowerFullSync;", "observeFollowingFullSyncStatus", "Lid/dana/domain/social/interactor/ObserveFollowingFullSyncStatus;", "startFollowingFullSync", "Lid/dana/domain/social/interactor/StartFollowingFullSync;", "getActiveFollower", "Lid/dana/domain/social/interactor/GetActiveFollower;", "getActiveFollowing", "Lid/dana/domain/social/interactor/GetActiveFollowing;", "modifyFollowerRelationship", "Lid/dana/domain/social/interactor/ModifyFollowerRelationship;", "modifyFollowingRelationship", "Lid/dana/domain/social/interactor/ModifyFollowingRelationship;", "modifyFollowingRelationshipWithPublishResult", "Lid/dana/domain/social/interactor/ModifyFollowingRelationshipWithPublishResult;", "modifyFollowerRelationshipWithPublishResult", "Lid/dana/domain/social/interactor/ModifyFollowerRelationshipWithPublishResult;", "(Lid/dana/social/contract/FriendshipContract$View;Lid/dana/domain/social/interactor/ObserveFollowerFullSyncStatus;Lid/dana/domain/social/interactor/StartFollowerFullSync;Lid/dana/domain/social/interactor/ObserveFollowingFullSyncStatus;Lid/dana/domain/social/interactor/StartFollowingFullSync;Lid/dana/domain/social/interactor/GetActiveFollower;Lid/dana/domain/social/interactor/GetActiveFollowing;Lid/dana/domain/social/interactor/ModifyFollowerRelationship;Lid/dana/domain/social/interactor/ModifyFollowingRelationship;Lid/dana/domain/social/interactor/ModifyFollowingRelationshipWithPublishResult;Lid/dana/domain/social/interactor/ModifyFollowerRelationshipWithPublishResult;)V", "modifyFollowerRelationshipMap", "", "", "Lid/dana/domain/social/ModifyRelationOperationType;", "modifyFollowingRelationshipMap", "modifyRelationshipSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "originalRelationshipList", "", "Lid/dana/social/model/RelationshipItemModel;", "relationshipListPublishSubject", "searchDisposable", "Lio/reactivex/disposables/Disposable;", "callModifyFollowerRelationship", "", "callModifyFollowingRelationship", "createDebouncerForSearch", "searchViewPublishSubject", "disposeLateinitDisposable", "getRelationshipListObserver", "Lid/dana/domain/DefaultObserver;", "modifyFollowersOnDestroy", "modifyFollowingOnDestroy", "modifyRelationship", "originalModifyRelationshipData", "modifyStatusInteractor", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "modifyRelationshipOnDestroyWithPublish", "modifyRelationshipStatus", "observeModifyRelationship", "observeNewRelationshipData", "onDestroy", "registerFollowerRelationshipAction", "userId", "status", "registerFollowingRelationshipAction", "startFetchingFollower", "startFetchingFollowing", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class fillActiveViews implements getLeftButton.getMin {
    @NotNull
    public static final getMax getMin = new getMax((byte) 0);
    private final setVerboseLoggingEnabled FastBitmap$CoordinateSystem;
    private final finalizeBeacons Grayscale$Algorithm;
    private final getTrackingAge IsOverlapping;
    private final addLocalRegion Mean$Arithmetic;
    private final addBeacon equals;
    private final Map<String, ModifyRelationOperationType> getMax = new LinkedHashMap();
    private final commitMeasurements hashCode;
    /* access modifiers changed from: private */
    public final getLeftButton.setMax isInside;
    private GriverProgressBar.UpdateRunnable length;
    /* access modifiers changed from: private */
    public List<RelationshipItemModel> setMax = CollectionsKt.emptyList();
    private final Map<String, ModifyRelationOperationType> setMin = new LinkedHashMap();
    private final isVerboseLoggingEnabled toDoubleRange;
    private final IComponent<Boolean> toFloatRange;
    /* access modifiers changed from: private */
    public final IComponent<List<RelationshipItemModel>> toIntRange;
    private final getUseTrackingCache toString;
    private final setSampleExpirationMilliseconds valueOf;
    private final markOutside values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "e", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Throwable, Unit> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Boolean, Unit> {
        public static final equals INSTANCE = new equals();

        equals() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "e", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class hashCode extends Lambda implements Function1<Exception, Unit> {
        public static final hashCode INSTANCE = new hashCode();

        hashCode() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(exc.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lid/dana/domain/social/model/Follower;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<getCycledScanner, Unit> {
        final /* synthetic */ fillActiveViews this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(fillActiveViews fillactiveviews) {
            super(1);
            this.this$0 = fillactiveviews;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getCycledScanner) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getCycledScanner getcycledscanner) {
            Intrinsics.checkNotNullParameter(getcycledscanner, "result");
            this.this$0.setMax = setSelectionFromOffset.setMax(getcycledscanner.getFollowerItemList());
            this.this$0.toIntRange.onNext(this.this$0.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "keyword", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T> implements RedDotManager<String> {
        final /* synthetic */ fillActiveViews length;

        setMax(fillActiveViews fillactiveviews) {
            this.length = fillactiveviews;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            if (!this.length.setMax.isEmpty()) {
                Intrinsics.checkNotNullExpressionValue(str, FeatureParams.KEYWORD);
                if (str != null) {
                    CharSequence charSequence = str;
                    if (StringsKt.contains$default((CharSequence) StringsKt.trim(charSequence).toString(), (CharSequence) "*", false, 2, (Object) null)) {
                        return;
                    }
                    if (Intrinsics.areEqual((Object) StringsKt.trim(charSequence).toString(), (Object) "")) {
                        this.length.isInside.setMin(this.length.setMax);
                        return;
                    }
                    getLeftButton.setMax length2 = this.length.isInside;
                    Collection arrayList = new ArrayList();
                    for (Object next : this.length.setMax) {
                        if (StringsKt.contains((CharSequence) ((RelationshipItemModel) next).getMin, charSequence, true)) {
                            arrayList.add(next);
                        }
                    }
                    length2.setMin((List) arrayList);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lid/dana/domain/social/model/Following;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<ScanHelper, Unit> {
        final /* synthetic */ fillActiveViews this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(fillActiveViews fillactiveviews) {
            super(1);
            this.this$0 = fillactiveviews;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ScanHelper) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull ScanHelper scanHelper) {
            Intrinsics.checkNotNullParameter(scanHelper, "result");
            this.this$0.setMax = setSelectionFromOffset.setMax(scanHelper.getFollowingItemList());
            this.this$0.toIntRange.onNext(this.this$0.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function1<Exception, Unit> {
        public static final toDoubleRange INSTANCE = new toDoubleRange();

        toDoubleRange() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(exc.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Throwable, Unit> {
        public static final toIntRange INSTANCE = new toIntRange();

        toIntRange() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, String.valueOf(th.getCause()));
        }
    }

    @Inject
    public fillActiveViews(@NotNull getLeftButton.setMax setmax, @NotNull addBeacon addbeacon, @NotNull getTrackingAge gettrackingage, @NotNull commitMeasurements commitmeasurements, @NotNull markOutside markoutside, @NotNull setVerboseLoggingEnabled setverboseloggingenabled, @NotNull isVerboseLoggingEnabled isverboseloggingenabled, @NotNull getUseTrackingCache getusetrackingcache, @NotNull setSampleExpirationMilliseconds setsampleexpirationmilliseconds, @NotNull finalizeBeacons finalizebeacons, @NotNull addLocalRegion addlocalregion) {
        Intrinsics.checkNotNullParameter(setmax, "view");
        Intrinsics.checkNotNullParameter(addbeacon, "observeFollowerFullSyncStatus");
        Intrinsics.checkNotNullParameter(gettrackingage, "startFollowerFullSync");
        Intrinsics.checkNotNullParameter(commitmeasurements, "observeFollowingFullSyncStatus");
        Intrinsics.checkNotNullParameter(markoutside, "startFollowingFullSync");
        Intrinsics.checkNotNullParameter(setverboseloggingenabled, "getActiveFollower");
        Intrinsics.checkNotNullParameter(isverboseloggingenabled, "getActiveFollowing");
        Intrinsics.checkNotNullParameter(getusetrackingcache, "modifyFollowerRelationship");
        Intrinsics.checkNotNullParameter(setsampleexpirationmilliseconds, "modifyFollowingRelationship");
        Intrinsics.checkNotNullParameter(finalizebeacons, "modifyFollowingRelationshipWithPublishResult");
        Intrinsics.checkNotNullParameter(addlocalregion, "modifyFollowerRelationshipWithPublishResult");
        this.isInside = setmax;
        this.equals = addbeacon;
        this.IsOverlapping = gettrackingage;
        this.hashCode = commitmeasurements;
        this.values = markoutside;
        this.FastBitmap$CoordinateSystem = setverboseloggingenabled;
        this.toDoubleRange = isverboseloggingenabled;
        this.toString = getusetrackingcache;
        this.valueOf = setsampleexpirationmilliseconds;
        this.Grayscale$Algorithm = finalizebeacons;
        this.Mean$Arithmetic = addlocalregion;
        IComponent<List<RelationshipItemModel>> max = IComponent.setMax();
        Intrinsics.checkNotNullExpressionValue(max, "PublishSubject.create<Li…RelationshipItemModel>>()");
        this.toIntRange = max;
        IComponent<Boolean> max2 = IComponent.setMax();
        Intrinsics.checkNotNullExpressionValue(max2, "PublishSubject.create<Boolean>()");
        this.toFloatRange = max2;
        max2.observeOn(hideProgress.length()).subscribeOn(getSecureSignatureComp.setMin()).debounce(800, TimeUnit.MILLISECONDS).subscribe(new isInside(this));
        this.toIntRange.observeOn(hideProgress.length()).subscribeOn(hideProgress.length()).throttleLatest(1000, TimeUnit.MILLISECONDS).subscribe(new toFloatRange(this));
    }

    public final void getMin() {
        this.toDoubleRange.execute(onReceivedIcon.INSTANCE, new setMin(this), IsOverlapping.INSTANCE);
    }

    public final void setMin() {
        this.values.execute(Unit.INSTANCE, hashCode.INSTANCE);
    }

    public final void setMin(@NotNull IComponent<String> iComponent) {
        Intrinsics.checkNotNullParameter(iComponent, "searchViewPublishSubject");
        GriverProgressBar.UpdateRunnable subscribe = iComponent.debounce(800, TimeUnit.MILLISECONDS).observeOn(hideProgress.length()).subscribeOn(getSecureSignatureComp.setMin()).subscribe(new setMax(this));
        Intrinsics.checkNotNullExpressionValue(subscribe, "searchViewPublishSubject…          }\n            }");
        this.length = subscribe;
    }

    public final void length() {
        this.IsOverlapping.execute(Unit.INSTANCE, toDoubleRange.INSTANCE);
    }

    public final void getMax() {
        this.FastBitmap$CoordinateSystem.execute(onReceivedIcon.INSTANCE, new length(this), getMin.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"id/dana/social/presenter/FriendshipPresenter$getRelationshipListObserver$1", "Lid/dana/domain/DefaultObserver;", "", "Lid/dana/social/model/RelationshipItemModel;", "onNext", "", "relationshipList", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange extends GriverAppVirtualHostProxy<List<? extends RelationshipItemModel>> {
        final /* synthetic */ fillActiveViews length;

        toFloatRange(fillActiveViews fillactiveviews) {
            this.length = fillactiveviews;
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "relationshipList");
            if (!list.isEmpty()) {
                this.length.isInside.setMax(list);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/presenter/FriendshipPresenter$observeModifyRelationship$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ fillActiveViews getMax;

        isInside(fillActiveViews fillactiveviews) {
            this.getMax = fillactiveviews;
        }

        public final /* synthetic */ void onNext(Object obj) {
            fillActiveViews.setMax(this.getMax);
        }
    }

    public final void setMax(@NotNull String str, @NotNull ModifyRelationOperationType modifyRelationOperationType) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(modifyRelationOperationType, "status");
        this.getMax.put(str, modifyRelationOperationType);
        this.toFloatRange.onNext(Boolean.TRUE);
    }

    public final void getMin(@NotNull String str, @NotNull ModifyRelationOperationType modifyRelationOperationType) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(modifyRelationOperationType, "status");
        this.setMin.put(str, modifyRelationOperationType);
        this.toFloatRange.onNext(Boolean.TRUE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/social/presenter/FriendshipPresenter$Companion;", "", "()V", "DEFAULT_MODIFY_RELATIONSHIP_DEBOUNCE_TIME", "", "DEFAULT_THROTTLE_RELATIONSHIP_LIST", "", "ON_ERROR", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final void setMax() {
        if (this.length != null) {
            GriverProgressBar.UpdateRunnable updateRunnable = this.length;
            if (updateRunnable == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchDisposable");
            }
            updateRunnable.dispose();
        }
        this.equals.dispose();
        this.hashCode.dispose();
        if (!this.getMax.isEmpty()) {
            Map<String, ModifyRelationOperationType> map = this.getMax;
            Map<String, ModifyRelationOperationType> map2 = MapsKt.toMap(map);
            map.clear();
            this.Mean$Arithmetic.execute(map2, equals.INSTANCE, toIntRange.INSTANCE);
        }
        if (!this.setMin.isEmpty()) {
            Map<String, ModifyRelationOperationType> map3 = this.setMin;
            Map<String, ModifyRelationOperationType> map4 = MapsKt.toMap(map3);
            map3.clear();
            this.Grayscale$Algorithm.execute(map4, equals.INSTANCE, toIntRange.INSTANCE);
        }
    }

    public static final /* synthetic */ void setMax(fillActiveViews fillactiveviews) {
        if (!fillactiveviews.getMax.isEmpty()) {
            Map<String, ModifyRelationOperationType> map = fillactiveviews.getMax;
            Map<String, ModifyRelationOperationType> map2 = MapsKt.toMap(map);
            map.clear();
            fillactiveviews.toString.execute(map2, equals.INSTANCE, toIntRange.INSTANCE);
        }
        if (!fillactiveviews.setMin.isEmpty()) {
            Map<String, ModifyRelationOperationType> map3 = fillactiveviews.setMin;
            Map<String, ModifyRelationOperationType> map4 = MapsKt.toMap(map3);
            map3.clear();
            fillactiveviews.valueOf.execute(map4, equals.INSTANCE, toIntRange.INSTANCE);
        }
    }
}
