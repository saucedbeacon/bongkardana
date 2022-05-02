package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u001e\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00020\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0003H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/domain/social/interactor/GetFriendProfile;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/social/model/RelationshipItem;", "", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "socialGeneralRepository", "Lid/dana/domain/social/SocialGeneralRepository;", "accountRepository", "Lid/dana/domain/account/AccountRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/social/SocialGeneralRepository;Lid/dana/domain/account/AccountRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "userId", "createRelationshipItemObservable", "kotlin.jvm.PlatformType", "it", "Lid/dana/domain/account/Account;", "isUserIdIsCurrentUser", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getmMessenger extends parseFailed<processScanResult, String> {
    private final getCommonResources accountRepository;
    private final getResponseCode socialGeneralRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/RelationshipItem;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<processScanResult, processScanResult> {
        public static final getMax length = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            processScanResult processscanresult = (processScanResult) obj;
            Intrinsics.checkNotNullParameter(processscanresult, "it");
            processscanresult.setNonReciprocal(true);
            return processscanresult;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/social/model/RelationshipItem;", "kotlin.jvm.PlatformType", "it", "Lid/dana/domain/account/Account;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<GriverCommonResourceProxy, TitleBarRightButtonView.AnonymousClass4<? extends processScanResult>> {
        final /* synthetic */ getmMessenger setMax;

        getMin(getmMessenger getmmessenger) {
            this.setMax = getmmessenger;
        }

        public final /* synthetic */ Object apply(Object obj) {
            GriverCommonResourceProxy griverCommonResourceProxy = (GriverCommonResourceProxy) obj;
            Intrinsics.checkNotNullParameter(griverCommonResourceProxy, "it");
            return this.setMax.createRelationshipItemObservable(griverCommonResourceProxy);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getmMessenger(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull getResponseCode getresponsecode, @NotNull getCommonResources getcommonresources) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(getresponsecode, "socialGeneralRepository");
        Intrinsics.checkNotNullParameter(getcommonresources, "accountRepository");
        this.socialGeneralRepository = getresponsecode;
        this.accountRepository = getcommonresources;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<processScanResult> buildUseCaseObservable(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userId");
        if (isUserIdIsCurrentUser(str)) {
            TitleBarRightButtonView.AnonymousClass1<R> switchMap = this.accountRepository.getAccount().switchMap(new getMin(this));
            Intrinsics.checkNotNullExpressionValue(switchMap, "accountRepository.accoun…ervable(it)\n            }");
            return switchMap;
        }
        TitleBarRightButtonView.AnonymousClass1<processScanResult> onErrorResumeNext = this.socialGeneralRepository.getSelectedFollowingItem(str, false).take(1).onErrorResumeNext(this.socialGeneralRepository.getSelectedFollowerItem(str, false).take(1).map(getMax.length));
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "socialGeneralRepository.…          }\n            )");
        return onErrorResumeNext;
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<processScanResult> createRelationshipItemObservable(GriverCommonResourceProxy griverCommonResourceProxy) {
        String nickname = griverCommonResourceProxy.getNickname();
        Intrinsics.checkNotNullExpressionValue(nickname, "it.nickname");
        String userId = griverCommonResourceProxy.getUserId();
        Intrinsics.checkNotNullExpressionValue(userId, "it.userId");
        String avatarUrl = griverCommonResourceProxy.getAvatarUrl();
        String username = griverCommonResourceProxy.getUsername();
        Intrinsics.checkNotNullExpressionValue(username, "it.username");
        TitleBarRightButtonView.AnonymousClass1<processScanResult> just = TitleBarRightButtonView.AnonymousClass1.just(new processScanResult((String) null, nickname, "SELF", userId, avatarUrl, username, false, 65, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(Relation…name = it.username\n    ))");
        return just;
    }

    private final boolean isUserIdIsCurrentUser(String str) {
        return Intrinsics.areEqual((Object) str, (Object) this.accountRepository.getUserId().blockingFirst());
    }
}
