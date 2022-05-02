package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.ModelSpecificDistanceUpdater;
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lid/dana/domain/social/interactor/StartFollowerFullSync;", "Lid/dana/domain/social/core/CompletableUseCase;", "", "socialGeneralRepository", "Lid/dana/domain/social/SocialGeneralRepository;", "(Lid/dana/domain/social/SocialGeneralRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkIfUserHaveReachedLastPageOnce", "", "checkWhichFriendshipCallShouldLoop", "doInitialFriendshipCall", "doModifiedTimeFriendshipCall", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getTrackingAge extends ModelSpecificDistanceUpdater.CompletionHandler<Unit> {
    private final getResponseCode socialGeneralRepository;

    @Inject
    public getTrackingAge(@NotNull getResponseCode getresponsecode) {
        Intrinsics.checkNotNullParameter(getresponsecode, "socialGeneralRepository");
        this.socialGeneralRepository = getresponsecode;
    }

    @Nullable
    public final Object buildUseCase(@NotNull Unit unit, @NotNull Continuation<? super forThisDevice<Unit>> continuation) {
        checkWhichFriendshipCallShouldLoop();
        return new forThisDevice.setMax(Unit.INSTANCE);
    }

    private final void doInitialFriendshipCall() {
        getResponseCode getresponsecode = this.socialGeneralRepository;
        boolean followerFullSyncFinished = getresponsecode.getFollowerFullSyncFinished();
        int followerFullSyncLastPage = getresponsecode.getFollowerFullSyncLastPage();
        while (!followerFullSyncFinished) {
            followerFullSyncLastPage++;
            followerFullSyncFinished = getresponsecode.getNextFollowerFullSync(followerFullSyncLastPage).getPaginator().checkIfLastPage();
        }
        getresponsecode.saveFollowerFullSyncFinished();
    }

    private final void doModifiedTimeFriendshipCall() {
        getResponseCode getresponsecode = this.socialGeneralRepository;
        int followerPartialSyncLastPage = getresponsecode.getFollowerPartialSyncLastPage();
        boolean z = false;
        while (!z) {
            followerPartialSyncLastPage++;
            z = getresponsecode.getNextFollowerPartialSync(followerPartialSyncLastPage).getPaginator().checkIfLastPage();
        }
        getresponsecode.saveFollowerPartialSyncModifiedTime();
    }

    private final void checkWhichFriendshipCallShouldLoop() {
        if (checkIfUserHaveReachedLastPageOnce()) {
            doModifiedTimeFriendshipCall();
        } else {
            doInitialFriendshipCall();
        }
    }

    private final boolean checkIfUserHaveReachedLastPageOnce() {
        getResponseCode getresponsecode = this.socialGeneralRepository;
        return getresponsecode.getFollowerFullSyncFinished() && getresponsecode.getFollowerPartialSyncModifiedTime() > 0;
    }
}
