package o;

import id.dana.domain.nearbyme.IoDispatcher;
import id.dana.domain.nearbyme.MainDispatcher;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import o.TitleBarRightButtonView;
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0004H\u0002R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lid/dana/domain/social/ObserveInitFeed;", "Lid/dana/domain/social/core/SingleUseCase;", "", "Lio/reactivex/Observable;", "Lid/dana/domain/social/model/InitFeed;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "socialSyncRepository", "Lid/dana/domain/social/SocialSyncRepository;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/social/SocialSyncRepository;)V", "isObserved", "", "()Z", "setObserved", "(Z)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastInitFeedStatus", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getModel extends buildModelMapWithLock<Unit, TitleBarRightButtonView.AnonymousClass1<setBeaconParsers>> {
    private boolean isObserved;
    private final getScheme postExecutionThread;
    private final getRequestedModel socialSyncRepository;
    private final appxLoadFailed threadExecutor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getModel(@NotNull @IoDispatcher APExpansion.AnonymousClass1 r2, @NotNull @MainDispatcher APExpansion.AnonymousClass1 r3, @NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull getRequestedModel getrequestedmodel) {
        super(r2, r3);
        Intrinsics.checkNotNullParameter(r2, "ioDispatcher");
        Intrinsics.checkNotNullParameter(r3, "mainDispatcher");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(getrequestedmodel, "socialSyncRepository");
        this.threadExecutor = appxloadfailed;
        this.postExecutionThread = getscheme;
        this.socialSyncRepository = getrequestedmodel;
    }

    public final boolean isObserved() {
        return this.isObserved;
    }

    public final void setObserved(boolean z) {
        this.isObserved = z;
    }

    @Nullable
    public final Object buildUseCase(@NotNull Unit unit, @NotNull Continuation<? super forThisDevice<? extends TitleBarRightButtonView.AnonymousClass1<setBeaconParsers>>> continuation) {
        this.isObserved = true;
        removeString<setBeaconParsers> initFeedObservable = this.socialSyncRepository.getInitFeedObservable();
        initFeedObservable.onNext(getLastInitFeedStatus());
        return new forThisDevice.setMax(initFeedObservable.distinctUntilChanged().subscribeOn(getSecureSignatureComp.setMin(this.threadExecutor)).observeOn(this.postExecutionThread.getScheduler()));
    }

    private final setBeaconParsers getLastInitFeedStatus() {
        return this.socialSyncRepository.getSocialFeedInitStatus().blockingSingle().toInitFeed();
    }
}
