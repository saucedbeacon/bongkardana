package o;

import id.dana.data.account.repository.AccountEntityRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J \u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/domain/social/interactor/GetMyActivityReactionInfo;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/social/model/MyActivityReactionInfo;", "Lid/dana/domain/core/usecase/NoParams;", "userRepository", "Lid/dana/domain/user/repository/UserRepository;", "accountRepository", "Lid/dana/domain/account/AccountRepository;", "(Lid/dana/domain/user/repository/UserRepository;Lid/dana/domain/account/AccountRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "combineMyActivityReactionInfo", "userInfoResponse", "Lid/dana/domain/user/UserInfoResponse;", "avatarUrl", "", "userId", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getLastDetectionTime extends APWebChromeClient<setRangedRegionState, onReceivedIcon> {
    private final getCommonResources accountRepository;
    private final onDescriptorWrite userRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/MyActivityReactionInfo;", "userInfoResponse", "Lid/dana/domain/user/UserInfoResponse;", "avatarUrl", "", "userId", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T1, T2, T3, R> implements setShow<disconnect, String, String, setRangedRegionState> {
        final /* synthetic */ getLastDetectionTime setMin;

        setMax(getLastDetectionTime getlastdetectiontime) {
            this.setMin = getlastdetectiontime;
        }

        public final /* synthetic */ Object getMin(Object obj, Object obj2, Object obj3) {
            disconnect disconnect = (disconnect) obj;
            String str = (String) obj2;
            String str2 = (String) obj3;
            Intrinsics.checkNotNullParameter(disconnect, "userInfoResponse");
            Intrinsics.checkNotNullParameter(str, AccountEntityRepository.UpdateType.AVATAR);
            Intrinsics.checkNotNullParameter(str2, "userId");
            return this.setMin.combineMyActivityReactionInfo(disconnect, str, str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getLastDetectionTime(@NotNull onDescriptorWrite ondescriptorwrite, @NotNull getCommonResources getcommonresources) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(ondescriptorwrite, "userRepository");
        Intrinsics.checkNotNullParameter(getcommonresources, "accountRepository");
        this.userRepository = ondescriptorwrite;
        this.accountRepository = getcommonresources;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setRangedRegionState> buildUseCase(@NotNull onReceivedIcon onreceivedicon) {
        Intrinsics.checkNotNullParameter(onreceivedicon, "params");
        TitleBarRightButtonView.AnonymousClass1<setRangedRegionState> zip = TitleBarRightButtonView.AnonymousClass1.zip(this.userRepository.getUserInfo(), this.accountRepository.getAvatarUrl(), this.accountRepository.getUserId(), new setMax(this));
        Intrinsics.checkNotNullExpressionValue(zip, "Observable.zip(userRepos…l, userId)\n            })");
        return zip;
    }

    /* access modifiers changed from: private */
    public final setRangedRegionState combineMyActivityReactionInfo(disconnect disconnect, String str, String str2) {
        return new setRangedRegionState(disconnect.getNickname(), str, str2);
    }
}
