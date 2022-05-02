package o;

import id.dana.data.account.repository.AccountEntityRepository;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B3\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0014J*\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lid/dana/domain/social/interactor/GetMyFeedsHeaderInfo;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/social/model/MyFeedsHeaderInfo;", "Ljava/lang/Void;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "userRepository", "Lid/dana/domain/user/repository/UserRepository;", "accountRepository", "Lid/dana/domain/account/AccountRepository;", "socialPrivacyRepository", "Lid/dana/domain/social/SocialPrivacyRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/user/repository/UserRepository;Lid/dana/domain/account/AccountRepository;Lid/dana/domain/social/SocialPrivacyRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "combineMyFeedHeaderInfo", "account", "Lid/dana/domain/account/Account;", "userInfoResponse", "Lid/dana/domain/user/UserInfoResponse;", "avatarUrl", "", "shareFeed", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class fromBundle extends parseFailed<setMonitoringStatus, Void> {
    private final getCommonResources accountRepository;
    /* access modifiers changed from: private */
    public final getResponseString socialPrivacyRepository;
    private final onDescriptorWrite userRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/MyFeedsHeaderInfo;", "account", "Lid/dana/domain/account/Account;", "userInfoResponse", "Lid/dana/domain/user/UserInfoResponse;", "avatarUrl", "", "shareFeed", "", "apply", "(Lid/dana/domain/account/Account;Lid/dana/domain/user/UserInfoResponse;Ljava/lang/String;Ljava/lang/Boolean;)Lid/dana/domain/social/model/MyFeedsHeaderInfo;"}, k = 3, mv = {1, 4, 2})
    static final class length<T1, T2, T3, T4, R> implements RedDotModel<GriverCommonResourceProxy, disconnect, String, Boolean, setMonitoringStatus> {
        final /* synthetic */ fromBundle getMax;

        length(fromBundle frombundle) {
            this.getMax = frombundle;
        }

        public final /* synthetic */ Object setMin(Object obj, Object obj2, Object obj3, Object obj4) {
            GriverCommonResourceProxy griverCommonResourceProxy = (GriverCommonResourceProxy) obj;
            disconnect disconnect = (disconnect) obj2;
            String str = (String) obj3;
            Boolean bool = (Boolean) obj4;
            Intrinsics.checkNotNullParameter(griverCommonResourceProxy, "account");
            Intrinsics.checkNotNullParameter(disconnect, "userInfoResponse");
            Intrinsics.checkNotNullParameter(str, AccountEntityRepository.UpdateType.AVATAR);
            Intrinsics.checkNotNullParameter(bool, "shareFeed");
            return this.getMax.combineMyFeedHeaderInfo(griverCommonResourceProxy, disconnect, str, bool.booleanValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public fromBundle(@Nullable appxLoadFailed appxloadfailed, @Nullable getScheme getscheme, @NotNull onDescriptorWrite ondescriptorwrite, @NotNull getCommonResources getcommonresources, @NotNull getResponseString getresponsestring) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(ondescriptorwrite, "userRepository");
        Intrinsics.checkNotNullParameter(getcommonresources, "accountRepository");
        Intrinsics.checkNotNullParameter(getresponsestring, "socialPrivacyRepository");
        this.userRepository = ondescriptorwrite;
        this.accountRepository = getcommonresources;
        this.socialPrivacyRepository = getresponsestring;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setMonitoringStatus> buildUseCaseObservable(@Nullable Void voidR) {
        TitleBarRightButtonView.AnonymousClass1<setMonitoringStatus> zip = TitleBarRightButtonView.AnonymousClass1.zip(this.accountRepository.getAccount(), this.userRepository.getUserInfo(), this.accountRepository.getAvatarUrl(), TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMin(this)), new length(this));
        Intrinsics.checkNotNullExpressionValue(zip, "Observable.zip(accountRe…shareFeed)\n            })");
        return zip;
    }

    /* access modifiers changed from: private */
    public final setMonitoringStatus combineMyFeedHeaderInfo(GriverCommonResourceProxy griverCommonResourceProxy, disconnect disconnect, String str, boolean z) {
        String userId = griverCommonResourceProxy.getUserId();
        Intrinsics.checkNotNullExpressionValue(userId, "account.userId");
        return new setMonitoringStatus(userId, disconnect.getNickname(), disconnect.getKycInfo(), str, z, disconnect.getUsername());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "call", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class getMin<V> implements Callable<Boolean> {
        final /* synthetic */ fromBundle getMin;

        getMin(fromBundle frombundle) {
            this.getMin = frombundle;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.getMin.socialPrivacyRepository.getShareFeedConsent());
        }
    }
}
