package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverWebviewSetting;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/domain/bokuverification/CheckMobileDataPermissionAccepted;", "Lid/dana/domain/UseCase;", "", "", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "permissionRepository", "Lid/dana/domain/permission/PermissionRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/permission/PermissionRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "phoneNumber", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class APDownloadListener extends parseFailed<Boolean, String> {
    private final GriverWebviewSetting.AnonymousClass1 permissionRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public APDownloadListener(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull GriverWebviewSetting.AnonymousClass1 r4) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(r4, "permissionRepository");
        this.permissionRepository = r4;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        TitleBarRightButtonView.AnonymousClass1<Boolean> checkMobileDataPermissionAccepted = this.permissionRepository.checkMobileDataPermissionAccepted(str);
        Intrinsics.checkNotNullExpressionValue(checkMobileDataPermissionAccepted, "permissionRepository.che…sionAccepted(phoneNumber)");
        return checkMobileDataPermissionAccepted;
    }
}
