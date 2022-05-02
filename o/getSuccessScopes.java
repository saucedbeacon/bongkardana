package o;

import dagger.Lazy;
import id.dana.data.base.BasePersistenceDao;
import id.dana.data.social.repository.source.persistence.entity.RelationshipDataNotFoundException;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0016\u0010\u001f\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0!H\u0016J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001cH\u0016J\u0016\u0010%\u001a\u00020\u000f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0!H\u0016J\u0018\u0010'\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001cH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lid/dana/data/social/repository/source/persistence/PersistenceRelationshipEntityData;", "Lid/dana/data/base/BasePersistence;", "Lid/dana/data/social/repository/source/LocalRelationshipEntityData;", "persistenceDao", "Ldagger/Lazy;", "Lid/dana/data/base/BasePersistenceDao;", "(Ldagger/Lazy;)V", "blockedFollowerData", "Lio/reactivex/subjects/BehaviorSubject;", "Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;", "followerData", "followingData", "Lid/dana/data/social/repository/source/persistence/entity/FollowingEntity;", "mutedFollowingData", "clearAll", "", "getBlockedFollowerPublishSubject", "getFollowerItemList", "Lio/reactivex/Observable;", "pageNum", "", "getFollowerPublishSubject", "getFollowingItemList", "getFollowingPublishSubject", "getMutedFollowingPublishSubject", "getSelectedFollowerItem", "Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;", "userId", "", "getSelectedFollowingItem", "Lid/dana/data/social/repository/source/persistence/entity/FollowingItemEntity;", "saveFollowerItemList", "followerItemEntityList", "", "saveFollowerModifiedRelationship", "targetUserId", "operationType", "saveFollowingItemList", "followingItemEntityList", "saveFollowingModifiedRelationship", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getSuccessScopes extends reverseAnimationSpeed {
    private removeString<setErrorScopes> blockedFollowerData;
    private removeString<setErrorScopes> followerData;
    private removeString<setAuthExecuteResult> followingData;
    private removeString<setAuthExecuteResult> mutedFollowingData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/persistence/entity/FollowingEntity;", "kotlin.jvm.PlatformType", "followingItemEntities", "", "Lid/dana/data/social/repository/source/persistence/entity/FollowingItemEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<List<? extends setShowType>, setAuthExecuteResult> {
        public static final getMin getMax = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "followingItemEntities");
            return DomainConfigProxy.toFollowingEntity(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;", "kotlin.jvm.PlatformType", "followerItemEntities", "", "Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<List<? extends AuthSkipResultModel>, setErrorScopes> {
        public static final length setMax = new length();

        length() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "followerItemEntities");
            return checkJSApi.toFollowerEntity(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/social/repository/source/persistence/entity/FollowingItemEntity;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<List<? extends setShowType>, TitleBarRightButtonView.AnonymousClass4<? extends setShowType>> {
        public static final setMax length = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r2;
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            if (list.isEmpty()) {
                r2 = TitleBarRightButtonView.AnonymousClass1.error((Throwable) new RelationshipDataNotFoundException());
            } else {
                r2 = TitleBarRightButtonView.AnonymousClass1.just(CollectionsKt.first(list));
            }
            return r2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<List<? extends AuthSkipResultModel>, TitleBarRightButtonView.AnonymousClass4<? extends AuthSkipResultModel>> {
        public static final setMin getMin = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r2;
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            if (list.isEmpty()) {
                r2 = TitleBarRightButtonView.AnonymousClass1.error((Throwable) new RelationshipDataNotFoundException());
            } else {
                r2 = TitleBarRightButtonView.AnonymousClass1.just(CollectionsKt.first(list));
            }
            return r2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getSuccessScopes(@NotNull Lazy<BasePersistenceDao> lazy) {
        super(lazy);
        Intrinsics.checkNotNullParameter(lazy, "persistenceDao");
        removeString<setErrorScopes> max = removeString.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "BehaviorSubject.create()");
        this.followerData = max;
        removeString<setAuthExecuteResult> max2 = removeString.getMax();
        Intrinsics.checkNotNullExpressionValue(max2, "BehaviorSubject.create()");
        this.followingData = max2;
        removeString<setErrorScopes> max3 = removeString.getMax();
        Intrinsics.checkNotNullExpressionValue(max3, "BehaviorSubject.create()");
        this.blockedFollowerData = max3;
        removeString<setAuthExecuteResult> max4 = removeString.getMax();
        Intrinsics.checkNotNullExpressionValue(max4, "BehaviorSubject.create()");
        this.mutedFollowingData = max4;
        this.followingData.onNext(new setAuthExecuteResult((List) null, (setAuthContentResult) null, 3, (DefaultConstructorMarker) null));
        this.followerData.onNext(new setErrorScopes((List) null, (setAuthContentResult) null, 3, (DefaultConstructorMarker) null));
    }

    @NotNull
    public final removeString<setErrorScopes> getBlockedFollowerPublishSubject() {
        return this.blockedFollowerData;
    }

    @NotNull
    public final removeString<setAuthExecuteResult> getMutedFollowingPublishSubject() {
        return this.mutedFollowingData;
    }

    @NotNull
    public final removeString<setErrorScopes> getFollowerPublishSubject() {
        return this.followerData;
    }

    @NotNull
    public final removeString<setAuthExecuteResult> getFollowingPublishSubject() {
        return this.followingData;
    }

    public final void saveFollowingItemList(@NotNull List<setShowType> list) {
        Intrinsics.checkNotNullParameter(list, "followingItemEntityList");
        getDb().followingDao().insertFollowingItemList(list);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setAuthExecuteResult> getFollowingItemList(int i) {
        TitleBarRightButtonView.AnonymousClass1<R> map = TitleBarRightButtonView.AnonymousClass1.just(getDb().followingDao().getFollowingItemEntityList()).map(getMin.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "Observable.just<List<Fol…llowingEntity()\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setErrorScopes> getFollowerItemList(int i) {
        TitleBarRightButtonView.AnonymousClass1<R> map = TitleBarRightButtonView.AnonymousClass1.just(getDb().followerDao().getFollowerItemEntityList()).map(length.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "Observable.just<List<Fol…ollowerEntity()\n        }");
        return map;
    }

    public final void saveFollowerItemList(@NotNull List<AuthSkipResultModel> list) {
        Intrinsics.checkNotNullParameter(list, "followerItemEntityList");
        getDb().followerDao().insertFollowerItemList(list);
    }

    public final void saveFollowerModifiedRelationship(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "targetUserId");
        Intrinsics.checkNotNullParameter(str2, "operationType");
        getDb().followerDao().updateModifiedRelation(str, str2);
    }

    public final void saveFollowingModifiedRelationship(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "targetUserId");
        Intrinsics.checkNotNullParameter(str2, "operationType");
        getDb().followingDao().updateModifiedRelation(str, str2);
    }

    public final void clearAll() {
        this.followerData.onNext(new setErrorScopes((List) null, (setAuthContentResult) null, 3, (DefaultConstructorMarker) null));
        this.blockedFollowerData.onNext(new setErrorScopes((List) null, (setAuthContentResult) null, 3, (DefaultConstructorMarker) null));
        this.followingData.onNext(new setAuthExecuteResult((List) null, (setAuthContentResult) null, 3, (DefaultConstructorMarker) null));
        this.mutedFollowingData.onNext(new setAuthExecuteResult((List) null, (setAuthContentResult) null, 3, (DefaultConstructorMarker) null));
        getDb().followerDao().clearFollower();
        getDb().followingDao().clearFollowing();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setShowType> getSelectedFollowingItem(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userId");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getDb().followingDao().getSelectedFollowing(str).flatMap(setMax.length);
        Intrinsics.checkNotNullExpressionValue(flatMap, "db.followingDao().getSel…)\n            }\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AuthSkipResultModel> getSelectedFollowerItem(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userId");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getDb().followerDao().getSelectedFollower(str).flatMap(setMin.getMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "db.followerDao().getSele…)\n            }\n        }");
        return flatMap;
    }
}
