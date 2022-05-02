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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lid/dana/domain/social/interactor/StartFollowingFullSync;", "Lid/dana/domain/social/core/CompletableUseCase;", "", "socialGeneralRepository", "Lid/dana/domain/social/SocialGeneralRepository;", "(Lid/dana/domain/social/SocialGeneralRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkIfUserHaveReachedLastPageOnce", "", "checkWhichFriendshipCallShouldLoop", "doInitialFriendshipCall", "doModifiedTimeFriendshipCall", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class markOutside extends ModelSpecificDistanceUpdater.CompletionHandler<Unit> {
    private final getResponseCode socialGeneralRepository;

    @Inject
    public markOutside(@NotNull getResponseCode getresponsecode) {
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
        boolean followingFullSyncFinished = getresponsecode.getFollowingFullSyncFinished();
        int followingFullSyncLastPage = getresponsecode.getFollowingFullSyncLastPage();
        while (!followingFullSyncFinished) {
            followingFullSyncLastPage++;
            followingFullSyncFinished = getresponsecode.getNextFollowingFullSync(followingFullSyncLastPage).getPaginator().checkIfLastPage();
        }
        getresponsecode.saveFollowingFullSyncFinished();
    }

    private final void doModifiedTimeFriendshipCall() {
        getResponseCode getresponsecode = this.socialGeneralRepository;
        int followingPartialSyncLastPage = getresponsecode.getFollowingPartialSyncLastPage();
        boolean z = false;
        while (!z) {
            followingPartialSyncLastPage++;
            z = getresponsecode.getNextFollowingPartialSync(followingPartialSyncLastPage).getPaginator().checkIfLastPage();
        }
        getresponsecode.saveFollowingPartialSyncModifiedTime();
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
        return getresponsecode.getFollowingFullSyncFinished() && getresponsecode.getFollowingPartialSyncModifiedTime() > 0;
    }
}
